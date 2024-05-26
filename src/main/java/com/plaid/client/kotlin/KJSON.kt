package com.plaid.client.kotlin

import com.google.gson.Gson
import com.google.gson.JsonParseException
import com.google.gson.TypeAdapter
import com.google.gson.internal.bind.util.ISO8601Utils
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import io.gsonfire.GsonFireBuilder
import java.text.DateFormat
import java.text.ParseException
import java.text.ParsePosition
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.sql.Date as SqlDate

class KJSON {
    private val sqlDateTypeAdapter = SqlDateTypeAdapter()
    private val dateTypeAdapter = DateTypeAdapter()
    private val offsetDateTimeTypeAdapter = OffsetDateTimeTypeAdapter()
    private val localDateTypeAdapter = LocalDateTypeAdapter()

    val gson: Gson = GsonFireBuilder()
        .createGsonBuilder()
        .registerTypeAdapter(OffsetDateTime::class.java, offsetDateTimeTypeAdapter)
        .registerTypeAdapter(LocalDate::class.java, localDateTypeAdapter)
        .registerTypeAdapter(SqlDate::class.java, sqlDateTypeAdapter)
        .registerTypeAdapter(Date::class.java, dateTypeAdapter)
        .create()

    fun setSqlDateFormatter(formatter: DateFormat) {
        sqlDateTypeAdapter.formatter = formatter
    }

    fun setDateFormatter(formatter: DateFormat) {
        dateTypeAdapter.formatter = formatter
    }

    fun setOffsetDateTimeFormatter(formatter: DateTimeFormatter) {
        offsetDateTimeTypeAdapter.formatter = formatter
    }

    fun setLocalDateFormatter(formatter: DateTimeFormatter) {
        localDateTypeAdapter.formatter = formatter
    }

    class OffsetDateTimeTypeAdapter(dateTimeFormatter: DateTimeFormatter? = DateTimeFormatter.ISO_OFFSET_DATE_TIME) :
        DateAdapter<OffsetDateTime, DateTimeFormatter>(dateTimeFormatter) {
        override fun format(formatter: DateTimeFormatter?, date: OffsetDateTime): String {
            return formatter?.format(date) ?: date.toString()
        }

        override fun parse(formatter: DateTimeFormatter?, dateString: String): OffsetDateTime? {
            return formatter?.let { OffsetDateTime.parse(dateString, it) }
        }

        override fun defaultParse(dateString: String): OffsetDateTime {
            return OffsetDateTime.parse(dateString, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        }
    }

    class LocalDateTypeAdapter(dateTimeFormatter: DateTimeFormatter? = DateTimeFormatter.ISO_LOCAL_DATE) :
        DateAdapter<LocalDate, DateTimeFormatter>(dateTimeFormatter) {
        override fun format(formatter: DateTimeFormatter?, date: LocalDate): String {
            return formatter?.format(date) ?: date.toString()
        }

        override fun parse(formatter: DateTimeFormatter?, dateString: String): LocalDate? {
            return formatter?.let { LocalDate.parse(dateString, it) }
        }

        override fun defaultParse(dateString: String): LocalDate {
            return LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE)
        }
    }

    class SqlDateTypeAdapter(dateFormat: DateFormat? = null) : DateAdapter<SqlDate, DateFormat>(dateFormat) {
        override fun format(formatter: DateFormat?, date: SqlDate): String {
            return formatter?.format(date) ?: date.toString()
        }

        override fun parse(formatter: DateFormat?, dateString: String): SqlDate? {
            return formatter?.parse(dateString)?.time?.let(::SqlDate)
        }

        override fun defaultParse(dateString: String): SqlDate {
            return ISO8601Utils.parse(dateString, ParsePosition(0)).time.let(::SqlDate)
        }
    }

    class DateTypeAdapter(dateFormat: DateFormat? = null) : DateAdapter<Date, DateFormat>(dateFormat) {
        override fun format(formatter: DateFormat?, date: Date): String {
            return formatter?.format(date) ?: ISO8601Utils.format(date, true)
        }

        override fun parse(formatter: DateFormat?, dateString: String): Date? {
            return formatter?.parse(dateString)
        }

        override fun defaultParse(dateString: String): Date {
            return ISO8601Utils.parse(dateString, ParsePosition(0))
        }
    }

    abstract class DateAdapter<D, F>(
        var formatter: F? = null,
    ) : TypeAdapter<D>() {
        abstract fun format(formatter: F?, date: D): String
        abstract fun parse(formatter: F?, dateString: String): D?
        abstract fun defaultParse(dateString: String): D

        override fun write(jsonWriter: JsonWriter, date: D?) {
            if (date == null) {
                jsonWriter.nullValue()
                return
            }

            jsonWriter.value(format(formatter, date))
        }

        override fun read(jsonReader: JsonReader): D? {
            try {
                if (Objects.requireNonNull(jsonReader.peek()) == JsonToken.NULL) {
                    jsonReader.nextNull()
                    return null
                }
                val date: String = jsonReader.nextString()

                return parse(formatter, date) ?: defaultParse(date)
            } catch (e: IllegalArgumentException) {
                throw JsonParseException(e)
            } catch (e: ParseException) {
                throw JsonParseException(e)
            }
        }
    }
}
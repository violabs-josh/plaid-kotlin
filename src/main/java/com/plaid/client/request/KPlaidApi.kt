package com.plaid.client.request

import com.plaid.client.model.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface KPlaidApi {
    /**
     * Retrieve real-time balance data
     * The &#x60;/accounts/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints, such as &#x60;/accounts/get&#x60;, return a balance object, only &#x60;/accounts/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. This endpoint can be used for existing Items that were added via any of Plaid’s other products. This endpoint can be used as long as Link has been initialized with any other product, &#x60;balance&#x60; itself is not a product that can be used to initialize Link. As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.
     * @param accountsBalanceGetRequest  (required)
     * @return Call&lt;AccountsGetResponse&gt;
     *
     * @see [Retrieve real-time balance data Documentation](/api/products/balance/.accountsbalanceget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("accounts/balance/get")
    fun accountsBalanceGet(
        @Body accountsBalanceGetRequest: AccountsBalanceGetRequest?
    ): Call<AccountsGetResponse?>?

    /**
     * Retrieve accounts
     * The &#x60;/accounts/get&#x60; endpoint can be used to retrieve a list of accounts associated with any linked Item. Plaid will only return active bank accounts — that is, accounts that are not closed and are capable of carrying a balance. For items that went through the updated account selection pane, this endpoint only returns accounts that were permissioned by the user when they initially created the Item. If a user creates a new account after the initial link, you can capture this event through the [&#x60;NEW_ACCOUNTS_AVAILABLE&#x60;](https://plaid.com/docs/api/items/#new_accounts_available) webhook and then use Link&#39;s [update mode](https://plaid.com/docs/link/update-mode/) to request that the user share this new account with you.  &#x60;/accounts/get&#x60; is free to use and retrieves cached information, rather than extracting fresh information from the institution. The balance returned will reflect the balance at the time of the last successful Item update. If the Item is enabled for a regularly updating product, such as Transactions, Investments, or Liabilities, the balance will typically update about once a day, as long as the Item is healthy. If the Item is enabled only for products that do not frequently update, such as Auth or Identity, balance data may be much older.  For realtime balance information, use the paid endpoint &#x60;/accounts/balance/get&#x60; instead.
     * @param accountsGetRequest  (required)
     * @return Call&lt;AccountsGetResponse&gt;
     *
     * @see [Retrieve accounts Documentation](/api/accounts/.accountsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("accounts/get")
    fun accountsGet(
        @Body accountsGetRequest: AccountsGetRequest?
    ): Call<AccountsGetResponse?>?

    /**
     * Retrieve information about a Plaid application
     * Allows financial institutions to retrieve information about Plaid clients for the purpose of building control-tower experiences
     * @param applicationGetRequest  (required)
     * @return Call&lt;ApplicationGetResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("application/get")
    fun applicationGet(
        @Body applicationGetRequest: ApplicationGetRequest?
    ): Call<ApplicationGetResponse?>?

    /**
     * Create Asset Report Audit Copy
     * Plaid can provide an Audit Copy of any Asset Report directly to a participating third party on your behalf. For example, Plaid can supply an Audit Copy directly to Fannie Mae on your behalf if you participate in the Day 1 Certainty™ program. An Audit Copy contains the same underlying data as the Asset Report.  To grant access to an Audit Copy, use the &#x60;/asset_report/audit_copy/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the third party who needs access. Each third party has its own &#x60;auditor_id&#x60;, for example &#x60;fannie_mae&#x60;. You’ll need to create a separate Audit Copy for each third party to whom you want to grant access to the Report.
     * @param assetReportAuditCopyCreateRequest  (required)
     * @return Call&lt;AssetReportAuditCopyCreateResponse&gt;
     *
     * @see [Create Asset Report Audit Copy Documentation](/api/products/assets/.asset_reportaudit_copycreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/audit_copy/create")
    fun assetReportAuditCopyCreate(
        @Body assetReportAuditCopyCreateRequest: AssetReportAuditCopyCreateRequest?
    ): Call<AssetReportAuditCopyCreateResponse?>?

    /**
     * Retrieve an Asset Report Audit Copy
     * &#x60;/asset_report/audit_copy/get&#x60; allows auditors to get a copy of an Asset Report that was previously shared via the &#x60;/asset_report/audit_copy/create&#x60; endpoint.  The caller of &#x60;/asset_report/audit_copy/create&#x60; must provide the &#x60;audit_copy_token&#x60; to the auditor.  This token can then be used to call &#x60;/asset_report/audit_copy/create&#x60;.
     * @param assetReportAuditCopyGetRequest  (required)
     * @return Call&lt;AssetReportGetResponse&gt;
     *
     * @see [Retrieve an Asset Report Audit Copy Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/audit_copy/get")
    fun assetReportAuditCopyGet(
        @Body assetReportAuditCopyGetRequest: AssetReportAuditCopyGetRequest?
    ): Call<AssetReportGetResponse?>?

    /**
     * Remove Asset Report Audit Copy
     * The &#x60;/asset_report/audit_copy/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Asset Report, the Asset Report itself and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.
     * @param assetReportAuditCopyRemoveRequest  (required)
     * @return Call&lt;AssetReportAuditCopyRemoveResponse&gt;
     *
     * @see [Remove Asset Report Audit Copy Documentation](/api/products/assets/.asset_reportaudit_copyremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/audit_copy/remove")
    fun assetReportAuditCopyRemove(
        @Body assetReportAuditCopyRemoveRequest: AssetReportAuditCopyRemoveRequest?
    ): Call<AssetReportAuditCopyRemoveResponse?>?

    /**
     * Create an Asset Report
     * The &#x60;/asset_report/create&#x60; endpoint initiates the process of creating an Asset Report, which can then be retrieved by passing the &#x60;asset_report_token&#x60; return value to the &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; endpoints.  The Asset Report takes some time to be created and is not available immediately after calling &#x60;/asset_report/create&#x60;. The exact amount of time to create the report will vary depending on how many days of history are requested and will typically range from a few seconds to about one minute. When the Asset Report is ready to be retrieved using &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60;, Plaid will fire a &#x60;PRODUCT_READY&#x60; webhook. For full details of the webhook schema, see [Asset Report webhooks](https://plaid.com/docs/api/products/assets/#webhooks).  The &#x60;/asset_report/create&#x60; endpoint creates an Asset Report at a moment in time. Asset Reports are immutable. To get an updated Asset Report, use the &#x60;/asset_report/refresh&#x60; endpoint.
     * @param assetReportCreateRequest  (required)
     * @return Call&lt;AssetReportCreateResponse&gt;
     *
     * @see [Create an Asset Report Documentation](/api/products/assets/.asset_reportcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/create")
    fun assetReportCreate(
        @Body assetReportCreateRequest: AssetReportCreateRequest?
    ): Call<AssetReportCreateResponse?>?

    /**
     * Filter Asset Report
     * By default, an Asset Report will contain all of the accounts on a given Item. In some cases, you may not want the Asset Report to contain all accounts. For example, you might have the end user choose which accounts are relevant in Link using the Account Select view, which you can enable in the dashboard. Or, you might always exclude certain account types or subtypes, which you can identify by using the &#x60;/accounts/get&#x60; endpoint. To narrow an Asset Report to only a subset of accounts, use the &#x60;/asset_report/filter&#x60; endpoint.  To exclude certain Accounts from an Asset Report, first use the &#x60;/asset_report/create&#x60; endpoint to create the report, then send the &#x60;asset_report_token&#x60; along with a list of &#x60;account_ids&#x60; to exclude to the &#x60;/asset_report/filter&#x60; endpoint, to create a new Asset Report which contains only a subset of the original Asset Report&#39;s data.  Because Asset Reports are immutable, calling &#x60;/asset_report/filter&#x60; does not alter the original Asset Report in any way; rather, &#x60;/asset_report/filter&#x60; creates a new Asset Report with a new token and id. Asset Reports created via &#x60;/asset_report/filter&#x60; do not contain new Asset data, and are not billed.  Plaid will fire a [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook once generation of the filtered Asset Report has completed.
     * @param assetReportFilterRequest  (required)
     * @return Call&lt;AssetReportFilterResponse&gt;
     *
     * @see [Filter Asset Report Documentation](/api/products/assets/.asset_reportfilter)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/filter")
    fun assetReportFilter(
        @Body assetReportFilterRequest: AssetReportFilterRequest?
    ): Call<AssetReportFilterResponse?>?

    /**
     * Retrieve an Asset Report
     * The &#x60;/asset_report/get&#x60; endpoint retrieves the Asset Report in JSON format. Before calling &#x60;/asset_report/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  By default, an Asset Report includes transaction descriptions as returned by the bank, as opposed to parsed and categorized by Plaid. You can also receive cleaned and categorized transactions, as well as additional insights like merchant name or location information. We call this an Asset Report with Insights. An Asset Report with Insights provides transaction category, location, and merchant information in addition to the transaction strings provided in a standard Asset Report. To retrieve an Asset Report with Insights, call &#x60;/asset_report/get&#x60; endpoint with &#x60;include_insights&#x60; set to &#x60;true&#x60;.  For latency-sensitive applications, you can optionally call &#x60;/asset_report/create&#x60; with &#x60;options.add_ons&#x60; set to &#x60;[\&quot;fast_assets\&quot;]&#x60;. This will cause Plaid to create two versions of the Asset Report: one with only current and available balance and identity information, and then later on the complete Asset Report. You will receive separate webhooks for each version of the Asset Report.
     * @param assetReportGetRequest  (required)
     * @return Call&lt;AssetReportGetResponse&gt;
     *
     * @see [Retrieve an Asset Report Documentation](/api/products/assets/.asset_reportget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/get")
    fun assetReportGet(
        @Body assetReportGetRequest: AssetReportGetRequest?
    ): Call<AssetReportGetResponse?>?

    /**
     * Retrieve a PDF Asset Report
     * The &#x60;/asset_report/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/asset_report/pdf/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/asset_report/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).
     * @param assetReportPDFGetRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     *
     * @see [Retrieve a PDF Asset Report Documentation](/api/products/assets/.asset_reportpdfget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/pdf/get")
    fun assetReportPdfGet(
        @Body assetReportPDFGetRequest: AssetReportPDFGetRequest?
    ): Call<ResponseBody?>?

    /**
     * Refresh an Asset Report
     * An Asset Report is an immutable snapshot of a user&#39;s assets. In order to \&quot;refresh\&quot; an Asset Report you created previously, you can use the &#x60;/asset_report/refresh&#x60; endpoint to create a new Asset Report based on the old one, but with the most recent data available.  The new Asset Report will contain the same Items as the original Report, as well as the same filters applied by any call to &#x60;/asset_report/filter&#x60;. By default, the new Asset Report will also use the same parameters you submitted with your original &#x60;/asset_report/create&#x60; request, but the original &#x60;days_requested&#x60; value and the values of any parameters in the &#x60;options&#x60; object can be overridden with new values. To change these arguments, simply supply new values for them in your request to &#x60;/asset_report/refresh&#x60;. Submit an empty string (\&quot;\&quot;) for any previously-populated fields you would like set as empty.
     * @param assetReportRefreshRequest  (required)
     * @return Call&lt;AssetReportRefreshResponse&gt;
     *
     * @see [Refresh an Asset Report Documentation](/api/products/assets/.asset_reportrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/refresh")
    fun assetReportRefresh(
        @Body assetReportRefreshRequest: AssetReportRefreshRequest?
    ): Call<AssetReportRefreshResponse?>?

    /**
     * Delete an Asset Report
     * The &#x60;/item/remove&#x60; endpoint allows you to invalidate an &#x60;access_token&#x60;, meaning you will not be able to create new Asset Reports with it. Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove them specifically.  The &#x60;/asset_report/remove&#x60; endpoint allows you to remove access to an Asset Report. Removing an Asset Report invalidates its &#x60;asset_report_token&#x60;, meaning you will no longer be able to use it to access Report data or create new Audit Copies. Removing an Asset Report does not affect the underlying Items, but does invalidate any &#x60;audit_copy_tokens&#x60; associated with the Asset Report.
     * @param assetReportRemoveRequest  (required)
     * @return Call&lt;AssetReportRemoveResponse&gt;
     *
     * @see [Delete an Asset Report Documentation](/api/products/assets/.asset_reportremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("asset_report/remove")
    fun assetReportRemove(
        @Body assetReportRemoveRequest: AssetReportRemoveRequest?
    ): Call<AssetReportRemoveResponse?>?

    /**
     * Retrieve auth data
     * The &#x60;/auth/get&#x60; endpoint returns the bank account and bank identification numbers (such as routing numbers, for US accounts) associated with an Item&#39;s checking and savings accounts, along with high-level account data and balances when available.  Note: This request may take some time to complete if &#x60;auth&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.  Versioning note: In API version 2017-03-08, the schema of the &#x60;numbers&#x60; object returned by this endpoint is substantially different. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2018-05-22).
     * @param authGetRequest  (required)
     * @return Call&lt;AuthGetResponse&gt;
     *
     * @see [Retrieve auth data Documentation](/api/products/auth/.authget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("auth/get")
    fun authGet(
        @Body authGetRequest: AuthGetRequest?
    ): Call<AuthGetResponse?>?

    /**
     * Get balance of your Bank Transfer account
     * Use the &#x60;/bank_transfer/balance/get&#x60; endpoint to see the available balance in your bank transfer account. Debit transfers increase this balance once their status is posted. Credit transfers decrease this balance when they are created.  The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.  Note that this endpoint can only be used with FBO accounts, when using Bank Transfers in the Full Service configuration. It cannot be used on your own account when using Bank Transfers in the BTS Platform configuration.
     * @param bankTransferBalanceGetRequest  (required)
     * @return Call&lt;BankTransferBalanceGetResponse&gt;
     *
     * @see [Get balance of your Bank Transfer account Documentation](/bank-transfers/reference.bank_transferbalanceget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/balance/get")
    fun bankTransferBalanceGet(
        @Body bankTransferBalanceGetRequest: BankTransferBalanceGetRequest?
    ): Call<BankTransferBalanceGetResponse?>?

    /**
     * Cancel a bank transfer
     * Use the &#x60;/bank_transfer/cancel&#x60; endpoint to cancel a bank transfer.  A transfer is eligible for cancelation if the &#x60;cancellable&#x60; property returned by &#x60;/bank_transfer/get&#x60; is &#x60;true&#x60;.
     * @param bankTransferCancelRequest  (required)
     * @return Call&lt;BankTransferCancelResponse&gt;
     *
     * @see [Cancel a bank transfer Documentation](/bank-transfers/reference.bank_transfercancel)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/cancel")
    fun bankTransferCancel(
        @Body bankTransferCancelRequest: BankTransferCancelRequest?
    ): Call<BankTransferCancelResponse?>?

    /**
     * Create a bank transfer
     * Use the &#x60;/bank_transfer/create&#x60; endpoint to initiate a new bank transfer.
     * @param bankTransferCreateRequest  (required)
     * @return Call&lt;BankTransferCreateResponse&gt;
     *
     * @see [Create a bank transfer Documentation](/bank-transfers/reference.bank_transfercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/create")
    fun bankTransferCreate(
        @Body bankTransferCreateRequest: BankTransferCreateRequest?
    ): Call<BankTransferCreateResponse?>?

    /**
     * List bank transfer events
     * Use the &#x60;/bank_transfer/event/list&#x60; endpoint to get a list of Plaid-initiated ACH or bank transfer events based on specified filter criteria. When using Auth with micro-deposit verification enabled, this endpoint can be used to fetch status updates on ACH micro-deposits. For more details, see [micro-deposit events](https://plaid.com/docs/auth/coverage/microdeposit-events/).
     * @param bankTransferEventListRequest  (required)
     * @return Call&lt;BankTransferEventListResponse&gt;
     *
     * @see [List bank transfer events Documentation](/api/products/auth.bank_transfereventlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/event/list")
    fun bankTransferEventList(
        @Body bankTransferEventListRequest: BankTransferEventListRequest?
    ): Call<BankTransferEventListResponse?>?

    /**
     * Sync bank transfer events
     * &#x60;/bank_transfer/event/sync&#x60; allows you to request up to the next 25 Plaid-initiated bank transfer events that happened after a specific &#x60;event_id&#x60;. When using Auth with micro-deposit verification enabled, this endpoint can be used to fetch status updates on ACH micro-deposits. For more details, see [micro-deposit events](https://www.plaid.com/docs/auth/coverage/microdeposit-events/).
     * @param bankTransferEventSyncRequest  (required)
     * @return Call&lt;BankTransferEventSyncResponse&gt;
     *
     * @see [Sync bank transfer events Documentation](/api/products/auth/.bank_transfereventsync)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/event/sync")
    fun bankTransferEventSync(
        @Body bankTransferEventSyncRequest: BankTransferEventSyncRequest?
    ): Call<BankTransferEventSyncResponse?>?

    /**
     * Retrieve a bank transfer
     * The &#x60;/bank_transfer/get&#x60; fetches information about the bank transfer corresponding to the given &#x60;bank_transfer_id&#x60;.
     * @param bankTransferGetRequest  (required)
     * @return Call&lt;BankTransferGetResponse&gt;
     *
     * @see [Retrieve a bank transfer Documentation](/bank-transfers/reference.bank_transferget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/get")
    fun bankTransferGet(
        @Body bankTransferGetRequest: BankTransferGetRequest?
    ): Call<BankTransferGetResponse?>?

    /**
     * List bank transfers
     * Use the &#x60;/bank_transfer/list&#x60; endpoint to see a list of all your bank transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired bank transfers.
     * @param bankTransferListRequest  (required)
     * @return Call&lt;BankTransferListResponse&gt;
     *
     * @see [List bank transfers Documentation](/bank-transfers/reference.bank_transferlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/list")
    fun bankTransferList(
        @Body bankTransferListRequest: BankTransferListRequest?
    ): Call<BankTransferListResponse?>?

    /**
     * Migrate account into Bank Transfers
     * As an alternative to adding Items via Link, you can also use the &#x60;/bank_transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items.  Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Bank Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/bank_transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.
     * @param bankTransferMigrateAccountRequest  (required)
     * @return Call&lt;BankTransferMigrateAccountResponse&gt;
     *
     * @see [Migrate account into Bank Transfers Documentation](/bank-transfers/reference.bank_transfermigrate_account)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/migrate_account")
    fun bankTransferMigrateAccount(
        @Body bankTransferMigrateAccountRequest: BankTransferMigrateAccountRequest?
    ): Call<BankTransferMigrateAccountResponse?>?

    /**
     * Retrieve a sweep
     * The &#x60;/bank_transfer/sweep/get&#x60; endpoint fetches information about the sweep corresponding to the given &#x60;sweep_id&#x60;.
     * @param bankTransferSweepGetRequest  (required)
     * @return Call&lt;BankTransferSweepGetResponse&gt;
     *
     * @see [Retrieve a sweep Documentation](/api/products/transfer/.bank_transfersweepget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/sweep/get")
    fun bankTransferSweepGet(
        @Body bankTransferSweepGetRequest: BankTransferSweepGetRequest?
    ): Call<BankTransferSweepGetResponse?>?

    /**
     * List sweeps
     * The &#x60;/bank_transfer/sweep/list&#x60; endpoint fetches information about the sweeps matching the given filters.
     * @param bankTransferSweepListRequest  (required)
     * @return Call&lt;BankTransferSweepListResponse&gt;
     *
     * @see [List sweeps Documentation](/api/products/transfer/.bank_transfersweeplist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("bank_transfer/sweep/list")
    fun bankTransferSweepList(
        @Body bankTransferSweepListRequest: BankTransferSweepListRequest?
    ): Call<BankTransferSweepListResponse?>?

    /**
     * Create a Base Report
     * This endpoint allows the customer to create a Base Report by passing in a user token. The Base Report will be generated based on the most recently linked item from the user token.
     * @param baseReportCreateRequest  (required)
     * @return Call&lt;BaseReportCreateResponse&gt;
     *
     * @see [Create a Base Report Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/base_report/create")
    fun baseReportCreate(
        @Body baseReportCreateRequest: BaseReportCreateRequest?
    ): Call<BaseReportCreateResponse?>?

    /**
     * Retrieve a Base Report
     * This endpoint allows the customer to retrieve a Base Report. Customers should pass in the &#x60;user_token&#x60; created in &#x60;/link/token/create&#x60;.
     * @param baseReportGetRequest  (required)
     * @return Call&lt;BaseReportGetResponse&gt;
     *
     * @see [Retrieve a Base Report Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/base_report/get")
    fun baseReportGet(
        @Body baseReportGetRequest: BaseReportGetRequest?
    ): Call<BaseReportGetResponse?>?

    /**
     * Evaluate risk of a bank account
     * Use &#x60;/beacon/account_risk/v1/evaluate&#x60; to get risk insights for a linked account.
     * @param beaconAccountRiskEvaluateRequest  (required)
     * @return Call&lt;BeaconAccountRiskEvaluateResponse&gt;
     *
     * @see [Evaluate risk of a bank account Documentation](none)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/account_risk/v1/evaluate")
    fun beaconAccountRiskEvaluate(
        @Body beaconAccountRiskEvaluateRequest: BeaconAccountRiskEvaluateRequest?
    ): Call<BeaconAccountRiskEvaluateResponse?>?

    /**
     * Get a Beacon Duplicate
     * Returns a Beacon Duplicate for a given Beacon Duplicate id.  A Beacon Duplicate represents a pair of similar Beacon Users within your organization.  Two Beacon User revisions are returned for each Duplicate record in either the &#x60;beacon_user1&#x60; or &#x60;beacon_user2&#x60; response fields.  The &#x60;analysis&#x60; field in the response indicates which fields matched between &#x60;beacon_user1&#x60; and &#x60;beacon_user2&#x60;.
     * @param beaconDuplicateGetRequest  (required)
     * @return Call&lt;BeaconDuplicateGetResponse&gt;
     *
     * @see [Get a Beacon Duplicate Documentation](/api/products/beacon/.beaconduplicateget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/duplicate/get")
    fun beaconDuplicateGet(
        @Body beaconDuplicateGetRequest: BeaconDuplicateGetRequest?
    ): Call<BeaconDuplicateGetResponse?>?

    /**
     * Create a Beacon Report
     * Create a fraud report for a given Beacon User.
     * @param beaconReportCreateRequest  (required)
     * @return Call&lt;BeaconReportCreateResponse&gt;
     *
     * @see [Create a Beacon Report Documentation](/api/products/beacon/.beaconreportcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/report/create")
    fun beaconReportCreate(
        @Body beaconReportCreateRequest: BeaconReportCreateRequest?
    ): Call<BeaconReportCreateResponse?>?

    /**
     * Get a Beacon Report
     * Returns a Beacon report for a given Beacon report id.
     * @param beaconReportGetRequest  (required)
     * @return Call&lt;BeaconReportGetResponse&gt;
     *
     * @see [Get a Beacon Report Documentation](/api/products/beacon/.beaconreportget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/report/get")
    fun beaconReportGet(
        @Body beaconReportGetRequest: BeaconReportGetRequest?
    ): Call<BeaconReportGetResponse?>?

    /**
     * List Beacon Reports for a Beacon User
     * Use the &#x60;/beacon/report/list&#x60; endpoint to view all Beacon Reports you created for a specific Beacon User. The reports returned by this endpoint are exclusively reports you created for a specific user. A Beacon User can only have one active report at a time, but a new report can be created if a previous report has been deleted. The results from this endpoint are paginated; the &#x60;next_cursor&#x60; field will be populated if there is another page of results that can be retrieved. To fetch the next page, pass the &#x60;next_cursor&#x60; value as the &#x60;cursor&#x60; parameter in the next request.
     * @param beaconReportListRequest  (required)
     * @return Call&lt;BeaconReportListResponse&gt;
     *
     * @see [List Beacon Reports for a Beacon User Documentation](/api/products/beacon/.beaconreportlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/report/list")
    fun beaconReportList(
        @Body beaconReportListRequest: BeaconReportListRequest?
    ): Call<BeaconReportListResponse?>?

    /**
     * Get a Beacon Report Syndication
     * Returns a Beacon Report Syndication for a given Beacon Report Syndication id.
     * @param beaconReportSyndicationGetRequest  (required)
     * @return Call&lt;BeaconReportSyndicationGetResponse&gt;
     *
     * @see [Get a Beacon Report Syndication Documentation](/api/products/beacon/.beaconreportsyndicationget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/report_syndication/get")
    fun beaconReportSyndicationGet(
        @Body beaconReportSyndicationGetRequest: BeaconReportSyndicationGetRequest?
    ): Call<BeaconReportSyndicationGetResponse?>?

    /**
     * List Beacon Report Syndications for a Beacon User
     * Use the &#x60;/beacon/report_syndication/list&#x60; endpoint to view all Beacon Reports that have been syndicated to a specific Beacon User. This endpoint returns Beacon Report Syndications which are references to Beacon Reports created either by you, or another Beacon customer, that matched the specified Beacon User. A Beacon User can have multiple active Beacon Report Syndications at once. The results from this endpoint are paginated; the &#x60;next_cursor&#x60; field will be populated if there is another page of results that can be retrieved. To fetch the next page, pass the &#x60;next_cursor&#x60; value as the &#x60;cursor&#x60; parameter in the next request.
     * @param beaconReportSyndicationListRequest  (required)
     * @return Call&lt;BeaconReportSyndicationListResponse&gt;
     *
     * @see [List Beacon Report Syndications for a Beacon User Documentation](/api/products/beacon/.beaconreportsyndicationlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/report_syndication/list")
    fun beaconReportSyndicationList(
        @Body beaconReportSyndicationListRequest: BeaconReportSyndicationListRequest?
    ): Call<BeaconReportSyndicationListResponse?>?

    /**
     * Create a Beacon User
     * Create and scan a Beacon User against your Beacon Program, according to your program&#39;s settings.  When you submit a new user to &#x60;/beacon/user/create&#x60;, several checks are performed immediately:    - The user&#39;s PII (provided within the &#x60;user&#x60; object) is searched against all other users within the Beacon Program you specified. If a match is found that violates your program&#39;s \&quot;Duplicate Information Filtering\&quot; settings, the user will be returned with a status of &#x60;pending_review&#x60;.    - The user&#39;s PII is also searched against all fraud reports created by your organization across all of your Beacon Programs. If the user&#39;s data matches a fraud report that your team created, the user will be returned with a status of &#x60;rejected&#x60;.    - Finally, the user&#39;s PII is searched against all fraud report shared with the Beacon Network by other companies. If a matching fraud report is found, the user will be returned with a &#x60;pending_review&#x60; status if your program has enabled automatic flagging based on network fraud.
     * @param beaconUserCreateRequest  (required)
     * @return Call&lt;BeaconUserCreateResponse&gt;
     *
     * @see [Create a Beacon User Documentation](/api/products/beacon/.beaconusercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/user/create")
    fun beaconUserCreate(
        @Body beaconUserCreateRequest: BeaconUserCreateRequest?
    ): Call<BeaconUserCreateResponse?>?

    /**
     * Get a Beacon User
     * Fetch a Beacon User.  The Beacon User is returned with all of their associated information and a &#x60;status&#x60; based on the Beacon Network duplicate record and fraud checks.
     * @param beaconUserGetRequest  (required)
     * @return Call&lt;BeaconUserGetResponse&gt;
     *
     * @see [Get a Beacon User Documentation](/api/products/beacon/.beaconuserget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/user/get")
    fun beaconUserGet(
        @Body beaconUserGetRequest: BeaconUserGetRequest?
    ): Call<BeaconUserGetResponse?>?

    /**
     * List a Beacon User&#39;s history
     * List all changes to the Beacon User in reverse-chronological order.
     * @param beaconUserHistoryListRequest  (required)
     * @return Call&lt;BeaconUserHistoryListResponse&gt;
     *
     * @see [List a Beacon User&.39;s history Documentation](/api/products/beacon/.beaconuserhistorylist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/user/history/list")
    fun beaconUserHistoryList(
        @Body beaconUserHistoryListRequest: BeaconUserHistoryListRequest?
    ): Call<BeaconUserHistoryListResponse?>?

    /**
     * Review a Beacon User
     * Update the status of a Beacon User.  When updating a Beacon User&#39;s status via this endpoint, Plaid validates that the status change is consistent with the related state for this Beacon User. Specifically, we will check:  1. Whether there are any associated Beacon Reports connected to the Beacon User, and 2. Whether there are any confirmed Beacon Report Syndications connected to the Beacon User.  When updating a Beacon User&#39;s status to \&quot;rejected\&quot;, we enforce that either a Beacon Report has been created for the Beacon User or a Beacon Report Syndication has been confirmed. When updating a Beacon User&#39;s status to \&quot;cleared\&quot;, we enforce that there are no active Beacon Reports or confirmed Beacon Report Syndications associated with the user. If you previously created a Beacon Report for this user, you must delete it before updating the Beacon User&#39;s status to \&quot;cleared\&quot;. There are no restrictions on updating a Beacon User&#39;s status to \&quot;pending_review\&quot;.  If these conditions are not met, the request will be rejected with an error explaining the issue.
     * @param beaconUserReviewRequest  (required)
     * @return Call&lt;BeaconUserGetResponse&gt;
     *
     * @see [Review a Beacon User Documentation](/api/products/beacon/.beaconuserreview)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/user/review")
    fun beaconUserReview(
        @Body beaconUserReviewRequest: BeaconUserReviewRequest?
    ): Call<BeaconUserGetResponse?>?

    /**
     * Update the identity data of a Beacon User
     * Update the identity data for a Beacon User in your Beacon Program.  Similar to &#x60;/beacon/user/create&#x60;, several checks are performed immediately when you submit a change to &#x60;/beacon/user/update&#x60;:    - The user&#39;s updated PII is searched against all other users within the Beacon Program you specified. If a match is found that violates your program&#39;s \&quot;Duplicate Information Filtering\&quot; settings, the user will be returned with a status of &#x60;pending_review&#x60;.    - The user&#39;s updated PII is also searched against all fraud reports created by your organization across all of your Beacon Programs. If the user&#39;s data matches a fraud report that your team created, the user will be returned with a status of &#x60;rejected&#x60;.    - Finally, the user&#39;s PII is searched against all fraud report shared with the Beacon Network by other companies. If a matching fraud report is found, the user will be returned with a &#x60;pending_review&#x60; status if your program has enabled automatic flagging based on network fraud.  Plaid maintains a version history for each Beacon User, so the Beacon User&#39;s identity data before and after the update is retained as separate versions.
     * @param beaconUserUpdateRequest  (required)
     * @return Call&lt;BeaconUserUpdateResponse&gt;
     *
     * @see [Update the identity data of a Beacon User Documentation](/api/products/beacon/.beaconuserupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beacon/user/update")
    fun beaconUserUpdate(
        @Body beaconUserUpdateRequest: BeaconUserUpdateRequest?
    ): Call<BeaconUserUpdateResponse?>?

    /**
     * Get categories
     * Send a request to the &#x60;/categories/get&#x60; endpoint to get detailed information on categories returned by Plaid. This endpoint does not require authentication.  All implementations are recommended to use the newer &#x60;personal_finance_category&#x60; taxonomy instead of the older &#x60;category&#x60; taxonomy supported by this endpoint. The [&#x60;personal_finance_category taxonomy&#x60; CSV file](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) is available for download and is not accessible via API.
     * @param body  (required)
     * @return Call&lt;CategoriesGetResponse&gt;
     *
     * @see [Get categories Documentation](/api/products/transactions/.categoriesget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("categories/get")
    fun categoriesGet(
        @Body body: Any?
    ): Call<CategoriesGetResponse?>?

    /**
     * Retrieve a PDF Reports
     * Retrieves all existing CRB Bank Income and Base reports for the consumer in PDF format.  Response is PDF binary data. The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.
     * @param consumerReportPDFGetRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     *
     * @see [Retrieve a PDF Reports Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("consumer_report/pdf/get")
    fun consumerReportPdfGet(
        @Body consumerReportPDFGetRequest: ConsumerReportPDFGetRequest?
    ): Call<ResponseBody?>?

    /**
     * Create a CRA report for income verification
     * &#x60;/cra/bank_income/create&#x60; creates a CRA report for income verification
     * @param craBankIncomeCreateRequest  (required)
     * @return Call&lt;CraBankIncomeCreateResponse&gt;
     *
     * @see [Create a CRA report for income verification Documentation](/api/products/income/.crabank_incomecreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/bank_income/create")
    fun craBankIncomeCreate(
        @Body craBankIncomeCreateRequest: CraBankIncomeCreateRequest?
    ): Call<CraBankIncomeCreateResponse?>?

    /**
     * Retrieve information from the bank accounts used for income verification
     * &#x60;/cra/bank_income/get&#x60; returns the bank income report(s) for a specified user.
     * @param craBankIncomeGetRequest  (required)
     * @return Call&lt;CraBankIncomeGetResponse&gt;
     *
     * @see [Retrieve information from the bank accounts used for income verification Documentation](/api/products/income/.crabank_incomeget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/bank_income/get")
    fun craBankIncomeGet(
        @Body craBankIncomeGetRequest: CraBankIncomeGetRequest?
    ): Call<CraBankIncomeGetResponse?>?

    /**
     * Register loan applications and decisions.
     * &#x60;/cra/loans/applications/register&#x60; registers loan applications and decisions.
     * @param craLoansApplicationsRegisterRequest  (required)
     * @return Call&lt;CraLoansApplicationsRegisterResponse&gt;
     *
     * @see [Register loan applications and decisions. Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/loans/applications/register")
    fun craLoansApplicationsRegister(
        @Body craLoansApplicationsRegisterRequest: CraLoansApplicationsRegisterRequest?
    ): Call<CraLoansApplicationsRegisterResponse?>?

    /**
     * Register a list of loans to their applicants.
     * &#x60;/cra/loans/register&#x60; registers a list of loans to their applicants.
     * @param crALoansRegisterRequest  (required)
     * @return Call&lt;CraLoansRegisterResponse&gt;
     *
     * @see [Register a list of loans to their applicants. Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/loans/register")
    fun craLoansRegister(
        @Body crALoansRegisterRequest: CRALoansRegisterRequest?
    ): Call<CraLoansRegisterResponse?>?

    /**
     * Unregister a list of loans.
     * &#x60;/cra/loans/unregister&#x60; indicates the loans have reached a final status and no further updates are expected.
     * @param craLoansUnregisterRequest  (required)
     * @return Call&lt;CraLoanUnregisterResponse&gt;
     *
     * @see [Unregister a list of loans. Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/loans/unregister")
    fun craLoansUnregister(
        @Body craLoansUnregisterRequest: CraLoansUnregisterRequest?
    ): Call<CraLoanUnregisterResponse?>?

    /**
     * Updates loan data.
     * &#x60;/cra/loans/update&#x60; updates loan information such as the status and payment history.
     * @param craLoansUpdateRequest  (required)
     * @return Call&lt;CraLoansUpdateResponse&gt;
     *
     * @see [Updates loan data. Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/loans/update")
    fun craLoansUpdate(
        @Body craLoansUpdateRequest: CraLoansUpdateRequest?
    ): Call<CraLoansUpdateResponse?>?

    /**
     * Retrieve cash flow insights from the bank accounts used for income verification
     * &#x60;/cra/partner_insights/get&#x60; returns cash flow insights for a specified user.
     * @param craPartnerInsightsGetRequest  (required)
     * @return Call&lt;CraPartnerInsightsGetResponse&gt;
     *
     * @see [Retrieve cash flow insights from the bank accounts used for income verification Documentation](/api/products/income/.crapartner_insightsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("cra/partner_insights/get")
    fun craPartnerInsightsGet(
        @Body craPartnerInsightsGetRequest: CraPartnerInsightsGetRequest?
    ): Call<CraPartnerInsightsGetResponse?>?

    /**
     * Create payment token
     * The &#x60;/payment_initiation/payment/token/create&#x60; endpoint has been deprecated. New Plaid customers will be unable to use this endpoint, and existing customers are encouraged to migrate to the newer, &#x60;link_token&#x60;-based flow. The recommended flow is to provide the &#x60;payment_id&#x60; to &#x60;/link/token/create&#x60;, which returns a &#x60;link_token&#x60; used to initialize Link.  The &#x60;/payment_initiation/payment/token/create&#x60; is used to create a &#x60;payment_token&#x60;, which can then be used in Link initialization to enter a payment initiation flow. You can only use a &#x60;payment_token&#x60; once. If this attempt fails, the end user aborts the flow, or the token expires, you will need to create a new payment token. Creating a new payment token does not require end user input.
     * @param paymentInitiationPaymentTokenCreateRequest  (required)
     * @return Call&lt;PaymentInitiationPaymentTokenCreateResponse&gt;
     * @see [Create payment token Documentation](/link/maintain-legacy-integration/.creating-a-payment-token)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/payment/token/create")
    @Deprecated(
        """ 
    """
    )
    fun createPaymentToken(
        @Body paymentInitiationPaymentTokenCreateRequest: PaymentInitiationPaymentTokenCreateRequest?
    ): Call<PaymentInitiationPaymentTokenCreateResponse?>?

    /**
     * Retrieve an Asset Report with Freddie Mac format. Only Freddie Mac can use this endpoint.
     * The &#x60;credit/asset_report/freddie_mac/get&#x60; endpoint retrieves the Asset Report in Freddie Mac&#39;s JSON format.
     * @param assetReportFreddieGetRequest  (required)
     * @return Call&lt;AssetReportFreddieGetResponse&gt;
     *
     * @see [Retrieve an Asset Report with Freddie Mac format. Only Freddie Mac can use this endpoint. Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/asset_report/freddie_mac/get")
    fun creditAssetReportFreddieMacGet(
        @Body assetReportFreddieGetRequest: AssetReportFreddieGetRequest?
    ): Call<AssetReportFreddieGetResponse?>?

    /**
     * Create Asset or Income Report Audit Copy Token
     * Plaid can create an Audit Copy token of an Asset Report and/or Income Report to share with participating Government Sponsored Entity (GSE). If you participate in the Day 1 Certainty™ program, Plaid can supply an Audit Copy token directly to Fannie Mae on your behalf. An Audit Copy token contains the same underlying data as the Asset Report and/or Income Report (result of /credit/payroll_income/get).  Use the &#x60;/credit/audit_copy_token/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the GSE who needs access.
     * @param creditAuditCopyTokenCreateRequest  (required)
     * @return Call&lt;CreditAuditCopyTokenCreateResponse&gt;
     *
     * @see [Create Asset or Income Report Audit Copy Token Documentation](/api/products/income/.creditaudit_copy_tokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/audit_copy_token/create")
    fun creditAuditCopyTokenCreate(
        @Body creditAuditCopyTokenCreateRequest: CreditAuditCopyTokenCreateRequest?
    ): Call<CreditAuditCopyTokenCreateResponse?>?

    /**
     * Update an Audit Copy Token
     * The &#x60;/credit/audit_copy_token/update&#x60; endpoint updates an existing  Audit Copy Token by adding the report tokens in the &#x60;report_tokens&#x60; field to the &#x60;audit_copy_token&#x60;. If the Audit Copy Token already contains a report of a certain type, it will be replaced with the token provided in the &#x60;report_tokens&#x60; field.
     * @param creditAuditCopyTokenUpdateRequest  (required)
     * @return Call&lt;CreditAuditCopyTokenUpdateResponse&gt;
     *
     * @see [Update an Audit Copy Token Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/audit_copy_token/update")
    fun creditAuditCopyTokenUpdate(
        @Body creditAuditCopyTokenUpdateRequest: CreditAuditCopyTokenUpdateRequest?
    ): Call<CreditAuditCopyTokenUpdateResponse?>?

    /**
     * Retrieve information from the bank accounts used for employment verification
     * &#x60;/credit/bank_employment/get&#x60; returns the employment report(s) derived from bank transaction data for a specified user.
     * @param creditBankEmploymentGetRequest  (required)
     * @return Call&lt;CreditBankEmploymentGetResponse&gt;
     *
     * @see [Retrieve information from the bank accounts used for employment verification Documentation](/api/products/income/.creditbank_employmentget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/credit/v1/bank_employment/get")
    fun creditBankEmploymentGet(
        @Body creditBankEmploymentGetRequest: CreditBankEmploymentGetRequest?
    ): Call<CreditBankEmploymentGetResponse?>?

    /**
     * Retrieve information from the bank accounts used for income verification
     * &#x60;/credit/bank_income/get&#x60; returns the bank income report(s) for a specified user.
     * @param creditBankIncomeGetRequest  (required)
     * @return Call&lt;CreditBankIncomeGetResponse&gt;
     *
     * @see [Retrieve information from the bank accounts used for income verification Documentation](/api/products/income/.creditbank_incomeget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/bank_income/get")
    fun creditBankIncomeGet(
        @Body creditBankIncomeGetRequest: CreditBankIncomeGetRequest?
    ): Call<CreditBankIncomeGetResponse?>?

    /**
     * Retrieve information from the bank accounts used for income verification in PDF format
     * &#x60;/credit/bank_income/pdf/get&#x60; returns the most recent bank income report for a specified user in PDF format.
     * @param creditBankIncomePDFGetRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     *
     * @see [Retrieve information from the bank accounts used for income verification in PDF format Documentation](/api/products/income/.creditbank_incomepdfget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/bank_income/pdf/get")
    fun creditBankIncomePdfGet(
        @Body creditBankIncomePDFGetRequest: CreditBankIncomePDFGetRequest?
    ): Call<ResponseBody?>?

    /**
     * Refresh a user&#39;s bank income information
     * &#x60;/credit/bank_income/refresh&#x60; refreshes the bank income report data for a specific user.
     * @param creditBankIncomeRefreshRequest  (required)
     * @return Call&lt;CreditBankIncomeRefreshResponse&gt;
     *
     * @see [Refresh a user&.39;s bank income information Documentation](/api/products/income/.creditbank_incomerefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/bank_income/refresh")
    fun creditBankIncomeRefresh(
        @Body creditBankIncomeRefreshRequest: CreditBankIncomeRefreshRequest?
    ): Call<CreditBankIncomeRefreshResponse?>?

    /**
     * Subscribe and unsubscribe to proactive notifications for a user&#39;s income profile
     * &#x60;/credit/bank_income/webhook/update&#x60; allows you to subscribe or unsubscribe a user for income webhook notifications. By default, all users start out unsubscribed.  If a user is subscribed, on significant changes to the user&#39;s income profile, you will receive a &#x60;BANK_INCOME_REFRESH_UPDATE&#x60; webhook, prompting you to refresh bank income data for the user.
     * @param creditBankIncomeWebhookUpdateRequest  (required)
     * @return Call&lt;CreditBankIncomeWebhookUpdateResponse&gt;
     *
     * @see [Subscribe and unsubscribe to proactive notifications for a user&.39;s income profile Documentation](/api/products/income/.creditbank_incomewebhookupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/bank_income/webhook/update")
    fun creditBankIncomeWebhookUpdate(
        @Body creditBankIncomeWebhookUpdateRequest: CreditBankIncomeWebhookUpdateRequest?
    ): Call<CreditBankIncomeWebhookUpdateResponse?>?

    /**
     * Retrieve data for a user&#39;s uploaded bank statements
     * &#x60;/credit/bank_statements/uploads/get&#x60; returns parsed data from bank statements uploaded by users as part of the Document Income flow. If your account is not enabled for Document Parsing, contact your account manager to request access.
     * @param creditBankStatementsUploadsGetRequest  (required)
     * @return Call&lt;CreditBankStatementsUploadsGetResponse&gt;
     *
     * @see [Retrieve data for a user&.39;s uploaded bank statements Documentation](/api/products/income/.creditbank_statementsuploadsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/bank_statements/uploads/get")
    fun creditBankStatementsUploadsGet(
        @Body creditBankStatementsUploadsGetRequest: CreditBankStatementsUploadsGetRequest?
    ): Call<CreditBankStatementsUploadsGetResponse?>?

    /**
     * Retrieve a summary of an individual&#39;s employment information
     * &#x60;/credit/employment/get&#x60; returns a list of items with employment information from a user&#39;s payroll provider that was verified by an end user.
     * @param creditEmploymentGetRequest  (required)
     * @return Call&lt;CreditEmploymentGetResponse&gt;
     *
     * @see [Retrieve a summary of an individual&.39;s employment information Documentation](/api/products/income/.creditemploymentget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/employment/get")
    fun creditEmploymentGet(
        @Body creditEmploymentGetRequest: CreditEmploymentGetRequest?
    ): Call<CreditEmploymentGetResponse?>?

    /**
     * Retrieve an Asset Report with Freddie Mac format (aka VOA - Verification Of Assets), and a Verification Of Employment (VOE) report if this one is available. Only Freddie Mac can use this endpoint.
     * The &#x60;credit/asset_report/freddie_mac/get&#x60; endpoint retrieves the Verification of Assets and Verification of Employment reports.
     * @param creditFreddieMacReportsGetRequest  (required)
     * @return Call&lt;CreditFreddieMacReportsGetResponse&gt;
     *
     * @see [Retrieve an Asset Report with Freddie Mac format
    ](/none/) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/freddie_mac/reports/get")
    fun creditFreddieMacReportsGet(
        @Body creditFreddieMacReportsGetRequest: CreditFreddieMacReportsGetRequest?
    ): Call<CreditFreddieMacReportsGetResponse?>?

    /**
     * Retrieve a user&#39;s payroll information
     * This endpoint gets payroll income information for a specific user, either as a result of the user connecting to their payroll provider or uploading a pay related document.
     * @param creditPayrollIncomeGetRequest  (required)
     * @return Call&lt;CreditPayrollIncomeGetResponse&gt;
     *
     * @see [Retrieve a user&.39;s payroll information Documentation](/api/products/income/.creditpayroll_incomeget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/payroll_income/get")
    fun creditPayrollIncomeGet(
        @Body creditPayrollIncomeGetRequest: CreditPayrollIncomeGetRequest?
    ): Call<CreditPayrollIncomeGetResponse?>?

    /**
     * Update the parsing configuration for a document income verification
     * &#x60;/credit/payroll_income/parsing_config/update&#x60; updates the parsing configuration for a document income verification.
     * @param creditPayrollIncomeParsingConfigUpdateRequest  (required)
     * @return Call&lt;CreditPayrollIncomeParsingConfigUpdateResponse&gt;
     *
     * @see [Update the parsing configuration for a document income verification Documentation](/api/products/income/.creditpayroll_incomeparsing_configupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/payroll_income/parsing_config/update")
    fun creditPayrollIncomeParsingConfigUpdate(
        @Body creditPayrollIncomeParsingConfigUpdateRequest: CreditPayrollIncomeParsingConfigUpdateRequest?
    ): Call<CreditPayrollIncomeParsingConfigUpdateResponse?>?

    /**
     * Check income verification eligibility and optimize conversion
     * &#x60;/credit/payroll_income/precheck&#x60; is an optional endpoint that can be called before initializing a Link session for income verification. It evaluates whether a given user is supportable by digital income verification. If the user is eligible for digital verification, that information will be associated with the user token, and in this way will generate a Link UI optimized for the end user and their specific employer. If the user cannot be confirmed as eligible, the user can still use the income verification flow, but they may be required to manually upload a paystub to verify their income.  While all request fields are optional, providing &#x60;employer&#x60; data will increase the chance of receiving a useful result.  When testing in Sandbox, you can control the results by providing special test values in the &#x60;employer&#x60; and &#x60;access_tokens&#x60; fields. &#x60;employer_good&#x60; and &#x60;employer_bad&#x60; will result in &#x60;HIGH&#x60; and &#x60;LOW&#x60; confidence values, respectively. &#x60;employer_multi&#x60; will result in a &#x60;HIGH&#x60; confidence with multiple payroll options. Likewise, &#x60;access_good&#x60; and &#x60;access_bad&#x60; will result in &#x60;HIGH&#x60; and &#x60;LOW&#x60; confidence values, respectively. Any other value for &#x60;employer&#x60; and &#x60;access_tokens&#x60; in Sandbox will result in &#x60;UNKNOWN&#x60; confidence.
     * @param creditPayrollIncomePrecheckRequest  (required)
     * @return Call&lt;CreditPayrollIncomePrecheckResponse&gt;
     * @see [Check income verification eligibility and optimize conversion Documentation](/api/products/income/.creditpayroll_incomeprecheck)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/payroll_income/precheck")
    @Deprecated(
        """ 
    """
    )
    fun creditPayrollIncomePrecheck(
        @Body creditPayrollIncomePrecheckRequest: CreditPayrollIncomePrecheckRequest?
    ): Call<CreditPayrollIncomePrecheckResponse?>?

    /**
     * Refresh a digital payroll income verification
     * &#x60;/credit/payroll_income/refresh&#x60; refreshes a given digital payroll income verification.
     * @param creditPayrollIncomeRefreshRequest  (required)
     * @return Call&lt;CreditPayrollIncomeRefreshResponse&gt;
     *
     * @see [Refresh a digital payroll income verification Documentation](/api/products/income/.creditpayroll_incomerefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/payroll_income/refresh")
    fun creditPayrollIncomeRefresh(
        @Body creditPayrollIncomeRefreshRequest: CreditPayrollIncomeRefreshRequest?
    ): Call<CreditPayrollIncomeRefreshResponse?>?

    /**
     * Retrieve fraud insights for a user&#39;s manually uploaded document(s).
     * &#x60;/credit/payroll_income/risk_signals/get&#x60; can be used as part of the Document Income flow to assess a user-uploaded document for signs of potential fraud or tampering. It returns a risk score for each uploaded document that indicates the likelihood of the document being fraudulent, in addition to details on the individual risk signals contributing to the score.  To trigger risk signal generation for an Item, call &#x60;/link/token/create&#x60; with &#x60;parsing_config&#x60; set to include &#x60;risk_signals&#x60;, or call &#x60;/credit/payroll_income/parsing_config/update&#x60;. Once risk signal generation has been triggered, &#x60;/credit/payroll_income/risk_signals/get&#x60; can be called at any time after the &#x60;INCOME_VERIFICATION_RISK_SIGNALS&#x60; webhook has been fired.  &#x60;/credit/payroll_income/risk_signals/get&#x60; is offered as an add-on to Document Income and is billed separately. To request access to this endpoint, submit a product access request or contact your Plaid account manager.
     * @param creditPayrollIncomeRiskSignalsGetRequest  (required)
     * @return Call&lt;CreditPayrollIncomeRiskSignalsGetResponse&gt;
     *
     * @see [Retrieve fraud insights for a user&.39;s manually uploaded document
    ](/api/products/income/.creditpayroll_incomerisk_signalsget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/payroll_income/risk_signals/get")
    fun creditPayrollIncomeRiskSignalsGet(
        @Body creditPayrollIncomeRiskSignalsGetRequest: CreditPayrollIncomeRiskSignalsGetRequest?
    ): Call<CreditPayrollIncomeRiskSignalsGetResponse?>?

    /**
     * Create a relay token to share an Asset Report with a partner client
     * Plaid can share an Asset Report directly with a participating third party on your behalf. The shared Asset Report is the exact same Asset Report originally created in &#x60;/asset_report/create&#x60;.  To grant a third party access to an Asset Report, use the &#x60;/credit/relay/create&#x60; endpoint to create a &#x60;relay_token&#x60; and then pass that token to your third party. Each third party has its own &#x60;secondary_client_id&#x60;; for example, &#x60;ce5bd328dcd34123456&#x60;. You&#39;ll need to create a separate &#x60;relay_token&#x60; for each third party that needs access to the report on your behalf.
     * @param creditRelayCreateRequest  (required)
     * @return Call&lt;CreditRelayCreateResponse&gt;
     *
     * @see [Create a relay token to share an Asset Report with a partner client Documentation](/api/products/assets/.creditrelaycreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/relay/create")
    fun creditRelayCreate(
        @Body creditRelayCreateRequest: CreditRelayCreateRequest?
    ): Call<CreditRelayCreateResponse?>?

    /**
     * Retrieve the reports associated with a relay token that was shared with you
     * &#x60;/credit/relay/get&#x60; allows third parties to receive a report that was shared with them, using a &#x60;relay_token&#x60; that was created by the report owner.
     * @param creditRelayGetRequest  (required)
     * @return Call&lt;AssetReportGetResponse&gt;
     *
     * @see [Retrieve the reports associated with a relay token that was shared with you Documentation](/api/products/assets/.creditrelayget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/relay/get")
    fun creditRelayGet(
        @Body creditRelayGetRequest: CreditRelayGetRequest?
    ): Call<AssetReportGetResponse?>?

    /**
     * Retrieve the pdf reports associated with a relay token that was shared with you (beta)
     * &#x60;/credit/relay/pdf/get&#x60; allows third parties to receive a pdf report that was shared with them, using a &#x60;relay_token&#x60; that was created by the report owner.  The &#x60;/credit/relay/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/credit/relay/pdf/get&#x60;, you must first create the Asset Report using &#x60;/credit/relay/create&#x60; and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/credit/relay/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).
     * @param creditRelayPDFGetRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     *
     * @see [Retrieve the pdf reports associated with a relay token that was shared with you
    ](/api/products/assets/.creditrelaypdfget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/relay/pdf/get")
    fun creditRelayPdfGet(
        @Body creditRelayPDFGetRequest: CreditRelayPDFGetRequest?
    ): Call<ResponseBody?>?

    /**
     * Refresh a report of a relay token
     * The &#x60;/credit/relay/refresh&#x60; endpoint allows third parties to refresh a report that was relayed to them, using a &#x60;relay_token&#x60; that was created by the report owner. A new report will be created with the original report parameters, but with the most recent data available based on the &#x60;days_requested&#x60; value of the original report.
     * @param creditRelayRefreshRequest  (required)
     * @return Call&lt;CreditRelayRefreshResponse&gt;
     *
     * @see [Refresh a report of a relay token Documentation](/api/products/assets/.creditrelayrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/relay/refresh")
    fun creditRelayRefresh(
        @Body creditRelayRefreshRequest: CreditRelayRefreshRequest?
    ): Call<CreditRelayRefreshResponse?>?

    /**
     * Remove relay token
     * The &#x60;/credit/relay/remove&#x60; endpoint allows you to invalidate a &#x60;relay_token&#x60;. The third party holding the token will no longer be able to access or refresh the reports which the &#x60;relay_token&#x60; gives access to. The original report, associated Items, and other relay tokens that provide access to the same report are not affected and will remain accessible after removing the given &#x60;relay_token&#x60;.
     * @param creditRelayRemoveRequest  (required)
     * @return Call&lt;CreditRelayRemoveResponse&gt;
     *
     * @see [Remove relay token Documentation](/api/products/assets/.creditrelayremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/relay/remove")
    fun creditRelayRemove(
        @Body creditRelayRemoveRequest: CreditRelayRemoveRequest?
    ): Call<CreditRelayRemoveResponse?>?

    /**
     * Remove an Audit Copy token
     * The &#x60;/credit/audit_copy_token/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Report data and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.
     * @param creditAuditCopyTokenRemoveRequest  (required)
     * @return Call&lt;CreditAuditCopyTokenRemoveResponse&gt;
     *
     * @see [Remove an Audit Copy token Documentation](/api/products/income/.creditaudit_copy_tokenremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/audit_copy_token/remove")
    fun creditReportAuditCopyRemove(
        @Body creditAuditCopyTokenRemoveRequest: CreditAuditCopyTokenRemoveRequest?
    ): Call<CreditAuditCopyTokenRemoveResponse?>?

    /**
     * Retrieve Link sessions for your user
     * This endpoint can be used for your end users after they complete the Link flow. This endpoint returns a list of Link sessions that your user completed, where each session includes the results from the Link flow.  These results include details about the Item that was created and some product related metadata (showing, for example, whether the user finished the bank income verification step).
     * @param creditSessionsGetRequest  (required)
     * @return Call&lt;CreditSessionsGetResponse&gt;
     *
     * @see [Retrieve Link sessions for your user Documentation](/api/products/income/.creditsessionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("credit/sessions/get")
    fun creditSessionsGet(
        @Body creditSessionsGetRequest: CreditSessionsGetRequest?
    ): Call<CreditSessionsGetResponse?>?

    /**
     * Retrieve a dashboard user
     * Retrieve information about a dashboard user.
     * @param dashboardUserGetRequest  (required)
     * @return Call&lt;DashboardUserGetResponse&gt;
     *
     * @see [Retrieve a dashboard user Documentation](/api/products/monitor/.dashboard_userget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("dashboard_user/get")
    fun dashboardUserGet(
        @Body dashboardUserGetRequest: DashboardUserGetRequest?
    ): Call<DashboardUserGetResponse?>?

    /**
     * List dashboard users
     * List all dashboard users associated with your account.
     * @param dashboardUserListRequest  (required)
     * @return Call&lt;DashboardUserListResponse&gt;
     *
     * @see [List dashboard users Documentation](/api/products/monitor/.dashboard_userlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("dashboard_user/list")
    fun dashboardUserList(
        @Body dashboardUserListRequest: DashboardUserListRequest?
    ): Call<DashboardUserListResponse?>?

    /**
     * Create a deposit switch without using Plaid Exchange
     * This endpoint provides an alternative to &#x60;/deposit_switch/create&#x60; for customers who have not yet fully integrated with Plaid Exchange. Like &#x60;/deposit_switch/create&#x60;, it creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
     * @param depositSwitchAltCreateRequest  (required)
     * @return Call&lt;DepositSwitchAltCreateResponse&gt;
     *
     * @see [Create a deposit switch without using Plaid Exchange Documentation](/deposit-switch/reference.deposit_switchaltcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("deposit_switch/alt/create")
    fun depositSwitchAltCreate(
        @Body depositSwitchAltCreateRequest: DepositSwitchAltCreateRequest?
    ): Call<DepositSwitchAltCreateResponse?>?

    /**
     * Create a deposit switch
     * This endpoint creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
     * @param depositSwitchCreateRequest  (required)
     * @return Call&lt;DepositSwitchCreateResponse&gt;
     *
     * @see [Create a deposit switch Documentation](/deposit-switch/reference.deposit_switchcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("deposit_switch/create")
    fun depositSwitchCreate(
        @Body depositSwitchCreateRequest: DepositSwitchCreateRequest?
    ): Call<DepositSwitchCreateResponse?>?

    /**
     * Retrieve a deposit switch
     * This endpoint returns information related to how the user has configured their payroll allocation and the state of the switch. You can use this information to build logic related to the user&#39;s direct deposit allocation preferences.
     * @param depositSwitchGetRequest  (required)
     * @return Call&lt;DepositSwitchGetResponse&gt;
     *
     * @see [Retrieve a deposit switch Documentation](/deposit-switch/reference.deposit_switchget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("deposit_switch/get")
    fun depositSwitchGet(
        @Body depositSwitchGetRequest: DepositSwitchGetRequest?
    ): Call<DepositSwitchGetResponse?>?

    /**
     * Create a deposit switch token
     * In order for the end user to take action, you will need to create a public token representing the deposit switch. This token is used to initialize Link. It can be used one time and expires after 30 minutes.
     * @param depositSwitchTokenCreateRequest  (required)
     * @return Call&lt;DepositSwitchTokenCreateResponse&gt;
     *
     * @see [Create a deposit switch token Documentation](/deposit-switch/reference.deposit_switchtokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("deposit_switch/token/create")
    fun depositSwitchTokenCreate(
        @Body depositSwitchTokenCreateRequest: DepositSwitchTokenCreateRequest?
    ): Call<DepositSwitchTokenCreateResponse?>?

    /**
     * Search employer database
     * &#x60;/employers/search&#x60; allows you the ability to search Plaid’s database of known employers, for use with Deposit Switch. You can use this endpoint to look up a user&#39;s employer in order to confirm that they are supported. Users with non-supported employers can then be routed out of the Deposit Switch flow.  The data in the employer database is currently limited. As the Deposit Switch and Income products progress through their respective beta periods, more employers are being regularly added. Because the employer database is frequently updated, we recommend that you do not cache or store data from this endpoint for more than a day.
     * @param employersSearchRequest  (required)
     * @return Call&lt;EmployersSearchResponse&gt;
     *
     * @see [Search employer database Documentation](/api/employers/.employerssearch)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("employers/search")
    fun employersSearch(
        @Body employersSearchRequest: EmployersSearchRequest?
    ): Call<EmployersSearchResponse?>?

    /**
     * (Deprecated) Retrieve a summary of an individual&#39;s employment information
     * &#x60;/employment/verification/get&#x60; returns a list of employments through a user payroll that was verified by an end user.  This endpoint has been deprecated; new integrations should use &#x60;/credit/employment/get&#x60; instead.
     * @param employmentVerificationGetRequest  (required)
     * @return Call&lt;EmploymentVerificationGetResponse&gt;
     * @see [
    ](/api/products/income/.employmentverificationget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("employment/verification/get")
    @Deprecated(
        """ 
    """
    )
    fun employmentVerificationGet(
        @Body employmentVerificationGetRequest: EmploymentVerificationGetRequest?
    ): Call<EmploymentVerificationGetResponse?>?

    /**
     * Webhook receiver for fdx notifications
     * A generic webhook receiver endpoint for FDX Event Notifications
     * @param fdXNotification  (required)
     * @return Call&lt;Void&gt;
     *
     * @see [Webhook receiver for fdx notifications Documentation](/api/fdx/notifications/.post)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("fdx/notifications")
    fun fdxNotifications(
        @Body fdXNotification: FDXNotification?
    ): Call<Void?>?

    /**
     * Returns uploaded document identity
     * Use &#x60;/identity/documents/uploads/get&#x60; to retrieve document uploaded identity.
     * @param identityDocumentsUploadsGetRequest  (required)
     * @return Call&lt;IdentityDocumentsUploadsGetResponse&gt;
     *
     * @see [Returns uploaded document identity Documentation](none)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity/documents/uploads/get")
    fun identityDocumentsUploadsGet(
        @Body identityDocumentsUploadsGetRequest: IdentityDocumentsUploadsGetRequest?
    ): Call<IdentityDocumentsUploadsGetResponse?>?

    /**
     * Retrieve identity data
     * The &#x60;/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses. Only name data is guaranteed to be returned; other fields will be empty arrays if not provided by the institution.  This request may take some time to complete if identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.  Note: In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29).
     * @param identityGetRequest  (required)
     * @return Call&lt;IdentityGetResponse&gt;
     *
     * @see [Retrieve identity data Documentation](/api/products/identity/.identityget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity/get")
    fun identityGet(
        @Body identityGetRequest: IdentityGetRequest?
    ): Call<IdentityGetResponse?>?

    /**
     * Retrieve identity match score
     * The &#x60;/identity/match&#x60; endpoint generates a match score, which indicates how well the provided identity data matches the identity information on file with the account holder&#39;s financial institution.  Fields within the &#x60;balances&#x60; object will always be null when retrieved by &#x60;/identity/match&#x60;. Instead, use the free &#x60;/accounts/get&#x60; endpoint to request balance cached data, or &#x60;/accounts/balance/get&#x60; for real-time data.  This request may take some time to complete if Identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.
     * @param identityMatchRequest  (required)
     * @return Call&lt;IdentityMatchResponse&gt;
     *
     * @see [Retrieve identity match score Documentation](/api/products/identity/.identitymatch)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity/match")
    fun identityMatch(
        @Body identityMatchRequest: IdentityMatchRequest?
    ): Call<IdentityMatchResponse?>?

    /**
     * Refresh identity data
     * &#x60;/identity/refresh&#x60; is an optional endpoint for users of the Identity product. It initiates an on-demand extraction to fetch the most up to date Identity information from the Financial Institution. This on-demand extraction takes place in addition to the periodic extractions that automatically occur for any Identity-enabled Item. If changes to Identity are discovered after calling &#x60;/identity/refresh&#x60;, Plaid will fire a webhook [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/identity/#default_update).  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/identity/refresh&#x60; is offered as an add-on to Identity and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
     * @param identityRefreshRequest  (required)
     * @return Call&lt;IdentityRefreshResponse&gt;
     *
     * @see [Refresh identity data Documentation](/api/products/identity/.identityrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity/refresh")
    fun identityRefresh(
        @Body identityRefreshRequest: IdentityRefreshRequest?
    ): Call<IdentityRefreshResponse?>?

    /**
     * Create autofill for an Identity Verification
     * Try to autofill an Identity Verification based of the provided phone number, date of birth and country of residence.
     * @param identityVerificationAutofillCreateRequest  (required)
     * @return Call&lt;IdentityVerificationAutofillCreateResponse&gt;
     *
     * @see [Create autofill for an Identity Verification Documentation](/api/products/identity-verification/.identity_verificationautofillcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity_verification/autofill/create")
    fun identityVerificationAutofillCreate(
        @Body identityVerificationAutofillCreateRequest: IdentityVerificationAutofillCreateRequest?
    ): Call<IdentityVerificationAutofillCreateResponse?>?

    /**
     * Create a new Identity Verification
     * Create a new Identity Verification for the user specified by the &#x60;client_user_id&#x60; field. The requirements and behavior of the verification are determined by the &#x60;template_id&#x60; provided. If you don&#39;t know whether the associated user already has an active Identity Verification, you can specify &#x60;\&quot;is_idempotent\&quot;: true&#x60; in the request body. With idempotency enabled, a new Identity Verification will only be created if one does not already exist for the associated &#x60;client_user_id&#x60; and &#x60;template_id&#x60;. If an Identity Verification is found, it will be returned unmodified with an &#x60;200 OK&#x60; HTTP status code.  You can also use this endpoint to supply information you already have collected about the user; if any of these fields are specified, the screens prompting the user to enter them will be skipped during the Link flow.
     * @param identityVerificationCreateRequest  (required)
     * @return Call&lt;IdentityVerificationCreateResponse&gt;
     *
     * @see [Create a new Identity Verification Documentation](/api/products/identity-verification/.identity_verificationcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity_verification/create")
    fun identityVerificationCreate(
        @Body identityVerificationCreateRequest: IdentityVerificationCreateRequest?
    ): Call<IdentityVerificationCreateResponse?>?

    /**
     * Retrieve Identity Verification
     * Retrieve a previously created Identity Verification.
     * @param identityVerificationGetRequest  (required)
     * @return Call&lt;IdentityVerificationGetResponse&gt;
     *
     * @see [Retrieve Identity Verification Documentation](/api/products/identity-verification/.identity_verificationget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity_verification/get")
    fun identityVerificationGet(
        @Body identityVerificationGetRequest: IdentityVerificationGetRequest?
    ): Call<IdentityVerificationGetResponse?>?

    /**
     * List Identity Verifications
     * Filter and list Identity Verifications created by your account
     * @param identityVerificationListRequest  (required)
     * @return Call&lt;IdentityVerificationListResponse&gt;
     *
     * @see [List Identity Verifications Documentation](/api/products/identity-verification/.identity_verificationlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity_verification/list")
    fun identityVerificationList(
        @Body identityVerificationListRequest: IdentityVerificationListRequest?
    ): Call<IdentityVerificationListResponse?>?

    /**
     * Retry an Identity Verification
     * Allow a customer to retry their Identity Verification
     * @param identityVerificationRetryRequest  (required)
     * @return Call&lt;IdentityVerificationRetryResponse&gt;
     *
     * @see [Retry an Identity Verification Documentation](/api/products/identity-verification/.identity_verificationretry)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("identity_verification/retry")
    fun identityVerificationRetry(
        @Body identityVerificationRetryRequest: IdentityVerificationRetryRequest?
    ): Call<IdentityVerificationRetryResponse?>?

    /**
     * (Deprecated) Create an income verification instance
     * &#x60;/income/verification/create&#x60; begins the income verification process by returning an &#x60;income_verification_id&#x60;. You can then provide the &#x60;income_verification_id&#x60; to &#x60;/link/token/create&#x60; under the &#x60;income_verification&#x60; parameter in order to create a Link instance that will prompt the user to go through the income verification flow. Plaid will fire an &#x60;INCOME&#x60; webhook once the user completes the Payroll Income flow, or when the uploaded documents in the Document Income flow have finished processing.
     * @param incomeVerificationCreateRequest  (required)
     * @return Call&lt;IncomeVerificationCreateResponse&gt;
     * @see [
    ](/api/products/income/.incomeverificationcreate) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("income/verification/create")
    @Deprecated(
        """ 
    """
    )
    fun incomeVerificationCreate(
        @Body incomeVerificationCreateRequest: IncomeVerificationCreateRequest?
    ): Call<IncomeVerificationCreateResponse?>?

    /**
     * (Deprecated) Download the original documents used for income verification
     * &#x60;/income/verification/documents/download&#x60; provides the ability to download the source documents associated with the verification.  If Document Income was used, the documents will be those the user provided in Link. For Payroll Income, the most recent files available for download from the payroll provider will be available from this endpoint.  The response to &#x60;/income/verification/documents/download&#x60; is a ZIP file in binary data. If a &#x60;document_id&#x60; is passed, a single document will be contained in this file. If not, the response will contain all documents associated with the verification.  The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.
     * @param incomeVerificationDocumentsDownloadRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     * @see [
    ](/api/products/income/.incomeverificationdocumentsdownload) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("income/verification/documents/download")
    @Deprecated(
        """ 
    """
    )
    fun incomeVerificationDocumentsDownload(
        @Body incomeVerificationDocumentsDownloadRequest: IncomeVerificationDocumentsDownloadRequest?
    ): Call<ResponseBody?>?

    /**
     * (Deprecated) Retrieve information from the paystubs used for income verification
     * &#x60;/income/verification/paystubs/get&#x60; returns the information collected from the paystubs that were used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/get&#x60; instead.
     * @param incomeVerificationPaystubsGetRequest  (required)
     * @return Call&lt;IncomeVerificationPaystubsGetResponse&gt;
     * @see [
    ](/api/products/income/.incomeverificationpaystubsget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("income/verification/paystubs/get")
    @Deprecated(
        """ 
    """
    )
    fun incomeVerificationPaystubsGet(
        @Body incomeVerificationPaystubsGetRequest: IncomeVerificationPaystubsGetRequest?
    ): Call<IncomeVerificationPaystubsGetResponse?>?

    /**
     * (Deprecated) Check digital income verification eligibility and optimize conversion
     * &#x60;/income/verification/precheck&#x60; is an optional endpoint that can be called before initializing a Link session for income verification. It evaluates whether a given user is supportable by digital income verification and returns a &#x60;precheck_id&#x60; that can be provided to &#x60;/link/token/create&#x60;. If the user is eligible for digital verification, providing the &#x60;precheck_id&#x60; in this way will generate a Link UI optimized for the end user and their specific employer. If the user cannot be confirmed as eligible, the &#x60;precheck_id&#x60; can still be provided to &#x60;/link/token/create&#x60; and the user can still use the income verification flow, but they may be required to manually upload a paystub to verify their income.  While all request fields are optional, providing either &#x60;employer&#x60; or &#x60;transactions_access_tokens&#x60; data will increase the chance of receiving a useful result.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/precheck&#x60; instead.
     * @param incomeVerificationPrecheckRequest  (required)
     * @return Call&lt;IncomeVerificationPrecheckResponse&gt;
     * @see [
    ](/api/products/income/.incomeverificationprecheck) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("income/verification/precheck")
    @Deprecated(
        """ 
    """
    )
    fun incomeVerificationPrecheck(
        @Body incomeVerificationPrecheckRequest: IncomeVerificationPrecheckRequest?
    ): Call<IncomeVerificationPrecheckResponse?>?

    /**
     * (Deprecated) Retrieve information from the tax documents used for income verification
     * &#x60;/income/verification/taxforms/get&#x60; returns the information collected from forms that were used to verify an end user&#39;&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/get&#x60; instead.
     * @param incomeVerificationTaxformsGetRequest  (required)
     * @return Call&lt;IncomeVerificationTaxformsGetResponse&gt;
     * @see [
    ](/api/products/income/.incomeverificationtaxformsget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("income/verification/taxforms/get")
    @Deprecated(
        """ 
    """
    )
    fun incomeVerificationTaxformsGet(
        @Body incomeVerificationTaxformsGetRequest: IncomeVerificationTaxformsGetRequest?
    ): Call<IncomeVerificationTaxformsGetResponse?>?

    /**
     * Get details of all supported institutions
     * Returns a JSON response containing details on all financial institutions currently supported by Plaid. Because Plaid supports thousands of institutions, results are paginated.  If there is no overlap between an institution’s enabled products and a client’s enabled products, then the institution will be filtered out from the response. As a result, the number of institutions returned may not match the count specified in the call.
     * @param institutionsGetRequest  (required)
     * @return Call&lt;InstitutionsGetResponse&gt;
     *
     * @see [Get details of all supported institutions Documentation](/api/institutions/.institutionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("institutions/get")
    fun institutionsGet(
        @Body institutionsGetRequest: InstitutionsGetRequest?
    ): Call<InstitutionsGetResponse?>?

    /**
     * Get details of an institution
     * Returns a JSON response containing details on a specified financial institution currently supported by Plaid.  Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; to authenticate to this endpoint. The &#x60;public_key&#x60; has been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead.
     * @param institutionsGetByIdRequest  (required)
     * @return Call&lt;InstitutionsGetByIdResponse&gt;
     *
     * @see [Get details of an institution Documentation](/api/institutions/.institutionsget_by_id)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("institutions/get_by_id")
    fun institutionsGetById(
        @Body institutionsGetByIdRequest: InstitutionsGetByIdRequest?
    ): Call<InstitutionsGetByIdResponse?>?

    /**
     * Search institutions
     * Returns a JSON response containing details for institutions that match the query parameters, up to a maximum of ten institutions per query.  Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; parameters to authenticate to this endpoint. The &#x60;public_key&#x60; parameter has since been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead.
     * @param institutionsSearchRequest  (required)
     * @return Call&lt;InstitutionsSearchResponse&gt;
     *
     * @see [Search institutions Documentation](/api/institutions/.institutionssearch)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("institutions/search")
    fun institutionsSearch(
        @Body institutionsSearchRequest: InstitutionsSearchRequest?
    ): Call<InstitutionsSearchResponse?>?

    /**
     * Get data needed to authorize an investments transfer
     * The &#x60;/investments/auth/get&#x60; endpoint allows developers to receive user-authorized data to facilitate the transfer of holdings
     * @param investmentsAuthGetRequest  (required)
     * @return Call&lt;InvestmentsAuthGetResponse&gt;
     *
     * @see [Get data needed to authorize an investments transfer Documentation](/api/products/investments/.investmentsauth)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("investments/auth/get")
    fun investmentsAuthGet(
        @Body investmentsAuthGetRequest: InvestmentsAuthGetRequest?
    ): Call<InvestmentsAuthGetResponse?>?

    /**
     * Get Investment holdings
     * The &#x60;/investments/holdings/get&#x60; endpoint allows developers to receive user-authorized stock position data for &#x60;investment&#x60;-type accounts.
     * @param investmentsHoldingsGetRequest  (required)
     * @return Call&lt;InvestmentsHoldingsGetResponse&gt;
     *
     * @see [Get Investment holdings Documentation](/api/products/investments/.investmentsholdingsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("investments/holdings/get")
    fun investmentsHoldingsGet(
        @Body investmentsHoldingsGetRequest: InvestmentsHoldingsGetRequest?
    ): Call<InvestmentsHoldingsGetResponse?>?

    /**
     * Refresh investment data
     * &#x60;/investments/refresh&#x60; is an optional endpoint for users of the Investments product. It initiates an on-demand extraction to fetch the newest investments, holdings and investment transactions for an Item. This on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Investments-enabled Item. If changes to investments are discovered after calling &#x60;/investments/refresh&#x60;, Plaid will fire webhooks: [&#x60;HOLDINGS: DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/investments/#holdings-default_update) if any new holdings are detected, and [INVESTMENTS_TRANSACTIONS: DEFAULT_UPDATE](https://plaid.com/docs/api/products/investments/#investments_transactions-default_update) if any new investment transactions are detected. Updated holdings and investment transactions can be fetched by calling &#x60;/investments/holdings/get&#x60; and &#x60;/investments/transactions/get&#x60;. \&quot;Note that the &#x60;/investments/refresh&#x60; endpoint is not supported by all institutions. If called on an Item from an institution that does not support this functionality, it will return a &#x60;PRODUCT_NOT_SUPPORTED&#x60; error.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/investments/refresh&#x60; is offered as an add-on to Investments and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
     * @param investmentsRefreshRequest  (required)
     * @return Call&lt;InvestmentsRefreshResponse&gt;
     *
     * @see [Refresh investment data Documentation](/api/products/investments/.investmentsrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("investments/refresh")
    fun investmentsRefresh(
        @Body investmentsRefreshRequest: InvestmentsRefreshRequest?
    ): Call<InvestmentsRefreshResponse?>?

    /**
     * Get investment transactions
     * The &#x60;/investments/transactions/get&#x60; endpoint allows developers to retrieve up to 24 months of user-authorized transaction data for investment accounts.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Due to the potentially large number of investment transactions associated with an Item, results are paginated. Manipulate the count and offset parameters in conjunction with the &#x60;total_investment_transactions&#x60; response body field to fetch all available investment transactions.  Note that Investments does not have a webhook to indicate when initial transaction data has loaded (unless you use the &#x60;async_update&#x60; option). Instead, if transactions data is not ready when &#x60;/investments/transactions/get&#x60; is first called, Plaid will wait for the data. For this reason, calling &#x60;/investments/transactions/get&#x60; immediately after Link may take up to one to two minutes to return.  Data returned by the asynchronous investments extraction flow (when &#x60;async_update&#x60; is set to true) may not be immediately available to &#x60;/investments/transactions/get&#x60;. To be alerted when the data is ready to be fetched, listen for the &#x60;HISTORICAL_UPDATE&#x60; webhook. If no investments history is ready when &#x60;/investments/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
     * @param investmentsTransactionsGetRequest  (required)
     * @return Call&lt;InvestmentsTransactionsGetResponse&gt;
     *
     * @see [Get investment transactions Documentation](/api/products/investments/.investmentstransactionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("investments/transactions/get")
    fun investmentsTransactionsGet(
        @Body investmentsTransactionsGetRequest: InvestmentsTransactionsGetRequest?
    ): Call<InvestmentsTransactionsGetResponse?>?

    /**
     * Invalidate access_token
     * By default, the &#x60;access_token&#x60; associated with an Item does not expire and should be stored in a persistent, secure manner.  You can use the &#x60;/item/access_token/invalidate&#x60; endpoint to rotate the &#x60;access_token&#x60; associated with an Item. The endpoint returns a new &#x60;access_token&#x60; and immediately invalidates the previous &#x60;access_token&#x60;.
     * @param itemAccessTokenInvalidateRequest  (required)
     * @return Call&lt;ItemAccessTokenInvalidateResponse&gt;
     *
     * @see [Invalidate access_token Documentation](/api/tokens/.itemaccess_tokeninvalidate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/access_token/invalidate")
    fun itemAccessTokenInvalidate(
        @Body itemAccessTokenInvalidateRequest: ItemAccessTokenInvalidateRequest?
    ): Call<ItemAccessTokenInvalidateResponse?>?

    /**
     * List a historical log of user consent events
     * List a historical log of user consent events
     * @param itemActivityListRequest  (required)
     * @return Call&lt;ItemActivityListResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/activity/list")
    fun itemActivityList(
        @Body itemActivityListRequest: ItemActivityListRequest?
    ): Call<ItemActivityListResponse?>?

    /**
     * List a user’s connected applications
     * List a user’s connected applications
     * @param itemApplicationListRequest  (required)
     * @return Call&lt;ItemApplicationListResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/application/list")
    fun itemApplicationList(
        @Body itemApplicationListRequest: ItemApplicationListRequest?
    ): Call<ItemApplicationListResponse?>?

    /**
     * Update the scopes of access for a particular application
     * Enable consumers to update product access on selected accounts for an application.
     * @param itemApplicationScopesUpdateRequest  (required)
     * @return Call&lt;ItemApplicationScopesUpdateResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/application/scopes/update")
    fun itemApplicationScopesUpdate(
        @Body itemApplicationScopesUpdateRequest: ItemApplicationScopesUpdateRequest?
    ): Call<ItemApplicationScopesUpdateResponse?>?

    /**
     * Unlink a user’s connected application
     * Unlink a user’s connected application. On an unlink request, Plaid will immediately revoke the Application’s access to the User’s data.  The User will have to redo the OAuth authentication process in order to restore functionality.  This endpoint only removes ongoing data access permissions, therefore the User will need to reach out to the Application itself in order to disable and delete their account and delete any data that the Application already received (if the Application does not do so by default).  This endpoint should be called in real time as the User is unlinking an Application, and should not be batched in order to ensure that the change is reflected as soon as possible.
     * @param itemApplicationUnlinkRequest  (required)
     * @return Call&lt;ItemApplicationUnlinkResponse&gt;
     *
     * @see [Unlink a user’s connected application Documentation](none)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/application/unlink")
    fun itemApplicationUnlink(
        @Body itemApplicationUnlinkRequest: ItemApplicationUnlinkRequest?
    ): Call<ItemApplicationUnlinkResponse?>?

    /**
     * Create public token
     * Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated. Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60; to create a Link token for use with [update mode](https://plaid.com/docs/link/update-mode).  If you need your user to take action to restore or resolve an error associated with an Item, generate a public token with the &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. You use a &#x60;public_token&#x60; to initialize Link in [update mode](https://plaid.com/docs/link/update-mode) for a particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token&#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead. See the [Quickstart](https://plaid.com/docs/quickstart) for more information.
     * @param itemPublicTokenCreateRequest  (required)
     * @return Call&lt;ItemPublicTokenCreateResponse&gt;
     *
     * @see [Create public token Documentation](/api/tokens/.itempublic_tokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/public_token/create")
    fun itemCreatePublicToken(
        @Body itemPublicTokenCreateRequest: ItemPublicTokenCreateRequest?
    ): Call<ItemPublicTokenCreateResponse?>?

    /**
     * Retrieve an Item
     * Returns information about the status of an Item.
     * @param itemGetRequest  (required)
     * @return Call&lt;ItemGetResponse&gt;
     *
     * @see [Retrieve an Item Documentation](/api/items/.itemget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/get")
    fun itemGet(
        @Body itemGetRequest: ItemGetRequest?
    ): Call<ItemGetResponse?>?

    /**
     * Import Item
     * &#x60;/item/import&#x60; creates an Item via your Plaid Exchange Integration and returns an &#x60;access_token&#x60;. As part of an &#x60;/item/import&#x60; request, you will include a User ID (&#x60;user_auth.user_id&#x60;) and Authentication Token (&#x60;user_auth.auth_token&#x60;) that enable data aggregation through your Plaid Exchange API endpoints. These authentication principals are to be chosen by you.  Upon creating an Item via &#x60;/item/import&#x60;, Plaid will automatically begin an extraction of that Item through the Plaid Exchange infrastructure you have already integrated.
     * @param itemImportRequest  (required)
     * @return Call&lt;ItemImportResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/import")
    fun itemImport(
        @Body itemImportRequest: ItemImportRequest?
    ): Call<ItemImportResponse?>?

    /**
     * Exchange public token for an access token
     * Exchange a Link &#x60;public_token&#x60; for an API &#x60;access_token&#x60;. Link hands off the &#x60;public_token&#x60; client-side via the &#x60;onSuccess&#x60; callback once a user has successfully created an Item. The &#x60;public_token&#x60; is ephemeral and expires after 30 minutes. An &#x60;access_token&#x60; does not expire, but can be revoked by calling &#x60;/item/remove&#x60;.  The response also includes an &#x60;item_id&#x60; that should be stored with the &#x60;access_token&#x60;. The &#x60;item_id&#x60; is used to identify an Item in a webhook. The &#x60;item_id&#x60; can also be retrieved by making an &#x60;/item/get&#x60; request.
     * @param itemPublicTokenExchangeRequest  (required)
     * @return Call&lt;ItemPublicTokenExchangeResponse&gt;
     *
     * @see [Exchange public token for an access token Documentation](/api/tokens/.itempublic_tokenexchange)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/public_token/exchange")
    fun itemPublicTokenExchange(
        @Body itemPublicTokenExchangeRequest: ItemPublicTokenExchangeRequest?
    ): Call<ItemPublicTokenExchangeResponse?>?

    /**
     * Remove an Item
     * The &#x60;/item/remove&#x60; endpoint allows you to remove an Item. Once removed, the &#x60;access_token&#x60;, as well as any processor tokens or bank account tokens associated with the Item, is no longer valid and cannot be used to access any data that was associated with the Item.  Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove access to them specifically using the &#x60;/asset_report/remove&#x60; endpoint.  Note that in the Development environment, issuing an &#x60;/item/remove&#x60;  request will not decrement your live credential count. To increase your credential account in Development, contact Support.  Also note that for certain OAuth-based institutions, an Item removed via &#x60;/item/remove&#x60; may still show as an active connection in the institution&#39;s OAuth permission manager.  API versions 2019-05-29 and earlier return a &#x60;removed&#x60; boolean as part of the response.
     * @param itemRemoveRequest  (required)
     * @return Call&lt;ItemRemoveResponse&gt;
     *
     * @see [Remove an Item Documentation](/api/items/.itemremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/remove")
    fun itemRemove(
        @Body itemRemoveRequest: ItemRemoveRequest?
    ): Call<ItemRemoveResponse?>?

    /**
     * Update Webhook URL
     * The POST &#x60;/item/webhook/update&#x60; allows you to update the webhook URL associated with an Item. This request triggers a [&#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;](https://plaid.com/docs/api/items/#webhook_update_acknowledged) webhook to the newly specified webhook URL.
     * @param itemWebhookUpdateRequest  (required)
     * @return Call&lt;ItemWebhookUpdateResponse&gt;
     *
     * @see [Update Webhook URL Documentation](/api/items/.itemwebhookupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("item/webhook/update")
    fun itemWebhookUpdate(
        @Body itemWebhookUpdateRequest: ItemWebhookUpdateRequest?
    ): Call<ItemWebhookUpdateResponse?>?

    /**
     * Retrieve Liabilities data
     * The &#x60;/liabilities/get&#x60; endpoint returns various details about an Item with loan or credit accounts. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;. To limit accounts listed in Link to types and subtypes supported by Liabilities, you can use the &#x60;account_filters&#x60; parameter when [creating a Link token](https://plaid.com/docs/api/tokens/#linktokencreate).  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the additional data.
     * @param liabilitiesGetRequest  (required)
     * @return Call&lt;LiabilitiesGetResponse&gt;
     *
     * @see [Retrieve Liabilities data Documentation](/api/products/liabilities/.liabilitiesget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("liabilities/get")
    fun liabilitiesGet(
        @Body liabilitiesGetRequest: LiabilitiesGetRequest?
    ): Call<LiabilitiesGetResponse?>?

    /**
     * Create Hosted Link session
     * Use the &#x60;/link_delivery/create&#x60; endpoint to create a Hosted Link session.
     * @param linkDeliveryCreateRequest  (required)
     * @return Call&lt;LinkDeliveryCreateResponse&gt;
     *
     * @see [Create Hosted Link session Documentation](/assets/waitlist/hosted-link/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link_delivery/create")
    fun linkDeliveryCreate(
        @Body linkDeliveryCreateRequest: LinkDeliveryCreateRequest?
    ): Call<LinkDeliveryCreateResponse?>?

    /**
     * Get Hosted Link session
     * Use the &#x60;/link_delivery/get&#x60; endpoint to get the status of a Hosted Link session.
     * @param linkDeliveryGetRequest  (required)
     * @return Call&lt;LinkDeliveryGetResponse&gt;
     *
     * @see [Get Hosted Link session Documentation](/assets/waitlist/hosted-link/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link_delivery/get")
    fun linkDeliveryGet(
        @Body linkDeliveryGetRequest: LinkDeliveryGetRequest?
    ): Call<LinkDeliveryGetResponse?>?

    /**
     * Exchange the Link Correlation Id for a Link Token
     * Exchange an OAuth &#x60;link_correlation_id&#x60; for the corresponding &#x60;link_token&#x60;. The &#x60;link_correlation_id&#x60; is only available for &#39;payment_initiation&#39; products and is provided to the client via the OAuth &#x60;redirect_uri&#x60; as a query parameter. The &#x60;link_correlation_id&#x60; is ephemeral and expires in a brief period, after which it can no longer be exchanged for the &#39;link_token&#39;.
     * @param linkOAuthCorrelationIdExchangeRequest  (required)
     * @return Call&lt;LinkOAuthCorrelationIdExchangeResponse&gt;
     *
     * @see [Exchange the Link Correlation Id for a Link Token Documentation](/api/oauth/.linkcorrelationid)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link/oauth/correlation_id/exchange")
    fun linkOauthCorrelationIdExchange(
        @Body linkOAuthCorrelationIdExchangeRequest: LinkOAuthCorrelationIdExchangeRequest?
    ): Call<LinkOAuthCorrelationIdExchangeResponse?>?

    /**
     * Check profile eligibility
     * The &#x60;/link/profile/eligibility/check&#x60; endpoint can be used to check whether a user with the supplied phone number has a saved profile that satisfies customer-defined eligibility requirements.
     * @param linkProfileEligibilityCheckRequest  (required)
     * @return Call&lt;LinkProfileEligibilityCheckResponse&gt;
     *
     * @see [Check profile eligibility Documentation](/api/link/.profileeligibilitycheck)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link/profile/eligibility/check")
    fun linkProfileEligibilityCheck(
        @Body linkProfileEligibilityCheckRequest: LinkProfileEligibilityCheckRequest?
    ): Call<LinkProfileEligibilityCheckResponse?>?

    /**
     * Create Link Token
     * The &#x60;/link/token/create&#x60; endpoint creates a &#x60;link_token&#x60;, which is required as a parameter when initializing Link. Once Link has been initialized, it returns a &#x60;public_token&#x60;, which can then be exchanged for an &#x60;access_token&#x60; via &#x60;/item/public_token/exchange&#x60; as part of the main Link flow.  A &#x60;link_token&#x60; generated by &#x60;/link/token/create&#x60; is also used to initialize other Link flows, such as the update mode flow for tokens with expired credentials, or the Payment Initiation (Europe) flow.
     * @param linkTokenCreateRequest  (required)
     * @return Call&lt;LinkTokenCreateResponse&gt;
     *
     * @see [Create Link Token Documentation](/api/tokens/.linktokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link/token/create")
    fun linkTokenCreate(
        @Body linkTokenCreateRequest: LinkTokenCreateRequest?
    ): Call<LinkTokenCreateResponse?>?

    /**
     * Get Link Token
     * The &#x60;/link/token/get&#x60; endpoint gets information about a previously-created &#x60;link_token&#x60; using the &#x60;/link/token/create&#x60; endpoint. It can be useful for debugging purposes.
     * @param linkTokenGetRequest  (required)
     * @return Call&lt;LinkTokenGetResponse&gt;
     *
     * @see [Get Link Token Documentation](/api/tokens/.linktokenget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("link/token/get")
    fun linkTokenGet(
        @Body linkTokenGetRequest: LinkTokenGetRequest?
    ): Call<LinkTokenGetResponse?>?

    /**
     * Creates a new end customer for a Plaid reseller.
     * The &#x60;/partner/customer/create&#x60; endpoint is used by reseller partners to create end customers.
     * @param partnerCustomerCreateRequest  (required)
     * @return Call&lt;PartnerCustomerCreateResponse&gt;
     *
     * @see [Creates a new end customer for a Plaid reseller. Documentation](/api/partner/.partnercustomercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("partner/customer/create")
    fun partnerCustomerCreate(
        @Body partnerCustomerCreateRequest: PartnerCustomerCreateRequest?
    ): Call<PartnerCustomerCreateResponse?>?

    /**
     * Enables a Plaid reseller&#39;s end customer in the Production environment.
     * The &#x60;/partner/customer/enable&#x60; endpoint is used by reseller partners to enable an end customer in the Production environment.
     * @param partnerCustomerEnableRequest  (required)
     * @return Call&lt;PartnerCustomerEnableResponse&gt;
     *
     * @see [Enables a Plaid reseller&.39;s end customer in the Production environment. Documentation](/api/partner/.partnercustomerenable)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("partner/customer/enable")
    fun partnerCustomerEnable(
        @Body partnerCustomerEnableRequest: PartnerCustomerEnableRequest?
    ): Call<PartnerCustomerEnableResponse?>?

    /**
     * Returns a Plaid reseller&#39;s end customer.
     * The &#x60;/partner/customer/get&#x60; endpoint is used by reseller partners to retrieve data about a single end customer.
     * @param partnerCustomerGetRequest  (required)
     * @return Call&lt;PartnerCustomerGetResponse&gt;
     *
     * @see [Returns a Plaid reseller&.39;s end customer. Documentation](/api/partner/.partnercustomerget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("partner/customer/get")
    fun partnerCustomerGet(
        @Body partnerCustomerGetRequest: PartnerCustomerGetRequest?
    ): Call<PartnerCustomerGetResponse?>?

    /**
     * Returns OAuth-institution registration information for a given end customer.
     * The &#x60;/partner/customer/oauth_institutions/get&#x60; endpoint is used by reseller partners to retrieve OAuth-institution registration information about a single end customer. To learn how to set up a webhook to listen to status update events, visit the [reseller documentation](https://plaid.com/docs/account/resellers/#enabling-end-customers).
     * @param partnerCustomerOAuthInstitutionsGetRequest  (required)
     * @return Call&lt;PartnerCustomerOAuthInstitutionsGetResponse&gt;
     *
     * @see [Returns OAuth-institution registration information for a given end customer. Documentation](/api/partner/.partnercustomeroauth_institutionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("partner/customer/oauth_institutions/get")
    fun partnerCustomerOauthInstitutionsGet(
        @Body partnerCustomerOAuthInstitutionsGetRequest: PartnerCustomerOAuthInstitutionsGetRequest?
    ): Call<PartnerCustomerOAuthInstitutionsGetResponse?>?

    /**
     * Removes a Plaid reseller&#39;s end customer.
     * The &#x60;/partner/customer/remove&#x60; endpoint is used by reseller partners to remove an end customer. Removing an end customer will remove it from view in the Plaid Dashboard and deactivate its API keys. This endpoint can only be used to remove an end customer that has not yet been enabled in Production.
     * @param partnerCustomerRemoveRequest  (required)
     * @return Call&lt;PartnerCustomerRemoveResponse&gt;
     *
     * @see [Removes a Plaid reseller&.39;s end customer. Documentation](/api/partner/.partnercustomerremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("partner/customer/remove")
    fun partnerCustomerRemove(
        @Body partnerCustomerRemoveRequest: PartnerCustomerRemoveRequest?
    ): Call<PartnerCustomerRemoveResponse?>?

    /**
     * Create payment consent
     * The &#x60;/payment_initiation/consent/create&#x60; endpoint is used to create a payment consent, which can be used to initiate payments on behalf of the user. Payment consents are created with &#x60;UNAUTHORISED&#x60; status by default and must be authorised by the user before payments can be initiated.  Consents can be limited in time and scope, and have constraints that describe limitations for payments.
     * @param paymentInitiationConsentCreateRequest  (required)
     * @return Call&lt;PaymentInitiationConsentCreateResponse&gt;
     *
     * @see [Create payment consent Documentation](/api/products/payment-initiation/.payment_initiationconsentcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/consent/create")
    fun paymentInitiationConsentCreate(
        @Body paymentInitiationConsentCreateRequest: PaymentInitiationConsentCreateRequest?
    ): Call<PaymentInitiationConsentCreateResponse?>?

    /**
     * Get payment consent
     * The &#x60;/payment_initiation/consent/get&#x60; endpoint can be used to check the status of a payment consent, as well as to receive basic information such as recipient and constraints.
     * @param paymentInitiationConsentGetRequest  (required)
     * @return Call&lt;PaymentInitiationConsentGetResponse&gt;
     *
     * @see [Get payment consent Documentation](/api/products/payment-initiation/.payment_initiationconsentget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/consent/get")
    fun paymentInitiationConsentGet(
        @Body paymentInitiationConsentGetRequest: PaymentInitiationConsentGetRequest?
    ): Call<PaymentInitiationConsentGetResponse?>?

    /**
     * Execute a single payment using consent
     * The &#x60;/payment_initiation/consent/payment/execute&#x60; endpoint can be used to execute payments using payment consent.
     * @param paymentInitiationConsentPaymentExecuteRequest  (required)
     * @return Call&lt;PaymentInitiationConsentPaymentExecuteResponse&gt;
     *
     * @see [Execute a single payment using consent Documentation](/api/products/payment-initiation/.payment_initiationconsentpaymentexecute)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/consent/payment/execute")
    fun paymentInitiationConsentPaymentExecute(
        @Body paymentInitiationConsentPaymentExecuteRequest: PaymentInitiationConsentPaymentExecuteRequest?
    ): Call<PaymentInitiationConsentPaymentExecuteResponse?>?

    /**
     * Revoke payment consent
     * The &#x60;/payment_initiation/consent/revoke&#x60; endpoint can be used to revoke the payment consent. Once the consent is revoked, it is not possible to initiate payments using it.
     * @param paymentInitiationConsentRevokeRequest  (required)
     * @return Call&lt;PaymentInitiationConsentRevokeResponse&gt;
     *
     * @see [Revoke payment consent Documentation](/api/products/payment-initiation/.payment_initiationconsentrevoke)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/consent/revoke")
    fun paymentInitiationConsentRevoke(
        @Body paymentInitiationConsentRevokeRequest: PaymentInitiationConsentRevokeRequest?
    ): Call<PaymentInitiationConsentRevokeResponse?>?

    /**
     * Create a payment
     * After creating a payment recipient, you can use the &#x60;/payment_initiation/payment/create&#x60; endpoint to create a payment to that recipient.  Payments can be one-time or standing order (recurring) and can be denominated in either EUR, GBP or other chosen [currency](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-create-request-amount-currency).  If making domestic GBP-denominated payments, your recipient must have been created with BACS numbers. In general, EUR-denominated payments will be sent via SEPA Credit Transfer, GBP-denominated payments will be sent via the Faster Payments network and for non-Eurozone markets typically via the local payment scheme, but the payment network used will be determined by the institution. Payments sent via Faster Payments will typically arrive immediately, while payments sent via SEPA Credit Transfer or other local payment schemes will typically arrive in one business day.  Standing orders (recurring payments) must be denominated in GBP and can only be sent to recipients in the UK. Once created, standing order payments cannot be modified or canceled via the API. An end user can cancel or modify a standing order directly on their banking application or website, or by contacting the bank. Standing orders will follow the payment rules of the underlying rails (Faster Payments in UK). Payments can be sent Monday to Friday, excluding bank holidays. If the pre-arranged date falls on a weekend or bank holiday, the payment is made on the next working day. It is not possible to guarantee the exact time the payment will reach the recipient’s account, although at least 90% of standing order payments are sent by 6am.  In the Development environment, payments must be below 5 GBP or other chosen [currency](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-create-request-amount-currency). For details on any payment limits in Production, contact your Plaid Account Manager.
     * @param paymentInitiationPaymentCreateRequest  (required)
     * @return Call&lt;PaymentInitiationPaymentCreateResponse&gt;
     *
     * @see [Create a payment Documentation](/api/products/payment-initiation/.payment_initiationpaymentcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/payment/create")
    fun paymentInitiationPaymentCreate(
        @Body paymentInitiationPaymentCreateRequest: PaymentInitiationPaymentCreateRequest?
    ): Call<PaymentInitiationPaymentCreateResponse?>?

    /**
     * Get payment details
     * The &#x60;/payment_initiation/payment/get&#x60; endpoint can be used to check the status of a payment, as well as to receive basic information such as recipient and payment amount. In the case of standing orders, the &#x60;/payment_initiation/payment/get&#x60; endpoint will provide information about the status of the overall standing order itself; the API cannot be used to retrieve payment status for individual payments within a standing order.
     * @param paymentInitiationPaymentGetRequest  (required)
     * @return Call&lt;PaymentInitiationPaymentGetResponse&gt;
     *
     * @see [Get payment details Documentation](/api/products/payment-initiation/.payment_initiationpaymentget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/payment/get")
    fun paymentInitiationPaymentGet(
        @Body paymentInitiationPaymentGetRequest: PaymentInitiationPaymentGetRequest?
    ): Call<PaymentInitiationPaymentGetResponse?>?

    /**
     * List payments
     * The &#x60;/payment_initiation/payment/list&#x60; endpoint can be used to retrieve all created payments. By default, the 10 most recent payments are returned. You can request more payments and paginate through the results using the optional &#x60;count&#x60; and &#x60;cursor&#x60; parameters.
     * @param paymentInitiationPaymentListRequest  (required)
     * @return Call&lt;PaymentInitiationPaymentListResponse&gt;
     *
     * @see [List payments Documentation](/api/products/payment-initiation/.payment_initiationpaymentlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/payment/list")
    fun paymentInitiationPaymentList(
        @Body paymentInitiationPaymentListRequest: PaymentInitiationPaymentListRequest?
    ): Call<PaymentInitiationPaymentListResponse?>?

    /**
     * Reverse an existing payment
     * Reverse a settled payment from a Plaid virtual account.  The original payment must be in a settled state to be refunded. To refund partially, specify the amount as part of the request. If the amount is not specified, the refund amount will be equal to all of the remaining payment amount that has not been refunded yet.  The refund will go back to the source account that initiated the payment. The original payment must have been initiated to a Plaid virtual account so that this account can be used to initiate the refund.  Providing counterparty information such as date of birth and address increases  the likelihood of refund being successful without human intervention.
     * @param paymentInitiationPaymentReverseRequest  (required)
     * @return Call&lt;PaymentInitiationPaymentReverseResponse&gt;
     *
     * @see [Reverse an existing payment Documentation](/api/products/payment-initiation/.payment_initiationpaymentreverse)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/payment/reverse")
    fun paymentInitiationPaymentReverse(
        @Body paymentInitiationPaymentReverseRequest: PaymentInitiationPaymentReverseRequest?
    ): Call<PaymentInitiationPaymentReverseResponse?>?

    /**
     * Create payment recipient
     * Create a payment recipient for payment initiation.  The recipient must be in Europe, within a country that is a member of the Single Euro Payment Area (SEPA) or a non-Eurozone country [supported](https://plaid.com/global) by Plaid. For a standing order (recurring) payment, the recipient must be in the UK.  It is recommended to use &#x60;bacs&#x60; in the UK and &#x60;iban&#x60; in EU.  The endpoint is idempotent: if a developer has already made a request with the same payment details, Plaid will return the same &#x60;recipient_id&#x60;.
     * @param paymentInitiationRecipientCreateRequest  (required)
     * @return Call&lt;PaymentInitiationRecipientCreateResponse&gt;
     *
     * @see [Create payment recipient Documentation](/api/products/payment-initiation/.payment_initiationrecipientcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/recipient/create")
    fun paymentInitiationRecipientCreate(
        @Body paymentInitiationRecipientCreateRequest: PaymentInitiationRecipientCreateRequest?
    ): Call<PaymentInitiationRecipientCreateResponse?>?

    /**
     * Get payment recipient
     * Get details about a payment recipient you have previously created.
     * @param paymentInitiationRecipientGetRequest  (required)
     * @return Call&lt;PaymentInitiationRecipientGetResponse&gt;
     *
     * @see [Get payment recipient Documentation](/api/products/payment-initiation/.payment_initiationrecipientget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/recipient/get")
    fun paymentInitiationRecipientGet(
        @Body paymentInitiationRecipientGetRequest: PaymentInitiationRecipientGetRequest?
    ): Call<PaymentInitiationRecipientGetResponse?>?

    /**
     * List payment recipients
     * The &#x60;/payment_initiation/recipient/list&#x60; endpoint list the payment recipients that you have previously created.
     * @param paymentInitiationRecipientListRequest  (required)
     * @return Call&lt;PaymentInitiationRecipientListResponse&gt;
     *
     * @see [List payment recipients Documentation](/api/products/payment-initiation/.payment_initiationrecipientlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_initiation/recipient/list")
    fun paymentInitiationRecipientList(
        @Body paymentInitiationRecipientListRequest: PaymentInitiationRecipientListRequest?
    ): Call<PaymentInitiationRecipientListResponse?>?

    /**
     * Create payment profile
     * Use &#x60;/payment_profile/create&#x60; endpoint to create a new payment profile. To initiate the account linking experience, call &#x60;/link/token/create&#x60; and provide the &#x60;payment_profile_token&#x60; in the &#x60;transfer.payment_profile_token&#x60; field. You can then use the &#x60;payment_profile_token&#x60; when creating transfers using &#x60;/transfer/authorization/create&#x60; and &#x60;/transfer/create&#x60;.
     * @param paymentProfileCreateRequest  (required)
     * @return Call&lt;PaymentProfileCreateResponse&gt;
     * @see [Create payment profile Documentation](/api/products/transfer/.payment_profilecreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_profile/create")
    @Deprecated(
        """ 
    """
    )
    fun paymentProfileCreate(
        @Body paymentProfileCreateRequest: PaymentProfileCreateRequest?
    ): Call<PaymentProfileCreateResponse?>?

    /**
     * Get payment profile
     * Use &#x60;/payment_profile/get&#x60; endpoint to get the status of a given Payment Profile.
     * @param paymentProfileGetRequest  (required)
     * @return Call&lt;PaymentProfileGetResponse&gt;
     * @see [Get payment profile Documentation](/api/products/transfer/.payment_profileget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_profile/get")
    @Deprecated(
        """ 
    """
    )
    fun paymentProfileGet(
        @Body paymentProfileGetRequest: PaymentProfileGetRequest?
    ): Call<PaymentProfileGetResponse?>?

    /**
     * Remove payment profile
     * Use the &#x60;/payment_profile/remove&#x60; endpoint to remove a given Payment Profile. Once it’s removed, it can no longer be used to create transfers.
     * @param paymentProfileRemoveRequest  (required)
     * @return Call&lt;PaymentProfileRemoveResponse&gt;
     * @see [Remove payment profile Documentation](/api/products/transfer/.payment_profileremove)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("payment_profile/remove")
    @Deprecated(
        """ 
    """
    )
    fun paymentProfileRemove(
        @Body paymentProfileRemoveRequest: PaymentProfileRemoveRequest?
    ): Call<PaymentProfileRemoveResponse?>?

    /**
     * Retrieve the account associated with a processor token
     * This endpoint returns the account associated with a given processor token.  This endpoint retrieves cached information, rather than extracting fresh information from the institution. As a result, the account balance returned may not be up-to-date; for realtime balance information, use &#x60;/processor/balance/get&#x60; instead. Note that some information is nullable.
     * @param processorAccountGetRequest  (required)
     * @return Call&lt;ProcessorAccountGetResponse&gt;
     *
     * @see [Retrieve the account associated with a processor token Documentation](/api/processor-partners/.processoraccountget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/account/get")
    fun processorAccountGet(
        @Body processorAccountGetRequest: ProcessorAccountGetRequest?
    ): Call<ProcessorAccountGetResponse?>?

    /**
     * Create Apex bank account token
     * Used to create a token suitable for sending to Apex to enable Plaid-Apex integrations.
     * @param processorApexProcessorTokenCreateRequest  (required)
     * @return Call&lt;ProcessorTokenCreateResponse&gt;
     *
     * @see [Create Apex bank account token Documentation](/none/)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/apex/processor_token/create")
    fun processorApexProcessorTokenCreate(
        @Body processorApexProcessorTokenCreateRequest: ProcessorApexProcessorTokenCreateRequest?
    ): Call<ProcessorTokenCreateResponse?>?

    /**
     * Retrieve Auth data
     * The &#x60;/processor/auth/get&#x60; endpoint returns the bank account and bank identification number (such as the routing number, for US accounts), for a checking or savings account that&#39;&#39;s associated with a given &#x60;processor_token&#x60;. The endpoint also returns high-level account data and balances when available.  Versioning note: API versions 2019-05-29 and earlier use a different schema for the &#x60;numbers&#x60; object returned by this endpoint. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2020-09-14).
     * @param processorAuthGetRequest  (required)
     * @return Call&lt;ProcessorAuthGetResponse&gt;
     *
     * @see [Retrieve Auth data Documentation](/api/processor-partners/.processorauthget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/auth/get")
    fun processorAuthGet(
        @Body processorAuthGetRequest: ProcessorAuthGetRequest?
    ): Call<ProcessorAuthGetResponse?>?

    /**
     * Retrieve Balance data
     * The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/processor/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached.
     * @param processorBalanceGetRequest The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for the account associated with a given &#x60;processor_token&#x60;.  The current balance is the total amount of funds in the account. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account.  Note that not all institutions calculate the available balance. In the event that available balance is unavailable from the institution, Plaid will return an available balance value of &#x60;null&#x60;. (required)
     * @return Call&lt;ProcessorBalanceGetResponse&gt;
     *
     * @see [Retrieve Balance data Documentation](/api/processor-partners/.processorbalanceget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/balance/get")
    fun processorBalanceGet(
        @Body processorBalanceGetRequest: ProcessorBalanceGetRequest?
    ): Call<ProcessorBalanceGetResponse?>?

    /**
     * Create a bank transfer as a processor
     * Use the &#x60;/processor/bank_transfer/create&#x60; endpoint to initiate a new bank transfer as a processor
     * @param processorBankTransferCreateRequest  (required)
     * @return Call&lt;ProcessorBankTransferCreateResponse&gt;
     *
     * @see [Create a bank transfer as a processor Documentation](/api/processor-partners/.bank_transfercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/bank_transfer/create")
    fun processorBankTransferCreate(
        @Body processorBankTransferCreateRequest: ProcessorBankTransferCreateRequest?
    ): Call<ProcessorBankTransferCreateResponse?>?

    /**
     * Retrieve Identity data
     * The &#x60;/processor/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses.
     * @param processorIdentityGetRequest  (required)
     * @return Call&lt;ProcessorIdentityGetResponse&gt;
     *
     * @see [Retrieve Identity data Documentation](/api/processor-partners/.processoridentityget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/identity/get")
    fun processorIdentityGet(
        @Body processorIdentityGetRequest: ProcessorIdentityGetRequest?
    ): Call<ProcessorIdentityGetResponse?>?

    /**
     * Retrieve identity match score
     * The &#x60;/processor/identity/match&#x60; endpoint generates a match score, which indicates how well the provided identity data matches the identity information on file with the account holder&#39;s financial institution.  Fields within the &#x60;balances&#x60; object will always be null when retrieved by &#x60;/identity/match&#x60;. Instead, use the free &#x60;/accounts/get&#x60; endpoint to request balance cached data, or &#x60;/accounts/balance/get&#x60; for real-time data.  This request may take some time to complete if Identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.
     * @param processorIdentityMatchRequest  (required)
     * @return Call&lt;ProcessorIdentityMatchResponse&gt;
     *
     * @see [Retrieve identity match score Documentation](/api/processor-partners/.processoridentitymatch)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/identity/match")
    fun processorIdentityMatch(
        @Body processorIdentityMatchRequest: ProcessorIdentityMatchRequest?
    ): Call<ProcessorIdentityMatchResponse?>?

    /**
     * Retrieve Liabilities data
     * The &#x60;/processor/liabilities/get&#x60; endpoint returns various details about a loan or credit account. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;.  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/processor/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the processor token. This is because Plaid must communicate directly with the institution to retrieve the additional data.
     * @param processorLiabilitiesGetRequest  (required)
     * @return Call&lt;ProcessorLiabilitiesGetResponse&gt;
     *
     * @see [Retrieve Liabilities data Documentation](/api/processor-partners/.processorliabilitiesget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/liabilities/get")
    fun processorLiabilitiesGet(
        @Body processorLiabilitiesGetRequest: ProcessorLiabilitiesGetRequest?
    ): Call<ProcessorLiabilitiesGetResponse?>?

    /**
     * Report whether you initiated an ACH transaction
     * After calling &#x60;/processor/signal/evaluate&#x60;, call &#x60;/processor/signal/decision/report&#x60; to report whether the transaction was initiated.  If you are using the [Plaid Transfer product](https://www.plaid.com/docs/transfer) to create transfers, it is not necessary to use this endpoint, as Plaid already knows whether the transfer was initiated.
     * @param processorSignalDecisionReportRequest  (required)
     * @return Call&lt;ProcessorSignalDecisionReportResponse&gt;
     *
     * @see [Report whether you initiated an ACH transaction Documentation](/api/processor-partners/.processorsignaldecisionreport)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/signal/decision/report")
    fun processorSignalDecisionReport(
        @Body processorSignalDecisionReportRequest: ProcessorSignalDecisionReportRequest?
    ): Call<ProcessorSignalDecisionReportResponse?>?

    /**
     * Evaluate a planned ACH transaction
     * Use &#x60;/processor/signal/evaluate&#x60; to evaluate a planned ACH transaction as a processor to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause. If &#x60;/processor/signal/evaluate&#x60; is called on the same transaction multiple times within a 24-hour period, cached results may be returned. For more information please refer to our error documentation on [item errors](/docs/errors/item/) and [Link in Update Mode](/docs/link/update-mode/).  Note: This request may take some time to complete if Signal is being added to an existing Item. This is because Plaid must communicate directly with the institution when retrieving the data for the first time. To reduce this latency, you can call &#x60;/signal/prepare&#x60; on the Item before you need to request Signal data.
     * @param processorSignalEvaluateRequest  (required)
     * @return Call&lt;ProcessorSignalEvaluateResponse&gt;
     *
     * @see [Evaluate a planned ACH transaction Documentation](/api/processor-partners/.processorsignalevaluate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/signal/evaluate")
    fun processorSignalEvaluate(
        @Body processorSignalEvaluateRequest: ProcessorSignalEvaluateRequest?
    ): Call<ProcessorSignalEvaluateResponse?>?

    /**
     * Opt-in a processor token to Signal
     * When a processor token is not initialized with Signal, call &#x60;/processor/signal/prepare&#x60; to opt-in that processor token to the Signal data collection process, which will improve the accuracy of the Signal score.  If this endpoint is called with a processor token that is already initialized with Signal, it will return a 200 response and will not modify the processor token.
     * @param processorSignalPrepareRequest  (required)
     * @return Call&lt;ProcessorSignalPrepareResponse&gt;
     *
     * @see [Opt-in a processor token to Signal Documentation](/api/processor-partners/.processorsignalprepare)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/signal/prepare")
    fun processorSignalPrepare(
        @Body processorSignalPrepareRequest: ProcessorSignalPrepareRequest?
    ): Call<ProcessorSignalPrepareResponse?>?

    /**
     * Report a return for an ACH transaction
     * Call the &#x60;/processor/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/processor/signal/evaluate&#x60; endpoint. Your feedback will be used by the model to incorporate the latest risk trend in your portfolio.  If you are using the [Plaid Transfer product](https://www.plaid.com/docs/transfer) to create transfers, it is not necessary to use this endpoint, as Plaid already knows whether the transfer was returned.
     * @param processorSignalReturnReportRequest  (required)
     * @return Call&lt;ProcessorSignalReturnReportResponse&gt;
     *
     * @see [Report a return for an ACH transaction Documentation](/api/processor-partners/.processorsignalreturnreport)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/signal/return/report")
    fun processorSignalReturnReport(
        @Body processorSignalReturnReportRequest: ProcessorSignalReturnReportRequest?
    ): Call<ProcessorSignalReturnReportResponse?>?

    /**
     * Create Stripe bank account token
     * Used to create a token suitable for sending to Stripe to enable Plaid-Stripe integrations. For a detailed guide on integrating Stripe, see [Add Stripe to your app](https://plaid.com/docs/auth/partnerships/stripe/).  Note that the Stripe bank account token is a one-time use token. To store bank account information for later use, you can use a Stripe customer object and create an associated bank account from the token, or you can use a Stripe Custom account and create an associated external bank account from the token. This bank account information should work indefinitely, unless the user&#39;s bank account information changes or they revoke Plaid&#39;s permissions to access their account. Stripe bank account information cannot be modified once the bank account token has been created. If you ever need to change the bank account details used by Stripe for a specific customer, have the user go through Link again and create a new bank account token from the new &#x60;access_token&#x60;.  Bank account tokens can also be revoked, using &#x60;/item/remove&#x60;.
     * @param processorStripeBankAccountTokenCreateRequest  (required)
     * @return Call&lt;ProcessorStripeBankAccountTokenCreateResponse&gt;
     *
     * @see [Create Stripe bank account token Documentation](/api/processors/.processorstripebank_account_tokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/stripe/bank_account_token/create")
    fun processorStripeBankAccountTokenCreate(
        @Body processorStripeBankAccountTokenCreateRequest: ProcessorStripeBankAccountTokenCreateRequest?
    ): Call<ProcessorStripeBankAccountTokenCreateResponse?>?

    /**
     * Create processor token
     * Used to create a token suitable for sending to one of Plaid&#39;s partners to enable integrations. Note that Stripe partnerships use bank account tokens instead; see &#x60;/processor/stripe/bank_account_token/create&#x60; for creating tokens for use with Stripe integrations. Once created, a processor token for a given Item cannot be modified or updated. If the account must be linked to a new or different partner resource, create a new Item by having the user go through the Link flow again; a new processor token can then be created from the new &#x60;access_token&#x60;. Processor tokens can also be revoked, using &#x60;/item/remove&#x60;.
     * @param processorTokenCreateRequest  (required)
     * @return Call&lt;ProcessorTokenCreateResponse&gt;
     *
     * @see [Create processor token Documentation](/api/processors/.processortokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/token/create")
    fun processorTokenCreate(
        @Body processorTokenCreateRequest: ProcessorTokenCreateRequest?
    ): Call<ProcessorTokenCreateResponse?>?

    /**
     * Get a processor token&#39;s product permissions
     * Used to get a processor token&#39;s product permissions. The &#x60;products&#x60; field will be an empty list if the processor can access all available products.
     * @param processorTokenPermissionsGetRequest  (required)
     * @return Call&lt;ProcessorTokenPermissionsGetResponse&gt;
     *
     * @see [Get a processor token&.39;s product permissions Documentation](/api/processors/.processortokenpermissionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/token/permissions/get")
    fun processorTokenPermissionsGet(
        @Body processorTokenPermissionsGetRequest: ProcessorTokenPermissionsGetRequest?
    ): Call<ProcessorTokenPermissionsGetResponse?>?

    /**
     * Control a processor&#39;s access to products
     * Used to control a processor&#39;s access to products on the given processor token. By default, a processor will have access to all available products on the corresponding item. To restrict access to a particular set of products, call this endpoint with the desired products. To restore access to all available products, call this endpoint with an empty list. This endpoint can be called multiple times as your needs and your processor&#39;s needs change.
     * @param processorTokenPermissionsSetRequest  (required)
     * @return Call&lt;ProcessorTokenPermissionsSetResponse&gt;
     *
     * @see [Control a processor&.39;s access to products Documentation](/api/processors/.processortokenpermissionsset)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/token/permissions/set")
    fun processorTokenPermissionsSet(
        @Body processorTokenPermissionsSetRequest: ProcessorTokenPermissionsSetRequest?
    ): Call<ProcessorTokenPermissionsSetResponse?>?

    /**
     * Update a processor token&#39;s webhook URL
     * This endpoint allows you, the processor, to update the webhook URL associated with a processor token. This request triggers a &#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60; webhook to the newly specified webhook URL.
     * @param processorTokenWebhookUpdateRequest  (required)
     * @return Call&lt;ProcessorTokenWebhookUpdateResponse&gt;
     *
     * @see [Update a processor token&.39;s webhook URL Documentation](/api/processor-partners/.processortokenwebhookupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/token/webhook/update")
    fun processorTokenWebhookUpdate(
        @Body processorTokenWebhookUpdateRequest: ProcessorTokenWebhookUpdateRequest?
    ): Call<ProcessorTokenWebhookUpdateResponse?>?

    /**
     * Get transaction data
     * The &#x60;/processor/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/processor/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with a processor token, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/processor/transactions/get&#x60; will be the data available for the processor token as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To force Plaid to check for new transactions, you can use the &#x60;/processor/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/processor/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/processor/transactions/get&#x60;, if it wasn&#39;t. If no transaction history is ready when &#x60;/processor/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
     * @param processorTransactionsGetRequest  (required)
     * @return Call&lt;ProcessorTransactionsGetResponse&gt;
     *
     * @see [Get transaction data Documentation](/api/processor-partners/.processortransactionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/transactions/get")
    fun processorTransactionsGet(
        @Body processorTransactionsGetRequest: ProcessorTransactionsGetRequest?
    ): Call<ProcessorTransactionsGetResponse?>?

    /**
     * Fetch recurring transaction streams
     * The &#x60;/processor/transactions/recurring/get&#x60; endpoint allows developers to receive a summary of the recurring outflow and inflow streams (expenses and deposits) from a user’s checking, savings or credit card accounts. Additionally, Plaid provides key insights about each recurring stream including the category, merchant, last amount, and more. Developers can use these insights to build tools and experiences that help their users better manage cash flow, monitor subscriptions, reduce spend, and stay on track with bill payments.  This endpoint is offered as an add-on to Transactions. To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.  This endpoint can only be called on a processor token that has already been initialized with Transactions (either during Link, by specifying it in &#x60;/link/token/create&#x60;; or after Link, by calling &#x60;/processor/transactions/get&#x60; or &#x60;/processor/transactions/sync&#x60;). Once all historical transactions have been fetched, call &#x60;/processor/transactions/recurring/get&#x60; to receive the Recurring Transactions streams and subscribe to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook. To know when historical transactions have been fetched, if you are using &#x60;/processor/transactions/sync&#x60; listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#SyncUpdatesAvailableWebhook-historical-update-complete) webhook and check that the &#x60;historical_update_complete&#x60; field in the payload is &#x60;true&#x60;. If using &#x60;/processor/transactions/get&#x60;, listen for the [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhook.  After the initial call, you can call &#x60;/processor/transactions/recurring/get&#x60; endpoint at any point in the future to retrieve the latest summary of recurring streams. Listen to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook to be notified when new updates are available.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
     * @param processorTransactionsRecurringGetRequest  (required)
     * @return Call&lt;ProcessorTransactionsRecurringGetResponse&gt;
     *
     * @see [Fetch recurring transaction streams Documentation](/api/processor-partners/.processortransactionsrecurringget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/transactions/recurring/get")
    fun processorTransactionsRecurringGet(
        @Body processorTransactionsRecurringGetRequest: ProcessorTransactionsRecurringGetRequest?
    ): Call<ProcessorTransactionsRecurringGetResponse?>?

    /**
     * Refresh transaction data
     * &#x60;/processor/transactions/refresh&#x60; is an optional endpoint for users of the Transactions product. It initiates an on-demand extraction to fetch the newest transactions for a processor token. This on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Transactions-enabled processor token. If changes to transactions are discovered after calling &#x60;/processor/transactions/refresh&#x60;, Plaid will fire a webhook: for &#x60;/transactions/sync&#x60; users, [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) will be fired if there are any transactions updated, added, or removed. For users of both &#x60;/processor/transactions/sync&#x60; and &#x60;/processor/transactions/get&#x60;, [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/products/transactions/#transactions_removed) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/processor/transactions/get&#x60; or &#x60;/processor/transactions/sync&#x60;. Note that the &#x60;/processor/transactions/refresh&#x60; endpoint is not supported for Capital One (&#x60;ins_128026&#x60;) and will result in a &#x60;PRODUCTS_NOT_SUPPORTED&#x60; error if called on a processor token from that institution.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/processor/transactions/refresh&#x60; is offered as an add-on to Transactions and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
     * @param processorTransactionsRefreshRequest  (required)
     * @return Call&lt;ProcessorTransactionsRefreshResponse&gt;
     *
     * @see [Refresh transaction data Documentation](/api/processor-partners/.processortransactionsrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/transactions/refresh")
    fun processorTransactionsRefresh(
        @Body processorTransactionsRefreshRequest: ProcessorTransactionsRefreshRequest?
    ): Call<ProcessorTransactionsRefreshResponse?>?

    /**
     * Get incremental transaction updates on a processor token
     * This endpoint replaces &#x60;/processor/transactions/get&#x60; and its associated webhooks for most common use-cases.  The &#x60;/processor/transactions/sync&#x60; endpoint allows developers to subscribe to all transactions associated with a processor token and get updates synchronously in a stream-like manner, using a cursor to track which updates have already been seen. &#x60;/processor/transactions/sync&#x60; provides the same functionality as &#x60;/processor/transactions/get&#x60; and can be used instead of &#x60;/processor/transactions/get&#x60; to simplify the process of tracking transactions updates.  This endpoint provides user-authorized transaction data for &#x60;credit&#x60;, &#x60;depository&#x60;, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from &#x60;investments&#x60; accounts, use &#x60;/investments/transactions/get&#x60; instead.  Returned transactions data is grouped into three types of update, indicating whether the transaction was added, removed, or modified since the last call to the API.  In the first call to &#x60;/processor/transactions/sync&#x60; for a processor token, the endpoint will return all historical transactions data associated with that processor token up until the time of the API call (as \&quot;adds\&quot;), which then generates a &#x60;next_cursor&#x60; for that processor token. In subsequent calls, send the &#x60;next_cursor&#x60; to receive only the changes that have occurred since the previous call.  Due to the potentially large number of transactions associated with a processor token, results are paginated. The &#x60;has_more&#x60; field specifies if additional calls are necessary to fetch all available transaction updates. Call &#x60;/processor/transactions/sync&#x60; with the new cursor, pulling all updates, until &#x60;has_more&#x60; is &#x60;false&#x60;.  When retrieving paginated updates, track both the &#x60;next_cursor&#x60; from the latest response and the original cursor from the first call in which &#x60;has_more&#x60; was &#x60;true&#x60;; if a call to &#x60;/processor/transactions/sync&#x60; fails when retrieving a paginated update, which can occur as a result of the [&#x60;TRANSACTIONS_SYNC_MUTATION_DURING_PAGINATION&#x60;](https://plaid.com/docs/errors/transactions/#transactions_sync_mutation_during_pagination) error, the entire pagination request loop must be restarted beginning with the cursor for the first page of the update, rather than retrying only the single request that failed.  Whenever new or updated transaction data becomes available, &#x60;/processor/transactions/sync&#x60; will provide these updates. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To force Plaid to check for new transactions, use the &#x60;/processor/transactions/refresh&#x60; endpoint.  Note that for newly created processor tokens, data may not be immediately available to &#x60;/processor/transactions/sync&#x60;. Plaid begins preparing transactions data when the corresponding Item is created, but the process can take anywhere from a few seconds to several minutes to complete, depending on the number of transactions available.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
     * @param processorTransactionsSyncRequest  (required)
     * @return Call&lt;ProcessorTransactionsSyncResponse&gt;
     *
     * @see [Get incremental transaction updates on a processor token Documentation](/api/processor-partners/.processortransactionssync)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("processor/transactions/sync")
    fun processorTransactionsSync(
        @Body processorTransactionsSyncRequest: ProcessorTransactionsSyncRequest?
    ): Call<ProcessorTransactionsSyncResponse?>?

    /**
     * Retrieve a Profile
     * Returns user permissioned profile data including identity and item access tokens.
     * @param profileGetRequest  (required)
     * @return Call&lt;ProfileGetResponse&gt;
     *
     * @see [Retrieve a Profile Documentation](/api/profile/.profileget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("profile/get")
    fun profileGet(
        @Body profileGetRequest: ProfileGetRequest?
    ): Call<ProfileGetResponse?>?

    /**
     * Manually fire a bank income webhook in sandbox
     * Use the &#x60;/sandbox/bank_income/fire_webhook&#x60; endpoint to manually trigger a Bank Income webhook in the Sandbox environment.
     * @param sandboxBankIncomeFireWebhookRequest  (required)
     * @return Call&lt;SandboxBankIncomeFireWebhookResponse&gt;
     *
     * @see [Manually fire a bank income webhook in sandbox Documentation](/api/sandbox/.sandboxbankincomefire_webhook)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/bank_income/fire_webhook")
    fun sandboxBankIncomeFireWebhook(
        @Body sandboxBankIncomeFireWebhookRequest: SandboxBankIncomeFireWebhookRequest?
    ): Call<SandboxBankIncomeFireWebhookResponse?>?

    /**
     * Manually fire a Bank Transfer webhook
     * Use the &#x60;/sandbox/bank_transfer/fire_webhook&#x60; endpoint to manually trigger a Bank Transfers webhook in the Sandbox environment.
     * @param sandboxBankTransferFireWebhookRequest  (required)
     * @return Call&lt;SandboxBankTransferFireWebhookResponse&gt;
     *
     * @see [Manually fire a Bank Transfer webhook Documentation](/bank-transfers/reference/.sandboxbank_transferfire_webhook)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/bank_transfer/fire_webhook")
    fun sandboxBankTransferFireWebhook(
        @Body sandboxBankTransferFireWebhookRequest: SandboxBankTransferFireWebhookRequest?
    ): Call<SandboxBankTransferFireWebhookResponse?>?

    /**
     * Simulate a bank transfer event in Sandbox
     * Use the &#x60;/sandbox/bank_transfer/simulate&#x60; endpoint to simulate a bank transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/bank_transfer/event/sync&#x60; or &#x60;/bank_transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
     * @param sandboxBankTransferSimulateRequest  (required)
     * @return Call&lt;SandboxBankTransferSimulateResponse&gt;
     *
     * @see [Simulate a bank transfer event in Sandbox Documentation](/bank-transfers/reference/.sandboxbank_transfersimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/bank_transfer/simulate")
    fun sandboxBankTransferSimulate(
        @Body sandboxBankTransferSimulateRequest: SandboxBankTransferSimulateRequest?
    ): Call<SandboxBankTransferSimulateResponse?>?

    /**
     * Manually fire an Income webhook
     * Use the &#x60;/sandbox/income/fire_webhook&#x60; endpoint to manually trigger a Payroll or Document Income webhook in the Sandbox environment.
     * @param sandboxIncomeFireWebhookRequest  (required)
     * @return Call&lt;SandboxIncomeFireWebhookResponse&gt;
     *
     * @see [Manually fire an Income webhook Documentation](/api/sandbox/.sandboxincomefire_webhook)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/income/fire_webhook")
    fun sandboxIncomeFireWebhook(
        @Body sandboxIncomeFireWebhookRequest: SandboxIncomeFireWebhookRequest?
    ): Call<SandboxIncomeFireWebhookResponse?>?

    /**
     * Fire a test webhook
     * The &#x60;/sandbox/item/fire_webhook&#x60; endpoint is used to test that code correctly handles webhooks. This endpoint can trigger the following webhooks:  &#x60;DEFAULT_UPDATE&#x60;: Transactions update webhook to be fired for a given Sandbox Item. If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;NEW_ACCOUNTS_AVAILABLE&#x60;: Webhook to be fired for a given Sandbox Item created with Account Select v2.  &#x60;AUTH_DATA_UPDATE&#x60;: Webhook to be fired for a given Sandbox Item created with Auth as an enabled product.  &#x60;SMS_MICRODEPOSITS_VERIFICATION&#x60;: Fired when a given same day micro-deposit item is verified via SMS verification.  &#x60;LOGIN_REPAIRED&#x60;: Fired when an Item recovers from the &#x60;ITEM_LOGIN_REQUIRED&#x60; without the user going through update mode in your app.  &#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;: Recurring Transactions webhook to be fired for a given Sandbox Item. If the Item does not support Recurring Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;SYNC_UPDATES_AVAILABLE&#x60;: Transactions webhook to be fired for a given Sandbox Item.  If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;PRODUCT_READY&#x60;: Assets webhook to be fired when a given asset report has been successfully generated. If the Item does not support Assets, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;ERROR&#x60;: Assets webhook to be fired when asset report generation has failed. If the Item does not support Assets, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  Note that this endpoint is provided for developer ease-of-use and is not required for testing webhooks; webhooks will also fire in Sandbox under the same conditions that they would in Production or Development (except for webhooks of type &#x60;TRANSFER&#x60;).
     * @param sandboxItemFireWebhookRequest  (required)
     * @return Call&lt;SandboxItemFireWebhookResponse&gt;
     *
     * @see [Fire a test webhook Documentation](/api/sandbox/.sandboxitemfire_webhook)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/item/fire_webhook")
    fun sandboxItemFireWebhook(
        @Body sandboxItemFireWebhookRequest: SandboxItemFireWebhookRequest?
    ): Call<SandboxItemFireWebhookResponse?>?

    /**
     * Force a Sandbox Item into an error state
     * &#x60;/sandbox/item/reset_login/&#x60; forces an Item into an &#x60;ITEM_LOGIN_REQUIRED&#x60; state in order to simulate an Item whose login is no longer valid. This makes it easy to test Link&#39;s [update mode](https://plaid.com/docs/link/update-mode) flow in the Sandbox environment.  After calling &#x60;/sandbox/item/reset_login&#x60;, You can then use Plaid Link update mode to restore the Item to a good state. An &#x60;ITEM_LOGIN_REQUIRED&#x60; webhook will also be fired after a call to this endpoint, if one is associated with the Item.   In the Sandbox, Items will transition to an &#x60;ITEM_LOGIN_REQUIRED&#x60; error state automatically after 30 days, even if this endpoint is not called.
     * @param sandboxItemResetLoginRequest  (required)
     * @return Call&lt;SandboxItemResetLoginResponse&gt;
     *
     * @see [Force a Sandbox Item into an error state Documentation](/api/sandbox/.sandboxitemreset_login)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/item/reset_login")
    fun sandboxItemResetLogin(
        @Body sandboxItemResetLoginRequest: SandboxItemResetLoginRequest?
    ): Call<SandboxItemResetLoginResponse?>?

    /**
     * Set verification status for Sandbox account
     * The &#x60;/sandbox/item/set_verification_status&#x60; endpoint can be used to change the verification status of an Item in in the Sandbox in order to simulate the Automated Micro-deposit flow.  For more information on testing Automated Micro-deposits in Sandbox, see [Auth full coverage testing](https://plaid.com/docs/auth/coverage/testing#).
     * @param sandboxItemSetVerificationStatusRequest  (required)
     * @return Call&lt;SandboxItemSetVerificationStatusResponse&gt;
     *
     * @see [Set verification status for Sandbox account Documentation](/api/sandbox/.sandboxitemset_verification_status)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/item/set_verification_status")
    fun sandboxItemSetVerificationStatus(
        @Body sandboxItemSetVerificationStatusRequest: SandboxItemSetVerificationStatusRequest?
    ): Call<SandboxItemSetVerificationStatusResponse?>?

    /**
     * Save the selected accounts when connecting to the Platypus Oauth institution
     * Save the selected accounts when connecting to the Platypus Oauth institution
     * @param sandboxOauthSelectAccountsRequest  (required)
     * @return Call&lt;Object&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/oauth/select_accounts")
    fun sandboxOauthSelectAccounts(
        @Body sandboxOauthSelectAccountsRequest: SandboxOauthSelectAccountsRequest?
    ): Call<Any?>?

    /**
     * Reset the login of a Payment Profile
     * &#x60;/sandbox/payment_profile/reset_login/&#x60; forces a Payment Profile into a state where the login is no longer valid. This makes it easy to test update mode for Payment Profile in the Sandbox environment.   After calling &#x60;/sandbox/payment_profile/reset_login&#x60;, calls to the &#x60;/transfer/authorization/create&#x60; with the Payment Profile will result in a &#x60;decision_rationale&#x60; &#x60;PAYMENT_PROFILE_LOGIN_REQUIRED&#x60;. You can then use update mode for Payment Profile to restore it into a good state.   In order to invoke this endpoint, you must first [create a Payment Profile](https://plaid.com/docs/transfer/add-to-app/#create-a-payment-profile-optional) and [go through the Link flow](https://plaid.com/docs/transfer/add-to-app/#create-a-link-token).
     * @param sandboxPaymentProfileResetLoginRequest  (required)
     * @return Call&lt;SandboxPaymentProfileResetLoginResponse&gt;
     * @see [Reset the login of a Payment Profile Documentation](/api/sandbox/.sandboxpayment_profilereset_login)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/payment_profile/reset_login")
    @Deprecated(
        """ 
    """
    )
    fun sandboxPaymentProfileResetLogin(
        @Body sandboxPaymentProfileResetLoginRequest: SandboxPaymentProfileResetLoginRequest?
    ): Call<SandboxPaymentProfileResetLoginResponse?>?

    /**
     * Create a test Item and processor token
     * Use the &#x60;/sandbox/processor_token/create&#x60; endpoint to create a valid &#x60;processor_token&#x60; for an arbitrary institution ID and test credentials. The created &#x60;processor_token&#x60; corresponds to a new Sandbox Item. You can then use this &#x60;processor_token&#x60; with the &#x60;/processor/&#x60; API endpoints in Sandbox. You can also use &#x60;/sandbox/processor_token/create&#x60; with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data.
     * @param sandboxProcessorTokenCreateRequest  (required)
     * @return Call&lt;SandboxProcessorTokenCreateResponse&gt;
     *
     * @see [Create a test Item and processor token Documentation](/api/sandbox/.sandboxprocessor_tokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/processor_token/create")
    fun sandboxProcessorTokenCreate(
        @Body sandboxProcessorTokenCreateRequest: SandboxProcessorTokenCreateRequest?
    ): Call<SandboxProcessorTokenCreateResponse?>?

    /**
     * Create a test Item
     * Use the &#x60;/sandbox/public_token/create&#x60; endpoint to create a valid &#x60;public_token&#x60;  for an arbitrary institution ID, initial products, and test credentials. The created &#x60;public_token&#x60; maps to a new Sandbox Item. You can then call &#x60;/item/public_token/exchange&#x60; to exchange the &#x60;public_token&#x60; for an &#x60;access_token&#x60; and perform all API actions. &#x60;/sandbox/public_token/create&#x60; can also be used with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data. &#x60;/sandbox/public_token/create&#x60; cannot be used with OAuth institutions.
     * @param sandboxPublicTokenCreateRequest  (required)
     * @return Call&lt;SandboxPublicTokenCreateResponse&gt;
     *
     * @see [Create a test Item Documentation](/api/sandbox/.sandboxpublic_tokencreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/public_token/create")
    fun sandboxPublicTokenCreate(
        @Body sandboxPublicTokenCreateRequest: SandboxPublicTokenCreateRequest?
    ): Call<SandboxPublicTokenCreateResponse?>?

    /**
     * Manually fire a Transfer webhook
     * Use the &#x60;/sandbox/transfer/fire_webhook&#x60; endpoint to manually trigger a &#x60;TRANSFER_EVENTS_UPDATE&#x60; webhook in the Sandbox environment.
     * @param sandboxTransferFireWebhookRequest  (required)
     * @return Call&lt;SandboxTransferFireWebhookResponse&gt;
     *
     * @see [Manually fire a Transfer webhook Documentation](/api/sandbox/.sandboxtransferfire_webhook)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/fire_webhook")
    fun sandboxTransferFireWebhook(
        @Body sandboxTransferFireWebhookRequest: SandboxTransferFireWebhookRequest?
    ): Call<SandboxTransferFireWebhookResponse?>?

    /**
     * Simulate a ledger deposit event in Sandbox
     * Use the &#x60;/sandbox/transfer/ledger/deposit/simulate&#x60; endpoint to simulate a ledger deposit event in the Sandbox environment.
     * @param sandboxTransferLedgerDepositSimulateRequest  (required)
     * @return Call&lt;SandboxTransferLedgerDepositSimulateResponse&gt;
     *
     * @see [Simulate a ledger deposit event in Sandbox Documentation](/api/sandbox/.sandboxtransferledgerdepositsimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/ledger/deposit/simulate")
    fun sandboxTransferLedgerDepositSimulate(
        @Body sandboxTransferLedgerDepositSimulateRequest: SandboxTransferLedgerDepositSimulateRequest?
    ): Call<SandboxTransferLedgerDepositSimulateResponse?>?

    /**
     * Simulate converting pending balance to available balance
     * Use the &#x60;/sandbox/transfer/ledger/simulate_available&#x60; endpoint to simulate converting pending balance to available balance for all originators in the Sandbox environment.
     * @param sandboxTransferLedgerSimulateAvailableRequest  (required)
     * @return Call&lt;SandboxTransferLedgerSimulateAvailableResponse&gt;
     *
     * @see [Simulate converting pending balance to available balance Documentation](/api/sandbox/.sandboxtransferledgersimulate_available)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/ledger/simulate_available")
    fun sandboxTransferLedgerSimulateAvailable(
        @Body sandboxTransferLedgerSimulateAvailableRequest: SandboxTransferLedgerSimulateAvailableRequest?
    ): Call<SandboxTransferLedgerSimulateAvailableResponse?>?

    /**
     * Simulate a ledger withdraw event in Sandbox
     * Use the &#x60;/sandbox/transfer/ledger/withdraw/simulate&#x60; endpoint to simulate a ledger withdraw event in the Sandbox environment.
     * @param sandboxTransferLedgerWithdrawSimulateRequest  (required)
     * @return Call&lt;SandboxTransferLedgerWithdrawSimulateResponse&gt;
     *
     * @see [Simulate a ledger withdraw event in Sandbox Documentation](/api/sandbox/.sandboxtransferledgerwithdrawsimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/ledger/withdraw/simulate")
    fun sandboxTransferLedgerWithdrawSimulate(
        @Body sandboxTransferLedgerWithdrawSimulateRequest: SandboxTransferLedgerWithdrawSimulateRequest?
    ): Call<SandboxTransferLedgerWithdrawSimulateResponse?>?

    /**
     * Simulate a refund event in Sandbox
     * Use the &#x60;/sandbox/transfer/refund/simulate&#x60; endpoint to simulate a refund event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/transfer/event/sync&#x60; or &#x60;/transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
     * @param sandboxTransferRefundSimulateRequest  (required)
     * @return Call&lt;SandboxTransferRefundSimulateResponse&gt;
     *
     * @see [Simulate a refund event in Sandbox Documentation](/api/sandbox/.sandboxtransferrefundsimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/refund/simulate")
    fun sandboxTransferRefundSimulate(
        @Body sandboxTransferRefundSimulateRequest: SandboxTransferRefundSimulateRequest?
    ): Call<SandboxTransferRefundSimulateResponse?>?

    /**
     * Trigger the creation of a repayment
     * Use the &#x60;/sandbox/transfer/repayment/simulate&#x60; endpoint to trigger the creation of a repayment. As a side effect of calling this route, a repayment is created that includes all unreimbursed returns of guaranteed transfers. If there are no such returns, an 400 error is returned.
     * @param sandboxTransferRepaymentSimulateRequest  (required)
     * @return Call&lt;SandboxTransferRepaymentSimulateResponse&gt;
     *
     * @see [Trigger the creation of a repayment Documentation](/api/sandbox/.sandboxtransferrepaymentsimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/repayment/simulate")
    fun sandboxTransferRepaymentSimulate(
        @Body sandboxTransferRepaymentSimulateRequest: SandboxTransferRepaymentSimulateRequest?
    ): Call<SandboxTransferRepaymentSimulateResponse?>?

    /**
     * Simulate a transfer event in Sandbox
     * Use the &#x60;/sandbox/transfer/simulate&#x60; endpoint to simulate a transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/transfer/event/sync&#x60; or &#x60;/transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
     * @param sandboxTransferSimulateRequest  (required)
     * @return Call&lt;SandboxTransferSimulateResponse&gt;
     *
     * @see [Simulate a transfer event in Sandbox Documentation](/api/sandbox/.sandboxtransfersimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/simulate")
    fun sandboxTransferSimulate(
        @Body sandboxTransferSimulateRequest: SandboxTransferSimulateRequest?
    ): Call<SandboxTransferSimulateResponse?>?

    /**
     * Simulate creating a sweep
     * Use the &#x60;/sandbox/transfer/sweep/simulate&#x60; endpoint to create a sweep and associated events in the Sandbox environment. Upon calling this endpoint, all transfers with a sweep status of &#x60;swept&#x60; will become &#x60;swept_settled&#x60;, all &#x60;posted&#x60; or &#x60;pending&#x60; transfers with a sweep status of &#x60;unswept&#x60; will become &#x60;swept&#x60;, and all &#x60;returned&#x60; transfers with a sweep status of &#x60;swept&#x60; will become &#x60;return_swept&#x60;.
     * @param sandboxTransferSweepSimulateRequest  (required)
     * @return Call&lt;SandboxTransferSweepSimulateResponse&gt;
     *
     * @see [Simulate creating a sweep Documentation](/api/sandbox/.sandboxtransfersweepsimulate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/sweep/simulate")
    fun sandboxTransferSweepSimulate(
        @Body sandboxTransferSweepSimulateRequest: SandboxTransferSweepSimulateRequest?
    ): Call<SandboxTransferSweepSimulateResponse?>?

    /**
     * Advance a test clock
     * Use the &#x60;/sandbox/transfer/test_clock/advance&#x60; endpoint to advance a &#x60;test_clock&#x60; in the Sandbox environment.  A test clock object represents an independent timeline and has a &#x60;virtual_time&#x60; field indicating the current timestamp of the timeline. A test clock can be advanced by incrementing &#x60;virtual_time&#x60;, but may never go back to a lower &#x60;virtual_time&#x60;.  If a test clock is advanced, we will simulate the changes that ought to occur during the time that elapsed.  For example, a client creates a weekly recurring transfer with a test clock set at t. When the client advances the test clock by setting &#x60;virtual_time&#x60; &#x3D; t + 15 days, 2 new originations should be created, along with the webhook events.  The advancement of the test clock from its current &#x60;virtual_time&#x60; should be limited such that there are no more than 20 originations resulting from the advance operation on each &#x60;recurring_transfer&#x60; associated with the &#x60;test_clock&#x60;.  For example, if the recurring transfer associated with this test clock originates once every 4 weeks, you can advance the &#x60;virtual_time&#x60; up to 80 weeks on each API call.
     * @param sandboxTransferTestClockAdvanceRequest  (required)
     * @return Call&lt;SandboxTransferTestClockAdvanceResponse&gt;
     *
     * @see [Advance a test clock Documentation](/api/sandbox/.sandboxtransfertest_clockadvance)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/test_clock/advance")
    fun sandboxTransferTestClockAdvance(
        @Body sandboxTransferTestClockAdvanceRequest: SandboxTransferTestClockAdvanceRequest?
    ): Call<SandboxTransferTestClockAdvanceResponse?>?

    /**
     * Create a test clock
     * Use the &#x60;/sandbox/transfer/test_clock/create&#x60; endpoint to create a &#x60;test_clock&#x60; in the Sandbox environment.  A test clock object represents an independent timeline and has a &#x60;virtual_time&#x60; field indicating the current timestamp of the timeline. Test clocks are used for testing recurring transfers in Sandbox.  A test clock can be associated with up to 5 recurring transfers.
     * @param sandboxTransferTestClockCreateRequest  (required)
     * @return Call&lt;SandboxTransferTestClockCreateResponse&gt;
     *
     * @see [Create a test clock Documentation](/api/sandbox/.sandboxtransfertest_clockcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/test_clock/create")
    fun sandboxTransferTestClockCreate(
        @Body sandboxTransferTestClockCreateRequest: SandboxTransferTestClockCreateRequest?
    ): Call<SandboxTransferTestClockCreateResponse?>?

    /**
     * Get a test clock
     * Use the &#x60;/sandbox/transfer/test_clock/get&#x60; endpoint to get a &#x60;test_clock&#x60; in the Sandbox environment.
     * @param sandboxTransferTestClockGetRequest  (required)
     * @return Call&lt;SandboxTransferTestClockGetResponse&gt;
     *
     * @see [Get a test clock Documentation](/api/sandbox/.sandboxtransfertest_clockget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/test_clock/get")
    fun sandboxTransferTestClockGet(
        @Body sandboxTransferTestClockGetRequest: SandboxTransferTestClockGetRequest?
    ): Call<SandboxTransferTestClockGetResponse?>?

    /**
     * List test clocks
     * Use the &#x60;/sandbox/transfer/test_clock/list&#x60; endpoint to see a list of all your test clocks in the Sandbox environment, by ascending &#x60;virtual_time&#x60;. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired test clocks.
     * @param sandboxTransferTestClockListRequest  (required)
     * @return Call&lt;SandboxTransferTestClockListResponse&gt;
     *
     * @see [List test clocks Documentation](/api/sandbox/.sandboxtransfertest_clocklist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("sandbox/transfer/test_clock/list")
    fun sandboxTransferTestClockList(
        @Body sandboxTransferTestClockListRequest: SandboxTransferTestClockListRequest?
    ): Call<SandboxTransferTestClockListResponse?>?

    /**
     * Report whether you initiated an ACH transaction
     * After calling &#x60;/signal/evaluate&#x60;, call &#x60;/signal/decision/report&#x60; to report whether the transaction was initiated.
     * @param signalDecisionReportRequest  (required)
     * @return Call&lt;SignalDecisionReportResponse&gt;
     *
     * @see [Report whether you initiated an ACH transaction Documentation](/api/products/signal.signaldecisionreport)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("signal/decision/report")
    fun signalDecisionReport(
        @Body signalDecisionReportRequest: SignalDecisionReportRequest?
    ): Call<SignalDecisionReportResponse?>?

    /**
     * Evaluate a planned ACH transaction
     * Use &#x60;/signal/evaluate&#x60; to evaluate a planned ACH transaction to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause. If &#x60;/signal/evaluate&#x60; is called on the same transaction multiple times within a 24-hour period, cached results may be returned. For more information please refer to the error documentation on [Item errors](/docs/errors/item/) and [Link in Update Mode](/docs/link/update-mode/).  Note: This request may take some time to complete if Signal is being added to an existing Item. This is because Plaid must communicate directly with the institution when retrieving the data for the first time.
     * @param signalEvaluateRequest  (required)
     * @return Call&lt;SignalEvaluateResponse&gt;
     *
     * @see [Evaluate a planned ACH transaction Documentation](/api/products/signal.signalevaluate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("signal/evaluate")
    fun signalEvaluate(
        @Body signalEvaluateRequest: SignalEvaluateRequest?
    ): Call<SignalEvaluateResponse?>?

    /**
     * Opt-in an Item to Signal
     * When Link is not initialized with Signal, call &#x60;/signal/prepare&#x60; to opt-in that Item to the Signal data collection process, developing a Signal score.  If run on an Item that is already initialized with Signal, this endpoint will return a 200 response and will not modify the Item.
     * @param signalPrepareRequest  (required)
     * @return Call&lt;SignalPrepareResponse&gt;
     *
     * @see [Opt-in an Item to Signal Documentation](/api/products/signal.signalprepare)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("signal/prepare")
    fun signalPrepare(
        @Body signalPrepareRequest: SignalPrepareRequest?
    ): Call<SignalPrepareResponse?>?

    /**
     * Report a return for an ACH transaction
     * Call the &#x60;/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/signal/evaluate&#x60; endpoint. Your feedback will be used by the model to incorporate the latest risk trend in your portfolio.
     * @param signalReturnReportRequest  (required)
     * @return Call&lt;SignalReturnReportResponse&gt;
     *
     * @see [Report a return for an ACH transaction Documentation](/api/products/signal.signalreturnreport)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("signal/return/report")
    fun signalReturnReport(
        @Body signalReturnReportRequest: SignalReturnReportRequest?
    ): Call<SignalReturnReportResponse?>?

    /**
     * Retrieve a single statement.
     * The &#x60;/statements/download&#x60; endpoint retrieves a single statement PDF in binary format.  The response will contain a &#x60;Plaid-Content-Hash&#x60; header containing a SHA 256 checksum of the statement. This can be used to verify that the file being sent by Plaid is the same file that was downloaded to your system.
     * @param statementsDownloadRequest  (required)
     * @return Call&lt;ResponseBody&gt;
     *
     * @see [Retrieve a single statement. Documentation](/api/products/statements.statementsdownload)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("statements/download")
    fun statementsDownload(
        @Body statementsDownloadRequest: StatementsDownloadRequest?
    ): Call<ResponseBody?>?

    /**
     * Retrieve a list of all statements associated with an item.
     * The &#x60;/statements/list&#x60; endpoint retrieves a list of all statements associated with an item.
     * @param statementsListRequest  (required)
     * @return Call&lt;StatementsListResponse&gt;
     *
     * @see [Retrieve a list of all statements associated with an item. Documentation](/api/products/statements.statementslist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("statements/list")
    fun statementsList(
        @Body statementsListRequest: StatementsListRequest?
    ): Call<StatementsListResponse?>?

    /**
     * Refresh statements data.
     * &#x60;/statements/refresh&#x60; initiates an on-demand extraction to fetch the statements for the provided dates.
     * @param statementsRefreshRequest  (required)
     * @return Call&lt;StatementsRefreshResponse&gt;
     *
     * @see [Refresh statements data. Documentation](/api/products/statements.statementsrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("statements/refresh")
    fun statementsRefresh(
        @Body statementsRefreshRequest: StatementsRefreshRequest?
    ): Call<StatementsRefreshResponse?>?

    /**
     * enhance locally-held transaction data
     * The &#x60;/beta/transactions/v1/enhance&#x60; endpoint enriches raw transaction data provided directly by clients.  The product is currently in beta.
     * @param transactionsEnhanceGetRequest  (required)
     * @return Call&lt;TransactionsEnhanceGetResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/transactions/v1/enhance")
    fun transactionsEnhance(
        @Body transactionsEnhanceGetRequest: TransactionsEnhanceGetRequest?
    ): Call<TransactionsEnhanceGetResponse?>?

    /**
     * Enrich locally-held transaction data
     * The &#x60;/transactions/enrich&#x60; endpoint enriches raw transaction data generated by your own banking products or retrieved from other non-Plaid sources.
     * @param transactionsEnrichRequest  (required)
     * @return Call&lt;TransactionsEnrichResponse&gt;
     *
     * @see [Enrich locally-held transaction data Documentation](/api/products/enrich/.transactionsenrich)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transactions/enrich")
    fun transactionsEnrich(
        @Body transactionsEnrichRequest: TransactionsEnrichRequest?
    ): Call<TransactionsEnrichResponse?>?

    /**
     * Get transaction data
     * Note: All new implementations are encouraged to use &#x60;/transactions/sync&#x60; rather than &#x60;/transactions/get&#x60;. &#x60;/transactions/sync&#x60; provides the same functionality as &#x60;/transactions/get&#x60; and improves developer ease-of-use for handling transactions updates.  The &#x60;/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from investments accounts, use the [Investments endpoint](https://plaid.com/docs/api/products/investments/) instead. Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with an Item, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/transactions/get&#x60; will be the data available for the Item as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To find out when the Item was last updated, use the [Item Debugger](https://plaid.com/docs/account/activity/#troubleshooting-with-item-debugger) or call &#x60;/item/get&#x60;; the &#x60;item.status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, you can use the &#x60;/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/transactions/get&#x60;, if it wasn&#39;t. To be alerted when transaction data is ready to be fetched, listen for the [&#x60;INITIAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#initial_update) and [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhooks. If no transaction history is ready when &#x60;/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
     * @param transactionsGetRequest  (required)
     * @return Call&lt;TransactionsGetResponse&gt;
     *
     * @see [Get transaction data Documentation](/api/products/transactions/.transactionsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transactions/get")
    fun transactionsGet(
        @Body transactionsGetRequest: TransactionsGetRequest?
    ): Call<TransactionsGetResponse?>?

    /**
     * Fetch recurring transaction streams
     * The &#x60;/transactions/recurring/get&#x60; endpoint allows developers to receive a summary of the recurring outflow and inflow streams (expenses and deposits) from a user’s checking, savings or credit card accounts. Additionally, Plaid provides key insights about each recurring stream including the category, merchant, last amount, and more. Developers can use these insights to build tools and experiences that help their users better manage cash flow, monitor subscriptions, reduce spend, and stay on track with bill payments.  This endpoint is offered as an add-on to Transactions. To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.  This endpoint can only be called on an Item that has already been initialized with Transactions (either during Link, by specifying it in &#x60;/link/token/create&#x60;; or after Link, by calling &#x60;/transactions/get&#x60; or &#x60;/transactions/sync&#x60;). For optimal results, we strongly recommend customers using Recurring Transactions to request at least 180 days of history when initializing items with Transactions (using the [&#x60;days_requested&#x60;](https://plaid.com/docs/api/tokens/#link-token-create-request-transactions-days-requested) option). Once all historical transactions have been fetched, call &#x60;/transactions/recurring/get&#x60; to receive the Recurring Transactions streams and subscribe to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook. To know when historical transactions have been fetched, if you are using &#x60;/transactions/sync&#x60; listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#SyncUpdatesAvailableWebhook-historical-update-complete) webhook and check that the &#x60;historical_update_complete&#x60; field in the payload is &#x60;true&#x60;. If using &#x60;/transactions/get&#x60;, listen for the [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhook.  After the initial call, you can call &#x60;/transactions/recurring/get&#x60; endpoint at any point in the future to retrieve the latest summary of recurring streams. Listen to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook to be notified when new updates are available.
     * @param transactionsRecurringGetRequest  (required)
     * @return Call&lt;TransactionsRecurringGetResponse&gt;
     *
     * @see [Fetch recurring transaction streams Documentation](/api/products/transactions/.transactionsrecurringget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transactions/recurring/get")
    fun transactionsRecurringGet(
        @Body transactionsRecurringGetRequest: TransactionsRecurringGetRequest?
    ): Call<TransactionsRecurringGetResponse?>?

    /**
     * Refresh transaction data
     * &#x60;/transactions/refresh&#x60; is an optional endpoint that initiates an on-demand extraction to fetch the newest transactions for an Item. The on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Transactions-enabled Item. The Item must already have Transactions added as a product in order to call &#x60;/transactions/refresh&#x60;.  If changes to transactions are discovered after calling &#x60;/transactions/refresh&#x60;, Plaid will fire a webhook: for &#x60;/transactions/sync&#x60; users, [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) will be fired if there are any transactions updated, added, or removed. For users of both &#x60;/transactions/sync&#x60; and &#x60;/transactions/get&#x60;, [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/products/transactions/#transactions_removed) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/transactions/get&#x60; or &#x60;/transactions/sync&#x60;.  Note that the &#x60;/transactions/refresh&#x60; endpoint is not supported for Capital One (&#x60;ins_128026&#x60;) and will result in a &#x60;PRODUCTS_NOT_SUPPORTED&#x60; error if called on an Item from that institution.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/transactions/refresh&#x60; is offered as an optional add-on to Transactions and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
     * @param transactionsRefreshRequest  (required)
     * @return Call&lt;TransactionsRefreshResponse&gt;
     *
     * @see [Refresh transaction data Documentation](/api/products/transactions/.transactionsrefresh)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transactions/refresh")
    fun transactionsRefresh(
        @Body transactionsRefreshRequest: TransactionsRefreshRequest?
    ): Call<TransactionsRefreshResponse?>?

    /**
     * Create transaction category rule
     * The &#x60;/transactions/rules/v1/create&#x60; endpoint creates transaction categorization rules.  Rules will be applied on the Item&#39;s transactions returned in &#x60;/transactions/get&#x60; response.  The product is currently in beta. To request access, contact transactions-feedback@plaid.com.
     * @param transactionsRulesCreateRequest  (required)
     * @return Call&lt;TransactionsRulesCreateResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/transactions/rules/v1/create")
    fun transactionsRulesCreate(
        @Body transactionsRulesCreateRequest: TransactionsRulesCreateRequest?
    ): Call<TransactionsRulesCreateResponse?>?

    /**
     * Return a list of rules created for the Item associated with the access token.
     * The &#x60;/transactions/rules/v1/list&#x60; returns a list of transaction rules created for the Item associated with the access token.
     * @param transactionsRulesListRequest  (required)
     * @return Call&lt;TransactionsRulesListResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/transactions/rules/v1/list")
    fun transactionsRulesList(
        @Body transactionsRulesListRequest: TransactionsRulesListRequest?
    ): Call<TransactionsRulesListResponse?>?

    /**
     * Remove transaction rule
     * The &#x60;/transactions/rules/v1/remove&#x60; endpoint is used to remove a transaction rule.
     * @param transactionsRulesRemoveRequest  (required)
     * @return Call&lt;TransactionsRulesRemoveResponse&gt;
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/transactions/rules/v1/remove")
    fun transactionsRulesRemove(
        @Body transactionsRulesRemoveRequest: TransactionsRulesRemoveRequest?
    ): Call<TransactionsRulesRemoveResponse?>?

    /**
     * Get incremental transaction updates on an Item
     * The &#x60;/transactions/sync&#x60; endpoint allows developers to subscribe to all transactions associated with an Item and get updates synchronously in a stream-like manner, using a cursor to track which updates have already been seen.  &#x60;/transactions/sync&#x60; provides the same functionality as &#x60;/transactions/get&#x60; and can be used instead of &#x60;/transactions/get&#x60; to simplify the process of tracking transactions updates. To learn more about migrating from &#x60;/transactions/get&#x60;, see the [Transactions Sync migration guide](https://plaid.com/docs/transactions/sync-migration/).  This endpoint provides user-authorized transaction data for &#x60;credit&#x60;, &#x60;depository&#x60;, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from &#x60;investments&#x60; accounts, use &#x60;/investments/transactions/get&#x60; instead.  Returned transactions data is grouped into three types of update, indicating whether the transaction was added, removed, or modified since the last call to the API.  In the first call to &#x60;/transactions/sync&#x60; for an Item, the endpoint will return all historical transactions data associated with that Item up until the time of the API call (as \&quot;adds\&quot;), which then generates a &#x60;next_cursor&#x60; for that Item. In subsequent calls, send the &#x60;next_cursor&#x60; to receive only the changes that have occurred since the previous call.  Due to the potentially large number of transactions associated with an Item, results are paginated. The &#x60;has_more&#x60; field specifies if additional calls are necessary to fetch all available transaction updates. Call &#x60;/transactions/sync&#x60; with the new cursor, pulling all updates, until &#x60;has_more&#x60; is &#x60;false&#x60;.  When retrieving paginated updates, track both the &#x60;next_cursor&#x60; from the latest response and the original cursor from the first call in which &#x60;has_more&#x60; was &#x60;true&#x60;; if a call to &#x60;/transactions/sync&#x60; fails due to the [&#x60;TRANSACTIONS_SYNC_MUTATION_DURING_PAGINATION&#x60;](https://plaid.com/docs/errors/transactions/#transactions_sync_mutation_during_pagination) error, the entire pagination request loop must be restarted beginning with the cursor for the first page of the update, rather than retrying only the single request that failed.  Whenever new or updated transaction data becomes available, &#x60;/transactions/sync&#x60; will provide these updates. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To find out when the Item was last updated, use the [Item Debugger](https://plaid.com/docs/account/activity/#troubleshooting-with-item-debugger) or call &#x60;/item/get&#x60;; the &#x60;item.status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, use the &#x60;/transactions/refresh&#x60; endpoint.  For newly created Items, data may not be immediately available to &#x60;/transactions/sync&#x60;. Plaid begins preparing transactions data when the Item is created, but the process can take anywhere from a few seconds to several minutes to complete, depending on the number of transactions available.  To be alerted when new data is available, listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) webhook.
     * @param transactionsSyncRequest  (required)
     * @return Call&lt;TransactionsSyncResponse&gt;
     *
     * @see [Get incremental transaction updates on an Item Documentation](/api/products/transactions/.transactionssync)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transactions/sync")
    fun transactionsSync(
        @Body transactionsSyncRequest: TransactionsSyncRequest?
    ): Call<TransactionsSyncResponse?>?

    /**
     * Obtain user insights based on transactions sent through /transactions/enrich
     * The &#x60;/beta/transactions/user_insights/v1/get&#x60; gets user insights for clients who have enriched data with &#x60;/transactions/enrich&#x60;.  The product is currently in beta.
     * @param transactionsUserInsightsGetRequest  (required)
     * @return Call&lt;TransactionsUserInsightsGetResponse&gt;
     *
     * @see [Obtain user insights based on transactions sent through /transactions/enrich Documentation](/api/products/enrich/.userinsightsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("beta/transactions/user_insights/v1/get")
    fun transactionsUserInsightsGet(
        @Body transactionsUserInsightsGetRequest: TransactionsUserInsightsGetRequest?
    ): Call<TransactionsUserInsightsGetResponse?>?

    /**
     * Cancel a transfer authorization
     * Use the &#x60;/transfer/authorization/cancel&#x60; endpoint to cancel a transfer authorization. A transfer authorization is eligible for cancellation if it has not yet been used to create a transfer.
     * @param transferAuthorizationCancelRequest  (required)
     * @return Call&lt;TransferAuthorizationCancelResponse&gt;
     *
     * @see [Cancel a transfer authorization Documentation](/api/products/transfer/initiating-transfers/.transferauthorizationcancel)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/authorization/cancel")
    fun transferAuthorizationCancel(
        @Body transferAuthorizationCancelRequest: TransferAuthorizationCancelRequest?
    ): Call<TransferAuthorizationCancelResponse?>?

    /**
     * Create a transfer authorization
     * Use the &#x60;/transfer/authorization/create&#x60; endpoint to authorize a transfer. This endpoint must be called prior to calling &#x60;/transfer/create&#x60;.  There are three possible outcomes to calling this endpoint: If the &#x60;authorization.decision&#x60; in the response is &#x60;declined&#x60;, the proposed transfer has failed the risk check and you cannot proceed with the transfer. If the &#x60;authorization.decision&#x60; is &#x60;approved&#x60;, and the &#x60;authorization.rationale_code&#x60; is &#x60;null&#x60;, the transfer has passed the risk check and you can proceed to call &#x60;/transfer/create&#x60;. If the &#x60;authorization.decision&#x60; is &#x60;approved&#x60; and the &#x60;authorization.rationale_code&#x60; is non-&#x60;null&#x60;, the risk check could not be run: you may proceed with the transfer, but should perform your own risk evaluation. For more details, see the response schema.  In Plaid&#39;s Sandbox environment the decisions will be returned as follows:    - To approve a transfer with &#x60;null&#x60; rationale code, make an authorization request with an &#x60;amount&#x60; less than the available balance in the account.    - To approve a transfer with the rationale code &#x60;MANUALLY_VERIFIED_ITEM&#x60;, create an Item in Link through the [Same Day Micro-deposits flow](https://plaid.com/docs/auth/coverage/testing/#testing-same-day-micro-deposits).    - To approve a transfer with the rationale code &#x60;ITEM_LOGIN_REQUIRED&#x60;, [reset the login for an Item](https://plaid.com/docs/sandbox/#item_login_required).    - To decline a transfer with the rationale code &#x60;NSF&#x60;, the available balance on the account must be less than the authorization &#x60;amount&#x60;. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.    - To decline a transfer with the rationale code &#x60;RISK&#x60;, the available balance on the account must be exactly $0. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.
     * @param transferAuthorizationCreateRequest  (required)
     * @return Call&lt;TransferAuthorizationCreateResponse&gt;
     *
     * @see [Create a transfer authorization Documentation](/api/products/transfer/initiating-transfers/.transferauthorizationcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/authorization/create")
    fun transferAuthorizationCreate(
        @Body transferAuthorizationCreateRequest: TransferAuthorizationCreateRequest?
    ): Call<TransferAuthorizationCreateResponse?>?

    /**
     * (Deprecated) Retrieve a balance held with Plaid
     * (Deprecated) Use the &#x60;/transfer/balance/get&#x60; endpoint to view a balance held with Plaid.
     * @param transferBalanceGetRequest  (required)
     * @return Call&lt;TransferBalanceGetResponse&gt;
     * @see [
    ](/api/products/transfer/balance/.transferbalanceget) */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/balance/get")
    @Deprecated(
        """ 
    """
    )
    fun transferBalanceGet(
        @Body transferBalanceGetRequest: TransferBalanceGetRequest?
    ): Call<TransferBalanceGetResponse?>?

    /**
     * Cancel a transfer
     * Use the &#x60;/transfer/cancel&#x60; endpoint to cancel a transfer.  A transfer is eligible for cancellation if the &#x60;cancellable&#x60; property returned by &#x60;/transfer/get&#x60; is &#x60;true&#x60;.
     * @param transferCancelRequest  (required)
     * @return Call&lt;TransferCancelResponse&gt;
     *
     * @see [Cancel a transfer Documentation](/api/products/transfer/initiating-transfers/.transfercancel)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/cancel")
    fun transferCancel(
        @Body transferCancelRequest: TransferCancelRequest?
    ): Call<TransferCancelResponse?>?

    /**
     * Get RTP eligibility information of a transfer
     * Use the &#x60;/transfer/capabilities/get&#x60; endpoint to determine the RTP eligibility information of a transfer. To simulate RTP eligibility in Sandbox, log in using the username &#x60;user_good&#x60; and password &#x60;pass_good&#x60; and use the first two checking and savings accounts in the \&quot;First Platypus Bank\&quot; institution (ending in 0000 or 1111), which will return &#x60;true&#x60;. Any other account will return &#x60;false&#x60;.
     * @param transferCapabilitiesGetRequest  (required)
     * @return Call&lt;TransferCapabilitiesGetResponse&gt;
     *
     * @see [Get RTP eligibility information of a transfer Documentation](/api/products/transfer/account-linking/.transfercapabilitiesget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/capabilities/get")
    fun transferCapabilitiesGet(
        @Body transferCapabilitiesGetRequest: TransferCapabilitiesGetRequest?
    ): Call<TransferCapabilitiesGetResponse?>?

    /**
     * Get transfer product configuration
     * Use the &#x60;/transfer/configuration/get&#x60; endpoint to view your transfer product configurations.
     * @param transferConfigurationGetRequest  (required)
     * @return Call&lt;TransferConfigurationGetResponse&gt;
     *
     * @see [Get transfer product configuration Documentation](/api/products/transfer/metrics/.transferconfigurationget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/configuration/get")
    fun transferConfigurationGet(
        @Body transferConfigurationGetRequest: TransferConfigurationGetRequest?
    ): Call<TransferConfigurationGetResponse?>?

    /**
     * Create a transfer
     * Use the &#x60;/transfer/create&#x60; endpoint to initiate a new transfer.
     * @param transferCreateRequest  (required)
     * @return Call&lt;TransferCreateResponse&gt;
     *
     * @see [Create a transfer Documentation](/api/products/transfer/initiating-transfers/.transfercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/create")
    fun transferCreate(
        @Body transferCreateRequest: TransferCreateRequest?
    ): Call<TransferCreateResponse?>?

    /**
     * Upload transfer diligence document on behalf of the originator
     * Third-party sender customers can use &#x60;/transfer/diligence/document/upload&#x60; endpoint to upload a document on behalf of its end customer (i.e. originator) to Plaid. You’ll need to send a request of type multipart/form-data. You must provide the &#x60;client_id&#x60; in the &#x60;PLAID-CLIENT-ID&#x60; header and &#x60;secret&#x60; in the &#x60;PLAID-SECRET&#x60; header.
     * @param transferDiligenceDocumentUploadRequest  (required)
     * @return Call&lt;TransferDiligenceDocumentUploadResponse&gt;
     *
     * @see [Upload transfer diligence document on behalf of the originator Documentation](/api/products/transfer/platform-payments/.transferdiligencedocumentupload)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/diligence/document/upload")
    fun transferDiligenceDocumentUpload(
        @Body transferDiligenceDocumentUploadRequest: TransferDiligenceDocumentUploadRequest?
    ): Call<TransferDiligenceDocumentUploadResponse?>?

    /**
     * Submit transfer diligence on behalf of the originator
     * Use the &#x60;/transfer/diligence/submit&#x60; endpoint to submit transfer diligence on behalf of the originator (i.e., the end customer).
     * @param transferDiligenceSubmitRequest  (required)
     * @return Call&lt;TransferDiligenceSubmitResponse&gt;
     *
     * @see [Submit transfer diligence on behalf of the originator Documentation](/api/products/transfer/platform-payments/.transferdiligencesubmit)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/diligence/submit")
    fun transferDiligenceSubmit(
        @Body transferDiligenceSubmitRequest: TransferDiligenceSubmitRequest?
    ): Call<TransferDiligenceSubmitResponse?>?

    /**
     * List transfer events
     * Use the &#x60;/transfer/event/list&#x60; endpoint to get a list of transfer events based on specified filter criteria.
     * @param transferEventListRequest  (required)
     * @return Call&lt;TransferEventListResponse&gt;
     *
     * @see [List transfer events Documentation](/api/products/transfer/reading-transfers/.transfereventlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/event/list")
    fun transferEventList(
        @Body transferEventListRequest: TransferEventListRequest?
    ): Call<TransferEventListResponse?>?

    /**
     * Sync transfer events
     * &#x60;/transfer/event/sync&#x60; allows you to request up to the next 25 transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/transfer/event/sync&#x60; endpoint to guarantee you have seen all transfer events.
     * @param transferEventSyncRequest  (required)
     * @return Call&lt;TransferEventSyncResponse&gt;
     *
     * @see [Sync transfer events Documentation](/api/products/transfer/reading-transfers/.transfereventsync)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/event/sync")
    fun transferEventSync(
        @Body transferEventSyncRequest: TransferEventSyncRequest?
    ): Call<TransferEventSyncResponse?>?

    /**
     * Retrieve a transfer
     * The &#x60;/transfer/get&#x60; endpoint fetches information about the transfer corresponding to the given &#x60;transfer_id&#x60;.
     * @param transferGetRequest  (required)
     * @return Call&lt;TransferGetResponse&gt;
     *
     * @see [Retrieve a transfer Documentation](/api/products/transfer/reading-transfers/.transferget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/get")
    fun transferGet(
        @Body transferGetRequest: TransferGetRequest?
    ): Call<TransferGetResponse?>?

    /**
     * Create a transfer intent object to invoke the Transfer UI
     * Use the &#x60;/transfer/intent/create&#x60; endpoint to generate a transfer intent object and invoke the Transfer UI.
     * @param transferIntentCreateRequest  (required)
     * @return Call&lt;TransferIntentCreateResponse&gt;
     *
     * @see [Create a transfer intent object to invoke the Transfer UI Documentation](/api/products/transfer/account-linking/.transferintentcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/intent/create")
    fun transferIntentCreate(
        @Body transferIntentCreateRequest: TransferIntentCreateRequest?
    ): Call<TransferIntentCreateResponse?>?

    /**
     * Retrieve more information about a transfer intent
     * Use the &#x60;/transfer/intent/get&#x60; endpoint to retrieve more information about a transfer intent.
     * @param transferIntentGetRequest  (required)
     * @return Call&lt;TransferIntentGetResponse&gt;
     *
     * @see [Retrieve more information about a transfer intent Documentation](/api/products/transfer/account-linking/.transferintentget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/intent/get")
    fun transferIntentGet(
        @Body transferIntentGetRequest: TransferIntentGetRequest?
    ): Call<TransferIntentGetResponse?>?

    /**
     * Deposit funds into a Plaid Ledger balance
     * Use the &#x60;/transfer/ledger/deposit&#x60; endpoint to deposit funds into Plaid Ledger.
     * @param transferLedgerDepositRequest  (required)
     * @return Call&lt;TransferLedgerDepositResponse&gt;
     *
     * @see [Deposit funds into a Plaid Ledger balance Documentation](/api/products/transfer/ledger/.transferledgerdeposit)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/ledger/deposit")
    fun transferLedgerDeposit(
        @Body transferLedgerDepositRequest: TransferLedgerDepositRequest?
    ): Call<TransferLedgerDepositResponse?>?

    /**
     * Move available balance between the ledgers of the platform and one of its originators
     * Use the &#x60;/transfer/ledger/distribute&#x60; endpoint to move available balance between the ledgers of the platform and one of its originators.
     * @param transferLedgerDistributeRequest  (required)
     * @return Call&lt;TransferLedgerDistributeResponse&gt;
     *
     * @see [Move available balance between the ledgers of the platform and one of its originators Documentation](/api/products/transfer/ledger/.transferledgerdistribute)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/ledger/distribute")
    fun transferLedgerDistribute(
        @Body transferLedgerDistributeRequest: TransferLedgerDistributeRequest?
    ): Call<TransferLedgerDistributeResponse?>?

    /**
     * Retrieve Plaid Ledger balance
     * Use the &#x60;/transfer/ledger/get&#x60; endpoint to view a balance on the ledger held with Plaid.
     * @param transferLedgerGetRequest  (required)
     * @return Call&lt;TransferLedgerGetResponse&gt;
     *
     * @see [Retrieve Plaid Ledger balance Documentation](/api/products/transfer/ledger/.transferledgerget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/ledger/get")
    fun transferLedgerGet(
        @Body transferLedgerGetRequest: TransferLedgerGetRequest?
    ): Call<TransferLedgerGetResponse?>?

    /**
     * Withdraw funds from a Plaid Ledger balance
     * Use the &#x60;/transfer/ledger/withdraw&#x60; endpoint to withdraw funds from a Plaid Ledger balance.
     * @param transferLedgerWithdrawRequest  (required)
     * @return Call&lt;TransferLedgerWithdrawResponse&gt;
     *
     * @see [Withdraw funds from a Plaid Ledger balance Documentation](/api/products/transfer/ledger/.transferledgerwithdraw)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/ledger/withdraw")
    fun transferLedgerWithdraw(
        @Body transferLedgerWithdrawRequest: TransferLedgerWithdrawRequest?
    ): Call<TransferLedgerWithdrawResponse?>?

    /**
     * List transfers
     * Use the &#x60;/transfer/list&#x60; endpoint to see a list of all your transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired transfers.
     * @param transferListRequest  (required)
     * @return Call&lt;TransferListResponse&gt;
     *
     * @see [List transfers Documentation](/api/products/transfer/reading-transfers/.transferlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/list")
    fun transferList(
        @Body transferListRequest: TransferListRequest?
    ): Call<TransferListResponse?>?

    /**
     * Get transfer product usage metrics
     * Use the &#x60;/transfer/metrics/get&#x60; endpoint to view your transfer product usage metrics.
     * @param transferMetricsGetRequest  (required)
     * @return Call&lt;TransferMetricsGetResponse&gt;
     *
     * @see [Get transfer product usage metrics Documentation](/api/products/transfer/metrics/.transfermetricsget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/metrics/get")
    fun transferMetricsGet(
        @Body transferMetricsGetRequest: TransferMetricsGetRequest?
    ): Call<TransferMetricsGetResponse?>?

    /**
     * Migrate account into Transfers
     * As an alternative to adding Items via Link, you can also use the &#x60;/transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items. If you intend to create wire transfers on this account, you must provide &#x60;wire_routing_number&#x60;. Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.
     * @param transferMigrateAccountRequest  (required)
     * @return Call&lt;TransferMigrateAccountResponse&gt;
     *
     * @see [Migrate account into Transfers Documentation](/api/products/transfer/account-linking/.transfermigrate_account)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/migrate_account")
    fun transferMigrateAccount(
        @Body transferMigrateAccountRequest: TransferMigrateAccountRequest?
    ): Call<TransferMigrateAccountResponse?>?

    /**
     * Create a new originator
     * Use the &#x60;/transfer/originator/create&#x60; endpoint to create a new originator and return an &#x60;originator_client_id&#x60;.
     * @param transferOriginatorCreateRequest  (required)
     * @return Call&lt;TransferOriginatorCreateResponse&gt;
     *
     * @see [Create a new originator Documentation](/api/products/transfer/platform-payments/.transferoriginatorcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/originator/create")
    fun transferOriginatorCreate(
        @Body transferOriginatorCreateRequest: TransferOriginatorCreateRequest?
    ): Call<TransferOriginatorCreateResponse?>?

    /**
     * Update the funding account associated with the originator
     * Use the &#x60;/transfer/originator/funding_account/update&#x60; endpoint to update the funding account associated with the originator.
     * @param transferOriginatorFundingAccountUpdateRequest  (required)
     * @return Call&lt;TransferOriginatorFundingAccountUpdateResponse&gt;
     *
     * @see [Update the funding account associated with the originator Documentation](/api/products/transfer/platform-payments/.transferoriginatorfunding_accountupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/originator/funding_account/update")
    fun transferOriginatorFundingAccountUpdate(
        @Body transferOriginatorFundingAccountUpdateRequest: TransferOriginatorFundingAccountUpdateRequest?
    ): Call<TransferOriginatorFundingAccountUpdateResponse?>?

    /**
     * Get status of an originator&#39;s onboarding
     * The &#x60;/transfer/originator/get&#x60; endpoint gets status updates for an originator&#39;s onboarding process. This information is also available via the Transfer page on the Plaid dashboard.
     * @param transferOriginatorGetRequest  (required)
     * @return Call&lt;TransferOriginatorGetResponse&gt;
     *
     * @see [Get status of an originator&.39;s onboarding Documentation](/api/products/transfer/platform-payments/.transferoriginatorget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/originator/get")
    fun transferOriginatorGet(
        @Body transferOriginatorGetRequest: TransferOriginatorGetRequest?
    ): Call<TransferOriginatorGetResponse?>?

    /**
     * Get status of all originators&#39; onboarding
     * The &#x60;/transfer/originator/list&#x60; endpoint gets status updates for all of your originators&#39; onboarding. This information is also available via the Plaid dashboard.
     * @param transferOriginatorListRequest  (required)
     * @return Call&lt;TransferOriginatorListResponse&gt;
     *
     * @see [Get status of all originators&.39; onboarding Documentation](/api/products/transfer/platform-payments/.transferoriginatorlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/originator/list")
    fun transferOriginatorList(
        @Body transferOriginatorListRequest: TransferOriginatorListRequest?
    ): Call<TransferOriginatorListResponse?>?

    /**
     * Generate a Plaid-hosted onboarding UI URL.
     * The &#x60;/transfer/questionnaire/create&#x60; endpoint generates a Plaid-hosted onboarding UI URL. Redirect the originator to this URL to provide their due diligence information and agree to Plaid’s terms for ACH money movement.
     * @param transferQuestionnaireCreateRequest  (required)
     * @return Call&lt;TransferQuestionnaireCreateResponse&gt;
     *
     * @see [Generate a Plaid-hosted onboarding UI URL. Documentation](/api/products/transfer/platform-payments/.transferquestionnairecreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/questionnaire/create")
    fun transferQuestionnaireCreate(
        @Body transferQuestionnaireCreateRequest: TransferQuestionnaireCreateRequest?
    ): Call<TransferQuestionnaireCreateResponse?>?

    /**
     * Cancel a recurring transfer.
     * Use the &#x60;/transfer/recurring/cancel&#x60; endpoint to cancel a recurring transfer.  Scheduled transfer that hasn&#39;t been submitted to bank will be cancelled.
     * @param transferRecurringCancelRequest  (required)
     * @return Call&lt;TransferRecurringCancelResponse&gt;
     *
     * @see [Cancel a recurring transfer. Documentation](/api/products/transfer/recurring-transfers/.transferrecurringcancel)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/recurring/cancel")
    fun transferRecurringCancel(
        @Body transferRecurringCancelRequest: TransferRecurringCancelRequest?
    ): Call<TransferRecurringCancelResponse?>?

    /**
     * Create a recurring transfer
     * Use the &#x60;/transfer/recurring/create&#x60; endpoint to initiate a new recurring transfer. This capability is not currently supported for Transfer UI or Platform Payments (beta) customers.
     * @param transferRecurringCreateRequest  (required)
     * @return Call&lt;TransferRecurringCreateResponse&gt;
     *
     * @see [Create a recurring transfer Documentation](/api/products/transfer/recurring-transfers/.transferrecurringcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/recurring/create")
    fun transferRecurringCreate(
        @Body transferRecurringCreateRequest: TransferRecurringCreateRequest?
    ): Call<TransferRecurringCreateResponse?>?

    /**
     * Retrieve a recurring transfer
     * The &#x60;/transfer/recurring/get&#x60; fetches information about the recurring transfer corresponding to the given &#x60;recurring_transfer_id&#x60;.
     * @param transferRecurringGetRequest  (required)
     * @return Call&lt;TransferRecurringGetResponse&gt;
     *
     * @see [Retrieve a recurring transfer Documentation](/api/products/transfer/recurring-transfers/.transferrecurringget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/recurring/get")
    fun transferRecurringGet(
        @Body transferRecurringGetRequest: TransferRecurringGetRequest?
    ): Call<TransferRecurringGetResponse?>?

    /**
     * List recurring transfers
     * Use the &#x60;/transfer/recurring/list&#x60; endpoint to see a list of all your recurring transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired recurring transfers.
     * @param transferRecurringListRequest  (required)
     * @return Call&lt;TransferRecurringListResponse&gt;
     *
     * @see [List recurring transfers Documentation](/api/products/transfer/recurring-transfers/.transferrecurringlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/recurring/list")
    fun transferRecurringList(
        @Body transferRecurringListRequest: TransferRecurringListRequest?
    ): Call<TransferRecurringListResponse?>?

    /**
     * Cancel a refund
     * Use the &#x60;/transfer/refund/cancel&#x60; endpoint to cancel a refund.  A refund is eligible for cancellation if it has not yet been submitted to the payment network.
     * @param transferRefundCancelRequest  (required)
     * @return Call&lt;TransferRefundCancelResponse&gt;
     *
     * @see [Cancel a refund Documentation](/api/products/transfer/refunds/.transferrefundcancel)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/refund/cancel")
    fun transferRefundCancel(
        @Body transferRefundCancelRequest: TransferRefundCancelRequest?
    ): Call<TransferRefundCancelResponse?>?

    /**
     * Create a refund
     * Use the &#x60;/transfer/refund/create&#x60; endpoint to create a refund for a transfer. A transfer can be refunded if the transfer was initiated in the past 180 days.  Processing of the refund will not occur until at least 4 business days following the transfer&#39;s settlement date, plus any hold/settlement delays. This 3-day window helps better protect your business from regular ACH returns. Consumer initiated returns (unauthorized returns) could still happen for about 60 days from the settlement date. If the original transfer is canceled, returned or failed, all pending refunds will automatically be canceled. Processed refunds cannot be revoked.
     * @param transferRefundCreateRequest  (required)
     * @return Call&lt;TransferRefundCreateResponse&gt;
     *
     * @see [Create a refund Documentation](/api/products/transfer/refunds/.transferrefundcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/refund/create")
    fun transferRefundCreate(
        @Body transferRefundCreateRequest: TransferRefundCreateRequest?
    ): Call<TransferRefundCreateResponse?>?

    /**
     * Retrieve a refund
     * The &#x60;/transfer/refund/get&#x60; endpoint fetches information about the refund corresponding to the given &#x60;refund_id&#x60;.
     * @param transferRefundGetRequest  (required)
     * @return Call&lt;TransferRefundGetResponse&gt;
     *
     * @see [Retrieve a refund Documentation](/api/products/transfer/refunds/.transferrefundget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/refund/get")
    fun transferRefundGet(
        @Body transferRefundGetRequest: TransferRefundGetRequest?
    ): Call<TransferRefundGetResponse?>?

    /**
     * Lists historical repayments
     * The &#x60;/transfer/repayment/list&#x60; endpoint fetches repayments matching the given filters. Repayments are returned in reverse-chronological order (most recent first) starting at the given &#x60;start_time&#x60;.
     * @param transferRepaymentListRequest  (required)
     * @return Call&lt;TransferRepaymentListResponse&gt;
     *
     * @see [Lists historical repayments Documentation](/api/products/transfer/.transferrepaymentlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/repayment/list")
    fun transferRepaymentList(
        @Body transferRepaymentListRequest: TransferRepaymentListRequest?
    ): Call<TransferRepaymentListResponse?>?

    /**
     * List the returns included in a repayment
     * The &#x60;/transfer/repayment/return/list&#x60; endpoint retrieves the set of returns that were batched together into the specified repayment. The sum of amounts of returns retrieved by this request equals the amount of the repayment.
     * @param transferRepaymentReturnListRequest  (required)
     * @return Call&lt;TransferRepaymentReturnListResponse&gt;
     *
     * @see [List the returns included in a repayment Documentation](/api/products/transfer/.transferrepaymentreturnlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/repayment/return/list")
    fun transferRepaymentReturnList(
        @Body transferRepaymentReturnListRequest: TransferRepaymentReturnListRequest?
    ): Call<TransferRepaymentReturnListResponse?>?

    /**
     * Retrieve a sweep
     * The &#x60;/transfer/sweep/get&#x60; endpoint fetches a sweep corresponding to the given &#x60;sweep_id&#x60;.
     * @param transferSweepGetRequest  (required)
     * @return Call&lt;TransferSweepGetResponse&gt;
     *
     * @see [Retrieve a sweep Documentation](/api/products/transfer/reading-transfers/.transfersweepget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/sweep/get")
    fun transferSweepGet(
        @Body transferSweepGetRequest: TransferSweepGetRequest?
    ): Call<TransferSweepGetResponse?>?

    /**
     * List sweeps
     * The &#x60;/transfer/sweep/list&#x60; endpoint fetches sweeps matching the given filters.
     * @param transferSweepListRequest  (required)
     * @return Call&lt;TransferSweepListResponse&gt;
     *
     * @see [List sweeps Documentation](/api/products/transfer/reading-transfers/.transfersweeplist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("transfer/sweep/list")
    fun transferSweepList(
        @Body transferSweepListRequest: TransferSweepListRequest?
    ): Call<TransferSweepListResponse?>?

    /**
     * Create user
     * This endpoint should be called for each of your end users before they begin a Plaid income flow. This provides you a single token to access all income data associated with the user. You should only create one per end user.  If you call the endpoint multiple times with the same &#x60;client_user_id&#x60;, the first creation call will succeed and the rest will fail with an error message indicating that the user has been created for the given &#x60;client_user_id&#x60;.  Ensure that you store the &#x60;user_token&#x60; along with your user&#39;s identifier in your database, as it is not possible to retrieve a previously created &#x60;user_token&#x60;.
     * @param userCreateRequest  (required)
     * @return Call&lt;UserCreateResponse&gt;
     *
     * @see [Create user Documentation](/api/products/income/.usercreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("user/create")
    fun userCreate(
        @Body userCreateRequest: UserCreateRequest?
    ): Call<UserCreateResponse?>?

    /**
     * Update user information
     * This endpoint is used to update user information associated with an existing &#x60;user_token&#x60;. The &#x60;user_token&#x60; should be in the response of &#x60;/user/create&#x60; call  If you call the endpoint with a non-exist &#x60;user_token&#x60;, the call will fail with an error message indicating that the user token is not found.
     * @param userUpdateRequest  (required)
     * @return Call&lt;UserUpdateResponse&gt;
     *
     * @see [Update user information Documentation](/api/products/income/.userupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("user/update")
    fun userUpdate(
        @Body userUpdateRequest: UserUpdateRequest?
    ): Call<UserUpdateResponse?>?

    /**
     * Create an e-wallet
     * Create an e-wallet. The response is the newly created e-wallet object.
     * @param walletCreateRequest  (required)
     * @return Call&lt;WalletCreateResponse&gt;
     *
     * @see [Create an e-wallet Documentation](/api/products/virtual-accounts/.walletcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/create")
    fun walletCreate(
        @Body walletCreateRequest: WalletCreateRequest?
    ): Call<WalletCreateResponse?>?

    /**
     * Fetch an e-wallet
     * Fetch an e-wallet. The response includes the current balance.
     * @param walletGetRequest  (required)
     * @return Call&lt;WalletGetResponse&gt;
     *
     * @see [Fetch an e-wallet Documentation](/api/products/virtual-accounts/.walletget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/get")
    fun walletGet(
        @Body walletGetRequest: WalletGetRequest?
    ): Call<WalletGetResponse?>?

    /**
     * Fetch a list of e-wallets
     * This endpoint lists all e-wallets in descending order of creation.
     * @param walletListRequest  (required)
     * @return Call&lt;WalletListResponse&gt;
     *
     * @see [Fetch a list of e-wallets Documentation](/api/products/virtual-accounts/.walletlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/list")
    fun walletList(
        @Body walletListRequest: WalletListRequest?
    ): Call<WalletListResponse?>?

    /**
     * Execute a transaction using an e-wallet
     * Execute a transaction using the specified e-wallet. Specify the e-wallet to debit from, the counterparty to credit to, the idempotency key to prevent duplicate transactions, the amount and reference for the transaction. Transactions will settle in seconds to several days, depending on the underlying payment rail.
     * @param walletTransactionExecuteRequest  (required)
     * @return Call&lt;WalletTransactionExecuteResponse&gt;
     *
     * @see [Execute a transaction using an e-wallet Documentation](/api/products/virtual-accounts/.wallettransactionexecute)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/transaction/execute")
    fun walletTransactionExecute(
        @Body walletTransactionExecuteRequest: WalletTransactionExecuteRequest?
    ): Call<WalletTransactionExecuteResponse?>?

    /**
     * Fetch an e-wallet transaction
     * Fetch a specific e-wallet transaction
     * @param walletTransactionGetRequest  (required)
     * @return Call&lt;WalletTransactionGetResponse&gt;
     *
     * @see [Fetch an e-wallet transaction Documentation](/api/products/virtual-accounts/.wallettransactionget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/transaction/get")
    fun walletTransactionGet(
        @Body walletTransactionGetRequest: WalletTransactionGetRequest?
    ): Call<WalletTransactionGetResponse?>?

    /**
     * List e-wallet transactions
     * This endpoint lists the latest transactions of the specified e-wallet. Transactions are returned in descending order by the &#x60;created_at&#x60; time.
     * @param walletTransactionListRequest  (required)
     * @return Call&lt;WalletTransactionListResponse&gt;
     *
     * @see [List e-wallet transactions Documentation](/api/products/virtual-accounts/.wallettransactionlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("wallet/transaction/list")
    fun walletTransactionList(
        @Body walletTransactionListRequest: WalletTransactionListRequest?
    ): Call<WalletTransactionListResponse?>?

    /**
     * Create a watchlist screening for an entity
     * Create a new entity watchlist screening to check your customer against watchlists defined in the associated entity watchlist program. If your associated program has ongoing screening enabled, this is the profile information that will be used to monitor your customer over time.
     * @param watchlistScreeningEntityCreateRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityCreateResponse&gt;
     *
     * @see [Create a watchlist screening for an entity Documentation](/api/products/monitor/.watchlist_screeningentitycreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/create")
    fun watchlistScreeningEntityCreate(
        @Body watchlistScreeningEntityCreateRequest: WatchlistScreeningEntityCreateRequest?
    ): Call<WatchlistScreeningEntityCreateResponse?>?

    /**
     * Get an entity screening
     * Retrieve an entity watchlist screening.
     * @param watchlistScreeningEntityGetRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityGetResponse&gt;
     *
     * @see [Get an entity screening Documentation](/api/products/monitor/.watchlist_screeningentityget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/get")
    fun watchlistScreeningEntityGet(
        @Body watchlistScreeningEntityGetRequest: WatchlistScreeningEntityGetRequest?
    ): Call<WatchlistScreeningEntityGetResponse?>?

    /**
     * List history for entity watchlist screenings
     * List all changes to the entity watchlist screening in reverse-chronological order. If the watchlist screening has not been edited, no history will be returned.
     * @param watchlistScreeningEntityHistoryListRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityHistoryListResponse&gt;
     *
     * @see [List history for entity watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningentityhistorylist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/history/list")
    fun watchlistScreeningEntityHistoryList(
        @Body watchlistScreeningEntityHistoryListRequest: WatchlistScreeningEntityHistoryListRequest?
    ): Call<WatchlistScreeningEntityHistoryListResponse?>?

    /**
     * List hits for entity watchlist screenings
     * List all hits for the entity watchlist screening.
     * @param watchlistScreeningEntityHitListRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityHitListResponse&gt;
     *
     * @see [List hits for entity watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningentityhitlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/hit/list")
    fun watchlistScreeningEntityHitList(
        @Body watchlistScreeningEntityHitListRequest: WatchlistScreeningEntityHitListRequest?
    ): Call<WatchlistScreeningEntityHitListResponse?>?

    /**
     * List entity watchlist screenings
     * List all entity screenings.
     * @param watchlistScreeningEntityListRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityListResponse&gt;
     *
     * @see [List entity watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningentitylist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/list")
    fun watchlistScreeningEntityList(
        @Body watchlistScreeningEntityListRequest: WatchlistScreeningEntityListRequest?
    ): Call<WatchlistScreeningEntityListResponse?>?

    /**
     * Get entity watchlist screening program
     * Get an entity watchlist screening program
     * @param watchlistScreeningEntityProgramGetRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityProgramGetResponse&gt;
     *
     * @see [Get entity watchlist screening program Documentation](/api/products/monitor/.watchlist_screeningentityprogramget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/program/get")
    fun watchlistScreeningEntityProgramGet(
        @Body watchlistScreeningEntityProgramGetRequest: WatchlistScreeningEntityProgramGetRequest?
    ): Call<WatchlistScreeningEntityProgramGetResponse?>?

    /**
     * List entity watchlist screening programs
     * List all entity watchlist screening programs
     * @param watchlistScreeningEntityProgramListRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityProgramListResponse&gt;
     *
     * @see [List entity watchlist screening programs Documentation](/api/products/monitor/.watchlist_screeningentityprogramlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/program/list")
    fun watchlistScreeningEntityProgramList(
        @Body watchlistScreeningEntityProgramListRequest: WatchlistScreeningEntityProgramListRequest?
    ): Call<WatchlistScreeningEntityProgramListResponse?>?

    /**
     * Create a review for an entity watchlist screening
     * Create a review for an entity watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
     * @param watchlistScreeningEntityReviewCreateRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityReviewCreateResponse&gt;
     *
     * @see [Create a review for an entity watchlist screening Documentation](/api/products/monitor/.watchlist_screeningentityreviewcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/review/create")
    fun watchlistScreeningEntityReviewCreate(
        @Body watchlistScreeningEntityReviewCreateRequest: WatchlistScreeningEntityReviewCreateRequest?
    ): Call<WatchlistScreeningEntityReviewCreateResponse?>?

    /**
     * List reviews for entity watchlist screenings
     * List all reviews for a particular entity watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
     * @param watchlistScreeningEntityReviewListRequest  (required)
     * @return Call&lt;WatchlistScreeningEntityReviewListResponse&gt;
     *
     * @see [List reviews for entity watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningentityreviewlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/review/list")
    fun watchlistScreeningEntityReviewList(
        @Body watchlistScreeningEntityReviewListRequest: WatchlistScreeningEntityReviewListRequest?
    ): Call<WatchlistScreeningEntityReviewListResponse?>?

    /**
     * Update an entity screening
     * Update an entity watchlist screening.
     * @param watchlistScreeningEntityUpdateRequest The entity screening was successfully updated. (required)
     * @return Call&lt;WatchlistScreeningEntityUpdateResponse&gt;
     *
     * @see [Update an entity screening Documentation](/api/products/monitor/.watchlist_screeningentityupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/entity/update")
    fun watchlistScreeningEntityUpdate(
        @Body watchlistScreeningEntityUpdateRequest: WatchlistScreeningEntityUpdateRequest?
    ): Call<WatchlistScreeningEntityUpdateResponse?>?

    /**
     * Create a watchlist screening for a person
     * Create a new Watchlist Screening to check your customer against watchlists defined in the associated Watchlist Program. If your associated program has ongoing screening enabled, this is the profile information that will be used to monitor your customer over time.
     * @param watchlistScreeningIndividualCreateRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualCreateResponse&gt;
     *
     * @see [Create a watchlist screening for a person Documentation](/api/products/monitor/.watchlist_screeningindividualcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/create")
    fun watchlistScreeningIndividualCreate(
        @Body watchlistScreeningIndividualCreateRequest: WatchlistScreeningIndividualCreateRequest?
    ): Call<WatchlistScreeningIndividualCreateResponse?>?

    /**
     * Retrieve an individual watchlist screening
     * Retrieve a previously created individual watchlist screening
     * @param watchlistScreeningIndividualGetRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualGetResponse&gt;
     *
     * @see [Retrieve an individual watchlist screening Documentation](/api/products/monitor/.watchlist_screeningindividualget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/get")
    fun watchlistScreeningIndividualGet(
        @Body watchlistScreeningIndividualGetRequest: WatchlistScreeningIndividualGetRequest?
    ): Call<WatchlistScreeningIndividualGetResponse?>?

    /**
     * List history for individual watchlist screenings
     * List all changes to the individual watchlist screening in reverse-chronological order. If the watchlist screening has not been edited, no history will be returned.
     * @param watchlistScreeningIndividualHistoryListRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualHistoryListResponse&gt;
     *
     * @see [List history for individual watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningindividualhistorylist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/history/list")
    fun watchlistScreeningIndividualHistoryList(
        @Body watchlistScreeningIndividualHistoryListRequest: WatchlistScreeningIndividualHistoryListRequest?
    ): Call<WatchlistScreeningIndividualHistoryListResponse?>?

    /**
     * List hits for individual watchlist screening
     * List all hits found by Plaid for a particular individual watchlist screening.
     * @param watchlistScreeningIndividualHitListRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualHitListResponse&gt;
     *
     * @see [List hits for individual watchlist screening Documentation](/api/products/monitor/.watchlist_screeningindividualhitlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/hit/list")
    fun watchlistScreeningIndividualHitList(
        @Body watchlistScreeningIndividualHitListRequest: WatchlistScreeningIndividualHitListRequest?
    ): Call<WatchlistScreeningIndividualHitListResponse?>?

    /**
     * List Individual Watchlist Screenings
     * List previously created watchlist screenings for individuals
     * @param watchlistScreeningIndividualListRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualListResponse&gt;
     *
     * @see [List Individual Watchlist Screenings Documentation](/api/products/monitor/.watchlist_screeningindividuallist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/list")
    fun watchlistScreeningIndividualList(
        @Body watchlistScreeningIndividualListRequest: WatchlistScreeningIndividualListRequest?
    ): Call<WatchlistScreeningIndividualListResponse?>?

    /**
     * Get individual watchlist screening program
     * Get an individual watchlist screening program
     * @param watchlistScreeningIndividualProgramGetRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualProgramGetResponse&gt;
     *
     * @see [Get individual watchlist screening program Documentation](/api/products/monitor/.watchlist_screeningindividualprogramget)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/program/get")
    fun watchlistScreeningIndividualProgramGet(
        @Body watchlistScreeningIndividualProgramGetRequest: WatchlistScreeningIndividualProgramGetRequest?
    ): Call<WatchlistScreeningIndividualProgramGetResponse?>?

    /**
     * List individual watchlist screening programs
     * List all individual watchlist screening programs
     * @param watchlistScreeningIndividualProgramListRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualProgramListResponse&gt;
     *
     * @see [List individual watchlist screening programs Documentation](/api/products/monitor/.watchlist_screeningindividualprogramlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/program/list")
    fun watchlistScreeningIndividualProgramList(
        @Body watchlistScreeningIndividualProgramListRequest: WatchlistScreeningIndividualProgramListRequest?
    ): Call<WatchlistScreeningIndividualProgramListResponse?>?

    /**
     * Create a review for an individual watchlist screening
     * Create a review for the individual watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
     * @param watchlistScreeningIndividualReviewCreateRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualReviewCreateResponse&gt;
     *
     * @see [Create a review for an individual watchlist screening Documentation](/api/products/monitor/.watchlist_screeningindividualreviewcreate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/review/create")
    fun watchlistScreeningIndividualReviewCreate(
        @Body watchlistScreeningIndividualReviewCreateRequest: WatchlistScreeningIndividualReviewCreateRequest?
    ): Call<WatchlistScreeningIndividualReviewCreateResponse?>?

    /**
     * List reviews for individual watchlist screenings
     * List all reviews for the individual watchlist screening.
     * @param watchlistScreeningIndividualReviewListRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualReviewListResponse&gt;
     *
     * @see [List reviews for individual watchlist screenings Documentation](/api/products/monitor/.watchlist_screeningindividualreviewlist)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/review/list")
    fun watchlistScreeningIndividualReviewList(
        @Body watchlistScreeningIndividualReviewListRequest: WatchlistScreeningIndividualReviewListRequest?
    ): Call<WatchlistScreeningIndividualReviewListResponse?>?

    /**
     * Update individual watchlist screening
     * Update a specific individual watchlist screening. This endpoint can be used to add additional customer information, correct outdated information, add a reference id, assign the individual to a reviewer, and update which program it is associated with. Please note that you may not update &#x60;search_terms&#x60; and &#x60;status&#x60; at the same time since editing &#x60;search_terms&#x60; may trigger an automatic &#x60;status&#x60; change.
     * @param watchlistScreeningIndividualUpdateRequest  (required)
     * @return Call&lt;WatchlistScreeningIndividualUpdateResponse&gt;
     *
     * @see [Update individual watchlist screening Documentation](/api/products/monitor/.watchlist_screeningindividualupdate)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("watchlist_screening/individual/update")
    fun watchlistScreeningIndividualUpdate(
        @Body watchlistScreeningIndividualUpdateRequest: WatchlistScreeningIndividualUpdateRequest?
    ): Call<WatchlistScreeningIndividualUpdateResponse?>?

    /**
     * Get webhook verification key
     * Plaid signs all outgoing webhooks and provides JSON Web Tokens (JWTs) so that you can verify the authenticity of any incoming webhooks to your application. A message signature is included in the &#x60;Plaid-Verification&#x60; header.  The &#x60;/webhook_verification_key/get&#x60; endpoint provides a JSON Web Key (JWK) that can be used to verify a JWT.
     * @param webhookVerificationKeyGetRequest  (required)
     * @return Call&lt;WebhookVerificationKeyGetResponse&gt;
     *
     * @see [Get webhook verification key Documentation](/api/webhooks/webhook-verification/.get-webhook-verification-key)
     */
    @Headers(
        "Content-Type:application/json"
    )
    @POST("webhook_verification_key/get")
    fun webhookVerificationKeyGet(
        @Body webhookVerificationKeyGetRequest: WebhookVerificationKeyGetRequest?
    ): Call<WebhookVerificationKeyGetResponse?>?
}
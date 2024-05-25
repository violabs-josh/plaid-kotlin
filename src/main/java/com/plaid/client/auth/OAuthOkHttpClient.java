package com.plaid.client.auth;

import okhttp3.*;
import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;


public class OAuthOkHttpClient implements HttpClient {

    private final OkHttpClient client;

    public OAuthOkHttpClient() {
        this.client = new OkHttpClient();
    }

    public OAuthOkHttpClient(OkHttpClient client) {
        this.client = client;
    }

    public <T extends OAuthClientResponse> T execute(OAuthClientRequest request, Map<String, String> headers,
                                                     String requestMethod, Class<T> responseClass)
        throws OAuthSystemException, OAuthProblemException {

        MediaType mediaType = MediaType.parse("application/json");
        Request.Builder requestBuilder = new Request.Builder().url(request.getLocationUri());

        if (headers != null) {
            for (Entry<String, String> entry : headers.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("Content-Type")) {
                    mediaType = MediaType.parse(entry.getValue());
                } else {
                    requestBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
        }

        RequestBody body = request.getBody() != null ? RequestBody.create(request.getBody(), mediaType) : null;
        requestBuilder.method(requestMethod, body);

        try (Response response = client.newCall(requestBuilder.build()).execute()) {
            return execute(response, responseClass);
        } catch (IOException e) {
            throw new OAuthSystemException(e);
        }
    }

    private <T extends OAuthClientResponse> T execute(Response response, Class<T> responseClass)
        throws IOException, OAuthProblemException, OAuthSystemException {
        ResponseBody responseBody = response.body();
        String responseContentTypeString = null;
        String responseBodyString = null;

        if (responseBody != null) {
            responseBodyString = responseBody.string();
            MediaType responseContentType = responseBody.contentType();
            if (responseContentType != null) {
                responseContentTypeString = responseContentType.toString();
            }
        }

        return OAuthClientResponseFactory.createCustomResponse(
            responseBodyString,
            responseContentTypeString,
            response.code(),
            responseClass
        );
    }

    public void shutdown() {
        // Nothing to do here
    }

}

package com.ning.http.client.async.jdk;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.async.NonAsciiContentLengthTest;
import com.ning.http.client.async.ProviderUtil;

public class JDKNonAsciiContentLengthTest extends NonAsciiContentLengthTest {

    @Override
	public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
		return ProviderUtil.jdkProvider(config);
	}
}

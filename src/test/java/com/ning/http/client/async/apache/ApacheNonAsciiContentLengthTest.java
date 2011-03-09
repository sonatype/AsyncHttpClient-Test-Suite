package com.ning.http.client.async.apache;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.async.NonAsciiContentLengthTest;
import com.ning.http.client.async.ProviderUtil;

public class ApacheNonAsciiContentLengthTest extends NonAsciiContentLengthTest {

    @Override
	public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
		return ProviderUtil.apacheProvider(config);
	}
}

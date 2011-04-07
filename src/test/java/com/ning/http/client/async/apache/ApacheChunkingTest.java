package com.ning.http.client.async.apache;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.async.ChunkingTest;
import com.ning.http.client.async.ProviderUtil;
import org.testng.annotations.Test;

public class ApacheChunkingTest extends ChunkingTest {
    @Override
    public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
        return ProviderUtil.apacheProvider(config);
    }

    @Test(enabled = false)
    public void testCustomChunking() throws Throwable {
    }
}

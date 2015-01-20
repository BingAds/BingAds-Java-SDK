package com.microsoft.bingads.internal.oauth;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

public interface WebServiceCaller {

    HttpResponse post(URL requestUrl, List<NameValuePair> formValues) throws IOException;
}

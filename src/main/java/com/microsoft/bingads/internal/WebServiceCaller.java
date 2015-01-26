package com.microsoft.bingads.internal;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

interface WebServiceCaller {

    HttpResponse post(URL requestUrl, List<NameValuePair> formValues) throws IOException;
}

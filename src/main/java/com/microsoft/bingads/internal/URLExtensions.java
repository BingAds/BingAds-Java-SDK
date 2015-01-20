package com.microsoft.bingads.internal;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class URLExtensions {

    public static Map<String, String> parseQuery(URL url) {
        return parseQueryStringArgs(url.getQuery());
    }

    public static Map<String, String> parseFragment(URL url) {
        return parseQueryStringArgs(url.getRef());
    }

    public static Map<String, String> parseQueryStringArgs(String input) {
        try {
            final Map<String, String> query_pairs = new LinkedHashMap<String, String>();
            if (input == null || input.length() == 0) {
                return query_pairs;
            }
            final String[] pairs = input.split("&");
            for (String pair : pairs) {
                final int idx = pair.indexOf("=");
                final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
                final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
                query_pairs.put(key, value);
            }
            return query_pairs;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

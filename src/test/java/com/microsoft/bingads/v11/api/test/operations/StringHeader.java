package com.microsoft.bingads.v11.api.test.operations;

import javax.xml.namespace.QName;

public class StringHeader {

    private final QName name;

    private final String stringContent;

    public StringHeader(QName name, String stringContent) {
        this.name = name;

        this.stringContent = stringContent;
    }

    public QName getName() {
        return name;
    }

    public String getStringContent() {
        return stringContent;
    }
}

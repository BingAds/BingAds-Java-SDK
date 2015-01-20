package com.microsoft.bingads.internal.utilities;

import java.io.IOException;

public class UnsuccessfulFileUpload extends Exception {

    public UnsuccessfulFileUpload(IOException e) {
        super(e);
    }

    public UnsuccessfulFileUpload() {
        // TODO Auto-generated constructor stub
    }

    public UnsuccessfulFileUpload(String message) {
        super(message);
    }
}

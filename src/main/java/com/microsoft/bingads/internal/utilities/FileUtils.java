package com.microsoft.bingads.internal.utilities;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Esti Fisher on 11/19/2015.
 */
public class FileUtils {

    public static void copy(InputStream in, OutputStream out) throws IOException {

        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) >= 0) {
            out.write(buf, 0, len);
        }

    }

}

package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.internal.StringExtensions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.apache.cxf.helpers.IOUtils;

public class SimpleZipExtractor implements ZipExtractor {

    @Override
    public File extractFirstEntryToFile(File zipResultFile, File resultFile, boolean setZippedFileExtension, boolean overwrite) throws ZipException, IOException {
        ZipFile zipFile = null;
        
        try {
            zipFile = new ZipFile(zipResultFile);

            ZipEntry entry = zipFile.entries().nextElement();
            
            String zippedExtension = getFileExtension(entry.getName());
            
            File effectiveResultFile = setZippedFileExtension 
                    ? StringExtensions.changeFileExtension(resultFile, "." + zippedExtension)
                    : resultFile;

            if (!overwrite && effectiveResultFile.exists()) {
                throw new IOException(String.format("File %s already exists", effectiveResultFile));
            }

            InputStream zipFileInput = zipFile.getInputStream(entry);

            FileOutputStream tempFileOutput = null;

            try {
                tempFileOutput = new FileOutputStream(effectiveResultFile);

                IOUtils.copy(zipFileInput, tempFileOutput);
            } finally {
                if (tempFileOutput != null) {
                    tempFileOutput.close();
                }
            }

            return effectiveResultFile;
        } finally {
            if (zipFile != null) {
                zipFile.close();
            }
        }
    }

    public void compressFile(File sourceFilePath, File targetFilePath) {
        FileInputStream inputStream = null;

        ZipOutputStream zipStream = null;

        try {
            inputStream = new FileInputStream(sourceFilePath);

            zipStream = new ZipOutputStream(new FileOutputStream(targetFilePath));

            zipStream.putNextEntry(new ZipEntry(sourceFilePath.getName()));

            IOUtils.copy(inputStream, zipStream);

            zipStream.closeEntry();
        } catch (FileNotFoundException ex) {
            throw new InternalException(ex);
        } catch (IOException ex) {
            throw new InternalException(ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    throw new InternalException(ex);
                }
            }

            if (zipStream != null) {
                try {
                    zipStream.close();
                } catch (IOException ex) {
                    throw new InternalException(ex);
                }
            }
        }       
    }

    private String getFileExtension(String fileName) {
        String extension = "";
        
        int i = fileName.lastIndexOf('.');
        
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        
        return extension;
    }

}

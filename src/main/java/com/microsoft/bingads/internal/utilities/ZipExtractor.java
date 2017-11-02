package com.microsoft.bingads.internal.utilities;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

public interface ZipExtractor {

    File extractFirstEntryToFile(File zipResultFile, File resultFile, boolean setZippedFileExtension, boolean overwrite) throws ZipException, IOException;

    void compressFile(File sourceFilePath, File targetFilePath);

}

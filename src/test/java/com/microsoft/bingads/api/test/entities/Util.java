package com.microsoft.bingads.api.test.entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Util {

    public static synchronized ArrayList<BulkEntity> WriteAndReadBack(ArrayList<BulkEntity> entities) {
        ArrayList<BulkEntity> results = new ArrayList<BulkEntity>();

        try {
            File tempFile = File.createTempFile("WriteAndReadBack", ".tmp");
            BulkFileWriter writer = new BulkFileWriter(tempFile, DownloadFileType.CSV);

            for (BulkEntity entity: entities) {
                writer.writeEntity(entity);
            }

            writer.close();

            BulkFileReader reader = new BulkFileReader(tempFile, ResultFileType.FULL_DOWNLOAD, DownloadFileType.CSV);

            for (BulkEntity entity: reader.getEntities()) {
                results.add(entity);
            }

            reader.close();

            tempFile.delete();
        } catch (IOException ex) {
            Assert.fail("Exceptions while writing or reading file");
        }

        return results;
    }

    public static String toJson(Object obj) {
        ObjectWriter writer = new ObjectMapper().writer().withDefaultPrettyPrinter();

        String result = null;

        try {
            result = writer.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            Assert.fail("Cannot serialize the object to JSON");
        }

        return result;
    }
}

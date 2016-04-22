package com.microsoft.bingads.v10.api.test.entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.ResultFileType;
import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Util {

    private Util() {
    }

    public static synchronized ArrayList<BulkEntity> WriteAndReadBack(ArrayList<BulkEntity> entities) {
        ArrayList<BulkEntity> results = new ArrayList<BulkEntity>();
        try {
            String filePath = File.createTempFile("WriteAndReadBack", ".tmp").getAbsolutePath();
            BulkFileWriter writer = new BulkFileWriter(new File(filePath), DownloadFileType.CSV);
            for (BulkEntity entity: entities) {
                writer.writeEntity(entity);
            }
            writer.close();
            BulkFileReader reader = new BulkFileReader(new File(filePath), ResultFileType.FULL_DOWNLOAD, DownloadFileType.CSV);
            for (BulkEntity entity: reader.getEntities()) {
                results.add(entity);
            }
            reader.close();
            new File(filePath).delete();
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

package com.microsoft.bingads.v11.internal.bulk;

import com.googlecode.jcsv.CSVStrategy;
import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;
import com.googlecode.jcsv.reader.internal.DefaultCSVEntryParser;
import com.microsoft.bingads.v11.bulk.entities.StaticBulkObjectFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Provides a method to read one row from bulk file and return the corresponding
 * <see cref="BulkObject"/>
 *
 */
class SimpleBulkObjectReader implements BulkObjectReader {

    private BulkObjectFactory bulkObjectFactory;
    private Iterator<String[]> objectIterator;
    private Map<String, Integer> columnMapping;
    private CSVReader<String[]> csvReader;
    private boolean headersInitialized = false;

    public SimpleBulkObjectReader(File file, char delimiter) throws FileNotFoundException, UnsupportedEncodingException {
        this(new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")), new StaticBulkObjectFactory(), delimiter);
    }

    /**
     * For unit testing
     *
     * @param csvParser
     * @param factory
     * @throws FileNotFoundException
     */
    public SimpleBulkObjectReader(Reader reader, BulkObjectFactory factory, char delimiter) throws FileNotFoundException {
        this(buildCSVReader(reader, delimiter), factory);
    }

    /**
     * For unit testing
     *
     * @param csvParser
     * @param factory
     * @throws FileNotFoundException
     */
    public SimpleBulkObjectReader(CSVReader<String[]> csvReader, BulkObjectFactory factory) throws FileNotFoundException {
        this.csvReader = csvReader;
        this.objectIterator = csvReader.iterator();
        this.bulkObjectFactory = factory;
    }

    private Map<String, Integer> generateColumnMapping(String[] headers) {
        Map<String, Integer> mapping = new HashMap<String, Integer>();

        for (int i = 0; i < headers.length; i++) {
            mapping.put(headers[i], i);
        }

        return mapping;
    }

    /**
     *
     * @param reader
     * @param delimiter
     * @return a CSV reader which uses the delimiter provided
     */
    private static CSVReader<String[]> buildCSVReader(Reader reader, char delimiter) {
        try {
            // Mark the reader stream to read 1 character ahead, so that we can reset to that point if the first character is not UTF-8 BOM
            reader.mark(1);

            int read = reader.read();

            if (read != 0xFEFF) {
                reader.reset();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new CSVReaderBuilder<String[]>(reader).entryParser(new DefaultCSVEntryParser()).strategy(SimpleBulkObjectReader.createStrategyWithDelimiter(delimiter)).build();
    }

    /**
     * Create a parsing strategy using the delimiter provided
     *
     * @param delimiter The character used to separate records in the same line
     * @return a csv parsing strategy
     */
    private static CSVStrategy createStrategyWithDelimiter(char delimiter) {
        return new CSVStrategy(delimiter, '"', '#', false, true);
    }

    /**
     * Reads the next csv row values, creates a new instance of the object and
     * populates it with the row values
     *
     * @returns>Next {@link BulkObject}
     */
    @Override
    public BulkObject readNextBulkObject() {
        this.initializeHeadersIfNeeded();

        if (!objectIterator.hasNext()) {
            return null;
        }

        String[] fields = objectIterator.next();

        RowValues values = new RowValues(fields, columnMapping);
        BulkObject obj = bulkObjectFactory.createBulkObject(values);
        obj.readFromRowValues(values);

        return obj;
    }

    private void initializeHeadersIfNeeded() {
        if (!this.headersInitialized) {
            if (objectIterator.hasNext()) {
                String[] headers = objectIterator.next();
                columnMapping = generateColumnMapping(headers);
            }

            this.headersInitialized = true;
        }
    }

    @Override
    public boolean hasNext() {
        this.initializeHeadersIfNeeded();
        return objectIterator.hasNext();
    }

    @Override
    public void close() throws IOException {
        this.csvReader.close();
    }

    @Override
    public BulkObject next() {
        return this.readNextBulkObject();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

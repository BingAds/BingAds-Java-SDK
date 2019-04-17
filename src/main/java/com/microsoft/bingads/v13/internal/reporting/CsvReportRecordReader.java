package com.microsoft.bingads.v13.internal.reporting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import com.googlecode.jcsv.CSVStrategy;
import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;
import com.googlecode.jcsv.reader.internal.DefaultCSVEntryParser;

class CsvReportRecordReader implements Iterable<String[]>, AutoCloseable {

    private CSVReader<String[]> csvReader;

    CsvReportRecordReader(BufferedReader reader, char delimiter) {
        csvReader = buildCSVReader(reader, delimiter);
    }

    @Override
    public void close() throws IOException {
        csvReader.close();
    }

    @Override
    public Iterator<String[]> iterator() {
        return csvReader.iterator();
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

       return new CSVReaderBuilder<String[]>(reader).entryParser(new DefaultCSVEntryParser()).strategy(createStrategyWithDelimiter(delimiter)).build();
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

}

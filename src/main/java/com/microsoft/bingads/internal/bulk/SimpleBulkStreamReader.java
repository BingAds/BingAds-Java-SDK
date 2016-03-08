package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.entities.UnknownBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.Predicate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Reads a bulk object and also its related data (for example corresponding
 * errors) from the stream
 */
public class SimpleBulkStreamReader implements BulkStreamReader {

    private BulkObjectReader objectReader;
    private BulkObject nextObject;    
    private boolean passedFirstRow = false;

    public SimpleBulkStreamReader(File file, DownloadFileType fileFormat) throws FileNotFoundException, UnsupportedEncodingException {        
        this(new SimpleBulkObjectReader(file, fileFormat == DownloadFileType.TSV ? '\t' : ','));
    }

    public SimpleBulkStreamReader(BulkObjectReader reader) {
        objectReader = reader;
    }

    /**
     * Returns the next object from the file
     *
     * @return Next object
     */
    @Override
    public BulkObject read() {
        TryResult<BulkObject> result = tryRead(BulkObject.class);
        if (result.isSuccessful()) {
            return result.getResult();
        }

        return null;
    }

    /**
     * Reads the object only if it has a certain type
     *
     * @param <T> Type of the object
     * @param klazz The next object from the file if the object has the same
     * type as requested, null otherwise
     * @return True if object has requested type, false otherwise
     */
    @Override
    public <T extends BulkObject> TryResult<T> tryRead(Class<T> klazz) {
        return tryRead(new Predicate<T>() {
            @Override
            public boolean test(T obj) {
                return true;
            }
        }, klazz);
    }

    /**
     * Reads the object only if it matches a predicate
     *
     * @param <T> Type of the object
     * @param predicate Predicate that needs to be matched
     * @param klazz The next object from the file if the object matches the
     * predicate, null otherwise
     * @return True if object matches the predicate, false otherwise</returns>
     */
    @Override
    public <T extends BulkObject> TryResult<T> tryRead(Predicate<T> predicate, Class<T> klazz) {
        BulkObject peeked = peek();
        
        if (klazz.isInstance(peeked) && predicate.test(klazz.cast(peeked))) {
            nextObject = null;

            peeked.readRelatedDataFromStream(this);
            
            return new TryResult(true, klazz.cast(peeked));
        }

        return new TryResult(false, null);
    }

    private BulkObject peek() {
        if (!passedFirstRow) {
            BulkObject firstRowObject = objectReader.readNextBulkObject();

            if (firstRowObject instanceof UnknownBulkEntity) {
                UnknownBulkEntity formatVersion = (UnknownBulkEntity)firstRowObject;
                
                // TODO: validate format version
            } else {
                nextObject = firstRowObject;
            }
            
            passedFirstRow = true;
        }

        if (nextObject != null) {
            return nextObject;
        }

        nextObject = objectReader.readNextBulkObject();
        
        return nextObject;
    }

    @Override
    public void close() throws IOException {
        this.objectReader.close();
    }
}

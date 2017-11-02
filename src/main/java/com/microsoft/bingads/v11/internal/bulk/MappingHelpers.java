package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.v11.bulk.EntityReadException;
import com.microsoft.bingads.v11.bulk.EntityWriteException;
import java.util.List;

public class MappingHelpers {

    /**
     * Runs a series of mappings to populate an entity from CSV data
     *
     * @param values Incoming row values
     * @param mappings The mappings for that type
     * @param entity Bulk Entity to be populated
     */
    public static <T> void convertToEntity(RowValues values, List<BulkMapping<T>> mappings, T entity) {
        for (BulkMapping<T> mapping : mappings) {
            try {
                mapping.convertToEntity(values, entity);
            } catch (NumberFormatException ex) {
                throw createEntityReadException(values, mapping, ex, entity.getClass());
            } catch (UncheckedParseException ex) {
                throw createEntityReadException(values, mapping, ex, entity.getClass());
            } catch (NullPointerException ex) {
                throw createEntityReadException(values, mapping, ex, entity.getClass());
            } catch (IllegalArgumentException ex) {
                throw createEntityReadException(values, mapping, ex, entity.getClass());
            }
        }
    }

    /**
     * Runs a series of mappings to populate CSV data from an entity
     *
     * @param entity Bulk Entity to pull values from
     * @param values CSV row to be filled with data from entity
     * @param mappings The mappings between fields
     */
    public static <T> void convertToValues(T entity, RowValues values, List<BulkMapping<T>> mappings) {
        for (BulkMapping<T> mapping : mappings) {
            try {                
            mapping.convertToCsv(entity, values);
            } catch (NullPointerException ex) {
                throw createEntityWriteException(mapping, ex, entity.getClass());
            } catch (IllegalArgumentException ex) {
                throw createEntityWriteException(mapping, ex, entity.getClass());
            }
        }
    }

    private static EntityReadException createEntityReadException(RowValues values, BulkMapping mapping, Throwable exception, Class classOfT) {
        String entityType = classOfT.getSimpleName();

        String message;
        
        if (mapping instanceof SimpleBulkMapping) {
            SimpleBulkMapping simpleMapping = (SimpleBulkMapping)mapping;
            
            message = String.format("Couldn't parse column %s of %s entity: %s", 
                    simpleMapping.getHeader(null), //TODO: refactor mappings so that it doesn't require to pass an entity
                    entityType,
                    exception.getMessage());
        } else {
            message = String.format("Couldn't parse %s entity: %s", entityType, exception.getMessage());
        }
        
        message += ". See ColumnValues for detailed row information and cause for error details.";

        return new EntityReadException(message, values.toDebugString(), exception);
    }
    
    private static EntityWriteException createEntityWriteException(BulkMapping mapping, Throwable exception, Class classOfT) {
        String entityType = classOfT.getSimpleName();

        String message;
        
        if (mapping instanceof SimpleBulkMapping) {
            SimpleBulkMapping simpleMapping = (SimpleBulkMapping)mapping;
            
            message = String.format("Couldn't write column %s of %s entity: %s", 
                    simpleMapping.getHeader(null), //TODO: refactor mappings so that it doesn't require to pass an entity
                    entityType,
                    exception.getMessage());
        } else {
            message = String.format("Couldn't write %s entity: %s", entityType, exception.getMessage());
        }
        
        message += ". See cause for error details.";

        return new EntityWriteException(message, exception);
    }
}

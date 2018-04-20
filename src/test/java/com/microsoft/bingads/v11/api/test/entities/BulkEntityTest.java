package com.microsoft.bingads.v11.api.test.entities;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.internal.bulk.BulkObject;
import com.microsoft.bingads.v11.internal.bulk.RowValues;

@RunWith(Parameterized.class)
public abstract class BulkEntityTest<TEntity extends BulkObject> {

    @Parameter
    public String datum;

    protected abstract <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc);

    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc, Supplier<TEntity> creator) {
        Map<String, String> rowValues = new HashMap<String, String>();
        rowValues.put(header, input);

        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, creator, null);
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc, Supplier<TEntity> creator, EqualityComparerWithDescription<TProperty> comparer) {
        Map<String, String> rowValues = new HashMap<String, String>();
        rowValues.put(header, input);

        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, creator, comparer);
    }

    protected abstract <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc);

    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc, Supplier<TEntity> creator) {
        testReadProperty(rowValues, expectedResult, actualValueFunc, creator, null);
    }
    
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<TEntity, TProperty> actualValueFunc, Supplier<TEntity> creator, EqualityComparerWithDescription<TProperty> comparer) {
        TEntity entity = creator.get();
        entity.readFromRowValues(new RowValues(rowValues));
        TProperty actualValue = actualValueFunc.apply(entity);
        
        if (comparer == null) {
            assertThat(actualValue, is(expectedResult));
        } else {
            if (expectedResult == null) {
                assertNull(actualValue);
                
                return;
            } else {
                assertNotNull(actualValue);                                
            }
                            
            if (!comparer.equals(expectedResult, actualValue)) {
                fail(String.format("Expected: %s, actual: %s", comparer.getDescription(expectedResult), comparer.getDescription(actualValue)));
            }
        }
    }

    protected abstract <TProperty> void testWriteProperty(String header, String expectedRowValue, TProperty propertyValue,
            BiConsumer<TEntity, TProperty> setFunc);

    protected <TProperty> void testWriteProperty(String header, String expectedRowValue, TProperty propertyValue,
            BiConsumer<TEntity, TProperty> setFunc, Supplier<TEntity> creator) {
        RowValues rowValues = this.<TProperty>getRowValues(propertyValue, setFunc, creator);

        assertEquals(expectedRowValue, rowValues.get(header));
    }

    private <TProperty> RowValues getRowValues(TProperty propertyValue,
            BiConsumer<TEntity, TProperty> setFunc, Supplier<TEntity> creator) {
        TEntity entity = creator.get();

        onEntityCreation(entity);

        setFunc.accept(entity, propertyValue);

        RowValues rowValues = new RowValues();

        entity.writeToRowValues(rowValues, false);

        return rowValues;
    }

    protected abstract void onEntityCreation(TEntity entity);
}

package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.profile;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProfileCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileCriterion;

public abstract class BulkAdGroupProfileCriterionTest<T extends BulkAdGroupProfileCriterion> extends BulkEntityTest<T> {

    private Class<T> clazz;
    
    protected void setClass(Class<T> clz) {
        clazz = clz;
    }
    
    @Override
    protected void onEntityCreation(T entity) {
        ProfileCriterion criterion = new ProfileCriterion();
        criterion.setType("ProfileCriterion");
        entity.setProfileType(criterion);

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(criterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<T, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<T>() {
                    @Override
                    public T get() {
                        try {
                            return clazz.newInstance();
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<T, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<T>() {
                    @Override
                    public T get() {
                        try {
                            return clazz.newInstance();
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<T, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<T>() {
                    @Override
                    public T get() {
                        try {
                            return clazz.newInstance();
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }
        );
    }
}

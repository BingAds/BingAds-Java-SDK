package com.microsoft.bingads.api.test.entities.adgroup_product_target;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.FixedBid;
import com.microsoft.bingads.campaignmanagement.Product;
import com.microsoft.bingads.campaignmanagement.ProductCondition;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.List;
import java.util.Map;

public abstract class BulkAdGroupProductTargetTest extends BulkEntityTest<BulkAdGroupProductTarget> {

    private static final String CONDITION_PREFIX = "Test Condition ";
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkAdGroupProductTarget entity) {
        FixedBid fixedBid = new FixedBid();

        fixedBid.setBid(new Bid());

        BiddableAdGroupCriterion criterion = new BiddableAdGroupCriterion();

        criterion.setCriterionBid(fixedBid);

        criterion.setCriterion(new Product());

        entity.setBiddableAdGroupCriterion(criterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupProductTarget, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupProductTarget>() {
            @Override
            public BulkAdGroupProductTarget get() {
                return new BulkAdGroupProductTarget();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupProductTarget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupProductTarget>() {
            @Override
            public BulkAdGroupProductTarget get() {
                return new BulkAdGroupProductTarget();
            }
        });
    }

    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupProductTarget, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupProductTarget>() {
            @Override
            public BulkAdGroupProductTarget get() {
                return new BulkAdGroupProductTarget();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroupProductTarget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupProductTarget>() {
            @Override
            public BulkAdGroupProductTarget get() {
                return new BulkAdGroupProductTarget();
            }
        });
    }

    public static FixedBid createFixedBid(Double bidAmount) {
        FixedBid fixedBid = new FixedBid();
        Bid bid = new Bid();
        bid.setAmount(bidAmount);
        fixedBid.setBid(bid);
        return fixedBid;
    }

    private static ArrayOfProductCondition generateProductConditionArray(int length) {
        ArrayOfProductCondition arrayProductConditions = new ArrayOfProductCondition();
        List<ProductCondition> productConditions = arrayProductConditions.getProductConditions();

        for (int i = 1; i <= length; i++) {
            ProductCondition productCondition = new ProductCondition();
            productCondition.setAttribute(VALUE_PREFIX + i);
            productCondition.setOperand(CONDITION_PREFIX + i);
            productConditions.add(productCondition);
        }

        return arrayProductConditions;
    }

    private static String[] generateInputArray(int length, String prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix + i;
        }

        return inputs;
    }

    protected static Object[] generateTestData(int lengthProductCondition, int lengthConditions, int lengthValues) {
        ArrayOfProductCondition productConditions = generateProductConditionArray(lengthProductCondition);
        String[] conditions = generateInputArray(lengthConditions, CONDITION_PREFIX);
        String[] values = generateInputArray(lengthValues, VALUE_PREFIX);

        return new Object[]{null, productConditions, conditions, values};
    }
}

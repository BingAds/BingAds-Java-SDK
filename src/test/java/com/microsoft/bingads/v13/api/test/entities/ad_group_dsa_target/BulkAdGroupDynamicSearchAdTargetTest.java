package com.microsoft.bingads.v13.api.test.entities.ad_group_dsa_target;

import java.util.List;
import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Webpage;
import com.microsoft.bingads.v13.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperand;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperator;
import com.microsoft.bingads.v13.campaignmanagement.WebpageParameter;

public abstract class BulkAdGroupDynamicSearchAdTargetTest extends BulkEntityTest<BulkAdGroupDynamicSearchAdTarget> {

    private static final String[] CONDITION = {"Category", "PageContent", "PageTitle", "Url"};
    private static final String[] OPERATOR = {"Equals", "Contains"};
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkAdGroupDynamicSearchAdTarget entity) {
        Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        webpage.setType("Webpage");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setId(100L);
        biddableAdGroupCriterion.setCriterion(webpage);
        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupDynamicSearchAdTarget, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupDynamicSearchAdTarget, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupDynamicSearchAdTarget, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                }
        );
    }

    private static ArrayOfWebpageCondition generateWebpageConditionArray(int length) {
    	ArrayOfWebpageCondition arrayWebpageConditions = new ArrayOfWebpageCondition();
        List<WebpageCondition> webPageConditions = arrayWebpageConditions.getWebpageConditions();

        for (int i = 1; i <= length; i++) {
        	WebpageCondition webPageCondition = new WebpageCondition();
        	webPageCondition.setArgument(VALUE_PREFIX + i);
        	webPageCondition.setOperand(WebpageConditionOperand.fromValue(CONDITION[i%4]));
            webPageCondition.setOperator(WebpageConditionOperator.fromValue(OPERATOR[i%2]));
        	webPageConditions.add(webPageCondition);
        }

        return arrayWebpageConditions;
    }

    private static String[] generateInputArray(int length, String prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix + i;
        }

        return inputs;
    }
    
    private static String[] generateInputArray(int length, String[] prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix[i%prefix.length];
        }

        return inputs;
    }

    protected static Object[] generateTestData(int lengthWebpageCondition, int lengthConditions, int lengthValues) {
        ArrayOfWebpageCondition webpageConditions = generateWebpageConditionArray(lengthWebpageCondition);
        String[] conditions = generateInputArray(lengthConditions, CONDITION);
        String[] values = generateInputArray(lengthValues, VALUE_PREFIX);
        String[] operators = generateInputArray(lengthValues, OPERATOR);

        return new Object[]{null, webpageConditions, conditions, values, operators};
    }
}

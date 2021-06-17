package com.microsoft.bingads.v13.api.test.entities.remarketing_list;

import java.math.BigDecimal;
import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfRuleItem;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfRuleItemGroup;
import com.microsoft.bingads.v13.campaignmanagement.CustomEventsRule;
import com.microsoft.bingads.v13.campaignmanagement.NormalForm;
import com.microsoft.bingads.v13.campaignmanagement.NumberOperator;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsRule;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsWhoDidNotVisitAnotherPageRule;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsWhoVisitedAnotherPageRule;
import com.microsoft.bingads.v13.campaignmanagement.RemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.RuleItemGroup;
import com.microsoft.bingads.v13.campaignmanagement.StringOperator;
import com.microsoft.bingads.v13.campaignmanagement.StringRuleItem;

public abstract class BulkRemarketingListTest extends BulkEntityTest<BulkRemarketingList> {

	private static final String[] OPERAND_PAGE = {"Url", "ReferrerUrl"};
	private static final String[] OPERAND_CUSTOM = {"Category", "Label", "Action", "Value"};
	private static final String[] OPERATOR_STRING = {"Equals", "Contains", "BeginsWith", "EndsWith", "NotEquals", "DoesNotContain", "DoesNotBeginWith", "DoesNotEndWith"};
	private static final String[] OPERATOR_NUMBER = {"Equals", "GreaterThan", "LessThan", "GreaterThanEqualTo", "LessThanEqualTo"};
    
	@Override
    protected void onEntityCreation(BulkRemarketingList entity) {
        entity.setRemarketingList(new RemarketingList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkRemarketingList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }
    
    protected static Object generatePageVisitRuleTestData(String ruleType, int groupCount, int itemCount) {
    	return generatePageVisitRuleTestData(ruleType, groupCount, itemCount, NormalForm.DISJUNCTIVE);
    }
   
    protected static Object generatePageVisitRuleTestData(String ruleType, int groupCount, int itemCount, NormalForm nf) {
    	if (ruleType.equals("PageVisitors")) {
    		PageVisitorsRule pvRule = new PageVisitorsRule();
            pvRule.setType("PageVisitors");
            pvRule.setNormalForm(nf);
            pvRule.setRuleItemGroups(generateRuleItemGroup(ruleType, groupCount, itemCount));
            return pvRule; 
    	} else if (ruleType.equals("PageVisitorsWhoVisitedAnotherPage")) {
    		PageVisitorsWhoVisitedAnotherPageRule pvRule = new PageVisitorsWhoVisitedAnotherPageRule();
            pvRule.setType("PageVisitorsWhoVisitedAnotherPage");
            pvRule.setRuleItemGroups(generateRuleItemGroup(ruleType, groupCount, itemCount));
            pvRule.setAnotherRuleItemGroups(generateRuleItemGroup(ruleType, groupCount, itemCount));
            return pvRule;
    	} else if (ruleType.equals("PageVisitorsWhoDidNotVisitAnotherPage")) {
    		PageVisitorsWhoDidNotVisitAnotherPageRule pvRule = new PageVisitorsWhoDidNotVisitAnotherPageRule();
            pvRule.setType("PageVisitorsWhoDidNotVisitAnotherPage");
            pvRule.setIncludeRuleItemGroups(generateRuleItemGroup(ruleType, groupCount, itemCount));
            pvRule.setExcludeRuleItemGroups(generateRuleItemGroup(ruleType, groupCount, itemCount));
            return pvRule;
    	} else if (ruleType.equals("CustomEvents")){
    		return generateCustomRuleTestData();            
    	}
    	return null; 
    }
    
    protected static Object generateCustomRuleTestData() {
    	CustomEventsRule rule = new CustomEventsRule();
    	rule.setType("CustomEvents");
    	rule.setAction("Test Action");
    	rule.setActionOperator(StringOperator.DOES_NOT_CONTAIN);
    	rule.setCategory("Test Category");
    	rule.setCategoryOperator(StringOperator.DOES_NOT_END_WITH);
    	rule.setLabel("Test Label");
    	rule.setLabelOperator(StringOperator.NOT_EQUALS);
    	rule.setValue(new BigDecimal("23"));
    	rule.setValueOperator(NumberOperator.LESS_THAN);
    	return rule;
    }
    
    private static ArrayOfRuleItemGroup generateRuleItemGroup(String ruleType, int groupCount, int itemCount) {
    	ArrayOfRuleItemGroup ruleItemGroups = new ArrayOfRuleItemGroup();

        for (int i = 0; i < groupCount; i++) {                
            RuleItemGroup ruleItemGroup = new RuleItemGroup();
            ruleItemGroup.setItems(generateRuleItemArray(ruleType, itemCount));              
            ruleItemGroups.getRuleItemGroups().add(ruleItemGroup);    
        }
        return ruleItemGroups;
    }
    
    private static ArrayOfRuleItem generateRuleItemArray(String ruleType, int itemCount) {
    	ArrayOfRuleItem ruleItems = new ArrayOfRuleItem();
    	if (ruleType.equals("PageVisitors") || ruleType.equals("PageVisitorsWhoVisitedAnotherPage") || ruleType.equals("PageVisitorsWhoDidNotVisitAnotherPage")) {   		
            for (int i = 0; i < itemCount; i++) {
            	StringRuleItem ruleItem = new StringRuleItem();
            	ruleItem.setOperand(OPERAND_PAGE[i%2]);
            	ruleItem.setOperator(StringOperator.fromValue(OPERATOR_STRING[i%8]));
                ruleItem.setValue("Test Value");
                ruleItems.getRuleItems().add(ruleItem);
            }
    	}
    	return ruleItems;
    }
}

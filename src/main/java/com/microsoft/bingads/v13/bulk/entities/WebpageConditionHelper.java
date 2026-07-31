package com.microsoft.bingads.v13.bulk.entities;

import java.util.List;

import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperand;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperator;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

class WebpageConditionHelper {

    public static final int MaxNumberOfConditions = 3;

    public static void addRowValuesFromConditions(ArrayOfWebpageCondition arrayOfWebpageCondition, RowValues rowValues) {
        addRowValuesFromConditions(
                arrayOfWebpageCondition,
                rowValues,
                StringTable.DynamicAdTargetCondition1,
                StringTable.DynamicAdTargetValue1,
                StringTable.DynamicAdTargetConditionOperator1);
    }

    public static void addRowValuesFromConditions(ArrayOfWebpageCondition arrayOfWebpageCondition, RowValues rowValues,
            String conditionHeader1, String valueHeader1, String conditionOperatorHeader1) {
        String conditionHeaderPrefix = conditionHeader1.substring(0, conditionHeader1.length() - 1);
        String valueHeaderPrefix = valueHeader1.substring(0, valueHeader1.length() - 1);
        String conditionOperatorHeaderPrefix = conditionOperatorHeader1.substring(0, conditionOperatorHeader1.length() - 1);

        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();
        for (int i = 1; i <= conditions.size(); i++) {
            rowValues.put(valueHeaderPrefix + i, conditions.get(i - 1).getArgument());
            if (conditions.get(i - 1).getOperand() != null)
            {
			    rowValues.put(conditionHeaderPrefix + i, conditions.get(i - 1).getOperand().value());
			}
            if (conditions.get(i - 1).getOperator() != null)
            {
                rowValues.put(conditionOperatorHeaderPrefix + i, conditions.get(i - 1).getOperator().value());
            }
        }
    }

    public static void addConditionsFromRowValues(RowValues values,
    		ArrayOfWebpageCondition arrayOfWebpageCondition) {
        addConditionsFromRowValues(
                values,
                arrayOfWebpageCondition,
                StringTable.DynamicAdTargetCondition1,
                StringTable.DynamicAdTargetValue1,
                StringTable.DynamicAdTargetConditionOperator1);
    }

    public static void addConditionsFromRowValues(RowValues values,
    		ArrayOfWebpageCondition arrayOfWebpageCondition,
            String conditionHeader1, String valueHeader1, String conditionOperatorHeader1) {
        String conditionHeaderPrefix = conditionHeader1.substring(0, conditionHeader1.length() - 1);
        String valueHeaderPrefix = valueHeader1.substring(0, valueHeader1.length() - 1);
        String conditionOperatorHeaderPrefix = conditionOperatorHeader1.substring(0, conditionOperatorHeader1.length() - 1);

        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();;

        for (int i = 1; i <= MaxNumberOfConditions; i++) {
            String webpageCondition;
            String webpageValue;
            String webpageOperator;

            webpageCondition = values.tryGet(conditionHeaderPrefix + i);
            webpageValue = values.tryGet(valueHeaderPrefix + i);
            webpageOperator = values.tryGet(conditionOperatorHeaderPrefix + i);

            if (webpageCondition != null && !webpageCondition.isEmpty() && webpageValue != null && !webpageValue.isEmpty()) {
            	WebpageCondition condition = new WebpageCondition();
                condition.setArgument(webpageValue);
                condition.setOperand(StringExtensions.fromValueOptional(webpageCondition, WebpageConditionOperand.class));
                
                if (webpageOperator != null && !webpageOperator.isEmpty())
                {
                    condition.setOperator(StringExtensions.fromValueOptional(webpageOperator, WebpageConditionOperator.class));
                }
                
                conditions.add(condition);
            }
            
            
        }
    }
}

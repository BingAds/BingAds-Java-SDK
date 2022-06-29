package com.microsoft.bingads.v13.bulk.entities;

import java.util.List;

import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperand;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperator;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

class WebpageConditionHelper {

    public static final int MaxNumberOfConditions = 3;

    public static void addRowValuesFromConditions(ArrayOfWebpageCondition arrayOfWebpageCondition, RowValues rowValues) {
        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();
        for (int i = 1; i <= conditions.size(); i++) {
            rowValues.put(StringTable.DynamicAdTargetValueColumnPrefix + i, conditions.get(i - 1).getArgument());
            if (conditions.get(i - 1).getOperand() != null)
            {
			    rowValues.put(StringTable.DynamicAdTargetConditionColumnPrefix + i, conditions.get(i - 1).getOperand().value());
			}
            if (conditions.get(i - 1).getOperator() != null)
            {
                rowValues.put(StringTable.DynamicAdTargetConditionOperatorPrefix + i, conditions.get(i - 1).getOperator().value());
            }
        }
    }

    public static void addConditionsFromRowValues(RowValues values,
    		ArrayOfWebpageCondition arrayOfWebpageCondition) {
        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();;

        for (int i = 1; i <= MaxNumberOfConditions; i++) {
            String webpageCondition;
            String webpageValue;
            String webpageOperator;

            webpageCondition = values.tryGet(StringTable.DynamicAdTargetConditionColumnPrefix + i);
            webpageValue = values.tryGet(StringTable.DynamicAdTargetValueColumnPrefix + i);
            webpageOperator = values.tryGet(StringTable.DynamicAdTargetConditionOperatorPrefix + i);

            if (webpageCondition != null && !webpageCondition.isEmpty() && webpageValue != null && !webpageValue.isEmpty()) {
            	WebpageCondition condition = new WebpageCondition();
                condition.setArgument(webpageValue);
                condition.setOperand(WebpageConditionOperand.fromValue(webpageCondition));
                
                if (webpageOperator != null && !webpageOperator.isEmpty())
                {
                    condition.setOperator(WebpageConditionOperator.fromValue(webpageOperator));
                }
                
                conditions.add(condition);
            }
            
            
        }
    }
}

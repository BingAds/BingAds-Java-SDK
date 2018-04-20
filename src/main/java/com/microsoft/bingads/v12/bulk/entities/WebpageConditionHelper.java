package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v12.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v12.campaignmanagement.WebpageConditionOperand;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import java.util.List;

class WebpageConditionHelper {

    public static final int MaxNumberOfConditions = 3;

    public static void addRowValuesFromConditions(ArrayOfWebpageCondition arrayOfWebpageCondition, RowValues rowValues) {
        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();
        for (int i = 1; i <= conditions.size(); i++) {
            rowValues.put(StringTable.DynamicAdTargetConditionColumnPrefix + i, conditions.get(i - 1).getOperand().value());
            rowValues.put(StringTable.DynamicAdTargetValueColumnPrefix + i, conditions.get(i - 1).getArgument());
        }
    }

    public static void addConditionsFromRowValues(RowValues values,
    		ArrayOfWebpageCondition arrayOfWebpageCondition) {
        List<WebpageCondition> conditions = arrayOfWebpageCondition.getWebpageConditions();;

        for (int i = 1; i <= MaxNumberOfConditions; i++) {
            String webpageCondition;
            String webpageValue;

            webpageCondition = values.tryGet(StringTable.DynamicAdTargetConditionColumnPrefix + i);
            webpageValue = values.tryGet(StringTable.DynamicAdTargetValueColumnPrefix + i);

            if (webpageCondition != null && !webpageCondition.isEmpty() && webpageValue != null && !webpageValue.isEmpty()) {
            	WebpageCondition condition = new WebpageCondition();
                condition.setArgument(webpageValue);
                condition.setOperand(WebpageConditionOperand.fromValue(webpageCondition));
                conditions.add(condition);
            }
        }
    }
}

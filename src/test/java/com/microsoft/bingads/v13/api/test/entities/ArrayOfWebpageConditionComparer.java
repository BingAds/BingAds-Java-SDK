package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageCondition;

public class ArrayOfWebpageConditionComparer implements EqualityComparerWithDescription<ArrayOfWebpageCondition> {

    @Override
    public Boolean equals(ArrayOfWebpageCondition x, ArrayOfWebpageCondition y) {
        if (x.getWebpageConditions().size() != y.getWebpageConditions().size()) {
            return false;
        }
        
        for (Integer i = 0; i < x.getWebpageConditions().size(); i++) {
            if ((y.getWebpageConditions().get(i).getArgument() == null ? x.getWebpageConditions().get(i).getArgument() != null : !y.getWebpageConditions().get(i).getArgument().equals(x.getWebpageConditions().get(i).getArgument())) ||
                (y.getWebpageConditions().get(i).getOperand() == null ? x.getWebpageConditions().get(i).getOperand() != null : !y.getWebpageConditions().get(i).getOperand().value().equals(x.getWebpageConditions().get(i).getOperand().value()))) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public String getDescription(ArrayOfWebpageCondition obj) {
        String result = "";
        
        for (WebpageCondition pc : obj.getWebpageConditions()) {
            result += String.format("{argument: %s, operand: %s}, ", pc.getArgument(), pc.getOperand().value());
        }
        
        return result;
    }
    
}

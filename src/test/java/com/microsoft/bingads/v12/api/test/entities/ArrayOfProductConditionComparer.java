package com.microsoft.bingads.v12.api.test.entities;

import com.microsoft.bingads.v12.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v12.campaignmanagement.ProductCondition;

public class ArrayOfProductConditionComparer implements EqualityComparerWithDescription<ArrayOfProductCondition> {

    @Override
    public Boolean equals(ArrayOfProductCondition x, ArrayOfProductCondition y) {
        if (x.getProductConditions().size() != y.getProductConditions().size()) {
            return false;
        }
        
        for (Integer i = 0; i < x.getProductConditions().size(); i++) {
            if ((y.getProductConditions().get(i).getAttribute() == null ? x.getProductConditions().get(i).getAttribute() != null : !y.getProductConditions().get(i).getAttribute().equals(x.getProductConditions().get(i).getAttribute())) ||
                (y.getProductConditions().get(i).getOperand() == null ? x.getProductConditions().get(i).getOperand() != null : !y.getProductConditions().get(i).getOperand().equals(x.getProductConditions().get(i).getOperand()))) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public String getDescription(ArrayOfProductCondition obj) {
        String result = "";
        
        for (ProductCondition pc : obj.getProductConditions()) {
            result += String.format("{attribute: %s, operand: %s}, ", pc.getAttribute(), pc.getOperand());
        }
        
        return result;
    }
    
}

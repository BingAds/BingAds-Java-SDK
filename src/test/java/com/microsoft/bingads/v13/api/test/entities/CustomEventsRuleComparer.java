package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.CustomEventsRule;

public class CustomEventsRuleComparer implements EqualityComparerWithDescription<CustomEventsRule> {

    @Override
    public Boolean equals(CustomEventsRule x, CustomEventsRule y) {      
        if (x == null || y == null) {
        	return x == y;
        }  
        return (x.getAction().equals(y.getAction())) && (x.getActionOperator().value().equals(y.getActionOperator().value()))
        		&& (x.getCategory().equals(y.getCategory()) && (x.getCategoryOperator().value().equals(y.getCategoryOperator().value())
        		&& (x.getLabel().equals(y.getLabel()) && (x.getLabelOperator().value().equals(y.getLabelOperator().value())))))
        		&& (x.getValue().equals(y.getValue()) && x.getValueOperator().value().equals(y.getValueOperator().value()));
    }

    @Override
    public String getDescription(CustomEventsRule obj) {
        String result = "";      
        if (obj != null) {
        	result += String.format(("Action %s %s, Category %s %s, Label %s %s, Value %s %s"), obj.getActionOperator().value(), 
        			obj.getAction(), obj.getCategoryOperator().value(), obj.getCategory(), obj.getLabelOperator().value(), obj.getLabel(),
        			obj.getValueOperator().value(), obj.getValue().toString());
        }      
        return result;
    }
    
}

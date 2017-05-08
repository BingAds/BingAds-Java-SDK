package com.microsoft.bingads.v11.api.test.entities;

import java.util.List;

import com.microsoft.bingads.v11.campaignmanagement.RuleItem;
import com.microsoft.bingads.v11.campaignmanagement.RuleItemGroup;
import com.microsoft.bingads.v11.campaignmanagement.StringRuleItem;

public class RuleItemGroupsComparer{

    public static Boolean equals(List<RuleItemGroup> x, List<RuleItemGroup> y) {
    	
        if (x.size() != y.size()) {
        	return false;
        }
        for(int i = 0; i < x.size(); i++) {
        	RuleItemGroup xi = x.get(i);
        	RuleItemGroup yi = x.get(i);
        	List<RuleItem> xRuleItems = xi.getItems().getRuleItems();
        	List<RuleItem> yRuleItems = yi.getItems().getRuleItems();
        	if (xRuleItems.size() != yRuleItems.size()) {
        		return false;
        	}
        	for(int j = 0; j < xRuleItems.size(); j++) {
        		StringRuleItem xj = (StringRuleItem)xRuleItems.get(j);
        		StringRuleItem yj = (StringRuleItem)yRuleItems.get(j);
        		
        		if(!(xj.getOperand().equals(yj.getOperand()) && xj.getOperator().value().equals(yj.getOperator().value()) && 
        				xj.getValue().equals(yj.getValue()))) {
        			return false;
        		}
        	}
        }
        return true;
    }

    public static String getDescription(List<RuleItemGroup> obj) {
    	String result = "";
        
        if (obj != null) {;
        	for (RuleItemGroup ruleItemGroup: obj) {
        		for (RuleItem ruleItem: ruleItemGroup.getItems().getRuleItems()) {
        			if (ruleItem instanceof StringRuleItem) {
        				result += String.format("%s %s %s %s", ((StringRuleItem)ruleItem).getType() + ((StringRuleItem)ruleItem).getOperand(), 
        						((StringRuleItem)ruleItem).getOperator().value(), ((StringRuleItem)ruleItem).getValue());
        			}
        		}
        	}
        }      
        return result;
    }    
}

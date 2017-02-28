package com.microsoft.bingads.v10.api.test.entities;

import com.microsoft.bingads.v10.campaignmanagement.PageVisitorsWhoVisitedAnotherPageRule;

public class PageVisitorsWhoVisitedAnotherPageRuleComparer implements EqualityComparerWithDescription<PageVisitorsWhoVisitedAnotherPageRule> {

    @Override
    public Boolean equals(PageVisitorsWhoVisitedAnotherPageRule x, PageVisitorsWhoVisitedAnotherPageRule y) {      
        if (x == null || y == null) {
        	return x == y;
        }
        return RuleItemGroupsComparer.equals(x.getRuleItemGroups().getRuleItemGroups(), y.getRuleItemGroups().getRuleItemGroups()) &&
        		RuleItemGroupsComparer.equals(x.getAnotherRuleItemGroups().getRuleItemGroups(), y.getAnotherRuleItemGroups().getRuleItemGroups());   
    }

    @Override
    public String getDescription(PageVisitorsWhoVisitedAnotherPageRule obj) {
    	String result = "";      
        if (obj != null) {
        	result = RuleItemGroupsComparer.getDescription(obj.getRuleItemGroups().getRuleItemGroups()) + " " + 
        			RuleItemGroupsComparer.getDescription(obj.getAnotherRuleItemGroups().getRuleItemGroups());
        }      
        return result;
    }  
}

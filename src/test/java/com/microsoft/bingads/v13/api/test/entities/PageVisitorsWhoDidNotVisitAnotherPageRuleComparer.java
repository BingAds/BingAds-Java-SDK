package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsWhoDidNotVisitAnotherPageRule;

public class PageVisitorsWhoDidNotVisitAnotherPageRuleComparer implements EqualityComparerWithDescription<PageVisitorsWhoDidNotVisitAnotherPageRule> {

    @Override
    public Boolean equals(PageVisitorsWhoDidNotVisitAnotherPageRule x, PageVisitorsWhoDidNotVisitAnotherPageRule y) {      
        if (x == null || y == null) {
        	return x == y;
        }
        return RuleItemGroupsComparer.equals(x.getIncludeRuleItemGroups().getRuleItemGroups(), y.getIncludeRuleItemGroups().getRuleItemGroups()) &&
        		RuleItemGroupsComparer.equals(x.getExcludeRuleItemGroups().getRuleItemGroups(), y.getExcludeRuleItemGroups().getRuleItemGroups());   
    }

    @Override
    public String getDescription(PageVisitorsWhoDidNotVisitAnotherPageRule obj) {
    	String result = "";      
        if (obj != null) {
        	result = RuleItemGroupsComparer.getDescription(obj.getIncludeRuleItemGroups().getRuleItemGroups()) + " " + 
        			RuleItemGroupsComparer.getDescription(obj.getExcludeRuleItemGroups().getRuleItemGroups());
        }      
        return result;
    }  
}

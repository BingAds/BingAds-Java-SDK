package com.microsoft.bingads.v12.api.test.entities;

import com.microsoft.bingads.v12.campaignmanagement.PageVisitorsRule;

public class PageVisitorsRuleComparer implements EqualityComparerWithDescription<PageVisitorsRule> {

    @Override
    public Boolean equals(PageVisitorsRule x, PageVisitorsRule y) {      
        if (x == null || y == null) {
        	return x == y;
        }  
        return RuleItemGroupsComparer.equals(x.getRuleItemGroups().getRuleItemGroups(), y.getRuleItemGroups().getRuleItemGroups());
    }

    @Override
    public String getDescription(PageVisitorsRule obj) {
        String result = "";      
        if (obj != null) {
        	result = RuleItemGroupsComparer.getDescription(obj.getRuleItemGroups().getRuleItemGroups());
        }      
        return result;
    }
    
}

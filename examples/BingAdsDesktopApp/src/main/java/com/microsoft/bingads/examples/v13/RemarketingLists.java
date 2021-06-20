package com.microsoft.bingads.examples.v13;

import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;
import java.math.BigDecimal;

// How to associate remarketing lists with a new ad group.

public class RemarketingLists extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // Before you can track conversions or target audiences using a remarketing list 
            // you need to create a UET tag, and then add the UET tag tracking code to every page of your website.
            // For more information, please see Universal Event Tracking at https://go.microsoft.com/fwlink/?linkid=829965.

            // First you should call the GetUetTagsByIds operation to check whether a tag has already been created. 
            // You can leave the TagIds element null or empty to request all UET tags available for the customer.

            outputStatusMessage("-----\nGetUetTagsByIds:");
            GetUetTagsByIdsResponse getUetTagsByIdsResponse = CampaignManagementExampleHelper.getUetTagsByIds(
                    null);
            ArrayOfUetTag uetTags = getUetTagsByIdsResponse.getUetTags();

            // If you do not already have a UET tag that can be used, or if you need another UET tag, 
            // call the AddUetTags service operation to create a new UET tag. If the call is successful, 
            // the tracking script that you should add to your website is included in a corresponding 
            // UetTag within the response message. 

            if (uetTags == null || uetTags.getUetTags().size() < 1)
            {
                UetTag uetTag = new UetTag();
                uetTag.setDescription("My First Uet Tag");
                uetTag.setName("New Uet Tag");
                uetTags.getUetTags().add(uetTag);
                outputStatusMessage("-----\nAddUetTags:");
                uetTags = CampaignManagementExampleHelper.addUetTags(
                    uetTags).getUetTags();
            }

            if (uetTags == null || uetTags.getUetTags().size() < 1)
            {
                outputStatusMessage(
                    String.format("You do not have any UET tags registered for CustomerId {0}.", authorizationData.getCustomerId())
                );
                return;
            }

            outputStatusMessage("List of all UET Tags:");
            CampaignManagementExampleHelper.outputArrayOfUetTag(uetTags);

            // After you retreive the tracking script from the AddUetTags or GetUetTagsByIds operation, 
            // the next step is to add the UET tag tracking code to your website. 

            // We will use the same UET tag for the remainder of this example.
            java.lang.Long tagId = uetTags.getUetTags().get(0).getId();

            // Add remarketing lists that depend on the UET Tag Id retreived above.

            ArrayOfAudience addAudiences = new ArrayOfAudience();
            RemarketingList customEventsList = new RemarketingList();
            customEventsList.setDescription("New list with CustomEventsRule");
            customEventsList.setMembershipDuration(30);
            customEventsList.setName("Remarketing List with CustomEventsRule " + System.currentTimeMillis());
            customEventsList.setParentId(authorizationData.getAccountId());
            // The rule definition is translated to the following logical expression: 
            // (Category Equals video) and (Action Equals play) and (Label Equals trailer) 
            // and (Value Equals 5)
            CustomEventsRule customEventsRule = new CustomEventsRule();
            // The type of user interaction you want to track.
            customEventsRule.setAction("play");
            customEventsRule.setActionOperator(StringOperator.EQUALS);
            // The category of event you want to track. 
            customEventsRule.setCategory("video");
            customEventsRule.setCategoryOperator(StringOperator.EQUALS);
            // The name of the element that caused the action.
            customEventsRule.setLabel("trailer");
            customEventsRule.setLabelOperator(StringOperator.EQUALS);
            // A numerical value associated with that event. 
            // Could be length of the video played etc.
            customEventsRule.setValue(new BigDecimal(5.00));
            customEventsRule.setValueOperator(NumberOperator.EQUALS);
            customEventsList.setRule(customEventsRule);
            customEventsList.setScope(EntityScope.ACCOUNT);
            customEventsList.setTagId(tagId);            
            addAudiences.getAudiences().add(customEventsList);
                        
            RemarketingList pageVisitorsList = new RemarketingList();  
            pageVisitorsList.setDescription("New list with PageVisitorsRule");
            pageVisitorsList.setMembershipDuration(30);
            pageVisitorsList.setName("Remarketing List with PageVisitorsRule " + System.currentTimeMillis());
            pageVisitorsList.setParentId(authorizationData.getAccountId());
            // The rule definition is translated to the following logical expression: 
            // ((Url Contains X) and (ReferrerUrl DoesNotContain Z)) or ((Url DoesNotBeginWith Y)) 
            // or ((ReferrerUrl Equals Z))
            PageVisitorsRule pageVisitorsRule = new PageVisitorsRule();
            ArrayOfRuleItemGroup pageVisitorsRuleItemGroups = new ArrayOfRuleItemGroup();
            RuleItemGroup pageVisitorsRuleItemGroupA = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsRuleItemsA = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsRuleItemA = new StringRuleItem();
            pageVisitorsRuleItemA.setOperand("Url");
            pageVisitorsRuleItemA.setOperator(StringOperator.CONTAINS);
            pageVisitorsRuleItemA.setValue("X");
            pageVisitorsRuleItemsA.getRuleItems().add(pageVisitorsRuleItemA);   
            StringRuleItem pageVisitorsRuleItemAA = new StringRuleItem();
            pageVisitorsRuleItemAA.setOperand("ReferrerUrl");
            pageVisitorsRuleItemAA.setOperator(StringOperator.DOES_NOT_CONTAIN);
            pageVisitorsRuleItemAA.setValue("Z");
            pageVisitorsRuleItemsA.getRuleItems().add(pageVisitorsRuleItemAA);    
            pageVisitorsRuleItemGroupA.setItems(pageVisitorsRuleItemsA);
            pageVisitorsRuleItemGroups.getRuleItemGroups().add(pageVisitorsRuleItemGroupA);
            RuleItemGroup pageVisitorsRuleItemGroupB = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsRuleItemsB = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsRuleItemB = new StringRuleItem();
            pageVisitorsRuleItemB.setOperand("Url");
            pageVisitorsRuleItemB.setOperator(StringOperator.DOES_NOT_BEGIN_WITH);
            pageVisitorsRuleItemB.setValue("Y");
            pageVisitorsRuleItemsB.getRuleItems().add(pageVisitorsRuleItemB);            
            pageVisitorsRuleItemGroupB.setItems(pageVisitorsRuleItemsB);
            pageVisitorsRuleItemGroups.getRuleItemGroups().add(pageVisitorsRuleItemGroupB);
            RuleItemGroup pageVisitorsRuleItemGroupC = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsRuleItemsC = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsRuleItemC = new StringRuleItem();
            pageVisitorsRuleItemC.setOperand("ReferrerUrl");
            pageVisitorsRuleItemC.setOperator(StringOperator.EQUALS);
            pageVisitorsRuleItemC.setValue("Z");
            pageVisitorsRuleItemsC.getRuleItems().add(pageVisitorsRuleItemC);            
            pageVisitorsRuleItemGroupC.setItems(pageVisitorsRuleItemsC);
            pageVisitorsRuleItemGroups.getRuleItemGroups().add(pageVisitorsRuleItemGroupC);
            pageVisitorsRule.setRuleItemGroups(pageVisitorsRuleItemGroups);
            pageVisitorsList.setRule(pageVisitorsRule);
            pageVisitorsList.setScope(EntityScope.ACCOUNT);
            pageVisitorsList.setTagId(tagId); 
            addAudiences.getAudiences().add(pageVisitorsList);
            
            RemarketingList pageVisitorsWhoDidNotVisitAnotherPageList = new RemarketingList();        
            pageVisitorsWhoDidNotVisitAnotherPageList.setDescription("New list with PageVisitorsWhoDidNotVisitAnotherPageRule");
            pageVisitorsWhoDidNotVisitAnotherPageList.setMembershipDuration(30);
            pageVisitorsWhoDidNotVisitAnotherPageList.setName("Remarketing List with PageVisitorsWhoDidNotVisitAnotherPageRule " + System.currentTimeMillis());
            pageVisitorsWhoDidNotVisitAnotherPageList.setParentId(authorizationData.getAccountId());
            // The rule definition is translated to the following logical expression: 
            // (((Url Contains X) and (ReferrerUrl DoesNotContain Z)) or ((Url DoesNotBeginWith Y)) 
            // or ((ReferrerUrl Equals Z))) 
            // and not (((Url BeginsWith A) and (ReferrerUrl BeginsWith B)) or ((Url Contains C)))
            PageVisitorsWhoDidNotVisitAnotherPageRule pageVisitorsWhoDidNotVisitAnotherPageRule = new PageVisitorsWhoDidNotVisitAnotherPageRule();            
            ArrayOfRuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroups = new ArrayOfRuleItemGroup();
            RuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupA = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsA = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemA = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemA.setOperand("Url");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemA.setOperator(StringOperator.BEGINS_WITH);
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemA.setValue("A");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsA.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemA);   
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemAA = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemAA.setOperand("ReferrerUrl");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemAA.setOperator(StringOperator.BEGINS_WITH);
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemAA.setValue("B");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsA.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemAA);    
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupA.setItems(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsA);
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupA);
            RuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupB = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsB = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemB = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemB.setOperand("Url");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemB.setOperator(StringOperator.CONTAINS);
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemB.setValue("C");
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsB.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemB);            
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupB.setItems(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemsB);
            pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroupB);
            pageVisitorsWhoDidNotVisitAnotherPageRule.setExcludeRuleItemGroups(pageVisitorsWhoDidNotVisitAnotherPageExcludeRuleItemGroups);            
            ArrayOfRuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroups = new ArrayOfRuleItemGroup();
            RuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupA = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsA = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemA = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemA.setOperand("Url");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemA.setOperator(StringOperator.CONTAINS);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemA.setValue("X");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsA.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemA);   
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemAA = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemAA.setOperand("ReferrerUrl");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemAA.setOperator(StringOperator.DOES_NOT_CONTAIN);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemAA.setValue("Z");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsA.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemAA);    
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupA.setItems(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsA);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupA);
            RuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupB = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsB = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemB = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemB.setOperand("Url");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemB.setOperator(StringOperator.DOES_NOT_BEGIN_WITH);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemB.setValue("Y");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsB.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemB);            
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupB.setItems(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsB);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupB);
            RuleItemGroup pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupC = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsC = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemC = new StringRuleItem();
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemC.setOperand("ReferrerUrl");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemC.setOperator(StringOperator.EQUALS);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemC.setValue("Z");
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsC.getRuleItems().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemC);            
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupC.setItems(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemsC);
            pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroupC);
            pageVisitorsWhoDidNotVisitAnotherPageRule.setIncludeRuleItemGroups(pageVisitorsWhoDidNotVisitAnotherPageIncludeRuleItemGroups);
            pageVisitorsWhoDidNotVisitAnotherPageList.setRule(pageVisitorsWhoDidNotVisitAnotherPageRule);
            pageVisitorsWhoDidNotVisitAnotherPageList.setScope(EntityScope.ACCOUNT);
            pageVisitorsWhoDidNotVisitAnotherPageList.setTagId(tagId);   
            addAudiences.getAudiences().add(pageVisitorsWhoDidNotVisitAnotherPageList);

            RemarketingList pageVisitorsWhoVisitedAnotherPageList = new RemarketingList();  
            pageVisitorsWhoVisitedAnotherPageList.setDescription("New list with PageVisitorsWhoVisitedAnotherPageRule");
            pageVisitorsWhoVisitedAnotherPageList.setMembershipDuration(30);
            pageVisitorsWhoVisitedAnotherPageList.setName("Remarketing List with PageVisitorsWhoVisitedAnotherPageRule " + System.currentTimeMillis());
            pageVisitorsWhoVisitedAnotherPageList.setParentId(authorizationData.getAccountId());
            // The rule definition is translated to the following logical expression: 
            // (((Url Contains X) and (ReferrerUrl NotEquals Z)) or ((Url DoesNotBeginWith Y)) or 
            // ((ReferrerUrl Equals Z))) 
            // and (((Url BeginsWith A) and (ReferrerUrl BeginsWith B)) or ((Url Contains C)))
            PageVisitorsWhoVisitedAnotherPageRule pageVisitorsWhoVisitedAnotherPageRule = new PageVisitorsWhoVisitedAnotherPageRule();            
            ArrayOfRuleItemGroup pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroups = new ArrayOfRuleItemGroup();
            RuleItemGroup pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupA = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsA = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoVisitedAnotherPageAnotherRuleItemA = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemA.setOperand("Url");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemA.setOperator(StringOperator.BEGINS_WITH);
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemA.setValue("A");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsA.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemA);   
            StringRuleItem pageVisitorsWhoVisitedAnotherPageAnotherRuleItemAA = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemAA.setOperand("ReferrerUrl");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemAA.setOperator(StringOperator.BEGINS_WITH);
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemAA.setValue("B");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsA.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemAA);    
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupA.setItems(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsA);
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupA);
            RuleItemGroup pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupB = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsB = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoVisitedAnotherPageAnotherRuleItemB = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemB.setOperand("Url");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemB.setOperator(StringOperator.CONTAINS);
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemB.setValue("C");
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsB.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemB);            
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupB.setItems(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemsB);
            pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroupB);
            pageVisitorsWhoVisitedAnotherPageRule.setAnotherRuleItemGroups(pageVisitorsWhoVisitedAnotherPageAnotherRuleItemGroups);            
            ArrayOfRuleItemGroup pageVisitorsWhoVisitedAnotherPageRuleItemGroups = new ArrayOfRuleItemGroup();
            RuleItemGroup pageVisitorsWhoVisitedAnotherPageRuleItemGroupA = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemsA = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemA = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageRuleItemA.setOperand("Url");
            pageVisitorsWhoVisitedAnotherPageRuleItemA.setOperator(StringOperator.CONTAINS);
            pageVisitorsWhoVisitedAnotherPageRuleItemA.setValue("X");
            pageVisitorsWhoVisitedAnotherPageRuleItemsA.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageRuleItemA);   
            StringRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemAA = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageRuleItemAA.setOperand("ReferrerUrl");
            pageVisitorsWhoVisitedAnotherPageRuleItemAA.setOperator(StringOperator.DOES_NOT_CONTAIN);
            pageVisitorsWhoVisitedAnotherPageRuleItemAA.setValue("Z");
            pageVisitorsWhoVisitedAnotherPageRuleItemsA.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageRuleItemAA);    
            pageVisitorsWhoVisitedAnotherPageRuleItemGroupA.setItems(pageVisitorsWhoVisitedAnotherPageRuleItemsA);
            pageVisitorsWhoVisitedAnotherPageRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoVisitedAnotherPageRuleItemGroupA);
            RuleItemGroup pageVisitorsWhoVisitedAnotherPageRuleItemGroupB = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemsB = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemB = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageRuleItemB.setOperand("Url");
            pageVisitorsWhoVisitedAnotherPageRuleItemB.setOperator(StringOperator.DOES_NOT_BEGIN_WITH);
            pageVisitorsWhoVisitedAnotherPageRuleItemB.setValue("Y");
            pageVisitorsWhoVisitedAnotherPageRuleItemsB.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageRuleItemB);            
            pageVisitorsWhoVisitedAnotherPageRuleItemGroupB.setItems(pageVisitorsWhoVisitedAnotherPageRuleItemsB);
            pageVisitorsWhoVisitedAnotherPageRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoVisitedAnotherPageRuleItemGroupB);
            RuleItemGroup pageVisitorsWhoVisitedAnotherPageRuleItemGroupC = new RuleItemGroup();
            ArrayOfRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemsC = new ArrayOfRuleItem();
            StringRuleItem pageVisitorsWhoVisitedAnotherPageRuleItemC = new StringRuleItem();
            pageVisitorsWhoVisitedAnotherPageRuleItemC.setOperand("ReferrerUrl");
            pageVisitorsWhoVisitedAnotherPageRuleItemC.setOperator(StringOperator.EQUALS);
            pageVisitorsWhoVisitedAnotherPageRuleItemC.setValue("Z");
            pageVisitorsWhoVisitedAnotherPageRuleItemsC.getRuleItems().add(pageVisitorsWhoVisitedAnotherPageRuleItemC);            
            pageVisitorsWhoVisitedAnotherPageRuleItemGroupC.setItems(pageVisitorsWhoVisitedAnotherPageRuleItemsC);
            pageVisitorsWhoVisitedAnotherPageRuleItemGroups.getRuleItemGroups().add(pageVisitorsWhoVisitedAnotherPageRuleItemGroupC);
            pageVisitorsWhoVisitedAnotherPageRule.setRuleItemGroups(pageVisitorsWhoVisitedAnotherPageRuleItemGroups);  
            pageVisitorsWhoVisitedAnotherPageList.setRule(pageVisitorsWhoVisitedAnotherPageRule);
            pageVisitorsWhoVisitedAnotherPageList.setScope(EntityScope.ACCOUNT);
            pageVisitorsWhoVisitedAnotherPageList.setTagId(tagId);   
            addAudiences.getAudiences().add(pageVisitorsWhoVisitedAnotherPageList);    

            // RemarketingList extends the Audience base class. 
            // We manage remarketing lists with Audience operations.

            outputStatusMessage("-----\nAddAudiences:");
            AddAudiencesResponse addAudiencesResponse = CampaignManagementExampleHelper.addAudiences(
                addAudiences);
            ArrayOfNullableOflong audienceIds = addAudiencesResponse.getAudienceIds();
            ArrayOfBatchError audienceErrors = addAudiencesResponse.getPartialErrors();
            outputStatusMessage("AudienceIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(audienceIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(audienceErrors);
                            
            // Add an ad group in a campaign. The ad group will later be associated with remarketing lists.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Everyone's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns);            
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);
            
            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Everyone's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            // Applicable for all remarketing lists that are associated with this ad group. TargetAndBid indicates 
            // that you want to show ads only to people included in the remarketing list, with the option to change
            // the bid amount. Ads in this ad group will only show to people included in the remarketing list.
            ArrayOfSetting settings = new ArrayOfSetting();
            TargetSetting targetSetting = new TargetSetting();
            ArrayOfTargetSettingDetail targetSettingDetails = new ArrayOfTargetSettingDetail();
            TargetSettingDetail adGroupAudienceTargetSettingDetail = new TargetSettingDetail();
            adGroupAudienceTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.AUDIENCE);
            adGroupAudienceTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            targetSettingDetails.getTargetSettingDetails().add(adGroupAudienceTargetSettingDetail);
            targetSetting.setDetails(targetSettingDetails);
            settings.getSettings().add(targetSetting);
            adGroup.setSettings(settings);
            adGroups.getAdGroups().add(adGroup);

            outputStatusMessage("-----\nAddAdGroups:");
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(
                    campaignIds.getLongs().get(0), 
                    adGroups, 
                    false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputStatusMessage("AdGroupIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors); 
            
            // Associate all of the remarketing lists created above with the new ad group.

            ArrayOfAdGroupCriterion adGroupRemarketingListAssociations = new ArrayOfAdGroupCriterion();
            ArrayList<AudienceType> audienceTypes = new ArrayList<AudienceType>();
            audienceTypes.add(AudienceType.REMARKETING_LIST);
            
            for (java.lang.Long audienceId : audienceIds.getLongs())
            {
                if (audienceId != null)
                {
                    BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
                    biddableAdGroupCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
                    AudienceCriterion audienceCriterion = new AudienceCriterion();
                    audienceCriterion.setAudienceId(audienceId);
                    audienceCriterion.setAudienceType(audienceTypes);
                    biddableAdGroupCriterion.setCriterion(audienceCriterion);
                    BidMultiplier bidMultiplier = new BidMultiplier();
                    bidMultiplier.setMultiplier(20D);
                    biddableAdGroupCriterion.setCriterionBid(bidMultiplier);
                    biddableAdGroupCriterion.setStatus(AdGroupCriterionStatus.ACTIVE);                                        
                    adGroupRemarketingListAssociations.getAdGroupCriterions().add(biddableAdGroupCriterion);
                }
            }
            
            ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
            criterionType.add(AdGroupCriterionType.AUDIENCE);
            
            ArrayList<AdGroupCriterionType> getCriterionType = new ArrayList<AdGroupCriterionType>();
            getCriterionType.add(AdGroupCriterionType.REMARKETING_LIST);

            outputStatusMessage("-----\nAddAdGroupCriterions:");
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupRemarketingListAssociations,
                    criterionType);
            outputStatusMessage("AdGroupCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addAdGroupCriterionsResponse.getAdGroupCriterionIds());
            ArrayOfBatchErrorCollection adGroupCriterionErrors = addAdGroupCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(adGroupCriterionErrors);

            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %s", deleteCampaignIds.getLongs().get(0))); 

            // Delete the remarketing lists.

            outputStatusMessage("-----\nDeleteAudiences:");
            ArrayOflong deleteAudienceIds = new ArrayOflong();
            deleteAudienceIds.getLongs().add(audienceIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteAudiences(
                deleteAudienceIds);
            outputStatusMessage(String.format("Deleted Audience Id %s", deleteAudienceIds.getLongs().get(0)));
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
 }

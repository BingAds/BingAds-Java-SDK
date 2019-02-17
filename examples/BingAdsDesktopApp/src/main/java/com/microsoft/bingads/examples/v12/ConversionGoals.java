package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

import java.util.ArrayList;

public class ConversionGoals extends ExampleBase {

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
            ArrayOfBatchError uetTagErrors = getUetTagsByIdsResponse.getPartialErrors();
            outputStatusMessage("UetTags:");
            CampaignManagementExampleHelper.outputArrayOfUetTag(uetTags);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(uetTagErrors);

            // If you do not already have a UET tag that can be used, or if you need another UET tag, 
            // call the AddUetTags service operation to create a new UET tag. If the call is successful, 
            // the tracking script that you should add to your website is included in a corresponding 
            // UetTag within the response message.  

            if (uetTags == null || uetTags.getUetTags().size() < 1)
            {
                ArrayOfUetTag addUetTags = new ArrayOfUetTag();
                UetTag uetTag = new UetTag();
                uetTag.setDescription("My First Uet Tag");
                uetTag.setName("New Uet Tag");
                addUetTags.getUetTags().add(uetTag);
                        
                outputStatusMessage("-----\nAddUetTags:");
                AddUetTagsResponse addUetTagsResponse = CampaignManagementExampleHelper.addUetTags(addUetTags);
                uetTags = addUetTagsResponse.getUetTags();
                uetTagErrors = addUetTagsResponse.getPartialErrors();
                outputStatusMessage("UetTags:");
                CampaignManagementExampleHelper.outputArrayOfUetTag(uetTags);
                outputStatusMessage("PartialErrors:");
                CampaignManagementExampleHelper.outputArrayOfBatchError(uetTagErrors);
            }

            if (uetTags == null || uetTags.getUetTags().size() < 1)
            {
                outputStatusMessage(String.format(
                    "You do not have any UET tags registered for CustomerId {0}.", 
                    authorizationData.getCustomerId())
                );
                return;
            }

            // After you retreive the tracking script from the AddUetTags or GetUetTagsByIds operation, 
            // the next step is to add the UET tag tracking code to your website.
            // We will use the same UET tag for the remainder of this example.

            java.lang.Long tagId = uetTags.getUetTags().get(0).getId();
            
            // Add conversion goals that depend on the UET Tag Id retreived above.
            // Please note that you cannot delete conversion goals. If you want to stop 
            // tracking conversions for the goal, you can set the goal status to Paused.

            ArrayOfConversionGoal addConversionGoals = new ArrayOfConversionGoal();
            
            DurationGoal addDurationGoal = new DurationGoal();
            addDurationGoal.setConversionWindowInMinutes(30);
            addDurationGoal.setCountType(ConversionGoalCountType.ALL);
            addDurationGoal.setMinimumDurationInSeconds(60);
            addDurationGoal.setName("My Duration Goal");
            ConversionGoalRevenue addDurationGoalRevenue = new ConversionGoalRevenue();
            addDurationGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            addDurationGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            addDurationGoalRevenue.setCurrencyCode(null);
            addDurationGoal.setRevenue(addDurationGoalRevenue);
            addDurationGoal.setScope(EntityScope.ACCOUNT);
            addDurationGoal.setStatus(ConversionGoalStatus.ACTIVE);
            addDurationGoal.setTagId(tagId);
            addConversionGoals.getConversionGoals().add(addDurationGoal);
            
            EventGoal addEventGoal = new EventGoal();
            // The type of user interaction you want to track.
            addEventGoal.setActionExpression("play");
            addEventGoal.setActionOperator(ExpressionOperator.CONTAINS);
            // The category of event you want to track. 
            addEventGoal.setCategoryExpression("video");
            addEventGoal.setCategoryOperator(ExpressionOperator.CONTAINS);
            addEventGoal.setConversionWindowInMinutes(30);
            addEventGoal.setCountType(ConversionGoalCountType.ALL);
            // The name of the element that caused the action.
            addEventGoal.setLabelExpression("trailer");
            addEventGoal.setLabelOperator(ExpressionOperator.CONTAINS);
            addEventGoal.setName("My Event Goal");
            ConversionGoalRevenue addEventGoalRevenue = new ConversionGoalRevenue();
            addEventGoalRevenue.setType(ConversionGoalRevenueType.VARIABLE_VALUE);
            addEventGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            addEventGoalRevenue.setCurrencyCode(null);
            addEventGoal.setRevenue(addEventGoalRevenue);
            addEventGoal.setScope(EntityScope.ACCOUNT);
            addEventGoal.setStatus(ConversionGoalStatus.ACTIVE);
            addEventGoal.setTagId(tagId);
            // A numerical value associated with that event. 
            // Could be length of the video played etc.
            addEventGoal.setValue(new java.math.BigDecimal(5.00));
            addEventGoal.setValueOperator(ValueOperator.EQUALS);
            addConversionGoals.getConversionGoals().add(addEventGoal);
            
            PagesViewedPerVisitGoal addPagesViewedPerVisitGoal = new PagesViewedPerVisitGoal();
            addPagesViewedPerVisitGoal.setConversionWindowInMinutes(30);
            addPagesViewedPerVisitGoal.setCountType(ConversionGoalCountType.ALL);
            addPagesViewedPerVisitGoal.setMinimumPagesViewed(5);
            addPagesViewedPerVisitGoal.setName("My Pages Viewed Per Visit Goal");
            ConversionGoalRevenue addPagesViewedPerVisitGoalRevenue = new ConversionGoalRevenue();
            addPagesViewedPerVisitGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            addPagesViewedPerVisitGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            addPagesViewedPerVisitGoalRevenue.setCurrencyCode(null);
            addPagesViewedPerVisitGoal.setRevenue(addPagesViewedPerVisitGoalRevenue);
            addPagesViewedPerVisitGoal.setScope(EntityScope.ACCOUNT);
            addPagesViewedPerVisitGoal.setStatus(ConversionGoalStatus.ACTIVE);
            addPagesViewedPerVisitGoal.setTagId(tagId);
            addConversionGoals.getConversionGoals().add(addPagesViewedPerVisitGoal);
            
            UrlGoal addUrlGoal = new UrlGoal();
            addUrlGoal.setConversionWindowInMinutes(30);
            addUrlGoal.setCountType(ConversionGoalCountType.ALL);
            addUrlGoal.setName("My Url Goal");
            ConversionGoalRevenue addUrlGoalRevenue = new ConversionGoalRevenue();
            addUrlGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            addUrlGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            addUrlGoalRevenue.setCurrencyCode(null);
            addUrlGoal.setRevenue(addUrlGoalRevenue);
            addUrlGoal.setScope(EntityScope.ACCOUNT);
            addUrlGoal.setStatus(ConversionGoalStatus.ACTIVE);
            addUrlGoal.setUrlExpression("contoso");
            addUrlGoal.setUrlOperator(ExpressionOperator.CONTAINS);
            addUrlGoal.setTagId(tagId);
            addConversionGoals.getConversionGoals().add(addUrlGoal);
            
            AppInstallGoal addAppInstallGoal = new AppInstallGoal();
            // You must provide a valid app platform and app store identifier, 
            // otherwise this goal will not be added successfully. 
            addAppInstallGoal.setAppPlatform("Windows");
            addAppInstallGoal.setAppStoreId("AppStoreIdGoesHere");
            addAppInstallGoal.setConversionWindowInMinutes(30);
            addAppInstallGoal.setCountType(ConversionGoalCountType.ALL);
            addAppInstallGoal.setName("My App Install Goal");
            ConversionGoalRevenue addAppInstallGoalRevenue = new ConversionGoalRevenue();
            addAppInstallGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            addAppInstallGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            addAppInstallGoalRevenue.setCurrencyCode(null);
            addAppInstallGoal.setRevenue(addAppInstallGoalRevenue);
            // Account scope is not supported for app install goals. You can
            // set scope to Customer or don't set it for the same result.
            addAppInstallGoal.setScope(EntityScope.CUSTOMER);
            addAppInstallGoal.setStatus(ConversionGoalStatus.ACTIVE);
            // The TagId is inherited from the ConversionGoal base class,
            // however, App Install goals do not use a UET tag.
            addAppInstallGoal.setTagId(null);
            addConversionGoals.getConversionGoals().add(addAppInstallGoal);
            
            
            
            outputStatusMessage("-----\nAddConversionGoals:");
            AddConversionGoalsResponse addConversionGoalsResponse = CampaignManagementExampleHelper.addConversionGoals(
                    addConversionGoals);
            ArrayOfNullableOflong goalIds = addConversionGoalsResponse.getConversionGoalIds();
            ArrayOfBatchError conversionGoalErrors = addConversionGoalsResponse.getPartialErrors();
            outputStatusMessage("ConversionGoalIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(goalIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(conversionGoalErrors);

            // Find the conversion goals that were added successfully. 

            ArrayOflong conversionGoalIds = new ArrayOflong();
            for (java.lang.Long goalId : goalIds.getLongs())
            {
                if (goalId != null)
                {
                    conversionGoalIds.getLongs().add((long)goalId);
                }
            }

            outputStatusMessage("List of errors returned from AddConversionGoals (if any):");
            CampaignManagementExampleHelper.outputArrayOfBatchError(addConversionGoalsResponse.getPartialErrors());

            ArrayList<ConversionGoalType> conversionGoalTypes = new ArrayList<ConversionGoalType>();
            conversionGoalTypes.add(ConversionGoalType.APP_INSTALL);
            conversionGoalTypes.add(ConversionGoalType.DURATION);
            conversionGoalTypes.add(ConversionGoalType.EVENT);
            conversionGoalTypes.add(ConversionGoalType.PAGES_VIEWED_PER_VISIT);
            conversionGoalTypes.add(ConversionGoalType.URL);
            
            outputStatusMessage("-----\nGetConversionGoalsByIds:");
            GetConversionGoalsByIdsResponse getConversionGoalsByIdsResponse = CampaignManagementExampleHelper.getConversionGoalsByIds(
                    conversionGoalIds, 
                    conversionGoalTypes);
            ArrayOfConversionGoal getConversionGoals = getConversionGoalsByIdsResponse.getConversionGoals();
            conversionGoalErrors = getConversionGoalsByIdsResponse.getPartialErrors();
            outputStatusMessage("ConversionGoals:");
            CampaignManagementExampleHelper.outputArrayOfConversionGoal(getConversionGoals);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(conversionGoalErrors);

            // Update the conversion goals

            ArrayOfConversionGoal updateConversionGoals = new ArrayOfConversionGoal();
            DurationGoal updateDurationGoal = new DurationGoal();
            updateDurationGoal.setConversionWindowInMinutes(60);
            updateDurationGoal.setCountType(ConversionGoalCountType.UNIQUE);
            // You can change the conversion goal type e.g. in this example an event goal
            // had been created above at index 1. Now we are using the returned identifier
            // at index 1 to update the type from EventGoal to DurationGoal.
            updateDurationGoal.setId(conversionGoalIds.getLongs().get(1));
            updateDurationGoal.setMinimumDurationInSeconds(120);
            updateDurationGoal.setName("My Updated Duration Goal");
            ConversionGoalRevenue updateDurationGoalRevenue = new ConversionGoalRevenue();
            updateDurationGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            updateDurationGoalRevenue.setValue(new java.math.BigDecimal(10.00));
            updateDurationGoalRevenue.setCurrencyCode(null);
            updateDurationGoal.setRevenue(updateDurationGoalRevenue);
            // The Scope cannot be updated, even if you update the goal type.
            // You can either send the same value or leave Scope empty.
            updateDurationGoal.setScope(EntityScope.ACCOUNT);
            updateDurationGoal.setStatus(ConversionGoalStatus.PAUSED);
            // You can update the tag as needed. In this example we will explicitly use the same UET tag.
            // To keep the UET tag unchanged, you can also leave this element nil or empty.
            updateDurationGoal.setTagId(tagId);
            updateConversionGoals.getConversionGoals().add(updateDurationGoal);
            
            EventGoal updateEventGoal = new EventGoal();
            // For both add and update conversion goal operations, you must include one or more  
            // of the following events: 
            // ActionExpression, CategoryExpression, LabelExpression, or Value.

            // For example if you do not include ActionExpression during update, 
            // any existing ActionOperator and ActionExpression settings will be deleted.
            updateEventGoal.setActionExpression(null);
            updateEventGoal.setActionOperator(null);
            updateEventGoal.setCategoryExpression("video");
            updateEventGoal.setCategoryOperator(ExpressionOperator.EQUALS);
            updateEventGoal.setId(conversionGoalIds.getLongs().get(0));
            updateEventGoal.setConversionWindowInMinutes(30);
            updateEventGoal.setCountType(ConversionGoalCountType.ALL);
            // You cannot update the operator unless you also include the expression.
            // The following attempt to update LabelOperator will result in an error.
            updateEventGoal.setLabelExpression(null);
            updateEventGoal.setLabelOperator(ExpressionOperator.EQUALS);
            updateEventGoal.setName("My Updated Event Goal");
            ConversionGoalRevenue updateEventGoalRevenue = new ConversionGoalRevenue();
            updateEventGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            updateEventGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            updateEventGoalRevenue.setCurrencyCode(null);
            updateEventGoal.setRevenue(updateEventGoalRevenue);
            // You must specify the previous settings unless you want
            // them replaced during the update conversion goal operation.
            updateEventGoal.setValue(new java.math.BigDecimal(5.00));
            updateEventGoal.setValueOperator(ValueOperator.EQUALS);
            updateConversionGoals.getConversionGoals().add(updateEventGoal);
            
            PagesViewedPerVisitGoal updatePagesViewedPerVisitGoal = new PagesViewedPerVisitGoal();
            updatePagesViewedPerVisitGoal.setId(conversionGoalIds.getLongs().get(2));
            updatePagesViewedPerVisitGoal.setName("My Updated Pages Viewed Per Visit Goal");
            // When updating a conversion goal, if the Revenue element is nil or empty then none 
            // of the nested properties will be updated. However, if this element is not nil or empty 
            // then you are effectively replacing any existing revenue properties. For example to delete 
            // any previous revenue settings, set the Revenue element to an empty ConversionGoalRevenue object.
            ConversionGoalRevenue updatePagesViewedPerVisitGoalRevenue = new ConversionGoalRevenue();
            updatePagesViewedPerVisitGoal.setRevenue(updatePagesViewedPerVisitGoalRevenue);
            updateConversionGoals.getConversionGoals().add(updatePagesViewedPerVisitGoal);
            
            UrlGoal updateUrlGoal = new UrlGoal();
            updateUrlGoal.setId(conversionGoalIds.getLongs().get(3));
            updateUrlGoal.setName("My Updated Url Goal");
            // If not specified during update, the previous Url settings are retained.
            // If the expression is set, then the operator must also be set, and vice versa.
            updateUrlGoal.setUrlExpression("contoso");
            updateUrlGoal.setUrlOperator(ExpressionOperator.BEGINS_WITH);
            updateConversionGoals.getConversionGoals().add(updateUrlGoal);
            
            outputStatusMessage("-----\nUpdateConversionGoals:");
            UpdateConversionGoalsResponse updateConversionGoalsResponse = CampaignManagementExampleHelper.updateConversionGoals(
                    updateConversionGoals);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(updateConversionGoalsResponse.getPartialErrors());
            
            outputStatusMessage("-----\nGetConversionGoalsByIds:");
            getConversionGoalsByIdsResponse = CampaignManagementExampleHelper.getConversionGoalsByIds(
                    conversionGoalIds, 
                    conversionGoalTypes);
            getConversionGoals = getConversionGoalsByIdsResponse.getConversionGoals();
            conversionGoalErrors = getConversionGoalsByIdsResponse.getPartialErrors();
            outputStatusMessage("ConversionGoals:");
            CampaignManagementExampleHelper.outputArrayOfConversionGoal(getConversionGoals);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(conversionGoalErrors);
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }     
}
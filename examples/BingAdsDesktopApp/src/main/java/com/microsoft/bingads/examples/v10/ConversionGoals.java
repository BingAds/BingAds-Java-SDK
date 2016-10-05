package com.microsoft.bingads.examples.v10;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import static com.microsoft.bingads.examples.v10.ExampleBase.outputUetTag;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class ConversionGoals extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */

    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);
	         
            CampaignService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // Before you can track conversions or target audiences using a remarketing list, 
            // you need to create a UET tag in Bing Ads (web application or API) and then 
            // add the UET tag tracking code to every page of your website. For more information, please see 
            // Universal Event Tracking at https://msdn.microsoft.com/library/bing-ads-universal-event-tracking-guide.aspx.

            // First you should call the GetUetTagsByIds operation to check whether a tag has already been created. 
            // You can leave the TagIds element null or empty to request all UET tags available for the customer.

            ArrayOfUetTag uetTags = getUetTagsByIds(null).getUetTags();

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
                        
                uetTags = addUetTags(addUetTags).getUetTags();
            }

            if (uetTags == null || uetTags.getUetTags().size() < 1)
            {
                outputStatusMessage(
                    String.format("You do not have any UET tags registered for CustomerId {0}.\n", authorizationData.getCustomerId())
                );
                return;
            }

            outputStatusMessage("List of all UET Tags:\n");
            for (UetTag uetTag : uetTags.getUetTags())
            {
                outputUetTag(uetTag);
            }

            // After you retreive the tracking script from the AddUetTags or GetUetTagsByIds operation, 
            // the next step is to add the UET tag tracking code to your website. We recommend that you, 
            // or your website administrator, add it to your entire website in either the head or body sections. 
            // If your website has a master page, then that is the best place to add it because you add it once 
            // and it is included on all pages. For more information, please see 
            // Universal Event Tracking at https://msdn.microsoft.com/library/bing-ads-universal-event-tracking-guide.aspx.


            // We will use the same UET tag for the remainder of this example.

            java.lang.Long tagId = uetTags.getUetTags().get(0).getId();

            // Optionally you can update the name and description of a UetTag with the UpdateUetTags operation.

            outputStatusMessage("UET Tag BEFORE update:\n");
            outputUetTag(uetTags.getUetTags().get(0));

            uetTags = new ArrayOfUetTag();
            UetTag updateUetTag = new UetTag();
            updateUetTag.setDescription("Updated Uet Tag Description");
            updateUetTag.setId(tagId);
            updateUetTag.setName("Updated Uet Tag Name " + System.currentTimeMillis());
            uetTags.getUetTags().add(updateUetTag);
            
            updateUetTags(uetTags);

            ArrayOflong tagIds = new ArrayOflong();
            tagIds.getLongs().add(tagId);
            uetTags = getUetTagsByIds(tagIds).getUetTags();

            outputStatusMessage("UET Tag AFTER update:\n");
            outputUetTag(uetTags.getUetTags().get(0));
            
            // Add conversion goals that depend on the UET Tag Id retreived above.
            // Please note that you cannot delete conversion goals. If you want to stop 
            // tracking conversions for the goal, you can set the goal status to Paused.

            ArrayOfConversionGoal addConversionGoals = new ArrayOfConversionGoal();
            
            DurationGoal addDurationGoal = new DurationGoal();
            addDurationGoal.setConversionWindowInMinutes(30);
            addDurationGoal.setCountType(ConversionGoalCountType.ALL);
            addDurationGoal.setMinimumDurationInSeconds(60);
            addDurationGoal.setName("My Duration Goal " + System.currentTimeMillis());
            ConversionGoalRevenue addDurationGoalRevenue = new ConversionGoalRevenue();
            addDurationGoalRevenue.setType(ConversionGoalRevenueType.VARIABLE_VALUE);
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
            addEventGoal.setName("My Event Goal " + System.currentTimeMillis());
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
            addPagesViewedPerVisitGoal.setName("My Pages Viewed Per Visit Goal " + System.currentTimeMillis());
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
            addUrlGoal.setName("My Url Goal " + System.currentTimeMillis());
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
            addAppInstallGoal.setName("My App Install Goal " + System.currentTimeMillis());
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
            
            AddConversionGoalsResponse addConversionGoalsResponse = addConversionGoals(addConversionGoals);

            // Find the conversion goals that were added successfully. 

            ArrayOflong conversionGoalIds = new ArrayOflong();
            for (java.lang.Long goalId : addConversionGoalsResponse.getConversionGoalIds().getLongs())
            {
                if (goalId != null)
                {
                    conversionGoalIds.getLongs().add((long)goalId);
                }
            }

            outputStatusMessage("List of errors returned from AddConversionGoals (if any):\n");
            outputPartialErrors(addConversionGoalsResponse.getPartialErrors());

            ArrayList<ConversionGoalType> conversionGoalTypes = new ArrayList<ConversionGoalType>();
            conversionGoalTypes.add(ConversionGoalType.APP_INSTALL);
            conversionGoalTypes.add(ConversionGoalType.DURATION);
            conversionGoalTypes.add(ConversionGoalType.EVENT);
            conversionGoalTypes.add(ConversionGoalType.PAGES_VIEWED_PER_VISIT);
            conversionGoalTypes.add(ConversionGoalType.URL);
            
            ArrayOfConversionGoal getConversionGoals = 
                getConversionGoalsByIds(conversionGoalIds, conversionGoalTypes).getConversionGoals();

            outputStatusMessage("List of conversion goals BEFORE update:\n");
            for (ConversionGoal conversionGoal : getConversionGoals.getConversionGoals())
            {
                outputConversionGoal(conversionGoal);
            }

            ArrayOfConversionGoal updateConversionGoals = new ArrayOfConversionGoal();
            DurationGoal updateDurationGoal = new DurationGoal();
            updateDurationGoal.setConversionWindowInMinutes(60);
            updateDurationGoal.setCountType(ConversionGoalCountType.UNIQUE);
            // You can change the conversion goal type e.g. in this example an event goal
            // had been created above at index 1. Now we are using the returned identifier
            // at index 1 to update the type from EventGoal to DurationGoal.
            updateDurationGoal.setId(conversionGoalIds.getLongs().get(1));
            updateDurationGoal.setMinimumDurationInSeconds(120);
            updateDurationGoal.setName("My Updated Duration Goal " + System.currentTimeMillis());
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
            updateEventGoal.setName("My Updated Event Goal " + System.currentTimeMillis());
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
            updatePagesViewedPerVisitGoal.setName("My Updated Pages Viewed Per Visit Goal " + System.currentTimeMillis());
            // When updating a conversion goal, if the Revenue element is nil or empty then none 
            // of the nested properties will be updated. However, if this element is not nil or empty 
            // then you are effectively replacing any existing revenue properties. For example to delete 
            // any previous revenue settings, set the Revenue element to an empty ConversionGoalRevenue object.
            ConversionGoalRevenue updatePagesViewedPerVisitGoalRevenue = new ConversionGoalRevenue();
            updatePagesViewedPerVisitGoal.setRevenue(updatePagesViewedPerVisitGoalRevenue);
            updateConversionGoals.getConversionGoals().add(updatePagesViewedPerVisitGoal);
            
            UrlGoal updateUrlGoal = new UrlGoal();
            updateUrlGoal.setId(conversionGoalIds.getLongs().get(3));
            updateUrlGoal.setName("My Url Goal " + System.currentTimeMillis());
            // If not specified during update, the previous Url settings are retained.
            updateUrlGoal.setUrlExpression(null);
            updateUrlGoal.setUrlOperator(ExpressionOperator.BEGINS_WITH);
            updateConversionGoals.getConversionGoals().add(updateUrlGoal);
            

            UpdateConversionGoalsResponse updateConversionGoalsResponse = updateConversionGoals(updateConversionGoals);
            
            outputStatusMessage("List of errors returned from UpdateConversionGoals (if any):\n");
            outputPartialErrors(updateConversionGoalsResponse.getPartialErrors());

            getConversionGoals = 
                getConversionGoalsByIds(conversionGoalIds, conversionGoalTypes).getConversionGoals();

            outputStatusMessage("List of conversion goals AFTER update:\n");
            for (ConversionGoal conversionGoal : getConversionGoals.getConversionGoals())
            {
                outputConversionGoal(conversionGoal);
            }

            outputStatusMessage("Program execution completed\n"); 

        // Campaign Management service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                outputStatusMessage("AdApiError\n");
                outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Campaign Management service operations can throw ApiFaultDetail.
        } catch (ApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
        } catch (RemoteException ex) {
            outputStatusMessage("Service communication error encountered: ");
            outputStatusMessage(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            outputStatusMessage("Error encountered: ");
            outputStatusMessage(ex.getMessage());
            ex.printStackTrace();
        }
     }

    // Adds one or more conversion goals.

    static AddConversionGoalsResponse addConversionGoals(ArrayOfConversionGoal conversionGoals) throws RemoteException, Exception
    {
        AddConversionGoalsRequest request = new AddConversionGoalsRequest();

        request.setConversionGoals(conversionGoals);

        return CampaignService.getService().addConversionGoals(request);
    }
    
    // Gets one or more conversion goals for the specified conversion goal identifiers.

    static GetConversionGoalsByIdsResponse getConversionGoalsByIds(
            com.microsoft.bingads.v10.campaignmanagement.ArrayOflong conversionGoalIds,
            ArrayList<ConversionGoalType> conversionGoalTypes) throws RemoteException, Exception
    {
        GetConversionGoalsByIdsRequest request = new GetConversionGoalsByIdsRequest();

        request.setConversionGoalIds(conversionGoalIds);
        request.setConversionGoalTypes(conversionGoalTypes);

        return CampaignService.getService().getConversionGoalsByIds(request);
    }
    
    // Updates one or more conversion goals.

    static UpdateConversionGoalsResponse updateConversionGoals(ArrayOfConversionGoal conversionGoals) throws RemoteException, Exception
    {
        UpdateConversionGoalsRequest request = new UpdateConversionGoalsRequest();

        request.setConversionGoals(conversionGoals);

        return CampaignService.getService().updateConversionGoals(request);
    }
         
    // Adds one or more UET tags.

    static AddUetTagsResponse addUetTags(ArrayOfUetTag uetTags) throws RemoteException, Exception
    {
        AddUetTagsRequest request = new AddUetTagsRequest();

        request.setUetTags(uetTags);

        return CampaignService.getService().addUetTags(request);
    }
     
    // Gets one or more UET Tags.

    static GetUetTagsByIdsResponse getUetTagsByIds(
            com.microsoft.bingads.v10.campaignmanagement.ArrayOflong tagIds) throws RemoteException, Exception
    {
        GetUetTagsByIdsRequest request = new GetUetTagsByIdsRequest();

        request.setTagIds(tagIds);

        return CampaignService.getService().getUetTagsByIds(request);
    }
    
    // Updates one or more UET tags.

    static UpdateUetTagsResponse updateUetTags(ArrayOfUetTag uetTags) throws RemoteException, Exception
    {
        UpdateUetTagsRequest request = new UpdateUetTagsRequest();

        request.setUetTags(uetTags);

        return CampaignService.getService().updateUetTags(request);
    }
 }
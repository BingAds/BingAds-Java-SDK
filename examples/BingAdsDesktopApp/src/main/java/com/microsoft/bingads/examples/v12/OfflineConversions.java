package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.TimeZone;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class OfflineConversions extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            java.lang.String offlineConversionGoalName = "My Offline Conversion Goal " + System.currentTimeMillis();
            
            ArrayOfConversionGoal conversionGoals = new ArrayOfConversionGoal();
            
            OfflineConversionGoal offlineConversionGoal = new OfflineConversionGoal();
            // Determines how long after a click that you want to count offline conversions. 
            offlineConversionGoal.setConversionWindowInMinutes(43200);
            // If the count type is 'Unique' then only the first offline conversion will be counted.
            // By setting the count type to 'All', then all offline conversions for the same
            // MicrosoftClickId with different conversion times will be added cumulatively. 
            offlineConversionGoal.setCountType(ConversionGoalCountType.ALL);
            offlineConversionGoal.setName(offlineConversionGoalName);
            // The default conversion currency code and value. Each offline conversion can override it.
            ConversionGoalRevenue offlineConversionGoalRevenue = new ConversionGoalRevenue();
            offlineConversionGoalRevenue.setType(ConversionGoalRevenueType.FIXED_VALUE);
            offlineConversionGoalRevenue.setValue(new java.math.BigDecimal(5.00));
            offlineConversionGoalRevenue.setCurrencyCode(null);
            offlineConversionGoal.setRevenue(offlineConversionGoalRevenue);
            offlineConversionGoal.setScope(EntityScope.ACCOUNT);
            offlineConversionGoal.setStatus(ConversionGoalStatus.ACTIVE);
            offlineConversionGoal.setTagId(null);
            conversionGoals.getConversionGoals().add(offlineConversionGoal);
            
            outputStatusMessage("Add conversion goal...\n");
            AddConversionGoalsResponse addConversionGoalsResponse = CampaignManagementExampleHelper.addConversionGoals(conversionGoals);

            ArrayOflong conversionGoalIds = new ArrayOflong();
            for (java.lang.Long goalId : addConversionGoalsResponse.getConversionGoalIds().getLongs())
            {
                if (goalId != null)
                {
                    conversionGoalIds.getLongs().add((long)goalId);
                }
            }
            
            ArrayList<ConversionGoalType> conversionGoalTypes = new ArrayList<ConversionGoalType>();
            conversionGoalTypes.add(ConversionGoalType.OFFLINE_CONVERSION);
            ArrayOfConversionGoal getConversionGoals = 
                CampaignManagementExampleHelper.getConversionGoalsByIds(conversionGoalIds, conversionGoalTypes).getConversionGoals();

            CampaignManagementExampleHelper.outputArrayOfConversionGoal(getConversionGoals);
            
            // Every time you create a new OfflineConversionGoal via either the Bing Ads web application or Campaign Management API, 
            // the MSCLKIDAutoTaggingEnabled value of the corresponding AccountProperty is set to 'true' automatically.
            // We can confirm the setting now.
            
            ArrayOfAccountPropertyName accountPropertyNames = new ArrayOfAccountPropertyName();
            accountPropertyNames.getAccountPropertyNames().add(AccountPropertyName.MSCLKID_AUTO_TAGGING_ENABLED);

            outputStatusMessage("Get account properties...\n");
            GetAccountPropertiesResponse getAccountPropertiesResponse = CampaignManagementExampleHelper.getAccountProperties(accountPropertyNames);
            CampaignManagementExampleHelper.outputArrayOfAccountProperty(getAccountPropertiesResponse.getAccountProperties());

            ArrayOfOfflineConversion offlineConversions = new ArrayOfOfflineConversion();
            OfflineConversion offlineConversion = new OfflineConversion();             
            // If you do not specify an offline conversion currency code, 
            // then the 'CurrencyCode' element of the goal's 'ConversionGoalRevenue' is used.
            offlineConversion.setConversionCurrencyCode("USD");
            // The conversion name must match the 'Name' of the 'OfflineConversionGoal'.
            // If it does not match you won't observe any error, although the offline
            // conversion will not be counted.
            offlineConversion.setConversionName(offlineConversionGoalName);
            // The date and time must be in UTC, should align to the date and time of the 
            // recorded click (MicrosoftClickId), and cannot be in the future.
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
            calendar.set(2018, 4, 26, 0, 0, 0);
            offlineConversion.setConversionTime(calendar);
            // If you do not specify an offline conversion value, 
            // then the 'Value' element of the goal's 'ConversionGoalRevenue' is used.
            offlineConversion.setConversionValue(10D);
            offlineConversion.setMicrosoftClickId("f894f652ea334e739002f7167ab8f8e3");
            
            offlineConversions.getOfflineConversions().add(offlineConversion);

            // After the OfflineConversionGoal is set up, wait two hours before sending Bing Ads the offline conversions. 
            // This example would not succeed in production because we created the goal very recently i.e., 
            // please see above call to AddConversionGoalsAsync. 

            outputStatusMessage("Apply the offline conversion...\n");
            ApplyOfflineConversionsResponse applyOfflineConversionsResponse = CampaignManagementExampleHelper.applyOfflineConversions(offlineConversions);
            CampaignManagementExampleHelper.outputArrayOfOfflineConversion(offlineConversions);

            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
 }

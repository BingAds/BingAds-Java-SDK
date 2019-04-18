package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class Budgets extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(); 
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);
                        
            // Add a budget that can be shared by campaigns in the same account.
                        
            ArrayOfBudget budgets = new ArrayOfBudget();
            Budget addBudget = new Budget();
            addBudget.setAmount(new java.math.BigDecimal(50));
            addBudget.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            addBudget.setName("My Shared Budget " + System.currentTimeMillis());
            budgets.getBudgets().add(addBudget);

            outputStatusMessage("-----\nAddBudgets:");
            AddBudgetsResponse addBudgetsResponse = CampaignManagementExampleHelper.addBudgets(
                    budgets);
            ArrayOfNullableOflong budgetIds = addBudgetsResponse.getBudgetIds();
            ArrayOfBatchError budgetErrors = addBudgetsResponse.getPartialErrors();
            outputStatusMessage("BudgetIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(budgetIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(budgetErrors);

            // Add a search campaign

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            // We'll use the shared budget instead of defining a daily amount for this campaign.
            campaign.setBudgetId(budgetIds.getLongs().get(0)); 
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(null);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
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
            
            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d", deleteCampaignIds.getLongs().get(0))); 
            
            // Delete the account's shared budget. 

            outputStatusMessage("-----\nDeleteBudgets:");
            ArrayOflong deleteBudgetIds = new ArrayOflong();
            deleteBudgetIds.getLongs().add(budgetIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteBudgets(
                    deleteBudgetIds);
            outputStatusMessage(String.format("Deleted Budget Id %d\n", deleteBudgetIds.getLongs().get(0)));
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }    
 }

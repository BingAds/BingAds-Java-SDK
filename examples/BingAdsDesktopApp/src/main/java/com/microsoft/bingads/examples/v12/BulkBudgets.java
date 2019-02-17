package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.v12.campaignmanagement.*;
import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.bulk.BulkEntityIterable;
import static com.microsoft.bingads.examples.v12.BulkExampleBase.BulkServiceManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkBudgets extends BulkExampleBase {
	                
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);
            
            List<BulkEntity> uploadEntities = new ArrayList<>();
                                 
            // Add a budget that can be shared by campaigns in the same account.    
            
            BulkBudget bulkBudget = new BulkBudget();
            bulkBudget.setClientId("YourClientIdGoesHere");
            Budget budget = new Budget();
            budget.setId(budgetIdKey);
            budget.setAmount(new java.math.BigDecimal(50));
            budget.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            budget.setName("My Shared Budget " + System.currentTimeMillis());
            bulkBudget.setBudget(budget);
            
            uploadEntities.add(bulkBudget);
                        
            BulkCampaign bulkCampaign = new BulkCampaign();
            Campaign campaign = new Campaign();
            // You must set either the shared budget ID or daily amount.
            campaign.setBudgetId(budgetIdKey);
            campaign.setBudgetType(null);
            campaign.setDailyBudget(null);
            campaign.setId(campaignIdKey);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            bulkCampaign.setCampaign(campaign);

            uploadEntities.add(bulkCampaign);
            
            // Upload and write the output

            outputStatusMessage("-----\nAdding shared budget and campaign...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            List<BulkCampaign> campaignResults = new ArrayList<>();
            List<BulkBudget> budgetResults = new ArrayList<>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkBudget) {
                        budgetResults.add((BulkBudget) entity);
                        outputBulkBudgets(Arrays.asList((BulkBudget) entity) );
                }
                else if (entity instanceof BulkCampaign) {
                        campaignResults.add((BulkCampaign) entity);
                        outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
                             
            // Delete the campaign and everything it contains e.g., ad groups and ads.
            // Delete the account's shared budget. 

            uploadEntities = new ArrayList<>();

            for (BulkBudget budgetResult : budgetResults){
                budgetResult.setStatus(Status.DELETED);
                uploadEntities.add(budgetResult);
            }
            
            for (BulkCampaign campaignResult : campaignResults){
                campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
                uploadEntities.add(campaignResult);
            }

            // Upload and write the output
            
            outputStatusMessage("-----\nDeleting the campaign and shared budget...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkBudget) {
                    outputBulkBudgets(Arrays.asList((BulkBudget) entity) );
                }
                else if (entity instanceof BulkCampaign) {
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
            }
            
            downloadEntities.close();
            Reader.close();
        }
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    outputStatusMessage(ex.getMessage());
                }
            }
        }
    }
}

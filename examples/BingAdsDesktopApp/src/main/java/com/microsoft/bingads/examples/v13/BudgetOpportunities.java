package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.v13.adinsight.*;

import java.util.ArrayList;

public class BudgetOpportunities extends ExampleBase {

    static ServiceClient<IAdInsightService> AdInsightService;
    static ServiceClient<ICampaignManagementService> CampaignService;
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData();
	         
            AdInsightExampleHelper.AdInsightService = new ServiceClient<IAdInsightService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    IAdInsightService.class);
            
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);
	         
            // Get the budget opportunities for each campaign in the current account.

            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.AUDIENCE);
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaignTypes.add(CampaignType.SHOPPING);
            campaignTypes.add(CampaignType.SEARCH);
                                    
            outputStatusMessage("-----\nGetCampaignsByAccountId:");
            GetCampaignsByAccountIdResponse getCampaignsByAccountIdResponse = CampaignManagementExampleHelper.getCampaignsByAccountId(
                authorizationData.getAccountId(),
                campaignTypes
            );
            ArrayOfCampaign campaigns = getCampaignsByAccountIdResponse.getCampaigns();
            outputStatusMessage("Campaigns:");
            CampaignManagementExampleHelper.outputArrayOfCampaign(campaigns);  
            
            ArrayOfBudgetOpportunity opportunities = null;
            
            for (Campaign campaign : campaigns.getCampaigns())
            {
                if (campaign.getId() != null)
                {
                    outputStatusMessage("-----\nGetBudgetOpportunities:");
                    opportunities = AdInsightExampleHelper.getBudgetOpportunities(
                            (long)campaign.getId()).getOpportunities();
                    outputStatusMessage("Opportunities:");
                    AdInsightExampleHelper.outputArrayOfBudgetOpportunity(opportunities);
                }
            }        
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}

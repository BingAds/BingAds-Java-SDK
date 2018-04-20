package com.microsoft.bingads.examples.v11;

import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.campaignmanagement.*;
import com.microsoft.bingads.v11.adinsight.*;

public class BudgetOpportunities extends ExampleBase {

    static ServiceClient<IAdInsightService> AdInsightService;
    static ServiceClient<ICampaignManagementService> CampaignService;
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            AdInsightExampleHelper.AdInsightService = new ServiceClient<IAdInsightService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    IAdInsightService.class);
            
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);
	         
            // Get the budget opportunities for each campaign in the current authenticated account.

            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.SEARCH_AND_CONTENT);
            ArrayOfCampaign campaigns = CampaignManagementExampleHelper.getCampaignsByAccountId(authorizationData.getAccountId(), campaignTypes).getCampaigns();
            
            ArrayOfBudgetOpportunity opportunities = null;
            
            for (Campaign campaign : campaigns.getCampaigns())
            {
                if (campaign.getId() != null)
                {
                    opportunities = AdInsightExampleHelper.getBudgetOpportunities((long)campaign.getId()).getOpportunities();
                    AdInsightExampleHelper.outputArrayOfBudgetOpportunity(opportunities);
                }
            }
        
        } catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
}

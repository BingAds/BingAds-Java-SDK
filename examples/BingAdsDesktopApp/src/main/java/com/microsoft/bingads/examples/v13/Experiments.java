package com.microsoft.bingads.examples.v13;

import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.*;

public class Experiments extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(); 
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);
            
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.SEARCH);   
            
            // Choose a base campaign for the experiment.
                        
            outputStatusMessage("-----\nGetCampaignsByAccountId:");
            GetCampaignsByAccountIdResponse getCampaignsByAccountIdResponse = CampaignManagementExampleHelper.getCampaignsByAccountId(
                authorizationData.getAccountId(),
                campaignTypes);
            ArrayOfCampaign campaigns = getCampaignsByAccountIdResponse.getCampaigns();
            outputStatusMessage("Campaigns:");
            CampaignManagementExampleHelper.outputArrayOfCampaign(campaigns);  
            
            // The base campaign cannot be an experiment of another base campaign
            // i.e., the campaign's ExperimentId must be nil. 
            // Likewise the base campaign cannot use a shared budget
            // i.e., the campaign's BudgetId must be nil. 

            Campaign baseCampaign = null;
            if (baseCampaign == null) baseCampaign = campaigns.getCampaigns().stream().filter(
                    campaign -> campaign.getExperimentId() == null && campaign.getBudgetId() == null).findFirst().orElse(null);
            
            if (baseCampaign == null)
            {
                outputStatusMessage("You do not have any campaigns that are eligible for experiments.");
                return;
            }

            // Create the experiment
            
            ArrayOfExperiment experiments = new ArrayOfExperiment();
            Experiment experiment = new Experiment();
            experiment.setBaseCampaignId(baseCampaign.getId());
            Calendar calendar = Calendar.getInstance();
            experiment.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            experiment.getEndDate().setDay(31);
            experiment.getEndDate().setMonth(12);
            experiment.getEndDate().setYear(calendar.get(Calendar.YEAR));
            experiment.setExperimentCampaignId(null);
            experiment.setExperimentStatus("Active");
            experiment.setExperimentType(null);
            experiment.setId(null);
            experiment.setName(baseCampaign.getName() + "-Experiment");
            experiment.setStartDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            experiment.getStartDate().setDay(calendar.get(Calendar.DAY_OF_MONTH));
            experiment.getStartDate().setMonth(calendar.get(Calendar.MONTH) + 1);
            experiment.getStartDate().setYear(calendar.get(Calendar.YEAR));
            experiment.setTrafficSplitPercent(50);
            experiments.getExperiments().add(experiment);

            outputStatusMessage("-----\nAddExperiments:");
            AddExperimentsResponse addExperimentsResponse = CampaignManagementExampleHelper.addExperiments(
                    experiments);
            ArrayOfNullableOflong nullableExperimentIds = addExperimentsResponse.getExperimentIds();
            ArrayOfBatchError experimentErrors = addExperimentsResponse.getPartialErrors();
            outputStatusMessage("ExperimentIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableExperimentIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(experimentErrors);

            outputStatusMessage("-----\nGetExperimentsByIds:");
            ArrayOflong experimentIds = new ArrayOflong();
            experimentIds.getLongs().add(nullableExperimentIds.getLongs().get(0));
            GetExperimentsByIdsResponse getExperimentsByIdsResponse = CampaignManagementExampleHelper.getExperimentsByIds(experimentIds,
                    null);
            experiments = getExperimentsByIdsResponse.getExperiments();
            outputStatusMessage("Experiments:");
            CampaignManagementExampleHelper.outputArrayOfExperiment(experiments);

            experiment = experiments.getExperiments().get(0);

            // If the experiment is in a Graduated state, then the former experiment campaign 
            // is now an independent campaign that must be deleted separately. 
            // Otherwise if you delete the base campaign (not shown here), 
            // the experiment campaign and experiment itself are also deleted.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong campaignIds = new ArrayOflong();
            campaignIds.getLongs().add(experiment.getExperimentCampaignId());
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    campaignIds);
            outputStatusMessage(String.format("Deleted Experiment Campaign Id %s with Status '%s'",
                experiment.getExperimentCampaignId(),
                experiment.getExperimentStatus()));

            outputStatusMessage("-----\nDeleteExperiments:");
            CampaignManagementExampleHelper.deleteExperiments(
                    experimentIds);
            outputStatusMessage(String.format("Deleted Experiment Id %s", experiment.getId()));   
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }    
 }

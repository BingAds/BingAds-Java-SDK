package com.microsoft.bingads.examples.v13;

import java.util.Random;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class Labels extends ExampleBase {

    static java.lang.Integer MAX_GET_LABELS_BY_IDS = 1000;
    static java.lang.Integer MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS = 1;
    static java.lang.Integer MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS = 100;
    static java.lang.Integer MAX_PAGING_SIZE = 1000;
        
    public static void main(java.lang.String[] args) {
   	
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            // Add an ad group in a campaign. Later we will create labels for them. 
            // Although not included in this example you can also create labels for ads and keywords. 

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

            // Add an ad group within the campaign.
            
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
            adGroups.getAdGroups().add(adGroup);

            outputStatusMessage("-----\nAddAdGroups:");
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(
                    campaignIds.getLongs().get(0), 
                    adGroups, 
                    false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors); 

            // Add labels and associate them with the campaign and ad group.
            
            Random random = new Random();
            ArrayOfLabel labels = new ArrayOfLabel();

            for (int labelIndex = 0; labelIndex < 5; labelIndex++)
            {
                java.lang.String color = String.format("#%06x", random.nextInt(0x100000));
                Label label = new Label();
                label.setColorCode(color);
                label.setDescription("Label Description");
                label.setName("Label Name " + color + " " + System.currentTimeMillis());
                labels.getLabels().add(label);
            }
            
            outputStatusMessage("-----\nAddLabels:");
            AddLabelsResponse addLabelsResponse = CampaignManagementExampleHelper.addLabels(labels);
            ArrayOfNullableOflong labelIds = addLabelsResponse.getLabelIds();
            ArrayOfBatchError labelErrors = addLabelsResponse.getPartialErrors();
            outputStatusMessage("LabelIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(labelIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(labelErrors);
            
            ArrayOflong getLabelIds = getNonNullableIds(labelIds);

            Paging paging = new Paging();
            paging.setIndex(0);
            paging.setSize(MAX_GET_LABELS_BY_IDS);

            outputStatusMessage("-----\nGetLabelsByIds:");
            GetLabelsByIdsResponse getLabelsByIdsResponse = CampaignManagementExampleHelper.getLabelsByIds(
                getLabelIds,
                paging);
            outputStatusMessage("Labels:");
            CampaignManagementExampleHelper.outputArrayOfLabel(getLabelsByIdsResponse.getLabels());
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(labelErrors);

            ArrayOfLabelAssociation campaignLabelAssociations = createExampleLabelAssociationsByEntityId(
                    campaignIds.getLongs().get(0), 
                    getLabelIds);
            outputStatusMessage("-----\nAssociating all of the labels with a campaign...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(campaignLabelAssociations);
            SetLabelAssociationsResponse setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(
                    EntityType.CAMPAIGN, 
                    campaignLabelAssociations);

            ArrayOfLabelAssociation adGroupLabelAssociations = createExampleLabelAssociationsByEntityId(
                    adGroupIds.getLongs().get(0), 
                    getLabelIds);
            outputStatusMessage("-----\nAssociating all of the labels with an ad group...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(adGroupLabelAssociations);
            setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(
                    EntityType.AD_GROUP, 
                    adGroupLabelAssociations);

            outputStatusMessage("-----\nUse paging to get all campaign label associations...");
            ArrayOfLabelAssociation getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.CAMPAIGN,
                getLabelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("-----\nUse paging to get all ad group label associations...");
            getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.AD_GROUP,
                getLabelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("-----\nGet label associations for the campaigns...");
            ArrayOfLabelAssociation getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.CAMPAIGN,
                getNonNullableIds(campaignIds));
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("-----\nGet label associations for the ad groups...");
            getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.AD_GROUP,
                getNonNullableIds(adGroupIds));
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("-----\nDelete all label associations that we set above...");

            // Deleting the associations is not necessary if you are deleting the corresponding campaign(s), as the 
            // contained ad groups, keywords, ads, and associations would also be deleted.

            DeleteLabelAssociationsResponse deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(
                    EntityType.CAMPAIGN, 
                    campaignLabelAssociations);
            deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(
                    EntityType.AD_GROUP, 
                    adGroupLabelAssociations);

            // Deleting the campaign(s) removes the corresponding label associations but not remove the labels.

            outputStatusMessage("-----\nDeleteLabels:");
            DeleteLabelsResponse deleteLabelsResponse = CampaignManagementExampleHelper.deleteLabels(
                    getLabelIds);
            
            for (java.lang.Long id : getLabelIds.getLongs())
            {
                outputStatusMessage(String.format("Deleted Label Id %s", id));
            }

            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d", deleteCampaignIds.getLongs().get(0))); 
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
    
    static ArrayOfLabelAssociation createExampleLabelAssociationsByEntityId(java.lang.Long entityId, ArrayOflong labelIds)
    {
        ArrayOfLabelAssociation labelAssociations = new ArrayOfLabelAssociation();
        for (java.lang.Long labelId : labelIds.getLongs())
        {
            LabelAssociation labelAssociation = new LabelAssociation();
            labelAssociation.setEntityId(entityId);
            labelAssociation.setLabelId(labelId);
            labelAssociations.getLabelAssociations().add(labelAssociation);
        }
        return labelAssociations;
    }

    static ArrayOfLabelAssociation getLabelAssociationsByLabelIdsHelper(
        EntityType entityType,
        ArrayOflong labelIds
        ) throws Exception, RemoteException
    {
        ArrayOfLabelAssociation labelAssociations = new ArrayOfLabelAssociation();
        int labelIdsPageIndex = 0;

        while (labelIdsPageIndex * MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS < labelIds.getLongs().size())
        {
            int startIndex = labelIdsPageIndex++ * MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS;
            int toIndex = labelIds.getLongs().size() - startIndex - MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS < 0 ? 
                    labelIds.getLongs().size() : 
                    startIndex + MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS;
            List<java.lang.Long> idSubList = labelIds.getLongs().subList(startIndex, toIndex);
            ArrayOflong getLabelIds = new ArrayOflong();
            for (java.lang.Long id : idSubList){
                getLabelIds.getLongs().add(id);
            }
            
            int labelAssociationsPageIndex = 0;
            boolean foundLastPage = false;
            
            Paging paging = new Paging();
            paging.setSize(MAX_PAGING_SIZE);

            while (!foundLastPage)
            {               
                paging.setIndex(labelAssociationsPageIndex++);
                GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds = CampaignManagementExampleHelper.getLabelAssociationsByLabelIds(
                    entityType,
                    getLabelIds,
                    paging
                );

                labelAssociations.getLabelAssociations().addAll(getLabelAssociationsByLabelIds.getLabelAssociations().getLabelAssociations());
                foundLastPage = MAX_PAGING_SIZE > getLabelAssociationsByLabelIds.getLabelAssociations().getLabelAssociations().size();
            }
        }

        return labelAssociations;
    }

    static ArrayOfLabelAssociation getLabelAssociationsByEntityIdsHelper(
        EntityType entityType,
        ArrayOflong entityIds
        ) throws Exception, RemoteException
    {
        ArrayOfLabelAssociation labelAssociations = new ArrayOfLabelAssociation();
        int entityIdsPageIndex = 0;

        while (entityIdsPageIndex * MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS < entityIds.getLongs().size())
        {
            int startIndex = entityIdsPageIndex++ * MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS;
            int toIndex = entityIds.getLongs().size() - startIndex - MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS < 0 ? 
                    entityIds.getLongs().size() : 
                    startIndex + MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS;
            List<java.lang.Long> idSubList = entityIds.getLongs().subList(startIndex, toIndex);
            ArrayOflong getEntityIds = new ArrayOflong();
            for (java.lang.Long id : idSubList){
                getEntityIds.getLongs().add(id);
            }

            GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds = CampaignManagementExampleHelper.getLabelAssociationsByEntityIds(
                getEntityIds,
                entityType
            );

            labelAssociations.getLabelAssociations().addAll(getLabelAssociationsByEntityIds.getLabelAssociations().getLabelAssociations());
        }

        return labelAssociations;
    }
    
    static ArrayOflong getNonNullableIds(ArrayOfNullableOflong nullableIds)
    {
        ArrayOflong ids = new ArrayOflong();
        for (java.lang.Long nullableId : nullableIds.getLongs())
        {
            ids.getLongs().add(nullableId);
        }
        return ids;
    }
 }

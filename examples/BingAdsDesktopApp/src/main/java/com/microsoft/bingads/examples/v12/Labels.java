package com.microsoft.bingads.examples.v12;

import java.util.Random;

import java.rmi.RemoteException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;
import java.util.Calendar;
import java.util.List;

public class Labels extends ExampleBase {

    static java.lang.Integer MAX_GET_LABELS_BY_IDS = 1000;
    static java.lang.Integer MAX_LABEL_IDS_FOR_GET_LABEL_ASSOCIATIONS = 1;
    static java.lang.Integer MAX_ENTITY_IDS_FOR_GET_LABEL_ASSOCIATIONS = 100;
    static java.lang.Integer MAX_PAGING_SIZE = 1000;
        
    public static void main(java.lang.String[] args) {
   	
        try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            // Specify a campaign, ad group, keyword, and ad.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            campaign.setDescription("Red shoes line.");
            campaign.setDailyBudget(50.0);
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Women's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            adGroup.setLanguage("English");
            adGroups.getAdGroups().add(adGroup);

            ArrayOfKeyword keywords = new ArrayOfKeyword();
            Keyword keyword = new Keyword();
            keyword.setBid(new Bid());
            keyword.getBid().setAmount(0.47);
            keyword.setParam2("10% Off");
            keyword.setMatchType(MatchType.PHRASE);
            keyword.setText("Brand-A Shoes");
            keywords.getKeywords().add(keyword);

            ArrayOfAd ads = new ArrayOfAd();
            ExpandedTextAd expandedTextAd = new ExpandedTextAd();
            expandedTextAd.setTitlePart1("Contoso");
            expandedTextAd.setTitlePart2("Fast & Easy Setup");
            expandedTextAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
            expandedTextAd.setPath1("seattle");
            expandedTextAd.setPath2("shoe sale");
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            expandedTextAd.setFinalUrls(finalUrls);
            ads.getAds().add(expandedTextAd);
            
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

            // Add the campaign, ad group, keyword, ad, and labels.
                    
            AddLabelsResponse addLabelsResponse = CampaignManagementExampleHelper.addLabels(labels);
            ArrayOfNullableOflong nullableLabelIds = addLabelsResponse.getLabelIds();
            ArrayOfBatchError labelErrors = addLabelsResponse.getPartialErrors();
            outputStatusMessage("New Label Ids:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableLabelIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(labelErrors);

            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns,
                    false);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("New Campaign Ids:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups, null);
            ArrayOfNullableOflong nullableAdGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputStatusMessage("New Ad Group Ids:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableAdGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors);

            AddKeywordsResponse addKeywordsResponse = CampaignManagementExampleHelper.addKeywords(nullableAdGroupIds.getLongs().get(0), keywords, null);
            ArrayOfNullableOflong nullableKeywordIds = addKeywordsResponse.getKeywordIds();
            ArrayOfBatchError keywordErrors = addKeywordsResponse.getPartialErrors();
            outputStatusMessage("New Keyword Ids:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableKeywordIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(keywordErrors);

            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(nullableAdGroupIds.getLongs().get(0), ads);
            ArrayOfNullableOflong nullableAdIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            outputStatusMessage("New Ad Ids:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableAdIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);
            
            ArrayOflong labelIds = getNonNullableIds(nullableLabelIds);

            outputStatusMessage("\nGet all the labels that we added above...");

            Paging paging = new Paging();
            paging.setIndex(0);
            paging.setSize(MAX_GET_LABELS_BY_IDS);

            GetLabelsByIdsResponse getLabelsByIdsResponse = CampaignManagementExampleHelper.getLabelsByIds(
                labelIds,
                paging
            );
            CampaignManagementExampleHelper.outputArrayOfLabel(getLabelsByIdsResponse.getLabels());

            outputStatusMessage("\nUpdate the label color and then retrieve the labels again to confirm the changes....");

            ArrayOfLabel updateLabels = new ArrayOfLabel();
            for (Label label : getLabelsByIdsResponse.getLabels().getLabels())
            {
                java.lang.String color = String.format("#%06x", random.nextInt(0x100000));
                label.setColorCode(color);
                updateLabels.getLabels().add(label);
            }
            UpdateLabelsResponse updateLabelsResponse = CampaignManagementExampleHelper.updateLabels(updateLabels);

            getLabelsByIdsResponse = CampaignManagementExampleHelper.getLabelsByIds(
                labelIds,
                paging
            );
            CampaignManagementExampleHelper.outputArrayOfLabel(getLabelsByIdsResponse.getLabels());

            ArrayOfLabelAssociation campaignLabelAssociations = createExampleLabelAssociationsByEntityId(nullableCampaignIds.getLongs().get(0), labelIds);
            outputStatusMessage("\nAssociating all of the labels with a campaign...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(campaignLabelAssociations);
            SetLabelAssociationsResponse setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(EntityType.CAMPAIGN, campaignLabelAssociations);

            ArrayOfLabelAssociation adGroupLabelAssociations = createExampleLabelAssociationsByEntityId(nullableAdGroupIds.getLongs().get(0), labelIds);
            outputStatusMessage("\nAssociating all of the labels with an ad group...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(adGroupLabelAssociations);
            setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(EntityType.AD_GROUP, adGroupLabelAssociations);

            ArrayOfLabelAssociation keywordLabelAssociations = createExampleLabelAssociationsByEntityId(nullableKeywordIds.getLongs().get(0), labelIds);
            outputStatusMessage("\nAssociating all of the labels with a keyword...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(keywordLabelAssociations);
            setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(EntityType.KEYWORD, keywordLabelAssociations);

            ArrayOfLabelAssociation adLabelAssociations = createExampleLabelAssociationsByEntityId(nullableAdIds.getLongs().get(0), labelIds);
            outputStatusMessage("\nAssociating all of the labels with an ad...");
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(adLabelAssociations);
            setLabelAssociationsResponse = CampaignManagementExampleHelper.setLabelAssociations(EntityType.AD, adLabelAssociations);


            outputStatusMessage("\nUse paging to get all campaign label associations...");
            ArrayOfLabelAssociation getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.CAMPAIGN,
                labelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("\nUse paging to get all ad group label associations...");
            getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.AD_GROUP,
                labelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("\nUse paging to get all keyword label associations...");
            getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.KEYWORD,
                labelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("\nUse paging to get all ad label associations...");
            getLabelAssociationsByLabelIds = getLabelAssociationsByLabelIdsHelper(
                EntityType.AD,
                labelIds);
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByLabelIds);

            outputStatusMessage("\nGet all label associations for all specified campaigns...");
            ArrayOfLabelAssociation getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.CAMPAIGN,
                getNonNullableIds(nullableCampaignIds)
            );
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("\nGet all label associations for all specified ad groups...");
            getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.AD_GROUP,
                getNonNullableIds(nullableAdGroupIds)
            );
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("\nGet all label associations for all specified keywords...");
            getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.KEYWORD,
                getNonNullableIds(nullableKeywordIds)
            );
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("\nGet all label associations for all specified ads...");
            getLabelAssociationsByEntityIds = getLabelAssociationsByEntityIdsHelper(
                EntityType.AD,
                getNonNullableIds(nullableAdIds)
            );
            CampaignManagementExampleHelper.outputArrayOfLabelAssociation(getLabelAssociationsByEntityIds);

            outputStatusMessage("\nDelete all label associations that we set above....");

            // This is not necessary if you are deleting the corresponding campaign(s), as the 
            // contained ad groups, keywords, ads, and associations would also be deleted.

            DeleteLabelAssociationsResponse deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(EntityType.CAMPAIGN, campaignLabelAssociations);
            deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(EntityType.AD_GROUP, adGroupLabelAssociations);
            deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(EntityType.KEYWORD, keywordLabelAssociations);
            deleteLabelAssociationsResponse = CampaignManagementExampleHelper.deleteLabelAssociations(EntityType.AD, adLabelAssociations);

            outputStatusMessage("\nDelete all labels that we added above....");

            // Deleting the campaign(s) removes the corresponding label associations but not remove the labels.

            DeleteLabelsResponse deleteLabelsResponse = CampaignManagementExampleHelper.deleteLabels(labelIds);

            outputStatusMessage("\nDelete the campaign, ad group, keyword, and ad that were added above....");

            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), getNonNullableIds(nullableCampaignIds));

            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
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

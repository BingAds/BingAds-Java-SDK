package com.microsoft.bingads.examples.v12;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

class CampaignManagementExampleHelper
{
    static ServiceClient<ICampaignManagementService> CampaignManagementService;
    static AddAdExtensionsResponse addAdExtensions(
        java.lang.Long accountId,
        ArrayOfAdExtension adExtensions) throws RemoteException, Exception
    {
        AddAdExtensionsRequest request = new AddAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensions(adExtensions);

        return CampaignManagementService.getService().addAdExtensions(request);
    }
    static AddAdGroupCriterionsResponse addAdGroupCriterions(
        ArrayOfAdGroupCriterion adGroupCriterions,
        ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        AddAdGroupCriterionsRequest request = new AddAdGroupCriterionsRequest();

        request.setAdGroupCriterions(adGroupCriterions);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().addAdGroupCriterions(request);
    }
    static AddAdGroupsResponse addAdGroups(
        java.lang.Long campaignId,
        ArrayOfAdGroup adGroups,
        java.lang.Boolean returnInheritedBidStrategyTypes) throws RemoteException, Exception
    {
        AddAdGroupsRequest request = new AddAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroups(adGroups);
        request.setReturnInheritedBidStrategyTypes(returnInheritedBidStrategyTypes);

        return CampaignManagementService.getService().addAdGroups(request);
    }
    static AddAdsResponse addAds(
        java.lang.Long adGroupId,
        ArrayOfAd ads) throws RemoteException, Exception
    {
        AddAdsRequest request = new AddAdsRequest();

        request.setAdGroupId(adGroupId);
        request.setAds(ads);

        return CampaignManagementService.getService().addAds(request);
    }
    static AddAudiencesResponse addAudiences(
        ArrayOfAudience audiences) throws RemoteException, Exception
    {
        AddAudiencesRequest request = new AddAudiencesRequest();

        request.setAudiences(audiences);

        return CampaignManagementService.getService().addAudiences(request);
    }
    static AddBudgetsResponse addBudgets(
        ArrayOfBudget budgets) throws RemoteException, Exception
    {
        AddBudgetsRequest request = new AddBudgetsRequest();

        request.setBudgets(budgets);

        return CampaignManagementService.getService().addBudgets(request);
    }
    static AddCampaignCriterionsResponse addCampaignCriterions(
        ArrayOfCampaignCriterion campaignCriterions,
        ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        AddCampaignCriterionsRequest request = new AddCampaignCriterionsRequest();

        request.setCampaignCriterions(campaignCriterions);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().addCampaignCriterions(request);
    }
    static AddCampaignsResponse addCampaigns(
        java.lang.Long accountId,
        ArrayOfCampaign campaigns,
        java.lang.Boolean includeDynamicSearchAdsSource) throws RemoteException, Exception
    {
        AddCampaignsRequest request = new AddCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);
        request.setIncludeDynamicSearchAdsSource(includeDynamicSearchAdsSource);

        return CampaignManagementService.getService().addCampaigns(request);
    }
    static AddConversionGoalsResponse addConversionGoals(
        ArrayOfConversionGoal conversionGoals) throws RemoteException, Exception
    {
        AddConversionGoalsRequest request = new AddConversionGoalsRequest();

        request.setConversionGoals(conversionGoals);

        return CampaignManagementService.getService().addConversionGoals(request);
    }
    static AddExperimentsResponse addExperiments(
        ArrayOfExperiment experiments) throws RemoteException, Exception
    {
        AddExperimentsRequest request = new AddExperimentsRequest();

        request.setExperiments(experiments);

        return CampaignManagementService.getService().addExperiments(request);
    }
    static AddKeywordsResponse addKeywords(
        java.lang.Long adGroupId,
        ArrayOfKeyword keywords,
        java.lang.Boolean returnInheritedBidStrategyTypes) throws RemoteException, Exception
    {
        AddKeywordsRequest request = new AddKeywordsRequest();

        request.setAdGroupId(adGroupId);
        request.setKeywords(keywords);
        request.setReturnInheritedBidStrategyTypes(returnInheritedBidStrategyTypes);

        return CampaignManagementService.getService().addKeywords(request);
    }
    static AddLabelsResponse addLabels(
        ArrayOfLabel labels) throws RemoteException, Exception
    {
        AddLabelsRequest request = new AddLabelsRequest();

        request.setLabels(labels);

        return CampaignManagementService.getService().addLabels(request);
    }
    static AddListItemsToSharedListResponse addListItemsToSharedList(
        ArrayOfSharedListItem listItems,
        SharedList sharedList) throws RemoteException, Exception
    {
        AddListItemsToSharedListRequest request = new AddListItemsToSharedListRequest();

        request.setListItems(listItems);
        request.setSharedList(sharedList);

        return CampaignManagementService.getService().addListItemsToSharedList(request);
    }
    static AddMediaResponse addMedia(
        java.lang.Long accountId,
        ArrayOfMedia media) throws RemoteException, Exception
    {
        AddMediaRequest request = new AddMediaRequest();

        request.setAccountId(accountId);
        request.setMedia(media);

        return CampaignManagementService.getService().addMedia(request);
    }
    static AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(
        ArrayOfEntityNegativeKeyword entityNegativeKeywords) throws RemoteException, Exception
    {
        AddNegativeKeywordsToEntitiesRequest request = new AddNegativeKeywordsToEntitiesRequest();

        request.setEntityNegativeKeywords(entityNegativeKeywords);

        return CampaignManagementService.getService().addNegativeKeywordsToEntities(request);
    }
    static AddSharedEntityResponse addSharedEntity(
        SharedEntity sharedEntity,
        ArrayOfSharedListItem listItems) throws RemoteException, Exception
    {
        AddSharedEntityRequest request = new AddSharedEntityRequest();

        request.setSharedEntity(sharedEntity);
        request.setListItems(listItems);

        return CampaignManagementService.getService().addSharedEntity(request);
    }
    static AddUetTagsResponse addUetTags(
        ArrayOfUetTag uetTags) throws RemoteException, Exception
    {
        AddUetTagsRequest request = new AddUetTagsRequest();

        request.setUetTags(uetTags);

        return CampaignManagementService.getService().addUetTags(request);
    }
    static AppealEditorialRejectionsResponse appealEditorialRejections(
        ArrayOfEntityIdToParentIdAssociation entityIdToParentIdAssociations,
        EntityType entityType,
        java.lang.String justificationText) throws RemoteException, Exception
    {
        AppealEditorialRejectionsRequest request = new AppealEditorialRejectionsRequest();

        request.setEntityIdToParentIdAssociations(entityIdToParentIdAssociations);
        request.setEntityType(entityType);
        request.setJustificationText(justificationText);

        return CampaignManagementService.getService().appealEditorialRejections(request);
    }
    static ApplyOfflineConversionsResponse applyOfflineConversions(
        ArrayOfOfflineConversion offlineConversions) throws RemoteException, Exception
    {
        ApplyOfflineConversionsRequest request = new ApplyOfflineConversionsRequest();

        request.setOfflineConversions(offlineConversions);

        return CampaignManagementService.getService().applyOfflineConversions(request);
    }
    static ApplyProductPartitionActionsResponse applyProductPartitionActions(
        ArrayOfAdGroupCriterionAction criterionActions) throws RemoteException, Exception
    {
        ApplyProductPartitionActionsRequest request = new ApplyProductPartitionActionsRequest();

        request.setCriterionActions(criterionActions);

        return CampaignManagementService.getService().applyProductPartitionActions(request);
    }
    static DeleteAdExtensionsResponse deleteAdExtensions(
        java.lang.Long accountId,
        ArrayOflong adExtensionIds) throws RemoteException, Exception
    {
        DeleteAdExtensionsRequest request = new DeleteAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIds(adExtensionIds);

        return CampaignManagementService.getService().deleteAdExtensions(request);
    }
    static DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(
        java.lang.Long accountId,
        ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations,
        AssociationType associationType) throws RemoteException, Exception
    {
        DeleteAdExtensionsAssociationsRequest request = new DeleteAdExtensionsAssociationsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(adExtensionIdToEntityIdAssociations);
        request.setAssociationType(associationType);

        return CampaignManagementService.getService().deleteAdExtensionsAssociations(request);
    }
    static DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(
        ArrayOflong adGroupCriterionIds,
        java.lang.Long adGroupId,
        ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        DeleteAdGroupCriterionsRequest request = new DeleteAdGroupCriterionsRequest();

        request.setAdGroupCriterionIds(adGroupCriterionIds);
        request.setAdGroupId(adGroupId);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().deleteAdGroupCriterions(request);
    }
    static DeleteAdGroupsResponse deleteAdGroups(
        java.lang.Long campaignId,
        ArrayOflong adGroupIds) throws RemoteException, Exception
    {
        DeleteAdGroupsRequest request = new DeleteAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroupIds(adGroupIds);

        return CampaignManagementService.getService().deleteAdGroups(request);
    }
    static DeleteAdsResponse deleteAds(
        java.lang.Long adGroupId,
        ArrayOflong adIds) throws RemoteException, Exception
    {
        DeleteAdsRequest request = new DeleteAdsRequest();

        request.setAdGroupId(adGroupId);
        request.setAdIds(adIds);

        return CampaignManagementService.getService().deleteAds(request);
    }
    static DeleteAudiencesResponse deleteAudiences(
        ArrayOflong audienceIds) throws RemoteException, Exception
    {
        DeleteAudiencesRequest request = new DeleteAudiencesRequest();

        request.setAudienceIds(audienceIds);

        return CampaignManagementService.getService().deleteAudiences(request);
    }
    static DeleteBudgetsResponse deleteBudgets(
        ArrayOflong budgetIds) throws RemoteException, Exception
    {
        DeleteBudgetsRequest request = new DeleteBudgetsRequest();

        request.setBudgetIds(budgetIds);

        return CampaignManagementService.getService().deleteBudgets(request);
    }
    static DeleteCampaignCriterionsResponse deleteCampaignCriterions(
        ArrayOflong campaignCriterionIds,
        java.lang.Long campaignId,
        ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        DeleteCampaignCriterionsRequest request = new DeleteCampaignCriterionsRequest();

        request.setCampaignCriterionIds(campaignCriterionIds);
        request.setCampaignId(campaignId);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().deleteCampaignCriterions(request);
    }
    static DeleteCampaignsResponse deleteCampaigns(
        java.lang.Long accountId,
        ArrayOflong campaignIds) throws RemoteException, Exception
    {
        DeleteCampaignsRequest request = new DeleteCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        return CampaignManagementService.getService().deleteCampaigns(request);
    }
    static DeleteExperimentsResponse deleteExperiments(
        ArrayOflong experimentIds) throws RemoteException, Exception
    {
        DeleteExperimentsRequest request = new DeleteExperimentsRequest();

        request.setExperimentIds(experimentIds);

        return CampaignManagementService.getService().deleteExperiments(request);
    }
    static DeleteKeywordsResponse deleteKeywords(
        java.lang.Long adGroupId,
        ArrayOflong keywordIds) throws RemoteException, Exception
    {
        DeleteKeywordsRequest request = new DeleteKeywordsRequest();

        request.setAdGroupId(adGroupId);
        request.setKeywordIds(keywordIds);

        return CampaignManagementService.getService().deleteKeywords(request);
    }
    static DeleteLabelAssociationsResponse deleteLabelAssociations(
        EntityType entityType,
        ArrayOfLabelAssociation labelAssociations) throws RemoteException, Exception
    {
        DeleteLabelAssociationsRequest request = new DeleteLabelAssociationsRequest();

        request.setEntityType(entityType);
        request.setLabelAssociations(labelAssociations);

        return CampaignManagementService.getService().deleteLabelAssociations(request);
    }
    static DeleteLabelsResponse deleteLabels(
        ArrayOflong labelIds) throws RemoteException, Exception
    {
        DeleteLabelsRequest request = new DeleteLabelsRequest();

        request.setLabelIds(labelIds);

        return CampaignManagementService.getService().deleteLabels(request);
    }
    static DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(
        ArrayOflong listItemIds,
        SharedList sharedList) throws RemoteException, Exception
    {
        DeleteListItemsFromSharedListRequest request = new DeleteListItemsFromSharedListRequest();

        request.setListItemIds(listItemIds);
        request.setSharedList(sharedList);

        return CampaignManagementService.getService().deleteListItemsFromSharedList(request);
    }
    static DeleteMediaResponse deleteMedia(
        java.lang.Long accountId,
        ArrayOflong mediaIds) throws RemoteException, Exception
    {
        DeleteMediaRequest request = new DeleteMediaRequest();

        request.setAccountId(accountId);
        request.setMediaIds(mediaIds);

        return CampaignManagementService.getService().deleteMedia(request);
    }
    static DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(
        ArrayOfEntityNegativeKeyword entityNegativeKeywords) throws RemoteException, Exception
    {
        DeleteNegativeKeywordsFromEntitiesRequest request = new DeleteNegativeKeywordsFromEntitiesRequest();

        request.setEntityNegativeKeywords(entityNegativeKeywords);

        return CampaignManagementService.getService().deleteNegativeKeywordsFromEntities(request);
    }
    static DeleteSharedEntitiesResponse deleteSharedEntities(
        ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
    {
        DeleteSharedEntitiesRequest request = new DeleteSharedEntitiesRequest();

        request.setSharedEntities(sharedEntities);

        return CampaignManagementService.getService().deleteSharedEntities(request);
    }
    static DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(
        ArrayOfSharedEntityAssociation associations) throws RemoteException, Exception
    {
        DeleteSharedEntityAssociationsRequest request = new DeleteSharedEntityAssociationsRequest();

        request.setAssociations(associations);

        return CampaignManagementService.getService().deleteSharedEntityAssociations(request);
    }
    static GetAccountMigrationStatusesResponse getAccountMigrationStatuses(
        ArrayOflong accountIds,
        java.lang.String migrationType) throws RemoteException, Exception
    {
        GetAccountMigrationStatusesRequest request = new GetAccountMigrationStatusesRequest();

        request.setAccountIds(accountIds);
        request.setMigrationType(migrationType);

        return CampaignManagementService.getService().getAccountMigrationStatuses(request);
    }
    static GetAccountPropertiesResponse getAccountProperties(
        ArrayOfAccountPropertyName accountPropertyNames) throws RemoteException, Exception
    {
        GetAccountPropertiesRequest request = new GetAccountPropertiesRequest();

        request.setAccountPropertyNames(accountPropertyNames);

        return CampaignManagementService.getService().getAccountProperties(request);
    }
    static GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(
        java.lang.Long accountId,
        ArrayList<AdExtensionsTypeFilter> adExtensionType,
        AssociationType associationType) throws RemoteException, Exception
    {
        GetAdExtensionIdsByAccountIdRequest request = new GetAdExtensionIdsByAccountIdRequest();

        request.setAccountId(accountId);
        request.setAdExtensionType(adExtensionType);
        request.setAssociationType(associationType);

        return CampaignManagementService.getService().getAdExtensionIdsByAccountId(request);
    }
    static GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(
        java.lang.Long accountId,
        ArrayList<AdExtensionsTypeFilter> adExtensionType,
        AssociationType associationType,
        ArrayOflong entityIds) throws RemoteException, Exception
    {
        GetAdExtensionsAssociationsRequest request = new GetAdExtensionsAssociationsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionType(adExtensionType);
        request.setAssociationType(associationType);
        request.setEntityIds(entityIds);

        return CampaignManagementService.getService().getAdExtensionsAssociations(request);
    }
    static GetAdExtensionsByIdsResponse getAdExtensionsByIds(
        java.lang.Long accountId,
        ArrayOflong adExtensionIds,
        ArrayList<AdExtensionsTypeFilter> adExtensionType) throws RemoteException, Exception
    {
        GetAdExtensionsByIdsRequest request = new GetAdExtensionsByIdsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIds(adExtensionIds);
        request.setAdExtensionType(adExtensionType);

        return CampaignManagementService.getService().getAdExtensionsByIds(request);
    }
    static GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(
        java.lang.Long accountId,
        ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations,
        AssociationType associationType) throws RemoteException, Exception
    {
        GetAdExtensionsEditorialReasonsRequest request = new GetAdExtensionsEditorialReasonsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(adExtensionIdToEntityIdAssociations);
        request.setAssociationType(associationType);

        return CampaignManagementService.getService().getAdExtensionsEditorialReasons(request);
    }
    static GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(
        ArrayOflong adGroupCriterionIds,
        java.lang.Long adGroupId,
        ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        GetAdGroupCriterionsByIdsRequest request = new GetAdGroupCriterionsByIdsRequest();

        request.setAdGroupCriterionIds(adGroupCriterionIds);
        request.setAdGroupId(adGroupId);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().getAdGroupCriterionsByIds(request);
    }
    static GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(
        java.lang.Long campaignId) throws RemoteException, Exception
    {
        GetAdGroupsByCampaignIdRequest request = new GetAdGroupsByCampaignIdRequest();

        request.setCampaignId(campaignId);

        return CampaignManagementService.getService().getAdGroupsByCampaignId(request);
    }
    static GetAdGroupsByIdsResponse getAdGroupsByIds(
        java.lang.Long campaignId,
        ArrayOflong adGroupIds) throws RemoteException, Exception
    {
        GetAdGroupsByIdsRequest request = new GetAdGroupsByIdsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroupIds(adGroupIds);

        return CampaignManagementService.getService().getAdGroupsByIds(request);
    }
    static GetAdsByAdGroupIdResponse getAdsByAdGroupId(
        java.lang.Long adGroupId,
        ArrayOfAdType adTypes,
        ArrayList<AdAdditionalField> returnAdditionalFields) throws RemoteException, Exception
    {
        GetAdsByAdGroupIdRequest request = new GetAdsByAdGroupIdRequest();

        request.setAdGroupId(adGroupId);
        request.setAdTypes(adTypes);
        request.setReturnAdditionalFields(returnAdditionalFields);

        return CampaignManagementService.getService().getAdsByAdGroupId(request);
    }
    static GetAdsByEditorialStatusResponse getAdsByEditorialStatus(
        java.lang.Long adGroupId,
        AdEditorialStatus editorialStatus,
        ArrayOfAdType adTypes,
        ArrayList<AdAdditionalField> returnAdditionalFields) throws RemoteException, Exception
    {
        GetAdsByEditorialStatusRequest request = new GetAdsByEditorialStatusRequest();

        request.setAdGroupId(adGroupId);
        request.setEditorialStatus(editorialStatus);
        request.setAdTypes(adTypes);
        request.setReturnAdditionalFields(returnAdditionalFields);

        return CampaignManagementService.getService().getAdsByEditorialStatus(request);
    }
    static GetAdsByIdsResponse getAdsByIds(
        java.lang.Long adGroupId,
        ArrayOflong adIds,
        ArrayOfAdType adTypes,
        ArrayList<AdAdditionalField> returnAdditionalFields) throws RemoteException, Exception
    {
        GetAdsByIdsRequest request = new GetAdsByIdsRequest();

        request.setAdGroupId(adGroupId);
        request.setAdIds(adIds);
        request.setAdTypes(adTypes);
        request.setReturnAdditionalFields(returnAdditionalFields);

        return CampaignManagementService.getService().getAdsByIds(request);
    }
    static GetAudiencesByIdsResponse getAudiencesByIds(
        ArrayOflong audienceIds,
        ArrayList<AudienceType> type) throws RemoteException, Exception
    {
        GetAudiencesByIdsRequest request = new GetAudiencesByIdsRequest();

        request.setAudienceIds(audienceIds);
        request.setType(type);

        return CampaignManagementService.getService().getAudiencesByIds(request);
    }
    static GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId() throws RemoteException, Exception
    {
        GetBMCStoresByCustomerIdRequest request = new GetBMCStoresByCustomerIdRequest();


        return CampaignManagementService.getService().getBMCStoresByCustomerId(request);
    }
    static GetBSCCountriesResponse getBSCCountries() throws RemoteException, Exception
    {
        GetBSCCountriesRequest request = new GetBSCCountriesRequest();


        return CampaignManagementService.getService().getBSCCountries(request);
    }
    static GetBudgetsByIdsResponse getBudgetsByIds(
        ArrayOflong budgetIds) throws RemoteException, Exception
    {
        GetBudgetsByIdsRequest request = new GetBudgetsByIdsRequest();

        request.setBudgetIds(budgetIds);

        return CampaignManagementService.getService().getBudgetsByIds(request);
    }
    static GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(
        ArrayOflong campaignCriterionIds,
        java.lang.Long campaignId,
        ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        GetCampaignCriterionsByIdsRequest request = new GetCampaignCriterionsByIdsRequest();

        request.setCampaignCriterionIds(campaignCriterionIds);
        request.setCampaignId(campaignId);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().getCampaignCriterionsByIds(request);
    }
    static GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(
        ArrayOflong budgetIds) throws RemoteException, Exception
    {
        GetCampaignIdsByBudgetIdsRequest request = new GetCampaignIdsByBudgetIdsRequest();

        request.setBudgetIds(budgetIds);

        return CampaignManagementService.getService().getCampaignIdsByBudgetIds(request);
    }
    static GetCampaignsByAccountIdResponse getCampaignsByAccountId(
        java.lang.Long accountId,
        ArrayList<CampaignType> campaignType,
        ArrayList<CampaignAdditionalField> returnAdditionalFields) throws RemoteException, Exception
    {
        GetCampaignsByAccountIdRequest request = new GetCampaignsByAccountIdRequest();

        request.setAccountId(accountId);
        request.setCampaignType(campaignType);
        request.setReturnAdditionalFields(returnAdditionalFields);

        return CampaignManagementService.getService().getCampaignsByAccountId(request);
    }
    static GetCampaignsByIdsResponse getCampaignsByIds(
        java.lang.Long accountId,
        ArrayOflong campaignIds,
        ArrayList<CampaignType> campaignType,
        ArrayList<CampaignAdditionalField> returnAdditionalFields) throws RemoteException, Exception
    {
        GetCampaignsByIdsRequest request = new GetCampaignsByIdsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);
        request.setCampaignType(campaignType);
        request.setReturnAdditionalFields(returnAdditionalFields);

        return CampaignManagementService.getService().getCampaignsByIds(request);
    }
    static GetConversionGoalsByIdsResponse getConversionGoalsByIds(
        ArrayOflong conversionGoalIds,
        ArrayList<ConversionGoalType> conversionGoalTypes) throws RemoteException, Exception
    {
        GetConversionGoalsByIdsRequest request = new GetConversionGoalsByIdsRequest();

        request.setConversionGoalIds(conversionGoalIds);
        request.setConversionGoalTypes(conversionGoalTypes);

        return CampaignManagementService.getService().getConversionGoalsByIds(request);
    }
    static GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(
        ArrayOflong tagIds,
        ArrayList<ConversionGoalType> conversionGoalTypes) throws RemoteException, Exception
    {
        GetConversionGoalsByTagIdsRequest request = new GetConversionGoalsByTagIdsRequest();

        request.setTagIds(tagIds);
        request.setConversionGoalTypes(conversionGoalTypes);

        return CampaignManagementService.getService().getConversionGoalsByTagIds(request);
    }
    static GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(
        java.lang.Long accountId,
        ArrayOfEntityIdToParentIdAssociation entityIdToParentIdAssociations,
        EntityType entityType) throws RemoteException, Exception
    {
        GetEditorialReasonsByIdsRequest request = new GetEditorialReasonsByIdsRequest();

        request.setAccountId(accountId);
        request.setEntityIdToParentIdAssociations(entityIdToParentIdAssociations);
        request.setEntityType(entityType);

        return CampaignManagementService.getService().getEditorialReasonsByIds(request);
    }
    static GetExperimentsByIdsResponse getExperimentsByIds(
        ArrayOflong experimentIds,
        Paging pageInfo) throws RemoteException, Exception
    {
        GetExperimentsByIdsRequest request = new GetExperimentsByIdsRequest();

        request.setExperimentIds(experimentIds);
        request.setPageInfo(pageInfo);

        return CampaignManagementService.getService().getExperimentsByIds(request);
    }
    static GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(
        java.lang.String version,
        java.lang.String languageLocale) throws RemoteException, Exception
    {
        GetGeoLocationsFileUrlRequest request = new GetGeoLocationsFileUrlRequest();

        request.setVersion(version);
        request.setLanguageLocale(languageLocale);

        return CampaignManagementService.getService().getGeoLocationsFileUrl(request);
    }
    static GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(
        java.lang.Long adGroupId) throws RemoteException, Exception
    {
        GetKeywordsByAdGroupIdRequest request = new GetKeywordsByAdGroupIdRequest();

        request.setAdGroupId(adGroupId);

        return CampaignManagementService.getService().getKeywordsByAdGroupId(request);
    }
    static GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(
        java.lang.Long adGroupId,
        KeywordEditorialStatus editorialStatus) throws RemoteException, Exception
    {
        GetKeywordsByEditorialStatusRequest request = new GetKeywordsByEditorialStatusRequest();

        request.setAdGroupId(adGroupId);
        request.setEditorialStatus(editorialStatus);

        return CampaignManagementService.getService().getKeywordsByEditorialStatus(request);
    }
    static GetKeywordsByIdsResponse getKeywordsByIds(
        java.lang.Long adGroupId,
        ArrayOflong keywordIds) throws RemoteException, Exception
    {
        GetKeywordsByIdsRequest request = new GetKeywordsByIdsRequest();

        request.setAdGroupId(adGroupId);
        request.setKeywordIds(keywordIds);

        return CampaignManagementService.getService().getKeywordsByIds(request);
    }
    static GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(
        ArrayOflong entityIds,
        EntityType entityType) throws RemoteException, Exception
    {
        GetLabelAssociationsByEntityIdsRequest request = new GetLabelAssociationsByEntityIdsRequest();

        request.setEntityIds(entityIds);
        request.setEntityType(entityType);

        return CampaignManagementService.getService().getLabelAssociationsByEntityIds(request);
    }
    static GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(
        EntityType entityType,
        ArrayOflong labelIds,
        Paging pageInfo) throws RemoteException, Exception
    {
        GetLabelAssociationsByLabelIdsRequest request = new GetLabelAssociationsByLabelIdsRequest();

        request.setEntityType(entityType);
        request.setLabelIds(labelIds);
        request.setPageInfo(pageInfo);

        return CampaignManagementService.getService().getLabelAssociationsByLabelIds(request);
    }
    static GetLabelsByIdsResponse getLabelsByIds(
        ArrayOflong labelIds,
        Paging pageInfo) throws RemoteException, Exception
    {
        GetLabelsByIdsRequest request = new GetLabelsByIdsRequest();

        request.setLabelIds(labelIds);
        request.setPageInfo(pageInfo);

        return CampaignManagementService.getService().getLabelsByIds(request);
    }
    static GetListItemsBySharedListResponse getListItemsBySharedList(
        SharedList sharedList) throws RemoteException, Exception
    {
        GetListItemsBySharedListRequest request = new GetListItemsBySharedListRequest();

        request.setSharedList(sharedList);

        return CampaignManagementService.getService().getListItemsBySharedList(request);
    }
    static GetMediaAssociationsResponse getMediaAssociations(
        ArrayList<MediaEnabledEntityFilter> mediaEnabledEntities,
        ArrayOflong mediaIds) throws RemoteException, Exception
    {
        GetMediaAssociationsRequest request = new GetMediaAssociationsRequest();

        request.setMediaEnabledEntities(mediaEnabledEntities);
        request.setMediaIds(mediaIds);

        return CampaignManagementService.getService().getMediaAssociations(request);
    }
    static GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(
        ArrayList<MediaEnabledEntityFilter> mediaEnabledEntities,
        Paging pageInfo) throws RemoteException, Exception
    {
        GetMediaMetaDataByAccountIdRequest request = new GetMediaMetaDataByAccountIdRequest();

        request.setMediaEnabledEntities(mediaEnabledEntities);
        request.setPageInfo(pageInfo);

        return CampaignManagementService.getService().getMediaMetaDataByAccountId(request);
    }
    static GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(
        ArrayOflong mediaIds) throws RemoteException, Exception
    {
        GetMediaMetaDataByIdsRequest request = new GetMediaMetaDataByIdsRequest();

        request.setMediaIds(mediaIds);

        return CampaignManagementService.getService().getMediaMetaDataByIds(request);
    }
    static GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(
        ArrayOflong entityIds,
        java.lang.String entityType,
        java.lang.Long parentEntityId) throws RemoteException, Exception
    {
        GetNegativeKeywordsByEntityIdsRequest request = new GetNegativeKeywordsByEntityIdsRequest();

        request.setEntityIds(entityIds);
        request.setEntityType(entityType);
        request.setParentEntityId(parentEntityId);

        return CampaignManagementService.getService().getNegativeKeywordsByEntityIds(request);
    }
    static GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(
        java.lang.Long campaignId,
        ArrayOflong adGroupIds) throws RemoteException, Exception
    {
        GetNegativeSitesByAdGroupIdsRequest request = new GetNegativeSitesByAdGroupIdsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroupIds(adGroupIds);

        return CampaignManagementService.getService().getNegativeSitesByAdGroupIds(request);
    }
    static GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(
        java.lang.Long accountId,
        ArrayOflong campaignIds) throws RemoteException, Exception
    {
        GetNegativeSitesByCampaignIdsRequest request = new GetNegativeSitesByCampaignIdsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        return CampaignManagementService.getService().getNegativeSitesByCampaignIds(request);
    }
    static GetProfileDataFileUrlResponse getProfileDataFileUrl(
        java.lang.String languageLocale,
        ArrayList<ProfileType> profileType) throws RemoteException, Exception
    {
        GetProfileDataFileUrlRequest request = new GetProfileDataFileUrlRequest();

        request.setLanguageLocale(languageLocale);
        request.setProfileType(profileType);

        return CampaignManagementService.getService().getProfileDataFileUrl(request);
    }
    static GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(
        java.lang.String sharedEntityType) throws RemoteException, Exception
    {
        GetSharedEntitiesByAccountIdRequest request = new GetSharedEntitiesByAccountIdRequest();

        request.setSharedEntityType(sharedEntityType);

        return CampaignManagementService.getService().getSharedEntitiesByAccountId(request);
    }
    static GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(
        ArrayOflong entityIds,
        java.lang.String entityType,
        java.lang.String sharedEntityType) throws RemoteException, Exception
    {
        GetSharedEntityAssociationsByEntityIdsRequest request = new GetSharedEntityAssociationsByEntityIdsRequest();

        request.setEntityIds(entityIds);
        request.setEntityType(entityType);
        request.setSharedEntityType(sharedEntityType);

        return CampaignManagementService.getService().getSharedEntityAssociationsByEntityIds(request);
    }
    static GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(
        java.lang.String entityType,
        ArrayOflong sharedEntityIds,
        java.lang.String sharedEntityType) throws RemoteException, Exception
    {
        GetSharedEntityAssociationsBySharedEntityIdsRequest request = new GetSharedEntityAssociationsBySharedEntityIdsRequest();

        request.setEntityType(entityType);
        request.setSharedEntityIds(sharedEntityIds);
        request.setSharedEntityType(sharedEntityType);

        return CampaignManagementService.getService().getSharedEntityAssociationsBySharedEntityIds(request);
    }
    static GetUetTagsByIdsResponse getUetTagsByIds(
        ArrayOflong tagIds) throws RemoteException, Exception
    {
        GetUetTagsByIdsRequest request = new GetUetTagsByIdsRequest();

        request.setTagIds(tagIds);

        return CampaignManagementService.getService().getUetTagsByIds(request);
    }
    static SetAccountPropertiesResponse setAccountProperties(
        ArrayOfAccountProperty accountProperties) throws RemoteException, Exception
    {
        SetAccountPropertiesRequest request = new SetAccountPropertiesRequest();

        request.setAccountProperties(accountProperties);

        return CampaignManagementService.getService().setAccountProperties(request);
    }
    static SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(
        java.lang.Long accountId,
        ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations,
        AssociationType associationType) throws RemoteException, Exception
    {
        SetAdExtensionsAssociationsRequest request = new SetAdExtensionsAssociationsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(adExtensionIdToEntityIdAssociations);
        request.setAssociationType(associationType);

        return CampaignManagementService.getService().setAdExtensionsAssociations(request);
    }
    static SetLabelAssociationsResponse setLabelAssociations(
        EntityType entityType,
        ArrayOfLabelAssociation labelAssociations) throws RemoteException, Exception
    {
        SetLabelAssociationsRequest request = new SetLabelAssociationsRequest();

        request.setEntityType(entityType);
        request.setLabelAssociations(labelAssociations);

        return CampaignManagementService.getService().setLabelAssociations(request);
    }
    static SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(
        java.lang.Long campaignId,
        ArrayOfAdGroupNegativeSites adGroupNegativeSites) throws RemoteException, Exception
    {
        SetNegativeSitesToAdGroupsRequest request = new SetNegativeSitesToAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroupNegativeSites(adGroupNegativeSites);

        return CampaignManagementService.getService().setNegativeSitesToAdGroups(request);
    }
    static SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(
        java.lang.Long accountId,
        ArrayOfCampaignNegativeSites campaignNegativeSites) throws RemoteException, Exception
    {
        SetNegativeSitesToCampaignsRequest request = new SetNegativeSitesToCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaignNegativeSites(campaignNegativeSites);

        return CampaignManagementService.getService().setNegativeSitesToCampaigns(request);
    }
    static SetSharedEntityAssociationsResponse setSharedEntityAssociations(
        ArrayOfSharedEntityAssociation associations) throws RemoteException, Exception
    {
        SetSharedEntityAssociationsRequest request = new SetSharedEntityAssociationsRequest();

        request.setAssociations(associations);

        return CampaignManagementService.getService().setSharedEntityAssociations(request);
    }
    static UpdateAdExtensionsResponse updateAdExtensions(
        java.lang.Long accountId,
        ArrayOfAdExtension adExtensions) throws RemoteException, Exception
    {
        UpdateAdExtensionsRequest request = new UpdateAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensions(adExtensions);

        return CampaignManagementService.getService().updateAdExtensions(request);
    }
    static UpdateAdGroupCriterionsResponse updateAdGroupCriterions(
        ArrayOfAdGroupCriterion adGroupCriterions,
        ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        UpdateAdGroupCriterionsRequest request = new UpdateAdGroupCriterionsRequest();

        request.setAdGroupCriterions(adGroupCriterions);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().updateAdGroupCriterions(request);
    }
    static UpdateAdGroupsResponse updateAdGroups(
        java.lang.Long campaignId,
        ArrayOfAdGroup adGroups,
        java.lang.Boolean updateAudienceAdsBidAdjustment,
        java.lang.Boolean returnInheritedBidStrategyTypes) throws RemoteException, Exception
    {
        UpdateAdGroupsRequest request = new UpdateAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroups(adGroups);
        request.setUpdateAudienceAdsBidAdjustment(updateAudienceAdsBidAdjustment);
        request.setReturnInheritedBidStrategyTypes(returnInheritedBidStrategyTypes);

        return CampaignManagementService.getService().updateAdGroups(request);
    }
    static UpdateAdsResponse updateAds(
        java.lang.Long adGroupId,
        ArrayOfAd ads) throws RemoteException, Exception
    {
        UpdateAdsRequest request = new UpdateAdsRequest();

        request.setAdGroupId(adGroupId);
        request.setAds(ads);

        return CampaignManagementService.getService().updateAds(request);
    }
    static UpdateAudiencesResponse updateAudiences(
        ArrayOfAudience audiences) throws RemoteException, Exception
    {
        UpdateAudiencesRequest request = new UpdateAudiencesRequest();

        request.setAudiences(audiences);

        return CampaignManagementService.getService().updateAudiences(request);
    }
    static UpdateBudgetsResponse updateBudgets(
        ArrayOfBudget budgets) throws RemoteException, Exception
    {
        UpdateBudgetsRequest request = new UpdateBudgetsRequest();

        request.setBudgets(budgets);

        return CampaignManagementService.getService().updateBudgets(request);
    }
    static UpdateCampaignCriterionsResponse updateCampaignCriterions(
        ArrayOfCampaignCriterion campaignCriterions,
        ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        UpdateCampaignCriterionsRequest request = new UpdateCampaignCriterionsRequest();

        request.setCampaignCriterions(campaignCriterions);
        request.setCriterionType(criterionType);

        return CampaignManagementService.getService().updateCampaignCriterions(request);
    }
    static UpdateCampaignsResponse updateCampaigns(
        java.lang.Long accountId,
        ArrayOfCampaign campaigns,
        java.lang.Boolean includeDynamicSearchAdsSource) throws RemoteException, Exception
    {
        UpdateCampaignsRequest request = new UpdateCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);
        request.setIncludeDynamicSearchAdsSource(includeDynamicSearchAdsSource);

        return CampaignManagementService.getService().updateCampaigns(request);
    }
    static UpdateConversionGoalsResponse updateConversionGoals(
        ArrayOfConversionGoal conversionGoals) throws RemoteException, Exception
    {
        UpdateConversionGoalsRequest request = new UpdateConversionGoalsRequest();

        request.setConversionGoals(conversionGoals);

        return CampaignManagementService.getService().updateConversionGoals(request);
    }
    static UpdateExperimentsResponse updateExperiments(
        ArrayOfExperiment experiments) throws RemoteException, Exception
    {
        UpdateExperimentsRequest request = new UpdateExperimentsRequest();

        request.setExperiments(experiments);

        return CampaignManagementService.getService().updateExperiments(request);
    }
    static UpdateKeywordsResponse updateKeywords(
        java.lang.Long adGroupId,
        ArrayOfKeyword keywords,
        java.lang.Boolean returnInheritedBidStrategyTypes) throws RemoteException, Exception
    {
        UpdateKeywordsRequest request = new UpdateKeywordsRequest();

        request.setAdGroupId(adGroupId);
        request.setKeywords(keywords);
        request.setReturnInheritedBidStrategyTypes(returnInheritedBidStrategyTypes);

        return CampaignManagementService.getService().updateKeywords(request);
    }
    static UpdateLabelsResponse updateLabels(
        ArrayOfLabel labels) throws RemoteException, Exception
    {
        UpdateLabelsRequest request = new UpdateLabelsRequest();

        request.setLabels(labels);

        return CampaignManagementService.getService().updateLabels(request);
    }
    static UpdateSharedEntitiesResponse updateSharedEntities(
        ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
    {
        UpdateSharedEntitiesRequest request = new UpdateSharedEntitiesRequest();

        request.setSharedEntities(sharedEntities);

        return CampaignManagementService.getService().updateSharedEntities(request);
    }
    static UpdateUetTagsResponse updateUetTags(
        ArrayOfUetTag uetTags) throws RemoteException, Exception
    {
        UpdateUetTagsRequest request = new UpdateUetTagsRequest();

        request.setUetTags(uetTags);

        return CampaignManagementService.getService().updateUetTags(request);
    }
    static void outputAccountMigrationStatusesInfo(AccountMigrationStatusesInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountMigrationStatusesInfo * * *");
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage("MigrationStatusInfos:");
            outputArrayOfMigrationStatusInfo(dataObject.getMigrationStatusInfos());
            outputStatusMessage("* * * End OutputAccountMigrationStatusesInfo * * *");
        }
    }
    static void outputArrayOfAccountMigrationStatusesInfo(ArrayOfAccountMigrationStatusesInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountMigrationStatusesInfo dataObject : dataObjects.getAccountMigrationStatusesInfos())
            {
                outputAccountMigrationStatusesInfo(dataObject);
            }
        }
    }
    static void outputAccountProperty(AccountProperty dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountProperty * * *");
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputAccountProperty * * *");
        }
    }
    static void outputArrayOfAccountProperty(ArrayOfAccountProperty dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountProperty dataObject : dataObjects.getAccountProperties())
            {
                outputAccountProperty(dataObject);
            }
        }
    }
    static void outputActionAdExtension(ActionAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputActionAdExtension * * *");
            outputStatusMessage(String.format("ActionType: %s", dataObject.getActionType()));
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputActionAdExtension * * *");
        }
    }
    static void outputArrayOfActionAdExtension(ArrayList<ActionAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ActionAdExtension dataObject : dataObjects)
            {
                outputActionAdExtension(dataObject);
            }
        }
    }
    static void outputAd(Ad dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAd * * *");
            outputStatusMessage(String.format("AdFormatPreference: %s", dataObject.getAdFormatPreference()));
            outputStatusMessage(String.format("DevicePreference: %s", dataObject.getDevicePreference()));
            outputStatusMessage(String.format("EditorialStatus: %s", dataObject.getEditorialStatus()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            if(dataObject instanceof AppInstallAd)
            {
                outputAppInstallAd((AppInstallAd)dataObject);
            }
            if(dataObject instanceof DynamicSearchAd)
            {
                outputDynamicSearchAd((DynamicSearchAd)dataObject);
            }
            if(dataObject instanceof ExpandedTextAd)
            {
                outputExpandedTextAd((ExpandedTextAd)dataObject);
            }
            if(dataObject instanceof ProductAd)
            {
                outputProductAd((ProductAd)dataObject);
            }
            if(dataObject instanceof ResponsiveAd)
            {
                outputResponsiveAd((ResponsiveAd)dataObject);
            }
            if(dataObject instanceof ResponsiveSearchAd)
            {
                outputResponsiveSearchAd((ResponsiveSearchAd)dataObject);
            }
            if(dataObject instanceof TextAd)
            {
                outputTextAd((TextAd)dataObject);
            }
            outputStatusMessage("* * * End OutputAd * * *");
        }
    }
    static void outputArrayOfAd(ArrayOfAd dataObjects)
    {
        if (null != dataObjects)
        {
            for (Ad dataObject : dataObjects.getAds())
            {
                outputAd(dataObject);
            }
        }
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputAdApiError * * *");
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiFaultDetail * * *");
            outputStatusMessage("Errors:");
            outputArrayOfAdApiError(dataObject.getErrors());
            outputStatusMessage("* * * End OutputAdApiFaultDetail * * *");
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
            }
        }
    }
    static void outputAddress(Address dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAddress * * *");
            outputStatusMessage(String.format("CityName: %s", dataObject.getCityName()));
            outputStatusMessage(String.format("CountryCode: %s", dataObject.getCountryCode()));
            outputStatusMessage(String.format("PostalCode: %s", dataObject.getPostalCode()));
            outputStatusMessage(String.format("ProvinceCode: %s", dataObject.getProvinceCode()));
            outputStatusMessage(String.format("ProvinceName: %s", dataObject.getProvinceName()));
            outputStatusMessage(String.format("StreetAddress: %s", dataObject.getStreetAddress()));
            outputStatusMessage(String.format("StreetAddress2: %s", dataObject.getStreetAddress2()));
            outputStatusMessage("* * * End OutputAddress * * *");
        }
    }
    static void outputArrayOfAddress(ArrayList<Address> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Address dataObject : dataObjects)
            {
                outputAddress(dataObject);
            }
        }
    }
    static void outputAdExtension(AdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtension * * *");
            outputStatusMessage(String.format("DevicePreference: %s", dataObject.getDevicePreference()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage("Scheduling:");
            outputSchedule(dataObject.getScheduling());
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage(String.format("Version: %s", dataObject.getVersion()));
            if(dataObject instanceof ActionAdExtension)
            {
                outputActionAdExtension((ActionAdExtension)dataObject);
            }
            if(dataObject instanceof AppAdExtension)
            {
                outputAppAdExtension((AppAdExtension)dataObject);
            }
            if(dataObject instanceof CallAdExtension)
            {
                outputCallAdExtension((CallAdExtension)dataObject);
            }
            if(dataObject instanceof CalloutAdExtension)
            {
                outputCalloutAdExtension((CalloutAdExtension)dataObject);
            }
            if(dataObject instanceof ImageAdExtension)
            {
                outputImageAdExtension((ImageAdExtension)dataObject);
            }
            if(dataObject instanceof LocationAdExtension)
            {
                outputLocationAdExtension((LocationAdExtension)dataObject);
            }
            if(dataObject instanceof PriceAdExtension)
            {
                outputPriceAdExtension((PriceAdExtension)dataObject);
            }
            if(dataObject instanceof ReviewAdExtension)
            {
                outputReviewAdExtension((ReviewAdExtension)dataObject);
            }
            if(dataObject instanceof SitelinkAdExtension)
            {
                outputSitelinkAdExtension((SitelinkAdExtension)dataObject);
            }
            if(dataObject instanceof StructuredSnippetAdExtension)
            {
                outputStructuredSnippetAdExtension((StructuredSnippetAdExtension)dataObject);
            }
            outputStatusMessage("* * * End OutputAdExtension * * *");
        }
    }
    static void outputArrayOfAdExtension(ArrayOfAdExtension dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtension dataObject : dataObjects.getAdExtensions())
            {
                outputAdExtension(dataObject);
            }
        }
    }
    static void outputAdExtensionAssociation(AdExtensionAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionAssociation * * *");
            outputStatusMessage("AdExtension:");
            outputAdExtension(dataObject.getAdExtension());
            outputStatusMessage(String.format("AssociationType: %s", dataObject.getAssociationType()));
            outputStatusMessage(String.format("EditorialStatus: %s", dataObject.getEditorialStatus()));
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage("* * * End OutputAdExtensionAssociation * * *");
        }
    }
    static void outputArrayOfAdExtensionAssociation(ArrayOfAdExtensionAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionAssociation dataObject : dataObjects.getAdExtensionAssociations())
            {
                outputAdExtensionAssociation(dataObject);
            }
        }
    }
    static void outputAdExtensionAssociationCollection(AdExtensionAssociationCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionAssociationCollection * * *");
            outputStatusMessage("AdExtensionAssociations:");
            outputArrayOfAdExtensionAssociation(dataObject.getAdExtensionAssociations());
            outputStatusMessage("* * * End OutputAdExtensionAssociationCollection * * *");
        }
    }
    static void outputArrayOfAdExtensionAssociationCollection(ArrayOfAdExtensionAssociationCollection dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionAssociationCollection dataObject : dataObjects.getAdExtensionAssociationCollections())
            {
                outputAdExtensionAssociationCollection(dataObject);
            }
        }
    }
    static void outputAdExtensionEditorialReason(AdExtensionEditorialReason dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionEditorialReason * * *");
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage("PublisherCountries:");
            outputArrayOfstring(dataObject.getPublisherCountries());
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
            outputStatusMessage(String.format("Term: %s", dataObject.getTerm()));
            outputStatusMessage("* * * End OutputAdExtensionEditorialReason * * *");
        }
    }
    static void outputArrayOfAdExtensionEditorialReason(ArrayOfAdExtensionEditorialReason dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionEditorialReason dataObject : dataObjects.getAdExtensionEditorialReasons())
            {
                outputAdExtensionEditorialReason(dataObject);
            }
        }
    }
    static void outputAdExtensionEditorialReasonCollection(AdExtensionEditorialReasonCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionEditorialReasonCollection * * *");
            outputStatusMessage(String.format("AdExtensionId: %s", dataObject.getAdExtensionId()));
            outputStatusMessage("Reasons:");
            outputArrayOfAdExtensionEditorialReason(dataObject.getReasons());
            outputStatusMessage("* * * End OutputAdExtensionEditorialReasonCollection * * *");
        }
    }
    static void outputArrayOfAdExtensionEditorialReasonCollection(ArrayOfAdExtensionEditorialReasonCollection dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionEditorialReasonCollection dataObject : dataObjects.getAdExtensionEditorialReasonCollections())
            {
                outputAdExtensionEditorialReasonCollection(dataObject);
            }
        }
    }
    static void outputAdExtensionIdentity(AdExtensionIdentity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionIdentity * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Version: %s", dataObject.getVersion()));
            outputStatusMessage("* * * End OutputAdExtensionIdentity * * *");
        }
    }
    static void outputArrayOfAdExtensionIdentity(ArrayOfAdExtensionIdentity dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionIdentity dataObject : dataObjects.getAdExtensionIdentities())
            {
                outputAdExtensionIdentity(dataObject);
            }
        }
    }
    static void outputAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionIdToEntityIdAssociation * * *");
            outputStatusMessage(String.format("AdExtensionId: %s", dataObject.getAdExtensionId()));
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage("* * * End OutputAdExtensionIdToEntityIdAssociation * * *");
        }
    }
    static void outputArrayOfAdExtensionIdToEntityIdAssociation(ArrayOfAdExtensionIdToEntityIdAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionIdToEntityIdAssociation dataObject : dataObjects.getAdExtensionIdToEntityIdAssociations())
            {
                outputAdExtensionIdToEntityIdAssociation(dataObject);
            }
        }
    }
    static void outputAdGroup(AdGroup dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroup * * *");
            outputStatusMessage("AdRotation:");
            outputAdRotation(dataObject.getAdRotation());
            outputStatusMessage(String.format("AudienceAdsBidAdjustment: %s", dataObject.getAudienceAdsBidAdjustment()));
            outputStatusMessage("BiddingScheme:");
            outputBiddingScheme(dataObject.getBiddingScheme());
            outputStatusMessage("CpcBid:");
            outputBid(dataObject.getCpcBid());
            outputStatusMessage("EndDate:");
            outputDate(dataObject.getEndDate());
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Network: %s", dataObject.getNetwork()));
            outputStatusMessage(String.format("PrivacyStatus: %s", dataObject.getPrivacyStatus()));
            outputStatusMessage("Settings:");
            outputArrayOfSetting(dataObject.getSettings());
            outputStatusMessage("StartDate:");
            outputDate(dataObject.getStartDate());
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputAdGroup * * *");
        }
    }
    static void outputArrayOfAdGroup(ArrayOfAdGroup dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroup dataObject : dataObjects.getAdGroups())
            {
                outputAdGroup(dataObject);
            }
        }
    }
    static void outputAdGroupCriterion(AdGroupCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupCriterion * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("Criterion:");
            outputCriterion(dataObject.getCriterion());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof BiddableAdGroupCriterion)
            {
                outputBiddableAdGroupCriterion((BiddableAdGroupCriterion)dataObject);
            }
            if(dataObject instanceof NegativeAdGroupCriterion)
            {
                outputNegativeAdGroupCriterion((NegativeAdGroupCriterion)dataObject);
            }
            outputStatusMessage("* * * End OutputAdGroupCriterion * * *");
        }
    }
    static void outputArrayOfAdGroupCriterion(ArrayOfAdGroupCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupCriterion dataObject : dataObjects.getAdGroupCriterions())
            {
                outputAdGroupCriterion(dataObject);
            }
        }
    }
    static void outputAdGroupCriterionAction(AdGroupCriterionAction dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupCriterionAction * * *");
            outputStatusMessage(String.format("Action: %s", dataObject.getAction()));
            outputStatusMessage("AdGroupCriterion:");
            outputAdGroupCriterion(dataObject.getAdGroupCriterion());
            outputStatusMessage("* * * End OutputAdGroupCriterionAction * * *");
        }
    }
    static void outputArrayOfAdGroupCriterionAction(ArrayOfAdGroupCriterionAction dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupCriterionAction dataObject : dataObjects.getAdGroupCriterionActions())
            {
                outputAdGroupCriterionAction(dataObject);
            }
        }
    }
    static void outputAdGroupNegativeSites(AdGroupNegativeSites dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupNegativeSites * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("NegativeSites:");
            outputArrayOfstring(dataObject.getNegativeSites());
            outputStatusMessage("* * * End OutputAdGroupNegativeSites * * *");
        }
    }
    static void outputArrayOfAdGroupNegativeSites(ArrayOfAdGroupNegativeSites dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupNegativeSites dataObject : dataObjects.getAdGroupNegativeSites())
            {
                outputAdGroupNegativeSites(dataObject);
            }
        }
    }
    static void outputAdRotation(AdRotation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdRotation * * *");
            outputStatusMessage(String.format("EndDate: %s", dataObject.getEndDate()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage("* * * End OutputAdRotation * * *");
        }
    }
    static void outputArrayOfAdRotation(ArrayList<AdRotation> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdRotation dataObject : dataObjects)
            {
                outputAdRotation(dataObject);
            }
        }
    }
    static void outputAgeCriterion(AgeCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAgeCriterion * * *");
            outputStatusMessage(String.format("AgeRange: %s", dataObject.getAgeRange()));
            outputStatusMessage("* * * End OutputAgeCriterion * * *");
        }
    }
    static void outputArrayOfAgeCriterion(ArrayList<AgeCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeCriterion dataObject : dataObjects)
            {
                outputAgeCriterion(dataObject);
            }
        }
    }
    static void outputApiFaultDetail(ApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiFaultDetail * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            outputStatusMessage("* * * End OutputApiFaultDetail * * *");
        }
    }
    static void outputArrayOfApiFaultDetail(ArrayList<ApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFaultDetail dataObject : dataObjects)
            {
                outputApiFaultDetail(dataObject);
            }
        }
    }
    static void outputAppAdExtension(AppAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAppAdExtension * * *");
            outputStatusMessage(String.format("AppPlatform: %s", dataObject.getAppPlatform()));
            outputStatusMessage(String.format("AppStoreId: %s", dataObject.getAppStoreId()));
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage(String.format("DisplayText: %s", dataObject.getDisplayText()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputAppAdExtension * * *");
        }
    }
    static void outputArrayOfAppAdExtension(ArrayList<AppAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AppAdExtension dataObject : dataObjects)
            {
                outputAppAdExtension(dataObject);
            }
        }
    }
    static void outputAppInstallAd(AppInstallAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAppInstallAd * * *");
            outputStatusMessage(String.format("AppPlatform: %s", dataObject.getAppPlatform()));
            outputStatusMessage(String.format("AppStoreId: %s", dataObject.getAppStoreId()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage(String.format("Title: %s", dataObject.getTitle()));
            outputStatusMessage("* * * End OutputAppInstallAd * * *");
        }
    }
    static void outputArrayOfAppInstallAd(ArrayList<AppInstallAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AppInstallAd dataObject : dataObjects)
            {
                outputAppInstallAd(dataObject);
            }
        }
    }
    static void outputAppInstallGoal(AppInstallGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAppInstallGoal * * *");
            outputStatusMessage(String.format("AppPlatform: %s", dataObject.getAppPlatform()));
            outputStatusMessage(String.format("AppStoreId: %s", dataObject.getAppStoreId()));
            outputStatusMessage("* * * End OutputAppInstallGoal * * *");
        }
    }
    static void outputArrayOfAppInstallGoal(ArrayList<AppInstallGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AppInstallGoal dataObject : dataObjects)
            {
                outputAppInstallGoal(dataObject);
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApplicationFault * * *");
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFaultDetail)
            {
                outputApiFaultDetail((ApiFaultDetail)dataObject);
            }
            if(dataObject instanceof EditorialApiFaultDetail)
            {
                outputEditorialApiFaultDetail((EditorialApiFaultDetail)dataObject);
            }
            outputStatusMessage("* * * End OutputApplicationFault * * *");
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
            }
        }
    }
    static void outputAppUrl(AppUrl dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAppUrl * * *");
            outputStatusMessage(String.format("OsType: %s", dataObject.getOsType()));
            outputStatusMessage(String.format("Url: %s", dataObject.getUrl()));
            outputStatusMessage("* * * End OutputAppUrl * * *");
        }
    }
    static void outputArrayOfAppUrl(ArrayOfAppUrl dataObjects)
    {
        if (null != dataObjects)
        {
            for (AppUrl dataObject : dataObjects.getAppUrls())
            {
                outputAppUrl(dataObject);
            }
        }
    }
    static void outputAsset(Asset dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAsset * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof ImageAsset)
            {
                outputImageAsset((ImageAsset)dataObject);
            }
            if(dataObject instanceof TextAsset)
            {
                outputTextAsset((TextAsset)dataObject);
            }
            outputStatusMessage("* * * End OutputAsset * * *");
        }
    }
    static void outputArrayOfAsset(ArrayList<Asset> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Asset dataObject : dataObjects)
            {
                outputAsset(dataObject);
            }
        }
    }
    static void outputAssetLink(AssetLink dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAssetLink * * *");
            outputStatusMessage("Asset:");
            outputAsset(dataObject.getAsset());
            outputStatusMessage(String.format("AssetPerformanceLabel: %s", dataObject.getAssetPerformanceLabel()));
            outputStatusMessage(String.format("EditorialStatus: %s", dataObject.getEditorialStatus()));
            outputStatusMessage(String.format("PinnedField: %s", dataObject.getPinnedField()));
            outputStatusMessage("* * * End OutputAssetLink * * *");
        }
    }
    static void outputArrayOfAssetLink(ArrayOfAssetLink dataObjects)
    {
        if (null != dataObjects)
        {
            for (AssetLink dataObject : dataObjects.getAssetLinks())
            {
                outputAssetLink(dataObject);
            }
        }
    }
    static void outputAudience(Audience dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAudience * * *");
            outputStatusMessage(String.format("AudienceNetworkSize: %s", dataObject.getAudienceNetworkSize()));
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MembershipDuration: %s", dataObject.getMembershipDuration()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("ParentId: %s", dataObject.getParentId()));
            outputStatusMessage(String.format("Scope: %s", dataObject.getScope()));
            outputStatusMessage(String.format("SearchSize: %s", dataObject.getSearchSize()));
            outputStatusMessage("SupportedCampaignTypes:");
            outputArrayOfstring(dataObject.getSupportedCampaignTypes());
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof CustomAudience)
            {
                outputCustomAudience((CustomAudience)dataObject);
            }
            if(dataObject instanceof InMarketAudience)
            {
                outputInMarketAudience((InMarketAudience)dataObject);
            }
            if(dataObject instanceof ProductAudience)
            {
                outputProductAudience((ProductAudience)dataObject);
            }
            if(dataObject instanceof RemarketingList)
            {
                outputRemarketingList((RemarketingList)dataObject);
            }
            if(dataObject instanceof SimilarRemarketingList)
            {
                outputSimilarRemarketingList((SimilarRemarketingList)dataObject);
            }
            outputStatusMessage("* * * End OutputAudience * * *");
        }
    }
    static void outputArrayOfAudience(ArrayOfAudience dataObjects)
    {
        if (null != dataObjects)
        {
            for (Audience dataObject : dataObjects.getAudiences())
            {
                outputAudience(dataObject);
            }
        }
    }
    static void outputAudienceCriterion(AudienceCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAudienceCriterion * * *");
            outputStatusMessage(String.format("AudienceId: %s", dataObject.getAudienceId()));
            outputStatusMessage(String.format("AudienceType: %s", dataObject.getAudienceType()));
            outputStatusMessage("* * * End OutputAudienceCriterion * * *");
        }
    }
    static void outputArrayOfAudienceCriterion(ArrayList<AudienceCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AudienceCriterion dataObject : dataObjects)
            {
                outputAudienceCriterion(dataObject);
            }
        }
    }
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBatchError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("FieldPath: %s", dataObject.getFieldPath()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof EditorialError)
            {
                outputEditorialError((EditorialError)dataObject);
            }
            outputStatusMessage("* * * End OutputBatchError * * *");
        }
    }
    static void outputArrayOfBatchError(ArrayOfBatchError dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchError dataObject : dataObjects.getBatchErrors())
            {
                outputBatchError(dataObject);
            }
        }
    }
    static void outputBatchErrorCollection(BatchErrorCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBatchErrorCollection * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("FieldPath: %s", dataObject.getFieldPath()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof EditorialErrorCollection)
            {
                outputEditorialErrorCollection((EditorialErrorCollection)dataObject);
            }
            outputStatusMessage("* * * End OutputBatchErrorCollection * * *");
        }
    }
    static void outputArrayOfBatchErrorCollection(ArrayOfBatchErrorCollection dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchErrorCollection dataObject : dataObjects.getBatchErrorCollections())
            {
                outputBatchErrorCollection(dataObject);
            }
        }
    }
    static void outputBid(Bid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBid * * *");
            outputStatusMessage(String.format("Amount: %s", dataObject.getAmount()));
            outputStatusMessage("* * * End OutputBid * * *");
        }
    }
    static void outputArrayOfBid(ArrayList<Bid> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Bid dataObject : dataObjects)
            {
                outputBid(dataObject);
            }
        }
    }
    static void outputBiddableAdGroupCriterion(BiddableAdGroupCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBiddableAdGroupCriterion * * *");
            outputStatusMessage("CriterionBid:");
            outputCriterionBid(dataObject.getCriterionBid());
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage(String.format("EditorialStatus: %s", dataObject.getEditorialStatus()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputBiddableAdGroupCriterion * * *");
        }
    }
    static void outputArrayOfBiddableAdGroupCriterion(ArrayList<BiddableAdGroupCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BiddableAdGroupCriterion dataObject : dataObjects)
            {
                outputBiddableAdGroupCriterion(dataObject);
            }
        }
    }
    static void outputBiddableCampaignCriterion(BiddableCampaignCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBiddableCampaignCriterion * * *");
            outputStatusMessage("CriterionBid:");
            outputCriterionBid(dataObject.getCriterionBid());
            outputStatusMessage("* * * End OutputBiddableCampaignCriterion * * *");
        }
    }
    static void outputArrayOfBiddableCampaignCriterion(ArrayList<BiddableCampaignCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BiddableCampaignCriterion dataObject : dataObjects)
            {
                outputBiddableCampaignCriterion(dataObject);
            }
        }
    }
    static void outputBiddingScheme(BiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBiddingScheme * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof EnhancedCpcBiddingScheme)
            {
                outputEnhancedCpcBiddingScheme((EnhancedCpcBiddingScheme)dataObject);
            }
            if(dataObject instanceof InheritFromParentBiddingScheme)
            {
                outputInheritFromParentBiddingScheme((InheritFromParentBiddingScheme)dataObject);
            }
            if(dataObject instanceof ManualCpcBiddingScheme)
            {
                outputManualCpcBiddingScheme((ManualCpcBiddingScheme)dataObject);
            }
            if(dataObject instanceof MaxClicksBiddingScheme)
            {
                outputMaxClicksBiddingScheme((MaxClicksBiddingScheme)dataObject);
            }
            if(dataObject instanceof MaxConversionsBiddingScheme)
            {
                outputMaxConversionsBiddingScheme((MaxConversionsBiddingScheme)dataObject);
            }
            if(dataObject instanceof TargetCpaBiddingScheme)
            {
                outputTargetCpaBiddingScheme((TargetCpaBiddingScheme)dataObject);
            }
            outputStatusMessage("* * * End OutputBiddingScheme * * *");
        }
    }
    static void outputArrayOfBiddingScheme(ArrayList<BiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BiddingScheme dataObject : dataObjects)
            {
                outputBiddingScheme(dataObject);
            }
        }
    }
    static void outputBidMultiplier(BidMultiplier dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBidMultiplier * * *");
            outputStatusMessage(String.format("Multiplier: %s", dataObject.getMultiplier()));
            outputStatusMessage("* * * End OutputBidMultiplier * * *");
        }
    }
    static void outputArrayOfBidMultiplier(ArrayList<BidMultiplier> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BidMultiplier dataObject : dataObjects)
            {
                outputBidMultiplier(dataObject);
            }
        }
    }
    static void outputBMCStore(BMCStore dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBMCStore * * *");
            outputStatusMessage(String.format("HasCatalog: %s", dataObject.getHasCatalog()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("IsActive: %s", dataObject.getIsActive()));
            outputStatusMessage(String.format("IsProductAdsEnabled: %s", dataObject.getIsProductAdsEnabled()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("SubType: %s", dataObject.getSubType()));
            outputStatusMessage("* * * End OutputBMCStore * * *");
        }
    }
    static void outputArrayOfBMCStore(ArrayOfBMCStore dataObjects)
    {
        if (null != dataObjects)
        {
            for (BMCStore dataObject : dataObjects.getBMCStores())
            {
                outputBMCStore(dataObject);
            }
        }
    }
    static void outputBudget(Budget dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBudget * * *");
            outputStatusMessage(String.format("Amount: %s", dataObject.getAmount()));
            outputStatusMessage(String.format("AssociationCount: %s", dataObject.getAssociationCount()));
            outputStatusMessage(String.format("BudgetType: %s", dataObject.getBudgetType()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage("* * * End OutputBudget * * *");
        }
    }
    static void outputArrayOfBudget(ArrayOfBudget dataObjects)
    {
        if (null != dataObjects)
        {
            for (Budget dataObject : dataObjects.getBudgets())
            {
                outputBudget(dataObject);
            }
        }
    }
    static void outputCallAdExtension(CallAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCallAdExtension * * *");
            outputStatusMessage(String.format("CountryCode: %s", dataObject.getCountryCode()));
            outputStatusMessage(String.format("IsCallOnly: %s", dataObject.getIsCallOnly()));
            outputStatusMessage(String.format("IsCallTrackingEnabled: %s", dataObject.getIsCallTrackingEnabled()));
            outputStatusMessage(String.format("PhoneNumber: %s", dataObject.getPhoneNumber()));
            outputStatusMessage(String.format("RequireTollFreeTrackingNumber: %s", dataObject.getRequireTollFreeTrackingNumber()));
            outputStatusMessage("* * * End OutputCallAdExtension * * *");
        }
    }
    static void outputArrayOfCallAdExtension(ArrayList<CallAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CallAdExtension dataObject : dataObjects)
            {
                outputCallAdExtension(dataObject);
            }
        }
    }
    static void outputCalloutAdExtension(CalloutAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCalloutAdExtension * * *");
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputCalloutAdExtension * * *");
        }
    }
    static void outputArrayOfCalloutAdExtension(ArrayList<CalloutAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CalloutAdExtension dataObject : dataObjects)
            {
                outputCalloutAdExtension(dataObject);
            }
        }
    }
    static void outputCampaign(Campaign dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaign * * *");
            outputStatusMessage(String.format("AudienceAdsBidAdjustment: %s", dataObject.getAudienceAdsBidAdjustment()));
            outputStatusMessage("BiddingScheme:");
            outputBiddingScheme(dataObject.getBiddingScheme());
            outputStatusMessage(String.format("BudgetType: %s", dataObject.getBudgetType()));
            outputStatusMessage(String.format("DailyBudget: %s", dataObject.getDailyBudget()));
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage(String.format("ExperimentId: %s", dataObject.getExperimentId()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("SubType: %s", dataObject.getSubType()));
            outputStatusMessage(String.format("TimeZone: %s", dataObject.getTimeZone()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage(String.format("CampaignType: %s", dataObject.getCampaignType()));
            outputStatusMessage("Settings:");
            outputArrayOfSetting(dataObject.getSettings());
            outputStatusMessage(String.format("BudgetId: %s", dataObject.getBudgetId()));
            outputStatusMessage("Languages:");
            outputArrayOfstring(dataObject.getLanguages());
            outputStatusMessage("* * * End OutputCampaign * * *");
        }
    }
    static void outputArrayOfCampaign(ArrayOfCampaign dataObjects)
    {
        if (null != dataObjects)
        {
            for (Campaign dataObject : dataObjects.getCampaigns())
            {
                outputCampaign(dataObject);
            }
        }
    }
    static void outputCampaignCriterion(CampaignCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignCriterion * * *");
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage("Criterion:");
            outputCriterion(dataObject.getCriterion());
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof BiddableCampaignCriterion)
            {
                outputBiddableCampaignCriterion((BiddableCampaignCriterion)dataObject);
            }
            if(dataObject instanceof NegativeCampaignCriterion)
            {
                outputNegativeCampaignCriterion((NegativeCampaignCriterion)dataObject);
            }
            outputStatusMessage("* * * End OutputCampaignCriterion * * *");
        }
    }
    static void outputArrayOfCampaignCriterion(ArrayOfCampaignCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignCriterion dataObject : dataObjects.getCampaignCriterions())
            {
                outputCampaignCriterion(dataObject);
            }
        }
    }
    static void outputCampaignNegativeSites(CampaignNegativeSites dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignNegativeSites * * *");
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage("NegativeSites:");
            outputArrayOfstring(dataObject.getNegativeSites());
            outputStatusMessage("* * * End OutputCampaignNegativeSites * * *");
        }
    }
    static void outputArrayOfCampaignNegativeSites(ArrayOfCampaignNegativeSites dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignNegativeSites dataObject : dataObjects.getCampaignNegativeSites())
            {
                outputCampaignNegativeSites(dataObject);
            }
        }
    }
    static void outputConversionGoal(ConversionGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputConversionGoal * * *");
            outputStatusMessage(String.format("ConversionWindowInMinutes: %s", dataObject.getConversionWindowInMinutes()));
            outputStatusMessage(String.format("CountType: %s", dataObject.getCountType()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage("Revenue:");
            outputConversionGoalRevenue(dataObject.getRevenue());
            outputStatusMessage(String.format("Scope: %s", dataObject.getScope()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("TagId: %s", dataObject.getTagId()));
            outputStatusMessage(String.format("TrackingStatus: %s", dataObject.getTrackingStatus()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof AppInstallGoal)
            {
                outputAppInstallGoal((AppInstallGoal)dataObject);
            }
            if(dataObject instanceof DurationGoal)
            {
                outputDurationGoal((DurationGoal)dataObject);
            }
            if(dataObject instanceof EventGoal)
            {
                outputEventGoal((EventGoal)dataObject);
            }
            if(dataObject instanceof InStoreTransactionGoal)
            {
                outputInStoreTransactionGoal((InStoreTransactionGoal)dataObject);
            }
            if(dataObject instanceof OfflineConversionGoal)
            {
                outputOfflineConversionGoal((OfflineConversionGoal)dataObject);
            }
            if(dataObject instanceof PagesViewedPerVisitGoal)
            {
                outputPagesViewedPerVisitGoal((PagesViewedPerVisitGoal)dataObject);
            }
            if(dataObject instanceof UrlGoal)
            {
                outputUrlGoal((UrlGoal)dataObject);
            }
            outputStatusMessage("* * * End OutputConversionGoal * * *");
        }
    }
    static void outputArrayOfConversionGoal(ArrayOfConversionGoal dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionGoal dataObject : dataObjects.getConversionGoals())
            {
                outputConversionGoal(dataObject);
            }
        }
    }
    static void outputConversionGoalRevenue(ConversionGoalRevenue dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputConversionGoalRevenue * * *");
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputConversionGoalRevenue * * *");
        }
    }
    static void outputArrayOfConversionGoalRevenue(ArrayList<ConversionGoalRevenue> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionGoalRevenue dataObject : dataObjects)
            {
                outputConversionGoalRevenue(dataObject);
            }
        }
    }
    static void outputCoOpSetting(CoOpSetting dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCoOpSetting * * *");
            outputStatusMessage(String.format("BidBoostValue: %s", dataObject.getBidBoostValue()));
            outputStatusMessage(String.format("BidMaxValue: %s", dataObject.getBidMaxValue()));
            outputStatusMessage(String.format("BidOption: %s", dataObject.getBidOption()));
            outputStatusMessage("* * * End OutputCoOpSetting * * *");
        }
    }
    static void outputArrayOfCoOpSetting(ArrayList<CoOpSetting> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CoOpSetting dataObject : dataObjects)
            {
                outputCoOpSetting(dataObject);
            }
        }
    }
    static void outputCriterion(Criterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCriterion * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof AgeCriterion)
            {
                outputAgeCriterion((AgeCriterion)dataObject);
            }
            if(dataObject instanceof AudienceCriterion)
            {
                outputAudienceCriterion((AudienceCriterion)dataObject);
            }
            if(dataObject instanceof DayTimeCriterion)
            {
                outputDayTimeCriterion((DayTimeCriterion)dataObject);
            }
            if(dataObject instanceof DeviceCriterion)
            {
                outputDeviceCriterion((DeviceCriterion)dataObject);
            }
            if(dataObject instanceof GenderCriterion)
            {
                outputGenderCriterion((GenderCriterion)dataObject);
            }
            if(dataObject instanceof LocationCriterion)
            {
                outputLocationCriterion((LocationCriterion)dataObject);
            }
            if(dataObject instanceof LocationIntentCriterion)
            {
                outputLocationIntentCriterion((LocationIntentCriterion)dataObject);
            }
            if(dataObject instanceof ProductPartition)
            {
                outputProductPartition((ProductPartition)dataObject);
            }
            if(dataObject instanceof ProductScope)
            {
                outputProductScope((ProductScope)dataObject);
            }
            if(dataObject instanceof ProfileCriterion)
            {
                outputProfileCriterion((ProfileCriterion)dataObject);
            }
            if(dataObject instanceof RadiusCriterion)
            {
                outputRadiusCriterion((RadiusCriterion)dataObject);
            }
            if(dataObject instanceof Webpage)
            {
                outputWebpage((Webpage)dataObject);
            }
            outputStatusMessage("* * * End OutputCriterion * * *");
        }
    }
    static void outputArrayOfCriterion(ArrayList<Criterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Criterion dataObject : dataObjects)
            {
                outputCriterion(dataObject);
            }
        }
    }
    static void outputCriterionBid(CriterionBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCriterionBid * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof BidMultiplier)
            {
                outputBidMultiplier((BidMultiplier)dataObject);
            }
            if(dataObject instanceof FixedBid)
            {
                outputFixedBid((FixedBid)dataObject);
            }
            outputStatusMessage("* * * End OutputCriterionBid * * *");
        }
    }
    static void outputArrayOfCriterionBid(ArrayList<CriterionBid> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CriterionBid dataObject : dataObjects)
            {
                outputCriterionBid(dataObject);
            }
        }
    }
    static void outputCustomAudience(CustomAudience dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomAudience * * *");
            outputStatusMessage("* * * End OutputCustomAudience * * *");
        }
    }
    static void outputArrayOfCustomAudience(ArrayList<CustomAudience> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomAudience dataObject : dataObjects)
            {
                outputCustomAudience(dataObject);
            }
        }
    }
    static void outputCustomEventsRule(CustomEventsRule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomEventsRule * * *");
            outputStatusMessage(String.format("Action: %s", dataObject.getAction()));
            outputStatusMessage(String.format("ActionOperator: %s", dataObject.getActionOperator()));
            outputStatusMessage(String.format("Category: %s", dataObject.getCategory()));
            outputStatusMessage(String.format("CategoryOperator: %s", dataObject.getCategoryOperator()));
            outputStatusMessage(String.format("Label: %s", dataObject.getLabel()));
            outputStatusMessage(String.format("LabelOperator: %s", dataObject.getLabelOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage(String.format("ValueOperator: %s", dataObject.getValueOperator()));
            outputStatusMessage("* * * End OutputCustomEventsRule * * *");
        }
    }
    static void outputArrayOfCustomEventsRule(ArrayList<CustomEventsRule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomEventsRule dataObject : dataObjects)
            {
                outputCustomEventsRule(dataObject);
            }
        }
    }
    static void outputCustomParameter(CustomParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomParameter * * *");
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputCustomParameter * * *");
        }
    }
    static void outputArrayOfCustomParameter(ArrayOfCustomParameter dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomParameter dataObject : dataObjects.getCustomParameters())
            {
                outputCustomParameter(dataObject);
            }
        }
    }
    static void outputCustomParameters(CustomParameters dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomParameters * * *");
            outputStatusMessage("Parameters:");
            outputArrayOfCustomParameter(dataObject.getParameters());
            outputStatusMessage("* * * End OutputCustomParameters * * *");
        }
    }
    static void outputArrayOfCustomParameters(ArrayList<CustomParameters> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomParameters dataObject : dataObjects)
            {
                outputCustomParameters(dataObject);
            }
        }
    }
    static void outputDate(Date dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDate * * *");
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("Month: %s", dataObject.getMonth()));
            outputStatusMessage(String.format("Year: %s", dataObject.getYear()));
            outputStatusMessage("* * * End OutputDate * * *");
        }
    }
    static void outputArrayOfDate(ArrayList<Date> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Date dataObject : dataObjects)
            {
                outputDate(dataObject);
            }
        }
    }
    static void outputDayTime(DayTime dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDayTime * * *");
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("EndHour: %s", dataObject.getEndHour()));
            outputStatusMessage(String.format("EndMinute: %s", dataObject.getEndMinute()));
            outputStatusMessage(String.format("StartHour: %s", dataObject.getStartHour()));
            outputStatusMessage(String.format("StartMinute: %s", dataObject.getStartMinute()));
            outputStatusMessage("* * * End OutputDayTime * * *");
        }
    }
    static void outputArrayOfDayTime(ArrayOfDayTime dataObjects)
    {
        if (null != dataObjects)
        {
            for (DayTime dataObject : dataObjects.getDayTimes())
            {
                outputDayTime(dataObject);
            }
        }
    }
    static void outputDayTimeCriterion(DayTimeCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDayTimeCriterion * * *");
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("FromHour: %s", dataObject.getFromHour()));
            outputStatusMessage(String.format("FromMinute: %s", dataObject.getFromMinute()));
            outputStatusMessage(String.format("ToHour: %s", dataObject.getToHour()));
            outputStatusMessage(String.format("ToMinute: %s", dataObject.getToMinute()));
            outputStatusMessage("* * * End OutputDayTimeCriterion * * *");
        }
    }
    static void outputArrayOfDayTimeCriterion(ArrayList<DayTimeCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DayTimeCriterion dataObject : dataObjects)
            {
                outputDayTimeCriterion(dataObject);
            }
        }
    }
    static void outputDeviceCriterion(DeviceCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDeviceCriterion * * *");
            outputStatusMessage(String.format("DeviceName: %s", dataObject.getDeviceName()));
            outputStatusMessage(String.format("OSName: %s", dataObject.getOSName()));
            outputStatusMessage("* * * End OutputDeviceCriterion * * *");
        }
    }
    static void outputArrayOfDeviceCriterion(ArrayList<DeviceCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DeviceCriterion dataObject : dataObjects)
            {
                outputDeviceCriterion(dataObject);
            }
        }
    }
    static void outputDurationGoal(DurationGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDurationGoal * * *");
            outputStatusMessage(String.format("MinimumDurationInSeconds: %s", dataObject.getMinimumDurationInSeconds()));
            outputStatusMessage("* * * End OutputDurationGoal * * *");
        }
    }
    static void outputArrayOfDurationGoal(ArrayList<DurationGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DurationGoal dataObject : dataObjects)
            {
                outputDurationGoal(dataObject);
            }
        }
    }
    static void outputDynamicSearchAd(DynamicSearchAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDynamicSearchAd * * *");
            outputStatusMessage(String.format("Path1: %s", dataObject.getPath1()));
            outputStatusMessage(String.format("Path2: %s", dataObject.getPath2()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputDynamicSearchAd * * *");
        }
    }
    static void outputArrayOfDynamicSearchAd(ArrayList<DynamicSearchAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DynamicSearchAd dataObject : dataObjects)
            {
                outputDynamicSearchAd(dataObject);
            }
        }
    }
    static void outputDynamicSearchAdsSetting(DynamicSearchAdsSetting dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDynamicSearchAdsSetting * * *");
            outputStatusMessage(String.format("DomainName: %s", dataObject.getDomainName()));
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage("PageFeedIds:");
            outputArrayOflong(dataObject.getPageFeedIds());
            outputStatusMessage(String.format("Source: %s", dataObject.getSource()));
            outputStatusMessage("* * * End OutputDynamicSearchAdsSetting * * *");
        }
    }
    static void outputArrayOfDynamicSearchAdsSetting(ArrayList<DynamicSearchAdsSetting> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DynamicSearchAdsSetting dataObject : dataObjects)
            {
                outputDynamicSearchAdsSetting(dataObject);
            }
        }
    }
    static void outputEditorialApiFaultDetail(EditorialApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialApiFaultDetail * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage("EditorialErrors:");
            outputArrayOfEditorialError(dataObject.getEditorialErrors());
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            outputStatusMessage("* * * End OutputEditorialApiFaultDetail * * *");
        }
    }
    static void outputArrayOfEditorialApiFaultDetail(ArrayList<EditorialApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialApiFaultDetail dataObject : dataObjects)
            {
                outputEditorialApiFaultDetail(dataObject);
            }
        }
    }
    static void outputEditorialError(EditorialError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialError * * *");
            outputStatusMessage(String.format("Appealable: %s", dataObject.getAppealable()));
            outputStatusMessage(String.format("DisapprovedText: %s", dataObject.getDisapprovedText()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("PublisherCountry: %s", dataObject.getPublisherCountry()));
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
            outputStatusMessage("* * * End OutputEditorialError * * *");
        }
    }
    static void outputArrayOfEditorialError(ArrayOfEditorialError dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialError dataObject : dataObjects.getEditorialErrors())
            {
                outputEditorialError(dataObject);
            }
        }
    }
    static void outputEditorialErrorCollection(EditorialErrorCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialErrorCollection * * *");
            outputStatusMessage(String.format("Appealable: %s", dataObject.getAppealable()));
            outputStatusMessage(String.format("DisapprovedText: %s", dataObject.getDisapprovedText()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("PublisherCountry: %s", dataObject.getPublisherCountry()));
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
            outputStatusMessage("* * * End OutputEditorialErrorCollection * * *");
        }
    }
    static void outputArrayOfEditorialErrorCollection(ArrayList<EditorialErrorCollection> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialErrorCollection dataObject : dataObjects)
            {
                outputEditorialErrorCollection(dataObject);
            }
        }
    }
    static void outputEditorialReason(EditorialReason dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialReason * * *");
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage("PublisherCountries:");
            outputArrayOfstring(dataObject.getPublisherCountries());
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
            outputStatusMessage(String.format("Term: %s", dataObject.getTerm()));
            outputStatusMessage("* * * End OutputEditorialReason * * *");
        }
    }
    static void outputArrayOfEditorialReason(ArrayOfEditorialReason dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialReason dataObject : dataObjects.getEditorialReasons())
            {
                outputEditorialReason(dataObject);
            }
        }
    }
    static void outputEditorialReasonCollection(EditorialReasonCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialReasonCollection * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdOrKeywordId: %s", dataObject.getAdOrKeywordId()));
            outputStatusMessage(String.format("AppealStatus: %s", dataObject.getAppealStatus()));
            outputStatusMessage("Reasons:");
            outputArrayOfEditorialReason(dataObject.getReasons());
            outputStatusMessage("* * * End OutputEditorialReasonCollection * * *");
        }
    }
    static void outputArrayOfEditorialReasonCollection(ArrayOfEditorialReasonCollection dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialReasonCollection dataObject : dataObjects.getEditorialReasonCollections())
            {
                outputEditorialReasonCollection(dataObject);
            }
        }
    }
    static void outputEnhancedCpcBiddingScheme(EnhancedCpcBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEnhancedCpcBiddingScheme * * *");
            outputStatusMessage("* * * End OutputEnhancedCpcBiddingScheme * * *");
        }
    }
    static void outputArrayOfEnhancedCpcBiddingScheme(ArrayList<EnhancedCpcBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EnhancedCpcBiddingScheme dataObject : dataObjects)
            {
                outputEnhancedCpcBiddingScheme(dataObject);
            }
        }
    }
    static void outputEntityIdToParentIdAssociation(EntityIdToParentIdAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEntityIdToParentIdAssociation * * *");
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage(String.format("ParentId: %s", dataObject.getParentId()));
            outputStatusMessage("* * * End OutputEntityIdToParentIdAssociation * * *");
        }
    }
    static void outputArrayOfEntityIdToParentIdAssociation(ArrayOfEntityIdToParentIdAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (EntityIdToParentIdAssociation dataObject : dataObjects.getEntityIdToParentIdAssociations())
            {
                outputEntityIdToParentIdAssociation(dataObject);
            }
        }
    }
    static void outputEntityNegativeKeyword(EntityNegativeKeyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEntityNegativeKeyword * * *");
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage(String.format("EntityType: %s", dataObject.getEntityType()));
            outputStatusMessage("NegativeKeywords:");
            outputArrayOfNegativeKeyword(dataObject.getNegativeKeywords());
            outputStatusMessage("* * * End OutputEntityNegativeKeyword * * *");
        }
    }
    static void outputArrayOfEntityNegativeKeyword(ArrayOfEntityNegativeKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (EntityNegativeKeyword dataObject : dataObjects.getEntityNegativeKeywords())
            {
                outputEntityNegativeKeyword(dataObject);
            }
        }
    }
    static void outputEventGoal(EventGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEventGoal * * *");
            outputStatusMessage(String.format("ActionExpression: %s", dataObject.getActionExpression()));
            outputStatusMessage(String.format("ActionOperator: %s", dataObject.getActionOperator()));
            outputStatusMessage(String.format("CategoryExpression: %s", dataObject.getCategoryExpression()));
            outputStatusMessage(String.format("CategoryOperator: %s", dataObject.getCategoryOperator()));
            outputStatusMessage(String.format("LabelExpression: %s", dataObject.getLabelExpression()));
            outputStatusMessage(String.format("LabelOperator: %s", dataObject.getLabelOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage(String.format("ValueOperator: %s", dataObject.getValueOperator()));
            outputStatusMessage("* * * End OutputEventGoal * * *");
        }
    }
    static void outputArrayOfEventGoal(ArrayList<EventGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EventGoal dataObject : dataObjects)
            {
                outputEventGoal(dataObject);
            }
        }
    }
    static void outputExpandedTextAd(ExpandedTextAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputExpandedTextAd * * *");
            outputStatusMessage(String.format("Domain: %s", dataObject.getDomain()));
            outputStatusMessage(String.format("Path1: %s", dataObject.getPath1()));
            outputStatusMessage(String.format("Path2: %s", dataObject.getPath2()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage(String.format("TextPart2: %s", dataObject.getTextPart2()));
            outputStatusMessage(String.format("TitlePart1: %s", dataObject.getTitlePart1()));
            outputStatusMessage(String.format("TitlePart2: %s", dataObject.getTitlePart2()));
            outputStatusMessage(String.format("TitlePart3: %s", dataObject.getTitlePart3()));
            outputStatusMessage("* * * End OutputExpandedTextAd * * *");
        }
    }
    static void outputArrayOfExpandedTextAd(ArrayList<ExpandedTextAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ExpandedTextAd dataObject : dataObjects)
            {
                outputExpandedTextAd(dataObject);
            }
        }
    }
    static void outputExperiment(Experiment dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputExperiment * * *");
            outputStatusMessage(String.format("BaseCampaignId: %s", dataObject.getBaseCampaignId()));
            outputStatusMessage("EndDate:");
            outputDate(dataObject.getEndDate());
            outputStatusMessage(String.format("ExperimentCampaignId: %s", dataObject.getExperimentCampaignId()));
            outputStatusMessage(String.format("ExperimentStatus: %s", dataObject.getExperimentStatus()));
            outputStatusMessage(String.format("ExperimentType: %s", dataObject.getExperimentType()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage("StartDate:");
            outputDate(dataObject.getStartDate());
            outputStatusMessage(String.format("TrafficSplitPercent: %s", dataObject.getTrafficSplitPercent()));
            outputStatusMessage("* * * End OutputExperiment * * *");
        }
    }
    static void outputArrayOfExperiment(ArrayOfExperiment dataObjects)
    {
        if (null != dataObjects)
        {
            for (Experiment dataObject : dataObjects.getExperiments())
            {
                outputExperiment(dataObject);
            }
        }
    }
    static void outputFixedBid(FixedBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputFixedBid * * *");
            outputStatusMessage(String.format("Amount: %s", dataObject.getAmount()));
            outputStatusMessage("* * * End OutputFixedBid * * *");
        }
    }
    static void outputArrayOfFixedBid(ArrayList<FixedBid> dataObjects)
    {
        if (null != dataObjects)
        {
            for (FixedBid dataObject : dataObjects)
            {
                outputFixedBid(dataObject);
            }
        }
    }
    static void outputGenderCriterion(GenderCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGenderCriterion * * *");
            outputStatusMessage(String.format("GenderType: %s", dataObject.getGenderType()));
            outputStatusMessage("* * * End OutputGenderCriterion * * *");
        }
    }
    static void outputArrayOfGenderCriterion(ArrayList<GenderCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GenderCriterion dataObject : dataObjects)
            {
                outputGenderCriterion(dataObject);
            }
        }
    }
    static void outputGeoPoint(GeoPoint dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGeoPoint * * *");
            outputStatusMessage(String.format("LatitudeInMicroDegrees: %s", dataObject.getLatitudeInMicroDegrees()));
            outputStatusMessage(String.format("LongitudeInMicroDegrees: %s", dataObject.getLongitudeInMicroDegrees()));
            outputStatusMessage("* * * End OutputGeoPoint * * *");
        }
    }
    static void outputArrayOfGeoPoint(ArrayList<GeoPoint> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GeoPoint dataObject : dataObjects)
            {
                outputGeoPoint(dataObject);
            }
        }
    }
    static void outputIdCollection(IdCollection dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputIdCollection * * *");
            outputStatusMessage("Ids:");
            outputArrayOfNullableOflong(dataObject.getIds());
            outputStatusMessage("* * * End OutputIdCollection * * *");
        }
    }
    static void outputArrayOfIdCollection(ArrayOfIdCollection dataObjects)
    {
        if (null != dataObjects)
        {
            for (IdCollection dataObject : dataObjects.getIdCollections())
            {
                outputIdCollection(dataObject);
            }
        }
    }
    static void outputImage(Image dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputImage * * *");
            outputStatusMessage(String.format("Data: %s", dataObject.getData()));
            outputStatusMessage("* * * End OutputImage * * *");
        }
    }
    static void outputArrayOfImage(ArrayList<Image> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Image dataObject : dataObjects)
            {
                outputImage(dataObject);
            }
        }
    }
    static void outputImageAdExtension(ImageAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputImageAdExtension * * *");
            outputStatusMessage(String.format("AlternativeText: %s", dataObject.getAlternativeText()));
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage("ImageMediaIds:");
            outputArrayOflong(dataObject.getImageMediaIds());
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputImageAdExtension * * *");
        }
    }
    static void outputArrayOfImageAdExtension(ArrayList<ImageAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ImageAdExtension dataObject : dataObjects)
            {
                outputImageAdExtension(dataObject);
            }
        }
    }
    static void outputImageAsset(ImageAsset dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputImageAsset * * *");
            outputStatusMessage(String.format("CropHeight: %s", dataObject.getCropHeight()));
            outputStatusMessage(String.format("CropWidth: %s", dataObject.getCropWidth()));
            outputStatusMessage(String.format("CropX: %s", dataObject.getCropX()));
            outputStatusMessage(String.format("CropY: %s", dataObject.getCropY()));
            outputStatusMessage(String.format("SubType: %s", dataObject.getSubType()));
            outputStatusMessage("* * * End OutputImageAsset * * *");
        }
    }
    static void outputArrayOfImageAsset(ArrayList<ImageAsset> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ImageAsset dataObject : dataObjects)
            {
                outputImageAsset(dataObject);
            }
        }
    }
    static void outputImageMediaRepresentation(ImageMediaRepresentation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputImageMediaRepresentation * * *");
            outputStatusMessage(String.format("Height: %s", dataObject.getHeight()));
            outputStatusMessage(String.format("Width: %s", dataObject.getWidth()));
            outputStatusMessage("* * * End OutputImageMediaRepresentation * * *");
        }
    }
    static void outputArrayOfImageMediaRepresentation(ArrayList<ImageMediaRepresentation> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ImageMediaRepresentation dataObject : dataObjects)
            {
                outputImageMediaRepresentation(dataObject);
            }
        }
    }
    static void outputInheritFromParentBiddingScheme(InheritFromParentBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputInheritFromParentBiddingScheme * * *");
            outputStatusMessage(String.format("InheritedBidStrategyType: %s", dataObject.getInheritedBidStrategyType()));
            outputStatusMessage("* * * End OutputInheritFromParentBiddingScheme * * *");
        }
    }
    static void outputArrayOfInheritFromParentBiddingScheme(ArrayList<InheritFromParentBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (InheritFromParentBiddingScheme dataObject : dataObjects)
            {
                outputInheritFromParentBiddingScheme(dataObject);
            }
        }
    }
    static void outputInMarketAudience(InMarketAudience dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputInMarketAudience * * *");
            outputStatusMessage("* * * End OutputInMarketAudience * * *");
        }
    }
    static void outputArrayOfInMarketAudience(ArrayList<InMarketAudience> dataObjects)
    {
        if (null != dataObjects)
        {
            for (InMarketAudience dataObject : dataObjects)
            {
                outputInMarketAudience(dataObject);
            }
        }
    }
    static void outputInStoreTransactionGoal(InStoreTransactionGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputInStoreTransactionGoal * * *");
            outputStatusMessage("* * * End OutputInStoreTransactionGoal * * *");
        }
    }
    static void outputArrayOfInStoreTransactionGoal(ArrayList<InStoreTransactionGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (InStoreTransactionGoal dataObject : dataObjects)
            {
                outputInStoreTransactionGoal(dataObject);
            }
        }
    }
    static void outputKeyValuePairOfstringstring(KeyValuePairOfstringstring dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeyValuePairOfstringstring * * *");
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputKeyValuePairOfstringstring * * *");
        }
    }
    static void outputArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeyValuePairOfstringstring dataObject : dataObjects.getKeyValuePairOfstringstrings())
            {
                outputKeyValuePairOfstringstring(dataObject);
            }
        }
    }
    static void outputKeyword(Keyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeyword * * *");
            outputStatusMessage("Bid:");
            outputBid(dataObject.getBid());
            outputStatusMessage("BiddingScheme:");
            outputBiddingScheme(dataObject.getBiddingScheme());
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage(String.format("EditorialStatus: %s", dataObject.getEditorialStatus()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Param1: %s", dataObject.getParam1()));
            outputStatusMessage(String.format("Param2: %s", dataObject.getParam2()));
            outputStatusMessage(String.format("Param3: %s", dataObject.getParam3()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputKeyword * * *");
        }
    }
    static void outputArrayOfKeyword(ArrayOfKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (Keyword dataObject : dataObjects.getKeywords())
            {
                outputKeyword(dataObject);
            }
        }
    }
    static void outputLabel(Label dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLabel * * *");
            outputStatusMessage(String.format("ColorCode: %s", dataObject.getColorCode()));
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage("* * * End OutputLabel * * *");
        }
    }
    static void outputArrayOfLabel(ArrayOfLabel dataObjects)
    {
        if (null != dataObjects)
        {
            for (Label dataObject : dataObjects.getLabels())
            {
                outputLabel(dataObject);
            }
        }
    }
    static void outputLabelAssociation(LabelAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLabelAssociation * * *");
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage(String.format("LabelId: %s", dataObject.getLabelId()));
            outputStatusMessage("* * * End OutputLabelAssociation * * *");
        }
    }
    static void outputArrayOfLabelAssociation(ArrayOfLabelAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (LabelAssociation dataObject : dataObjects.getLabelAssociations())
            {
                outputLabelAssociation(dataObject);
            }
        }
    }
    static void outputLocationAdExtension(LocationAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLocationAdExtension * * *");
            outputStatusMessage("Address:");
            outputAddress(dataObject.getAddress());
            outputStatusMessage(String.format("CompanyName: %s", dataObject.getCompanyName()));
            outputStatusMessage(String.format("GeoCodeStatus: %s", dataObject.getGeoCodeStatus()));
            outputStatusMessage("GeoPoint:");
            outputGeoPoint(dataObject.getGeoPoint());
            outputStatusMessage(String.format("PhoneNumber: %s", dataObject.getPhoneNumber()));
            outputStatusMessage("* * * End OutputLocationAdExtension * * *");
        }
    }
    static void outputArrayOfLocationAdExtension(ArrayList<LocationAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationAdExtension dataObject : dataObjects)
            {
                outputLocationAdExtension(dataObject);
            }
        }
    }
    static void outputLocationCriterion(LocationCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLocationCriterion * * *");
            outputStatusMessage(String.format("DisplayName: %s", dataObject.getDisplayName()));
            outputStatusMessage("EnclosedLocationIds:");
            outputArrayOflong(dataObject.getEnclosedLocationIds());
            outputStatusMessage(String.format("LocationId: %s", dataObject.getLocationId()));
            outputStatusMessage(String.format("LocationType: %s", dataObject.getLocationType()));
            outputStatusMessage("* * * End OutputLocationCriterion * * *");
        }
    }
    static void outputArrayOfLocationCriterion(ArrayList<LocationCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationCriterion dataObject : dataObjects)
            {
                outputLocationCriterion(dataObject);
            }
        }
    }
    static void outputLocationIntentCriterion(LocationIntentCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLocationIntentCriterion * * *");
            outputStatusMessage(String.format("IntentOption: %s", dataObject.getIntentOption()));
            outputStatusMessage("* * * End OutputLocationIntentCriterion * * *");
        }
    }
    static void outputArrayOfLocationIntentCriterion(ArrayList<LocationIntentCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationIntentCriterion dataObject : dataObjects)
            {
                outputLocationIntentCriterion(dataObject);
            }
        }
    }
    static void outputManualCpcBiddingScheme(ManualCpcBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputManualCpcBiddingScheme * * *");
            outputStatusMessage("* * * End OutputManualCpcBiddingScheme * * *");
        }
    }
    static void outputArrayOfManualCpcBiddingScheme(ArrayList<ManualCpcBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ManualCpcBiddingScheme dataObject : dataObjects)
            {
                outputManualCpcBiddingScheme(dataObject);
            }
        }
    }
    static void outputMaxClicksBiddingScheme(MaxClicksBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMaxClicksBiddingScheme * * *");
            outputStatusMessage("MaxCpc:");
            outputBid(dataObject.getMaxCpc());
            outputStatusMessage("* * * End OutputMaxClicksBiddingScheme * * *");
        }
    }
    static void outputArrayOfMaxClicksBiddingScheme(ArrayList<MaxClicksBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (MaxClicksBiddingScheme dataObject : dataObjects)
            {
                outputMaxClicksBiddingScheme(dataObject);
            }
        }
    }
    static void outputMaxConversionsBiddingScheme(MaxConversionsBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMaxConversionsBiddingScheme * * *");
            outputStatusMessage("MaxCpc:");
            outputBid(dataObject.getMaxCpc());
            outputStatusMessage("* * * End OutputMaxConversionsBiddingScheme * * *");
        }
    }
    static void outputArrayOfMaxConversionsBiddingScheme(ArrayList<MaxConversionsBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (MaxConversionsBiddingScheme dataObject : dataObjects)
            {
                outputMaxConversionsBiddingScheme(dataObject);
            }
        }
    }
    static void outputMedia(Media dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMedia * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MediaType: %s", dataObject.getMediaType()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof Image)
            {
                outputImage((Image)dataObject);
            }
            outputStatusMessage("* * * End OutputMedia * * *");
        }
    }
    static void outputArrayOfMedia(ArrayOfMedia dataObjects)
    {
        if (null != dataObjects)
        {
            for (Media dataObject : dataObjects.getMedias())
            {
                outputMedia(dataObject);
            }
        }
    }
    static void outputMediaAssociation(MediaAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMediaAssociation * * *");
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage(String.format("MediaEnabledEntity: %s", dataObject.getMediaEnabledEntity()));
            outputStatusMessage(String.format("MediaId: %s", dataObject.getMediaId()));
            outputStatusMessage("* * * End OutputMediaAssociation * * *");
        }
    }
    static void outputArrayOfMediaAssociation(ArrayOfMediaAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (MediaAssociation dataObject : dataObjects.getMediaAssociations())
            {
                outputMediaAssociation(dataObject);
            }
        }
    }
    static void outputMediaMetaData(MediaMetaData dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMediaMetaData * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MediaType: %s", dataObject.getMediaType()));
            outputStatusMessage("Representations:");
            outputArrayOfMediaRepresentation(dataObject.getRepresentations());
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage("* * * End OutputMediaMetaData * * *");
        }
    }
    static void outputArrayOfMediaMetaData(ArrayOfMediaMetaData dataObjects)
    {
        if (null != dataObjects)
        {
            for (MediaMetaData dataObject : dataObjects.getMediaMetaDatas())
            {
                outputMediaMetaData(dataObject);
            }
        }
    }
    static void outputMediaRepresentation(MediaRepresentation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMediaRepresentation * * *");
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage(String.format("Url: %s", dataObject.getUrl()));
            if(dataObject instanceof ImageMediaRepresentation)
            {
                outputImageMediaRepresentation((ImageMediaRepresentation)dataObject);
            }
            outputStatusMessage("* * * End OutputMediaRepresentation * * *");
        }
    }
    static void outputArrayOfMediaRepresentation(ArrayOfMediaRepresentation dataObjects)
    {
        if (null != dataObjects)
        {
            for (MediaRepresentation dataObject : dataObjects.getMediaRepresentations())
            {
                outputMediaRepresentation(dataObject);
            }
        }
    }
    static void outputMigrationStatusInfo(MigrationStatusInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputMigrationStatusInfo * * *");
            outputStatusMessage(String.format("MigrationType: %s", dataObject.getMigrationType()));
            outputStatusMessage(String.format("StartTimeInUtc: %s", dataObject.getStartTimeInUtc()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage("* * * End OutputMigrationStatusInfo * * *");
        }
    }
    static void outputArrayOfMigrationStatusInfo(ArrayOfMigrationStatusInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (MigrationStatusInfo dataObject : dataObjects.getMigrationStatusInfos())
            {
                outputMigrationStatusInfo(dataObject);
            }
        }
    }
    static void outputNegativeAdGroupCriterion(NegativeAdGroupCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeAdGroupCriterion * * *");
            outputStatusMessage("* * * End OutputNegativeAdGroupCriterion * * *");
        }
    }
    static void outputArrayOfNegativeAdGroupCriterion(ArrayList<NegativeAdGroupCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeAdGroupCriterion dataObject : dataObjects)
            {
                outputNegativeAdGroupCriterion(dataObject);
            }
        }
    }
    static void outputNegativeCampaignCriterion(NegativeCampaignCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeCampaignCriterion * * *");
            outputStatusMessage("* * * End OutputNegativeCampaignCriterion * * *");
        }
    }
    static void outputArrayOfNegativeCampaignCriterion(ArrayList<NegativeCampaignCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeCampaignCriterion dataObject : dataObjects)
            {
                outputNegativeCampaignCriterion(dataObject);
            }
        }
    }
    static void outputNegativeKeyword(NegativeKeyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeKeyword * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputNegativeKeyword * * *");
        }
    }
    static void outputArrayOfNegativeKeyword(ArrayOfNegativeKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeyword dataObject : dataObjects.getNegativeKeywords())
            {
                outputNegativeKeyword(dataObject);
            }
        }
    }
    static void outputNegativeKeywordList(NegativeKeywordList dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeKeywordList * * *");
            outputStatusMessage("* * * End OutputNegativeKeywordList * * *");
        }
    }
    static void outputArrayOfNegativeKeywordList(ArrayList<NegativeKeywordList> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeywordList dataObject : dataObjects)
            {
                outputNegativeKeywordList(dataObject);
            }
        }
    }
    static void outputOfflineConversion(OfflineConversion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOfflineConversion * * *");
            outputStatusMessage(String.format("ConversionCurrencyCode: %s", dataObject.getConversionCurrencyCode()));
            outputStatusMessage(String.format("ConversionName: %s", dataObject.getConversionName()));
            outputStatusMessage(String.format("ConversionTime: %s", dataObject.getConversionTime()));
            outputStatusMessage(String.format("ConversionValue: %s", dataObject.getConversionValue()));
            outputStatusMessage(String.format("MicrosoftClickId: %s", dataObject.getMicrosoftClickId()));
            outputStatusMessage("* * * End OutputOfflineConversion * * *");
        }
    }
    static void outputArrayOfOfflineConversion(ArrayOfOfflineConversion dataObjects)
    {
        if (null != dataObjects)
        {
            for (OfflineConversion dataObject : dataObjects.getOfflineConversions())
            {
                outputOfflineConversion(dataObject);
            }
        }
    }
    static void outputOfflineConversionGoal(OfflineConversionGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOfflineConversionGoal * * *");
            outputStatusMessage("* * * End OutputOfflineConversionGoal * * *");
        }
    }
    static void outputArrayOfOfflineConversionGoal(ArrayList<OfflineConversionGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (OfflineConversionGoal dataObject : dataObjects)
            {
                outputOfflineConversionGoal(dataObject);
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOperationError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputOperationError * * *");
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
            }
        }
    }
    static void outputPagesViewedPerVisitGoal(PagesViewedPerVisitGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPagesViewedPerVisitGoal * * *");
            outputStatusMessage(String.format("MinimumPagesViewed: %s", dataObject.getMinimumPagesViewed()));
            outputStatusMessage("* * * End OutputPagesViewedPerVisitGoal * * *");
        }
    }
    static void outputArrayOfPagesViewedPerVisitGoal(ArrayList<PagesViewedPerVisitGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PagesViewedPerVisitGoal dataObject : dataObjects)
            {
                outputPagesViewedPerVisitGoal(dataObject);
            }
        }
    }
    static void outputPageVisitorsRule(PageVisitorsRule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPageVisitorsRule * * *");
            outputStatusMessage("RuleItemGroups:");
            outputArrayOfRuleItemGroup(dataObject.getRuleItemGroups());
            outputStatusMessage("* * * End OutputPageVisitorsRule * * *");
        }
    }
    static void outputArrayOfPageVisitorsRule(ArrayList<PageVisitorsRule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PageVisitorsRule dataObject : dataObjects)
            {
                outputPageVisitorsRule(dataObject);
            }
        }
    }
    static void outputPageVisitorsWhoDidNotVisitAnotherPageRule(PageVisitorsWhoDidNotVisitAnotherPageRule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPageVisitorsWhoDidNotVisitAnotherPageRule * * *");
            outputStatusMessage("ExcludeRuleItemGroups:");
            outputArrayOfRuleItemGroup(dataObject.getExcludeRuleItemGroups());
            outputStatusMessage("IncludeRuleItemGroups:");
            outputArrayOfRuleItemGroup(dataObject.getIncludeRuleItemGroups());
            outputStatusMessage("* * * End OutputPageVisitorsWhoDidNotVisitAnotherPageRule * * *");
        }
    }
    static void outputArrayOfPageVisitorsWhoDidNotVisitAnotherPageRule(ArrayList<PageVisitorsWhoDidNotVisitAnotherPageRule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PageVisitorsWhoDidNotVisitAnotherPageRule dataObject : dataObjects)
            {
                outputPageVisitorsWhoDidNotVisitAnotherPageRule(dataObject);
            }
        }
    }
    static void outputPageVisitorsWhoVisitedAnotherPageRule(PageVisitorsWhoVisitedAnotherPageRule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPageVisitorsWhoVisitedAnotherPageRule * * *");
            outputStatusMessage("AnotherRuleItemGroups:");
            outputArrayOfRuleItemGroup(dataObject.getAnotherRuleItemGroups());
            outputStatusMessage("RuleItemGroups:");
            outputArrayOfRuleItemGroup(dataObject.getRuleItemGroups());
            outputStatusMessage("* * * End OutputPageVisitorsWhoVisitedAnotherPageRule * * *");
        }
    }
    static void outputArrayOfPageVisitorsWhoVisitedAnotherPageRule(ArrayList<PageVisitorsWhoVisitedAnotherPageRule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PageVisitorsWhoVisitedAnotherPageRule dataObject : dataObjects)
            {
                outputPageVisitorsWhoVisitedAnotherPageRule(dataObject);
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPaging * * *");
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
            outputStatusMessage("* * * End OutputPaging * * *");
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
            }
        }
    }
    static void outputPriceAdExtension(PriceAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPriceAdExtension * * *");
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage(String.format("PriceExtensionType: %s", dataObject.getPriceExtensionType()));
            outputStatusMessage("TableRows:");
            outputArrayOfPriceTableRow(dataObject.getTableRows());
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputPriceAdExtension * * *");
        }
    }
    static void outputArrayOfPriceAdExtension(ArrayList<PriceAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PriceAdExtension dataObject : dataObjects)
            {
                outputPriceAdExtension(dataObject);
            }
        }
    }
    static void outputPriceTableRow(PriceTableRow dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPriceTableRow * * *");
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage(String.format("Header: %s", dataObject.getHeader()));
            outputStatusMessage(String.format("Price: %s", dataObject.getPrice()));
            outputStatusMessage(String.format("PriceQualifier: %s", dataObject.getPriceQualifier()));
            outputStatusMessage(String.format("PriceUnit: %s", dataObject.getPriceUnit()));
            outputStatusMessage(String.format("TermsAndConditions: %s", dataObject.getTermsAndConditions()));
            outputStatusMessage(String.format("TermsAndConditionsUrl: %s", dataObject.getTermsAndConditionsUrl()));
            outputStatusMessage("* * * End OutputPriceTableRow * * *");
        }
    }
    static void outputArrayOfPriceTableRow(ArrayOfPriceTableRow dataObjects)
    {
        if (null != dataObjects)
        {
            for (PriceTableRow dataObject : dataObjects.getPriceTableRows())
            {
                outputPriceTableRow(dataObject);
            }
        }
    }
    static void outputProductAd(ProductAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductAd * * *");
            outputStatusMessage(String.format("PromotionalText: %s", dataObject.getPromotionalText()));
            outputStatusMessage("* * * End OutputProductAd * * *");
        }
    }
    static void outputArrayOfProductAd(ArrayList<ProductAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductAd dataObject : dataObjects)
            {
                outputProductAd(dataObject);
            }
        }
    }
    static void outputProductAudience(ProductAudience dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductAudience * * *");
            outputStatusMessage(String.format("ProductAudienceType: %s", dataObject.getProductAudienceType()));
            outputStatusMessage(String.format("TagId: %s", dataObject.getTagId()));
            outputStatusMessage("* * * End OutputProductAudience * * *");
        }
    }
    static void outputArrayOfProductAudience(ArrayList<ProductAudience> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductAudience dataObject : dataObjects)
            {
                outputProductAudience(dataObject);
            }
        }
    }
    static void outputProductCondition(ProductCondition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductCondition * * *");
            outputStatusMessage(String.format("Attribute: %s", dataObject.getAttribute()));
            outputStatusMessage(String.format("Operand: %s", dataObject.getOperand()));
            outputStatusMessage("* * * End OutputProductCondition * * *");
        }
    }
    static void outputArrayOfProductCondition(ArrayOfProductCondition dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductCondition dataObject : dataObjects.getProductConditions())
            {
                outputProductCondition(dataObject);
            }
        }
    }
    static void outputProductPartition(ProductPartition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductPartition * * *");
            outputStatusMessage("Condition:");
            outputProductCondition(dataObject.getCondition());
            outputStatusMessage(String.format("ParentCriterionId: %s", dataObject.getParentCriterionId()));
            outputStatusMessage(String.format("PartitionType: %s", dataObject.getPartitionType()));
            outputStatusMessage("* * * End OutputProductPartition * * *");
        }
    }
    static void outputArrayOfProductPartition(ArrayList<ProductPartition> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartition dataObject : dataObjects)
            {
                outputProductPartition(dataObject);
            }
        }
    }
    static void outputProductScope(ProductScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductScope * * *");
            outputStatusMessage("Conditions:");
            outputArrayOfProductCondition(dataObject.getConditions());
            outputStatusMessage("* * * End OutputProductScope * * *");
        }
    }
    static void outputArrayOfProductScope(ArrayList<ProductScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductScope dataObject : dataObjects)
            {
                outputProductScope(dataObject);
            }
        }
    }
    static void outputProfileCriterion(ProfileCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProfileCriterion * * *");
            outputStatusMessage(String.format("ProfileId: %s", dataObject.getProfileId()));
            outputStatusMessage(String.format("ProfileType: %s", dataObject.getProfileType()));
            outputStatusMessage("* * * End OutputProfileCriterion * * *");
        }
    }
    static void outputArrayOfProfileCriterion(ArrayList<ProfileCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProfileCriterion dataObject : dataObjects)
            {
                outputProfileCriterion(dataObject);
            }
        }
    }
    static void outputRadiusCriterion(RadiusCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputRadiusCriterion * * *");
            outputStatusMessage(String.format("LatitudeDegrees: %s", dataObject.getLatitudeDegrees()));
            outputStatusMessage(String.format("LongitudeDegrees: %s", dataObject.getLongitudeDegrees()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Radius: %s", dataObject.getRadius()));
            outputStatusMessage(String.format("RadiusUnit: %s", dataObject.getRadiusUnit()));
            outputStatusMessage("* * * End OutputRadiusCriterion * * *");
        }
    }
    static void outputArrayOfRadiusCriterion(ArrayList<RadiusCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (RadiusCriterion dataObject : dataObjects)
            {
                outputRadiusCriterion(dataObject);
            }
        }
    }
    static void outputRemarketingList(RemarketingList dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputRemarketingList * * *");
            outputStatusMessage("Rule:");
            outputRemarketingRule(dataObject.getRule());
            outputStatusMessage(String.format("TagId: %s", dataObject.getTagId()));
            outputStatusMessage("* * * End OutputRemarketingList * * *");
        }
    }
    static void outputArrayOfRemarketingList(ArrayList<RemarketingList> dataObjects)
    {
        if (null != dataObjects)
        {
            for (RemarketingList dataObject : dataObjects)
            {
                outputRemarketingList(dataObject);
            }
        }
    }
    static void outputRemarketingRule(RemarketingRule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputRemarketingRule * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof CustomEventsRule)
            {
                outputCustomEventsRule((CustomEventsRule)dataObject);
            }
            if(dataObject instanceof PageVisitorsRule)
            {
                outputPageVisitorsRule((PageVisitorsRule)dataObject);
            }
            if(dataObject instanceof PageVisitorsWhoDidNotVisitAnotherPageRule)
            {
                outputPageVisitorsWhoDidNotVisitAnotherPageRule((PageVisitorsWhoDidNotVisitAnotherPageRule)dataObject);
            }
            if(dataObject instanceof PageVisitorsWhoVisitedAnotherPageRule)
            {
                outputPageVisitorsWhoVisitedAnotherPageRule((PageVisitorsWhoVisitedAnotherPageRule)dataObject);
            }
            outputStatusMessage("* * * End OutputRemarketingRule * * *");
        }
    }
    static void outputArrayOfRemarketingRule(ArrayList<RemarketingRule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (RemarketingRule dataObject : dataObjects)
            {
                outputRemarketingRule(dataObject);
            }
        }
    }
    static void outputResponsiveAd(ResponsiveAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputResponsiveAd * * *");
            outputStatusMessage(String.format("BusinessName: %s", dataObject.getBusinessName()));
            outputStatusMessage(String.format("CallToAction: %s", dataObject.getCallToAction()));
            outputStatusMessage(String.format("Headline: %s", dataObject.getHeadline()));
            outputStatusMessage("Images:");
            outputArrayOfAssetLink(dataObject.getImages());
            outputStatusMessage(String.format("LandscapeImageMediaId: %s", dataObject.getLandscapeImageMediaId()));
            outputStatusMessage(String.format("LandscapeLogoMediaId: %s", dataObject.getLandscapeLogoMediaId()));
            outputStatusMessage(String.format("LongHeadline: %s", dataObject.getLongHeadline()));
            outputStatusMessage(String.format("SquareImageMediaId: %s", dataObject.getSquareImageMediaId()));
            outputStatusMessage(String.format("SquareLogoMediaId: %s", dataObject.getSquareLogoMediaId()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputResponsiveAd * * *");
        }
    }
    static void outputArrayOfResponsiveAd(ArrayList<ResponsiveAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ResponsiveAd dataObject : dataObjects)
            {
                outputResponsiveAd(dataObject);
            }
        }
    }
    static void outputResponsiveSearchAd(ResponsiveSearchAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputResponsiveSearchAd * * *");
            outputStatusMessage("Descriptions:");
            outputArrayOfAssetLink(dataObject.getDescriptions());
            outputStatusMessage(String.format("Domain: %s", dataObject.getDomain()));
            outputStatusMessage("Headlines:");
            outputArrayOfAssetLink(dataObject.getHeadlines());
            outputStatusMessage(String.format("Path1: %s", dataObject.getPath1()));
            outputStatusMessage(String.format("Path2: %s", dataObject.getPath2()));
            outputStatusMessage("* * * End OutputResponsiveSearchAd * * *");
        }
    }
    static void outputArrayOfResponsiveSearchAd(ArrayList<ResponsiveSearchAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ResponsiveSearchAd dataObject : dataObjects)
            {
                outputResponsiveSearchAd(dataObject);
            }
        }
    }
    static void outputReviewAdExtension(ReviewAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputReviewAdExtension * * *");
            outputStatusMessage(String.format("IsExact: %s", dataObject.getIsExact()));
            outputStatusMessage(String.format("Source: %s", dataObject.getSource()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage(String.format("Url: %s", dataObject.getUrl()));
            outputStatusMessage("* * * End OutputReviewAdExtension * * *");
        }
    }
    static void outputArrayOfReviewAdExtension(ArrayList<ReviewAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReviewAdExtension dataObject : dataObjects)
            {
                outputReviewAdExtension(dataObject);
            }
        }
    }
    static void outputRuleItem(RuleItem dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputRuleItem * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof StringRuleItem)
            {
                outputStringRuleItem((StringRuleItem)dataObject);
            }
            outputStatusMessage("* * * End OutputRuleItem * * *");
        }
    }
    static void outputArrayOfRuleItem(ArrayOfRuleItem dataObjects)
    {
        if (null != dataObjects)
        {
            for (RuleItem dataObject : dataObjects.getRuleItems())
            {
                outputRuleItem(dataObject);
            }
        }
    }
    static void outputRuleItemGroup(RuleItemGroup dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputRuleItemGroup * * *");
            outputStatusMessage("Items:");
            outputArrayOfRuleItem(dataObject.getItems());
            outputStatusMessage("* * * End OutputRuleItemGroup * * *");
        }
    }
    static void outputArrayOfRuleItemGroup(ArrayOfRuleItemGroup dataObjects)
    {
        if (null != dataObjects)
        {
            for (RuleItemGroup dataObject : dataObjects.getRuleItemGroups())
            {
                outputRuleItemGroup(dataObject);
            }
        }
    }
    static void outputSchedule(Schedule dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSchedule * * *");
            outputStatusMessage("DayTimeRanges:");
            outputArrayOfDayTime(dataObject.getDayTimeRanges());
            outputStatusMessage("EndDate:");
            outputDate(dataObject.getEndDate());
            outputStatusMessage("StartDate:");
            outputDate(dataObject.getStartDate());
            outputStatusMessage(String.format("UseSearcherTimeZone: %s", dataObject.getUseSearcherTimeZone()));
            outputStatusMessage("* * * End OutputSchedule * * *");
        }
    }
    static void outputArrayOfSchedule(ArrayList<Schedule> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Schedule dataObject : dataObjects)
            {
                outputSchedule(dataObject);
            }
        }
    }
    static void outputSetting(Setting dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSetting * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof CoOpSetting)
            {
                outputCoOpSetting((CoOpSetting)dataObject);
            }
            if(dataObject instanceof DynamicSearchAdsSetting)
            {
                outputDynamicSearchAdsSetting((DynamicSearchAdsSetting)dataObject);
            }
            if(dataObject instanceof ShoppingSetting)
            {
                outputShoppingSetting((ShoppingSetting)dataObject);
            }
            if(dataObject instanceof TargetSetting)
            {
                outputTargetSetting((TargetSetting)dataObject);
            }
            outputStatusMessage("* * * End OutputSetting * * *");
        }
    }
    static void outputArrayOfSetting(ArrayOfSetting dataObjects)
    {
        if (null != dataObjects)
        {
            for (Setting dataObject : dataObjects.getSettings())
            {
                outputSetting(dataObject);
            }
        }
    }
    static void outputSharedEntity(SharedEntity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSharedEntity * * *");
            outputStatusMessage(String.format("AssociationCount: %s", dataObject.getAssociationCount()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof SharedList)
            {
                outputSharedList((SharedList)dataObject);
            }
            outputStatusMessage("* * * End OutputSharedEntity * * *");
        }
    }
    static void outputArrayOfSharedEntity(ArrayOfSharedEntity dataObjects)
    {
        if (null != dataObjects)
        {
            for (SharedEntity dataObject : dataObjects.getSharedEntities())
            {
                outputSharedEntity(dataObject);
            }
        }
    }
    static void outputSharedEntityAssociation(SharedEntityAssociation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSharedEntityAssociation * * *");
            outputStatusMessage(String.format("EntityId: %s", dataObject.getEntityId()));
            outputStatusMessage(String.format("EntityType: %s", dataObject.getEntityType()));
            outputStatusMessage(String.format("SharedEntityId: %s", dataObject.getSharedEntityId()));
            outputStatusMessage(String.format("SharedEntityType: %s", dataObject.getSharedEntityType()));
            outputStatusMessage("* * * End OutputSharedEntityAssociation * * *");
        }
    }
    static void outputArrayOfSharedEntityAssociation(ArrayOfSharedEntityAssociation dataObjects)
    {
        if (null != dataObjects)
        {
            for (SharedEntityAssociation dataObject : dataObjects.getSharedEntityAssociations())
            {
                outputSharedEntityAssociation(dataObject);
            }
        }
    }
    static void outputSharedList(SharedList dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSharedList * * *");
            outputStatusMessage(String.format("ItemCount: %s", dataObject.getItemCount()));
            if(dataObject instanceof NegativeKeywordList)
            {
                outputNegativeKeywordList((NegativeKeywordList)dataObject);
            }
            outputStatusMessage("* * * End OutputSharedList * * *");
        }
    }
    static void outputArrayOfSharedList(ArrayList<SharedList> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SharedList dataObject : dataObjects)
            {
                outputSharedList(dataObject);
            }
        }
    }
    static void outputSharedListItem(SharedListItem dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSharedListItem * * *");
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof NegativeKeyword)
            {
                outputNegativeKeyword((NegativeKeyword)dataObject);
            }
            outputStatusMessage("* * * End OutputSharedListItem * * *");
        }
    }
    static void outputArrayOfSharedListItem(ArrayOfSharedListItem dataObjects)
    {
        if (null != dataObjects)
        {
            for (SharedListItem dataObject : dataObjects.getSharedListItems())
            {
                outputSharedListItem(dataObject);
            }
        }
    }
    static void outputShoppingSetting(ShoppingSetting dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputShoppingSetting * * *");
            outputStatusMessage(String.format("LocalInventoryAdsEnabled: %s", dataObject.getLocalInventoryAdsEnabled()));
            outputStatusMessage(String.format("Priority: %s", dataObject.getPriority()));
            outputStatusMessage(String.format("SalesCountryCode: %s", dataObject.getSalesCountryCode()));
            outputStatusMessage(String.format("StoreId: %s", dataObject.getStoreId()));
            outputStatusMessage("* * * End OutputShoppingSetting * * *");
        }
    }
    static void outputArrayOfShoppingSetting(ArrayList<ShoppingSetting> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ShoppingSetting dataObject : dataObjects)
            {
                outputShoppingSetting(dataObject);
            }
        }
    }
    static void outputSimilarRemarketingList(SimilarRemarketingList dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSimilarRemarketingList * * *");
            outputStatusMessage(String.format("SourceId: %s", dataObject.getSourceId()));
            outputStatusMessage("* * * End OutputSimilarRemarketingList * * *");
        }
    }
    static void outputArrayOfSimilarRemarketingList(ArrayList<SimilarRemarketingList> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SimilarRemarketingList dataObject : dataObjects)
            {
                outputSimilarRemarketingList(dataObject);
            }
        }
    }
    static void outputSitelinkAdExtension(SitelinkAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSitelinkAdExtension * * *");
            outputStatusMessage(String.format("Description1: %s", dataObject.getDescription1()));
            outputStatusMessage(String.format("Description2: %s", dataObject.getDescription2()));
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage(String.format("DisplayText: %s", dataObject.getDisplayText()));
            outputStatusMessage("FinalAppUrls:");
            outputArrayOfAppUrl(dataObject.getFinalAppUrls());
            outputStatusMessage("FinalMobileUrls:");
            outputArrayOfstring(dataObject.getFinalMobileUrls());
            outputStatusMessage("FinalUrls:");
            outputArrayOfstring(dataObject.getFinalUrls());
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", dataObject.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters:");
            outputCustomParameters(dataObject.getUrlCustomParameters());
            outputStatusMessage("* * * End OutputSitelinkAdExtension * * *");
        }
    }
    static void outputArrayOfSitelinkAdExtension(ArrayList<SitelinkAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SitelinkAdExtension dataObject : dataObjects)
            {
                outputSitelinkAdExtension(dataObject);
            }
        }
    }
    static void outputStringRuleItem(StringRuleItem dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputStringRuleItem * * *");
            outputStatusMessage(String.format("Operand: %s", dataObject.getOperand()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputStringRuleItem * * *");
        }
    }
    static void outputArrayOfStringRuleItem(ArrayList<StringRuleItem> dataObjects)
    {
        if (null != dataObjects)
        {
            for (StringRuleItem dataObject : dataObjects)
            {
                outputStringRuleItem(dataObject);
            }
        }
    }
    static void outputStructuredSnippetAdExtension(StructuredSnippetAdExtension dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputStructuredSnippetAdExtension * * *");
            outputStatusMessage(String.format("Header: %s", dataObject.getHeader()));
            outputStatusMessage("Values:");
            outputArrayOfstring(dataObject.getValues());
            outputStatusMessage("* * * End OutputStructuredSnippetAdExtension * * *");
        }
    }
    static void outputArrayOfStructuredSnippetAdExtension(ArrayList<StructuredSnippetAdExtension> dataObjects)
    {
        if (null != dataObjects)
        {
            for (StructuredSnippetAdExtension dataObject : dataObjects)
            {
                outputStructuredSnippetAdExtension(dataObject);
            }
        }
    }
    static void outputTargetCpaBiddingScheme(TargetCpaBiddingScheme dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTargetCpaBiddingScheme * * *");
            outputStatusMessage("MaxCpc:");
            outputBid(dataObject.getMaxCpc());
            outputStatusMessage(String.format("TargetCpa: %s", dataObject.getTargetCpa()));
            outputStatusMessage("* * * End OutputTargetCpaBiddingScheme * * *");
        }
    }
    static void outputArrayOfTargetCpaBiddingScheme(ArrayList<TargetCpaBiddingScheme> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TargetCpaBiddingScheme dataObject : dataObjects)
            {
                outputTargetCpaBiddingScheme(dataObject);
            }
        }
    }
    static void outputTargetSetting(TargetSetting dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTargetSetting * * *");
            outputStatusMessage("Details:");
            outputArrayOfTargetSettingDetail(dataObject.getDetails());
            outputStatusMessage("* * * End OutputTargetSetting * * *");
        }
    }
    static void outputArrayOfTargetSetting(ArrayList<TargetSetting> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TargetSetting dataObject : dataObjects)
            {
                outputTargetSetting(dataObject);
            }
        }
    }
    static void outputTargetSettingDetail(TargetSettingDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTargetSettingDetail * * *");
            outputStatusMessage(String.format("CriterionTypeGroup: %s", dataObject.getCriterionTypeGroup()));
            outputStatusMessage(String.format("TargetAndBid: %s", dataObject.getTargetAndBid()));
            outputStatusMessage("* * * End OutputTargetSettingDetail * * *");
        }
    }
    static void outputArrayOfTargetSettingDetail(ArrayOfTargetSettingDetail dataObjects)
    {
        if (null != dataObjects)
        {
            for (TargetSettingDetail dataObject : dataObjects.getTargetSettingDetails())
            {
                outputTargetSettingDetail(dataObject);
            }
        }
    }
    static void outputTextAd(TextAd dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTextAd * * *");
            outputStatusMessage(String.format("DestinationUrl: %s", dataObject.getDestinationUrl()));
            outputStatusMessage(String.format("DisplayUrl: %s", dataObject.getDisplayUrl()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage(String.format("Title: %s", dataObject.getTitle()));
            outputStatusMessage("* * * End OutputTextAd * * *");
        }
    }
    static void outputArrayOfTextAd(ArrayList<TextAd> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TextAd dataObject : dataObjects)
            {
                outputTextAd(dataObject);
            }
        }
    }
    static void outputTextAsset(TextAsset dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTextAsset * * *");
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputTextAsset * * *");
        }
    }
    static void outputArrayOfTextAsset(ArrayList<TextAsset> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TextAsset dataObject : dataObjects)
            {
                outputTextAsset(dataObject);
            }
        }
    }
    static void outputUetTag(UetTag dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUetTag * * *");
            outputStatusMessage(String.format("Description: %s", dataObject.getDescription()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("TrackingNoScript: %s", dataObject.getTrackingNoScript()));
            outputStatusMessage(String.format("TrackingScript: %s", dataObject.getTrackingScript()));
            outputStatusMessage(String.format("TrackingStatus: %s", dataObject.getTrackingStatus()));
            outputStatusMessage("* * * End OutputUetTag * * *");
        }
    }
    static void outputArrayOfUetTag(ArrayOfUetTag dataObjects)
    {
        if (null != dataObjects)
        {
            for (UetTag dataObject : dataObjects.getUetTags())
            {
                outputUetTag(dataObject);
            }
        }
    }
    static void outputUrlGoal(UrlGoal dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUrlGoal * * *");
            outputStatusMessage(String.format("UrlExpression: %s", dataObject.getUrlExpression()));
            outputStatusMessage(String.format("UrlOperator: %s", dataObject.getUrlOperator()));
            outputStatusMessage("* * * End OutputUrlGoal * * *");
        }
    }
    static void outputArrayOfUrlGoal(ArrayList<UrlGoal> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UrlGoal dataObject : dataObjects)
            {
                outputUrlGoal(dataObject);
            }
        }
    }
    static void outputWebpage(Webpage dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputWebpage * * *");
            outputStatusMessage("Parameter:");
            outputWebpageParameter(dataObject.getParameter());
            outputStatusMessage("* * * End OutputWebpage * * *");
        }
    }
    static void outputArrayOfWebpage(ArrayList<Webpage> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Webpage dataObject : dataObjects)
            {
                outputWebpage(dataObject);
            }
        }
    }
    static void outputWebpageCondition(WebpageCondition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputWebpageCondition * * *");
            outputStatusMessage(String.format("Argument: %s", dataObject.getArgument()));
            outputStatusMessage(String.format("Operand: %s", dataObject.getOperand()));
            outputStatusMessage("* * * End OutputWebpageCondition * * *");
        }
    }
    static void outputArrayOfWebpageCondition(ArrayOfWebpageCondition dataObjects)
    {
        if (null != dataObjects)
        {
            for (WebpageCondition dataObject : dataObjects.getWebpageConditions())
            {
                outputWebpageCondition(dataObject);
            }
        }
    }
    static void outputWebpageParameter(WebpageParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputWebpageParameter * * *");
            outputStatusMessage("Conditions:");
            outputArrayOfWebpageCondition(dataObject.getConditions());
            outputStatusMessage(String.format("CriterionName: %s", dataObject.getCriterionName()));
            outputStatusMessage("* * * End OutputWebpageParameter * * *");
        }
    }
    static void outputArrayOfWebpageParameter(ArrayList<WebpageParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (WebpageParameter dataObject : dataObjects)
            {
                outputWebpageParameter(dataObject);
            }
        }
    }
    static void outputAdEditorialStatus(AdEditorialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdEditorialStatus value : AdEditorialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdEditorialStatus(ArrayList<AdEditorialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdEditorialStatus valueSet : valueSets)
            {
                outputAdEditorialStatus(valueSet);
            }
        }
    }
    static void outputAdStatus(AdStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdStatus value : AdStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdStatus(ArrayList<AdStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdStatus valueSet : valueSets)
            {
                outputAdStatus(valueSet);
            }
        }
    }
    static void outputAdType(AdType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdType value : AdType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdType(ArrayOfAdType valueSets)
    {
        if (null != valueSets)
        {
            for (AdType valueSet : valueSets.getAdTypes())
            {
                outputAdType(valueSet);
            }
        }
    }
    static void outputCallToAction(CallToAction valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CallToAction value : CallToAction.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCallToAction(ArrayList<CallToAction> valueSets)
    {
        if (null != valueSets)
        {
            for (CallToAction valueSet : valueSets)
            {
                outputCallToAction(valueSet);
            }
        }
    }
    static void outputAssetLinkEditorialStatus(AssetLinkEditorialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AssetLinkEditorialStatus value : AssetLinkEditorialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAssetLinkEditorialStatus(ArrayList<AssetLinkEditorialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AssetLinkEditorialStatus valueSet : valueSets)
            {
                outputAssetLinkEditorialStatus(valueSet);
            }
        }
    }
    static void outputBudgetLimitType(BudgetLimitType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BudgetLimitType value : BudgetLimitType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBudgetLimitType(ArrayList<BudgetLimitType> valueSets)
    {
        if (null != valueSets)
        {
            for (BudgetLimitType valueSet : valueSets)
            {
                outputBudgetLimitType(valueSet);
            }
        }
    }
    static void outputCampaignStatus(CampaignStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignStatus value : CampaignStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignStatus(ArrayList<CampaignStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignStatus valueSet : valueSets)
            {
                outputCampaignStatus(valueSet);
            }
        }
    }
    static void outputCampaignType(CampaignType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignType value : CampaignType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignType(ArrayList<CampaignType> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignType valueSet : valueSets)
            {
                outputCampaignType(valueSet);
            }
        }
    }
    static void outputDynamicSearchAdsSource(DynamicSearchAdsSource valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DynamicSearchAdsSource value : DynamicSearchAdsSource.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDynamicSearchAdsSource(ArrayList<DynamicSearchAdsSource> valueSets)
    {
        if (null != valueSets)
        {
            for (DynamicSearchAdsSource valueSet : valueSets)
            {
                outputDynamicSearchAdsSource(valueSet);
            }
        }
    }
    static void outputCriterionTypeGroup(CriterionTypeGroup valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CriterionTypeGroup value : CriterionTypeGroup.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCriterionTypeGroup(ArrayList<CriterionTypeGroup> valueSets)
    {
        if (null != valueSets)
        {
            for (CriterionTypeGroup valueSet : valueSets)
            {
                outputCriterionTypeGroup(valueSet);
            }
        }
    }
    static void outputBidOption(BidOption valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BidOption value : BidOption.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBidOption(ArrayList<BidOption> valueSets)
    {
        if (null != valueSets)
        {
            for (BidOption valueSet : valueSets)
            {
                outputBidOption(valueSet);
            }
        }
    }
    static void outputCampaignAdditionalField(CampaignAdditionalField valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignAdditionalField value : CampaignAdditionalField.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignAdditionalField(ArrayList<CampaignAdditionalField> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignAdditionalField valueSet : valueSets)
            {
                outputCampaignAdditionalField(valueSet);
            }
        }
    }
    static void outputAdRotationType(AdRotationType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdRotationType value : AdRotationType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdRotationType(ArrayList<AdRotationType> valueSets)
    {
        if (null != valueSets)
        {
            for (AdRotationType valueSet : valueSets)
            {
                outputAdRotationType(valueSet);
            }
        }
    }
    static void outputNetwork(Network valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Network value : Network.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfNetwork(ArrayList<Network> valueSets)
    {
        if (null != valueSets)
        {
            for (Network valueSet : valueSets)
            {
                outputNetwork(valueSet);
            }
        }
    }
    static void outputAdGroupPrivacyStatus(AdGroupPrivacyStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupPrivacyStatus value : AdGroupPrivacyStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupPrivacyStatus(ArrayList<AdGroupPrivacyStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupPrivacyStatus valueSet : valueSets)
            {
                outputAdGroupPrivacyStatus(valueSet);
            }
        }
    }
    static void outputAdGroupStatus(AdGroupStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupStatus value : AdGroupStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupStatus(ArrayList<AdGroupStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupStatus valueSet : valueSets)
            {
                outputAdGroupStatus(valueSet);
            }
        }
    }
    static void outputAdAdditionalField(AdAdditionalField valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdAdditionalField value : AdAdditionalField.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdAdditionalField(ArrayList<AdAdditionalField> valueSets)
    {
        if (null != valueSets)
        {
            for (AdAdditionalField valueSet : valueSets)
            {
                outputAdAdditionalField(valueSet);
            }
        }
    }
    static void outputKeywordEditorialStatus(KeywordEditorialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordEditorialStatus value : KeywordEditorialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordEditorialStatus(ArrayList<KeywordEditorialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordEditorialStatus valueSet : valueSets)
            {
                outputKeywordEditorialStatus(valueSet);
            }
        }
    }
    static void outputMatchType(MatchType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (MatchType value : MatchType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfMatchType(ArrayList<MatchType> valueSets)
    {
        if (null != valueSets)
        {
            for (MatchType valueSet : valueSets)
            {
                outputMatchType(valueSet);
            }
        }
    }
    static void outputKeywordStatus(KeywordStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordStatus value : KeywordStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordStatus(ArrayList<KeywordStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordStatus valueSet : valueSets)
            {
                outputKeywordStatus(valueSet);
            }
        }
    }
    static void outputEntityType(EntityType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (EntityType value : EntityType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfEntityType(ArrayList<EntityType> valueSets)
    {
        if (null != valueSets)
        {
            for (EntityType valueSet : valueSets)
            {
                outputEntityType(valueSet);
            }
        }
    }
    static void outputAppealStatus(AppealStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AppealStatus value : AppealStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAppealStatus(ArrayList<AppealStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AppealStatus valueSet : valueSets)
            {
                outputAppealStatus(valueSet);
            }
        }
    }
    static void outputMigrationStatus(MigrationStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (MigrationStatus value : MigrationStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfMigrationStatus(ArrayList<MigrationStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (MigrationStatus valueSet : valueSets)
            {
                outputMigrationStatus(valueSet);
            }
        }
    }
    static void outputAccountPropertyName(AccountPropertyName valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountPropertyName value : AccountPropertyName.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountPropertyName(ArrayOfAccountPropertyName valueSets)
    {
        if (null != valueSets)
        {
            for (AccountPropertyName valueSet : valueSets.getAccountPropertyNames())
            {
                outputAccountPropertyName(valueSet);
            }
        }
    }
    static void outputDay(Day valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Day value : Day.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDay(ArrayList<Day> valueSets)
    {
        if (null != valueSets)
        {
            for (Day valueSet : valueSets)
            {
                outputDay(valueSet);
            }
        }
    }
    static void outputMinute(Minute valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Minute value : Minute.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfMinute(ArrayList<Minute> valueSets)
    {
        if (null != valueSets)
        {
            for (Minute valueSet : valueSets)
            {
                outputMinute(valueSet);
            }
        }
    }
    static void outputAdExtensionStatus(AdExtensionStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionStatus value : AdExtensionStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionStatus(ArrayList<AdExtensionStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionStatus valueSet : valueSets)
            {
                outputAdExtensionStatus(valueSet);
            }
        }
    }
    static void outputBusinessGeoCodeStatus(BusinessGeoCodeStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BusinessGeoCodeStatus value : BusinessGeoCodeStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBusinessGeoCodeStatus(ArrayList<BusinessGeoCodeStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (BusinessGeoCodeStatus valueSet : valueSets)
            {
                outputBusinessGeoCodeStatus(valueSet);
            }
        }
    }
    static void outputActionAdExtensionActionType(ActionAdExtensionActionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ActionAdExtensionActionType value : ActionAdExtensionActionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfActionAdExtensionActionType(ArrayList<ActionAdExtensionActionType> valueSets)
    {
        if (null != valueSets)
        {
            for (ActionAdExtensionActionType valueSet : valueSets)
            {
                outputActionAdExtensionActionType(valueSet);
            }
        }
    }
    static void outputPriceExtensionType(PriceExtensionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PriceExtensionType value : PriceExtensionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPriceExtensionType(ArrayList<PriceExtensionType> valueSets)
    {
        if (null != valueSets)
        {
            for (PriceExtensionType valueSet : valueSets)
            {
                outputPriceExtensionType(valueSet);
            }
        }
    }
    static void outputPriceQualifier(PriceQualifier valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PriceQualifier value : PriceQualifier.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPriceQualifier(ArrayList<PriceQualifier> valueSets)
    {
        if (null != valueSets)
        {
            for (PriceQualifier valueSet : valueSets)
            {
                outputPriceQualifier(valueSet);
            }
        }
    }
    static void outputPriceUnit(PriceUnit valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PriceUnit value : PriceUnit.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPriceUnit(ArrayList<PriceUnit> valueSets)
    {
        if (null != valueSets)
        {
            for (PriceUnit valueSet : valueSets)
            {
                outputPriceUnit(valueSet);
            }
        }
    }
    static void outputAdExtensionsTypeFilter(AdExtensionsTypeFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionsTypeFilter value : AdExtensionsTypeFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionsTypeFilter(ArrayList<AdExtensionsTypeFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionsTypeFilter valueSet : valueSets)
            {
                outputAdExtensionsTypeFilter(valueSet);
            }
        }
    }
    static void outputAssociationType(AssociationType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AssociationType value : AssociationType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAssociationType(ArrayList<AssociationType> valueSets)
    {
        if (null != valueSets)
        {
            for (AssociationType valueSet : valueSets)
            {
                outputAssociationType(valueSet);
            }
        }
    }
    static void outputAdExtensionEditorialStatus(AdExtensionEditorialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionEditorialStatus value : AdExtensionEditorialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionEditorialStatus(ArrayList<AdExtensionEditorialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionEditorialStatus valueSet : valueSets)
            {
                outputAdExtensionEditorialStatus(valueSet);
            }
        }
    }
    static void outputMediaEnabledEntityFilter(MediaEnabledEntityFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (MediaEnabledEntityFilter value : MediaEnabledEntityFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfMediaEnabledEntityFilter(ArrayList<MediaEnabledEntityFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (MediaEnabledEntityFilter valueSet : valueSets)
            {
                outputMediaEnabledEntityFilter(valueSet);
            }
        }
    }
    static void outputAdGroupCriterionType(AdGroupCriterionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupCriterionType value : AdGroupCriterionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupCriterionType(ArrayList<AdGroupCriterionType> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupCriterionType valueSet : valueSets)
            {
                outputAdGroupCriterionType(valueSet);
            }
        }
    }
    static void outputProductPartitionType(ProductPartitionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductPartitionType value : ProductPartitionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductPartitionType(ArrayList<ProductPartitionType> valueSets)
    {
        if (null != valueSets)
        {
            for (ProductPartitionType valueSet : valueSets)
            {
                outputProductPartitionType(valueSet);
            }
        }
    }
    static void outputWebpageConditionOperand(WebpageConditionOperand valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (WebpageConditionOperand value : WebpageConditionOperand.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfWebpageConditionOperand(ArrayList<WebpageConditionOperand> valueSets)
    {
        if (null != valueSets)
        {
            for (WebpageConditionOperand valueSet : valueSets)
            {
                outputWebpageConditionOperand(valueSet);
            }
        }
    }
    static void outputAgeRange(AgeRange valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AgeRange value : AgeRange.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAgeRange(ArrayList<AgeRange> valueSets)
    {
        if (null != valueSets)
        {
            for (AgeRange valueSet : valueSets)
            {
                outputAgeRange(valueSet);
            }
        }
    }
    static void outputGenderType(GenderType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (GenderType value : GenderType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfGenderType(ArrayList<GenderType> valueSets)
    {
        if (null != valueSets)
        {
            for (GenderType valueSet : valueSets)
            {
                outputGenderType(valueSet);
            }
        }
    }
    static void outputDistanceUnit(DistanceUnit valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DistanceUnit value : DistanceUnit.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDistanceUnit(ArrayList<DistanceUnit> valueSets)
    {
        if (null != valueSets)
        {
            for (DistanceUnit valueSet : valueSets)
            {
                outputDistanceUnit(valueSet);
            }
        }
    }
    static void outputIntentOption(IntentOption valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (IntentOption value : IntentOption.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfIntentOption(ArrayList<IntentOption> valueSets)
    {
        if (null != valueSets)
        {
            for (IntentOption valueSet : valueSets)
            {
                outputIntentOption(valueSet);
            }
        }
    }
    static void outputAudienceType(AudienceType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AudienceType value : AudienceType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAudienceType(ArrayList<AudienceType> valueSets)
    {
        if (null != valueSets)
        {
            for (AudienceType valueSet : valueSets)
            {
                outputAudienceType(valueSet);
            }
        }
    }
    static void outputProfileType(ProfileType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProfileType value : ProfileType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProfileType(ArrayList<ProfileType> valueSets)
    {
        if (null != valueSets)
        {
            for (ProfileType valueSet : valueSets)
            {
                outputProfileType(valueSet);
            }
        }
    }
    static void outputAdGroupCriterionStatus(AdGroupCriterionStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupCriterionStatus value : AdGroupCriterionStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupCriterionStatus(ArrayList<AdGroupCriterionStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupCriterionStatus valueSet : valueSets)
            {
                outputAdGroupCriterionStatus(valueSet);
            }
        }
    }
    static void outputAdGroupCriterionEditorialStatus(AdGroupCriterionEditorialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupCriterionEditorialStatus value : AdGroupCriterionEditorialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupCriterionEditorialStatus(ArrayList<AdGroupCriterionEditorialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupCriterionEditorialStatus valueSet : valueSets)
            {
                outputAdGroupCriterionEditorialStatus(valueSet);
            }
        }
    }
    static void outputItemAction(ItemAction valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ItemAction value : ItemAction.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfItemAction(ArrayList<ItemAction> valueSets)
    {
        if (null != valueSets)
        {
            for (ItemAction valueSet : valueSets)
            {
                outputItemAction(valueSet);
            }
        }
    }
    static void outputBMCStoreSubType(BMCStoreSubType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BMCStoreSubType value : BMCStoreSubType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBMCStoreSubType(ArrayList<BMCStoreSubType> valueSets)
    {
        if (null != valueSets)
        {
            for (BMCStoreSubType valueSet : valueSets)
            {
                outputBMCStoreSubType(valueSet);
            }
        }
    }
    static void outputCampaignCriterionStatus(CampaignCriterionStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignCriterionStatus value : CampaignCriterionStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignCriterionStatus(ArrayList<CampaignCriterionStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignCriterionStatus valueSet : valueSets)
            {
                outputCampaignCriterionStatus(valueSet);
            }
        }
    }
    static void outputCampaignCriterionType(CampaignCriterionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignCriterionType value : CampaignCriterionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignCriterionType(ArrayList<CampaignCriterionType> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignCriterionType valueSet : valueSets)
            {
                outputCampaignCriterionType(valueSet);
            }
        }
    }
    static void outputEntityScope(EntityScope valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (EntityScope value : EntityScope.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfEntityScope(ArrayList<EntityScope> valueSets)
    {
        if (null != valueSets)
        {
            for (EntityScope valueSet : valueSets)
            {
                outputEntityScope(valueSet);
            }
        }
    }
    static void outputStringOperator(StringOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (StringOperator value : StringOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfStringOperator(ArrayList<StringOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (StringOperator valueSet : valueSets)
            {
                outputStringOperator(valueSet);
            }
        }
    }
    static void outputNumberOperator(NumberOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (NumberOperator value : NumberOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfNumberOperator(ArrayList<NumberOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (NumberOperator valueSet : valueSets)
            {
                outputNumberOperator(valueSet);
            }
        }
    }
    static void outputProductAudienceType(ProductAudienceType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductAudienceType value : ProductAudienceType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductAudienceType(ArrayList<ProductAudienceType> valueSets)
    {
        if (null != valueSets)
        {
            for (ProductAudienceType valueSet : valueSets)
            {
                outputProductAudienceType(valueSet);
            }
        }
    }
    static void outputUetTagTrackingStatus(UetTagTrackingStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (UetTagTrackingStatus value : UetTagTrackingStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfUetTagTrackingStatus(ArrayList<UetTagTrackingStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (UetTagTrackingStatus valueSet : valueSets)
            {
                outputUetTagTrackingStatus(valueSet);
            }
        }
    }
    static void outputConversionGoalType(ConversionGoalType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionGoalType value : ConversionGoalType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionGoalType(ArrayList<ConversionGoalType> valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionGoalType valueSet : valueSets)
            {
                outputConversionGoalType(valueSet);
            }
        }
    }
    static void outputConversionGoalCountType(ConversionGoalCountType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionGoalCountType value : ConversionGoalCountType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionGoalCountType(ArrayList<ConversionGoalCountType> valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionGoalCountType valueSet : valueSets)
            {
                outputConversionGoalCountType(valueSet);
            }
        }
    }
    static void outputConversionGoalRevenueType(ConversionGoalRevenueType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionGoalRevenueType value : ConversionGoalRevenueType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionGoalRevenueType(ArrayList<ConversionGoalRevenueType> valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionGoalRevenueType valueSet : valueSets)
            {
                outputConversionGoalRevenueType(valueSet);
            }
        }
    }
    static void outputConversionGoalStatus(ConversionGoalStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionGoalStatus value : ConversionGoalStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionGoalStatus(ArrayList<ConversionGoalStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionGoalStatus valueSet : valueSets)
            {
                outputConversionGoalStatus(valueSet);
            }
        }
    }
    static void outputConversionGoalTrackingStatus(ConversionGoalTrackingStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionGoalTrackingStatus value : ConversionGoalTrackingStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionGoalTrackingStatus(ArrayList<ConversionGoalTrackingStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionGoalTrackingStatus valueSet : valueSets)
            {
                outputConversionGoalTrackingStatus(valueSet);
            }
        }
    }
    static void outputExpressionOperator(ExpressionOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ExpressionOperator value : ExpressionOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfExpressionOperator(ArrayList<ExpressionOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (ExpressionOperator valueSet : valueSets)
            {
                outputExpressionOperator(valueSet);
            }
        }
    }
    static void outputValueOperator(ValueOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ValueOperator value : ValueOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfValueOperator(ArrayList<ValueOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (ValueOperator valueSet : valueSets)
            {
                outputValueOperator(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
    static void outputArrayOfstring(ArrayOfstring items)
    {
        if (null != items)
        {
            for (java.lang.String item : items.getStrings())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOfNullableOflong(ArrayOfNullableOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
}
package com.microsoft.bingads.examples.v10;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.campaignmanagement.*;

// This example uses the Bing Ads Java SDK to create a
// Bing Shopping campaign.

// To run this example, you must have a Bing Merchant
// Center store.

public class ShoppingCampaigns extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
    
    private static ArrayOfAdGroupCriterionAction _partitionActions = new ArrayOfAdGroupCriterionAction();
    private static long _referenceId = -1;
        
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
    
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

            // Get the user's list of Bing Merchant Center (BMC) stores.

            final ArrayOfBMCStore stores = getBMCStoresByCustomerId();

            if (stores == null)
            {
                outputStatusMessage(String.format("Customer %d does not have any regeistered BMC stores.\n\n", authorizationData.getCustomerId()));
                return;
            }

            // Create a Bing Shopping campaign using the ID of the first store in the list.

            Campaign campaign = new Campaign();
            campaign.setName("Bing Shopping Campaign " + System.currentTimeMillis());
            campaign.setDescription("Bing Shopping Campaign Example.");
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.SHOPPING);
            ArrayOfSetting settings = new ArrayOfSetting();
            ShoppingSetting shoppingSetting = new ShoppingSetting();
            shoppingSetting.setPriority(0);
            shoppingSetting.setSalesCountryCode("US");
            shoppingSetting.setStoreId(stores.getBMCStores().get(0).getId());
            settings.getSettings().add(shoppingSetting);
            campaign.setSettings(settings);
            campaign.setCampaignType(campaignTypes);
            campaign.setDaylightSaving(true);
            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            campaigns.getCampaigns().add(campaign);

            AddCampaignsResponse addCampaignsResponse = addCampaigns(AccountId, campaigns);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputCampaignsWithPartialErrors(campaigns, campaignIds, campaignErrors);

            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Product Categories");
            ArrayList<AdDistribution> adDistribution = new ArrayList<AdDistribution>();
            adDistribution.add(AdDistribution.SEARCH);
            adGroup.setAdDistribution(adDistribution);
            adGroup.setBiddingModel(BiddingModel.KEYWORD);
            adGroup.setPricingModel(PricingModel.CPC);
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v10.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            adGroup.setLanguage("English");
            adGroups.getAdGroups().add(adGroup);

            AddAdGroupsResponse addAdGroupsResponse = addAdGroups(campaignIds.getLongs().get(0), adGroups);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputAdGroupsWithPartialErrors(adGroups, adGroupIds, adGroupErrors);

            ArrayOfAd ads = new ArrayOfAd();
            ProductAd productAd = new ProductAd();
            productAd.setPromotionalText("Free shipping on $99 purchases.");
            ads.getAds().add(productAd);

            AddAdsResponse addAdsResponse = addAds(adGroupIds.getLongs().get(0), ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            outputAdsWithPartialErrors(ads, adIds, adErrors);

            // Add criterion to the campaign. The criterion is used to limit the campaign to a subset of 
            // your product catalog. 

            AddCampaignCriterionsResponse addCriterionResponse = addCampaignCriterion(campaignIds.getLongs().get(0));
            printCampaignCriterionIdentifiers(addCriterionResponse.getCampaignCriterionIds(), addCriterionResponse.getNestedPartialErrors());

            addAndUpdateAdGroupCriterion(adGroupIds.getLongs().get(0));
            ApplyProductPartitionActionsResponse applyPartitionActionsResponse = addBranchAndLeafCriterion(adGroupIds.getLongs().get(0));

            long rootId = applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(1);
            long electronicsCriterionId = applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(8);
            updateBranchAndLeafCriterion(adGroupIds.getLongs().get(0), rootId, electronicsCriterionId);

            // Delete the campaign from the account.

            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            deleteCampaigns(AccountId, deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));

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

        // Some Campaign Management service operations such as SetAdExtensionsAssociations can throw EditorialApiFaultDetail.
        } catch (EditorialApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (EditorialError error : ex.getFaultInfo().getEditorialErrors().getEditorialErrors())
            {
                outputStatusMessage(String.format("EditorialError at Index: %d\n\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                outputStatusMessage(String.format("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry()));
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
    
    //Adds one or more campaigns to the specified account.
	
    static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
    {
        AddCampaignsRequest request = new AddCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);

        return CampaignService.getService().addCampaigns(request);
    }
     
    // Returns an array of Bing Merchant Center stores that the customer owns.

    static ArrayOfBMCStore getBMCStoresByCustomerId() throws RemoteException, Exception
    {
        GetBMCStoresByCustomerIdRequest request = new GetBMCStoresByCustomerIdRequest();

        return CampaignService.getService().getBMCStoresByCustomerId(request).getBMCStores();
    }
     
    // Add criterion to the campaign. The criterion is used to limit the campaign to a subset of 
    // your product catalog. For example, you can limit the catalog by brand, category, or product
    // type. The campaign may be associated with only one ProductScope, and the ProductScope
    // may contain a list of up to 7 ProductConditions. Each ad group may also specify 
    // more specific product conditions.

    static AddCampaignCriterionsResponse addCampaignCriterion(final long CAMPAIGN_ID) throws RemoteException, Exception
    {
        ArrayList<CampaignCriterionType> criterionType = new ArrayList<CampaignCriterionType>();
        criterionType.add(CampaignCriterionType.PRODUCT_SCOPE);

        CampaignCriterion campaignCriterion = new CampaignCriterion();
        campaignCriterion.setCampaignId(CAMPAIGN_ID);
        campaignCriterion.setBidAdjustment(null);  // Reserved for future use
        ProductScope criterion = new ProductScope();
        ArrayOfProductCondition conditions = new ArrayOfProductCondition();
        ProductCondition condition1 = new ProductCondition();
        condition1.setAttribute("Condition");
        condition1.setOperand("New");
        conditions.getProductConditions().add(condition1);
        ProductCondition condition2 = new ProductCondition();
        condition2.setAttribute("Brand");
        condition2.setOperand("Contoso");
        conditions.getProductConditions().add(condition2);
        criterion.setConditions(conditions);
        campaignCriterion.setCriterion(criterion);
        ArrayOfCampaignCriterion campaignCriterions = new ArrayOfCampaignCriterion();
        campaignCriterions.getCampaignCriterions().add(campaignCriterion);

        AddCampaignCriterionsRequest request = new AddCampaignCriterionsRequest();
        request.setCriterionType(criterionType);
        request.setCampaignCriterions(campaignCriterions);

        return CampaignService.getService().addCampaignCriterions(request);
    }

    // Add a criterion to the ad group and then update it. 

    static void addAndUpdateAdGroupCriterion(long adGroupId) throws RemoteException, Exception
    {
        // Add a biddable criterion as the root.

        ProductCondition rootCondition = new ProductCondition();
        rootCondition.setAttribute(null);
        rootCondition.setOperand("All");

        AdGroupCriterion root = addPartition(
                        adGroupId,
                        null, 
                        rootCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        outputStatusMessage("Applying a biddable criterion as the root...\n");

        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);
        printCriterionIds(applyPartitionActionsResponse.getAdGroupCriterionIds(), applyPartitionActionsResponse.getPartialErrors());

        ArrayList<CriterionType> criterionType = new ArrayList<CriterionType>();
        criterionType.add(CriterionType.PRODUCT_PARTITION);
        ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterionsByIds(
                        AccountId,
                        adGroupId, 
                        null,
                        criterionType);

        outputStatusMessage("Printing the ad group's product partition; contains only the tree root node\n");
        printProductPartitions(adGroupCriterions);

        // Update the bid of the root node that we just added.

        BiddableAdGroupCriterion updatedRoot = new BiddableAdGroupCriterion();
        updatedRoot.setId(applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(0));
        updatedRoot.setAdGroupId(adGroupId);
        updatedRoot.setCriterionBid(getFixedBid(0.40));

        _partitionActions.getAdGroupCriterionActions().clear();

        addPartitionAction(updatedRoot, ItemAction.UPDATE);

        outputStatusMessage("Updating the bid for the tree root node...\n");

        applyPartitionActionsResponse = applyPartitionActions(_partitionActions);

        criterionType.add(CriterionType.PRODUCT_PARTITION);
        adGroupCriterions = getAdGroupCriterionsByIds(
                        AccountId,
                        adGroupId, 
                        null,
                        criterionType);

        outputStatusMessage("Updated the bid for the tree root node\n");
        printProductPartitions(adGroupCriterions);
    }

    // Add a criterion to the ad group and then update it. 

    static ApplyProductPartitionActionsResponse addBranchAndLeafCriterion(long adGroupId) throws RemoteException, Exception
    {
        _partitionActions.getAdGroupCriterionActions().clear();

        ArrayList<CriterionType> criterionType = new ArrayList<CriterionType>();
        criterionType.add(CriterionType.PRODUCT_PARTITION);
        ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterionsByIds(
                        AccountId,
                        adGroupId, 
                        null,
                        criterionType);

        AdGroupCriterion existingRoot = getRootNode(adGroupCriterions);

        if (existingRoot != null)
        {
                addPartitionAction(existingRoot, ItemAction.DELETE);

        }

        ProductCondition rootCondition = new ProductCondition();
        rootCondition.setAttribute(null);
        rootCondition.setOperand("All");

        AdGroupCriterion root = addPartition(
                        adGroupId,
                        null, 
                        rootCondition,
                        ProductPartitionType.SUBDIVISION, 
                        null, 
                        false);


        ProductCondition animalsSubdivisionCondition = new ProductCondition();
        animalsSubdivisionCondition.setAttribute("Animals & Pet Supplies");
        animalsSubdivisionCondition.setOperand("CategoryL1");

        AdGroupCriterion animalsSubdivision = addPartition(
                        adGroupId,
                        root, 
                        animalsSubdivisionCondition, 
                        ProductPartitionType.SUBDIVISION, 
                        null, 
                        false);

        ProductCondition petSuppliesSubdivisionCondition = new ProductCondition();
        petSuppliesSubdivisionCondition.setAttribute("Pet Supplies");
        petSuppliesSubdivisionCondition.setOperand("CategoryL2");

        AdGroupCriterion petSuppliesSubdivision = addPartition(
                        adGroupId,
                        animalsSubdivision, 
                        petSuppliesSubdivisionCondition, 
                        ProductPartitionType.SUBDIVISION, 
                        null, 
                        false);

        ProductCondition brandACondition = new ProductCondition();
        brandACondition.setAttribute("Brand A");
        brandACondition.setOperand("Brand");

        AdGroupCriterion brandA = addPartition(
                        adGroupId,
                        petSuppliesSubdivision, 
                        brandACondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition brandBCondition = new ProductCondition();
        brandBCondition.setAttribute("Brand B");
        brandBCondition.setOperand("Brand");

        AdGroupCriterion brandB = addPartition(
                        adGroupId,
                        petSuppliesSubdivision, 
                        brandBCondition, 
                        ProductPartitionType.UNIT, 
                        null, 
                        true);

        ProductCondition otherBrandsCondition = new ProductCondition();
        otherBrandsCondition.setAttribute(null);
        otherBrandsCondition.setOperand("Brand");

        AdGroupCriterion otherBrands = addPartition(
                        adGroupId,
                        petSuppliesSubdivision, 
                        otherBrandsCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition otherPetSuppliesCondition = new ProductCondition();
        otherPetSuppliesCondition.setAttribute(null);
        otherPetSuppliesCondition.setOperand("CategoryL2");

        AdGroupCriterion otherPetSupplies = addPartition(
                        adGroupId,
                        animalsSubdivision, 
                        otherPetSuppliesCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition electronicsCondition = new ProductCondition();
        electronicsCondition.setAttribute("Electronics");
        electronicsCondition.setOperand("CategoryL1");

        AdGroupCriterion electronics = addPartition(
                        adGroupId,
                        root, 
                        electronicsCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition otherCategoryL1Condition = new ProductCondition();
        otherCategoryL1Condition.setAttribute(null);
        otherCategoryL1Condition.setOperand("CategoryL1");

        AdGroupCriterion otherCategoryL1 = addPartition(
                        adGroupId,
                        root, 
                        otherCategoryL1Condition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        outputStatusMessage("Applying product partitions to the ad group...\n");
        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);

        adGroupCriterions = getAdGroupCriterionsByIds(
                        AccountId,
                        adGroupId, 
                        null,
                        criterionType);

        outputStatusMessage("The product partition group tree now has 9 nodes\n");
        printProductPartitions(adGroupCriterions);

        return applyPartitionActionsResponse;
    }

    // Deletes and updates branch and leaf criterion. 

    static void updateBranchAndLeafCriterion(long adGroupId, long rootId, long electronicsCriterionId) throws RemoteException, Exception
    {
        _partitionActions.getAdGroupCriterionActions().clear();

        AdGroupCriterion electronics = new BiddableAdGroupCriterion();
        electronics.setId(electronicsCriterionId);
        electronics.setAdGroupId(adGroupId);
        addPartitionAction(electronics, ItemAction.DELETE);

        BiddableAdGroupCriterion parent = new BiddableAdGroupCriterion();
        parent.setId(rootId);

        ProductCondition electronicsSubdivisionCondition = new ProductCondition();
        electronicsSubdivisionCondition.setAttribute("Electronics");
        electronicsSubdivisionCondition.setOperand("CategoryL1");

        AdGroupCriterion electronicsSubdivision = addPartition(
                        adGroupId,
                        parent, 
                        electronicsSubdivisionCondition, 
                        ProductPartitionType.SUBDIVISION, 
                        null, 
                        false);

        ProductCondition brandCCondition = new ProductCondition();
        brandCCondition.setAttribute("Brand C");
        brandCCondition.setOperand("Brand");

        AdGroupCriterion brandC = addPartition(
                        adGroupId,
                        electronicsSubdivision, 
                        brandCCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition brandDCondition = new ProductCondition();
        brandDCondition.setAttribute("Brand D");
        brandDCondition.setOperand("Brand");

        AdGroupCriterion brandD = addPartition(
                        adGroupId,
                        electronicsSubdivision, 
                        brandDCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        ProductCondition otherElectronicBrandsCondition = new ProductCondition();
        otherElectronicBrandsCondition.setAttribute(null);
        otherElectronicBrandsCondition.setOperand("Brand");

        AdGroupCriterion otherElectronicBrands = addPartition(
                        adGroupId,
                        electronicsSubdivision, 
                        otherElectronicBrandsCondition, 
                        ProductPartitionType.UNIT, 
                        getFixedBid(0.35), 
                        false);

        outputStatusMessage("Updating the electronics partition...\n");
        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);

        ArrayList<CriterionType> criterionType = new ArrayList<CriterionType>();
        criterionType.add(CriterionType.PRODUCT_PARTITION);
        ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterionsByIds(
                        AccountId,
                        adGroupId, 
                        null,
                        criterionType);

        outputStatusMessage("The product partition group tree now has 12 nodes\n");
        printProductPartitions(adGroupCriterions);
    }
     
    // Adds one or more ad groups to the specified campaign.

    static AddAdGroupsResponse addAdGroups(long campaignId, ArrayOfAdGroup adGroups) throws RemoteException, Exception
    {
       AddAdGroupsRequest request = new AddAdGroupsRequest();

       request.setCampaignId(campaignId);
       request.setAdGroups(adGroups);

       return CampaignService.getService().addAdGroups(request);
    }

    // Adds one or more ads to the specified ad group.

    static AddAdsResponse addAds(long adGroupId, ArrayOfAd ads) throws RemoteException, Exception
    {
        AddAdsRequest request = new AddAdsRequest();

        request.setAdGroupId(adGroupId);
        request.setAds(ads);

        return CampaignService.getService().addAds(request);
    }

     // Delete the Shopping campaign that we added to the account.

    static void deleteCampaigns(long accountId, ArrayOflong campaignIds) throws RemoteException, Exception
    {
        DeleteCampaignsRequest request = new DeleteCampaignsRequest();
        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        CampaignService.getService().deleteCampaigns(request);
    }

    // Get the ad group's criterion.

    static ArrayOfAdGroupCriterion getAdGroupCriterionsByIds(
                long accountId, 
                long adGroupId, 
                ArrayOflong adGroupCriterionIds,
                ArrayList<CriterionType> criterionType) throws RemoteException, Exception
    {
        GetAdGroupCriterionsByIdsRequest request = new GetAdGroupCriterionsByIdsRequest();
        request.setAccountId(accountId);
        request.setAdGroupId(adGroupId);
        request.setAdGroupCriterionIds(adGroupCriterionIds);
        request.setCriterionType(criterionType);

        return CampaignService.getService().getAdGroupCriterionsByIds(request).getAdGroupCriterions();
    }

    // Adds, updates, or deletes criterion for the ad group. 
    // All actions must be for the same ad group.

    static ApplyProductPartitionActionsResponse applyPartitionActions(
                ArrayOfAdGroupCriterionAction actions) throws RemoteException, Exception
    {
        ApplyProductPartitionActionsRequest request = new ApplyProductPartitionActionsRequest();
        request.setCriterionActions(actions);

        return CampaignService.getService().applyProductPartitionActions(request);
    }

    // Get the root criterion node.

    static AdGroupCriterion getRootNode(ArrayOfAdGroupCriterion adGroupCriterions)
    {
        AdGroupCriterion rootNode = null;

        for (AdGroupCriterion adGroupCriterion : adGroupCriterions.getAdGroupCriterions())
        {
                if (((ProductPartition)adGroupCriterion.getCriterion()).getParentCriterionId() == null)
                {
                        rootNode = adGroupCriterion;
                        break;
                }
        }

        return rootNode;
    }

    // Gets a fixed bid object with the specified bid amount.

    static FixedBid getFixedBid(final double bidAmount)
    {
        FixedBid fixedBid = new FixedBid();
        Bid bid = new Bid();
        bid.setAmount(bidAmount);
        fixedBid.setBid(bid);

        return fixedBid;
    }

    // Adds a criterion action to the list of actions.

    static void addPartitionAction(final AdGroupCriterion CRITERION, final ItemAction ITEM_ACTION)
    {
        AdGroupCriterionAction partitionAction = new AdGroupCriterionAction();
        partitionAction.setAction(ITEM_ACTION);
        partitionAction.setAdGroupCriterion(CRITERION);

        // _partitionActions is a global variable.

        _partitionActions.getAdGroupCriterionActions().add(partitionAction);
    }

    // Adds either a negative or biddable partition criterion. 

    static AdGroupCriterion addPartition(
                long adGroupId,
                AdGroupCriterion parent, 
                ProductCondition condition, 
                ProductPartitionType partitionType, 
                FixedBid bid, 
                Boolean isNegative)
    {
        AdGroupCriterion adGroupCriterion = null;

        if (isNegative)
        {
                adGroupCriterion = new NegativeAdGroupCriterion();
        }
        else
        {
                adGroupCriterion = new BiddableAdGroupCriterion();
                ((BiddableAdGroupCriterion)adGroupCriterion).setCriterionBid(bid);
        }

        adGroupCriterion.setAdGroupId(adGroupId);

        ProductPartition criterion = new ProductPartition();
        criterion.setCondition(condition);
        criterion.setParentCriterionId((parent != null) ? parent.getId() : null); 

        if (partitionType == ProductPartitionType.SUBDIVISION)
        {
                criterion.setPartitionType(ProductPartitionType.SUBDIVISION);  // Branch
                adGroupCriterion.setId(_referenceId--);
        }
        else
        {
                criterion.setPartitionType(ProductPartitionType.UNIT);  // Leaf
        }

        adGroupCriterion.setCriterion(criterion);

        addPartitionAction(adGroupCriterion, ItemAction.ADD);

        return adGroupCriterion;
    }

    // Generates the ad group's partition tree that we then print.

    static void printProductPartitions(ArrayOfAdGroupCriterion adGroupCriterions)
    {
        Map<Long, ArrayList<AdGroupCriterion>> childBranches = new HashMap<Long, ArrayList<AdGroupCriterion>>();
        AdGroupCriterion treeRoot = null;

        for (AdGroupCriterion adGroupCriterion : adGroupCriterions.getAdGroupCriterions())
        {
                ProductPartition partition = (ProductPartition)adGroupCriterion.getCriterion();
                childBranches.put(adGroupCriterion.getId(), new ArrayList<AdGroupCriterion>());

                if (partition.getParentCriterionId() != null)
                {
                        childBranches.get(partition.getParentCriterionId()).add(adGroupCriterion);
                }
                else
                {
                        treeRoot = adGroupCriterion;
                }
        }

        printProductPartitionTree(treeRoot, childBranches, 0);
    }

    // Print the partition tree.

    static void printProductPartitionTree(
                AdGroupCriterion node,
                Map<Long, ArrayList<AdGroupCriterion>> childBranches,
                int treeLevel)
    {
        ProductPartition criterion = (ProductPartition)node.getCriterion();

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s\n",
                        "",
                        criterion.getPartitionType()));

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%d\n",
                        "",
                        "ParentCriterionId: ", 
                        criterion.getParentCriterionId()));

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%d\n",
                        "",
                        "Id: ", 
                        node.getId()));

        if (criterion.getPartitionType() == ProductPartitionType.UNIT)
        {
            if (node instanceof BiddableAdGroupCriterion)
            {
                outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%.2f\n",
                                "",
                                "Bid amount: ", 
                                ((FixedBid)((BiddableAdGroupCriterion)node).getCriterionBid()).getBid().getAmount()));

            }
            else
            {
                if (node instanceof NegativeAdGroupCriterion)
                {
                    outputStatusMessage(String.format("%" + treeLevel * 4 + "s%s\n",
                                        "",
                                        "Not bidding on this condition"));
                }
            }
        }

        String nullAttribute = (criterion.getParentCriterionId() != null) ? "(All Others)" : "(Tree Root)";

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%s\n",
                        "",
                        "Attribute: ", 
                        (criterion.getCondition().getAttribute() == null) ? nullAttribute : criterion.getCondition().getAttribute()));

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%s\n",
                        "",
                        "Condition: ", 
                        criterion.getCondition().getOperand()));

        for (AdGroupCriterion childNode : childBranches.get(node.getId()))
        {
                printProductPartitionTree(childNode, childBranches, treeLevel + 1);
        }
    }

    // Prints the campaign identifiers of each campaign that we added. 

    static void printCampaignIdentifiers(ArrayOflong campaignIds)
    {
        if (campaignIds == null)
        {
            return;
        }

        for (long id : campaignIds.getLongs())
        {
            outputStatusMessage(String.format("Successfully added Campaign, %d\n\n", id));
        }
    }

    // Prints the ad group identifiers of each ad group that we added. 

    static void printAdGroupIdentifiers(ArrayOflong adGroupIds)
    {
        if (adGroupIds == null)         {
            return;
        }

        for (long id : adGroupIds.getLongs())
        {
            outputStatusMessage(String.format("Successfully added Ad Group, %d\n\n", id));
        }
    }

    // Prints the ad identifiers of each ad that we added. 

    static void printAdIdentifiers(ArrayOfNullableOflong adIds, ArrayOfBatchError partialErrors)
    {
        if (adIds == null) {
            return;
        }

        int count = adIds.getLongs().size();

        for (int i = 0; i < count; i++)
        {
           if (adIds.getLongs().get(i) != null)
           {
               // A shopping campaign should contain only product ads.

               outputStatusMessage(String.format("Successfully added a product ad with ID, %d\n\n", adIds.getLongs().get(i)));
           }
           else
           {
               outputStatusMessage(String.format("Failed to add product ad at index, %d\n\n", i));

               BatchError error = partialErrors.getBatchErrors().get(i);

               outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
               outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
               outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
               outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

               // If the error is an editorial error, get more details.

               if (error.getType() == "EditorialError" && error.getErrorCode() == "CampaignServiceEditorialValidationError")
               {
                   outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)error).getDisapprovedText()));
                   outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)error).getLocation()));
                   outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)error).getPublisherCountry()));
                   outputStatusMessage(String.format("\tReasonCode: %s\n", ((EditorialError)error).getReasonCode()));
               }
           }
        }
    }

    // Print the IDs of the criterion that we added to the ad group.

    static void printCriterionIds(ArrayOfNullableOflong criterionIds, ArrayOfBatchError partialErrors)
    {
        if (criterionIds == null) {
            return;
        }

        int count = criterionIds.getLongs().size();

        for (int i = 0; i < count; i++)
        {
           if (criterionIds.getLongs().get(i) != null)
           {
               outputStatusMessage(String.format("Successfully added criterion with ID, %d\n\n", criterionIds.getLongs().get(i)));
           }
           else
           {
               outputStatusMessage(String.format("Failed to add criterion at index, %d\n\n", i));

               BatchError error = partialErrors.getBatchErrors().get(i);

               outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
               outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
               outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
               outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));
           }
        }
    }

    // Prints the campaign criterion IDs of each criterion that we added. 

    static void printCampaignCriterionIdentifiers(ArrayOfNullableOflong criterionIds, ArrayOfBatchErrorCollection partialErrors)
    {
        if (criterionIds == null) {
            return;
        }

        int count = criterionIds.getLongs().size();

        for (int i = 0; i < count; i++)
        {
            if (criterionIds.getLongs().get(i) != null)
            {
               outputStatusMessage(String.format("Successfully added campaign criterion with ID, %d\n\n", 
               criterionIds.getLongs().get(i)));
            }
            else
            {
               outputStatusMessage(String.format("Failed to add campaign criterion at index, %d\n\n", i));

               BatchErrorCollection error = partialErrors.getBatchErrorCollections().get(i);

               outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
               outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
               outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
               outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

               if (error.getBatchErrors() != null)
               {        		 
                   for (BatchError batchError : error.getBatchErrors().getBatchErrors())
                   {
                       outputStatusMessage(String.format("\tIndex: %d\n", batchError.getIndex()));
                       outputStatusMessage(String.format("\tCode: %d\n", batchError.getCode()));
                       outputStatusMessage(String.format("\tErrorCode: %s\n", batchError.getErrorCode()));
                       outputStatusMessage(String.format("\tMessage: %s\n\n", batchError.getMessage()));
                   }
               }
            }
        }
    }
}


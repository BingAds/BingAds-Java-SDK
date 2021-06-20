package com.microsoft.bingads.examples.v13;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

// How to apply product conditions for Microsoft Shopping Campaigns.

public class ProductAds extends ExampleBase {
        
    private static ArrayOfAdGroupCriterionAction _partitionActions = new ArrayOfAdGroupCriterionAction();
    private static long _referenceId = -1;
        
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData();

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // Get a list of all Bing Merchant Center stores associated with your CustomerId.

            outputStatusMessage("-----\nGetBMCStoresByCustomerId:");
            final ArrayOfBMCStore stores = CampaignManagementExampleHelper.getBMCStoresByCustomerId(null).getBMCStores();

            if (stores == null)
            {
                outputStatusMessage(String.format("You do not have any BMC stores registered for CustomerId %d.", authorizationData.getCustomerId()));
                return;
            }
            
            outputStatusMessage("BMCStores:");
            CampaignManagementExampleHelper.outputArrayOfBMCStore(stores);

            // Create a Shopping campaign with product conditions.

            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.SHOPPING);
            campaign.setCampaignType(campaignTypes);
            campaign.setDailyBudget(50.00);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Everyone's Shoes " + System.currentTimeMillis());            
            ArrayOfSetting settings = new ArrayOfSetting();
            ShoppingSetting shoppingSetting = new ShoppingSetting();
            shoppingSetting.setPriority(0);
            shoppingSetting.setSalesCountryCode("US");
            shoppingSetting.setStoreId(stores.getBMCStores().get(0).getId());
            settings.getSettings().add(shoppingSetting);
            campaign.setSettings(settings);            
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            ArrayOfCampaign campaigns = new ArrayOfCampaign();
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
            
            // Optionally, you can create a ProductScope criterion that will be associated with your Microsoft Shopping campaign. 
            // You'll also be able to add more specific product conditions for each ad group.

            ArrayList<CampaignCriterionType> criterionType = new ArrayList<CampaignCriterionType>();
            criterionType.add(CampaignCriterionType.PRODUCT_SCOPE);

            BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();
            campaignCriterion.setCampaignId(campaignIds.getLongs().get(0));
            ProductScope criterion = new ProductScope();
            ArrayOfProductCondition conditions = new ArrayOfProductCondition();
            ProductCondition condition1 = new ProductCondition();
            condition1.setAttribute("New");
            condition1.setOperand("Condition");
            conditions.getProductConditions().add(condition1);
            ProductCondition condition2 = new ProductCondition();
            condition2.setAttribute("MerchantDefinedCustomLabel");
            condition2.setOperand("CustomLabel0");
            conditions.getProductConditions().add(condition2);
            criterion.setConditions(conditions);
            campaignCriterion.setCriterion(criterion);
            ArrayOfCampaignCriterion campaignCriterions = new ArrayOfCampaignCriterion();
            campaignCriterions.getCampaignCriterions().add(campaignCriterion);

            outputStatusMessage("-----\nAddCampaignCriterions:");
            AddCampaignCriterionsResponse addCriterionResponse = CampaignManagementExampleHelper.addCampaignCriterions(
                    campaignCriterions, 
                    criterionType);
            outputStatusMessage("CampaignCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addCriterionResponse.getCampaignCriterionIds());
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addCriterionResponse.getNestedPartialErrors());

            // Create the ad group that will have the product partitions.
            
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
            outputStatusMessage("AdGroupIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors); 
            
            // Create an update the ad group product partitions.

            addAndUpdateAdGroupCriterion(adGroupIds.getLongs().get(0));
            ApplyProductPartitionActionsResponse applyPartitionActionsResponse = addBranchAndLeafCriterion(adGroupIds.getLongs().get(0));

            long rootId = applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(1);
            long electronicsCriterionId = applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(8);
            updateBranchAndLeafCriterion(adGroupIds.getLongs().get(0), rootId, electronicsCriterionId);

            // Create a product ad. You must add at least one product ad to the ad group. 
            // The product ad identifier can be used for reporting analytics.
            // Use Merchant Promotions if you want tags to appear at the bottom of your product ad 
            // as "special offer" links, helping to increase customer engagement. For details
            // on Merchant Promotions see https://help.bingads.microsoft.com/#apex/3/en/56805/0.

            ArrayOfAd ads = new ArrayOfAd();
            ProductAd productAd = new ProductAd();
            ads.getAds().add(productAd);
            
            outputStatusMessage("-----\nAddAds:");
            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(
                    adGroupIds.getLongs().get(0), 
                    ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            outputStatusMessage("AdIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);

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

        outputStatusMessage("-----\nApplyProductPartitionActions:");
        outputStatusMessage("Applying a biddable criterion as the root...");
        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = CampaignManagementExampleHelper.applyProductPartitionActions(
                _partitionActions);
        CampaignManagementExampleHelper.outputArrayOfNullableOflong(applyPartitionActionsResponse.getAdGroupCriterionIds());
        CampaignManagementExampleHelper.outputArrayOfBatchError(applyPartitionActionsResponse.getPartialErrors());

        ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
        criterionType.add(AdGroupCriterionType.PRODUCT_PARTITION);
        
        outputStatusMessage("-----\nGetAdGroupCriterionsByIds:");
        ArrayOfAdGroupCriterion adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
            null,
            adGroupId, 
            criterionType,
            null).getAdGroupCriterions();

        outputStatusMessage("Printing the ad group's product partition; contains only the tree root node");
        printProductPartitions(adGroupCriterions);

        // Update the bid of the root node that we just added.

        BiddableAdGroupCriterion updatedRoot = new BiddableAdGroupCriterion();
        updatedRoot.setId(applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(0));
        updatedRoot.setAdGroupId(adGroupId);
        updatedRoot.setCriterionBid(getFixedBid(0.40));

        _partitionActions.getAdGroupCriterionActions().clear();

        addPartitionAction(updatedRoot, ItemAction.UPDATE);

        outputStatusMessage("-----\nApplyProductPartitionActions:");
        outputStatusMessage("Updating the bid for the tree root node...");
        applyPartitionActionsResponse = CampaignManagementExampleHelper.applyProductPartitionActions(
                _partitionActions);

        criterionType.add(AdGroupCriterionType.PRODUCT_PARTITION);
        
        outputStatusMessage("-----\nGetAdGroupCriterionsByIds:");
        adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
            null,
            adGroupId, 
            criterionType,
            null).getAdGroupCriterions();

        outputStatusMessage("Updated the bid for the tree root node");
        printProductPartitions(adGroupCriterions);
    }

    // Add a criterion to the ad group and then update it. 

    static ApplyProductPartitionActionsResponse addBranchAndLeafCriterion(long adGroupId) throws RemoteException, Exception
    {
        _partitionActions.getAdGroupCriterionActions().clear();

        ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
        criterionType.add(AdGroupCriterionType.PRODUCT_PARTITION);
        outputStatusMessage("-----\nGetAdGroupCriterionsByIds:");
        ArrayOfAdGroupCriterion adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
            null,
            adGroupId, 
            criterionType,
            null).getAdGroupCriterions();

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

        outputStatusMessage("-----\nApplyProductPartitionActions:");
        outputStatusMessage("Applying product partitions to the ad group...");
        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = CampaignManagementExampleHelper.applyProductPartitionActions(
                _partitionActions);

        outputStatusMessage("-----\nGetAdGroupCriterionsByIds:");
        adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
            null,
            adGroupId, 
            criterionType,
            null).getAdGroupCriterions();

        outputStatusMessage("The product partition group tree now has 9 nodes");
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

        outputStatusMessage("-----\nApplyProductPartitionActions:");
        outputStatusMessage("Updating the electronics partition...");
        ApplyProductPartitionActionsResponse applyPartitionActionsResponse = CampaignManagementExampleHelper.applyProductPartitionActions(
                _partitionActions);

        ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
        criterionType.add(AdGroupCriterionType.PRODUCT_PARTITION);
        outputStatusMessage("-----\nGetAdGroupCriterionsByIds:");
        ArrayOfAdGroupCriterion adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
            null,
            adGroupId, 
            criterionType,
            null).getAdGroupCriterions();

        outputStatusMessage("The product partition group tree now has 12 nodes");
        printProductPartitions(adGroupCriterions);
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
        fixedBid.setAmount(bidAmount);

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
                                ((FixedBid)((BiddableAdGroupCriterion)node).getCriterionBid()).getAmount()));

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
}


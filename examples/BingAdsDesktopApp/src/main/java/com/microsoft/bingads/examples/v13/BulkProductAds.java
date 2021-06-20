package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.bulk.entities.*;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class BulkProductAds extends BulkExampleBase {
	        
    private static ArrayList<BulkAdGroupProductPartition> _partitionActions = new ArrayList<BulkAdGroupProductPartition>();
    private static long _referenceId = -1;
        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();

            // The Bing Merchant Center Store Id cannot be retrieved via the Bulk service, 
            // so we'll use the Campaign Management service i.e., the GetBMCStoresByCustomerId service operation below.

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

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            // Create a Shopping campaign with product conditions.
            
            BulkCampaign bulkCampaign = new BulkCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.SHOPPING);
            campaign.setCampaignType(campaignTypes);
            campaign.setDailyBudget(50.00);
            campaign.setId(campaignIdKey);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring languages = 
                    new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
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
            bulkCampaign.setCampaign(campaign);
            
            uploadEntities.add(bulkCampaign);
            
            // Optionally, you can create a ProductScope criterion that will be associated with your Microsoft Shopping campaign. 
            // You'll also be able to add more specific product conditions for each ad group.

            BulkCampaignProductScope bulkCampaignProductScope = new BulkCampaignProductScope();
            ArrayList<CampaignCriterionType> criterionType = new ArrayList<CampaignCriterionType>();
            criterionType.add(CampaignCriterionType.PRODUCT_SCOPE);
            BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();
            campaignCriterion.setCampaignId(campaignIdKey);
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
            bulkCampaignProductScope.setBiddableCampaignCriterion(campaignCriterion);
            
            uploadEntities.add(bulkCampaignProductScope);

            // Create the ad group that will have the product partitions.

            BulkAdGroup bulkAdGroup = new BulkAdGroup();
            bulkAdGroup.setCampaignId(campaignIdKey);
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Everyone's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            bulkAdGroup.setAdGroup(adGroup);
            
            uploadEntities.add(bulkAdGroup);

            // Create a product ad. You must add at least one product ad to the ad group. 
            // The product ad identifier can be used for reporting analytics.
            // Use Merchant Promotions if you want tags to appear at the bottom of your product ad 
            // as "special offer" links, helping to increase customer engagement. For details
            // on Merchant Promotions see https://help.bingads.microsoft.com/#apex/3/en/56805/0.

            BulkProductAd bulkProductAd = new BulkProductAd();
            bulkProductAd.setAdGroupId(adGroupIdKey);
            ProductAd productAd = new ProductAd();
            bulkProductAd.setAd(productAd);
            
            uploadEntities.add(bulkProductAd);

            // Upload and write the output

            outputStatusMessage("-----\nAdding the campaign, product scope, ad group, and ad...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();

            outputStatusMessage("Upload results:");
            
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAdGroup> adGroupResults = new ArrayList<BulkAdGroup>();
            List<BulkProductAd> productAdResults = new ArrayList<BulkProductAd>();
            List<BulkCampaignProductScope> campaignProductScopeResults = new ArrayList<BulkCampaignProductScope>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                    campaignResults.add((BulkCampaign) entity);
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity));
                }
                else if (entity instanceof BulkAdGroup) {
                    adGroupResults.add((BulkAdGroup) entity);
                    outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                }
                else if (entity instanceof BulkProductAd) {
                    productAdResults.add((BulkProductAd) entity);
                    outputBulkProductAds(Arrays.asList((BulkProductAd) entity) );
                }
                else if (entity instanceof BulkCampaignProductScope) {
                    campaignProductScopeResults.add((BulkCampaignProductScope) entity);
                    outputBulkCampaignProductScopes(Arrays.asList((BulkCampaignProductScope) entity) );
                }
            }

            downloadEntities.close();
            Reader.close();

            java.lang.Long adGroupId = adGroupResults.get(0).getAdGroup().getId();

            // Bid all products

            ProductCondition rootCondition = new ProductCondition();
            rootCondition.setAttribute(null);
            rootCondition.setOperand("All");

            BulkAdGroupProductPartition root = addPartition(
                adGroupId,
                null, 
                rootCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "root");


            outputStatusMessage("-----\nApplying only the root as a Unit with a bid...");
            ArrayList<BulkAdGroupProductPartition> bulkApplyProductPartitionActionsResults = 
                applyBulkProductPartitionActions(_partitionActions);

            ArrayList<BulkAdGroupProductPartition> productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            outputStatusMessage("The ad group's product partition only has a tree root node:");
            outputProductPartitions(productPartitions);

            // Let's update the bid of the root Unit we just added.

            _partitionActions.clear();

            BulkAdGroupProductPartition updatedRoot = getNodeByClientId(bulkApplyProductPartitionActionsResults, "root");
            updatedRoot.getAdGroupCriterion().setAdGroupId(adGroupId);
            ((BiddableAdGroupCriterion)updatedRoot.getAdGroupCriterion()).setCriterionBid(getFixedBid(0.40));

            _partitionActions.add(updatedRoot);

            outputStatusMessage("-----\nUpdating the bid for the tree root node...");
            applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            outputStatusMessage("Updated the bid for the tree root node:");
            outputProductPartitions(productPartitions);

            // Initialize and overwrite any existing tree root, and build a product partition group tree structure in multiple steps. 
            // You could build the entire tree in a single call since there are less than 20,000 nodes; however, 
            // we will build it in steps to demonstrate how to use the results from bulk upload to update the tree. 

            _partitionActions.clear();

            // Check whether a root node exists already.

            BulkAdGroupProductPartition existingRoot = getNodeByClientId(bulkApplyProductPartitionActionsResults, "root");

            if (existingRoot != null)
            {
                existingRoot.setClientId("deletedroot");
                existingRoot.getAdGroupCriterion().setStatus(AdGroupCriterionStatus.DELETED);
                _partitionActions.add(existingRoot);
            }

            root = addPartition(
                adGroupId,
                null, 
                rootCondition, 
                ProductPartitionType.SUBDIVISION, 
                null, 
                false,
                "root");

            // The direct children of any node must have the same Operand. 
            // For this example we will use CategoryL1 nodes as children of the root. 
            // For a list of valid CategoryL1 through CategoryL5 values, see the Bing Category Taxonomy:
            // https://go.microsoft.com/fwlink?LinkId=507666

            ProductCondition animalsSubdivisionCondition = new ProductCondition();
            animalsSubdivisionCondition.setAttribute("Animals & Pet Supplies");
            animalsSubdivisionCondition.setOperand("CategoryL1");

            BulkAdGroupProductPartition animalsSubdivision = addPartition(
                         adGroupId,
                         root, 
                         animalsSubdivisionCondition, 
                         ProductPartitionType.SUBDIVISION, 
                         null, 
                         false,
                         "animalsSubdivision");

            // If you use a CategoryL2 node, it must be a descendant (child or later) of a CategoryL1 node. 
            // In other words you cannot have a CategoryL2 node as parent of a CategoryL1 node. 
            // For this example we will a CategoryL2 node as child of the CategoryL1 Animals & Pet Supplies node.

            ProductCondition petSuppliesSubdivisionCondition = new ProductCondition();
            petSuppliesSubdivisionCondition.setAttribute("Pet Supplies");
            petSuppliesSubdivisionCondition.setOperand("CategoryL2");

            BulkAdGroupProductPartition petSuppliesSubdivision = addPartition(
                adGroupId,
                animalsSubdivision, 
                petSuppliesSubdivisionCondition, 
                ProductPartitionType.SUBDIVISION, 
                null, 
                false,
                "petSuppliesSubdivision");

            ProductCondition brandACondition = new ProductCondition();
            brandACondition.setAttribute("Brand A");
            brandACondition.setOperand("Brand");

            BulkAdGroupProductPartition brandA = addPartition(
                adGroupId,
                petSuppliesSubdivision, 
                brandACondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "brandA");

            // If you won't bid on Brand B, set the helper method's bidAmount to '0' and isNegative to true. 
             // The helper method will create a NegativeAdGroupCriterion and apply the condition.

            ProductCondition brandBCondition = new ProductCondition();
            brandBCondition.setAttribute("Brand B");
            brandBCondition.setOperand("Brand");

            BulkAdGroupProductPartition brandB = addPartition(
                adGroupId,
                petSuppliesSubdivision, 
                brandBCondition, 
                ProductPartitionType.UNIT, 
                null, 
                true,
                "brandB");

            ProductCondition otherBrandsCondition = new ProductCondition();
            otherBrandsCondition.setAttribute(null);
            otherBrandsCondition.setOperand("Brand");

            BulkAdGroupProductPartition otherBrands = addPartition(
                adGroupId,
                petSuppliesSubdivision, 
                otherBrandsCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "otherBrands");

            ProductCondition otherPetSuppliesCondition = new ProductCondition();
            otherPetSuppliesCondition.setAttribute(null);
            otherPetSuppliesCondition.setOperand("CategoryL2");

            BulkAdGroupProductPartition otherPetSupplies = addPartition(
                adGroupId,
                animalsSubdivision, 
                otherPetSuppliesCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "otherPetSupplies");

            ProductCondition electronicsCondition = new ProductCondition();
            electronicsCondition.setAttribute("Electronics");
            electronicsCondition.setOperand("CategoryL1");

            BulkAdGroupProductPartition electronics = addPartition(
                adGroupId,
                root, 
                electronicsCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "electronics");

            ProductCondition otherCategoryL1Condition = new ProductCondition();
            otherCategoryL1Condition.setAttribute(null);
            otherCategoryL1Condition.setOperand("CategoryL1");

            BulkAdGroupProductPartition otherCategoryL1 = addPartition(
                adGroupId,
                root, 
                otherCategoryL1Condition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "otherCategoryL1");

            outputStatusMessage("-----\nApplying product partitions to the ad group...");
            bulkApplyProductPartitionActionsResults =
            applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            // The product partition group tree now has 9 nodes. 

            //All other (Root Node)
            // |
            // +-- Animals & Pet Supplies (CategoryL1)
            // |    |
            // |    +-- Pet Supplies (CategoryL2)
            // |    |    |
            // |    |    +-- Brand A
            // |    |    |    
            // |    |    +-- Brand B
            // |    |    |    
            // |    |    +-- All other (Brand)
            // |    |         
            // |    +-- All other (CategoryL2)
            // |        
            // +-- Electronics (CategoryL1)
            // |   
            // +-- All other (CategoryL1)

            outputStatusMessage("The product partition group tree now has 9 nodes:");
            outputProductPartitions(productPartitions);

            // Let's replace the Electronics (CategoryL1) node created above with an Electronics (CategoryL1) node that 
            // has children i.e. Brand C (Brand), Brand D (Brand), and All other (Brand) as follows: 

            //Electronics (CategoryL1)
            //|
            //+-- Brand C (Brand)
            //|
            //+-- Brand D (Brand)
            //|
            //+-- All other (Brand)

            _partitionActions.clear();

            // To replace a node we must know its Id and its ParentCriterionId. In this case the parent of the node 
            // we are replacing is All other (Root Node). The node that we are replacing is Electronics (CategoryL1). 

            long rootId = getNodeByClientId(bulkApplyProductPartitionActionsResults,"root").getAdGroupCriterion().getId();
            electronics.getAdGroupCriterion().setId(getNodeByClientId(bulkApplyProductPartitionActionsResults, "electronics").getAdGroupCriterion().getId());
            electronics.getAdGroupCriterion().setStatus(AdGroupCriterionStatus.DELETED);
            _partitionActions.add(electronics);

            BulkAdGroupProductPartition parent = new BulkAdGroupProductPartition();
            AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
            adGroupCriterion.setId(rootId);
            parent.setAdGroupCriterion(adGroupCriterion);
            parent.getAdGroupCriterion().setAdGroupId(adGroupId);

            ProductCondition electronicsSubdivisionCondition = new ProductCondition();
            electronicsSubdivisionCondition.setAttribute("Electronics");
            electronicsSubdivisionCondition.setOperand("CategoryL1");

            BulkAdGroupProductPartition electronicsSubdivision = addPartition(
                adGroupId,
                parent, 
                electronicsSubdivisionCondition, 
                ProductPartitionType.SUBDIVISION, 
                null, 
                false,
                "electronicsSubdivision");

            ProductCondition brandCCondition = new ProductCondition();
            brandCCondition.setAttribute("Brand C");
            brandCCondition.setOperand("Brand");

            BulkAdGroupProductPartition brandC = addPartition(
                adGroupId,
                electronicsSubdivision, 
                brandCCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "brandC");

            ProductCondition brandDCondition = new ProductCondition();
            brandDCondition.setAttribute("Brand D");
            brandDCondition.setOperand("Brand");

            BulkAdGroupProductPartition brandD = addPartition(
                adGroupId,
                electronicsSubdivision, 
                brandDCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "brandD");

            ProductCondition otherElectronicBrandsCondition = new ProductCondition();
            otherElectronicBrandsCondition.setAttribute(null);
            otherElectronicBrandsCondition.setOperand("Brand");

            BulkAdGroupProductPartition otherElectronicBrands = addPartition(
                adGroupId,
                electronicsSubdivision, 
                otherElectronicBrandsCondition, 
                ProductPartitionType.UNIT, 
                getFixedBid(0.35), 
                false,
                "otherElectronicBrands");

            outputStatusMessage("-----\nUpdating the product partition group to refine Electronics (CategoryL1) with 3 child nodes...");
            bulkApplyProductPartitionActionsResults = 
            applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            // The product partition group tree now has 12 nodes, including the children of Electronics (CategoryL1):

            //All other (Root Node)
            // |
            // +-- Animals & Pet Supplies (CategoryL1)
            // |    |
            // |    +-- Pet Supplies (CategoryL2)
            // |    |    |
            // |    |    +-- Brand A
            // |    |    |    
            // |    |    +-- Brand B
            // |    |    |    
            // |    |    +-- All other (Brand)
            // |    |         
            // |    +-- All other (CategoryL2)
            // |        
            // +-- Electronics (CategoryL1)
            // |    |
            // |    +-- Brand C (Brand)
            // |    |
            // |    +-- Brand D (Brand)
            // |    |
            // |    +-- All other (Brand)
            // |   
            // +-- All other (CategoryL1)

            outputStatusMessage("The product partition group tree now has 12 nodes, including the children of Electronics (CategoryL1):");
            outputProductPartitions(productPartitions);

            // Delete the campaign and everything it contains e.g., ad groups and ads.   

            uploadEntities = new ArrayList<BulkEntity>();
            
            for (BulkCampaign campaignResult : campaignResults){
                campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
                uploadEntities.add(campaignResult);
            }

            // Upload and write the output
            
            outputStatusMessage("-----\nDeleting the campaign and everything it contains e.g., ad groups and ads...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
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
    
    // Uploads a list of BulkAdGroupProductPartition objects that must represent
    // a product partition tree for one ad group. You can include BulkAdGroupProductPartition records for more than one
    // ad group per upload, however, this code example assumes that only one ad group is in scope. 
    
    static ArrayList<BulkAdGroupProductPartition> applyBulkProductPartitionActions(
        ArrayList<BulkAdGroupProductPartition> partitionActions) throws IOException, ExecutionException, InterruptedException
    {
    	List<BulkEntity> entities = new ArrayList<BulkEntity>();
    	
    	for (BulkAdGroupProductPartition partitionAction : partitionActions)
        {
            entities.add(partitionAction);
        }

        // Upload and write the output
        
    	Reader = writeEntitiesAndUploadFile(entities);      
        BulkEntityIterable downloadEntities = Reader.getEntities();
        
        ArrayList<BulkAdGroupProductPartition> bulkAdGroupProductPartitionResults = new ArrayList<BulkAdGroupProductPartition>();
        
        outputStatusMessage("Upload results:");
        
        for (BulkEntity entity : downloadEntities) {
            if (entity instanceof BulkAdGroupProductPartition) {
                bulkAdGroupProductPartitionResults.add((BulkAdGroupProductPartition)entity);
                outputBulkAdGroupProductPartitions(bulkAdGroupProductPartitionResults);
            }
        }

        downloadEntities.close();
        Reader.close();
        
        return bulkAdGroupProductPartitionResults;
    }

    // Gets the list of BulkAdGroupProductPartition that represent a product partition tree for the specified ad group.
    
    static ArrayList<BulkAdGroupProductPartition> getBulkAdGroupProductPartitionTree(long adGroupId) throws IOException, ExecutionException, InterruptedException
    {
    	ArrayOfDownloadEntity downloadEntities = new ArrayOfDownloadEntity();
        downloadEntities.getDownloadEntities().add(DownloadEntity.AD_GROUP_PRODUCT_PARTITIONS);

        DownloadParameters downloadParameters = new DownloadParameters();
        downloadParameters.setDownloadEntities(downloadEntities);
        downloadParameters.setFileType(DownloadFileType.CSV);
        downloadParameters.setResultFileDirectory(new File(FileDirectory));
        downloadParameters.setResultFileName(ResultFileName);
        downloadParameters.setOverwriteResultFile(true);
        downloadParameters.setLastSyncTimeInUTC(null);

        File bulkFilePath = BulkServiceManager.downloadFileAsync(downloadParameters, null, null).get();
        Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, BulkDownloadFileType);
        BulkEntityIterable bulkEntities = Reader.getEntities();
        List<BulkAdGroupProductPartition> bulkAdGroupProductPartitionResults = new ArrayList<BulkAdGroupProductPartition>();
        for (BulkEntity entity : bulkEntities) {
            if (entity instanceof BulkAdGroupProductPartition) {
                bulkAdGroupProductPartitionResults.add((BulkAdGroupProductPartition) entity);
            }
        }

        bulkEntities.close();
        Reader.close();

        ArrayList<BulkAdGroupProductPartition> bulkAdGroupProductPartitions = new ArrayList<BulkAdGroupProductPartition>(); 
        for (BulkAdGroupProductPartition bulkAdGroupProductPartitionResult : bulkAdGroupProductPartitionResults)
        {
            if(bulkAdGroupProductPartitionResult.getAdGroupCriterion() != null
                && bulkAdGroupProductPartitionResult.getAdGroupCriterion().getAdGroupId() == adGroupId)
            {
                bulkAdGroupProductPartitions.add(bulkAdGroupProductPartitionResult);
            }
        }

        return bulkAdGroupProductPartitions;
    }
        
    // Gets a fixed bid object with the specified bid amount.
    
    static FixedBid getFixedBid(final double bidAmount)
    {
    	FixedBid fixedBid = new FixedBid();
        fixedBid.setAmount(bidAmount);

        return fixedBid;
    }
    
    // Adds either a negative or biddable partition criterion. 
    
    static BulkAdGroupProductPartition addPartition(
   		 long adGroupId,
   		 BulkAdGroupProductPartition parent, 
   		 ProductCondition condition, 
   		 ProductPartitionType partitionType, 
   		 FixedBid bid, 
   		 Boolean isNegative,
   		 java.lang.String clientId)
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
        criterion.setParentCriterionId((parent != null && parent.getAdGroupCriterion() != null) ? 
                        parent.getAdGroupCriterion().getId() : null); 

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

        BulkAdGroupProductPartition partitionAction = new BulkAdGroupProductPartition();
        partitionAction.setAdGroupCriterion(adGroupCriterion);
        partitionAction.setClientId(clientId);
        _partitionActions.add(partitionAction);

        return partitionAction;
    }
    
    // Returns the BulkAdGroupProductPartition corresponding to the specified Client Id.
    
    static BulkAdGroupProductPartition getNodeByClientId(
    		List<BulkAdGroupProductPartition> productPartitions,
    		java.lang.String clientId)
    {
    	BulkAdGroupProductPartition clientNode = null;
		 
        for (BulkAdGroupProductPartition productPartition : productPartitions)
        {
                if (productPartition.getClientId().equals(clientId))
                {
                        clientNode = productPartition;
                        break;
                }
        }

        return clientNode;
    }
    
    // Generates the ad group's partition tree that we then print.
    
    static void outputProductPartitions(List<BulkAdGroupProductPartition> bulkAdGroupProductPartitions)
    {
        Map<Long, ArrayList<BulkAdGroupProductPartition>> childBranches = new HashMap<Long, ArrayList<BulkAdGroupProductPartition>>();
        BulkAdGroupProductPartition treeRoot = null;

        for (BulkAdGroupProductPartition bulkAdGroupProductPartition : bulkAdGroupProductPartitions)
        {
            AdGroupCriterion adGroupCriterion = bulkAdGroupProductPartition.getAdGroupCriterion();
            if(adGroupCriterion != null){
                ProductPartition partition = (ProductPartition)adGroupCriterion.getCriterion();
                childBranches.put(adGroupCriterion.getId(), new ArrayList<BulkAdGroupProductPartition>());

                if (partition.getParentCriterionId() != null)
                {
                        childBranches.get(partition.getParentCriterionId()).add(bulkAdGroupProductPartition);
                }
                else
                {
                        treeRoot = bulkAdGroupProductPartition;
                }
            }
        }

        // Outputs the tree root node and any children recursively
        outputProductPartitionTree(treeRoot, childBranches, 0);
    }

    // Print the partition tree.
    
    static void outputProductPartitionTree(
    		BulkAdGroupProductPartition node,
   		Map<Long, ArrayList<BulkAdGroupProductPartition>> childBranches,
   		int treeLevel)
    {
    	AdGroupCriterion adGroupCriterion = node.getAdGroupCriterion();
    	
        ProductPartition criterion = (ProductPartition)adGroupCriterion.getCriterion();

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
                        adGroupCriterion.getId()));

        if (criterion.getPartitionType() == ProductPartitionType.UNIT)
        {
                if (adGroupCriterion instanceof BiddableAdGroupCriterion)
                {
                outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%.2f\n",
                                "",
                                "Bid amount: ", 
                                ((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).getAmount()));

                }
                else
                {
                        if (adGroupCriterion instanceof NegativeAdGroupCriterion)
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
                        (criterion.getCondition().getAttribute() == null) ? 
                                        nullAttribute : criterion.getCondition().getAttribute()));

        outputStatusMessage(String.format("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%s\n",
                        "",
                        "Condition: ", 
                        criterion.getCondition().getOperand()));

        for (BulkAdGroupProductPartition childNode : childBranches.get(adGroupCriterion.getId()))
        {
                outputProductPartitionTree(childNode, childBranches, treeLevel + 1);
        }
    }
}

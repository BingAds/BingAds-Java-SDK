package com.microsoft.bingads.examples.v10;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.bulk.entities.*;
import com.microsoft.bingads.v10.bulk.*;
import com.microsoft.bingads.v10.campaignmanagement.*;
import com.microsoft.bingads.v10.campaignmanagement.Date;

public class BulkShoppingCampaigns extends BulkExampleBaseV10 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static ServiceClient<ICampaignManagementService> CampaignService;
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
        
	final static long campaignIdKey = -123; 
	final static long adGroupIdKey = -1234; 
    
    private static ArrayList<BulkAdGroupProductPartition> _partitionActions = new ArrayList<BulkAdGroupProductPartition>();
    private static long _referenceId = -1;
        
    public static void main(String[] args) {
		
		BulkEntityIterable bulkEntities = null;
				
		try {
			authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
			
			// You will need to use the Campaign Management service to get the Bing Merchant Center Store Id. This will be used
            // when creating a new Bing Shopping Campaign.
            // For other operations such as adding product conditions, you can manage Bing Shopping Campaigns solely with the Bulk Service. 
			
			CampaignService = new ServiceClient<ICampaignManagementService>(
                 	authorizationData, 
                 	ICampaignManagementService.class);
         
	        // Get the user's list of Bing Merchant Center (BMC) stores.
	
	        final ArrayOfBMCStore stores = getBMCStoresByCustomerId();
	         
	        if (stores == null)
	        {
	        	outputStatusMessage(String.format("Customer %d does not have any regeistered BMC stores.\n\n", authorizationData.getCustomerId()));
	        	return;
	        }
						            				
			
	        BulkService = new BulkServiceManager(authorizationData);
			BulkService.setStatusPollIntervalInMilliseconds(5000);

            List<BulkEntity> entities = new ArrayList<BulkEntity>();
            
            /* Add a new Bing Shopping campaign that will be associated with a ProductScope criterion.
             *  - Set the CampaignType element of the Campaign to Shopping.
             *  - Create a ShoppingSetting instance and set its Priority (0, 1, or 2), SalesCountryCode, and StoreId elements. 
             *    Add this shopping setting to the Settings list of the Campaign.
             */
            
            BulkCampaign bulkCampaign = new BulkCampaign();
    		// ClientId may be used to associate records in the bulk upload file with records in the results file. The value of this field  
    		// is not used or stored by the server; it is simply copied from the uploaded record to the corresponding result record. 
    		// Note: This bulk file Client Id is not related to an application Client Id for OAuth. 
    		bulkCampaign.setClientId("YourClientIdGoesHere");
    		Campaign campaign = new Campaign() {{ 
    			// When using the Campaign Management service, the Id cannot be set. In the context of a BulkCampaign, the Id is optional 
                // and may be used as a negative reference key during bulk upload. For example the same negative value set for the campaign Id 
                // will be used when associating this new campaign with a new campaign product scope in the BulkCampaignProductScope object below. 
    			id = campaignIdKey;
	   			name = "Bing Shopping Campaign " + System.currentTimeMillis();
	   			description = "Bing Shopping Campaign Example.";
	   			budgetType = BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED;
	   			monthlyBudget = 1000.00;
	   			timeZone = "PacificTimeUSCanadaTijuana";
	   			campaignType = new ArrayList<CampaignType>(){{
	   				add(CampaignType.SHOPPING);
	   			}};
	   			status = CampaignStatus.PAUSED;
	   			settings = new ArrayOfSetting(){{
	   				settings = new ArrayList<Setting>(){{
	   					add(new ShoppingSetting(){{
	   						priority = 0;
	   						salesCountryCode = "US";
	   						storeId = stores.getBMCStores().get(0).getId();
	   					}});
	   				}};
	   			}};
	   		}};
	   		bulkCampaign.setCampaign(campaign);

    		/* Optionally, you can create a ProductScope criterion that will be associated with your Bing Shopping campaign. 
             * Use the product scope criterion to include a subset of your product catalog, for example a specific brand, 
             * category, or product type. A campaign can only be associated with one ProductScope, which contains a list 
             * of up to 7 ProductCondition. You'll also be able to specify more specific product conditions for each ad group.
             */
    		
    		BulkCampaignProductScope bulkCampaignProductScope = new BulkCampaignProductScope();
    		CampaignCriterion campaignCriterion = new CampaignCriterion(){{
	    		campaignId = campaignIdKey;
	    		criterion = new ProductScope(){{
					conditions = new ArrayOfProductCondition(){{
	               		productConditions = new ArrayList<ProductCondition>(){{
	               			add(new ProductCondition(){{
	               				operand = "Condition";
	               				attribute = "New";
	               			}});
	               			add(new ProductCondition(){{
	               				operand = "Brand";
	               				attribute = "Contoso";
	           				}});
	           			}};
	           		}};
				}};
    		}};
    		bulkCampaignProductScope.setCampaignCriterion(campaignCriterion);
    			
    		// Specify one or more ad groups.
    		
    		BulkAdGroup bulkAdGroup = new BulkAdGroup();
    		bulkAdGroup.setCampaignId(campaignIdKey);
    		AdGroup adGroup = new AdGroup(){{
    			id = adGroupIdKey;
				adDistribution = new ArrayList<AdDistribution>(){{
					add(AdDistribution.SEARCH);
				}};
				biddingModel = BiddingModel.KEYWORD;
				pricingModel = PricingModel.CPC;
				startDate = null;
				endDate = new Date(){{
					month = 12;
					day = 31;
					year = 2016;
				}};
				language = "English";
				name = "Product Categories";
			}};
            bulkAdGroup.setAdGroup(adGroup);
    		
            /*
             * Create a product ad. You must add at least one ProductAd to the corresponding ad group. 
             * A ProductAd is not used directly for delivered ad copy. Instead, the delivery engine generates 
             * product ads from the product details that it finds in your Bing Merchant Center store's product catalog. 
             * The primary purpose of the ProductAd object is to provide promotional text that the delivery engine 
             * adds to the product ads that it generates. For example, if the promotional text is set to 
             * �Free shipping on $99 purchases�, the delivery engine will set the product ad�s description to 
             * �Free shipping on $99 purchases.�
             */
            
            BulkProductAd bulkProductAd = new BulkProductAd();
            bulkProductAd.setAdGroupId(adGroupIdKey);
            ProductAd productAd = new ProductAd(){{
				promotionalText = "Free shipping on $99 purchases.";
			}};
			bulkProductAd.setAd(productAd);
            
    		entities.add(bulkCampaign);
    		entities.add(bulkCampaignProductScope);
    		entities.add(bulkAdGroup);
    		entities.add(bulkProductAd);
            
            Reader = uploadEntities(entities);

            // Write the upload output

            bulkEntities = Reader.getEntities();
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAdGroup> adGroupResults = new ArrayList<BulkAdGroup>();
            List<BulkProductAd> productAdResults = new ArrayList<BulkProductAd>();
            List<BulkCampaignProductScope> campaignProductScopeResults = new ArrayList<BulkCampaignProductScope>();
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
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
            
			bulkEntities.close();
            Reader.close();
            
            java.lang.Long adGroupId = adGroupResults.get(0).getAdGroup().getId();
            
            // Add a biddable criterion as the root.
       	 
            BulkAdGroupProductPartition root = addPartition(
           		 adGroupId,
           		 null, 
           		 new ProductCondition(){{ setOperand("All"); setAttribute(null); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "root");

            
            outputStatusMessage("Applying only the root as a Unit with a bid . . . \n");
            ArrayList<BulkAdGroupProductPartition> bulkApplyProductPartitionActionsResults = 
                applyBulkProductPartitionActions(_partitionActions);
 
            ArrayList<BulkAdGroupProductPartition> productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            outputStatusMessage("The ad group's product partition only has a tree root node: \n");
            outputProductPartitions(productPartitions);
            
            
            /*
             * Let's update the bid of the root Unit we just added.
             */
            
            _partitionActions.clear();
            
            BulkAdGroupProductPartition updatedRoot = getNodeByClientId(bulkApplyProductPartitionActionsResults, "root");
            updatedRoot.getAdGroupCriterion().setAdGroupId(adGroupId);
            ((BiddableAdGroupCriterion)updatedRoot.getAdGroupCriterion()).setCriterionBid(getFixedBid(0.40));
            
    		_partitionActions.add(updatedRoot);
    		            
    		outputStatusMessage("Updating the bid for the tree root node . . . \n");
            applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            outputStatusMessage("Updated the bid for the tree root node: \n");
            outputProductPartitions(productPartitions);
            
            
            /*
             * Now we will overwrite any existing tree root, and build a product partition group tree structure in multiple steps. 
             * You could build the entire tree in a single call since there are less than 20,000 nodes; however, 
             * we will build it in steps to demonstrate how to use the results from bulk upload to update the tree. 
             * 
             * For a list of validation rules, see the Bing Shopping Campaigns technical guide:
             * https://msdn.microsoft.com/en-US/library/bing-ads-campaign-management-bing-shopping-campaigns.aspx
             */
            
            _partitionActions.clear();
            
            /*
             * Check whether a root node exists already.
             */
            
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
           		 new ProductCondition(){{ setOperand("All"); setAttribute(null); }}, 
           		 ProductPartitionType.SUBDIVISION, 
           		 null, 
           		 false,
           		 "root");
            
            /*
             * The direct children of any node must have the same Operand. 
             * For this example we will use CategoryL1 nodes as children of the root. 
             * For a list of valid CategoryL1 through CategoryL5 values, see the Bing Category Taxonomy:
             * http://advertise.bingads.microsoft.com/en-us/WWDocs/user/search/en-us/Bing_Category_Taxonomy.txt
             */
            
            BulkAdGroupProductPartition animalsSubdivision = addPartition(
           		 adGroupId,
           		 root, 
           		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Animals & Pet Supplies"); }}, 
           		 ProductPartitionType.SUBDIVISION, 
           		 null, 
           		 false,
           		 "animalsSubdivision");
            
            /*
             * If you use a CategoryL2 node, it must be a descendant (child or later) of a CategoryL1 node. 
             * In other words you cannot have a CategoryL2 node as parent of a CategoryL1 node. 
             * For this example we will a CategoryL2 node as child of the CategoryL1 Animals & Pet Supplies node. 
             */
            
            BulkAdGroupProductPartition petSuppliesSubdivision = addPartition(
           		 adGroupId,
           		 animalsSubdivision, 
           		 new ProductCondition(){{ setOperand("CategoryL2"); setAttribute("Pet Supplies"); }}, 
           		 ProductPartitionType.SUBDIVISION, 
           		 null, 
           		 false,
           		 "petSuppliesSubdivision");
            
            BulkAdGroupProductPartition brandA = addPartition(
           		 adGroupId,
           		 petSuppliesSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand A"); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "brandA");
            
            /*
             * If you won't bid on Brand B, set the helper method's bid to 'null' and isNegative to true. 
             * The helper method will create a NegativeAdGroupCriterion and apply the condition.
             */
            
            BulkAdGroupProductPartition brandB = addPartition(
           		 adGroupId,
           		 petSuppliesSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand B"); }}, 
           		 ProductPartitionType.UNIT, 
           		 null, 
           		 true,
           		 "brandB");
            
            BulkAdGroupProductPartition otherBrands = addPartition(
           		 adGroupId,
           		 petSuppliesSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute(null); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "otherBrands");
            
            BulkAdGroupProductPartition otherPetSupplies = addPartition(
           		 adGroupId,
           		 animalsSubdivision, 
           		 new ProductCondition(){{ setOperand("CategoryL2"); setAttribute(null); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "otherPetSupplies");
            
            BulkAdGroupProductPartition electronics = addPartition(
           		 adGroupId,
           		 root, 
           		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Electronics"); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "electronics");
            
            BulkAdGroupProductPartition otherCategoryL1 = addPartition(
           		 adGroupId,
           		 root, 
           		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute(null); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "otherCategoryL1");
            
            outputStatusMessage("Applying product partitions to the ad group . . . \n");
            bulkApplyProductPartitionActionsResults =
                applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            /*
             * The product partition group tree now has 9 nodes. 
             
               All other (Root Node)
                |
                +-- Animals & Pet Supplies (CategoryL1)
                |    |
                |    +-- Pet Supplies (CategoryL2)
                |    |    |
                |    |    +-- Brand A
                |    |    |    
                |    |    +-- Brand B
                |    |    |    
                |    |    +-- All other (Brand)
                |    |         
                |    +-- All other (CategoryL2)
                |        
                +-- Electronics (CategoryL1)
                |   
                +-- All other (CategoryL1)

             */

            outputStatusMessage("The product partition group tree now has 9 nodes: \n");
            outputProductPartitions(productPartitions);

            /*
             * Let's replace the Electronics (CategoryL1) node created above with an Electronics (CategoryL1) node that 
             * has children i.e. Brand C (Brand), Brand D (Brand), and All other (Brand) as follows: 
             
                Electronics (CategoryL1)
                |
                +-- Brand C (Brand)
                |
                +-- Brand D (Brand)
                |
                +-- All other (Brand)
       
             */
            
            
            _partitionActions.clear();
            
            /*
             * To replace a node we must know its Id and its ParentCriterionId. In this case the parent of the node 
             * we are replacing is All other (Root Node). The node that we are replacing is Electronics (CategoryL1). 
             */
            
            long rootId = getNodeByClientId(bulkApplyProductPartitionActionsResults,"root").getAdGroupCriterion().getId();
            electronics.getAdGroupCriterion().setId(getNodeByClientId(bulkApplyProductPartitionActionsResults, "electronics").getAdGroupCriterion().getId());
            electronics.getAdGroupCriterion().setStatus(AdGroupCriterionStatus.DELETED);
            _partitionActions.add(electronics);
            
            BulkAdGroupProductPartition parent = new BulkAdGroupProductPartition();
            AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
            adGroupCriterion.setId(rootId);
            parent.setAdGroupCriterion(adGroupCriterion);
            parent.getAdGroupCriterion().setAdGroupId(adGroupId);
                        
            BulkAdGroupProductPartition electronicsSubdivision = addPartition(
           		 adGroupId,
           		 parent, 
           		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Electronics"); }}, 
           		 ProductPartitionType.SUBDIVISION, 
           		 null, 
           		 false,
           		 "electronicsSubdivision");
            
            BulkAdGroupProductPartition brandC = addPartition(
           		 adGroupId,
           		 electronicsSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand C"); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "brandC");
            
            BulkAdGroupProductPartition brandD = addPartition(
           		 adGroupId,
           		 electronicsSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand D"); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "brandD");
            
            BulkAdGroupProductPartition otherElectronicBrands = addPartition(
           		 adGroupId,
           		 electronicsSubdivision, 
           		 new ProductCondition(){{ setOperand("Brand"); setAttribute(null); }}, 
           		 ProductPartitionType.UNIT, 
           		 getFixedBid(0.35), 
           		 false,
           		 "otherElectronicBrands");
            
        	outputStatusMessage(
                "Updating the product partition group to refine Electronics (CategoryL1) with 3 child nodes . . . \n"
            );
            bulkApplyProductPartitionActionsResults = 
                applyBulkProductPartitionActions(_partitionActions);

            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);

            /*
             * The product partition group tree now has 12 nodes, including the children of Electronics (CategoryL1):
             
               All other (Root Node)
                |
                +-- Animals & Pet Supplies (CategoryL1)
                |    |
                |    +-- Pet Supplies (CategoryL2)
                |    |    |
                |    |    +-- Brand A
                |    |    |    
                |    |    +-- Brand B
                |    |    |    
                |    |    +-- All other (Brand)
                |    |         
                |    +-- All other (CategoryL2)
                |        
                +-- Electronics (CategoryL1)
                |    |
                |    +-- Brand C (Brand)
                |    |
                |    +-- Brand D (Brand)
                |    |
                |    +-- All other (Brand)
                |   
                +-- All other (CategoryL1)
             
             */

            outputStatusMessage(
                "The product partition group tree now has 12 nodes, including the children of Electronics (CategoryL1): \n"
            );
            outputProductPartitions(productPartitions);
            

            /* Delete the campaign, ad group, criterion, and ad that were previously added. 
             * You should remove this region if you want to view the added entities in the 
             * Bing Ads web application or another tool.
             */

            java.lang.Long campaignId = campaignResults.get(0).getCampaign().getId();
            
            bulkCampaign = new BulkCampaign();
            bulkCampaign.setCampaign(new Campaign());
            bulkCampaign.getCampaign().setId(campaignId);
            bulkCampaign.getCampaign().setStatus(CampaignStatus.DELETED);        
            
            entities = new ArrayList<BulkEntity>();
            entities.add(bulkCampaign);

            Reader = uploadEntities(entities);
            
            // Write the upload output

            bulkEntities = Reader.getEntities();
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
			}
			bulkEntities.close();
            Reader.close();

            outputStatusMessage("Deleted CampaignId " + campaignId + "\n");
		
        // Bulk service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.bulk.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.bulk.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                outputStatusMessage("AdApiError\n");
                outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
            
        // Bulk service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.bulk.ApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.bulk.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.bulk.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
         // Campaign Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.campaignmanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.campaignmanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
            	outputStatusMessage("AdApiError\n");
                outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
            
        // Campaign Management service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.campaignmanagement.ApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
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
		} finally {
			if (bulkEntities != null){
				try {
					bulkEntities.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
		System.exit(0);
	}
    
    /// Writes the specified entities to a local file and uploads the file. We could have uploaded directly
    /// without writing to file. This example writes to file as an exercise so that you can view the structure 
    /// of the bulk records being uploaded as needed. 
    
    static BulkFileReader uploadEntities(List<BulkEntity> uploadEntities) throws IOException, ExecutionException, InterruptedException {
    	Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

    	for(BulkEntity entity : uploadEntities){
    		Writer.writeEntity(entity);
    	}
        
        Writer.close();

        FileUploadParameters fileUploadParameters = new FileUploadParameters();
        fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
        fileUploadParameters.setResultFileName(ResultFileName);
        fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
        fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
        fileUploadParameters.setOverwriteResultFile(true);
        
        File bulkFilePath =
            BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
        return new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
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

    	Reader = uploadEntities(entities);

        // Write the upload output

        BulkEntityIterable bulkEntities = Reader.getEntities();
        
        ArrayList<BulkAdGroupProductPartition> bulkAdGroupProductPartitionResults = new ArrayList<BulkAdGroupProductPartition>();
        for (BulkEntity entity : bulkEntities) {
			if (entity instanceof BulkAdGroupProductPartition) {
				bulkAdGroupProductPartitionResults.add((BulkAdGroupProductPartition)entity);
				outputBulkAdGroupProductPartitions(bulkAdGroupProductPartitionResults);
			}
		}

        bulkEntities.close();
        Reader.close();
        
        return bulkAdGroupProductPartitionResults;
    }

    // Gets the list of BulkAdGroupProductPartition that represent a product partition tree for the specified ad group.
    
    static ArrayList<BulkAdGroupProductPartition> getBulkAdGroupProductPartitionTree(long adGroupId) throws IOException, ExecutionException, InterruptedException
    {
    	List<BulkDownloadEntity> downloadEntities = new ArrayList<BulkDownloadEntity>();
		downloadEntities.add(BulkDownloadEntity.AD_GROUP_PRODUCT_PARTITIONS);
		
		DownloadParameters downloadParameters = new DownloadParameters();
		downloadParameters.setEntities(downloadEntities);
		downloadParameters.setFileType(DownloadFileType.CSV);
		downloadParameters.setResultFileDirectory(new File(FileDirectory));
		downloadParameters.setResultFileName(ResultFileName);
		downloadParameters.setOverwriteResultFile(true);
		downloadParameters.setLastSyncTimeInUTC(null);
		
		File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
        Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
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
    
    // Returns an array of Bing Merchant Center stores that the customer owns.
    
    static ArrayOfBMCStore getBMCStoresByCustomerId() throws RemoteException, Exception
    {
		GetBMCStoresByCustomerIdRequest request = new GetBMCStoresByCustomerIdRequest();
		 
		return CampaignService.getService().getBMCStoresByCustomerId(request).getBMCStores();
    }
    
    // Gets a fixed bid object with the specified bid amount.
    
    static FixedBid getFixedBid(final double bidAmount)
    {
    	return new FixedBid(){{ setBid(new Bid(){{ setAmount(bidAmount); }}); }};
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
		    			((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).getBid().getAmount()));
				 
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
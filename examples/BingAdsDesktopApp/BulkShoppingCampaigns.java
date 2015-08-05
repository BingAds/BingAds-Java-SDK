package com.microsoft.bingads.examples;

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
import com.microsoft.bingads.bulk.entities.*;
import com.microsoft.bingads.bulk.*;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.campaignmanagement.Date;

public class BulkShoppingCampaigns {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static ServiceClient<ICampaignManagementService> CampaignService;
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
    
    /// <summary>
    /// The directory for the bulk files.
    /// </summary>
    static java.lang.String FileDirectory = "c:\\bulk\\";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String UploadFileName = "upload.csv";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String ResultFileName = "result.csv";
    
    /// <summary>
    /// The bulk file extension type.
    /// </summary>
    static DownloadFileType FileType = DownloadFileType.CSV; 
    
	final static long campaignIdKey = -123; 
	final static long adGroupIdKey = -1234; 
    
	private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    
    private static ArrayList<BulkAdGroupProductPartition> _partitionActions = new ArrayList<BulkAdGroupProductPartition>();
    private static long _referenceId = -1;
        
    public static void main(String[] args) {
		
		BulkEntityIterable entities = null;
				
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
	        	System.out.printf("Customer %d does not have any regeistered BMC stores.\n\n", authorizationData.getCustomerId());
	        	return;
	        }
						            				
			
	        BulkService = new BulkServiceManager(authorizationData);
			BulkService.setStatusPollIntervalInMilliseconds(5000);

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
            
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
             * “Free shipping on $99 purchases”, the delivery engine will set the product ad’s description to 
             * “Free shipping on $99 purchases.”
             */
            
            BulkProductAd bulkProductAd = new BulkProductAd();
            bulkProductAd.setAdGroupId(adGroupIdKey);
            ProductAd productAd = new ProductAd(){{
				promotionalText = "Free shipping on $99 purchases.";
			}};
			bulkProductAd.setAd(productAd);
            
    		uploadEntities.add(bulkCampaign);
    		uploadEntities.add(bulkCampaignProductScope);
    		uploadEntities.add(bulkAdGroup);
    		uploadEntities.add(bulkProductAd);
            
            Reader = uploadEntities(uploadEntities);

            // Write the upload output

            entities = Reader.getEntities();
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAdGroup> adGroupResults = new ArrayList<BulkAdGroup>();
            List<BulkProductAd> productAdResults = new ArrayList<BulkProductAd>();
            List<BulkCampaignProductScope> campaignProductScopeResults = new ArrayList<BulkCampaignProductScope>();
            
            for (BulkEntity entity : entities) {
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
			entities.close();

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
            
            productPartitions = getBulkAdGroupProductPartitionTree(adGroupId);
            BulkAdGroupProductPartition existingRoot = getNodeByClientId(bulkApplyProductPartitionActionsResults, "root");
            
            if (existingRoot != null)
            {
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
            
            uploadEntities = new ArrayList<BulkEntity>();
            uploadEntities.add(bulkCampaign);

            Reader = uploadEntities(uploadEntities);
            
            // Write the upload output

            entities = Reader.getEntities();
            
            for (BulkEntity entity : entities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
			}
			entities.close();
            Reader.close();

            outputStatusMessage("Deleted CampaignId " + campaignId + "\n");
		
        // Bulk service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.bulk.AdApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.bulk.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                System.out.printf("AdApiError\n");
                System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
            }
            
        // Bulk service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.bulk.ApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.bulk.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                System.out.printf("BatchError at Index: %d\n", error.getIndex());
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }

            for (com.microsoft.bingads.bulk.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                System.out.printf("OperationError\n");
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }
         // Campaign Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.campaignmanagement.AdApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.campaignmanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                System.out.printf("AdApiError\n");
                System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
            }
            
        // Campaign Management service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.campaignmanagement.ApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                System.out.printf("BatchError at Index: %d\n", error.getIndex());
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }

            for (com.microsoft.bingads.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                System.out.printf("OperationError\n");
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }
        } catch (RemoteException ex) {
            System.out.println("Service communication error encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
		} finally {
			if (entities != null){
				try {
					entities.close();
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
    	FileUploadParameters fileUploadParameters = new FileUploadParameters();
        fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
        fileUploadParameters.setResultFileName(ResultFileName);
        fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
        fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
        fileUploadParameters.setOverwriteResultFile(true);
        
        Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));
        for (BulkAdGroupProductPartition partitionAction : partitionActions)
        {
            Writer.writeEntity(partitionAction);
        }
        Writer.close();

        File bulkFilePath =
                BulkService.uploadFileAsync(fileUploadParameters, null, null).get();

        Reader = new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
        BulkEntityIterable entities = Reader.getEntities();
        ArrayList<BulkAdGroupProductPartition> bulkAdGroupProductPartitionResults = new ArrayList<BulkAdGroupProductPartition>();
        for (BulkEntity entity : entities) {
			if (entity instanceof BulkAdGroupProductPartition) {
				bulkAdGroupProductPartitionResults.add((BulkAdGroupProductPartition)entity);
				outputBulkAdGroupProductPartitions(bulkAdGroupProductPartitionResults);
			}
		}

        entities.close();
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
        BulkEntityIterable entities = Reader.getEntities();
        List<BulkAdGroupProductPartition> bulkAdGroupProductPartitionResults = new ArrayList<BulkAdGroupProductPartition>();
        for (BulkEntity entity : entities) {
			if (entity instanceof BulkAdGroupProductPartition) {
				bulkAdGroupProductPartitionResults.add((BulkAdGroupProductPartition) entity);
			}
		}

        entities.close();
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
		 
		System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s\n",
				"",
				criterion.getPartitionType());
		
		System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%d\n",
				"",
				"ParentCriterionId: ", 
				criterion.getParentCriterionId());
		
		System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%d\n",
				"",
				"Id: ", 
				adGroupCriterion.getId());
		 
		if (criterion.getPartitionType() == ProductPartitionType.UNIT)
		{
			if (adGroupCriterion instanceof BiddableAdGroupCriterion)
			{
		    	System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%.2f\n",
		    			"",
		    			"Bid amount: ", 
		    			((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).getBid().getAmount());
				 
			}
			else
			{
				if (adGroupCriterion instanceof NegativeAdGroupCriterion)
				{
			    	System.out.printf("%" + treeLevel * 4 + "s%s\n",
			    			"",
			    			"Not bidding on this condition");
				}
			}
		}
		 
		String nullAttribute = (criterion.getParentCriterionId() != null) ? "(All Others)" : "(Tree Root)";
		 
		System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%s\n",
				"",
				"Attribute: ", 
				(criterion.getCondition().getAttribute() == null) ? 
						nullAttribute : criterion.getCondition().getAttribute());
		 
		System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%s\n",
				"",
				"Condition: ", 
				criterion.getCondition().getOperand());
		 
		for (BulkAdGroupProductPartition childNode : childBranches.get(adGroupCriterion.getId()))
		{
			outputProductPartitionTree(childNode, childBranches, treeLevel + 1);
		}
    }
    	
	static void outputBulkCampaigns(Iterable<BulkCampaign> bulkEntities){
		for (BulkCampaign entity : bulkEntities){
			outputStatusMessage("\nBulkCampaign: \n");
			outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
			outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
			if(entity.getLastModifiedTime() != null){
				outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
			}
			
			outputBulkPerformanceData(entity.getPerformanceData());
			outputBulkQualityScoreData(entity.getQualityScoreData());
			
			// Output the Campaign Management Campaign Object
			outputCampaign(entity.getCampaign());
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputCampaign(Campaign campaign){
		if (campaign != null) {
			outputStatusMessage(String.format("BudgetType: %s", campaign.getBudgetType()));
            outputStatusMessage(String.format("CampaignType: %s", campaign.getCampaignType()));
            outputStatusMessage(String.format("DailyBudget: %s", campaign.getDailyBudget()));
            outputStatusMessage(String.format("Description: %s", campaign.getDescription()));
            outputStatusMessage(String.format("Id: %s", campaign.getId()));
            outputStatusMessage(String.format("MonthlyBudget: %s", campaign.getMonthlyBudget()));
            outputStatusMessage(String.format("Name: %s", campaign.getName()));
            outputStatusMessage(String.format("NativeBidAdjustment: %s", campaign.getNativeBidAdjustment()));
            outputStatusMessage("Settings: ");
            if (campaign.getSettings() != null)
            {
                for (Setting setting : campaign.getSettings().getSettings())
                {
                    if (setting instanceof ShoppingSetting)
                    {
                        outputStatusMessage("ShoppingSetting: ");
                        outputStatusMessage(String.format("Priority: %s", ((ShoppingSetting)setting).getPriority()));
                        outputStatusMessage(String.format("SalesCountryCode: %s", ((ShoppingSetting)setting).getSalesCountryCode()));
                        outputStatusMessage(String.format("StoreId: %s", ((ShoppingSetting)setting).getStoreId()));
                    }
                }
            }
            outputStatusMessage(String.format("Status: %s", campaign.getStatus()));
            outputStatusMessage(String.format("TimeZone: %s", campaign.getTimeZone()));
		}
	}
	
	static void outputBulkAdGroups(Iterable<BulkAdGroup> bulkEntities){
		for (BulkAdGroup entity : bulkEntities){
			outputStatusMessage("\nBulkAdGroup: \n");
			outputStatusMessage(String.format("CampaignId: %s", entity.getCampaignId()));
			outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
			outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
			outputStatusMessage(String.format("IsExpired: %s", entity.getIsExpired()));
			if(entity.getLastModifiedTime() != null){
				outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
			}
			
			outputBulkPerformanceData(entity.getPerformanceData());
			outputBulkQualityScoreData(entity.getQualityScoreData());
			
			// Output the Campaign Management AdGroup Object
			outputAdGroup(entity.getAdGroup());
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputAdGroup(AdGroup adGroup){
		if (adGroup != null) {
			if (adGroup.getAdDistribution() != null)
            {
                outputStatusMessage("AdDistribution: ");
                for (AdDistribution distribution : adGroup.getAdDistribution())
                {
                	outputStatusMessage(String.format("\t%s", distribution));
                }
            }
            outputStatusMessage(String.format("AdRotation: %s", 
            		adGroup.getAdRotation() != null ? adGroup.getAdRotation().getType() : null));
            outputStatusMessage(String.format("BiddingModel: %s", adGroup.getBiddingModel()));
            outputStatusMessage(String.format("BroadMatchBid: %s", 
            		adGroup.getBroadMatchBid() != null ? adGroup.getBroadMatchBid().getAmount() : null));
            outputStatusMessage(String.format("ContentMatchBid: %s", 
            		adGroup.getContentMatchBid() != null ? adGroup.getContentMatchBid().getAmount() : null));
            if (adGroup.getEndDate() != null)
            {
                outputStatusMessage(String.format("EndDate: %s/%s/%s",
                adGroup.getEndDate().getMonth(),
                adGroup.getEndDate().getDay(),
                adGroup.getEndDate().getYear()));
            }
            outputStatusMessage(String.format("ExactMatchBid: %s", 
            		adGroup.getExactMatchBid() != null ? adGroup.getExactMatchBid().getAmount() : null));
            
            outputStatusMessage(String.format("Id: %s", adGroup.getId()));
            outputStatusMessage(String.format("Language: %s", adGroup.getLanguage()));
            outputStatusMessage(String.format("Name: %s", adGroup.getName()));
            outputStatusMessage(String.format("NativeBidAdjustment: %s", adGroup.getNativeBidAdjustment()));
            outputStatusMessage(String.format("Network: %s", adGroup.getNetwork()));
            outputStatusMessage(String.format("PhraseMatchBid: %s", 
            		adGroup.getPhraseMatchBid() != null ? adGroup.getPhraseMatchBid().getAmount() : null));
            outputStatusMessage(String.format("PricingModel: %s", adGroup.getPricingModel()));
            if (adGroup.getStartDate() != null)
            {
                outputStatusMessage(String.format("StartDate: %s/%s/%s",
                adGroup.getStartDate().getMonth(),
                adGroup.getStartDate().getDay(),
                adGroup.getStartDate().getYear()));
            }
            outputStatusMessage(String.format("Status: %s", adGroup.getStatus()));
		}
	}
	
	static void outputBulkProductAds(Iterable<BulkProductAd> bulkEntities){
		for (BulkProductAd entity : bulkEntities){
			outputStatusMessage("\nBulkProductAd: \n");
			outputStatusMessage(String.format("AdGroupId: %s", entity.getAdGroupId()));
			outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
			outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
			outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
			if(entity.getLastModifiedTime() != null){
				outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
			}
			
			outputBulkPerformanceData(entity.getPerformanceData());
			
			// Output the Campaign Management ProductAd Object
			outputProductAd(entity.getProductAd());
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputProductAd(ProductAd productAd){
		if (productAd != null) {
			outputStatusMessage(String.format("DevicePreference: %s", productAd.getDevicePreference()));
            outputStatusMessage(String.format("EditorialStatus: %s", productAd.getEditorialStatus()));
            outputStatusMessage(String.format("Id: %s", productAd.getId()));
            outputStatusMessage(String.format("PromotionalText: %s", productAd.getPromotionalText()));
            outputStatusMessage(String.format("Status: %s", productAd.getStatus()));
		}
	}
	
	static void outputBulkCampaignProductScopes(Iterable<BulkCampaignProductScope> bulkEntities){
		for (BulkCampaignProductScope entity : bulkEntities){
			outputStatusMessage("\nBulkCampaignProductScope: \n");
			outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
			outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
			if(entity.getLastModifiedTime() != null){
				outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
			}
									
			// Output the Campaign Management CampaignCriterion and ProductScope Objects
			outputCampaignCriterionWithProductScope(entity.getCampaignCriterion());
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputCampaignCriterionWithProductScope(CampaignCriterion campaignCriterion){
		if (campaignCriterion != null) {
			outputStatusMessage(String.format("BidAdjustment: %s", campaignCriterion.getBidAdjustment()));
            outputStatusMessage(String.format("CampaignId: %s", campaignCriterion.getCampaignId()));
            outputStatusMessage(String.format("CampaignCriterion Id: %s", campaignCriterion.getId()));
            outputStatusMessage(String.format("CampaignCriterion Type: %s", campaignCriterion.getType()));

            // Output the Campaign Management ProductScope Object
            outputProductScope((ProductScope)campaignCriterion.getCriterion());
		}
	}
	
	static void outputProductScope(ProductScope productScope){
		if (productScope != null) {
			outputStatusMessage("Product Conditions: ");
			for (ProductCondition condition : productScope.getConditions().getProductConditions())
            {
				outputStatusMessage(String.format("\tOperand: %s", condition.getOperand()));
				outputStatusMessage(String.format("\tAttribute: %s", condition.getAttribute()));
            }
		}
	}
	
	static void outputBulkAdGroupProductPartitions(Iterable<BulkAdGroupProductPartition> bulkEntities){
		for (BulkAdGroupProductPartition entity : bulkEntities){
			outputStatusMessage("\nBulkAdGroupProductPartition: \n");
			outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
			outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
			outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
			if(entity.getLastModifiedTime() != null){
				outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
			}
			
			// Output the Campaign Management AdGroupCriterion and ProductPartition Objects
			outputAdGroupCriterionWithProductPartition(entity.getAdGroupCriterion());
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputAdGroupCriterionWithProductPartition(AdGroupCriterion adGroupCriterion){
		if (adGroupCriterion != null) {
			outputStatusMessage(String.format("AdGroup Id: %s", adGroupCriterion.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupCriterion Id: %s", adGroupCriterion.getId()));
            outputStatusMessage(String.format("AdGroupCriterion Type: %s", adGroupCriterion.getType()));
            
            if(adGroupCriterion instanceof BiddableAdGroupCriterion){
            	outputStatusMessage(String.format("DestinationUrl: %s", ((BiddableAdGroupCriterion)adGroupCriterion).getDestinationUrl()));

                // Output the Campaign Management FixedBid Object
                outputFixedBid((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid());
            }
            
            // Output the Campaign Management ProductPartition Object
            outputProductPartition((ProductPartition)adGroupCriterion.getCriterion());
		}
	}
	
	static void outputProductPartition(ProductPartition productPartition){
		if (productPartition != null) {
			outputStatusMessage(String.format("AdGroup Id: %s", productPartition.getParentCriterionId()));
            outputStatusMessage(String.format("AdGroupCriterion Id: %s", productPartition.getPartitionType()));
            if (productPartition.getCondition() != null) {
    			outputStatusMessage("Condition: ");
    			outputStatusMessage(String.format("\tOperand: %s", productPartition.getCondition().getOperand()));
				outputStatusMessage(String.format("\tAttribute: %s", productPartition.getCondition().getAttribute()));
    		}
		}
	}
	
	static void outputFixedBid(FixedBid fixedBid){
		if (fixedBid != null && fixedBid.getBid() != null) {
			outputStatusMessage(String.format("Bid Amount: %s", fixedBid.getBid().getAmount()));
		}
	}
	
	
	static void outputBulkPerformanceData(PerformanceData performanceData){
		if (performanceData != null)
        {
            outputStatusMessage("PerformanceData: ");
            outputStatusMessage(String.format("AverageCostPerClick: %s", performanceData.getAverageCostPerClick()));
            outputStatusMessage(String.format("AverageCostPerThousandImpressions: %s", performanceData.getAverageCostPerThousandImpressions()));
            outputStatusMessage(String.format("AveragePosition: %s", performanceData.getAveragePosition()));
            outputStatusMessage(String.format("Clicks: %s", performanceData.getClicks()));
            outputStatusMessage(String.format("ClickThroughRate: %s", performanceData.getClickThroughRate()));
            outputStatusMessage(String.format("Conversions: %s", performanceData.getConversions()));
            outputStatusMessage(String.format("CostPerConversion: %s", performanceData.getCostPerConversion()));
            outputStatusMessage(String.format("Impressions: %s", performanceData.getImpressions()));
            outputStatusMessage(String.format("Spend: %s", performanceData.getSpend()));
        }
	}
	
	static void outputBulkQualityScoreData(QualityScoreData qualityScoreData){
		if (qualityScoreData != null)
        {
            outputStatusMessage("QualityScoreData: ");
            outputStatusMessage(String.format("KeywordRelevance: %s", qualityScoreData.getKeywordRelevance()));
            outputStatusMessage(String.format("LandingPageRelevance: %s", qualityScoreData.getLandingPageRelevance()));
            outputStatusMessage(String.format("LandingPageUserExperience: %s", qualityScoreData.getLandingPageUserExperience()));
            outputStatusMessage(String.format("QualityScore: %s", qualityScoreData.getQualityScore()));
        }
	}
	
	
	
	static void outputStatusMessage(java.lang.String message){
		System.out.println(message);
	}
	
	static void outputErrors(Iterable<BulkError> errors){
		for (BulkError error : errors){
			outputStatusMessage(String.format("Error: %s", error.getError()));
			outputStatusMessage(String.format("Number: %s\n", error.getNumber()));
			if(error.getEditorialReasonCode() != null){
				outputStatusMessage(String.format("EditorialTerm: %s\n", error.getEditorialTerm()));
				outputStatusMessage(String.format("EditorialReasonCode: %s\n", error.getEditorialReasonCode()));
				outputStatusMessage(String.format("EditorialLocation: %s\n", error.getEditorialLocation()));
				outputStatusMessage(String.format("PublisherCountries: %s\n", error.getPublisherCountries()));
			}
		}
	}
		
}
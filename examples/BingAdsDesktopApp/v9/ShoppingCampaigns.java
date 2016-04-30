package com.microsoft.bingads.examples.v9;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.campaignmanagement.AdDistribution;
import com.microsoft.bingads.campaignmanagement.AdGroup;
import com.microsoft.bingads.campaignmanagement.ArrayOfAdGroup;
import com.microsoft.bingads.campaignmanagement.BiddingModel;
import com.microsoft.bingads.campaignmanagement.PricingModel;

// This example uses the Bing Ads Java SDK to create a
// Bing Shopping campaign.

// To run this example, you must have a Bing Merchant
// Center store.

public class ShoppingCampaigns extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
    // Uses username and password credentials for authorization.
    
    /*
	  private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
    
    private static ArrayOfAdGroupCriterionAction _partitionActions = new ArrayOfAdGroupCriterionAction();
    private static long _referenceId = -1;
    
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
	                 	ICampaignManagementService.class);
	         
	         // Get the user's list of Bing Merchant Center (BMC) stores.
	
	         ArrayOfBMCStore stores = getStoreIds();
	         
	         if (stores == null)
	         {
	        	 System.out.printf("Customer %d does not have any regeistered BMC stores.\n\n", authorizationData.getCustomerId());
	        	 return;
	         }
	         
	         // Create a Bing Shopping campaign using the ID of the first store in the list.
	         
	         ArrayOflong campaignIds = addCampaigns(AccountId, stores.getBMCStores().get(0).getId());
	         printCampaignIdentifiers(campaignIds);
	         
	         ArrayOflong adGroupIds = addAdGroups(campaignIds.getLongs().get(0));
	         printAdGroupIdentifiers(adGroupIds);
	         
	         AddAdsResponse response = addAds(adGroupIds.getLongs().get(0));
	         printAdIdentifiers(response.getAdIds(), response.getPartialErrors());
	
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
	
	         deleteCampaigns(AccountId, campaignIds);
	         System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));
	         
	         outputStatusMessage("Program execution completed\n"); 
             
         // Campaign Management service operations can throw AdApiFaultDetail.
         } catch (AdApiFaultDetail_Exception ex) {
             System.out.println("The operation failed with the following faults:\n");

             for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
             {
                 System.out.printf("AdApiError\n");
                 System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
             }
             
         // Campaign Management service operations can throw ApiFaultDetail.
         } catch (ApiFaultDetail_Exception ex) {
             System.out.println("The operation failed with the following faults:\n");

             for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
             {
                 System.out.printf("BatchError at Index: %d\n", error.getIndex());
                 System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
             }

             for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
             {
                 System.out.printf("OperationError\n");
                 System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
             }
         
         // Some Campaign Management service operations such as SetAdExtensionsAssociations can throw EditorialApiFaultDetail.
         } catch (EditorialApiFaultDetail_Exception ex) {
             System.out.println("The operation failed with the following faults:\n");

             for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
             {
                 System.out.printf("BatchError at Index: %d\n", error.getIndex());
                 System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
             }
             
             for (EditorialError error : ex.getFaultInfo().getEditorialErrors().getEditorialErrors())
             {
                 System.out.printf("EditorialError at Index: %d\n\n", error.getIndex());
                 System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
                 System.out.printf("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry());
             }

             for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
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
         }
     }
    
     // Adds a Bing Shopping campaign to the specified account. The
     // CampaignType identifies the campaign as a Shopping campaign. 

     static ArrayOflong addCampaigns(final long ACCOUNT_ID, final long BMC_STORE_ID) throws RemoteException, Exception
     {
         AddCampaignsRequest request = new AddCampaignsRequest(){{
             accountId = ACCOUNT_ID;
             campaigns = new ArrayOfCampaign(){{
            	 campaigns = new ArrayList<Campaign>(){{
            		 add(new Campaign() {{ 
            			 name = "Bing Shopping Campaign " + System.currentTimeMillis();
            			 description = "Bing Shopping Campaign Example.";
            			 budgetType = BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED;
            			 monthlyBudget = 1000.00;
            			 timeZone = "PacificTimeUSCanadaTijuana";
            			 daylightSaving = true;
            			 campaignType = new ArrayList<CampaignType>(){{
            				 add(CampaignType.SHOPPING);
            			 }};
            			 settings = new ArrayOfSetting(){{
            				 settings = new ArrayList<Setting>(){{
            					 add(new ShoppingSetting(){{
            						 priority = 0;
            						 salesCountryCode = "US";
            						 storeId = BMC_STORE_ID;
            					 }});
            				 }};
            			 }};
            		 }});
            	 }};
             }};
         }};
         
         return CampaignService.getService().addCampaigns(request).getCampaignIds();
     }
     
     // Returns an array of Bing Merchant Center stores that the customer owns.
     
     static ArrayOfBMCStore getStoreIds() throws RemoteException, Exception
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
    	 AddCampaignCriterionsRequest request = new AddCampaignCriterionsRequest(){{
    		 criterionType = new ArrayList<CampaignCriterionType>(){{
    			 add(CampaignCriterionType.PRODUCT_SCOPE);
    		 }};
    		 campaignCriterions = new ArrayOfCampaignCriterion(){{
    			 campaignCriterions = new ArrayList<CampaignCriterion>(){{
        			 add(new CampaignCriterion(){{
        				 campaignId = CAMPAIGN_ID;
        				 bidAdjustment = null;  // Reserved for future use
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
                	 }});
    				 
    			 }};
        	 }};
    	 }};

    	 return CampaignService.getService().addCampaignCriterions(request);
     }

     // Add a criterion to the ad group and then update it. 
     
     static void addAndUpdateAdGroupCriterion(long adGroupId) throws RemoteException, Exception
     {
         // Add a biddable criterion as the root.
    	 
         AdGroupCriterion root = addPartition(
        		 adGroupId,
        		 null, 
        		 new ProductCondition(){{ setOperand("All"); setAttribute(null); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);

         System.out.println("Applying a biddable criterion as the root...\n");
         
         ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);
         printCriterionIds(applyPartitionActionsResponse.getAdGroupCriterionIds(), applyPartitionActionsResponse.getPartialErrors());

         ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterions(
        		 AccountId,
        		 adGroupId, 
        		 CriterionType.PRODUCT_PARTITION);
         
         System.out.println("Printing the ad group's product partition; contains only the tree root node\n");
         printProductPartitions(adGroupCriterions);
         
         // Update the bid of the root node that we just added.
         
         BiddableAdGroupCriterion updatedRoot = new BiddableAdGroupCriterion();
         updatedRoot.setId(applyPartitionActionsResponse.getAdGroupCriterionIds().getLongs().get(0));
         updatedRoot.setAdGroupId(adGroupId);
         updatedRoot.setCriterionBid(getFixedBid(0.40));
         
         _partitionActions.getAdGroupCriterionActions().clear();
         
         addPartitionAction(updatedRoot, ItemAction.UPDATE);
         
         System.out.println("Updating the bid for the tree root node...\n");
         
         applyPartitionActionsResponse = applyPartitionActions(_partitionActions);
         
         adGroupCriterions = getAdGroupCriterions(
        		 AccountId,
        		 adGroupId, 
        		 CriterionType.PRODUCT_PARTITION);
         
         System.out.println("Updated the bid for the tree root node\n");
         printProductPartitions(adGroupCriterions);
     }

     // Add a criterion to the ad group and then update it. 
     
     static ApplyProductPartitionActionsResponse addBranchAndLeafCriterion(long adGroupId) throws RemoteException, Exception
     {
         _partitionActions.getAdGroupCriterionActions().clear();
         
         ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterions(
        		 AccountId,
        		 adGroupId, 
        		 CriterionType.PRODUCT_PARTITION);
         
         AdGroupCriterion existingRoot = getRootNode(adGroupCriterions);
         
         if (existingRoot != null)
         {
        	 addPartitionAction(existingRoot, ItemAction.DELETE);
        	 
         }
         
         AdGroupCriterion root = addPartition(
        		 adGroupId,
        		 null, 
        		 new ProductCondition(){{ setOperand("All"); setAttribute(null); }}, 
        		 ProductPartitionType.SUBDIVISION, 
        		 null, 
        		 false);
         
         
         AdGroupCriterion animalsSubdivision = addPartition(
        		 adGroupId,
        		 root, 
        		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Animals & Pet Supplies"); }}, 
        		 ProductPartitionType.SUBDIVISION, 
        		 null, 
        		 false);
         
         AdGroupCriterion petSuppliesSubdivision = addPartition(
        		 adGroupId,
        		 animalsSubdivision, 
        		 new ProductCondition(){{ setOperand("CategoryL2"); setAttribute("Pet Supplies"); }}, 
        		 ProductPartitionType.SUBDIVISION, 
        		 null, 
        		 false);
         
         AdGroupCriterion brandA = addPartition(
        		 adGroupId,
        		 petSuppliesSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand A"); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion brandB = addPartition(
        		 adGroupId,
        		 petSuppliesSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand B"); }}, 
        		 ProductPartitionType.UNIT, 
        		 null, 
        		 true);
         
         AdGroupCriterion otherBrands = addPartition(
        		 adGroupId,
        		 petSuppliesSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute(null); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion otherPetSupplies = addPartition(
        		 adGroupId,
        		 animalsSubdivision, 
        		 new ProductCondition(){{ setOperand("CategoryL2"); setAttribute(null); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion electronics = addPartition(
        		 adGroupId,
        		 root, 
        		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Electronics"); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion otherCategoryL1 = addPartition(
        		 adGroupId,
        		 root, 
        		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute(null); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         System.out.println("Applying product partitions to the ad group...\n");
         ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);
         
         adGroupCriterions = getAdGroupCriterions(
        		 AccountId,
        		 adGroupId, 
        		 CriterionType.PRODUCT_PARTITION);
         
         System.out.println("The product partition group tree now has 9 nodes\n");
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
         
         AdGroupCriterion electronicsSubdivision = addPartition(
        		 adGroupId,
        		 parent, 
        		 new ProductCondition(){{ setOperand("CategoryL1"); setAttribute("Electronics"); }}, 
        		 ProductPartitionType.SUBDIVISION, 
        		 null, 
        		 false);
         
         AdGroupCriterion brandC = addPartition(
        		 adGroupId,
        		 electronicsSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand C"); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion brandD = addPartition(
        		 adGroupId,
        		 electronicsSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute("Brand D"); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         AdGroupCriterion otherElectronicBrands = addPartition(
        		 adGroupId,
        		 electronicsSubdivision, 
        		 new ProductCondition(){{ setOperand("Brand"); setAttribute(null); }}, 
        		 ProductPartitionType.UNIT, 
        		 getFixedBid(0.35), 
        		 false);
         
         System.out.println("Updating the electronics partition...\n");
         ApplyProductPartitionActionsResponse applyPartitionActionsResponse = applyPartitionActions(_partitionActions);
         
         ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterions(
        		 AccountId,
        		 adGroupId, 
        		 CriterionType.PRODUCT_PARTITION);
         
         System.out.println("The product partition group tree now has 12 nodes\n");
         printProductPartitions(adGroupCriterions);
     }
     
     // Add an ad group to the specified campaign.
     
     static ArrayOflong addAdGroups(final long CAMPAIGN_ID) throws RemoteException, Exception
     {
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
		adGroup.setEndDate(new com.microsoft.bingads.campaignmanagement.Date());
		adGroup.getEndDate().setDay(31);
		adGroup.getEndDate().setMonth(12);
		adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
		adGroup.setLanguage("English");
		adGroups.getAdGroups().add(adGroup);
			
    	AddAdGroupsRequest request = new AddAdGroupsRequest();
    	request.setCampaignId(CAMPAIGN_ID);
    	request.setAdGroups(adGroups);
    	
    	return CampaignService.getService().addAdGroups(request).getAdGroupIds();
     }
     
     // Add the product ad to the ad group. Shopping campaigns must contain
     // only Product Ads. If you try to add ads of other types, the call
     // will fail. 
     
     static AddAdsResponse addAds(final long AD_GROUP_ID) throws RemoteException, Exception
     {
    	 final ArrayOfAd ADS = new ArrayOfAd(){{
    		 ads = new ArrayList<Ad>(){{
    			 add(new ProductAd(){{
    				 promotionalText = "Free shipping on $99 purchases.";
    			 }});
    		 }};
    	 }};

    	 AddAdsRequest request = new AddAdsRequest(){{
    		 adGroupId = AD_GROUP_ID;
        	 ads = ADS;
    	 }};
    	 
    	 return CampaignService.getService().addAds(request);
     }

     // Delete the Shopping campaign that we added to the account.

     static void deleteCampaigns(final long ACCOUNT_ID, final ArrayOflong CAMPAIGN_IDS) throws RemoteException, Exception
     {
    	 DeleteCampaignsRequest request = new DeleteCampaignsRequest(){{
    		 accountId = ACCOUNT_ID;
             campaignIds = CAMPAIGN_IDS;
    	 }};
         
         CampaignService.getService().deleteCampaigns(request);
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
    	return new FixedBid(){{ setBid(new Bid(){{ setAmount(bidAmount); }}); }};
     }

     // Get the ad group's criterion.
     
     static ArrayOfAdGroupCriterion getAdGroupCriterions(
   		 final long ACCOUNT_ID, 
		 final long ADGROUP_ID, 
    	 final CriterionType criterionType) throws RemoteException, Exception
     {
    	 GetAdGroupCriterionsByAdGroupIdRequest request = new GetAdGroupCriterionsByAdGroupIdRequest(){{
    		 accountId = ACCOUNT_ID;
    		 adGroupId = ADGROUP_ID;
    		 criterionTypeFilter = new ArrayList<CriterionType>(){{
    			 add(criterionType);
    		 }};
    	 }};
    	 
          return CampaignService.getService().getAdGroupCriterionsByAdGroupId(request).getAdGroupCriterions();
     }
     
     // Adds, updates, or deletes criterion for the ad group. 
     // All actions must be for the same ad group.
     
     static ApplyProductPartitionActionsResponse applyPartitionActions(
    		 final ArrayOfAdGroupCriterionAction ACTIONS) throws RemoteException, Exception
     {
    	 ApplyProductPartitionActionsRequest request = new ApplyProductPartitionActionsRequest(){{
    		 criterionActions = ACTIONS;
    	 }};

         return CampaignService.getService().applyProductPartitionActions(request);
     }
     
     // Adds a criterion action to the list of actions.
     
     static void addPartitionAction(final AdGroupCriterion CRITERION, final ItemAction ITEM_ACTION)
     {
    	 AdGroupCriterionAction partitionAction = new AdGroupCriterionAction(){{
    		 action = ITEM_ACTION;
    		 adGroupCriterion = CRITERION;
    	 }};

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
    			 node.getId());
    	 
    	 if (criterion.getPartitionType() == ProductPartitionType.UNIT)
    	 {
    		 if (node instanceof BiddableAdGroupCriterion)
    		 {
    	    	 System.out.printf("%" + ((treeLevel > 0) ? treeLevel * 4 : "") + "s%s%.2f\n",
    	    			 "",
    	    			 "Bid amount: ", 
    	    			 ((FixedBid)((BiddableAdGroupCriterion)node).getCriterionBid()).getBid().getAmount());
    			 
    		 }
    		 else
    		 {
    			 if (node instanceof NegativeAdGroupCriterion)
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
             System.out.printf("Successfully added Campaign, %d\n\n", id);
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
             System.out.printf("Successfully added Ad Group, %d\n\n", id);
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
        		 
        		 System.out.printf("Successfully added a product ad with ID, %d\n\n", 
        				 adIds.getLongs().get(i));
        	 }
        	 else
        	 {
        		 System.out.printf("Failed to add product ad at index, %d\n\n", i);
        		 
        		 BatchError error = partialErrors.getBatchErrors().get(i);
        		 
        		 System.out.printf("\tIndex: %d\n", error.getIndex());
        		 System.out.printf("\tCode: %d\n", error.getCode());
        		 System.out.printf("\tErrorCode: %s\n", error.getErrorCode());
        		 System.out.printf("\tMessage: %s\n", error.getMessage());
        		 
        		 // If the error is an editorial error, get more details.
        		 
        		 if (error.getType() == "EditorialError" && error.getErrorCode() == "CampaignServiceEditorialValidationError")
        		 {
            		 System.out.printf("\tDisapprovedText: %s\n", ((EditorialError)error).getDisapprovedText());
            		 System.out.printf("\tLocation: %s\n", ((EditorialError)error).getLocation());
            		 System.out.printf("\tPublisherCountry: %s\n", ((EditorialError)error).getPublisherCountry());
            		 System.out.printf("\tReasonCode: %s\n", ((EditorialError)error).getReasonCode());
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
        		 System.out.printf("Successfully added criterion with ID, %d\n\n", 
        				 criterionIds.getLongs().get(i));
        	 }
        	 else
        	 {
        		 System.out.printf("Failed to add criterion at index, %d\n\n", 
        				 i);
        		 
        		 BatchError error = partialErrors.getBatchErrors().get(i);
        		 
        		 System.out.printf("\tIndex: %d\n", error.getIndex());
        		 System.out.printf("\tCode: %d\n", error.getCode());
        		 System.out.printf("\tErrorCode: %s\n", error.getErrorCode());
        		 System.out.printf("\tMessage: %s\n", error.getMessage());
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
        		 System.out.printf("Successfully added campaign criterion with ID, %d\n\n", 
        				 criterionIds.getLongs().get(i));
        	 }
        	 else
        	 {
        		 System.out.printf("Failed to add campaign criterion at index, %d\n\n", i);
        		 
        		 BatchErrorCollection error = partialErrors.getBatchErrorCollections().get(i);
        		 
        		 System.out.printf("\tIndex: %d\n", error.getIndex());
        		 System.out.printf("\tCode: %d\n", error.getCode());
        		 System.out.printf("\tErrorCode: %s\n", error.getErrorCode());
        		 System.out.printf("\tMessage: %s\n", error.getMessage());
        		 
        		 if (error.getBatchErrors() != null)
        		 {        		 
	        		 for (BatchError batchError : error.getBatchErrors().getBatchErrors())
	        		 {
	            		 System.out.printf("\tIndex: %d\n", batchError.getIndex());
	            		 System.out.printf("\tCode: %d\n", batchError.getCode());
	            		 System.out.printf("\tErrorCode: %s\n", batchError.getErrorCode());
	            		 System.out.printf("\tMessage: %s\n\n", batchError.getMessage());
	        		 }
        		 }
        	 }
         }
     }

}


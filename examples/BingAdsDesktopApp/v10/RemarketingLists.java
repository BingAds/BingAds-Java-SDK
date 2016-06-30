package com.microsoft.bingads.examples.v10;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import static com.microsoft.bingads.examples.v10.ExampleBase.outputCampaignsWithPartialErrors;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class RemarketingLists extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
    /*
	private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */

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
                        ApiEnvironment.SANDBOX,
                        ICampaignManagementService.class);

            // To discover all remarketing lists that the user can associate with ad groups in the current account (per CustomerAccountId header), 
            // set RemarketingListIds to null when calling the GetRemarketingLists operation.

            ArrayOfRemarketingList remarketingLists = getRemarketingLists(null).getRemarketingLists();

            // You must already have at least one remarketing list for the remainder of this example. 
            // The Bing Ads API does not support remarketing list add, update, or delete operations.

            if (remarketingLists.getRemarketingLists() == null || remarketingLists.getRemarketingLists().size() < 1)
            {
                outputStatusMessage("You do not have any remarketing lists that the current user can associate with ad groups.\n");
                return;
            }
                
            // Add an ad group in a campaign. The ad group will later be associated with remarketing lists. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Summer shoes line.");
            campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
            campaign.setMonthlyBudget(1000.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaign.setDaylightSaving(true);	 
            campaigns.getCampaigns().add(campaign);
            
            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Women's Red Shoes");
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
            Bid searchBid = new Bid();
            searchBid.setAmount(0.09);
            adGroup.setSearchBid(searchBid);
            adGroup.setLanguage("English");

            // Applicable for all remarketing lists that are associated with this ad group. TARGET_AND_BID indicates 
            // that you want to show ads only to people included in the remarketing list, with the option to change
            // the bid amount. Ads in this ad group will only show to people included in the remarketing list.
            adGroup.setRemarketingTargetingSetting(RemarketingTargetingSetting.TARGET_AND_BID);

            adGroups.getAdGroups().add(adGroup);

            
            // Add the campaign, ad group, keywords, and ads

            AddCampaignsResponse addCampaignsResponse = addCampaigns(AccountId, campaigns);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputCampaignsWithPartialErrors(campaigns, campaignIds, campaignErrors);
            
            AddAdGroupsResponse addAdGroupsResponse = addAdGroups(campaignIds.getLongs().get(0), adGroups);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputAdGroupsWithPartialErrors(adGroups, adGroupIds, adGroupErrors);
            

            // If the campaign or ad group add operations failed then we cannot continue this example. 

            if (addAdGroupsResponse.getAdGroupIds() == null || addAdGroupsResponse.getAdGroupIds().getLongs().size() < 1)
            {
                return;
            }

            ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociations = new ArrayOfAdGroupRemarketingListAssociation();

            // This example associates all of the remarketing lists with the new ad group.

            for (RemarketingList remarketingList : remarketingLists.getRemarketingLists())
            {
                if (remarketingList.getId() != null)
                {
                    AdGroupRemarketingListAssociation adGroupRemarketingListAssociation = new AdGroupRemarketingListAssociation();
                    adGroupRemarketingListAssociation.setAdGroupId(adGroupIds.getLongs().get(0));
                    adGroupRemarketingListAssociation.setBidAdjustment(20.00);
                    adGroupRemarketingListAssociation.setRemarketingListId(remarketingList.getId());
                    adGroupRemarketingListAssociation.setStatus(AdGroupRemarketingListAssociationStatus.PAUSED);
                    
                    adGroupRemarketingListAssociations.getAdGroupRemarketingListAssociations().add(adGroupRemarketingListAssociation);

                    outputStatusMessage("\nAssociating the following remarketing list with the ad group.\n");
                    outputRemarketingList(remarketingList);
                }
            }

            AddAdGroupRemarketingListAssociationsResponse addAdGroupRemarketingListAssociationsResponse = addAdGroupRemarketingListAssociations(adGroupRemarketingListAssociations);

            ArrayOflong passAdGroupIds = new ArrayOflong();
            passAdGroupIds.getLongs().add(adGroupIds.getLongs().get(0));
            GetAdGroupRemarketingListAssociationsResponse getAdGroupRemarketingListAssociationsResponse = getAdGroupRemarketingListAssociations(passAdGroupIds);

            for (AdGroupRemarketingListAssociation adGroupRemarketingListAssociation : 
                    getAdGroupRemarketingListAssociationsResponse.getAdGroupRemarketingListAssociations().getAdGroupRemarketingListAssociations())
            {
                outputStatusMessage("\nThe following ad group remarketing list association was added.\n");
                outputAdGroupRemarketingListAssociation(adGroupRemarketingListAssociation);
            }

            // You can store the association IDs which can be used to update or delete associations later. 

            ArrayOfNullableOflong associationIds = addAdGroupRemarketingListAssociationsResponse.getAssociationIds();

            // If the associations were added and retrieved successfully let's practice updating and deleting one of them.

            if (associationIds.getLongs() != null && associationIds.getLongs().size() > 0)
            {
                ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociationsUpdates = new ArrayOfAdGroupRemarketingListAssociation();
                AdGroupRemarketingListAssociation adGroupRemarketingListAssociationUpdate = new AdGroupRemarketingListAssociation();
                adGroupRemarketingListAssociationUpdate.setAdGroupId(adGroupIds.getLongs().get(0));
                adGroupRemarketingListAssociationUpdate.setBidAdjustment(10.00);
                adGroupRemarketingListAssociationUpdate.setId(associationIds.getLongs().get(0));
                adGroupRemarketingListAssociationUpdate.setStatus(AdGroupRemarketingListAssociationStatus.ACTIVE);
                adGroupRemarketingListAssociationsUpdates.getAdGroupRemarketingListAssociations().add(adGroupRemarketingListAssociationUpdate);

                updateAdGroupRemarketingListAssociations(adGroupRemarketingListAssociationsUpdates);

                deleteAdGroupRemarketingListAssociations(adGroupRemarketingListAssociationsUpdates);
            }

            // Delete the campaign, ad group, and ad group remarketing list associations that were previously added. 
            // The remarketing lists will not be deleted.
            // You should remove this line if you want to view the added entities in the 
            // Bing Ads web application or another tool.

            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            deleteCampaigns(AccountId, deleteCampaignIds);
            System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));

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

    // Adds one or more campaigns to the specified account.

    static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
    {
        AddCampaignsRequest request = new AddCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);

        return CampaignService.getService().addCampaigns(request);
    }
     
    // Deletes one or more campaigns from the specified account.

    static void deleteCampaigns(long accountId, ArrayOflong campaignIds) throws RemoteException, Exception
    {
        DeleteCampaignsRequest request = new DeleteCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        CampaignService.getService().deleteCampaigns(request);
    }
    
    // Adds one or more ad groups to the specified campaign.

    static AddAdGroupsResponse addAdGroups(
            long campaignId, 
            ArrayOfAdGroup adGroups) throws RemoteException, Exception
    {
        AddAdGroupsRequest request = new AddAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroups(adGroups);

        return CampaignService.getService().addAdGroups(request);
    }
     
    // Retrieves remarketing lists. If RemarketingListIds is null or empty,
    // the service will return all remarketing lists that the current authenticated user can access.

    static GetRemarketingListsResponse getRemarketingLists(
            ArrayOflong remarketingListIds) throws RemoteException, Exception
    {
        GetRemarketingListsRequest request = new GetRemarketingListsRequest();

        request.setRemarketingListIds(remarketingListIds);

        return CampaignService.getService().getRemarketingLists(request);
    }
    
    // Associates the specified ad groups with the respective remarketing lists.

    static AddAdGroupRemarketingListAssociationsResponse addAdGroupRemarketingListAssociations(
            ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociations) throws RemoteException, Exception
    {
        AddAdGroupRemarketingListAssociationsRequest request = new AddAdGroupRemarketingListAssociationsRequest();

        request.setAdGroupRemarketingListAssociations(adGroupRemarketingListAssociations);

        return CampaignService.getService().addAdGroupRemarketingListAssociations(request);
    }

    // Deletes one or more ad group remarketing list associations.

    static DeleteAdGroupRemarketingListAssociationsResponse deleteAdGroupRemarketingListAssociations(
            ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociations) throws RemoteException, Exception
    {
        DeleteAdGroupRemarketingListAssociationsRequest request = new DeleteAdGroupRemarketingListAssociationsRequest();

        request.setAdGroupRemarketingListAssociations(adGroupRemarketingListAssociations);

        return CampaignService.getService().deleteAdGroupRemarketingListAssociations(request);
    }

    // Gets the ad group remarketing list associations.

    static GetAdGroupRemarketingListAssociationsResponse getAdGroupRemarketingListAssociations(
            ArrayOflong adGroupIds) throws RemoteException, Exception
    {
        GetAdGroupRemarketingListAssociationsRequest request = new GetAdGroupRemarketingListAssociationsRequest();

        request.setAdGroupIds(adGroupIds);

        return CampaignService.getService().getAdGroupRemarketingListAssociations(request);
    }

    // Updates one or more ad group remarketing list associations.

    static UpdateAdGroupRemarketingListAssociationsResponse updateAdGroupRemarketingListAssociations(
            ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociations) throws RemoteException, Exception
    {
        UpdateAdGroupRemarketingListAssociationsRequest request = new UpdateAdGroupRemarketingListAssociationsRequest();

        request.setAdGroupRemarketingListAssociations(adGroupRemarketingListAssociations);

        return CampaignService.getService().updateAdGroupRemarketingListAssociations(request);
    }
 }
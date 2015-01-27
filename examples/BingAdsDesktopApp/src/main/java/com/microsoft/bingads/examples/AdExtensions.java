package com.microsoft.bingads.examples;

import java.rmi.*;
import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.*;

public class AdExtensions {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;

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
             
             // Specify one or more campaigns.

             ArrayOfCampaign campaigns = new ArrayOfCampaign();
             Campaign campaign = new Campaign();
             campaign.setName("Winter Clothing " + System.currentTimeMillis());
             campaign.setDescription("Winter clothing line.");
             campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
             campaign.setMonthlyBudget(1000.00);
             campaign.setTimeZone("PacificTimeUSCanadaTijuana");
             campaign.setDaylightSaving(true);
             campaigns.getCampaigns().add(campaign);
             
             ArrayOflong campaignIds = addCampaigns(AccountId, campaigns);
             printCampaignIdentifiers(campaignIds);
             
             // Specify the extensions.

             ArrayOfAdExtension adExtensions = new ArrayOfAdExtension();

             CallAdExtension callAdExtension = new CallAdExtension();
             callAdExtension.setCountryCode("US");
             callAdExtension.setPhoneNumber("2065550100");
             callAdExtension.setIsCallOnly(false);
             adExtensions.getAdExtensions().add(callAdExtension);

             LocationAdExtension locationAdExtension = new LocationAdExtension();
             locationAdExtension.setPhoneNumber("206-555-0100");
             locationAdExtension.setCompanyName("Alpine Ski House");
             locationAdExtension.setIconMediaId(null); 
             locationAdExtension.setImageMediaId(null);
             Address address = new Address();
             address.setStreetAddress("1234 Washington Place");
             address.setStreetAddress2("Suite 1210");
             address.setCityName("Woodinville");
             address.setProvinceName("WA"); 
             address.setCountryCode("US");
             address.setPostalCode("98608");
             locationAdExtension.setAddress(address);
             adExtensions.getAdExtensions().add(locationAdExtension);
             
             SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
             ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();
             SiteLink siteLink = new SiteLink();
             siteLink.setDestinationUrl("AplineSkiHouse.com/WinterGloveSale");
             siteLink.setDisplayText("Winter Glove Sale");
             siteLinks.getSiteLinks().add(siteLink);
             siteLinksAdExtension.setSiteLinks(siteLinks);
             adExtensions.getAdExtensions().add(siteLinksAdExtension);

             // Add all extensions to the account's ad extension library
             ArrayOfAdExtensionIdentity adExtensionIdentities = addAdExtensions(
                 AccountId,
                 adExtensions
                 );
             
             System.out.printf("Added ad extensions.\n");

             // DeleteAdExtensionsAssociations, SetAdExtensionsAssociations, and GetAdExtensionsEditorialReasons 
             // operations each require a list of type AdExtensionIdToEntityIdAssociation.
             ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations = new ArrayOfAdExtensionIdToEntityIdAssociation();

             // GetAdExtensionsByIds requires a list of type long.
             ArrayOflong adExtensionIds = new ArrayOflong();
             
             // Loop through the list of extension IDs and build any required data structures
             // for subsequent operations. 

             for (AdExtensionIdentity adExtensionIdentity : adExtensionIdentities.getAdExtensionIdentities()) {
            	 AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            	 adExtensionIdToEntityIdAssociation.setAdExtensionId(adExtensionIdentity.getId());
            	 adExtensionIdToEntityIdAssociation.setEntityId(campaignIds.getLongs().get(0));
            	 adExtensionIdToEntityIdAssociations.getAdExtensionIdToEntityIdAssociations().add(adExtensionIdToEntityIdAssociation);
                 
                 adExtensionIds.getLongs().add(adExtensionIdentity.getId());
             }
                          
             // Associate the specified ad extensions with the respective campaigns or ad groups. 
             setAdExtensionsAssociations(
                 AccountId, 
                 adExtensionIdToEntityIdAssociations, 
                 AssociationType.CAMPAIGN
                 );
             
             System.out.printf("Set ad extension associations.\n");

             // Get editorial rejection reasons for the respective ad extension and entity associations.
             ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection = getAdExtensionsEditorialReasons(
                 AccountId, 
                 adExtensionIdToEntityIdAssociations, 
                 AssociationType.CAMPAIGN
                 );

             ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.SITE_LINKS_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALL_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
                   
             // Get the specified ad extensions from the account’s ad extension library.
             adExtensions = getAdExtensionsByIds(
                 AccountId,
                 adExtensionIds, 
                 adExtensionsTypeFilter
                 );

             int index = 0;                     
             
             for (AdExtension extension : adExtensions.getAdExtensions())
             {
                 if (extension == null || extension.getId() == null)
                 {
                     System.out.println("Extension is null or invalid.");
                 }
                 else
                 {
                     System.out.println("Ad extension ID: " + extension.getId());
                     System.out.println("Ad extension Type: " + extension.getType());

                     if (extension instanceof CallAdExtension)
                     {
                         System.out.println("Phone number: " + ((CallAdExtension)extension).getPhoneNumber());
                         System.out.println("Country: " + ((CallAdExtension)extension).getCountryCode());
                         System.out.println("Is only clickable item: " + ((CallAdExtension)extension).getIsCallOnly());
                         System.out.println();
                     }
                     else if (extension instanceof LocationAdExtension)
                     {
                         System.out.println("Company name: " + ((LocationAdExtension)extension).getCompanyName());
                         System.out.println("Phone number: " + ((LocationAdExtension)extension).getPhoneNumber());
                         System.out.println("Street: " + ((LocationAdExtension)extension).getAddress().getStreetAddress());
                         System.out.println("City: " + ((LocationAdExtension)extension).getAddress().getCityName());
                         System.out.println("State: " + ((LocationAdExtension)extension).getAddress().getProvinceName());
                         System.out.println("Country: " + ((LocationAdExtension)extension).getAddress().getCountryCode());
                         System.out.println("Zip code: " + ((LocationAdExtension)extension).getAddress().getPostalCode());
                         System.out.println("Business coordinates determined?: " + ((LocationAdExtension)extension).getGeoCodeStatus());
                         System.out.println("Map icon ID: " + ((LocationAdExtension)extension).getIconMediaId());
                         System.out.println("Business image ID: " + ((LocationAdExtension)extension).getImageMediaId());
                         System.out.println();
                     }
                     else if (extension instanceof SiteLinksAdExtension)
                     {
                         for (SiteLink sLink : ((SiteLinksAdExtension)extension).getSiteLinks().getSiteLinks())
                         {
                             System.out.println("  Display URL: " + sLink.getDisplayText());
                             System.out.println("  Destination URL: " + sLink.getDestinationUrl());
                             System.out.println();
                         }
                     }
                     else
                     {
                         System.out.println("  Unknown extension type");
                     }
                     
                     if (adExtensionEditorialReasonCollection != null 
                             && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().size() > 0
                             && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index) != null)
                     {
                    	 System.out.println();
                         
                         // Print any editorial rejection reasons for the corresponding extension. This sample 
                         // assumes the same list index for adExtensions and adExtensionEditorialReasonCollection
                         // as defined above.

                         for (AdExtensionEditorialReason adExtensionEditorialReason : 
                        	 adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index).getReasons().getAdExtensionEditorialReasons())
                         {
                             if (adExtensionEditorialReason != null &&
                                 adExtensionEditorialReason.getPublisherCountries() != null)
                             {
                            	 System.out.println("Editorial Rejection Location: " + adExtensionEditorialReason.getLocation());
                            	 System.out.println("Editorial Rejection PublisherCountries: ");
                                 for (java.lang.String publisherCountry : adExtensionEditorialReason.getPublisherCountries().getStrings())
                                 {
                                	 System.out.println("  " + publisherCountry);
                                 }
                                 System.out.println("Editorial Rejection ReasonCode: " + adExtensionEditorialReason.getReasonCode());
                                 System.out.println("Editorial Rejection Term: " + adExtensionEditorialReason.getTerm());
                                 System.out.println();
                             }
                         }
                     }

                 }

                 System.out.println();
                 
                 index++;
             }
             
             // Remove the specified associations from the respective campaigns or ad groups. 
             // The extesions are still available in the account's extensions library. 
             deleteAdExtensionsAssociations(
                 AccountId,
                 adExtensionIdToEntityIdAssociations,
                 AssociationType.CAMPAIGN
                 );
             
             System.out.printf("Deleted ad extension associations.\n");

             // Deletes the ad extensions from the account’s ad extension library.
             deleteAdExtensions(
                 AccountId,
                 adExtensionIds
                 );
             
             System.out.printf("Deleted ad extensions.\n");
             
             // Delete the campaign from the account.

             deleteCampaigns(AccountId, campaignIds);
             System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));
             
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
             // Ignore fault exceptions that we already caught.

             if ( ex.getCause() instanceof AdApiFaultDetail_Exception ||
            	  ex.getCause() instanceof EditorialApiFaultDetail_Exception ||
                  ex.getCause() instanceof ApiFaultDetail_Exception )
             {
                 ;
             }
             else
             {
                 System.out.println("Error encountered: ");
                 System.out.println(ex.getMessage());
                 ex.printStackTrace();
             }
         }
     }
     
     // Adds one or more campaigns to the specified account.

     static ArrayOflong addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
     {
         AddCampaignsRequest request = new AddCampaignsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setCampaigns(campaigns);

         return CampaignService.getService().addCampaigns(request).getCampaignIds();
     }
     
     // Deletes one or more campaigns from the specified account.

     static void deleteCampaigns(long accountId, ArrayOflong campaignIds) throws RemoteException, Exception
     {
    	 DeleteCampaignsRequest request = new DeleteCampaignsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setCampaignIds(campaignIds);

         CampaignService.getService().deleteCampaigns(request);
     }

     // Adds one or more ad extensions to the account's ad extension library.

     static ArrayOfAdExtensionIdentity addAdExtensions(long accountId, ArrayOfAdExtension adExtensions) throws RemoteException, Exception
     {
         AddAdExtensionsRequest request = new AddAdExtensionsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensions(adExtensions);

         return CampaignService.getService().addAdExtensions(request).getAdExtensionIdentities();
     }
     
     // Deletes one or more ad extensions from the account’s ad extension library.

     static void deleteAdExtensions(long accountId, ArrayOflong adExtensionIds) throws RemoteException, Exception
     {
    	 DeleteAdExtensionsRequest request = new DeleteAdExtensionsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensionIds(adExtensionIds);

         CampaignService.getService().deleteAdExtensions(request);
     }
     
     // Associates one or more extensions with the corresponding campaign or ad group entities.

     static void setAdExtensionsAssociations(long accountId, ArrayOfAdExtensionIdToEntityIdAssociation associations, AssociationType associationType) throws RemoteException, Exception
     {
    	 SetAdExtensionsAssociationsRequest request = new SetAdExtensionsAssociationsRequest();
         
    	 // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensionIdToEntityIdAssociations(associations);
         request.setAssociationType(associationType);

         CampaignService.getService().setAdExtensionsAssociations(request);
     }
     
     // Removes the specified association from the respective campaigns or ad groups.

     static void deleteAdExtensionsAssociations(long accountId, ArrayOfAdExtensionIdToEntityIdAssociation associations, AssociationType associationType) throws RemoteException, Exception
     {
    	 DeleteAdExtensionsAssociationsRequest request = new DeleteAdExtensionsAssociationsRequest();
         
    	 // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensionIdToEntityIdAssociations(associations);
         request.setAssociationType(associationType);

         CampaignService.getService().deleteAdExtensionsAssociations(request);
     }

     // Gets the specified ad extensions from the account's extension library.

     static ArrayOfAdExtension getAdExtensionsByIds(long accountId, ArrayOflong adExtensionIds, ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter) throws RemoteException, Exception
     {
         GetAdExtensionsByIdsRequest request = new GetAdExtensionsByIdsRequest();

         // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensionIds(adExtensionIds);
         request.setAdExtensionType(adExtensionsTypeFilter);

         return CampaignService.getService().getAdExtensionsByIds(request).getAdExtensions();
     }

     // Gets the reasons why the specified extension failed editorial when 
     // in the context of an associated campaign or ad group.

     private static ArrayOfAdExtensionEditorialReasonCollection getAdExtensionsEditorialReasons(
         long accountId,
         ArrayOfAdExtensionIdToEntityIdAssociation associations,
         AssociationType associationType)  throws RemoteException, Exception
     {
    	 GetAdExtensionsEditorialReasonsRequest request = new GetAdExtensionsEditorialReasonsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setAdExtensionIdToEntityIdAssociations(associations);
         request.setAssociationType(associationType);
         
         return CampaignService.getService().getAdExtensionsEditorialReasons(request).getEditorialReasons();
     }     
     
     // Prints the campaign identifiers for each campaign added. 

     static void printCampaignIdentifiers(ArrayOflong campaignIds)
     {
         if (campaignIds == null)
         {
             return;
         }

         for (long id : campaignIds.getLongs())
         {
             System.out.printf("Campaign successfully added and assigned CampaignId %d\n\n", id);
         }
     }
 }
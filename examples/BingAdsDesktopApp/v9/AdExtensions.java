package com.microsoft.bingads.examples.v9;

import java.rmi.*;
import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.*;

public class AdExtensions extends ExampleBaseV9 {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    
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
             
             AppAdExtension appAdExtension = new AppAdExtension();
             appAdExtension.setAppPlatform("Windows");
             appAdExtension.setAppStoreId("AppStoreIdGoesHere");
             appAdExtension.setDestinationUrl("DestinationUrlGoesHere");
             appAdExtension.setDisplayText("Contoso");
             adExtensions.getAdExtensions().add(appAdExtension);

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
             
             outputStatusMessage("Added ad extensions.\n");

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
             
             outputStatusMessage("Set ad extension associations.\n");

             // Get editorial rejection reasons for the respective ad extension and entity associations.
             ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection = getAdExtensionsEditorialReasons(
                 AccountId, 
                 adExtensionIdToEntityIdAssociations, 
                 AssociationType.CAMPAIGN
                 );

             ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.APP_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALL_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.SITE_LINKS_AD_EXTENSION);
                   
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
                     outputStatusMessage("Extension is null or invalid.");
                 }
                 else
                 {
                	 outputStatusMessage(String.format("Ad extension ID: %s\n", extension.getId()));
                	 outputStatusMessage(String.format("Ad extension Type: %s\n", extension.getType()));

                     if (extension instanceof AppAdExtension)
                     {
                    	 outputStatusMessage(String.format("AppPlatform: %s\n", ((AppAdExtension)extension).getAppPlatform()));
                    	 outputStatusMessage(String.format("AppStoreId: %s\n", ((AppAdExtension)extension).getAppStoreId()));
                    	 outputStatusMessage(String.format("DestinationUrl: %s\n", ((AppAdExtension)extension).getDestinationUrl()));
                    	 outputStatusMessage(String.format("DevicePreference: %s\n", ((AppAdExtension)extension).getDevicePreference()));
                    	 outputStatusMessage(String.format("DisplayText: %s\n", ((AppAdExtension)extension).getDisplayText()));
                    	 outputStatusMessage(String.format("Id: %s\n", ((AppAdExtension)extension).getId()));
                    	 outputStatusMessage(String.format("Status: %s\n", ((AppAdExtension)extension).getStatus()));
                    	 outputStatusMessage(String.format("Version: %s\n", ((AppAdExtension)extension).getVersion()));
                     }
                     else if (extension instanceof CallAdExtension)
                     {
                         outputStatusMessage(String.format("Phone number: %s\n", ((CallAdExtension)extension).getPhoneNumber()));
                         outputStatusMessage(String.format("Country: %s\n", ((CallAdExtension)extension).getCountryCode()));
                         outputStatusMessage(String.format("Is only clickable item: %s\n", ((CallAdExtension)extension).getIsCallOnly()));
                     }
                     else if (extension instanceof LocationAdExtension)
                     {
						if(((LocationAdExtension)extension).getAddress() != null){
							outputStatusMessage(String.format("Street: %s\n", ((LocationAdExtension)extension).getAddress().getStreetAddress()));
							outputStatusMessage(String.format("City: %s\n", ((LocationAdExtension)extension).getAddress().getCityName()));
							outputStatusMessage(String.format("State: %s\n", ((LocationAdExtension)extension).getAddress().getProvinceName()));
							outputStatusMessage(String.format("Country: %s\n", ((LocationAdExtension)extension).getAddress().getCountryCode()));
							outputStatusMessage(String.format("Zip code: %s\n", ((LocationAdExtension)extension).getAddress().getPostalCode()));
						}
						outputStatusMessage(String.format("Company name: %s\n", ((LocationAdExtension)extension).getCompanyName()));
						outputStatusMessage(String.format("Phone number: %s\n", ((LocationAdExtension)extension).getPhoneNumber()));
						outputStatusMessage(String.format("Business coordinates determined?: %s\n", ((LocationAdExtension)extension).getGeoCodeStatus()));
						if(((LocationAdExtension)extension).getGeoPoint() != null){
							outputStatusMessage("GeoPoint: ");
							outputStatusMessage(String.format("LatitudeInMicroDegrees: %s\n", 
									((LocationAdExtension)extension).getGeoPoint().getLatitudeInMicroDegrees()));
							outputStatusMessage(String.format("LongitudeInMicroDegrees: %s\n", 
							 		((LocationAdExtension)extension).getGeoPoint().getLongitudeInMicroDegrees()));
						}
						outputStatusMessage(String.format("Map icon ID: %s\n", ((LocationAdExtension)extension).getIconMediaId()));
						outputStatusMessage(String.format("Business image ID: %s\n", ((LocationAdExtension)extension).getImageMediaId()));
                     }
                     else if (extension instanceof SiteLinksAdExtension)
                     {
                         for (SiteLink sLink : ((SiteLinksAdExtension)extension).getSiteLinks().getSiteLinks())
                         {
                             outputStatusMessage(String.format("  Display URL: %s\n", sLink.getDisplayText()));
                             outputStatusMessage(String.format("  Destination URL: %s\n", sLink.getDestinationUrl()));
                         }
                     }
                     else
                     {
                    	 outputStatusMessage("  Unknown extension type");
                     }
                     
                     if (adExtensionEditorialReasonCollection != null 
                             && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().size() > 0
                             && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index) != null)
                     {
                    	 outputStatusMessage("\n");
                         
                         // Print any editorial rejection reasons for the corresponding extension. This sample 
                         // assumes the same list index for adExtensions and adExtensionEditorialReasonCollection
                         // as defined above.

                         for (AdExtensionEditorialReason adExtensionEditorialReason : 
                        	 adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index).getReasons().getAdExtensionEditorialReasons())
                         {
                             if (adExtensionEditorialReason != null &&
                                 adExtensionEditorialReason.getPublisherCountries() != null)
                             {
                            	 outputStatusMessage("Editorial Rejection Location: " + adExtensionEditorialReason.getLocation());
                            	 outputStatusMessage("Editorial Rejection PublisherCountries: ");
                                 for (java.lang.String publisherCountry : adExtensionEditorialReason.getPublisherCountries().getStrings())
                                 {
                                	 outputStatusMessage("  " + publisherCountry);
                                 }
                                 outputStatusMessage("Editorial Rejection ReasonCode: " + adExtensionEditorialReason.getReasonCode());
                                 outputStatusMessage("Editorial Rejection Term: " + adExtensionEditorialReason.getTerm());
                                 outputStatusMessage("\n");
                             }
                         }
                     }

                 }

                 outputStatusMessage("\n");
                 
                 index++;
             }
             
             // Remove the specified associations from the respective campaigns or ad groups. 
             // The extensions are still available in the account's extensions library. 
             deleteAdExtensionsAssociations(
                 AccountId,
                 adExtensionIdToEntityIdAssociations,
                 AssociationType.CAMPAIGN
                 );
             
             outputStatusMessage("Deleted ad extension associations.\n");

             // Deletes the ad extensions from the account’s ad extension library.
             deleteAdExtensions(
                 AccountId,
                 adExtensionIds
                 );
             
             outputStatusMessage("Deleted ad extensions.\n");
             
             // Delete the campaign from the account.

             deleteCampaigns(AccountId, campaignIds);
             outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
             
         // Campaign Management service operations can throw AdApiFaultDetail.
         } catch (AdApiFaultDetail_Exception ex) {
             outputStatusMessage("The operation failed with the following faults:\n");

             for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
             {
                 outputStatusMessage("AdApiError\n");
                 outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
                		 error.getCode(), error.getErrorCode(), error.getMessage()));
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
                 outputStatusMessage(String.format("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", 
                		 error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry()));
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
             outputStatusMessage(String.format("Campaign successfully added and assigned CampaignId %d\n\n", id));
         }
     }
 }
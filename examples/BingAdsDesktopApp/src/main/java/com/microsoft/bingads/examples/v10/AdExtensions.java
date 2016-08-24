package com.microsoft.bingads.examples.v10;

import java.rmi.*;
import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class AdExtensions extends ExampleBase {

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
                     	ICampaignManagementService.class);
             
             // Specify one or more campaigns.

             ArrayOfCampaign campaigns = new ArrayOfCampaign();
             Campaign campaign = new Campaign();
             campaign.setName("Summer Shoes " + System.currentTimeMillis());
             campaign.setDescription("Summer shoes line.");
             campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
             campaign.setMonthlyBudget(1000.00);
             campaign.setTimeZone("PacificTimeUSCanadaTijuana");
             campaign.setDaylightSaving(true);
             
             // Used with FinalUrls shown in the sitelinks that we will add below.
             campaign.setTrackingUrlTemplate(
            		 "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");
             
             campaigns.getCampaigns().add(campaign);
             
             AddCampaignsResponse addCampaignsResponse = addCampaigns(AccountId, campaigns);
             ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
             ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
             outputCampaignsWithPartialErrors(campaigns, campaignIds, campaignErrors);
             
             // Specify the extensions.

             ArrayOfAdExtension adExtensions = new ArrayOfAdExtension();
             
             AppAdExtension appAdExtension = new AppAdExtension();
             appAdExtension.setAppPlatform("Windows");
             appAdExtension.setAppStoreId("AppStoreIdGoesHere");
             appAdExtension.setDestinationUrl("DestinationUrlGoesHere");
             appAdExtension.setDisplayText("Contoso");
             // If you supply the AppAdExtension properties above, then you can add this line.
             //adExtensions.getAdExtensions().add(appAdExtension);

             CallAdExtension callAdExtension = new CallAdExtension();
             callAdExtension.setCountryCode("US");
             callAdExtension.setPhoneNumber("2065550100");
             callAdExtension.setIsCallOnly(false);
             adExtensions.getAdExtensions().add(callAdExtension);
             
             CalloutAdExtension calloutAdExtension = new CalloutAdExtension();
 			 calloutAdExtension.setText("Callout text");
 			 adExtensions.getAdExtensions().add(calloutAdExtension);

             LocationAdExtension locationAdExtension = new LocationAdExtension();
             locationAdExtension.setPhoneNumber("206-555-0100");
             locationAdExtension.setCompanyName("Contoso Shoes");
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
             
             ReviewAdExtension reviewAdExtension = new ReviewAdExtension();
 			 reviewAdExtension.setIsExact(true);
 			 reviewAdExtension.setSource("Review Source Name");
 			 reviewAdExtension.setText("Review Text");
 			 // The Url of the third-party review. This is not your business Url.
 			 reviewAdExtension.setUrl("http://review.contoso.com"); 
 			 adExtensions.getAdExtensions().add(reviewAdExtension);
             
             SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
             ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();
             
             for(int i=0; i < 2; i++){
            	 SiteLink siteLink = new SiteLink();
                 siteLink.setDisplayText("Women's Shoe Sale " + (i+1));
                 
                 // If you are currently using the Destination URL, you must upgrade to Final URLs. 
                 // Here is an example of a DestinationUrl you might have used previously. 
                 // siteLink.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

                 // To migrate from DestinationUrl to FinalUrls for existing sitelinks, you can set DestinationUrl
                 // to an empty string when updating the sitelink. If you are removing DestinationUrl,
                 // then FinalUrls is required.
                 // siteLink.setDestinationUrl("");

                 // With FinalUrls you can separate the tracking template, custom parameters, and 
                 // landing page URLs. 
                 ArrayOfstring finalUrls = new ArrayOfstring();
                 finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
                 siteLink.setFinalUrls(finalUrls);
                 
                 // Final Mobile URLs can also be used if you want to direct the user to a different page 
                 // for mobile devices.
                 ArrayOfstring finalMobileUrls = new ArrayOfstring();
                 finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
                 siteLink.setFinalMobileUrls(finalMobileUrls);
                 
                 // You could use a tracking template which would override the campaign level
                 // tracking template. Tracking templates defined for lower level entities 
                 // override those set for higher level entities.
                 // In this example we are using the campaign level tracking template.
                 siteLink.setTrackingUrlTemplate(null);

                 // Set custom parameters that are specific to this sitelink, 
                 // and can be used by the sitelink, ad group, campaign, or account level tracking template. 
                 // In this example we are using the campaign level tracking template.
                 CustomParameters urlCustomParameters = new CustomParameters();
                 CustomParameter customParameter1 = new CustomParameter();
                 customParameter1.setKey("promoCode");
                 customParameter1.setValue("PROMO" + (i+1));
                 ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
                 customParameters.getCustomParameters().add(customParameter1);
                 CustomParameter customParameter2 = new CustomParameter();
                 customParameter2.setKey("season");
                 customParameter2.setValue("summer");
                 customParameters.getCustomParameters().add(customParameter2);
                 urlCustomParameters.setParameters(customParameters);
                 siteLink.setUrlCustomParameters(urlCustomParameters);
                 
                 siteLinks.getSiteLinks().add(siteLink);
             }
             
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
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALLOUT_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.REVIEW_AD_EXTENSION);
             adExtensionsTypeFilter.add(AdExtensionsTypeFilter.SITE_LINKS_AD_EXTENSION);
                   
             // Get the specified ad extensions from the account�s ad extension library.
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
                	 if (extension instanceof AppAdExtension)
                     {
                		 outputAppAdExtension((AppAdExtension)extension);
                     }
                     else if (extension instanceof CallAdExtension)
                     {
                    	 outputCallAdExtension((CallAdExtension)extension);
                     }
                     else if (extension instanceof CalloutAdExtension)
                     {
                    	 outputCalloutAdExtension((CalloutAdExtension)extension);
                     }
                     else if (extension instanceof LocationAdExtension)
                     {
                    	 outputLocationAdExtension((LocationAdExtension)extension);
                     }
                     else if (extension instanceof ReviewAdExtension)
                     {
                    	 outputReviewAdExtension((ReviewAdExtension)extension);
                     }
                     else if (extension instanceof SiteLinksAdExtension)
                     {
                    	 outputSiteLinksAdExtension((SiteLinksAdExtension)extension);
                     }
                     else
                     {
                    	 outputStatusMessage("Unknown extension type");
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

                 outputStatusMessage("");
                 
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

             // Deletes the ad extensions from the account�s ad extension library.
             deleteAdExtensions(
                 AccountId,
                 adExtensionIds
                 );
             
             outputStatusMessage("Deleted ad extensions.\n");
             
             // Delete the campaign from the account.

             ArrayOflong deleteCampaignIds = new ArrayOflong();
             deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
             deleteCampaigns(AccountId, deleteCampaignIds);
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

     static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
     {
         AddCampaignsRequest request = new AddCampaignsRequest();
         
         // Set the request information.

         request.setAccountId(accountId);
         request.setCampaigns(campaigns);

         return CampaignService.getService().addCampaigns(request);
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
     
     // Deletes one or more ad extensions from the account�s ad extension library.

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
 }
package com.microsoft.bingads.examples;

import java.rmi.*;
import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.*;

public class CreateKeywordsAds {

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

             // Specify a campaign. 

             Campaign campaign = new Campaign();
             campaign.setName("Winter Clothing " + System.currentTimeMillis());
             campaign.setDescription("Winter clothing line.");
             campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
             campaign.setMonthlyBudget(1000.00);
             campaign.setTimeZone("PacificTimeUSCanadaTijuana");
             campaign.setDaylightSaving(true);

             // Specify an ad group. 
            
             AdGroup adGroup = new AdGroup();
             adGroup.setName("Women's Heated Ski Glove Sale");
             ArrayList<AdDistribution> adDistribution = new ArrayList<AdDistribution>();
             adDistribution.add(AdDistribution.SEARCH);
             adGroup.setAdDistribution(adDistribution);
             adGroup.setBiddingModel(BiddingModel.KEYWORD);
             adGroup.setPricingModel(PricingModel.CPC);
             adGroup.setStartDate(null);
             adGroup.setEndDate(new com.microsoft.bingads.campaignmanagement.Date());
             adGroup.getEndDate().setDay(31);
             adGroup.getEndDate().setMonth(12);
             adGroup.getEndDate().setYear(2015);
             Bid exactMatchBid = new Bid();
             exactMatchBid.setAmount(0.09);
             adGroup.setExactMatchBid(exactMatchBid);
             Bid phraseMatchBid = new Bid();
             phraseMatchBid.setAmount(0.07);
             adGroup.setPhraseMatchBid(phraseMatchBid);
             adGroup.setLanguage("English");

             // In this example only the second keyword should succeed. The Text of the first keyword exceeds the limit,
             // and the third keyword is a duplicate of the second keyword. 

             ArrayOfKeyword keywords = new ArrayOfKeyword();

             Keyword keyword1 = new Keyword();
             keyword1.setBid(new Bid());
             keyword1.getBid().setAmount(0.47);
             keyword1.setParam2("10% Off");
             keyword1.setMatchType(MatchType.BROAD);
             keyword1.setText("Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves " +
                                 "Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves " +
                                 "Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves");
             keywords.getKeywords().add(keyword1);

             Keyword keyword2 = new Keyword();
             keyword2.setBid(new Bid());
             keyword2.getBid().setAmount(0.47);
             keyword2.setParam2("10% Off");
             keyword2.setMatchType(MatchType.PHRASE);
             keyword2.setText("Brand-A Gloves");
             keywords.getKeywords().add(keyword2);

             Keyword keyword3 = new Keyword();
             keyword3.setBid(new Bid());
             keyword3.getBid().setAmount(0.47);
             keyword3.setParam2("10% Off");
             keyword3.setMatchType(MatchType.PHRASE);
             keyword3.setText("Brand-A Gloves");
             keywords.getKeywords().add(keyword3);
 
             
             // In this example only the second ad should succeed. The Title of the first ad is empty and not valid,
             // and the third ad is a duplicate of the second ad. 

             ArrayOfAd ads = new ArrayOfAd();
             
             TextAd ad1 = new TextAd();
             ad1.setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
             ad1.setDisplayUrl("AlipineSkiHouse.com");
             ad1.setText("Huge Savings on heated gloves.");
             ad1.setTitle("");
             ads.getAds().add(ad1);

             TextAd ad2 = new TextAd();
             ad2.setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
             ad2.setDisplayUrl("AlipineSkiHouse.com");
             ad2.setText("Huge Savings on heated gloves.");
             ad2.setTitle("Winter Glove Sale");
             ads.getAds().add(ad2);

             TextAd ad3 = new TextAd();
             ad3.setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
             ad3.setDisplayUrl("AlipineSkiHouse.com");
             ad3.setText("Huge Savings on heated gloves.");
             ad3.setTitle("Winter Glove Sale");
             ads.getAds().add(ad3);


             // Add the campaign, ad group, keywords, and ads

             ArrayOfCampaign campaigns = new ArrayOfCampaign();
             campaigns.getCampaigns().add(campaign);
             ArrayOflong campaignIds = addCampaigns(AccountId, campaigns);
             
             ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
             adGroups.getAdGroups().add(adGroup);
             ArrayOflong adGroupIds = addAdGroups(campaignIds.getLongs().get(0), adGroups);

             AddKeywordsResponse addKeywordsResponse = addKeywords(adGroupIds.getLongs().get(0), keywords);
             ArrayOfNullableOflong keywordIds = addKeywordsResponse.getKeywordIds();
             ArrayOfBatchError keywordErrors = addKeywordsResponse.getPartialErrors();

             AddAdsResponse addAdsResponse = addAds(adGroupIds.getLongs().get(0), ads);
             ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
             ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
                
             // Print the new assigned campaign and ad group identifiers

             printCampaignIdentifiers(campaignIds);
             printAdGroupIdentifiers(adGroupIds);
                
             // Print the new assigned keyword and ad identifiers, as well as any partial errors

             printKeywordResults(keywords, keywordIds, keywordErrors);
             printAdResults(ads, adIds, adErrors);

             // Delete the campaign, ad group, keyword, and ad that were previously added. 
             // You should remove this line if you want to view the added entities in the 
             // Bing Ads web application or another tool.

             deleteCampaigns(AccountId, campaignIds);
             System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));
         
         // Campaign Management service operations can throw AdApiFaultDetail.
         } catch (AdApiFaultDetail_Exception fault) {
             System.out.println("The operation failed with the following faults:\n");

             for (AdApiError error : fault.getFaultInfo().getErrors().getAdApiErrors())
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
         } catch (RemoteException ex) {
             System.out.println("Service communication error encountered: ");
             System.out.println(ex.getMessage());
             ex.printStackTrace();
         } catch (Exception ex) {
             // Ignore fault exceptions that we already caught.

             if ( ex.getCause() instanceof AdApiFaultDetail_Exception ||
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
     
     // Adds one or more ad groups to the specified campaign.

     static ArrayOflong addAdGroups(long campaignId, ArrayOfAdGroup adGroups) throws RemoteException, Exception
     {
         AddAdGroupsRequest request = new AddAdGroupsRequest();
         
         // Set the request information.

         request.setCampaignId(campaignId);
         request.setAdGroups(adGroups);

         return CampaignService.getService().addAdGroups(request).getAdGroupIds();
     }

     // Adds one or more keywords to the specified ad group.

     static AddKeywordsResponse addKeywords(long adGroupId, ArrayOfKeyword keywords) throws RemoteException, Exception
     {
         AddKeywordsRequest request = new AddKeywordsRequest();
         
         // Set the request information.

         request.setAdGroupId(adGroupId);
         request.setKeywords(keywords);

         return CampaignService.getService().addKeywords(request);
     }

     // Adds one or more ads to the specified ad group.

     static AddAdsResponse addAds(long adGroupId, ArrayOfAd ads) throws RemoteException, Exception
     {
         AddAdsRequest request = new AddAdsRequest();
         
         // Set the request information.

         request.setAdGroupId(adGroupId);
         request.setAds(ads);

         return CampaignService.getService().addAds(request);
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

     // Prints the ad group identifiers for each ad group added. 

     static void printAdGroupIdentifiers(ArrayOflong adGroupIds)
     {
         if (adGroupIds == null)
         {
             return;
         }

         for (long id : adGroupIds.getLongs())
         {
             System.out.printf("AdGroup successfully added and assigned AdGroupId %d\n\n", id);
         }
     }

     // Prints the keyword identifiers, as well as any partial errors

     static void printKeywordResults(ArrayOfKeyword keywords, ArrayOfNullableOflong keywordIds, ArrayOfBatchError partialErrors)
     {
         if (keywordIds == null)
         {
             return;
         }

         // Print the identifier of each successfully added keyword.

         for (int index = 0; index < keywords.getKeywords().size(); index++ )
         {
             // The array of keyword identifiers equals the size of the attempted keywords. If the element 
             // is not null, the keyword at that index was added successfully and has a keyword identifer. 

             if (keywordIds.getLongs().get(index) != null)
             {
                 System.out.printf("Keyword[%d] (Text:%s) successfully added and assigned KeywordId %d\n", 
                     index,  
                     keywords.getKeywords().get(index).getText(),
                     keywordIds.getLongs().get(index));
             }
         }

         // Print the error details for any keyword not successfully added.
         // Note also that multiple error reasons may exist for the same attempted keyword.

         for (BatchError error : partialErrors.getBatchErrors())
         {
             // The index of the partial errors is equal to the index of the list
             // specified in the call to AddKeywords.

             System.out.printf("\nKeyword[%d] (Text:%s) not added due to the following error:\n", 
            		 error.getIndex(), keywords.getKeywords().get(error.getIndex()).getText());

             System.out.printf("\tIndex: %d\n", error.getIndex());
             System.out.printf("\tCode: %d\n", error.getCode());
             System.out.printf("\tErrorCode: %s\n", error.getErrorCode());
             System.out.printf("\tMessage: %s\n", error.getMessage());

             // In the case of an EditorialError, more details are available
             if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
             {
                 System.out.printf("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText());
                 System.out.printf("\tLocation: %s\n", ((EditorialError)(error)).getLocation());
                 System.out.printf("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry());
                 System.out.printf("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode());
             }
         }

         System.out.println("");
     }

     // Prints the ad identifiers, as well as any partial errors

     static void printAdResults(ArrayOfAd ads, ArrayOfNullableOflong adIds, ArrayOfBatchError partialErrors)
     {
         if (adIds == null)
         {
             return;
         }

         java.lang.String[] attributeValues = new java.lang.String[ads.getAds().size()];

         for (int index = 0; index < ads.getAds().size(); index++ )
         {
             // Determine the type of ad. Prepare the corresponding attribute value to be printed,
             // both for successful new ads and partial errors. 

             if (ads.getAds().get(index) instanceof TextAd)
             {
                 attributeValues[index] = "Title:" + ((TextAd)ads.getAds().get(index)).getTitle();
             }
             else if (ads.getAds().get(index) instanceof MobileAd)
             {
                 attributeValues[index] = "Title:" + ((MobileAd)ads.getAds().get(index)).getTitle();
             }
             else if (ads.getAds().get(index) instanceof ProductAd)
             {
                 attributeValues[index] = "PromotionalText:" + ((ProductAd)ads.getAds().get(index)).getPromotionalText();
             }
             else
             {
                 attributeValues[index] = "Unknown Ad Type";
             }

             // The array of ad identifiers equals the size of the attempted ads. If the element 
             // is not null, the ad at that index was added successfully and has an ad identifer. 

             if (adIds.getLongs().get(index) != null)
             {
                 System.out.printf("Ad[%d] (%s) successfully added and assigned AdId %d\n", 
                     index, 
                     attributeValues[index], 
                     adIds.getLongs().get(index));
             }
         }

         // Print the error details for any ad not successfully added.
         // Note also that multiple error reasons may exist for the same attempted ad.

         for (BatchError error : partialErrors.getBatchErrors())
         {
             // The index of the partial errors is equal to the index of the list
             // specified in the call to AddKeywords.

             System.out.printf("\nAd[%d] (%s) not added due to the following error:\n", error.getIndex(), attributeValues[error.getIndex()]);

             System.out.printf("\tIndex: %d\n", error.getIndex());
             System.out.printf("\tCode: %d\n", error.getCode());
             System.out.printf("\tErrorCode: %s\n", error.getErrorCode());
             System.out.printf("\tMessage: %s\n", error.getMessage());

             // In the case of an EditorialError, more details are available
             if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
             {
                 System.out.printf("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText());
                 System.out.printf("\tLocation: %s\n", ((EditorialError)(error)).getLocation());
                 System.out.printf("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry());
                 System.out.printf("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode());
             }
         }

         System.out.println("");
     }
 }
package com.microsoft.bingads.examples.v9;

import java.text.*;
import java.rmi.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.adintelligence.*;

public class EstimatedBid extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<IAdIntelligenceService> AdIntelligenceService; 
    
    /*
	private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */

    public static void main(java.lang.String[] args) {
   	 
    	NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
    	
        try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);
	         
            AdIntelligenceService = new ServiceClient<IAdIntelligenceService>(
                    authorizationData, 
                    IAdIntelligenceService.class);
        

            // Set the Currency, Keywords, Language, PublisherCountries, and TargetPositionForAds
            // for the estimated bid by keywords request.
            
            Currency currency = Currency.US_DOLLAR;
            
            ArrayOfKeywordAndMatchType keywordAndMatchTypes = new ArrayOfKeywordAndMatchType();
            ArrayOfMatchType matchTypes = new ArrayOfMatchType();
            matchTypes.getMatchTypes().add(MatchType.EXACT);
            matchTypes.getMatchTypes().add(MatchType.PHRASE);
            matchTypes.getMatchTypes().add(MatchType.BROAD);
            KeywordAndMatchType keywordAndMatchType1 = new KeywordAndMatchType();
            keywordAndMatchType1.setKeywordText("flower");
            keywordAndMatchType1.setMatchTypes(matchTypes);
            keywordAndMatchTypes.getKeywordAndMatchTypes().add(keywordAndMatchType1);
            KeywordAndMatchType keywordAndMatchType2 = new KeywordAndMatchType();
            keywordAndMatchType2.setKeywordText("delivery");
            keywordAndMatchType2.setMatchTypes(matchTypes);
            keywordAndMatchTypes.getKeywordAndMatchTypes().add(keywordAndMatchType2);
            
            java.lang.String language = "English";
            
            ArrayOfstring publisherCountries = new ArrayOfstring();
            publisherCountries.getStrings().add("US");
            
            TargetAdPosition targetPositionForAds = TargetAdPosition.SIDE_BAR;
            
            // GetKeywordEstimatedBidByKeywords helper method calls the corresponding Bing Ads AdIntelligenceService.getService() operation 
            // to request the KeywordEstimatedBids.
            
            ArrayOfKeywordEstimatedBid keywordEstimatedBids = getKeywordEstimatedBidByKeywords(
            	currency,
                keywordAndMatchTypes, 
                language, 
                publisherCountries, 
                targetPositionForAds
                );

            // GetAdGroupEstimatedBidByKeywords helper method calls the corresponding Bing Ads AdIntelligenceService.getService() operation 
            // to request the AdGroupEstimatedBid.
            
            AdGroupEstimatedBid adGroupEstimatedBid = getAdGroupEstimatedBidByKeywords(
                currency,
                keywordAndMatchTypes,
                language,
                publisherCountries,
                targetPositionForAds
                );
			
            // Print the KeywordEstimatedBids

            if (keywordEstimatedBids != null)
            {
            	System.out.println("KeywordEstimatedBids\n");
            	
                for (KeywordEstimatedBid bid : keywordEstimatedBids.getKeywordEstimatedBids())
                {
                    if (bid == null)
                    {
                        System.out.println("The keyword is not valid.\n");
                    }
                    else
                    {
                        System.out.println(bid.getKeyword());

                        if (bid.getEstimatedBids() == null)
                        {
                            System.out.println("  There is no bid information available for the keyword.\n");
                        }
                        else
                        {
                            for (EstimatedBidAndTraffic estimatedBidAndTraffic : bid.getEstimatedBids().getEstimatedBidAndTraffics())
                            {
                            	System.out.println("    Estimated Minimum Bid: " + 
                                        currencyFmt.format(estimatedBidAndTraffic.getEstimatedMinBid()));
                                System.out.println("    Match Type: " + estimatedBidAndTraffic.getMatchType());
                                System.out.println("    Average CPC: " + 
                                        (estimatedBidAndTraffic.getAverageCPC() != null ? currencyFmt.format(estimatedBidAndTraffic.getAverageCPC()) : "null"));
                                System.out.printf("    Estimated clicks per week: %s to %s\n",
                                		estimatedBidAndTraffic.getMinClicksPerWeek(), estimatedBidAndTraffic.getMaxClicksPerWeek());
                                System.out.printf("    Estimated impressions per week: %s to %s\n",
                                		estimatedBidAndTraffic.getMinImpressionsPerWeek(), estimatedBidAndTraffic.getMaxImpressionsPerWeek());
                                System.out.printf("    Estimated cost per week: %s to %s\n",
                                    (estimatedBidAndTraffic.getMinTotalCostPerWeek() != null ? currencyFmt.format(estimatedBidAndTraffic.getMinTotalCostPerWeek()) : "null"),
                                    (estimatedBidAndTraffic.getMaxTotalCostPerWeek() != null ? currencyFmt.format(estimatedBidAndTraffic.getMaxTotalCostPerWeek()) : "null"));
                                System.out.println();
                            }
                        }
                    }
                }
            }
            
            // Print the AdGroupEstimatedBid

            if (adGroupEstimatedBid != null) {
            	System.out.println("AdGroupEstimatedBid\n");
                
                System.out.println("    Estimated Ad Group Bid: " + 
                        currencyFmt.format(adGroupEstimatedBid.getEstimatedAdGroupBid()));
                System.out.println("    Average CPC: " + 
                        (adGroupEstimatedBid.getAverageCPC() != null ? currencyFmt.format(adGroupEstimatedBid.getAverageCPC()) : "null"));
                System.out.printf("    Estimated clicks per week: %s to %s\n",
                		adGroupEstimatedBid.getMinClicksPerWeek(), adGroupEstimatedBid.getMaxClicksPerWeek());
                System.out.printf("    Estimated impressions per week: %s to %s\n",
                		adGroupEstimatedBid.getMinImpressionsPerWeek(), adGroupEstimatedBid.getMaxImpressionsPerWeek());
                System.out.printf("    Estimated cost per week: %s to %s\n",
                    (adGroupEstimatedBid.getMinTotalCostPerWeek() != null ? currencyFmt.format(adGroupEstimatedBid.getMinTotalCostPerWeek()) : "null"),
                    (adGroupEstimatedBid.getMaxTotalCostPerWeek() != null ? currencyFmt.format(adGroupEstimatedBid.getMaxTotalCostPerWeek()) : "null"));
                System.out.println();
             }
            
            outputStatusMessage("Program execution completed\n"); 

        // Ad Intelligence service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                System.out.printf("AdApiError\n");
                System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
            }
        
        // Ad Intelligence service operations can throw ApiFaultDetail.
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
             System.out.println("Error encountered: ");
             System.out.println(ex.getMessage());
             ex.printStackTrace();
         }
    }

    // Get one or more keyword estimated bids corresponding to placement of your ad in the targeted position. 
    
    public static ArrayOfKeywordEstimatedBid getKeywordEstimatedBidByKeywords(Currency currency, ArrayOfKeywordAndMatchType keywordAndMatchTypes, 
    		java.lang.String language, ArrayOfstring publisherCountries, TargetAdPosition targetPositionForAds) throws RemoteException, Exception
    {
        GetEstimatedBidByKeywordsRequest request = new GetEstimatedBidByKeywordsRequest();
        
        // Set the Currency, Keywords, Language, PublisherCountries, and TargetPositionForAds
        // for the estimated bid by keywords request.
        
        request.setCurrency(currency);
        request.setGetBidsAtLevel(0); // Set GetBidsAtLevel to 0 to get a list of KeywordEstimatedBid.
        request.setKeywords(keywordAndMatchTypes);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setTargetPositionForAds(targetPositionForAds);

        return AdIntelligenceService.getService().getEstimatedBidByKeywords(request).getKeywordEstimatedBids();
    }

    // Get one or more ad group estimated bids corresponding to placement of your ad in the targeted position. 

    public static AdGroupEstimatedBid getAdGroupEstimatedBidByKeywords(Currency currency, ArrayOfKeywordAndMatchType keywordAndMatchTypes, 
    		java.lang.String language, ArrayOfstring publisherCountries, TargetAdPosition targetPositionForAds) throws RemoteException, Exception
    {
        GetEstimatedBidByKeywordsRequest request = new GetEstimatedBidByKeywordsRequest();
        
        // Set the Currency, Keywords, Language, PublisherCountries, and TargetPositionForAds
        // for the estimated bid by keywords request.
        
        request.setCurrency(currency);
        request.setGetBidsAtLevel(2); // Set GetBidsAtLevel to 2 to get one AdGroupEstimatedBid.
        request.setKeywords(keywordAndMatchTypes);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setTargetPositionForAds(targetPositionForAds);

        return AdIntelligenceService.getService().getEstimatedBidByKeywords(request).getAdGroupEstimatedBid();
    }
}
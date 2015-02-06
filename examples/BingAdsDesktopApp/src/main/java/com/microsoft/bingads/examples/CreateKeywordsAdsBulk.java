// Copyright 2015 Microsoft Corporation 

// Licensed under the Apache License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at 

//    http://www.apache.org/licenses/LICENSE-2.0 

// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions and 
// limitations under the License. 

package com.microsoft.bingads.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.bulk.entities.*;
import com.microsoft.bingads.bulk.*;
import com.microsoft.bingads.bulk.AdApiError;
import com.microsoft.bingads.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.BatchError;
import com.microsoft.bingads.bulk.OperationError;
import com.microsoft.bingads.campaignmanagement.*;

public class CreateKeywordsAdsBulk {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
    static DownloadFileType FileType = DownloadFileType.CSV; 
     
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
	
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
        
    public static void main(String[] args) {
		
		BulkEntityIterable entities = null;
				
		try {
			authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
						            				
			// Take advantage of the BulkServiceManager class to efficiently manage ads and keywords for all campaigns in an account. 
			// The client library provides classes to accelerate productivity for downloading and uploading entities. 
			// For example the UploadEntitiesAsync method of the BulkServiceManager class submits your upload request to the bulk service, 
			// polls the service until the upload completed, downloads the result file to a temporary directory, and exposes BulkEntity-derived objects  
			// that contain close representations of the corresponding Campaign Management data objects and value sets.
			    
			BulkService = new BulkServiceManager(authorizationData);
			
			// Poll for downloads at reasonable intervals. You know your data better than anyone. 
			// If you download an account that is well less than one million keywords, consider polling 
			// at 15 to 20 second intervals. If the account contains about one million keywords, consider polling 
			// at one minute intervals after waiting five minutes. For accounts with about four million keywords, 
			// consider polling at one minute intervals after waiting 10 minutes. 
			
			BulkService.setStatusPollIntervalInMilliseconds(5000);
						
			// Prepare the bulk entities that you want to upload. Each bulk entity contains the corresponding campaign management object,  
			// and additional elements needed to read from and write to a bulk file.  
			
			BulkCampaign bulkCampaign = getSampleBulkCampaign();
			BulkAdGroup bulkAdGroup = getSampleBulkAdGroup();
			
			// In this example only the second ad should succeed. The Title of the first ad is empty and not valid,
			// and the third ad is a duplicate of the second ad. 
			
			BulkTextAd[] bulkTextAds = getSampleBulkTextAds();
			   
			// In this example only the second keyword should succeed. The Text of the first keyword exceeds the limit,
			// and the third keyword is a duplicate of the second keyword. 
			
			BulkKeyword[] bulkKeywords = getSampleBulkKeywords();
			
			     
			// Write the entities created above, to temporary memory. 
			// Dependent entities such as BulkKeyword must be written after any dependencies,   
			// for example the BulkCampaign and BulkAdGroup.  
			
			List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			uploadEntities.add(bulkCampaign);
			uploadEntities.add(bulkAdGroup);
			
			for (BulkKeyword bulkKeyword : bulkKeywords) {
				uploadEntities.add(bulkKeyword);
			}
			
			for (BulkTextAd bulkTextAd : bulkTextAds) {
				uploadEntities.add(bulkTextAd);
			}
			
			  
			EntityUploadParameters entityUploadParameters = new EntityUploadParameters();
			entityUploadParameters.setEntities(uploadEntities);
			entityUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
			
			// UploadEntitiesAsync will upload the entities you prepared and will download the results file 
			// Alternative is to write to file and then upload the file. Use UploadFileAsync for large uploads.
			
			outputStatusMessage("Starting UploadEntitiesAsync . . .\n"); 
			
			// Wait here and assign the upload results to 'entities'
			entities = BulkService.uploadEntitiesAsync(entityUploadParameters, null, null).get();
			
			outputStatusMessage("Printing the results of UploadEntitiesAsync . . .\n"); 
			for (BulkEntity entity : entities) {
				if (entity instanceof BulkCampaign) {
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkAdGroup) {
					outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
				}
				else if (entity instanceof BulkTextAd) {
					outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );
				}
				else if (entity instanceof BulkKeyword) {
					outputBulkKeywords(Arrays.asList((BulkKeyword) entity) );
				}
			}
			entities.close();
			
			// Complete a full download of all campaigns, ad groups, ads, and keywords in the account. 
			// This download will include any entities successfully added above.
			 
			List<BulkDownloadEntity> downloadEntities = new ArrayList<BulkDownloadEntity>();
			downloadEntities.add(BulkDownloadEntity.CAMPAIGNS);
			downloadEntities.add(BulkDownloadEntity.AD_GROUPS);
			downloadEntities.add(BulkDownloadEntity.ADS);
			downloadEntities.add(BulkDownloadEntity.KEYWORDS);
			
			DownloadParameters downloadParameters = new DownloadParameters();
			downloadParameters.setEntities(downloadEntities);
			downloadParameters.setFileType(DownloadFileType.CSV);
			
			outputStatusMessage("Starting DownloadEntitiesAsync . . .\n"); 
			entities = BulkService.downloadEntitiesAsync(downloadParameters, null, null).get();
			
			outputStatusMessage("Printing the results of DownloadEntitiesAsync . . .\n"); 
			for (BulkEntity entity : entities) {
				if (entity instanceof BulkCampaign) {
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkAdGroup) {
					outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
				}
				else if (entity instanceof BulkTextAd) {
					outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );
				}
				else if (entity instanceof BulkKeyword) {
					outputBulkKeywords(Arrays.asList((BulkKeyword) entity) );
				}
			}
			entities.close();
		
		} catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				System.out.println("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					System.out.printf("AdApiError\n");
					System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
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
			} else {
				ee.printStackTrace();	
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
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
	
	static BulkCampaign getSampleBulkCampaign() {
		BulkCampaign bulkCampaign = new BulkCampaign();
		// ClientId may be used to associate records in the bulk upload file with records in the results file. The value of this field  
		// is not used or stored by the server; it is simply copied from the uploaded record to the corresponding result record. 
		// Note: This bulk file Client Id is not related to an application Client Id for OAuth. 
		bulkCampaign.setClientId("YourClientIdGoesHere");
		Campaign campaign = new Campaign();
		// When using the Campaign Management service, the Id cannot be set. In the context of a BulkCampaign, the Id is optional  
		// and may be used as a negative reference key during bulk upload. For example the same negative reference key for the campaign Id  
		// will be used when adding new ad groups to this new campaign, or when associating ad extensions with the campaign. 
		campaign.setId(campaignIdKey);
		campaign.setName("Winter Clothing " + System.currentTimeMillis());
		campaign.setDescription("Winter clothing line.");
		campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
		campaign.setMonthlyBudget(1000.00);
		campaign.setTimeZone("PacificTimeUSCanadaTijuana");
		campaign.setDaylightSaving(true);
		campaign.setStatus(CampaignStatus.PAUSED);
		bulkCampaign.setCampaign(campaign);
		
		return bulkCampaign;
	}
	
	static BulkAdGroup getSampleBulkAdGroup() {
		BulkAdGroup bulkAdGroup = new BulkAdGroup();
		bulkAdGroup.setCampaignId(campaignIdKey);
		AdGroup adGroup = new AdGroup();
		adGroup.setId(adGroupIdKey);
		adGroup.setName("Women's Heated Ski Glove Sale");
		List<AdDistribution> adDistribution = new ArrayList<AdDistribution>();
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
		bulkAdGroup.setAdGroup(adGroup);
		
		return bulkAdGroup;
	}
	
	static BulkTextAd[] getSampleBulkTextAds() {
		
		// In this example only the second ad should succeed. The Title of the first ad is empty and not valid,
		// and the third ad is a duplicate of the second ad. 
		
		BulkTextAd[] bulkTextAds = new BulkTextAd[3];
		Ad[] ads = new Ad[3];
		
		bulkTextAds[0] = new BulkTextAd();
		bulkTextAds[0].setAdGroupId(adGroupIdKey);
		ads[0] = new TextAd();
		((TextAd)ads[0]).setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
		((TextAd)ads[0]).setDisplayUrl("AlipineSkiHouse.com");
		((TextAd)ads[0]).setText("Huge Savings on heated gloves.");
		((TextAd)ads[0]).setTitle("");
		bulkTextAds[0].setTextAd(((TextAd)ads[0]));
		
		bulkTextAds[1] = new BulkTextAd();
		bulkTextAds[1].setAdGroupId(adGroupIdKey);
		ads[1] = new TextAd();
		((TextAd)ads[1]).setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
		((TextAd)ads[1]).setDisplayUrl("AlipineSkiHouse.com");
		((TextAd)ads[1]).setText("Huge Savings on heated gloves.");
		((TextAd)ads[1]).setTitle("Winter Glove Sale");
		bulkTextAds[1].setTextAd(((TextAd)ads[1]));
		
		bulkTextAds[2] = new BulkTextAd();
		bulkTextAds[2].setAdGroupId(adGroupIdKey);
		ads[2] = new TextAd();
		((TextAd)ads[2]).setDestinationUrl("http://www.alpineskihouse.com/winterglovesale");
		((TextAd)ads[2]).setDisplayUrl("AlipineSkiHouse.com");
		((TextAd)ads[2]).setText("Huge Savings on heated gloves.");
		((TextAd)ads[2]).setTitle("Winter Glove Sale");
		bulkTextAds[2].setTextAd(((TextAd)ads[2]));
		
		return bulkTextAds;
	}
	
	static BulkKeyword[] getSampleBulkKeywords() {
		
		// In this example only the second keyword should succeed. The Text of the first keyword exceeds the limit,
		// and the third keyword is a duplicate of the second keyword. 
		
		BulkKeyword[] bulkKeywords = new BulkKeyword[3];
		Keyword[] keywords = new Keyword[3];
		
		bulkKeywords[0] = new BulkKeyword();
		bulkKeywords[0].setAdGroupId(adGroupIdKey);
		keywords[0] = new Keyword(); 
		keywords[0].setBid(new Bid());
		keywords[0].getBid().setAmount(0.47);
		keywords[0].setParam2("10% Off");
		keywords[0].setMatchType(MatchType.BROAD);
		keywords[0].setText("Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves " +
		        "Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves " +
		        "Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves Brand-A Gloves");
		bulkKeywords[0].setKeyword(keywords[0]);
		
		bulkKeywords[1] = new BulkKeyword();
		bulkKeywords[1].setAdGroupId(adGroupIdKey);
		keywords[1] = new Keyword(); 
		keywords[1].setBid(new Bid());
		keywords[1].getBid().setAmount(0.47);
		keywords[1].setParam2("10% Off");
		keywords[1].setMatchType(MatchType.PHRASE);
		keywords[1].setText("Brand-A Gloves");
		bulkKeywords[1].setKeyword(keywords[1]);
		
		bulkKeywords[2] = new BulkKeyword();
		bulkKeywords[2].setAdGroupId(adGroupIdKey);
		keywords[2] = new Keyword(); 
		keywords[2].setBid(new Bid());
		keywords[2].getBid().setAmount(0.47);
		keywords[2].setParam2("10% Off");
		keywords[2].setMatchType(MatchType.PHRASE);
		keywords[2].setText("Brand-A Gloves");
		bulkKeywords[2].setKeyword(keywords[2]);
		
		return bulkKeywords;
	}
	
	static void outputStatusMessage(java.lang.String message){
		System.out.println(message);
	}
	
	static void outputBulkCampaigns(Iterable<BulkCampaign> bulkEntities){
		for (BulkCampaign entity : bulkEntities){
			outputStatusMessage("BulkCampaign: \n");
			outputStatusMessage(String.format("Campaign Name: %s\nCampaign Id: %s\n", 
					entity.getCampaign().getName(),
					entity.getCampaign().getId()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputBulkAdGroups(Iterable<BulkAdGroup> bulkEntities){
		for (BulkAdGroup entity : bulkEntities){
			outputStatusMessage("BulkAdGroup: \n");
			outputStatusMessage(String.format("AdGroup Name: %s\nAdGroup Id: %s\n", 
					entity.getAdGroup().getName(),
					entity.getAdGroup().getId()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputBulkTextAds(Iterable<BulkTextAd> bulkEntities){
		for (BulkTextAd entity : bulkEntities){
			outputStatusMessage("BulkTextAd: \n");
			outputStatusMessage(String.format("TextAd DisplayUrl: %s\nTextAd Id: %s\n", 
					entity.getAd().getDisplayUrl(),
					entity.getAd().getId()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputBulkKeywords(Iterable<BulkKeyword> bulkEntities){
		for (BulkKeyword entity : bulkEntities){
			outputStatusMessage("BulkKeyword: \n");
			outputStatusMessage(String.format("Keyword Text: %s\nKeyword Id: %s\n", 
					entity.getKeyword().getText(),
					entity.getKeyword().getId()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
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
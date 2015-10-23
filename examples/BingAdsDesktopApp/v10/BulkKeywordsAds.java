package com.microsoft.bingads.examples.v10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.bulk.entities.*;
import com.microsoft.bingads.v10.bulk.*;
import com.microsoft.bingads.v10.bulk.AdApiError;
import com.microsoft.bingads.v10.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.BatchError;
import com.microsoft.bingads.v10.bulk.OperationError;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class BulkKeywordsAds extends BulkExampleBaseV10 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
     
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
        
    public static void main(String[] args) {
		
		BulkEntityIterable bulkEntities = null;
				
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
			campaign.setName("Summer Shoes " + System.currentTimeMillis());
			campaign.setDescription("Summer shoes line.");
			campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
			campaign.setMonthlyBudget(1000.00);
			campaign.setTimeZone("PacificTimeUSCanadaTijuana");
			campaign.setDaylightSaving(true);
			campaign.setStatus(CampaignStatus.PAUSED);
			
			// DaylightSaving is not supported in the Bulk file schema. Whether or not you specify it in a BulkCampaign,
	        // the value is not written to the Bulk file, and by default DaylightSaving is set to true.
			campaign.setDaylightSaving(true);
			
			// Used with FinalUrls shown in the text ads that we will add below.
	        campaign.setTrackingUrlTemplate(
	       		 "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");
	        
			bulkCampaign.setCampaign(campaign);
			
			BulkAdGroup bulkAdGroup = new BulkAdGroup();
			bulkAdGroup.setCampaignId(campaignIdKey);
			AdGroup adGroup = new AdGroup();
			adGroup.setId(adGroupIdKey);
			adGroup.setName("Women's Red Shoes");
			List<AdDistribution> adDistribution = new ArrayList<AdDistribution>();
			adDistribution.add(AdDistribution.SEARCH);
			adGroup.setAdDistribution(adDistribution);
			adGroup.setBiddingModel(BiddingModel.KEYWORD);
			adGroup.setPricingModel(PricingModel.CPC);
			adGroup.setStartDate(null);
			adGroup.setEndDate(new com.microsoft.bingads.v10.campaignmanagement.Date());
			adGroup.getEndDate().setDay(31);
			adGroup.getEndDate().setMonth(12);
			adGroup.getEndDate().setYear(2015);
			Bid searchBid = new Bid();
	        searchBid.setAmount(0.09);
	        adGroup.setSearchBid(searchBid);
			adGroup.setLanguage("English");
			
			//You could use a tracking template which would override the campaign level
            //tracking template. Tracking templates defined for lower level entities 
            //override those set for higher level entities.
            //In this example we are using the campaign level tracking template.
            adGroup.setTrackingUrlTemplate(null);
            
			bulkAdGroup.setAdGroup(adGroup);
			
			// In this example only the first 3 ads should succeed. 
            // The Title of the fourth ad is empty and not valid,
            // and the fifth ad is a duplicate of the second ad. 
		    
			ArrayList<BulkTextAd> bulkTextAds = new ArrayList<BulkTextAd>();
			
			for(int i=0; i < 5; i++){
				BulkTextAd bulkTextAd = new BulkTextAd();
				bulkTextAd.setAdGroupId(adGroupIdKey);
				TextAd textAd = new TextAd();
           	    textAd.setText("Huge Savings on red shoes.");
                textAd.setDisplayUrl("Contoso.com");
                
                // Destination URLs are deprecated and will be sunset in March 2016. 
                // If you are currently using the Destination URL, you must upgrade to Final URLs. 
                // Here is an example of a DestinationUrl you might have used previously. 
                // textAd.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

                // To migrate from DestinationUrl to FinalUrls for existing ads, you can set DestinationUrl
                // to an empty string when updating the ad. If you are removing DestinationUrl,
                // then FinalUrls is required.
                // textAd.setDestinationUrl("");

                // With FinalUrls you can separate the tracking template, custom parameters, and 
                // landing page URLs. 
                ArrayOfstring finalUrls = new ArrayOfstring();
                finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
                textAd.setFinalUrls(finalUrls);
                
                // Final Mobile URLs can also be used if you want to direct the user to a different page 
                // for mobile devices.
                ArrayOfstring finalMobileUrls = new ArrayOfstring();
                finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
                textAd.setFinalMobileUrls(finalMobileUrls);
                
                // You could use a tracking template which would override the campaign level
                // tracking template. Tracking templates defined for lower level entities 
                // override those set for higher level entities.
                // In this example we are using the campaign level tracking template.
                textAd.setTrackingUrlTemplate(null);

                // Set custom parameters that are specific to this ad, 
                // and can be used by the ad, ad group, campaign, or account level tracking template. 
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
                textAd.setUrlCustomParameters(urlCustomParameters);
                
                bulkTextAd.setTextAd(textAd);
                bulkTextAds.add(bulkTextAd);
            }
			
			bulkTextAds.get(0).getAd().setTitle("Women's Shoe Sale");
			bulkTextAds.get(1).getAd().setTitle("Women's Super Shoe Sale");
			bulkTextAds.get(2).getAd().setTitle("Women's Red Shoe Sale");
			bulkTextAds.get(3).getAd().setTitle("");
			bulkTextAds.get(4).getAd().setTitle("Women's Super Shoe Sale");
			
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
			keywords[0].setText("Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes " +
			        "Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes " +
			        "Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes");
			bulkKeywords[0].setKeyword(keywords[0]);
			
			bulkKeywords[1] = new BulkKeyword();
			bulkKeywords[1].setAdGroupId(adGroupIdKey);
			keywords[1] = new Keyword(); 
			keywords[1].setBid(new Bid());
			keywords[1].getBid().setAmount(0.47);
			keywords[1].setParam2("10% Off");
			keywords[1].setMatchType(MatchType.PHRASE);
			keywords[1].setText("Brand-A Shoes");
			bulkKeywords[1].setKeyword(keywords[1]);
			
			bulkKeywords[2] = new BulkKeyword();
			bulkKeywords[2].setAdGroupId(adGroupIdKey);
			keywords[2] = new Keyword(); 
			keywords[2].setBid(new Bid());
			keywords[2].getBid().setAmount(0.47);
			keywords[2].setParam2("10% Off");
			keywords[2].setMatchType(MatchType.PHRASE);
			keywords[2].setText("Brand-A Shoes");
			bulkKeywords[2].setKeyword(keywords[2]);
			
			     
			// Write the entities created above, to temporary memory. 
			// Dependent entities such as BulkKeyword must be written after any dependencies,   
			// for example the BulkCampaign and BulkAdGroup.  
			
			List<BulkEntity> entities = new ArrayList<BulkEntity>();
			entities.add(bulkCampaign);
			entities.add(bulkAdGroup);
			
			for (BulkKeyword bulkKeyword : bulkKeywords) {
				entities.add(bulkKeyword);
			}
			
			for (BulkTextAd bulkTextAd : bulkTextAds) {
				entities.add(bulkTextAd);
			}
			
			outputStatusMessage("Starting Upload . . .\n"); 
			
	    	Reader = uploadEntities(entities);

	        // Write the upload output

	        bulkEntities = Reader.getEntities();

			outputStatusMessage("Printing the results of Upload . . .\n");
			
			for (BulkEntity entity : bulkEntities) {
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
			bulkEntities.close();
			
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
			bulkEntities = BulkService.downloadEntitiesAsync(downloadParameters, null, null).get();
			
			outputStatusMessage("Printing the results of DownloadEntitiesAsync . . .\n"); 
			for (BulkEntity entity : bulkEntities) {
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
			bulkEntities.close();
		
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
}
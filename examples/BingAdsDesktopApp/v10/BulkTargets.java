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

public class BulkTargets extends BulkExampleBaseV10 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
    
    final static long targetIdKey = -1; 
	final static long campaignIdKey = -123; 
        
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
			campaign.setStatus(CampaignStatus.PAUSED);
			bulkCampaign.setCampaign(campaign);
			
			BulkCampaignDayTimeTarget bulkCampaignDayTimeTarget = new BulkCampaignDayTimeTarget();
			bulkCampaignDayTimeTarget.setCampaignId(campaignIdKey);
			bulkCampaignDayTimeTarget.setTargetId(targetIdKey);
			DayTimeTarget dayTimeTarget = new DayTimeTarget();
			ArrayOfDayTimeTargetBid dayTimeTargetBids = new ArrayOfDayTimeTargetBid();
			DayTimeTargetBid dayTimeTargetBid0 = new DayTimeTargetBid();
			dayTimeTargetBid0.setBidAdjustment(10);
			dayTimeTargetBid0.setDay(Day.FRIDAY);
			dayTimeTargetBid0.setFromHour(11);
			dayTimeTargetBid0.setFromMinute(Minute.ZERO);
			dayTimeTargetBid0.setToHour(13);
			dayTimeTargetBid0.setToMinute(Minute.FIFTEEN);
			dayTimeTargetBids.getDayTimeTargetBids().add(dayTimeTargetBid0);
			DayTimeTargetBid dayTimeTargetBid1 = new DayTimeTargetBid();
			dayTimeTargetBid1.setBidAdjustment(20);
			dayTimeTargetBid1.setDay(Day.SATURDAY);
			dayTimeTargetBid1.setFromHour(11);
			dayTimeTargetBid1.setFromMinute(Minute.ZERO);
			dayTimeTargetBid1.setToHour(13);
			dayTimeTargetBid1.setToMinute(Minute.FIFTEEN);
			dayTimeTargetBids.getDayTimeTargetBids().add(dayTimeTargetBid1);
			dayTimeTarget.setBids(dayTimeTargetBids);
			bulkCampaignDayTimeTarget.setDayTimeTarget(dayTimeTarget);

			BulkCampaignLocationTarget bulkCampaignLocationTarget = new BulkCampaignLocationTarget();
			bulkCampaignLocationTarget.setCampaignId(campaignIdKey);
			bulkCampaignLocationTarget.setTargetId(targetIdKey);
			
			CityTarget cityTarget = new CityTarget();
			ArrayOfCityTargetBid cityTargetBids = new ArrayOfCityTargetBid();
			CityTargetBid cityTargetBid = new CityTargetBid();
			cityTargetBid.setBidAdjustment(15);
			cityTargetBid.setCity("Toronto, Toronto ON CA");
			cityTargetBid.setIsExcluded(false);
			cityTargetBids.getCityTargetBids().add(cityTargetBid);
			cityTarget.setBids(cityTargetBids);
			
			CountryTarget countryTarget = new CountryTarget();
			ArrayOfCountryTargetBid countryTargetBids = new ArrayOfCountryTargetBid();
			CountryTargetBid countryTargetBid = new CountryTargetBid();
			countryTargetBid.setBidAdjustment(15);
			countryTargetBid.setCountryAndRegion("CA");
			countryTargetBid.setIsExcluded(false);
			countryTargetBids.getCountryTargetBids().add(countryTargetBid);
			countryTarget.setBids(countryTargetBids);
			
			MetroAreaTarget metroAreaTarget = new MetroAreaTarget();
			ArrayOfMetroAreaTargetBid metroAreaTargetBids = new ArrayOfMetroAreaTargetBid();
			MetroAreaTargetBid metroAreaTargetBid = new MetroAreaTargetBid();
			metroAreaTargetBid.setBidAdjustment(15);
			metroAreaTargetBid.setMetroArea("Seattle-Tacoma, WA, WA US");
			metroAreaTargetBid.setIsExcluded(false);
			metroAreaTargetBids.getMetroAreaTargetBids().add(metroAreaTargetBid);
			metroAreaTarget.setBids(metroAreaTargetBids);
			
			PostalCodeTarget postalCodeTarget = new PostalCodeTarget();
			ArrayOfPostalCodeTargetBid postalCodeTargetBids = new ArrayOfPostalCodeTargetBid();
			PostalCodeTargetBid postalCodeTargetBid = new PostalCodeTargetBid();
			postalCodeTargetBid.setBidAdjustment(10);
			postalCodeTargetBid.setPostalCode("98052, WA US");
			postalCodeTargetBid.setIsExcluded(false);
			postalCodeTargetBids.getPostalCodeTargetBids().add(postalCodeTargetBid);
			postalCodeTarget.setBids(postalCodeTargetBids);
			
			StateTarget stateTarget = new StateTarget();
			ArrayOfStateTargetBid stateTargetBids = new ArrayOfStateTargetBid();
			StateTargetBid stateTargetBid = new StateTargetBid();
			stateTargetBid.setBidAdjustment(15);
			stateTargetBid.setState("US-WA");
			stateTargetBid.setIsExcluded(false);
			stateTargetBids.getStateTargetBids().add(stateTargetBid);
			stateTarget.setBids(stateTargetBids);
					
			LocationTarget location = new LocationTarget();
			location.setIntentOption(IntentOption.PEOPLE_IN);
			location.setCityTarget(cityTarget);
			location.setCountryTarget(countryTarget);
			location.setMetroAreaTarget(metroAreaTarget);
			location.setStateTarget(stateTarget);
			location.setPostalCodeTarget(postalCodeTarget);
			bulkCampaignLocationTarget.setLocation(location);

			BulkCampaignRadiusTarget bulkCampaignRadiusTarget = new BulkCampaignRadiusTarget();
			bulkCampaignRadiusTarget.setCampaignId(campaignIdKey);
			bulkCampaignRadiusTarget.setTargetId(targetIdKey);
			
			RadiusTarget radiusTarget = new RadiusTarget();
			ArrayOfRadiusTargetBid radiusTargetBids = new ArrayOfRadiusTargetBid();
			RadiusTargetBid radiusTargetBid = new RadiusTargetBid();
			radiusTargetBid.setBidAdjustment(50);
			radiusTargetBid.setLatitudeDegrees(47.755367);
			radiusTargetBid.setLongitudeDegrees(-122.091827);
			radiusTargetBid.setRadius(11);
			radiusTargetBid.setRadiusUnit(DistanceUnit.KILOMETERS);
			radiusTargetBids.getRadiusTargetBids().add(radiusTargetBid);
			radiusTarget.setBids(radiusTargetBids);
			
			bulkCampaignRadiusTarget.setRadiusTarget(radiusTarget);
				
			
            // Upload the entities created above. 
			
			List<BulkEntity> entities = new ArrayList<BulkEntity>();
			
            entities.add(bulkCampaign);
            entities.add(bulkCampaignDayTimeTarget);
            entities.add(bulkCampaignLocationTarget);
            entities.add(bulkCampaignRadiusTarget);

            Reader = uploadEntities(entities);
            bulkEntities = Reader.getEntities();
            
            // Write the upload output
            
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkCampaignDayTimeTarget) {
					outputBulkCampaignDayTimeTargets(Arrays.asList((BulkCampaignDayTimeTarget) entity) );
				}
				else if (entity instanceof BulkCampaignLocationTarget) {
					outputBulkCampaignLocationTargets(Arrays.asList((BulkCampaignLocationTarget) entity) );
				}
				else if (entity instanceof BulkCampaignRadiusTarget) {
					outputBulkCampaignRadiusTargets(Arrays.asList((BulkCampaignRadiusTarget) entity) );
				}
			}
            
			bulkEntities.close();
            Reader.close();
            
            java.lang.Long campaignId = campaignResults.get(0).getCampaign().getId();
            
            // Update the day and time target. 
            // Do not create a BulkAdGroupDayTimeTarget for update, unless you want to replace all existing DayTime target bids
            // with the specified day and time target set for the current bulk upload. 
            // Instead you should upload one or more BulkCampaignDayTimeTargetBid.

            BulkCampaignDayTimeTargetBid bulkCampaignDayTimeTargetBid = new BulkCampaignDayTimeTargetBid();
    		bulkCampaignDayTimeTargetBid.setCampaignId(campaignId);
    		bulkCampaignDayTimeTargetBid.setTargetId(targetIdKey);
    		DayTimeTargetBid dayTimeTargetBid = new DayTimeTargetBid();
    		dayTimeTargetBid.setBidAdjustment(15);
    		dayTimeTargetBid.setDay(Day.FRIDAY);
    		dayTimeTargetBid.setFromHour(11);
    		dayTimeTargetBid.setFromMinute(Minute.ZERO);
    		dayTimeTargetBid.setToHour(13);
    		dayTimeTargetBid.setToMinute(Minute.FIFTEEN);
    		bulkCampaignDayTimeTargetBid.setDayTimeTargetBid(dayTimeTargetBid);

    		// Upload the updated target
			
			entities = new ArrayList<BulkEntity>();
			
            entities.add(bulkCampaignDayTimeTargetBid);

            Reader = uploadEntities(entities);
            bulkEntities = Reader.getEntities();
            
            outputStatusMessage(String.format("Upload Results Bulk File Pat: %s\n", Reader.getBulkFilePath()));
            outputStatusMessage("Updated Entities\n");
            
            // Write the upload output
    		            
            List<BulkEntity> campaignDayTimeTargetBidResults = 
            		new ArrayList<BulkEntity>();
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkCampaignDayTimeTargetBid) {
					outputStatusMessage("BulkCampaignDayTimeTargetBid\n");
					campaignDayTimeTargetBidResults.add((BulkCampaignDayTimeTargetBid) entity);
				}
				else{
					outputStatusMessage(String.format("Class: %s\n", entity.getClass()));
					campaignDayTimeTargetBidResults.add((BulkCampaignDayTimeTargetBid) entity);
				}
			}
			
            bulkEntities.close();
            Reader.close();
            
            /* Delete the campaign and target associations that were previously added. 
             * Note that the targets are not deleted. Deleting targets is not supported using the
             * Bulk service. To delete targets you can use the DeleteTargetsFromLibrary operation
             * via the Campaign Management service.
             * You should remove this region if you want to view the added entities in the 
             * Bing Ads web application or another tool.
             */

            bulkCampaign = new BulkCampaign();
            bulkCampaign.setCampaign(new Campaign());
            bulkCampaign.getCampaign().setId(campaignId);
            bulkCampaign.getCampaign().setStatus(CampaignStatus.DELETED);
            
            entities = new ArrayList<BulkEntity>();
			
            entities.add(bulkCampaign);

            Reader = uploadEntities(entities);
            bulkEntities = Reader.getEntities();

            // Write the upload output
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkCampaign) {
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
			}
			
            bulkEntities.close();
            Reader.close();
		
		} catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				outputStatusMessage("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					outputStatusMessage("AdApiError\n");
					outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
							error.getCode(), error.getErrorCode(), error.getMessage()));
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
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
	
	static void outputBulkCampaignDayTimeTargets(Iterable<BulkCampaignDayTimeTarget> bulkEntities) {
		for (BulkCampaignDayTimeTarget entity : bulkEntities){
			// If the BulkCampaignDayTimeTarget object was created by the application, and not read from a bulk file, 
	        // then there will be no BulkCampaignDayTimeTargetBid objects. For example if you want to print the 
	        // BulkCampaignDayTimeTarget prior to upload.
			if (entity.getBids().size() == 0 && entity.getDayTimeTarget() != null){
				outputStatusMessage("BulkCampaignDayTimeTarget: \n");
				outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
				outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
				outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));
				
				for (DayTimeTargetBid bid : entity.getDayTimeTarget().getBids().getDayTimeTargetBids()){
					outputStatusMessage("Campaign Management DayTimeTargetBid Object: ");
					outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
					outputStatusMessage(String.format("Day : {0}", bid.getDay()));
					outputStatusMessage(String.format("From Hour : {0}", bid.getFromHour()));
					outputStatusMessage(String.format("From Minute: {0}", bid.getFromMinute()));
					outputStatusMessage(String.format("To Hour : {0}", bid.getToHour()));
					outputStatusMessage(String.format("To Minute: {0}\n", bid.getToMinute()));
				}
			}
			else {
				outputBulkCampaignDayTimeTargetBids(entity.getBids());
			}
			
		}
	}
	
	static void outputBulkCampaignDayTimeTargetBids(Iterable<BulkCampaignDayTimeTargetBid> bulkEntities){
		for (BulkCampaignDayTimeTargetBid entity : bulkEntities){
			outputStatusMessage("BulkCampaignDayTimeTargetBid: \n");
            outputStatusMessage(String.format("Campaign Name: {0}", entity.getCampaignName()));
            outputStatusMessage(String.format("Campaign Id: {0}", entity.getCampaignId()));
            outputStatusMessage(String.format("Target Id: {0}\n", entity.getTargetId()));

            outputStatusMessage(String.format("Bid Adjustment: {0}", entity.getDayTimeTargetBid().getBidAdjustment()));
            outputStatusMessage(String.format("Day : {0}", entity.getDayTimeTargetBid().getDay()));
            outputStatusMessage(String.format("From Hour : {0}", entity.getDayTimeTargetBid().getFromHour()));
            outputStatusMessage(String.format("From Minute: {0}", entity.getDayTimeTargetBid().getFromMinute()));
            outputStatusMessage(String.format("To Hour : {0}", entity.getDayTimeTargetBid().getToHour()));
            outputStatusMessage(String.format("To Minute: {0}\n", entity.getDayTimeTargetBid().getToMinute()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputBulkCampaignLocationTargets(Iterable<BulkCampaignLocationTarget> bulkEntities) {
		for (BulkCampaignLocationTarget entity : bulkEntities){
			// If the BulkCampaignLocationTarget object was created by the application, and not read from a bulk file, 
            // then there will be no BulkCampaignLocationTargetBid objects. For example if you want to print the 
            // BulkCampaignLocationTarget prior to upload.
            if (entity.getBids().size() == 0){
				outputStatusMessage("BulkCampaignLocationTarget: \n");
				outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
				outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
				outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));
				// TODO: Output the IntentOption after we add it to BulkCampaignLocationTarget
				
				if (entity.getCityTarget() != null){
					for (CityTargetBid bid : entity.getCityTarget().getBids().getCityTargetBids()){
						outputStatusMessage("Campaign Management CityTargetBid Object: ");
						outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
						outputStatusMessage(String.format("City : {0}", bid.getCity()));
						outputStatusMessage(String.format("Location Is Excluded: {0}", bid.isIsExcluded()));
					}
				}
				if (entity.getCountryTarget() != null){
					for (CountryTargetBid bid : entity.getCountryTarget().getBids().getCountryTargetBids()){
						outputStatusMessage("Campaign Management CountryTargetBid Object: ");
						outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
						outputStatusMessage(String.format("CountryAndRegion : {0}", bid.getCountryAndRegion()));
						outputStatusMessage(String.format("Location Is Excluded: {0}", bid.isIsExcluded()));
					}
				}
				if (entity.getMetroAreaTarget() != null){
					for (MetroAreaTargetBid bid : entity.getMetroAreaTarget().getBids().getMetroAreaTargetBids()){
						outputStatusMessage("Campaign Management MetroAreaTargetBid Object: ");
						outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
						outputStatusMessage(String.format("MetroArea : {0}", bid.getMetroArea()));
						outputStatusMessage(String.format("Location Is Excluded: {0}", bid.isIsExcluded()));
					}
				}
				if (entity.getPostalCodeTarget() != null){
					for (PostalCodeTargetBid bid : entity.getPostalCodeTarget().getBids().getPostalCodeTargetBids()){
						outputStatusMessage("Campaign Management PostalTargetBid Object: ");
						outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
						outputStatusMessage(String.format("PostalCode : {0}", bid.getPostalCode()));
						outputStatusMessage(String.format("Location Is Excluded: {0}", bid.isIsExcluded()));
					}
				}
				if (entity.getStateTarget() != null){
					for (StateTargetBid bid : entity.getStateTarget().getBids().getStateTargetBids()){
						outputStatusMessage("Campaign Management StateTargetBid Object: ");
						outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
						outputStatusMessage(String.format("State", bid.getState()));
						outputStatusMessage(String.format("Location Is Excluded: {0}", bid.isIsExcluded()));
					}
				}
			}
			else {
				outputBulkCampaignLocationTargetBids(entity.getBids());
			}
			
		}
	}
	
	static void outputBulkCampaignLocationTargetBids(Iterable<BulkCampaignLocationTargetBid> bulkEntities){
		for (BulkCampaignLocationTargetBid entity : bulkEntities){
			outputStatusMessage("BulkCampaignDayTimeTargetBid: \n");
            outputStatusMessage(String.format("Campaign Name: {0}", entity.getCampaignName()));
            outputStatusMessage(String.format("Campaign Id: {0}", entity.getCampaignId()));
            outputStatusMessage(String.format("Target Id: {0}\n", entity.getTargetId()));
            outputStatusMessage(String.format("IntentOption: {0}\n", entity.getIntentOption()));

            outputStatusMessage(String.format("Bid Adjustment: {0}", entity.getBidAdjustment()));
            outputStatusMessage(String.format("Location Type: {0}", entity.getLocationType()));
            outputStatusMessage(String.format("Location: {0}\n", entity.getLocation()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputBulkCampaignRadiusTargets(Iterable<BulkCampaignRadiusTarget> bulkEntities) {
		for (BulkCampaignRadiusTarget entity : bulkEntities){
			// If the BulkCampaignRadiusTarget object was created by the application, and not read from a bulk file, 
	        // then there will be no BulkCampaignRadiusTargetBid objects. For example if you want to print the 
	        // BulkCampaignRadiusTarget prior to upload.
			if (entity.getBids().size() == 0 && entity.getRadiusTarget() != null){
				outputStatusMessage("BulkCampaignRadiusTarget: \n");
				outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
				outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
				outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));
				
				for (RadiusTargetBid bid : entity.getRadiusTarget().getBids().getRadiusTargetBids()){
					outputStatusMessage("Campaign Management RadiusTargetBid Object: ");
					outputStatusMessage(String.format("Bid Adjustment: {0}", bid.getBidAdjustment()));
					outputStatusMessage(String.format("Name : {0}", bid.getName()));
					outputStatusMessage(String.format("Radius : {0}", bid.getRadius()));
					java.lang.String radiusUnit = bid.getRadiusUnit() == 
							DistanceUnit.KILOMETERS ? "Kilometers" : "Miles";
					outputStatusMessage(String.format("Radius Unit: {0}", radiusUnit));
				}
			}
			else {
				outputBulkCampaignRadiusTargetBids(entity.getBids());
			}
		}
	}
	
	static void outputBulkCampaignRadiusTargetBids(Iterable<BulkCampaignRadiusTargetBid> bulkEntities){
		for (BulkCampaignRadiusTargetBid entity : bulkEntities){
			outputStatusMessage("BulkCampaignRadiusTargetBid: \n");
			outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
			outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
			outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));

			outputStatusMessage("Campaign Management RadiusTargetBid Object: ");
			outputStatusMessage(String.format("Bid Adjustment: {0}", entity.getRadiusTargetBid().getBidAdjustment()));
			outputStatusMessage(String.format("Name : {0}", entity.getRadiusTargetBid().getName()));
			outputStatusMessage(String.format("Radius : {0}", entity.getRadiusTargetBid().getRadius()));
			java.lang.String radiusUnit = entity.getRadiusTargetBid().getRadiusUnit() == 
					DistanceUnit.KILOMETERS ? "Kilometers" : "Miles";
			outputStatusMessage(String.format("Radius Unit: {0}", radiusUnit));
			
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
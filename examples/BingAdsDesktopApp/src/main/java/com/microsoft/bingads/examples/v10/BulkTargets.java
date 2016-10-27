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

public class BulkTargets extends BulkExampleBase {
	
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            AuthorizationData authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);

            BulkService = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
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
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaign.setStatus(CampaignStatus.PAUSED);
            bulkCampaign.setCampaign(campaign);

            BulkCampaignDayTimeTarget bulkCampaignDayTimeTarget = new BulkCampaignDayTimeTarget();
            bulkCampaignDayTimeTarget.setCampaignId(campaignIdKey);
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
            
            BulkCampaignDeviceOsTarget bulkCampaignDeviceOsTarget = new BulkCampaignDeviceOsTarget();
            bulkCampaignDeviceOsTarget.setCampaignId(campaignIdKey);
            DeviceOSTarget deviceOSTarget = new DeviceOSTarget();
            ArrayOfDeviceOSTargetBid deviceOSTargetBids = new ArrayOfDeviceOSTargetBid();
            DeviceOSTargetBid deviceOSTargetBid = new DeviceOSTargetBid();
            deviceOSTargetBid.setBidAdjustment(20);
            deviceOSTargetBid.setDeviceName("Tablets");
            deviceOSTargetBids.getDeviceOSTargetBids().add(deviceOSTargetBid);
            deviceOSTarget.setBids(deviceOSTargetBids);
            bulkCampaignDeviceOsTarget.setDeviceOsTarget(deviceOSTarget);
				
            // Upload the entities created above. 
			
            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			
            uploadEntities.add(bulkCampaign);
            uploadEntities.add(bulkCampaignDayTimeTarget);
            uploadEntities.add(bulkCampaignLocationTarget);
            uploadEntities.add(bulkCampaignRadiusTarget);
            uploadEntities.add(bulkCampaignDeviceOsTarget);

            outputStatusMessage("\nAdding campaign and targets . . . ");
            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            // Upload and write the output
            
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            
            for (BulkEntity entity : downloadEntities) {
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
                else if (entity instanceof BulkCampaignDeviceOsTarget) {
                        outputBulkCampaignDeviceOsTargets(Arrays.asList((BulkCampaignDeviceOsTarget) entity) );
                }
            }

            downloadEntities.close();
            Reader.close();
            
            // If the campaign was successfully added in the previous upload, let's append a new device bid.
            if(campaignResults.size() > 0){
                // In this example we want to keep the Tablets bid that was uploaded previously, so we will upload the BulkCampaignDeviceOsTargetBid.
                // Each BulkCampaignDeviceOsTargetBid instance corresponds to one Campaign DeviceOS Target record in the bulk file. 
                // If instead you want to replace all existing device target bids for the specified campaign, then you should upload 
                // a BulkCampaignDeviceOsTarget. If you write a BulkCampaignDeviceOsTarget to the file (for example see the previous upload above),
                // then an additional Campaign DeviceOS Target record is included automatically with Status set to Deleted. 
                BulkCampaignDeviceOsTargetBid bulkCampaignDeviceOsTargetBid = new BulkCampaignDeviceOsTargetBid();
                bulkCampaignDeviceOsTargetBid.setCampaignId(campaignResults.get(0).getCampaign().getId());
                // You can specify ClientId for BulkCampaignDeviceOsTargetBid, but not for BulkCampaignDeviceOsTarget.
                bulkCampaignDeviceOsTargetBid.setClientId("My BulkCampaignDeviceOsTargetBid");
                deviceOSTargetBid = new DeviceOSTargetBid();
                deviceOSTargetBid.setBidAdjustment(20);
                deviceOSTargetBid.setDeviceName("Smartphones");
                bulkCampaignDeviceOsTargetBid.setDeviceOsTargetBid(deviceOSTargetBid);

                uploadEntities = new ArrayList<BulkEntity>();
                uploadEntities.add(bulkCampaignDeviceOsTargetBid);

                outputStatusMessage("\nAdding Smartphones device target for campaign . . .");
                Reader = writeEntitiesAndUploadFile(uploadEntities);
                downloadEntities = Reader.getEntities();

                for (BulkEntity entity : downloadEntities) {
                    if (entity instanceof BulkCampaignDeviceOsTargetBid) {
                        outputBulkCampaignDeviceOsTargetBids(Arrays.asList((BulkCampaignDeviceOsTargetBid) entity) );
                    }
                }

                downloadEntities.close();
                Reader.close();
            }
            

            //Delete the campaign and target associations that were previously added. 
            //You should remove this region if you want to view the added entities in the 
            //Bing Ads web application or another tool.

            //You must set the Id field of the Campaign record that you want to delete, and the Status field to Deleted.
            //In this example the Id is already set i.e. via the upload result captured above.
            //When you delete a BulkCampaign, the dependent entities such as BulkCampaignDeviceOsTarget 
            //are deleted without being specified explicitly.  
            
            uploadEntities = new ArrayList<BulkEntity>();
            
            for (BulkCampaign campaignResult : campaignResults){
            	campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
            	uploadEntities.add(campaignResult);
            }
                        
            outputStatusMessage("\nDeleting campaign and target associations . . .\n");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                        campaignResults.add((BulkCampaign) entity);
                        outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
            
            outputStatusMessage("Program execution completed\n"); 
            
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
        } catch (BulkDownloadCouldNotBeCompletedException ee) {
                outputStatusMessage(String.format("BulkDownloadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (BulkUploadCouldNotBeCompletedException ee) {
                outputStatusMessage(String.format("BulkUploadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (OAuthTokenRequestException ee) {
                outputStatusMessage(String.format("OAuthTokenRequestException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (BulkOperationInProgressException ee) {
                outputStatusMessage(String.format("BulkOperationInProgressException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (IOException ex) {
                ex.printStackTrace();
        } catch (InterruptedException ex) {
                ex.printStackTrace();
        } catch (Exception ex) {
                ex.printStackTrace();
        } finally {
            if (downloadEntities != null){
                try {
                        downloadEntities.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
            }
        }

        System.exit(0);
    }
}
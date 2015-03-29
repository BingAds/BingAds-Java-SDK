package com.microsoft.bingads.examples;

import java.rmi.*;
import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.*;

public class Targets {

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

             ArrayOfCampaign campaigns = new ArrayOfCampaign();
             Campaign campaign = new Campaign();
             campaign.setName("Winter Clothing " + System.currentTimeMillis());
             campaign.setDescription("Winter clothing line.");
             campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
             campaign.setMonthlyBudget(1000.00);
             campaign.setTimeZone("PacificTimeUSCanadaTijuana");
             campaign.setDaylightSaving(true);
             campaigns.getCampaigns().add(campaign);
             
             // Specify an ad group. 
             
             ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
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
             adGroups.getAdGroups().add(adGroup);
             
             // Add the campaign and ad group
             
             ArrayOflong campaignIds = addCampaigns(AccountId, campaigns);
             printCampaignIdentifiers(campaignIds);
             
             ArrayOflong adGroupIds = addAdGroups(campaignIds.getLongs().get(0), adGroups);
             printAdGroupIdentifiers(adGroupIds);
             

             // Bing Ads API Version 9 supports both Target and Target2 objects. You should use Target2. 
             // This sample compares Target and Target2, and demonstrates the impact of updating the 
             // DayTimeTarget, IntentOption, and RadiusTarget2 nested in a Target2 object. 

             Target campaignTarget = new Target();
             campaignTarget.setName("My Campaign Target");

             DayTarget campaignDayTarget = new DayTarget();
             DayTargetBid campaignDayTargetBid = new DayTargetBid();
             campaignDayTargetBid.setBidAdjustment(10);
             campaignDayTargetBid.setDay(Day.FRIDAY);
             ArrayOfDayTargetBid dayTargetBids = new ArrayOfDayTargetBid();
             dayTargetBids.getDayTargetBids().add(campaignDayTargetBid);
             campaignDayTarget.setBids(dayTargetBids);
             campaignTarget.setDay(campaignDayTarget);

             HourTarget campaignHourTarget = new HourTarget();
             HourTargetBid campaignHourTargetBid = new HourTargetBid();
             campaignHourTargetBid.setBidAdjustment(10);
             campaignHourTargetBid.setHour(HourRange.ELEVEN_AM_TO_TWO_PM);
             ArrayOfHourTargetBid hourTargetBids = new ArrayOfHourTargetBid();
             hourTargetBids.getHourTargetBids().add(campaignHourTargetBid);
             campaignHourTarget.setBids(hourTargetBids);
             campaignTarget.setHour(campaignHourTarget);

             LocationTarget campaignLocationTarget = new LocationTarget();
             campaignLocationTarget.setHasPhysicalIntent(true);

             RadiusTarget campaignRadiusTarget = new RadiusTarget();
             RadiusTargetBid campaignRadiusTargetBid = new RadiusTargetBid();
             campaignRadiusTargetBid.setBidAdjustment(50);
             campaignRadiusTargetBid.setLatitudeDegrees(47.755367);
             campaignRadiusTargetBid.setLongitudeDegrees(-122.091827);
             campaignRadiusTargetBid.setRadius(5);
             ArrayOfRadiusTargetBid radiusTargetBids = new ArrayOfRadiusTargetBid();
             radiusTargetBids.getRadiusTargetBids().add(campaignRadiusTargetBid);
             campaignRadiusTarget.setBids(radiusTargetBids);
             campaignLocationTarget.setRadiusTarget(campaignRadiusTarget);
             campaignTarget.setLocation(campaignLocationTarget);
             
             Target adGroupTarget = new Target();
             adGroupTarget.setName("My Ad Group Target");

             HourTarget adGroupHourTarget = new HourTarget();
             HourTargetBid adGroupHourTargetBid = new HourTargetBid();
             adGroupHourTargetBid.setBidAdjustment(10);
             adGroupHourTargetBid.setHour(HourRange.SIX_PM_TO_ELEVEN_PM);
             hourTargetBids = new ArrayOfHourTargetBid();
             hourTargetBids.getHourTargetBids().add(adGroupHourTargetBid);
             adGroupHourTarget.setBids(hourTargetBids);
             adGroupTarget.setHour(adGroupHourTarget);

             // Each customer has a target library that can be used to set up targeting for any campaign
             // or ad group within the specified customer. 

             // Add a target to the library and associate it with the campaign.
             ArrayOfTarget targets = new ArrayOfTarget();
             targets.getTargets().add(campaignTarget);
             long campaignTargetId = addTargetsToLibrary(targets).getLongs().get(0);
             System.out.printf("Added Target Id: %d\n\n", campaignTargetId);
             setTargetToCampaign(campaignIds.getLongs().get(0), campaignTargetId);
             System.out.printf("Associated CampaignId %d with TargetId %d.\n\n", campaignIds.getLongs().get(0), campaignTargetId);

             // Get and print the Target with the legacy GetTargetsByIds operation
             System.out.println("Get Campaign Target: \n");
             ArrayOflong targetIds = new ArrayOflong();
             targetIds.getLongs().add(campaignTargetId);
             targets = getTargetsByIds(targetIds);
             printTarget(targets.getTargets().get(0));

             // Get and print the Target2 with the new GetTargetsByIds2 operation
             System.out.println("Get Campaign Target2: \n");
             ArrayOfTarget2 target2s = getTargetsByIds2(targetIds);
             printTarget2(target2s.getTarget2s().get(0));

             // Add a target to the library and associate it with the ad group.
             targets = new ArrayOfTarget();
             targets.getTargets().add(adGroupTarget);
             long adGroupTargetId = addTargetsToLibrary(targets).getLongs().get(0);
             System.out.printf("Added Target Id: %d\n\n", adGroupTargetId);
             setTargetToAdGroup(adGroupIds.getLongs().get(0), adGroupTargetId);
             System.out.printf("Associated AdGroupId %d with TargetId %d.\n\n", adGroupIds.getLongs().get(0), adGroupTargetId);

             // Get and print the Target with the legacy GetTargetsByIds operation
             System.out.println("Get AdGroup Target: \n");
             targetIds = new ArrayOflong();
             targetIds.getLongs().add(adGroupTargetId);
             targets = getTargetsByIds(targetIds);
             printTarget(targets.getTargets().get(0));

             // Get and print the Target2 with the new GetTargetsByIds2 operation
             System.out.println("Get AdGroup Target2: \n");
             target2s = getTargetsByIds2(targetIds);
             printTarget2(target2s.getTarget2s().get(0));

             // Update the ad group's target as a Target2 object with additional target types.
             // Existing target types such as DayTime, Location, and Radius must be specified 
             // or they will not be included in the updated target.

             Target2 target2 = new Target2();
             target2.setId(adGroupTargetId);
             target2.setName("My Target2");

             AgeTarget ageTarget = new AgeTarget();
             AgeTargetBid ageTargetBid = new AgeTargetBid();
             ageTargetBid.setBidAdjustment(10);
             ageTargetBid.setAge(AgeRange.EIGHTEEN_TO_TWENTY_FIVE);
             ArrayOfAgeTargetBid ageTargetBids = new ArrayOfAgeTargetBid();
             ageTargetBids.getAgeTargetBids().add(ageTargetBid);
             ageTarget.setBids(ageTargetBids);
             target2.setAge(ageTarget);

             DayTimeTarget dayTimeTarget = new DayTimeTarget();
             DayTimeTargetBid dayTimeTargetBid = new DayTimeTargetBid();
             dayTimeTargetBid.setBidAdjustment(10);
             dayTimeTargetBid.setDay(Day.FRIDAY);
             dayTimeTargetBid.setFromHour(1);
             dayTimeTargetBid.setToHour(12);
             dayTimeTargetBid.setFromMinute(Minute.ZERO);
             dayTimeTargetBid.setToMinute(Minute.FORTY_FIVE);
             ArrayOfDayTimeTargetBid dayTimeTargetBids = new ArrayOfDayTimeTargetBid();
             dayTimeTargetBids.getDayTimeTargetBids().add(dayTimeTargetBid);
             dayTimeTarget.setBids(dayTimeTargetBids);
             target2.setDayTime(dayTimeTarget);

             DeviceOSTarget deviceOSTarget = new DeviceOSTarget();
             DeviceOSTargetBid deviceOSTargetBid = new DeviceOSTargetBid();
             deviceOSTargetBid.setBidAdjustment(20);
             deviceOSTargetBid.setDeviceName("Tablets");
             ArrayOfDeviceOSTargetBid deviceOSTargetBids = new ArrayOfDeviceOSTargetBid();
             deviceOSTargetBids.getDeviceOSTargetBids().add(deviceOSTargetBid);
             deviceOSTarget.setBids(deviceOSTargetBids);
             target2.setDeviceOS(deviceOSTarget);

             GenderTarget genderTarget = new GenderTarget();
             GenderTargetBid genderTargetBid = new GenderTargetBid();
             genderTargetBid.setBidAdjustment(10);
             genderTargetBid.setGender(GenderType.FEMALE);
             ArrayOfGenderTargetBid genderTargetBids = new ArrayOfGenderTargetBid();
             genderTargetBids.getGenderTargetBids().add(genderTargetBid);
             genderTarget.setBids(genderTargetBids);
             target2.setGender(genderTarget);

             LocationTarget2 locationTarget = new LocationTarget2();
             locationTarget.setIntentOption(IntentOption.PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES);

             CountryTarget countryTarget = new CountryTarget();
             CountryTargetBid countryTargetBid = new CountryTargetBid();
             countryTargetBid.setBidAdjustment(10);
             countryTargetBid.setCountryAndRegion("US");
             countryTargetBid.setIsExcluded(false);
             ArrayOfCountryTargetBid countryTargetBids = new ArrayOfCountryTargetBid();
             countryTargetBids.getCountryTargetBids().add(countryTargetBid);
             countryTarget.setBids(countryTargetBids);
             locationTarget.setCountryTarget(countryTarget);

             PostalCodeTarget postalCodeTarget = new PostalCodeTarget();
             PostalCodeTargetBid postalCodeTargetBid = new PostalCodeTargetBid();
             postalCodeTargetBid.setBidAdjustment(10);
             postalCodeTargetBid.setPostalCode("98052, WA US");
             postalCodeTargetBid.setIsExcluded(false);
             ArrayOfPostalCodeTargetBid postalCodeTargetBids = new ArrayOfPostalCodeTargetBid();
             postalCodeTargetBids.getPostalCodeTargetBids().add(postalCodeTargetBid);
             postalCodeTarget.setBids(postalCodeTargetBids);
             locationTarget.setPostalCodeTarget(postalCodeTarget);

             RadiusTarget2 radiusTarget = new RadiusTarget2();
             RadiusTargetBid2 radiusTargetBid = new RadiusTargetBid2();
             radiusTargetBid.setBidAdjustment(50);
             radiusTargetBid.setLatitudeDegrees(47.755367);
             radiusTargetBid.setLongitudeDegrees(-122.091827);
             radiusTargetBid.setRadius(11);
             radiusTargetBid.setRadiusUnit(DistanceUnit.KILOMETERS);
             ArrayOfRadiusTargetBid2 radiusTargetBid2s = new ArrayOfRadiusTargetBid2();
             radiusTargetBid2s.getRadiusTargetBid2s().add(radiusTargetBid);
             radiusTarget.setBids(radiusTargetBid2s);
             locationTarget.setRadiusTarget(radiusTarget);
             target2.setLocation(locationTarget);

             // Update the same identified target as a Target2 object. 
             // Going forward when getting the specified target Id, the Day and Hour elements of the legacy
             // Target object will be nil, since the target is being updated with a DayTime target. 
             target2s = new ArrayOfTarget2();
             target2s.getTarget2s().add(target2);
             updateTargetsInLibrary2(target2s);
             System.out.println("Updated the ad group level target as a Target2 object.\n");
             
             ArrayOflong campaignTargetIds = new ArrayOflong();
             campaignTargetIds.getLongs().add(campaignTargetId);
             ArrayOflong adGroupTargetIds = new ArrayOflong();
             adGroupTargetIds.getLongs().add(adGroupTargetId);
             
             // Get and print the Target with the legacy GetTargetsByIds operation
             System.out.println("Get Campaign Target: \n");
             targets = getTargetsByIds(campaignTargetIds);
             printTarget(targets.getTargets().get(0));

             // Get and print the Target2 with the new GetTargetsByIds2 operation
             System.out.println("Get Campaign Target2: \n");
             target2s = getTargetsByIds2(campaignTargetIds);
             printTarget2(target2s.getTarget2s().get(0));

             // Get and print the Target with the legacy GetTargetsByIds operation
             System.out.println("Get AdGroup Target: \n");
             targets = getTargetsByIds(adGroupTargetIds);
             printTarget(targets.getTargets().get(0));

             // Get and print the Target2 with the new GetTargetsByIds2 operation
             System.out.println("Get AdGroup Target2: \n");
             target2s = getTargetsByIds2(adGroupTargetIds);
             printTarget2(target2s.getTarget2s().get(0));

             // Get all new and existing targets in the customer library, whether or not they are
             // associated with campaigns or ad groups.

             ArrayOfTargetInfo allTargetsInfo = getTargetsInfoFromLibrary();
             System.out.println("All target identifiers and names from the customer library: \n");
             printTargetsInfo(allTargetsInfo);
                
             // Delete the campaign, ad group, and targets that were previously added. 
             // DeleteCampaigns would remove the campaign and ad group, as well as the association
             // between ad groups and campaigns. To explicitly delete the association between an entity 
             // and the target, use DeleteTargetFromCampaign and DeleteTargetFromAdGroup respectively.

             deleteTargetFromCampaign(campaignIds.getLongs().get(0));
             deleteTargetFromAdGroup(adGroupIds.getLongs().get(0));

             ArrayOflong deleteCampaignIds = new ArrayOflong();
             deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
             deleteCampaigns(AccountId, deleteCampaignIds);
             System.out.printf("Deleted CampaignId %d\n\n", campaignIds.getLongs().get(0));

             // DeleteCampaigns deletes the association between the campaign and target, but does not 
             // delete the target from the customer library. 
             // Call the DeleteTargetsFromLibrary operation for each target that you want to delete. 
             // You must specify an array with exactly one item.

             ArrayOflong deleteCampaignTargetIds = new ArrayOflong();
             deleteCampaignTargetIds.getLongs().add(campaignTargetId);
             deleteTargetsFromLibrary(deleteCampaignTargetIds);
             System.out.printf("Deleted TargetId %d\n\n", campaignTargetId);

             ArrayOflong deleteAdGroupTargetIds = new ArrayOflong();
             deleteAdGroupTargetIds.getLongs().add(adGroupTargetId);
             deleteTargetsFromLibrary(deleteAdGroupTargetIds);
             System.out.printf("Deleted TargetId %d\n\n", adGroupTargetId);
         
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

     // Gets all target info from the customer library.

     static ArrayOfTargetInfo getTargetsInfoFromLibrary() throws RemoteException, Exception
     {
    	 GetTargetsInfoFromLibraryRequest request = new GetTargetsInfoFromLibraryRequest();

         return CampaignService.getService().getTargetsInfoFromLibrary(request).getTargetsInfo();
     }

     // Gets the list of Target objects given the specified target identifiers.

     static ArrayOfTarget getTargetsByIds(ArrayOflong targetIds) throws RemoteException, Exception
     {
    	 GetTargetsByIdsRequest request = new GetTargetsByIdsRequest();

         request.setTargetIds(targetIds);
         request.setLocationTargetVersion("Latest");

         return CampaignService.getService().getTargetsByIds(request).getTargets();
     }

     // Gets the list of Target2 objects given the specified target identifiers.

     static ArrayOfTarget2 getTargetsByIds2(ArrayOflong targetIds) throws RemoteException, Exception
     {
    	 GetTargetsByIds2Request request = new GetTargetsByIds2Request();

         request.setTargetIds(targetIds);
         request.setLocationTargetVersion("Latest");

         return CampaignService.getService().getTargetsByIds2(request).getTargets();
     }

     // Adds the specified Target object to the customer library. 
     // The operation requires exactly one Target in a list.

     static ArrayOflong addTargetsToLibrary(ArrayOfTarget targets) throws RemoteException, Exception
     {
    	 AddTargetsToLibraryRequest request = new AddTargetsToLibraryRequest();

         request.setTargets(targets);

         return CampaignService.getService().addTargetsToLibrary(request).getTargetIds();
     }

     // Adds the specified Target2 object to the customer library. 
     // The operation requires exactly one Target2 in a list.

     static ArrayOflong addTargetsToLibrary2(ArrayOfTarget2 targets) throws RemoteException, Exception
     {
    	 AddTargetsToLibrary2Request request = new AddTargetsToLibrary2Request();

         request.setTargets(targets);

         return CampaignService.getService().addTargetsToLibrary2(request).getTargetIds();
     }

     // Updates the specified Target2 object within the customer library. 
     // The operation requires exactly one Target2 in a list.

     static void updateTargetsInLibrary2(ArrayOfTarget2 targets) throws RemoteException, Exception
     {
    	 UpdateTargetsInLibrary2Request request = new UpdateTargetsInLibrary2Request();

         request.setTargets(targets);

         CampaignService.getService().updateTargetsInLibrary2(request);
     }

     // Deletes the specified target from the customer library. 
     // The operation requires exactly one identifier in a list.

     static void deleteTargetsFromLibrary(ArrayOflong targetIds) throws RemoteException, Exception
     {
    	 DeleteTargetsFromLibraryRequest request = new DeleteTargetsFromLibraryRequest();

         request.setTargetIds(targetIds);

         CampaignService.getService().deleteTargetsFromLibrary(request);
     }

     // Removes the target association from the specified campaign. 
     // Does not delete the target or the campaign.

     static void deleteTargetFromCampaign(long campaignId) throws RemoteException, Exception
     {
    	 DeleteTargetFromCampaignRequest request = new DeleteTargetFromCampaignRequest();

         request.setCampaignId(campaignId);

         CampaignService.getService().deleteTargetFromCampaign(request);
     }

     // Removes the target association from the specified ad group. 
     // Does not delete the target or the ad group.

     static void deleteTargetFromAdGroup(long adGroupId) throws RemoteException, Exception
     {
    	 DeleteTargetFromAdGroupRequest request = new DeleteTargetFromAdGroupRequest();

         request.setAdGroupId(adGroupId);

         CampaignService.getService().deleteTargetFromAdGroup(request);
     }

     // Associates the specified campaign and target.

     static void setTargetToCampaign(long campaignId, long targetId) throws RemoteException, Exception
     {
    	 SetTargetToCampaignRequest request = new SetTargetToCampaignRequest();

         request.setCampaignId(campaignId);
         request.setTargetId(targetId);

         CampaignService.getService().setTargetToCampaign(request);
     }

     // Associates the specified ad group and target.

     static void setTargetToAdGroup(long adGroupId, long targetId) throws RemoteException, Exception
     {
    	 SetTargetToAdGroupRequest request = new SetTargetToAdGroupRequest();

         request.setAdGroupId(adGroupId);
         request.setTargetId(targetId);

         CampaignService.getService().setTargetToAdGroup(request);
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

     // Prints the info for each target. 

     static void printTargetsInfo(ArrayOfTargetInfo targetsInfo)
     {
         if (targetsInfo == null)
         {
             return;
         }

         for (TargetInfo info : targetsInfo.getTargetInfos())
         {
             System.out.printf("Target Id: %d\n", info.getId());
             System.out.printf("Target Name: %s\n\n", info.getName());
         }
     }

     // Prints the specified Target object. 

     static void printTarget(Target target)
     {
         if (target == null)
         {
             return;
         }

         System.out.printf("Target Id: %d\n", target.getId());
         System.out.printf("Target Name: %s\n\n", target.getName());

         if (target.getAge() != null)
         {
             System.out.println("AgeTarget:");
             for (AgeTargetBid bid : target.getAge().getBids().getAgeTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tAge: %s\n\n", bid.getAge());
             }
         }
         if (target.getDay() != null)
         {
             System.out.println("DayTarget:");
             for (DayTargetBid bid : target.getDay().getBids().getDayTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tDay: %s\n\n", bid.getDay());
             }
         }
         if (target.getDeviceOS() != null)
         {
             System.out.println("DeviceOSTarget:");
             for (DeviceOSTargetBid bid : target.getDeviceOS().getBids().getDeviceOSTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tDeviceName: %s\n", bid.getDeviceName());
                 System.out.println();
             }
         }
         if (target.getGender() != null)
         {
             System.out.println("GenderTarget:");
             for (GenderTargetBid bid : target.getGender().getBids().getGenderTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tGender: %s\n\n", bid.getGender());
             }
         }
         if (target.getHour() != null)
         {
             System.out.println("HourTarget:");
             for (HourTargetBid bid : target.getHour().getBids().getHourTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tHour: %s\n\n", bid.getHour());
             }
         }
         if (target.getLocation() != null)
         {
             System.out.println("LocationTarget:");
             System.out.printf("\tHasPhysicalIntent: %s\n\n", target.getLocation().getHasPhysicalIntent());
             if (target.getLocation().getCityTarget() != null)
             {
                 System.out.println("\tCityTarget:");
                 for (CityTargetBid bid : target.getLocation().getCityTarget().getBids().getCityTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %s\n", bid.getBidAdjustment());
                     System.out.printf("\t\tCity: %s\n\n", bid.getCity());
                 }
             }
             if (target.getLocation().getCountryTarget() != null)
             {
                 System.out.println("\tCountryTarget:");
                 for (CountryTargetBid bid : target.getLocation().getCountryTarget().getBids().getCountryTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tCountryAndRegion: %s\n", bid.getCountryAndRegion());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
             if (target.getLocation().getMetroAreaTarget() != null)
             {
                 System.out.println("\tMetroAreaTarget:");
                 for (MetroAreaTargetBid bid : target.getLocation().getMetroAreaTarget().getBids().getMetroAreaTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tMetroArea: %s\n", bid.getMetroArea());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
             if (target.getLocation().getRadiusTarget() != null)
             {
                 System.out.println("\tRadiusTarget:");
                 for (RadiusTargetBid bid : target.getLocation().getRadiusTarget().getBids().getRadiusTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tLatitudeDegrees: %f\n", bid.getLatitudeDegrees());
                     System.out.printf("\t\tLongitudeDegrees: %f\n", bid.getLongitudeDegrees());
                     System.out.printf("\t\tRadius: %d Miles\n\n", bid.getRadius());
                 }
             }
             if (target.getLocation().getStateTarget() != null)
             {
                 System.out.println("\tStateTarget:");
                 for (StateTargetBid bid : target.getLocation().getStateTarget().getBids().getStateTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tState: %s\n", bid.getState());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
         }

         System.out.println();
     }

     // Prints the specified Target2 object. 

     static void printTarget2(Target2 target)
     {
         if (target == null)
         {
             return;
         }

         System.out.printf("Target2 Id: %d\n", target.getId());
         System.out.printf("Target2 Name: %s\n\n", target.getName());

         if (target.getAge() != null)
         {
             System.out.println("AgeTarget:");
             for (AgeTargetBid bid : target.getAge().getBids().getAgeTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tAge: %s\n\n", bid.getAge());
             }
         }
         if (target.getDayTime() != null)
         {
             System.out.println("DayTimeTarget:");
             for (DayTimeTargetBid bid : target.getDayTime().getBids().getDayTimeTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tDay: %s\n", bid.getDay());
                 System.out.printf("\tFromHour: %s\n", bid.getFromHour());
                 System.out.printf("\tToHour: %s\n", bid.getToHour());
                 System.out.printf("\tFromMinute: %s\n", bid.getFromMinute());
                 System.out.printf("\tToMinute: %s\n\n", bid.getToMinute());
             }
         }
         if (target.getDeviceOS() != null)
         {
             System.out.println("DeviceOSTarget:");
             for (DeviceOSTargetBid bid : target.getDeviceOS().getBids().getDeviceOSTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tDeviceName: %s\n", bid.getDeviceName());
                 System.out.println();
             }
         }
         if (target.getGender() != null)
         {
             System.out.println("GenderTarget:");
             for (GenderTargetBid bid : target.getGender().getBids().getGenderTargetBids())
             {
                 System.out.printf("\tBidAdjustment: %d\n", bid.getBidAdjustment());
                 System.out.printf("\tGender: %s\n\n", bid.getGender());
             }
         }
         if (target.getLocation() != null)
         {
             System.out.println("LocationTarget2:");
             System.out.printf("\tIntentOption: %s\n\n", target.getLocation().getIntentOption());
             if (target.getLocation().getCityTarget() != null)
             {
                 System.out.println("\tCityTarget:");
                 for (CityTargetBid bid : target.getLocation().getCityTarget().getBids().getCityTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %s\n", bid.getBidAdjustment());
                     System.out.printf("\t\tCity: %s\n\n", bid.getCity());
                 }
             }
             if (target.getLocation().getCountryTarget() != null)
             {
                 System.out.println("\tCountryTarget:");
                 for (CountryTargetBid bid : target.getLocation().getCountryTarget().getBids().getCountryTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tCountryAndRegion: %s\n", bid.getCountryAndRegion());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
             if (target.getLocation().getMetroAreaTarget() != null)
             {
                 System.out.println("\tMetroAreaTarget:");
                 for (MetroAreaTargetBid bid : target.getLocation().getMetroAreaTarget().getBids().getMetroAreaTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tMetroArea: %s\n", bid.getMetroArea());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
             if (target.getLocation().getPostalCodeTarget() != null)
             {
                 System.out.println("\tPostalCodeTarget:");
                 for (PostalCodeTargetBid bid : target.getLocation().getPostalCodeTarget().getBids().getPostalCodeTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tPostalCode: %s\n", bid.getPostalCode());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
             if (target.getLocation().getRadiusTarget() != null)
             {
                 System.out.println("\tRadiusTarget2:");
                 for (RadiusTargetBid2 bid : target.getLocation().getRadiusTarget().getBids().getRadiusTargetBid2s())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tLatitudeDegrees: %f\n", bid.getLatitudeDegrees());
                     System.out.printf("\t\tLongitudeDegrees: %f\n", bid.getLongitudeDegrees());
                     System.out.printf("\t\tRadius: %s %s\n\n", bid.getRadius(), bid.getRadiusUnit());
                 }
             }
             if (target.getLocation().getStateTarget() != null)
             {
                 System.out.println("\tStateTarget:");
                 for (StateTargetBid bid : target.getLocation().getStateTarget().getBids().getStateTargetBids())
                 {
                     System.out.printf("\t\tBidAdjustment: %d\n", bid.getBidAdjustment());
                     System.out.printf("\t\tState: %s\n", bid.getState());
                     System.out.printf("\t\tIsExcluded: %s\n\n", bid.isIsExcluded() ? "True" : "False");
                 }
             }
         }

         System.out.println();
     }
 }

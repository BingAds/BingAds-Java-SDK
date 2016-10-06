package com.microsoft.bingads.examples.v10;

import java.rmi.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.campaignmanagement.*;
import com.microsoft.bingads.customermanagement.*;
import static com.microsoft.bingads.examples.v10.BulkExampleBase.BulkService;
import static com.microsoft.bingads.examples.v10.BulkExampleBase.FileDirectory;
import com.microsoft.bingads.v10.bulk.entities.*;
import com.microsoft.bingads.v10.bulk.BulkDownloadCouldNotBeCompletedException;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.DownloadParameters;
import com.microsoft.bingads.v10.bulk.BulkEntityIterable;
import com.microsoft.bingads.v10.bulk.BulkUploadCouldNotBeCompletedException;
import com.microsoft.bingads.v10.bulk.BulkOperationInProgressException;
import com.microsoft.bingads.v10.bulk.AdApiError;
import com.microsoft.bingads.v10.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.BatchError;
import com.microsoft.bingads.v10.bulk.BulkDownloadEntity;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.OperationError;
import com.microsoft.bingads.v10.bulk.ResultFileType;


public class BulkKeywordsAds extends BulkExampleBase {
	
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
    
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    private static java.lang.String SITELINK_MIGRATION = "SiteLinkAdExtension";
        
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
            
            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
                                    
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            // Determine whether you are able to add shared budgets by checking the pilot flags.

            boolean enabledForSharedBudgets = false;
            ArrayOfint featurePilotFlags = getCustomerPilotFeatures((long)authorizationData.getCustomerId());
               
            // The pilot flag value for shared budgets is 263.
            // Pilot flags apply to all accounts within a given customer.
            if (featurePilotFlags.getInts().contains(263))
            {
                outputStatusMessage("Customer is in pilot for Shared Budget.\n");
                enabledForSharedBudgets = true;
            }
            else{
                outputStatusMessage("Customer is not in pilot for Shared Budget.\n");
            }
            
            // If the customer is enabled for shared budgets, let's create a new budget and
            // share it with a new campaign.
            
            if (enabledForSharedBudgets)
            {
                BulkBudget bulkBudget = new BulkBudget();
                bulkBudget.setClientId("YourClientIdGoesHere");
                Budget budget = new Budget();
                budget.setId(budgetIdKey);
                budget.setAmount(new java.math.BigDecimal(50));
                budget.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
                budget.setName("My Shared Budget " + System.currentTimeMillis());
                bulkBudget.setBudget(budget);
                uploadEntities.add(bulkBudget);
            }


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
            // You must choose to set either the shared  budget ID or daily amount.
            // You can set one or the other, but you may not set both.
            campaign.setBudgetId(enabledForSharedBudgets ? budgetIdKey : 0);
            campaign.setDailyBudget(enabledForSharedBudgets ? 0.0 : 50.0);
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaign.setStatus(CampaignStatus.PAUSED);

            // DaylightSaving is not supported in the Bulk file schema. Whether or not you specify it in a BulkCampaign,
            // the value is not written to the Bulk file, and by default DaylightSaving is set to true.
            campaign.setDaylightSaving(true);
            
            // You can set your campaign bid strategy to Enhanced CPC (EnhancedCpcBiddingScheme) 
            // and then, at any time, set an individual ad group or keyword bid strategy to 
            // Manual CPC (ManualCpcBiddingScheme).
            // For campaigns you can use either of the EnhancedCpcBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then ManualCpcBiddingScheme is used by default.
            campaign.setBiddingScheme(new EnhancedCpcBiddingScheme());

            // Used with FinalUrls shown in the text ads that we will add below.
            campaign.setTrackingUrlTemplate(
                "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

            EnhancedCpcBiddingScheme enhancedCpcBiddingScheme = new EnhancedCpcBiddingScheme();
            enhancedCpcBiddingScheme.setType("EnhancedCpcBiddingScheme");
            campaign.setBiddingScheme(enhancedCpcBiddingScheme);
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
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v10.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid searchBid = new Bid();
            searchBid.setAmount(0.09);
            adGroup.setSearchBid(searchBid);
            adGroup.setLanguage("English");

            // For ad groups you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            adGroup.setBiddingScheme(new ManualCpcBiddingScheme());
            
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

                // If you are currently using the Destination URL, you must upgrade to Final URLs. 
                // Here is an example of a DestinationUrl you might have used previously. 
                // textAd.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

                // To migrate from DestinationUrl to FinalUrls for existing ads, you can set DestinationUrl
                // to an empty string when updating the ad. If you are removing DestinationUrl,
                // then FinalUrls is required.
                // textAd.setDestinationUrl("");

                // With FinalUrls you can separate the tracking template, custom parameters, and 
                // landing page URLs. 
                com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
                finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
                textAd.setFinalUrls(finalUrls);

                // Final Mobile URLs can also be used if you want to direct the user to a different page 
                // for mobile devices.
                com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
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
            
            // This example sets ad format preference to Native only for the first ad.
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfKeyValuePairOfstringstring textAdFCM = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfKeyValuePairOfstringstring();
            com.microsoft.bingads.v10.campaignmanagement.KeyValuePairOfstringstring adFormatPreference = new com.microsoft.bingads.v10.campaignmanagement.KeyValuePairOfstringstring();
            adFormatPreference.setKey("NativePreference");
            adFormatPreference.setValue("True");
            textAdFCM.getKeyValuePairOfstringstrings().add(adFormatPreference);
            bulkTextAds.get(0).getAd().setForwardCompatibilityMap(textAdFCM);
            
            // In this example only the second keyword should succeed. The Text of the first keyword exceeds the limit,
            // and the third keyword is a duplicate of the second keyword. 

            bulkTextAds.get(0).getAd().setTitle("Women's Shoe Sale");
            bulkTextAds.get(1).getAd().setTitle("Women's Super Shoe Sale");
            bulkTextAds.get(2).getAd().setTitle("Women's Red Shoe Sale");
            bulkTextAds.get(3).getAd().setTitle("");
            bulkTextAds.get(4).getAd().setTitle("Women's Super Shoe Sale");

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
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keywords[0].setBiddingScheme(new InheritFromParentBiddingScheme());
            bulkKeywords[0].setKeyword(keywords[0]);

            bulkKeywords[1] = new BulkKeyword();
            bulkKeywords[1].setAdGroupId(adGroupIdKey);
            keywords[1] = new Keyword(); 
            keywords[1].setBid(new Bid());
            keywords[1].getBid().setAmount(0.47);
            keywords[1].setParam2("10% Off");
            keywords[1].setMatchType(MatchType.PHRASE);
            keywords[1].setText("Brand-A Shoes");
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keywords[1].setBiddingScheme(new InheritFromParentBiddingScheme());
            bulkKeywords[1].setKeyword(keywords[1]);

            bulkKeywords[2] = new BulkKeyword();
            bulkKeywords[2].setAdGroupId(adGroupIdKey);
            keywords[2] = new Keyword(); 
            keywords[2].setBid(new Bid());
            keywords[2].getBid().setAmount(0.47);
            keywords[2].setParam2("10% Off");
            keywords[2].setMatchType(MatchType.PHRASE);
            keywords[2].setText("Brand-A Shoes");
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keywords[2].setBiddingScheme(new InheritFromParentBiddingScheme());
            bulkKeywords[2].setKeyword(keywords[2]);


            // Upload the entities created above.
            // Dependent entities such as BulkKeyword must be written after any dependencies,   
            // for example the BulkCampaign and BulkAdGroup.  

            uploadEntities.add(bulkCampaign);
            uploadEntities.add(bulkAdGroup);

            for (BulkKeyword bulkKeyword : bulkKeywords) {
                    uploadEntities.add(bulkKeyword);
            }

            for (BulkTextAd bulkTextAd : bulkTextAds) {
                    uploadEntities.add(bulkTextAd);
            }

            outputStatusMessage("\nAdding campaign, ad group, ads, and keywords...\n");

            // Upload and write the output

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();

            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkBudget> budgetResults = new ArrayList<BulkBudget>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkBudget) {
                        budgetResults.add((BulkBudget) entity);
                        outputBulkBudgets(Arrays.asList((BulkBudget) entity) );
                }
                else if (entity instanceof BulkCampaign) {
                        campaignResults.add((BulkCampaign) entity);
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
            downloadEntities.close();
            Reader.close();
            
            
            // Here is a simple example that updates the campaign budget.
                
            List<BulkDownloadEntity> entities = new ArrayList<BulkDownloadEntity>();
            entities.add(BulkDownloadEntity.BUDGETS);
            entities.add(BulkDownloadEntity.CAMPAIGNS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);
            downloadParameters.setResultFileDirectory(new File(FileDirectory));
            downloadParameters.setResultFileName(DownloadFileName);
            downloadParameters.setOverwriteResultFile(true);
            downloadParameters.setLastSyncTimeInUTC(null);
            
            // Download all campaigns and shared budgets in the account.
            File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
            outputStatusMessage("Downloaded all campaigns and shared budgets in the account.\n"); 
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
            downloadEntities = Reader.getEntities();

            uploadEntities = new ArrayList<BulkEntity>();

            // If the campaign has a shared budget you cannot update the Campaign budget amount,
            // and you must instead update the amount in the Budget record. If you try to update 
            // the budget amount of a Campaign that has a shared budget, the service will return 
            // the CampaignServiceCannotUpdateSharedBudget error code.
            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkBudget && ((BulkBudget)entity).getBudget().getId() > 0) {
                    // Increase budget by 20 %
                    ((BulkBudget)entity).getBudget().setAmount(new java.math.BigDecimal(((BulkBudget)entity).getBudget().getAmount().doubleValue() * 1.2));
                    uploadEntities.add(entity);
                }
                else if (entity instanceof BulkCampaign && 
                    (((BulkCampaign)entity).getCampaign().getBudgetId() == null || (((BulkCampaign)entity).getCampaign().getBudgetId() <= 0))) {
                    
                    // Increase existing budgets by 20%
                    // Monthly budgets are deprecated and there will be a forced migration to daily budgets in calendar year 2017. 
                    // Shared budgets do not support the monthly budget type, so this is only applicable to unshared budgets. 
                    // During the migration all campaign level unshared budgets will be rationalized as daily. 
                    // The formula that will be used to convert monthly to daily budgets is: Monthly budget amount / 30.4.
                    // Moving campaign monthly budget to daily budget is encouraged before monthly budgets are migrated. 

                    if (((BulkCampaign)entity).getCampaign().getBudgetType() == BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED)
                    {
                        // Increase budget by 20 %
                        ((BulkCampaign)entity).getCampaign().setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
                        ((BulkCampaign)entity).getCampaign().setDailyBudget(((BulkCampaign)entity).getCampaign().getMonthlyBudget() / 30.4 * 1.2); 
                    }
                    else
                    {
                        // Increase budget by 20 %
                        ((BulkCampaign)entity).getCampaign().setDailyBudget(((BulkCampaign)entity).getCampaign().getDailyBudget() * 1.2);
                    }
                        
                    uploadEntities.add(entity);
                }
            }
            downloadEntities.close();
            Reader.close(); 

            if (!uploadEntities.isEmpty()){
                outputStatusMessage("Changed local campaign budget amounts. Starting upload.\n"); 

                Reader = writeEntitiesAndUploadFile(uploadEntities);
                downloadEntities = Reader.getEntities();
                for (BulkEntity entity : downloadEntities) {
                    if (entity instanceof BulkBudget) {
                        outputBulkBudgets(Arrays.asList((BulkBudget) entity) );
                    }
                    else if (entity instanceof BulkCampaign) {
                        outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                    }
                }
                downloadEntities.close();
                Reader.close();
            }
            else
            {
                outputStatusMessage("No campaigns or shared budgets in account. \n");
            }            
            

            //Delete the campaign, ad group, ads, and keywords that were previously added. 
            //You should remove this region if you want to view the added entities in the 
            //Bing Ads web application or another tool.

            //You must set the Id field to the corresponding entity identifier, and the Status field to Deleted. 

            //When you delete a BulkCampaign, the dependent entities such as BulkAdGroup, BulkKeyword, and BulkTextAd 
            //are deleted without being specified explicitly.   

            uploadEntities = new ArrayList<BulkEntity>();

            for (BulkBudget budgetResult : budgetResults){
                budgetResult.setStatus(Status.DELETED);
                uploadEntities.add(budgetResult);
            }
            
            for (BulkCampaign campaignResult : campaignResults){
                campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
                uploadEntities.add(campaignResult);
            }

            // Upload and write the output

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkBudget) {
                    outputBulkBudgets(Arrays.asList((BulkBudget) entity) );
                }
                else if (entity instanceof BulkCampaign) {
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();

            outputStatusMessage("Program execution completed\n"); 

        // Customer Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.customermanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.customermanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
	            outputStatusMessage("AdApiError\n");
	            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Customer Management service operations can throw ApiFault.
        } catch (com.microsoft.bingads.customermanagement.ApiFault_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.customermanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
	            outputStatusMessage("OperationError\n");
	            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
        } catch (BulkDownloadCouldNotBeCompletedException ee) {
                outputStatusMessage(String.format("BulkDownloadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (BulkUploadCouldNotBeCompletedException ee) {
                outputStatusMessage(String.format("BulkUploadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (OAuthTokenRequestException ee) {
                outputStatusMessage(String.format("OAuthTokenRequestException: %s\nMessage: %s\n\n", ee.getMessage()));
        } catch (BulkOperationInProgressException ee) {
                outputStatusMessage(String.format("BulkOperationInProgressException: %s\nMessage: %s\n\n", ee.getMessage()));
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
        } catch (Exception ex) {
            outputStatusMessage("Error encountered: ");
            outputStatusMessage(ex.getMessage());
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
    
    // Gets the list of pilot features that the customer is able to use.
    
    static ArrayOfint getCustomerPilotFeatures(java.lang.Long customerId) throws RemoteException, Exception 
    {       
		
        final GetCustomerPilotFeaturesRequest getCustomerPilotFeaturesRequest = new GetCustomerPilotFeaturesRequest();
        getCustomerPilotFeaturesRequest.setCustomerId(customerId);
        
        return CustomerService.getService().getCustomerPilotFeatures(getCustomerPilotFeaturesRequest).getFeaturePilotFlags();
    }
}
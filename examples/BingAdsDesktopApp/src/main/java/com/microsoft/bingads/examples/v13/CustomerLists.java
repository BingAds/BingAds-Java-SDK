package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.MessageHandler;

// How to associate remarketing lists with a new ad group.

public class CustomerLists extends ExampleBase {
    
    public static void main(java.lang.String[] args) {

        // Uncomment to troubleshoot headers and payloads of the request and response:
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        // System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        // MessageHandler.getInstance().setTraceOn(true);
   	 
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // add customer list type audience
            ArrayOfAudience addAudiences = new ArrayOfAudience();
            CustomerList customerList = new CustomerList();
            customerList.setName("Customer List " + System.currentTimeMillis());
            customerList.setParentId(authorizationData.getAccountId());
            customerList.setScope(EntityScope.ACCOUNT);
            addAudiences.getAudiences().add(customerList);

            outputStatusMessage("-----\nAddAudiences:");
            AddAudiencesResponse addAudiencesResponse = CampaignManagementExampleHelper.addAudiences(
                addAudiences);
            ArrayOfNullableOflong audienceIds = addAudiencesResponse.getAudienceIds();
            ArrayOfBatchError audienceErrors = addAudiencesResponse.getPartialErrors();
            outputStatusMessage("AudienceIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(audienceIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(audienceErrors);

            // upload customer list user data           
            CustomerListUserData customerListUserData = new CustomerListUserData();
            customerListUserData.setAcceptCustomerMatchTerm(true);
            customerListUserData.setActionType(CustomerListActionType.ADD);
            customerListUserData.setAudienceId(audienceIds.getLongs().get(0));
            customerListUserData.setCustomerListItemSubType(CustomerListItemSubType.EMAIL);
            ArrayOfstring customerListItems = new ArrayOfstring();
            customerListItems.getStrings().add("a8e34c39d390c30c3ff245256c46c7076cecb7dfcfd60f7534d1037e901fad76");
            customerListUserData.setCustomerListItems(customerListItems);

            outputStatusMessage("-----\nApplyCustomerListUserData:");
            ApplyCustomerListUserDataResponse applyCustomerListUserDataResponse = CampaignManagementExampleHelper.applyCustomerListUserData(customerListUserData);
            ArrayOfBatchError customerListUserDataErrors = applyCustomerListUserDataResponse.getPartialErrors();
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(customerListUserDataErrors);
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
 }

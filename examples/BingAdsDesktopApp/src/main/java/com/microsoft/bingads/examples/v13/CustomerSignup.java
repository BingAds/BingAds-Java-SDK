package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.customermanagement.*;

public class CustomerSignup extends ExampleBase {
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData();
            	         
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            outputStatusMessage("-----\nGetUser:");
            GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(
                    null);
            User user = getUserResponse.getUser();
            outputStatusMessage("User:");
            CustomerManagementExampleHelper.outputUser(user);
            outputStatusMessage("CustomerRoles:");
            CustomerManagementExampleHelper.outputArrayOfCustomerRole(getUserResponse.getCustomerRoles());
                            
            // Only a user with the aggregator role (33) can sign up new customers. 
            // If the user does not have the aggregator role, then do not continue.
            
            ArrayOfint roleIds = new ArrayOfint();
            for(CustomerRole customerRole : getUserResponse.getCustomerRoles().getCustomerRoles()){
                roleIds.getInts().add(customerRole.getRoleId());
            }
            if(!roleIds.getInts().contains(33))
            {
                outputStatusMessage("Only a user with the aggregator role (33) can sign up new customers.");
                return;
            }

            Customer customer = new Customer();

            // The primary business segment of the customer, for example, automotive, food, or entertainment.
            customer.setIndustry(Industry.OTHER);

            // The primary country where the customer operates. 
            customer.setMarketCountry("US");

            // The primary language that the customer uses. 
            customer.setMarketLanguage(LanguageType.ENGLISH);

            // The name of the customer.
            customer.setName("Child Customer " + System.currentTimeMillis());
                        
            AdvertiserAccount account = new AdvertiserAccount();

            // The location where your business is legally registered. 
            // The business address is used to determine your tax requirements.
            Address businessAddress = new Address();
            businessAddress.setBusinessName("Contoso");
            businessAddress.setCity("Redmond");
            businessAddress.setLine1("One Microsoft Way");
            businessAddress.setPostalCode("98052");
            businessAddress.setStateOrProvince("WA");
            account.setBusinessAddress(businessAddress);

            // The type of currency that is used to settle the account. 
            // The service uses the currency information for billing purposes.
            account.setCurrencyCode(CurrencyCode.USD);

            // The name of the account. 
            account.setName("Child Account " + System.currentTimeMillis());

            // The identifier of the customer that owns the account. 
            account.setParentCustomerId((long)user.getCustomerId());

            // The TaxInformation (VAT identifier) is optional. If specified, The VAT identifier must be valid 
            // in the country that you specified in the BusinessAddress element. Without a VAT registration 
            // number or exemption certificate, taxes might apply based on your business location.
            account.setTaxInformation(null);

            // The default time-zone for campaigns in this account.
            account.setTimeZone(TimeZoneType.PACIFIC_TIME_US_CANADA_TIJUANA);
            
            // Signup a new customer and account for the reseller. 
            outputStatusMessage("-----\nSignupCustomer:");
            SignupCustomerResponse signupCustomerResponse = CustomerManagementExampleHelper.signupCustomer(
                customer,
                account,
                user.getCustomerId());

            outputStatusMessage("New Customer and Account:");

            // This is the identifier that you will use to set the CustomerId 
            // element in most of the Bing Ads API service operations.
            outputStatusMessage(String.format("\tCustomerId: %s", signupCustomerResponse.getCustomerId()));

            // The read-only system-generated customer number that is used in the Bing Ads web application. 
            // The customer number is of the form, Cnnnnnnn, where nnnnnnn is a series of digits.
            outputStatusMessage(String.format("\tCustomerNumber: %s", signupCustomerResponse.getCustomerNumber()));

            // This is the identifier that you will use to set the AccountId and CustomerAccountId 
            // elements in most of the Bing Ads API service operations.
            outputStatusMessage(String.format("\tAccountId: %s", signupCustomerResponse.getAccountId()));

            // The read-only system generated account number that is used to identify the account in the Bing Ads web application. 
            // The account number has the form xxxxxxxx, where xxxxxxxx is a series of any eight alphanumeric characters.
            outputStatusMessage(String.format("\tAccountNumber: %s\n", signupCustomerResponse.getAccountNumber()));        
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}

package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.customermanagement.*;

public class CustomerSignup extends ExampleBase {
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData(null,null);
            	         
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(null);
            User user = getUserResponse.getUser();
                            
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

            // The list of key and value strings for forward compatibility. This element can be used
            // to avoid otherwise breaking changes when new elements are added in future releases.
            // There are currently no forward compatibility changes for the Customer object.
            customer.setForwardCompatibilityMap(null);

            // The primary business segment of the customer, for example, automotive, food, or entertainment.
            customer.setIndustry(Industry.OTHER);

            // The primary country where the customer operates. This country will be the 
            // default country for ad groups in the customer�s campaigns.
            customer.setMarketCountry("US");

            // The primary language that the customer uses. This language will be the 
            // default language for ad groups in the customer�s campaigns.
            customer.setMarketLanguage(LanguageType.ENGLISH);

            // The name of the customer. This element can contain a maximum of 100 characters.
            customer.setName("Child Customer " + System.currentTimeMillis());
            
            
            AdvertiserAccount account = new AdvertiserAccount();

            // The location where your business is legally registered. 
            // The business address is used to determine your tax requirements.
            // BusinessAddress will be required in a future version of the Bing Ads API.
            // Please start using it.
            Address businessAddress = new Address();
            businessAddress.setBusinessName("Microsoft Corporation");
            businessAddress.setCity("Redmond");
            businessAddress.setLine1("One Microsoft Way");
            businessAddress.setPostalCode("98052");
            businessAddress.setStateOrProvince("WA");
            account.setBusinessAddress(businessAddress);

            // The type of currency that is used to settle the account. The service uses the currency information for billing purposes.
            account.setCurrencyCode(CurrencyCode.USD);

    	    // Optionally you can set up each account with auto tagging.
            // The AutoTag key and value pair is an account level setting that determines whether to append or replace 
            // the supported UTM tracking codes within the final URL of ads delivered. The default value is '0', and
            // Bing Ads will not append any UTM tracking codes to your ad or keyword final URL.
            account.setAutoTagType(AutoTagType.INACTIVE);

            // The name of the account. The name can contain a maximum of 100 characters and must be unique within the customer.
            account.setName("Child Account " + System.currentTimeMillis());

            // The identifier of the customer that owns the account. In the Bing Ads API operations 
            // that require a customer identifier, this is the identifier that you set the CustomerId SOAP header to.
            account.setParentCustomerId((long)user.getCustomerId());

            // The TaxInformation (VAT identifier) is optional. If specified, The VAT identifier must be valid 
            // in the country that you specified in the BusinessAddress element. Without a VAT registration 
            // number or exemption certificate, taxes might apply based on your business location.
            account.setTaxInformation(null);

            // The default time-zone value to use for campaigns in this account.
            // If not specified, the time zone will be set to PacificTimeUSCanadaTijuana by default.
            // TimeZone will be required in a future version of the Bing Ads API.
            // Please start using it.
            account.setTimeZone(TimeZoneType.PACIFIC_TIME_US_CANADA_TIJUANA);
            
            // Signup a new customer and account for the reseller. 
            SignupCustomerResponse signupCustomerResponse = CustomerManagementExampleHelper.signupCustomer(
                customer,
                account,
                user.getCustomerId());

            outputStatusMessage(String.format("New Customer and Account:\n"));

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
            
            outputStatusMessage("Program execution completed\n"); 
        
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
}

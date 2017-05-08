package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.customermanagement.*;

public class CustomerSignup extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            	         
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            GetUserResponse getUserResponse = getUser(null);
            User user = getUserResponse.getUser();
                            
            // Only a user with the aggregator role (33) can sign up new customers. 
            // If the user does not have the aggregator role, then do not continue.
            if(!getUserResponse.getRoles().getInts().contains(33))
            {
                outputStatusMessage("Only a user with the aggregator role (33) can sign up new customers.");
                return;
            }

            // For Customer.CustomerAddress and Account.BusinessAddress, you can use the same address 
            // as your aggregator user, although you must set Id and TimeStamp to null.
            Address userAddress = user.getContactInfo().getAddress();
            userAddress.setId(null);
            userAddress.setTimeStamp(null);

            Customer customer = new Customer();
            
            // The customer's business address.
            customer.setCustomerAddress(userAddress);

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
            
            // The type of account. Bing Ads API only supports the Advertiser account.
            account.setAccountType(AccountType.ADVERTISER);

            // The location where your business is legally registered. 
            // The business address is used to determine your tax requirements.
            // BusinessAddress will be required in a future version of the Bing Ads API.
            // Please start using it.
            account.setBusinessAddress(userAddress);

            // The type of currency that is used to settle the account. The service uses the currency information for billing purposes.
            account.setCurrencyType(CurrencyType.US_DOLLAR);

    		// Optionally you can set up each account with auto tagging.
            // The AutoTag key and value pair is an account level setting that determines whether to append or replace 
            // the supported UTM tracking codes within the final URL of ads delivered. The default value is '0', and
            // Bing Ads will not append any UTM tracking codes to your ad or keyword final URL.
            ArrayOfKeyValuePairOfstringstring accountFCM = new ArrayOfKeyValuePairOfstringstring();
            KeyValuePairOfstringstring autoTag = new KeyValuePairOfstringstring();
            autoTag.setKey("AutoTag");
            autoTag.setValue("0");
            accountFCM.getKeyValuePairOfstringstrings().add(autoTag);
                    
            // The list of key and value strings for forward compatibility. This element can be used
            // to avoid otherwise breaking changes when new elements are added in future releases.
            account.setForwardCompatibilityMap(accountFCM);

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
            SignupCustomerResponse signupCustomerResponse = signupCustomer(
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
        
        // Customer Management service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
	            outputStatusMessage("AdApiError\n");
	            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Customer Management service operations can throw ApiFault.
        } catch (ApiFault_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
	            outputStatusMessage("OperationError\n");
	            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
        } catch (Exception ex) {
             outputStatusMessage("Error encountered: ");
             outputStatusMessage(ex.getMessage());
             ex.printStackTrace();
        }
    }

    
    // Gets a Bing Ads user and user roles by the specified Bing Ads user identifier.

    static GetUserResponse getUser(java.lang.Long userId) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	GetUserRequest request = new GetUserRequest();
        request.setUserId(userId);

        return CustomerService.getService().getUser(request);
    }
    
    // Creates a new child customer and account that rolls up to the reseller's billing invoice.
    
    static SignupCustomerResponse signupCustomer(
    		Customer customer,
    		Account account,
    		java.lang.Long parentCustomerId
    	) throws AdApiFaultDetail_Exception, ApiFault_Exception {       
		
        final SignupCustomerRequest signupCustomerRequest = new SignupCustomerRequest();
        signupCustomerRequest.setCustomer(customer);
        signupCustomerRequest.setAccount(account);
        signupCustomerRequest.setParentCustomerId(parentCustomerId);
        
		return CustomerService.getService().signupCustomer(signupCustomerRequest);
	}
}

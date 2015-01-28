<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.net.URL" %>
<%@ page import="com.microsoft.bingads.*" %>
<%@ page import="com.microsoft.bingads.customermanagement.*" %>

<%! 

//Copyright 2015 Microsoft Corporation 

//Licensed under the Apache License, Version 2.0 (the "License"); 
//you may not use this file except in compliance with the License. 
//You may obtain a copy of the License at 

// http://www.apache.org/licenses/LICENSE-2.0 

//Unless required by applicable law or agreed to in writing, software 
//distributed under the License is distributed on an "AS IS" BASIS, 
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
//See the License for the specific language governing permissions and 
//limitations under the License. 

	static AuthorizationData authorizationData;
	static ServiceClient<ICustomerManagementService> CustomerService; 
	
	private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
	private static java.lang.String ClientId = "<ClientIdGoesHere>";
	private static java.lang.String ClientSecret = "<ClientSecretGoesHere>";
	
	static long accountsCount = 0;
 %>
 
 <%! 
	//Gets a User object by the specified Bing Ads user identifier.
	
	 static User getUser(java.lang.Long userId) throws Exception
	 {
	     GetUserRequest request = new GetUserRequest();
	     
	     request.setUserId(userId);
	
	     return CustomerService.getService().getUser(request).getUser();
	 }
	
	 // Searches by UserId for accounts that the user can manage.
	 
	 static ArrayOfAccount searchAccountsByUserId(java.lang.Long userId) throws AdApiFaultDetail_Exception, ApiFault_Exception{       
			
	     ArrayOfPredicate predicates = new ArrayOfPredicate();
	     Predicate predicate = new Predicate();
	     predicate.setField("UserId");
	     predicate.setOperator(PredicateOperator.EQUALS);
	     predicate.setValue("" + userId);
	     predicates.getPredicates().add(predicate);
	     
	     Paging paging = new Paging();
	     paging.setIndex(0);
	     paging.setSize(10);
			
	     final SearchAccountsRequest searchAccountsRequest = new SearchAccountsRequest();
	     searchAccountsRequest.setPredicates(predicates);
	     searchAccountsRequest.setPageInfo(paging);
	     
	     return CustomerService.getService().searchAccounts(searchAccountsRequest).getAccounts();
	 }
	
	 // Outputs the account and parent customer identifiers for the specified accounts.
	
	 static void printAccounts(ArrayOfAccount accounts) throws Exception
	 {
	     for (Account account : accounts.getAccounts())
	     {
	     	System.out.printf("AccountId: %d\n", account.getId());
	     	System.out.printf("CustomerId: %d\n\n", account.getParentCustomerId());
	     }
	 }
 %>

<%
	// Main execution  

  try {

      	OAuthWebAuthCodeGrant oAuthWebAuthCodeGrant = new OAuthWebAuthCodeGrant(
			ClientId, 
			ClientSecret, 
			new URL(RedirectUri));

      	if (authorizationData == null) {
          	if (request.getParameter("code") == null) {				
				URL authorizationUrl = oAuthWebAuthCodeGrant.getAuthorizationEndpoint();
				response.sendRedirect(authorizationUrl.toString());
				return;
			} else {		
				OAuthTokens tokens = oAuthWebAuthCodeGrant.requestAccessAndRefreshTokens(
					new URL(request.getRequestURL() + "?" + request.getQueryString()));
		
				authorizationData = new AuthorizationData();
				authorizationData.setDeveloperToken(DeveloperToken);
				authorizationData.setAuthentication(oAuthWebAuthCodeGrant);
			}
		}

		CustomerService = new ServiceClient<ICustomerManagementService>(
			authorizationData, 
			ICustomerManagementService.class);

		User user = getUser(null);

      // Search for the accounts that the user can access.
      
      ArrayOfAccount accounts = searchAccountsByUserId(user.getId());
      accountsCount = accounts.getAccounts().size();

      System.out.println("The user can access the following Bing Ads accounts: \n");
      printAccounts(accounts);

	// Customer Management service operations can throw AdApiFaultDetail.
    } catch (AdApiFaultDetail_Exception ex) {
        System.out.println("The operation failed with the following faults:\n");

        for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
        {
            System.out.printf("AdApiError\n");
            System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
        }
    
    // Customer Management service operations can throw ApiFault.
    } catch (ApiFault_Exception ex) {
        System.out.println("The operation failed with the following faults:\n");

        for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
        {
            System.out.printf("OperationError\n");
            System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
        }
    } catch (Exception ex) {
    	System.out.println("Error encountered: ");
        System.out.println(ex.getMessage());
        ex.printStackTrace();
    }	
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>Bing Ads Web Application Example</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
    <div id="content" class="container">
    	<div>
    		<br/>    		    		
    		<b>You have <%= accountsCount %> accounts</b>    		
    		
    	</div> 
    </div>
</body>
</html>
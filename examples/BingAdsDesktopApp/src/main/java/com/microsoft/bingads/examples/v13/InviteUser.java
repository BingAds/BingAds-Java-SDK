package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.customermanagement.*;

public class InviteUser extends ExampleBase {
    
    // Specify the email address where the invitation should be sent. 
    // The recipient can accept the invitation and sign up 
    // with credentials that differ from the invitation email address.
    
    final static java.lang.String UserInviteRecipientEmail = "UserInviteRecipientEmailGoesHere";
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            outputStatusMessage("You must edit this example to provide the email address (UserInviteRecipientEmail) for " +
                "the user invitation.");
            outputStatusMessage("You must use Super Admin credentials to send a user invitation.");
            
            authorizationData = getAuthorizationData(); 
            java.lang.Long customerId = authorizationData.getCustomerId();
            	         
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            // Prepare to invite a new user
            UserInvitation userInvitation = new UserInvitation();
            
            // The identifier of the customer this user is invited to manage. 
            // The AccountIds element determines which customer accounts the user can manage.
            userInvitation.setCustomerId(customerId);

            // Users with account level roles such as Advertiser Campaign Manager can be restricted to specific accounts. 
            // Users with customer level roles such as Super Admin can access all accounts within the user�s customer, 
            // and their access cannot be restricted to specific accounts.
            userInvitation.setAccountIds(null);

            // The user role, which determines the level of access that the user has to the accounts specified in the AccountIds element.
            // For example you can use Role Id 16 for Advertiser Campaign Manager.
            userInvitation.setRoleId(16);

            // The email address where the invitation should be sent. 
            userInvitation.setEmail(UserInviteRecipientEmail);

            // The first name of the user. 
            userInvitation.setFirstName("FirstNameGoesHere");

            // The last name of the user. 
            userInvitation.setLastName("LastNameGoesHere");

            // The locale to use when sending correspondence to the user by email or postal mail. The default is EnglishUS.
            userInvitation.setLcid(LCID.ENGLISH_US);
                        
            // Once you send a user invitation, there is no option to rescind the invitation using the API.
            // You can delete a pending invitation in the Accounts & Billing -> Users tab of the Bing Ads web application.
            java.lang.Long userInvitationId = CustomerManagementExampleHelper.sendUserInvitation(
                    userInvitation).getUserInvitationId();
            outputStatusMessage(String.format("Sent new user invitation to %s.", UserInviteRecipientEmail));

            // It is possible to have multiple pending invitations sent to the same email address, 
            // which have not yet expired. It is also possible for those invitations to have specified 
            // different user roles, for example if you sent an invitation with an incorrect user role 
            // and then sent a second invitation with the correct user role. The recipient can accept 
            // any of the invitations. The Bing Ads API does not support any operations to delete 
            // pending user invitations. After you invite a user, the only way to cancel the invitation 
            // is through the Bing Ads web application. You can find both pending and accepted invitations 
            // in the Users section of Accounts & Billing.

            // Since a recipient can accept the invitation with credentials that differ from 
            // the invitation email address, you cannot determine with certainty the mapping from UserInvitation 
            // to accepted User. You can only determine whether the invitation has been accepted or has expired. 
            // The SearchUserInvitations operation returns all pending invitations, whether or not they have expired. 
            // Accepted invitations are not included in the SearchUserInvitations response.  

            ArrayOfPredicate predicates = new ArrayOfPredicate();
            Predicate predicate = new Predicate();
            predicate.setField("CustomerId");
            predicate.setOperator(PredicateOperator.IN);
            predicate.setValue(String.valueOf(customerId));
            predicates.getPredicates().add(predicate);
            
            outputStatusMessage("-----\nSearchUserInvitations:");
            ArrayOfUserInvitation userInvitations = CustomerManagementExampleHelper.searchUserInvitations(
                    predicates).getUserInvitations();
            outputStatusMessage("UserInvitations:");
            CustomerManagementExampleHelper.outputArrayOfUserInvitation(userInvitations);

            // After the invitation has been accepted, you can call GetUsersInfo and GetUser to access the Bing Ads user details. 
            // Once again though, since a recipient can accept the invitation with credentials that differ from 
            // the invitation email address, you cannot determine with certainty the mapping from UserInvitation 
            // to accepted User. 

            outputStatusMessage("-----\nGetUsersInfo:");
            ArrayOfUserInfo usersInfo = CustomerManagementExampleHelper.getUsersInfo(
                    customerId, 
                    null).getUsersInfo();
            outputStatusMessage("UsersInfo:");
            CustomerManagementExampleHelper.outputArrayOfUserInfo(usersInfo);
            
            for (UserInfo userInfo : usersInfo.getUserInfos())
            {
                outputStatusMessage("-----\nGetUser:");
                GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(
                        userInfo.getId());
                User user = getUserResponse.getUser();
                outputStatusMessage("User:");
                CustomerManagementExampleHelper.outputUser(user);
                outputStatusMessage("CustomerRoles:");
            }
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}

package com.microsoft.bingads.examples.v12;

import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.customermanagement.*;

public class InviteUser extends ExampleBase {
    
    // Specify the email address where the invitation should be sent. 
    // It is important to note that the recipient can accept the invitation 
    // and sign into Bing Ads with a Microsoft account different than the invitation email address.
    final static java.lang.String UserInviteRecipientEmail = "<UserInviteRecipientEmailGoesHere>";
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            outputStatusMessage("You must edit this example to provide the email address (UserInviteRecipientEmail) for " +
                "the user invitation.");
            outputStatusMessage("You must use Super Admin credentials to send a user invitation.\n");
            
            authorizationData = getAuthorizationData(null,null); 
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

            // The email address where the invitation should be sent. This element can contain a maximum of 100 characters.
            userInvitation.setEmail(UserInviteRecipientEmail);

            // The first name of the user. This element can contain a maximum of 40 characters.
            userInvitation.setFirstName("FirstNameGoesHere");

            // The last name of the user. This element can contain a maximum of 40 characters.
            userInvitation.setLastName("LastNameGoesHere");

            // The locale to use when sending correspondence to the user by email or postal mail. The default is EnglishUS.
            userInvitation.setLcid(LCID.ENGLISH_US);
            
            
            // Once you send a user invitation, there is no option to rescind the invitation using the API.
            // You can delete a pending invitation in the Accounts & Billing -> Users tab of the Bing Ads web application. 
            java.lang.Long userInvitationId = CustomerManagementExampleHelper.sendUserInvitation(userInvitation).getUserInvitationId();
            outputStatusMessage(String.format("Sent new user invitation to %s.\n", UserInviteRecipientEmail));

            // It is possible to have multiple pending invitations sent to the same email address, 
            // which have not yet expired. It is also possible for those invitations to have specified 
            // different user roles, for example if you sent an invitation with an incorrect user role 
            // and then sent a second invitation with the correct user role. The recipient can accept 
            // any of the invitations. The Bing Ads API does not support any operations to delete 
            // pending user invitations. After you invite a user, the only way to cancel the invitation 
            // is through the Bing Ads web application. You can find both pending and accepted invitations 
            // in the Users section of Accounts & Billing.

            // Since a recipient can accept the invitation and sign into Bing Ads with a Microsoft account different 
            // than the invitation email address, you cannot determine with certainty the mapping from UserInvitation 
            // to accepted User. You can search by the invitation ID (returned by SendUserInvitations), 
            // only to the extent of finding out whether or not the invitation has been accepted or has expired. 
            // The SearchUserInvitations operation returns all pending invitations, whether or not they have expired. 
            // Accepted invitations are not included in the SearchUserInvitations response.  

            // This example searches for all user invitations of the customer that you manage,
            // and then filters the search results to find the invitation sent above.
            // Note: In this example the invitation (sent above) should be active and not expired. You can set a breakpoint 
            // and then either accept or delete the invitation in the Bing Ads web application to change the invitation status.

            ArrayOfPredicate predicates = new ArrayOfPredicate();
            Predicate predicate = new Predicate();
            predicate.setField("CustomerId");
            predicate.setOperator(PredicateOperator.IN);
            predicate.setValue(String.valueOf(customerId));
            predicates.getPredicates().add(predicate);
            
            ArrayOfUserInvitation userInvitations = CustomerManagementExampleHelper.searchUserInvitations(predicates).getUserInvitations();
            outputStatusMessage("Existing UserInvitation(s):\n");
            CustomerManagementExampleHelper.outputArrayOfUserInvitation(userInvitations);

            // Determine whether the invitation has been accepted or has expired.
            // If you specified a valid InvitationId, and if the invitation is not found, 
            // then the recipient has accepted the invitation. 
            // If the invitation is found, and if the expiration date is later than the current date and time,
            // then the invitation is still pending and has not yet expired. 
            UserInvitation pendingInvitation = null;
            TimeZone utc = TimeZone.getTimeZone("UTC");
            Calendar todayInUtc = Calendar.getInstance(utc);
            for (UserInvitation invitation : userInvitations.getUserInvitations()){
            	invitation.getExpirationDate().setTimeZone(utc);
            	if ((invitation.getId().compareTo(userInvitationId) == 0) && 
                    (invitation.getExpirationDate().compareTo(todayInUtc) > 0)){
            		
            		pendingInvitation = invitation;
            		break;
            	}
            }
            
            // You can send a new invitation if the invitation was either not found, has expired, 
            // or the user has accepted the invitation. This example does not send a new invitation if the 
            // invitationId was found and has not yet expired, i.e. the invitation is pending.
            if (pendingInvitation == null)
            {
                // Once you send a user invitation, there is no option to rescind the invitation using the API.
                // You can delete a pending invitation in the Accounts & Billing -> Users tab of the Bing Ads web application. 
                userInvitationId = CustomerManagementExampleHelper.sendUserInvitation(userInvitation).getUserInvitationId();
                outputStatusMessage(String.format("Sent new user invitation to %s.\n", UserInviteRecipientEmail));
            }
            else
            {
                outputStatusMessage(String.format("UserInvitationId %s is pending.\n", userInvitationId));
            }

            // After the invitation has been accepted, you can call GetUsersInfo and GetUser to access the Bing Ads user details. 
            // Once again though, since a recipient can accept the invitation and sign into Bing Ads with a Microsoft account 
            // different than the invitation email address, you cannot determine with certainty the mapping from UserInvitation 
            // to accepted User. With the user ID returned by GetUsersInfo or GetUser, you can call DeleteUser to remove the user.

            ArrayOfUserInfo usersInfo = CustomerManagementExampleHelper.getUsersInfo(customerId, null).getUsersInfo();
            
            for (UserInfo userInfo : usersInfo.getUserInfos()){
            	GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(userInfo.getId());
                CustomerManagementExampleHelper.outputUser(getUserResponse.getUser());
                CustomerManagementExampleHelper.outputArrayOfCustomerRole(getUserResponse.getCustomerRoles());
            }
            
            outputStatusMessage("\nProgram execution completed\n"); 
        
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
}

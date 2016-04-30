package com.microsoft.bingads.examples.v9;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;

import com.microsoft.bingads.*;
import com.microsoft.bingads.customermanagement.*;

public class InviteUser extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    // Specify the email address where the invitation should be sent. 
    // It is important to note that the recipient can accept the invitation 
    // and sign into Bing Ads with a Microsoft account different than the invitation email address.
    final static java.lang.String UserInviteRecipientEmail = "<UserInviteRecipientEmailGoesHere>";
    
    /*
	private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    */
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
    		outputStatusMessage("You must edit this example to provide the email address (UserInviteRecipientEmail) for " +
                    "the user invitation.");
            outputStatusMessage("You must use Super Admin credentials to send a user invitation.\n");
            
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            	         
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    ICustomerManagementService.class);
            
            // Prepare to invite a new user
            UserInvitation userInvitation = new UserInvitation();
            
            // The identifier of the customer this user is invited to manage. 
            // The AccountIds element determines which customer accounts the user can manage.
            userInvitation.setCustomerId(CustomerId);

            // Users with account level roles such as Advertiser Campaign Manager can be restricted to specific accounts. 
            // Users with customer level roles such as Super Admin can access all accounts within the user�s customer, 
            // and their access cannot be restricted to specific accounts.
            userInvitation.setAccountIds(null);

            // The user role, which determines the level of access that the user has to the accounts specified in the AccountIds element.
            userInvitation.setRole(UserRole.ADVERTISER_CAMPAIGN_MANAGER);

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
            java.lang.Long userInvitationId = sendUserInvitation(userInvitation);
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
            predicate.setValue(String.valueOf(CustomerId));
            predicates.getPredicates().add(predicate);
            
            ArrayOfUserInvitation userInvitations = searchUserInvitations(predicates);
            outputStatusMessage("Existing UserInvitation(s):\n");
            outputUserInvitations(userInvitations);

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
                userInvitationId = sendUserInvitation(userInvitation);
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

            ArrayOfUserInfo usersInfo = getUsersInfo(CustomerId);
            UserInfo confirmedUserInfo = null;
            
            for (UserInfo userInfo : usersInfo.getUserInfos()){
            	if (Objects.equals(userInfo.getUserName(), UserInviteRecipientEmail)){
            		confirmedUserInfo = userInfo;
            		break;
            	}
            }

            // If a user has already accepted an invitation, you can call GetUser to view all user details.
            if (confirmedUserInfo != null)
            {
            	GetUserResponse getUserResponse = getUser(confirmedUserInfo.getId());
                outputStatusMessage("Found Requested User Details (Not necessarily related to above Invitation ID(s):");
                outputUser(getUserResponse.getUser());
                outputStatusMessage("Role Ids:");
                for (int role : getUserResponse.getRoles().getInts()){
                	outputStatusMessage(String.format("%s; ", role));
                }
                
                // You have the option of calling DeleteUser to revoke a user's access to your customer accounts.
                // Note: Only a super admin or aggregator user can delete users.
                //byte[] timeStamp = getUserResponse.getUser().getTimeStamp();
                //deleteUser(confirmedUserInfo.getId(), timeStamp);
                //outputStatusMessage(String.format("Deleted UserName %s.\n", UserInviteRecipientEmail));
            }
            
            outputStatusMessage("\nProgram execution completed\n"); 
        
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

    // Searches user invitations for the customer of the current authenticated user,
    // filtered by the search criteria.

    static ArrayOfUserInvitation searchUserInvitations(ArrayOfPredicate predicates) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	SearchUserInvitationsRequest request = new SearchUserInvitationsRequest();
        request.setPredicates(predicates);

        return CustomerService.getService().searchUserInvitations(request).getUserInvitations();
    }
    
    // Invites a user to manage one or more accounts of a customer. 
    
    static java.lang.Long sendUserInvitation(UserInvitation userInvitation) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	SendUserInvitationRequest request = new SendUserInvitationRequest();
        request.setUserInvitation(userInvitation);

        return CustomerService.getService().sendUserInvitation(request).getUserInvitationId();
    }
    
    // Gets a Bing Ads user and user roles by the specified Bing Ads user identifier.

    static GetUserResponse getUser(java.lang.Long userId) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	GetUserRequest request = new GetUserRequest();
        request.setUserId(userId);

        return CustomerService.getService().getUser(request);
    }
    
    // Gets the username and user ID for each user managed by the specified customer ID.
    
    static ArrayOfUserInfo getUsersInfo(java.lang.Long customerId) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	GetUsersInfoRequest request = new GetUsersInfoRequest();
        request.setCustomerId(customerId);

        return CustomerService.getService().getUsersInfo(request).getUsersInfo();
    }
    
    // Deletes the user corresponding to the specified user identifier.

    static void deleteUser(java.lang.Long userId, byte[] timeStamp) throws AdApiFaultDetail_Exception, ApiFault_Exception {
        
    	DeleteUserRequest request = new DeleteUserRequest();
        request.setUserId(userId);
        request.setTimeStamp(timeStamp);

        CustomerService.getService().deleteUser(request);
    }
    
    // Outputs a list of user invitations.
    
    private static void outputUserInvitations(ArrayOfUserInvitation userInvitations)
    {
        if (userInvitations.getUserInvitations() == null)
        {
            return;
        }

        for (UserInvitation userInvitation : userInvitations.getUserInvitations())
        {
            outputStatusMessage(String.format("FirstName: %s", userInvitation.getFirstName()));
            outputStatusMessage(String.format("LastName: %s", userInvitation.getLastName()));
            outputStatusMessage(String.format("Email: %s", userInvitation.getEmail()));
            outputStatusMessage(String.format("Role: %s", userInvitation.getRole()));
            outputStatusMessage(String.format("Invitation Id: %s\n", userInvitation.getId()));
        }
    }

    // Outputs a subset of the properties of a User data object.
    
    private static void outputUser(User user)
    {
        outputStatusMessage(String.format("Id: %s", user.getId()));
        outputStatusMessage(String.format("UserName: %s", user.getUserName()));
        outputStatusMessage(String.format("Contact Email: %s", user.getContactInfo().getEmail()));
        outputStatusMessage(String.format("First Name: %s", user.getName().getFirstName()));
        outputStatusMessage(String.format("Last Name: %s", user.getName().getLastName()));
    }
    
}
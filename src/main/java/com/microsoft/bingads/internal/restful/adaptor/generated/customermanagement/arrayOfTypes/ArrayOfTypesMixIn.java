package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<AccountInfo> getAccountInfos();

            
	@JsonValue
	List<CustomerInfo> getCustomerInfos();

            
	@JsonValue
	List<CustomerRole> getCustomerRoles();

            
	@JsonValue
	List<UserInfo> getUserInfos();

            
	@JsonValue
	List<PilotFeature> getPilotFeatures();

            
	@JsonValue
	List<AccountInfoWithCustomerData> getAccountInfoWithCustomerDatas();

            
	@JsonValue
	List<Predicate> getPredicates();

            
	@JsonValue
	List<OrderBy> getOrderBies();

            
	@JsonValue
	List<Customer> getCustomers();

            
	@JsonValue
	List<ClientLink> getClientLinks();

            
	@JsonValue
	List<AdvertiserAccount> getAdvertiserAccounts();

            
	@JsonValue
	List<UserInvitation> getUserInvitations();

            
	@JsonValue
	List<Address> getAddress();

            
	@JsonValue
	List<Notification> getNotifications();

            
	@JsonValue
	List<KeyValueEntityOfstringstring> getKeyValueEntityOfstringstrings();

            
	@JsonValue
	List<KeyValueEntityOflongint> getKeyValueEntityOflongints();

            
	@JsonValue
	List<AdApiError> getAdApiErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<ArrayOfOperationError> getArrayOfOperationErrors();

            
	@JsonValue
	List<KeyValuePairOfstringstring> getKeyValuePairOfstringstrings();

            
	@JsonValue
	List<KeyValuePairOfstringbase64Binary> getKeyValuePairOfstringbase64Binaries();

            
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<Integer> getInts();

            
	@JsonValue
	List<String> getStrings();

        }
package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<String> getStrings();

            
	@JsonValue
	List<BillingDocumentInfo> getBillingDocumentInfos();

            
	@JsonValue
	List<BillingDocument> getBillingDocuments();

            
	@JsonValue
	List<Predicate> getPredicates();

            
	@JsonValue
	List<OrderBy> getOrderBies();

            
	@JsonValue
	List<InsertionOrder> getInsertionOrders();

            
	@JsonValue
	List<Coupon> getCoupons();

            
	@JsonValue
	List<KeyValueEntityOflongstring> getKeyValueEntityOflongstrings();

            
	@JsonValue
	List<KeyValueEntityOflongdateTime> getKeyValueEntityOflongdateTimes();

            
	@JsonValue
	List<AdApiError> getAdApiErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<BatchError> getBatchErrors();

            
	@JsonValue
	List<ArrayOfOperationError> getArrayOfOperationErrors();

        }
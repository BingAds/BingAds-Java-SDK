package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY, 
	      property = "Type",
		  visible = true)
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = MaxClicksBiddingScheme.class, name = "MaxClicks"),
						
			@JsonSubTypes.Type(value = MaxConversionsBiddingScheme.class, name = "MaxConversions"),
						
			@JsonSubTypes.Type(value = TargetCpaBiddingScheme.class, name = "TargetCpa"),
						
			@JsonSubTypes.Type(value = ManualCpcBiddingScheme.class, name = "ManualCpc"),
						
			@JsonSubTypes.Type(value = EnhancedCpcBiddingScheme.class, name = "EnhancedCpc"),
						
			@JsonSubTypes.Type(value = ManualCpvBiddingScheme.class, name = "ManualCpv"),
						
			@JsonSubTypes.Type(value = ManualCpmBiddingScheme.class, name = "ManualCpm"),
						
			@JsonSubTypes.Type(value = InheritFromParentBiddingScheme.class, name = "InheritFromParent"),
						
			@JsonSubTypes.Type(value = TargetRoasBiddingScheme.class, name = "TargetRoasBiddingScheme"),
						
			@JsonSubTypes.Type(value = MaxRoasBiddingScheme.class, name = "MaxRoasBiddingScheme"),
						
			@JsonSubTypes.Type(value = MaxConversionValueBiddingScheme.class, name = "MaxConversionValueBiddingScheme"),
						
			@JsonSubTypes.Type(value = TargetImpressionShareBiddingScheme.class, name = "TargetImpressionShareBiddingScheme"),
						
			@JsonSubTypes.Type(value = PercentCpcBiddingScheme.class, name = "PercentCpcBiddingScheme"),
						
			@JsonSubTypes.Type(value = CommissionBiddingScheme.class, name = "CommissionBiddingScheme"),
						
			@JsonSubTypes.Type(value = ManualCpaBiddingScheme.class, name = "ManualCpaBiddingScheme"),
						
			@JsonSubTypes.Type(value = CostPerSaleBiddingScheme.class, name = "CostPerSale"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface BiddingSchemePolymorphicTypesMixIn{

}
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
						
			@JsonSubTypes.Type(value = ProductPartition.class, name = "ProductPartition"),
						
			@JsonSubTypes.Type(value = HotelGroup.class, name = "HotelGroup"),
						
			@JsonSubTypes.Type(value = HotelAdvanceBookingWindowCriterion.class, name = "HotelAdvanceBookingWindowCriterion"),
						
			@JsonSubTypes.Type(value = HotelCheckInDateCriterion.class, name = "HotelCheckInDateCriterion"),
						
			@JsonSubTypes.Type(value = HotelCheckInDayCriterion.class, name = "HotelCheckInDayCriterion"),
						
			@JsonSubTypes.Type(value = HotelDateSelectionTypeCriterion.class, name = "HotelDateSelectionTypeCriterion"),
						
			@JsonSubTypes.Type(value = HotelLengthOfStayCriterion.class, name = "HotelLengthOfStayCriterion"),
						
			@JsonSubTypes.Type(value = ProductScope.class, name = "ProductScope"),
						
			@JsonSubTypes.Type(value = Webpage.class, name = "Webpage"),
						
			@JsonSubTypes.Type(value = AgeCriterion.class, name = "AgeCriterion"),
						
			@JsonSubTypes.Type(value = DeviceCriterion.class, name = "DeviceCriterion"),
						
			@JsonSubTypes.Type(value = DayTimeCriterion.class, name = "DayTimeCriterion"),
						
			@JsonSubTypes.Type(value = GenderCriterion.class, name = "GenderCriterion"),
						
			@JsonSubTypes.Type(value = RadiusCriterion.class, name = "RadiusCriterion"),
						
			@JsonSubTypes.Type(value = LocationCriterion.class, name = "LocationCriterion"),
						
			@JsonSubTypes.Type(value = LocationIntentCriterion.class, name = "LocationIntentCriterion"),
						
			@JsonSubTypes.Type(value = AudienceCriterion.class, name = "AudienceCriterion"),
						
			@JsonSubTypes.Type(value = ProfileCriterion.class, name = "ProfileCriterion"),
						
			@JsonSubTypes.Type(value = StoreCriterion.class, name = "StoreCriterion"),
						
			@JsonSubTypes.Type(value = DealCriterion.class, name = "DealCriterion"),
						
			@JsonSubTypes.Type(value = GenreCriterion.class, name = "GenreCriterion"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface CriterionPolymorphicTypesMixIn{

}
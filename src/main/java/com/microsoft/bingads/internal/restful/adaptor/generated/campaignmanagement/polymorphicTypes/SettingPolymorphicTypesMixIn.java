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
						
			@JsonSubTypes.Type(value = VerifiedTrackingSetting.class, name = "VerifiedTrackingSetting"),
						
			@JsonSubTypes.Type(value = ShoppingSetting.class, name = "ShoppingSetting"),
						
			@JsonSubTypes.Type(value = DynamicFeedSetting.class, name = "DynamicFeedSetting"),
						
			@JsonSubTypes.Type(value = DynamicSearchAdsSetting.class, name = "DynamicSearchAdsSetting"),
						
			@JsonSubTypes.Type(value = TargetSetting.class, name = "TargetSetting"),
						
			@JsonSubTypes.Type(value = CoOpSetting.class, name = "CoOpSetting"),
						
			@JsonSubTypes.Type(value = DisclaimerSetting.class, name = "DisclaimerSetting"),
						
			@JsonSubTypes.Type(value = HotelSetting.class, name = "HotelSetting"),
						
			@JsonSubTypes.Type(value = ResponsiveSearchAdsSetting.class, name = "ResponsiveSearchAdsSetting"),
						
			@JsonSubTypes.Type(value = PerformanceMaxSetting.class, name = "PerformanceMaxSetting"),
						
			@JsonSubTypes.Type(value = CallToActionSetting.class, name = "CallToActionSetting"),
						
			@JsonSubTypes.Type(value = VanityPharmaSetting.class, name = "VanityPharmaSetting"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface SettingPolymorphicTypesMixIn{

}
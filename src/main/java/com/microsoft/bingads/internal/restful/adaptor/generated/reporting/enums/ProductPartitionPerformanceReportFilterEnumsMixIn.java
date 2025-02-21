package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ProductPartitionPerformanceReportFilterEnumsMixIn{
		
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AccountStatusReportFilterDeserializer.class)
	Collection<AccountStatusReportFilter> getAccountStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AdGroupStatusReportFilterDeserializer.class)
	Collection<AdGroupStatusReportFilter> getAdGroupStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AdStatusReportFilterDeserializer.class)
	Collection<AdStatusReportFilter> getAdStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AssetGroupStatusReportFilterDeserializer.class)
	Collection<AssetGroupStatusReportFilter> getAssetGroupStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = CampaignStatusReportFilterDeserializer.class)
	Collection<CampaignStatusReportFilter> getCampaignStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = CampaignTypeReportFilterDeserializer.class)
	Collection<CampaignTypeReportFilter> getCampaignType();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = DeviceTypeReportFilterDeserializer.class)
	Collection<DeviceTypeReportFilter> getDeviceType();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = LanguageReportFilterDeserializer.class)
	Collection<LanguageReportFilter> getLanguage();

    }
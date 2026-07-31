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
public interface SearchTermLandingPageReportFilterEnumsMixIn{
		
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AdTypeReportFilterDeserializer.class)
	Collection<AdTypeReportFilter> getAdType();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = DeliveredMatchTypeReportFilterDeserializer.class)
	Collection<DeliveredMatchTypeReportFilter> getDeliveredMatchType();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = LanguageReportFilterDeserializer.class)
	Collection<LanguageReportFilter> getLanguage();

    }
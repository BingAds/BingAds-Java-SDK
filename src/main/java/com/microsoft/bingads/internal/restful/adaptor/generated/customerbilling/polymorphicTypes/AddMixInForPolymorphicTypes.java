package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.polymorphicTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForPolymorphicTypes {
	public static void AddMixInForPolymorphicTypes() {
		AdaptorUtil.mapper
				.addMixIn(ApplicationFault.class, ApplicationFaultPolymorphicTypesMixIn.class)
				.addMixIn(ApiFault.class, ApiFaultPolymorphicTypesMixIn.class)
				;
	}
}
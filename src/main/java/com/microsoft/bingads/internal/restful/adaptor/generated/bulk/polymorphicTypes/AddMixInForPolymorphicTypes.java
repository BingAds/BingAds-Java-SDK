package com.microsoft.bingads.internal.restful.adaptor.generated.bulk.polymorphicTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForPolymorphicTypes {
	public static void AddMixInForPolymorphicTypes() {
		AdaptorUtil.mapper
				.addMixIn(ApplicationFault.class, ApplicationFaultPolymorphicTypesMixIn.class)
				.addMixIn(BatchError.class, BatchErrorPolymorphicTypesMixIn.class)
				;
	}
}
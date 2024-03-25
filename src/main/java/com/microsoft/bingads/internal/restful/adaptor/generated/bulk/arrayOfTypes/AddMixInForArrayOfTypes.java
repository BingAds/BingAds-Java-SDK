package com.microsoft.bingads.internal.restful.adaptor.generated.bulk.arrayOfTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForArrayOfTypes {
	public static void AddMixInForArrayOfTypes() {
		AdaptorUtil.mapper
				.addMixIn(ArrayOfDownloadEntity.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBatchError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignScope.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdApiError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValuePairOfstringstring.class, ArrayOfTypesMixIn.class)
				;
	}
}
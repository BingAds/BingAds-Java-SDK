package com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(CompressionType.class, CompressionTypeMixIn.class)
				.addMixIn(DataScope.class, DataScopeMixIn.class)
				.addMixIn(DownloadEntity.class, DownloadEntityMixIn.class)
				.addMixIn(DownloadFileType.class, DownloadFileTypeMixIn.class)
				.addMixIn(ResponseMode.class, ResponseModeMixIn.class)
				;
	}
}
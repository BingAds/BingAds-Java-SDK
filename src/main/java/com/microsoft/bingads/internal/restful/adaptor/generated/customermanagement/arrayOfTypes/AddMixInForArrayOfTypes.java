package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.arrayOfTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForArrayOfTypes {
	public static void AddMixInForArrayOfTypes() {
		AdaptorUtil.mapper
				.addMixIn(ArrayOfAccountInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomerInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomerRole.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfUserInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfPilotFeature.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAccountInfoWithCustomerData.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfPredicate.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOrderBy.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomer.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfClientLink.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdvertiserAccount.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfUserInvitation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAddress.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfNotification.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueEntityOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueEntityOflongint.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdApiError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValuePairOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValuePairOfstringbase64Binary.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfint.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfstring.class, ArrayOfTypesMixIn.class)
				;
	}
}
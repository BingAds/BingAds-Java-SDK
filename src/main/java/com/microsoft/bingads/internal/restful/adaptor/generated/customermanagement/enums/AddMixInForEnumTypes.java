package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(AccountLifeCycleStatus.class, AccountLifeCycleStatusMixIn.class)
				.addMixIn(CurrencyCode.class, CurrencyCodeMixIn.class)
				.addMixIn(AccountFinancialStatus.class, AccountFinancialStatusMixIn.class)
				.addMixIn(LanguageType.class, LanguageTypeMixIn.class)
				.addMixIn(PaymentMethodType.class, PaymentMethodTypeMixIn.class)
				.addMixIn(TimeZoneType.class, TimeZoneTypeMixIn.class)
				.addMixIn(AutoTagType.class, AutoTagTypeMixIn.class)
				.addMixIn(TaxCertificateStatus.class, TaxCertificateStatusMixIn.class)
				.addMixIn(CustomerFinancialStatus.class, CustomerFinancialStatusMixIn.class)
				.addMixIn(Industry.class, IndustryMixIn.class)
				.addMixIn(ServiceLevel.class, ServiceLevelMixIn.class)
				.addMixIn(CustomerLifeCycleStatus.class, CustomerLifeCycleStatusMixIn.class)
				.addMixIn(LCID.class, LCIDMixIn.class)
				.addMixIn(EmailFormat.class, EmailFormatMixIn.class)
				.addMixIn(SecretQuestion.class, SecretQuestionMixIn.class)
				.addMixIn(UserLifeCycleStatus.class, UserLifeCycleStatusMixIn.class)
				.addMixIn(AccountAdditionalField.class, AccountAdditionalFieldMixIn.class)
				.addMixIn(PredicateOperator.class, PredicateOperatorMixIn.class)
				.addMixIn(OrderByField.class, OrderByFieldMixIn.class)
				.addMixIn(SortOrder.class, SortOrderMixIn.class)
				.addMixIn(ClientLinkStatus.class, ClientLinkStatusMixIn.class)
				;
	}
}
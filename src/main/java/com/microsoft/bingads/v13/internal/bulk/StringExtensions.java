package com.microsoft.bingads.v13.internal.bulk;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed.FeedCustomAttribute;
import com.microsoft.bingads.v13.bulk.entities.LocationTargetType;
import com.microsoft.bingads.v13.bulk.entities.Status;
import com.microsoft.bingads.v13.campaignmanagement.ActionAdExtensionActionType;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v13.campaignmanagement.AdRotation;
import com.microsoft.bingads.v13.campaignmanagement.AdRotationType;
import com.microsoft.bingads.v13.campaignmanagement.AdStatus;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfAssetLink;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCombinationRule;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfFrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfRuleItem;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfRuleItemGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.AssetLink;
import com.microsoft.bingads.v13.campaignmanagement.AssetLinkEditorialStatus;
import com.microsoft.bingads.v13.campaignmanagement.Bid;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.BusinessGeoCodeStatus;
import com.microsoft.bingads.v13.campaignmanagement.CombinationRule;
import com.microsoft.bingads.v13.campaignmanagement.CommissionBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v13.campaignmanagement.CriterionTypeGroup;
import com.microsoft.bingads.v13.campaignmanagement.CustomEventsRule;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v13.campaignmanagement.Date;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.DayTime;
import com.microsoft.bingads.v13.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;
import com.microsoft.bingads.v13.campaignmanagement.FrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdGroupType;
import com.microsoft.bingads.v13.campaignmanagement.HotelSetting;
import com.microsoft.bingads.v13.campaignmanagement.ImageAsset;
import com.microsoft.bingads.v13.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.LogicalOperator;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpmBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpvBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MatchType;
import com.microsoft.bingads.v13.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionValueBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxRoasBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.Minute;
import com.microsoft.bingads.v13.campaignmanagement.NormalForm;
import com.microsoft.bingads.v13.campaignmanagement.NumberOperator;
import com.microsoft.bingads.v13.campaignmanagement.NumberRuleItem;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsRule;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsWhoDidNotVisitAnotherPageRule;
import com.microsoft.bingads.v13.campaignmanagement.PageVisitorsWhoVisitedAnotherPageRule;
import com.microsoft.bingads.v13.campaignmanagement.PercentCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ProductAudienceType;
import com.microsoft.bingads.v13.campaignmanagement.RemarketingRule;
import com.microsoft.bingads.v13.campaignmanagement.RuleItem;
import com.microsoft.bingads.v13.campaignmanagement.RuleItemGroup;
import com.microsoft.bingads.v13.campaignmanagement.StringOperator;
import com.microsoft.bingads.v13.campaignmanagement.StringRuleItem;
import com.microsoft.bingads.v13.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetImpressionShareBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetRoasBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetSetting;
import com.microsoft.bingads.v13.campaignmanagement.TargetSettingDetail;
import com.microsoft.bingads.v13.campaignmanagement.TextAsset;
import com.microsoft.bingads.v13.campaignmanagement.VideoAsset;
import com.microsoft.bingads.v13.campaignmanagement.WebpageParameter;

public class StringExtensions {

    private static final String UNKNOWN_DEVICE_PREFERENCE = "Unknown device preference";
    private static final String ALL = "All";
    private static final String MOBILE = "Mobile";
    private static final String DATE_OUTPUT_FORMAT = "%d/%d/%d";
    //private static final DateTimeFormatter DATE_INPUT_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    private static final String urlSplitter = ";\\s*(?=https?://)";
    private static final String customParameterSplitter = "(?<!\\\\);\\s*";
    private static final Pattern customKvPattern = Pattern.compile("^\\{_(.*?)\\}=(.*$)");
    
    private static final Pattern dayTimePattern = Pattern.compile("\\((Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday)\\[(\\d\\d?):(\\d\\d)-(\\d\\d?):(\\d\\d)\\]\\)");
    private static final Pattern targetSettingDetailsPattern = Pattern.compile("^(Age|Audience|CompanyName|Gender|Industry|JobFunction)$");
 
    //Remarketing rule pattern
    private static final Pattern stringPageRulePattern = Pattern.compile("^(Url|ReferrerUrl|EcommPageType|EcommCategory|EcommProdId|Action|None) (Equals|Contains|BeginsWith|EndsWith|NotEquals|DoesNotContain|DoesNotBeginWith|DoesNotEndWith) ([^()]*)$");
    private static final Pattern numberPageRulePattern = Pattern.compile("^(EcommTotalValue) (Equals|GreaterThan|LessThan|GreaterThanEqualTo|LessThanEqualTo|NotEquals) ([^()]*)$");

    private static final Pattern operandPattern = Pattern.compile("^(Category|Action|Label|Value) ([^()]*)$");
	private static final Pattern stringOperatorPattern = Pattern.compile("^(Equals|Contains|BeginsWith|EndsWith|NotEquals|DoesNotContain|DoesNotBeginWith|DoesNotEndWith) ([^()]*)$");
	private static final Pattern numberOperatorPattern = Pattern.compile("^(Equals|GreaterThan|LessThan|GreaterThanEqualTo|LessThanEqualTo) ([^()]*)$");
    private static final Pattern logicalOperatorPattern = Pattern.compile("^(And|Or|Not)\\((.*?)\\)$", Pattern.CASE_INSENSITIVE);

    public static String toKeywordBidBulkString(Bid bid, Long id) {
        if (bid == null) {
            return null;
        }

        if (bid.getAmount() == null)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }

        return StringExtensions.toBulkString(bid.getAmount());
    }

    public static String toBidBulkString(Bid bid, Long id) {
        if (bid == null) {
            return null;
        }

        if (bid.getAmount() == null)  {
            return id != null && id > 0 ? StringTable.DeleteValue : null;
        }

        return StringExtensions.toBulkString(bid.getAmount());
    }
	
	/**
	 * Catches NumberFormatException and returns a null value instead
	 * 
	 * @param value
	 * @return a Long or a null if the value is not parseable as a long
	 */
	public static Long nullOrLong(String value) {
		if (isNullOrEmpty(value)) {
    		return null;
    	}
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
	
	/**
	 * Catches NumberFormatException and returns a null value instead
	 * 
	 * @param value
	 * @return a BigDecimal or a null if the value is not parseable as a long
	 */
	public static BigDecimal nullOrBigDecimal(String value) {
		if (isNullOrEmpty(value)) {
    		return null;
    	}
        try {
            return BigDecimal.valueOf(Double.parseDouble(value));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static <T> String toBulkString(T value) {
        if (value == null) {
            return null;
        }

        return value.toString();
    }
 
    public static String toVerifiedTrackingSettingBulkString(ArrayOfArrayOfKeyValuePairOfstringstring verifiedTrackingSetting)
    {
    	StringBuilder sb = new StringBuilder(256);
    	sb.append('[');
    	for (ArrayOfKeyValuePairOfstringstring settingArr : verifiedTrackingSetting.getArrayOfKeyValuePairOfstringstrings()) {
        	sb.append('[');
    		for (KeyValuePairOfstringstring kv : settingArr.getKeyValuePairOfstringstrings()) {
    			sb.append("{\"key\":\"")
    			  .append(kv.getKey())
    			  .append("\",\"value\":\"")
    			  .append(kv.getValue())
    			  .append("\"},");
    		}
    		if (settingArr.getKeyValuePairOfstringstrings().size() > 0) {
    			sb.deleteCharAt(sb.length() - 1);
    		}
    		sb.append("],");
    	}
		if (verifiedTrackingSetting.getArrayOfKeyValuePairOfstringstrings().size() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append(']');
    	return sb.toString();
    }
    
    public static ArrayOfArrayOfKeyValuePairOfstringstring parseVerifiedTrackingSetting(String value)
    {
        if (value == null || value.isEmpty()) {
        	return null;
        }
        
        try {
        	ObjectMapper mapper = new ObjectMapper();
        	KeyValuePairOfstringstring[][] twoDimKvArr = mapper.readValue(value, KeyValuePairOfstringstring[][].class);
        	ArrayOfArrayOfKeyValuePairOfstringstring result = new ArrayOfArrayOfKeyValuePairOfstringstring();

        	for (KeyValuePairOfstringstring[] kvArr: twoDimKvArr) {
        		ArrayOfKeyValuePairOfstringstring setting = new ArrayOfKeyValuePairOfstringstring();
        		for (KeyValuePairOfstringstring kv : kvArr) {
        			setting.getKeyValuePairOfstringstrings().add(kv);
        		}

        		result.getArrayOfKeyValuePairOfstringstrings().add(setting);
        	}
        	return result;

        } catch (IOException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        return null;
    	}

    /**
     * Catches NumberFormatException and returns a null value instead
     *
     * @param value
     * @return a Double or a null if the value is not parseable as a double
     */
    public static Double nullOrDouble(String value) {
    	if (isNullOrEmpty(value)) {
    		return null;
    	}
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Catches NumberFormatException and returns a null value instead
     *
     * @param value
     * @return an Integer or a null if the value is null or empty
     */
    public static Integer parseOptionalInteger(String value) {
        if (isNullOrEmpty(value)) {
            return null;
        }

        return Integer.parseInt(value);
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
    
    public static Date parseDate(String headerValue) throws ParseException {
        if (headerValue == null || headerValue.length() == 0 || StringTable.DeleteValue.equalsIgnoreCase(headerValue)) {
            return null;
        }

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        format.setLenient(false);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(format.parse(headerValue));

        Date bingDate = new Date();
        bingDate.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        bingDate.setMonth(calendar.get(Calendar.MONTH) + 1); // Calendar months are zero-based
        bingDate.setYear(calendar.get(Calendar.YEAR));

        return bingDate;
    }

    public static Bid parseAdGroupBid(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

        Bid bid = new Bid();

        if (v.equals(StringTable.DeleteValue)) {
            bid.setAmount(0.0);
            return bid;
        }

        Double bidAmount = nullOrDouble(v);

        if (bidAmount != null) {
            bid.setAmount(bidAmount);
            return bid;
        } else {
            return null;
        }
    }
    
    public static Double parseAdGroupBidAmount(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

        if (v.equals(StringTable.DeleteValue)) {
            return 0.0;
        }
        return Double.parseDouble(v);
    }
    
	public static Bid parseAdGroupCriterionBid(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

        Bid bid = new Bid();
        
        Double bidAmount = nullOrDouble(v);

        if (bidAmount != null) {
            bid.setAmount(bidAmount);
            return bid;
        } else {
            return null;
        }
	 }
	 
    public static Bid parseKeywordBid(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

        Bid bid = new Bid();

        if (v.equals(StringTable.DeleteValue)) {
            bid.setAmount(null);
            return bid;
        }

        Double bidAmount = nullOrDouble(v);

        if (bidAmount != null) {
            bid.setAmount(bidAmount);
            return bid;
        } else {
            return null;
        }
    }

    public static Bid parseBid(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

        Bid bid = new Bid();

        if (v.equals(StringTable.DeleteValue)) {
            bid.setAmount(null);
            return bid;
        }

        Double bidAmount = nullOrDouble(v);

        if (bidAmount != null) {
            bid.setAmount(bidAmount);
            return bid;
        } else {
            return null;
        }
    }

    public static SimpleDateFormat SYNC_TIME_FORMATTER = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public static java.util.Date parseSyncTime(String v) throws ParseException {
        if (v == null || v.isEmpty()) {
            return null;
        }

        return SYNC_TIME_FORMATTER.parse(v);
    }

    public static String toDateBulkString(Date c) {
        if (c == null) {
            return null;
        }

        return String.format(DATE_OUTPUT_FORMAT, c.getMonth(), c.getDay(), c.getYear());
    }
    
    public static String toScheduleDateBulkString(Date c, Long id) {
    	if (c == null || (c.getMonth() == 0 && c.getDay() == 0 && c.getYear() == 0))  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }

        return String.format(DATE_OUTPUT_FORMAT, c.getMonth(), c.getDay(), c.getYear());
    
    }

    /**
     * Determines the ad rotation represented by a String. Returns null if the String does not match any known.
     *
     * @param v A String representation of a ad rotation
     * @return a {@link AdRotation} or null if there is no match
     */
    public static AdRotation parseAdRotation(String v) {
        if (StringTable.DeleteValue.equals(v)) {
            return null;
        }

        if (v == null || v.isEmpty()) {
            return null;
        }

        try {
            AdRotation rotation = new AdRotation();
            rotation.setType(AdRotationType.fromValue(v));
            return rotation;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static boolean isTurnedOn(String v) {
        return v != null && v.length() != 0 && !StringTable.DeleteValue.equals(v) && v.equals(StringTable.On);
    }

    public static <T> T parseOptionalUpperCase(String v, Function<String, T> parse) {
        if (v == null | v.length() == 0) {
            return null;
        }

        return parseOptional(v.substring(0, 1) + v.substring(1, v.length()).toLowerCase(), parse);
    }

    public static <T> T parseOptional(String v, Function<String, T> parse) {
        if (v == null || v.length() == 0) {
            return null;
        }

        return parse.apply(v);
    }

    public static <T> JAXBElement<T> parseJAXBElement(String v, Function<String, T> parse, Function<T, JAXBElement<T>> factory) {
        if (v == null || v.length() == 0) {
            return null;
        }

        return factory.apply(parse.apply(v));
    }

    public static String toOptionalBulkString(String value, Long id) {
        if (value == null) {
            return null;
        }

        if (value.isEmpty() && id != null && id > 0) {
            return StringTable.DeleteValue;
        }

        return value;
    }

    public static String getValueOrEmptyString(String v) {
        if (v == null || v.isEmpty() || v.equals(StringTable.DeleteValue)) {
            return "";
        }

        return v;
    }

    public static Long parseDevicePreference(String v) {
        if (v == null || v.isEmpty() || v.equals(ALL)) {
            return 0L;
        }

        if (v.equals(MOBILE)) {
            return 30001L;
        }

        throw new UnsupportedOperationException(UNKNOWN_DEVICE_PREFERENCE);
    }

    public static String toDevicePreferenceBulkString(Long pref) {
        if (pref == null || pref.equals(0L)) {
            return ALL;
        } else if (pref.equals(30001L)) {
            return MOBILE;
        }

        throw new UnsupportedOperationException(UNKNOWN_DEVICE_PREFERENCE);
    }

    public static <T> T parse(String v, Function<String, T> parser) {
        return parser.apply(v);
    }

    public static String toMatchTypeBulkString(MatchType type) {
        if (type == null) {
            return null;
        }

        return type.value();
    }

    public static String toAdRotationBulkString(AdRotation c) {
        if (c == null || c.getType() == null) {
            return null;
        }

        return StringExtensions.toBulkString(c.getType().value());
    }

    public static String toAdGroupBidBulkString(Bid bid, Long id) {
        if (bid == null || bid.getAmount() == null) {
            return null;
        }

        if (bid.getAmount() == 0.0)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
        
        return bid.getAmount().toString();
    }
    
    public static String toAdGroupFrequencyCapSettingsBulkString(ArrayOfFrequencyCapSettings settings, Long id)
    {
    	if (settings == null || settings.getFrequencyCapSettings() == null) {
    		return null;
    	}
    	
    	if (settings.getFrequencyCapSettings().size() == 0) {
    		return id != null && id > 0 ? StringTable.DeleteValue : null;
    	}
    	
    	StringBuilder sb = new StringBuilder(256);
    	sb.append('[');
    	for (FrequencyCapSettings setting : settings.getFrequencyCapSettings()) {
    		sb.append("{\"capValue\":")
    		  .append(setting.getCapValue())
    		  .append(",\"frequencyCapUnit\":\"")
    		  .append(setting.getFrequencyCapUnit())
    		  .append("\",\"timeGranularity\":\"")
    		  .append(setting.getTimeGranularity().toString())
    		  .append("\"},");
    	}
    	if (settings.getFrequencyCapSettings().size() > 0) {
    		sb.deleteCharAt(sb.length() - 1);
    	}
    	sb.append("]");
    	return sb.toString();
    }
    
    public static ArrayOfFrequencyCapSettings parseFrequencyCapSettings(String value)
    {
        if (value == null || value.isEmpty()) {
        	return null;
        }
        
        if (value == StringTable.DeleteValue) {
        	return new ArrayOfFrequencyCapSettings();
        }
        
        try {
        	ObjectMapper mapper = new ObjectMapper();
        	ArrayOfFrequencyCapSettings result = new ArrayOfFrequencyCapSettings();
        	FrequencyCapSettings[] settings = mapper.readValue(value, FrequencyCapSettings[].class);
        	for (FrequencyCapSettings setting : settings) {
        		result.getFrequencyCapSettings().add(setting);
        	}
        	return result;

        } catch (IOException e) {
        	e.printStackTrace();
        }
        return null;
    }
    
    public static String toCriterionBidMultiplierBulkString(Double v) {
        if (v == null) {
            return null;
        }

        return v.toString();
    }
    
    public static String toAdGroupFixedBidBulkString(FixedBid bid, Long id) {
        if (bid == null || bid.getAmount() == null) {
            return null;
        }

        if (bid.getAmount() == 0.0) {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }

        return bid.getAmount().toString();
    }
    
    public static String toAdGroupCriterionBidBulkString(Bid bid) {
        if (bid == null || bid.getAmount() == null) {
            return null;
        }

        return bid.getAmount().toString();
    }
    
    public static String toAdGroupCriterionFixedBidBulkString(FixedBid bid) {
        if (bid == null || bid.getAmount() == null) {
            return null;
        }

        return bid.getAmount().toString();
    }

    public static CriterionBid parseFixedAdGroupBid(String v) {
        Bid bid = StringExtensions.parseAdGroupBid(v);

        if (bid == null) {
            return null;
        }

        FixedBid fixedBid = new FixedBid();
        fixedBid.setAmount(bid.getAmount());
        return fixedBid;
    }


    public static String toAdStatusBulkString(AdStatus status) {
        if (status == null) {
            return null;
        }

        return status.value();
    }

    public static String toGeoCodeStatusBulkString(
            BusinessGeoCodeStatus geoCodeStatus) {
        if (geoCodeStatus == null) {
            return null;
        }

        return geoCodeStatus.value();
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static Integer parseLatLngInMicroDegrees(String v) {
        Double decimalDegrees = StringExtensions.parseOptional(v, new Function<String, Double>() {
            @Override
            public Double apply(String value) {
                return Double.parseDouble(value);
            }
        });
        if (decimalDegrees == null) {
            return null;
        }

        return (int) Math.round(decimalDegrees * 1000000);
    }

    public static String toBooleanBulkString(Boolean value) {
        if (value == null) {
            return null;
        }

        if (value) {
            return "True";
        } else {
            return "False";
        }
    }

    public static String toAdExtensionStatusBulkString(AdExtensionStatus status) {
        if (status == null) {
            return null;
        }

        return status.value();
    }

    public static String toStatusBulkString(Status status) {
        if (status == null) {
            return null;
        }

        return status.value();
    }

    public static Minute parseMinute(String s) {
        int minuteNumber = Integer.parseInt(s);

        switch (minuteNumber) {
            case 0:
                return Minute.ZERO;
            case 15:
                return Minute.FIFTEEN;
            case 30:
                return Minute.THIRTY;
            case 45:
                return Minute.FORTY_FIVE;
            default:
                throw new IllegalArgumentException("Unknown minute");
        }
    }

    public static String toMinuteBulkString(Minute minute) {
        switch (minute) {
            case ZERO:
                return "0";
            case FIFTEEN:
                return "15";
            case THIRTY:
                return "30";
            case FORTY_FIVE:
                return "45";
            default:
                throw new IllegalArgumentException("Unknown minute");
        }
    }
    
    public static Day parseDay(String s) {    	
    	if (s.toLowerCase().equals("sunday"))
    		return Day.SUNDAY;
    	if (s.toLowerCase().equals("monday"))
    		return Day.MONDAY;
    	if (s.toLowerCase().equals("tuesday"))
    		return Day.TUESDAY;
    	if (s.toLowerCase().equals("wednesday"))
    		return Day.WEDNESDAY;
    	if (s.toLowerCase().equals("thursday"))
    		return Day.THURSDAY;
    	if (s.toLowerCase().equals("friday"))
    		return Day.FRIDAY;
    	if (s.toLowerCase().equals("saturday"))
    		return Day.SATURDAY;
    	throw new IllegalArgumentException("Unknown day");
    }

    public static LocationTargetType parseLocationTargetType(String s) {
        if (s.equals("Metro Area")) {
            return LocationTargetType.METRO_AREA;
        } else if (s.equals("Postal Code")) {
            return LocationTargetType.POSTAL_CODE;
        } else {
            return LocationTargetType.fromValue(s);
        }
    }

    public static String toLocationTargetTypeBulkString(LocationTargetType locationTargetType) {
        if (locationTargetType == null) return null;

        switch (locationTargetType) {
            case METRO_AREA:
                return "Metro Area";
            case POSTAL_CODE:
                return "Postal Code";
            default:
                return locationTargetType.value();
        }
    }

    public static String join(String separator, List<String> strings) {
        if (strings == null) {
            return null;
        }
        
        String result = "";

        for (Integer i = 0; i < strings.size() - 1; i++) {
            result += strings.get(i) + separator;
        }

        result += strings.get(strings.size() - 1);

        return result;
    }

    public static String getFileExtension(String fileName) {
        int indexOfDot = fileName.lastIndexOf('.');

        if (indexOfDot != -1) {
            return fileName.substring(indexOfDot);
        }

        return fileName;
    }

    public static String getFileNameWithoutExtension(File file) {
        String fileName = file.getName();

        int indexOfDot = fileName.lastIndexOf('.');

        if (indexOfDot != -1) {
            return fileName.substring(0, indexOfDot);
        }

        return fileName;
    }

    public static File changeFileExtension(File file, String newExtension) {
        String fullFileName = file.toString();

        int indexOfDot = fullFileName.lastIndexOf('.');

        if (indexOfDot != -1) {
            return new File(fullFileName.substring(0, indexOfDot) + newExtension);
        }

        return new File(fullFileName + newExtension);
    }
    
    public static String writeUrls(String separator, ArrayOfstring strings, Long id) {
        if (strings == null) {
            return null;
        }
        
        if (strings.getStrings().size() == 0) {
        	return id != null && id > 0? StringTable.DeleteValue : null;
        }
        
        StringBuilder result = new StringBuilder("");

        int length =  strings.getStrings().size();
        for (Integer i = 0; i < length - 1; i++) {
            result.append(strings.getStrings().get(i) + separator);
        }

        result.append(strings.getStrings().get(length - 1));

        return result.toString();
    }
    
    public static List<String> parseUrls(String s) {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;
    	
    	List<String> urlArray = new ArrayList<String>();
    	
    	String[] urls = s.split(urlSplitter);
    	
    	for(String tmp : urls) {
    		if (!StringExtensions.isNullOrEmpty(tmp) && ! ";".equals(tmp))
    			urlArray.add(tmp);
    	}	
    	
    	return urlArray; 	
    }

    public static String writeCampaignLanguages(String separator, ArrayOfstring strings, Long id) {
        if (strings == null) {
            return null;
        }
        
        if (strings.getStrings().size() == 0)  {
            return null;
        }
        
        StringBuilder result = new StringBuilder("");

        int length =  strings.getStrings().size();
        for (Integer i = 0; i < length - 1; i++) {
            result.append(strings.getStrings().get(i) + separator);
        }

        result.append(strings.getStrings().get(length - 1));

        return result.toString();
    }
    
    public static List<String> parseCampaignLanguages(String s) {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;
    	
    	List<String> languageArray = new ArrayList<String>();
    	
    	String[] languages = s.split("[;\\s?]");
    	
    	for(String tmp : languages) {
    		if (!StringExtensions.isNullOrEmpty(tmp) && ! ";".equals(tmp))
    			languageArray.add(tmp);
    	}	
    	
    	return languageArray; 	
    }
    
    public static String toCustomParaBulkString(CustomParameters parameters, Long id) {
    	if (parameters == null) {
    		return null;
    	}
    	
    	ArrayOfCustomParameter customParaArray = parameters.getParameters();
    	if (customParaArray == null || customParaArray.getCustomParameters().size() == 0)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
    	
    	String result = "";
    	
    	int length = customParaArray.getCustomParameters().size();
    	for (int i = 0; i < length - 1; i++) {
    		 CustomParameter cp = customParaArray.getCustomParameters().get(i);
    		 String tmp = String.format("{_%s}=%s", cp.getKey(), escapeParameterText(cp.getValue()));
     		
    		 result += tmp + "; ";
         }

    	CustomParameter cp = customParaArray.getCustomParameters().get(length - 1);		
        result += String.format("{_%s}=%s", cp.getKey(), escapeParameterText(cp.getValue()));

        return result;

    }
    
    private static String escapeParameterText(String text) {
    	StringBuffer buffer = new StringBuffer(text.length() * 2);
    	
    	for (char c : text.toCharArray()) {
    		if (c == ';' || c == '\\') {
    			buffer.append('\\');
    		}
    		buffer.append(c);
    	}
    	
    	return buffer.toString();
    }
    
    private static String unEscapeParameterText(String text) {
    	StringBuffer buffer = new StringBuffer(text.length());
    	
    	int length = text.length();
    	
    	for (int i = 0; i < length; i++) {
    		if (text.charAt(i) == '\\') {
    			i++;
    		}
    		
    		if (i < length) {
    			buffer.append(text.charAt(i));
    		}
    	}
    	
    	return buffer.toString();	
    }
    
    public static CustomParameters parseCustomParameters(String s) throws Exception {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;

        if (s.equalsIgnoreCase(StringTable.DeleteValue)) {
            return null;
        }
    	
    	String[] parameters = s.split(customParameterSplitter);
    	
    	ArrayOfCustomParameter customParametersArray = new ArrayOfCustomParameter();
    	
    	for (String p : parameters) {
    		if (!StringExtensions.isNullOrEmpty(p)) {    		
    			p = p.trim();
    			Matcher match = customKvPattern.matcher(p);
    			if (match.find()) {
					CustomParameter param = new CustomParameter();
					param.setKey(match.group(1));
					param.setValue(unEscapeParameterText(match.group(2)));
					customParametersArray.getCustomParameters().add(param);
    			} else {   				
					throw new IllegalArgumentException(String.format("Bad format for CustomParameters: %s", s));
    			}
    		}	
    	}
    	
    	CustomParameters result = new CustomParameters();
    	result.setParameters(customParametersArray);
    	
    	return result;
    }
    
    public static BiddingScheme parseBiddingScheme(String s) throws Exception {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;
    	
    	BiddingScheme biddingScheme = null;
    	
    	if (s.equals("EnhancedCpc")) {
    		biddingScheme = new EnhancedCpcBiddingScheme();
    		biddingScheme.setType("EnhancedCpc");
    	} else if (s.equals("InheritFromParent")) {
    		biddingScheme = new InheritFromParentBiddingScheme();
    		biddingScheme.setType("InheritFromParent");
    	} else if (s.equals("MaxConversions")) {
    		biddingScheme = new MaxConversionsBiddingScheme();
    		biddingScheme.setType("MaxConversions");
    	} else if (s.equals("ManualCpc")) {
    		biddingScheme = new ManualCpcBiddingScheme();
    		biddingScheme.setType("ManualCpc");
    	} else if (s.equals("ManualCpv")) {
            biddingScheme = new ManualCpvBiddingScheme();
            biddingScheme.setType("ManualCpv");
        } else if (s.equals("ManualCpm")) {
            biddingScheme = new ManualCpmBiddingScheme();
            biddingScheme.setType("ManualCpm");
        } else if (s.equals("TargetCpa")) {
    		biddingScheme = new TargetCpaBiddingScheme();
    		biddingScheme.setType("TargetCpa");
    	} else if (s.equals("MaxClicks")) {
    		biddingScheme = new MaxClicksBiddingScheme();
    		biddingScheme.setType("MaxClicks");
    	} else if (s.equals("TargetRoas")) {
            biddingScheme = new TargetRoasBiddingScheme();
            biddingScheme.setType("TargetRoas");
        } else if (s.equals("MaxConversionValue")) {
            biddingScheme = new MaxConversionValueBiddingScheme();
            biddingScheme.setType("MaxConversionValue");
        } else if (s.equals("TargetImpressionShare")) {
            biddingScheme = new TargetImpressionShareBiddingScheme();
            biddingScheme.setType("TargetImpressionShare");
        } else if (s.equals("MaxRoas")) {
            biddingScheme = new MaxRoasBiddingScheme();
            biddingScheme.setType("MaxRoas");
        } else if (s.equals("PercentCpc")) {
            biddingScheme = new PercentCpcBiddingScheme();
            biddingScheme.setType("PercentCpc");
        } else if (s.equals("Commission")) {
            biddingScheme = new CommissionBiddingScheme();
            biddingScheme.setType("Commission");
        } else {
    		throw new IllegalArgumentException(String.format("Unknown value for Bid Strategy Type : %s", s));
    	}
    	
    	return biddingScheme;
    }
    
    public static String toBiddingSchemeBulkString(BiddingScheme biddingScheme) throws Exception {
    	if (biddingScheme == null)
    		return null;
    	
    	if (biddingScheme instanceof EnhancedCpcBiddingScheme) {
    		return "EnhancedCpc";
    	} else if (biddingScheme instanceof InheritFromParentBiddingScheme) {;
    		return "InheritFromParent";
    	} else if (biddingScheme instanceof MaxConversionsBiddingScheme) {
    		return "MaxConversions";
    	} else if (biddingScheme instanceof ManualCpcBiddingScheme) {
    		return "ManualCpc";
        } else if (biddingScheme instanceof ManualCpvBiddingScheme  ) {
            return "ManualCpv";
        } else if (biddingScheme instanceof ManualCpmBiddingScheme  ) {
            return "ManualCpm";
    	} else if (biddingScheme instanceof TargetCpaBiddingScheme) {
    		return "TargetCpa";
    	} else if (biddingScheme instanceof MaxClicksBiddingScheme) {
    		return "MaxClicks";
        } else if (biddingScheme instanceof TargetRoasBiddingScheme  ) {
            return "TargetRoas";
    	} else if (biddingScheme instanceof MaxConversionValueBiddingScheme  ) {
            return "MaxConversionValue";
        } else if (biddingScheme instanceof TargetImpressionShareBiddingScheme  ) {
            return "TargetImpressionShare";
        } else if (biddingScheme instanceof MaxRoasBiddingScheme  ) {
            return "MaxRoas";
        } else if (biddingScheme instanceof PercentCpcBiddingScheme  ) {
            return "PercentCpc";
        } else if (biddingScheme instanceof CommissionBiddingScheme  ) {
            return "Commission";
        } else {
    		throw new IllegalArgumentException("Unknown bidding scheme");
    	}
    }
    
    public static String toNativePreferenceBulkString(String parameter) {
        if (isNullOrEmpty(parameter)) {
            return null;
        }
        return parameter;
    }
        
    public static List<Long> parseIdList(String v) {
        if (StringExtensions.isNullOrEmpty(v))
            return null;
        
        List<Long> idArray = new ArrayList<Long>();
        
        String[] ids = v.split(";");
        
        for(String tmp : ids) {
            if (!StringExtensions.isNullOrEmpty(tmp) && ! ";".equals(tmp))
                idArray.add(Long.parseLong(tmp));
        }   
        
        return idArray;
    }
    
    public static String toIdListBulkString(String separator, ArrayOflong ids) {
        if (ids == null) {
            return null;
        }
        
        if (ids.getLongs().size() == 0) {
            return null;
        }
        
        StringBuilder result = new StringBuilder("");

        int length =  ids.getLongs().size();
        for (Integer i = 0; i < length - 1; i++) {
            result.append(ids.getLongs().get(i) + separator);
        }

        result.append(ids.getLongs().get(length - 1));

        return result.toString();
    }
    
    public static ArrayOfstring ParseDelimitedStrings(String v) {
    	if (StringExtensions.isNullOrEmpty(v))
    		return null;
    	
    	ArrayOfstring valueArray = new ArrayOfstring();
    	
    	String[] values = v.split(";");
    	
    	for(String tmp : values) {
    		if (!StringExtensions.isNullOrEmpty(tmp) && ! ";".equals(tmp))
    			valueArray.getStrings().add(tmp);
    	}	
    	
    	return valueArray;
    }
    
    public static String WriteDelimitedStrings(String separator, ArrayOfstring values) {
    	if (values == null || values.getStrings().size() == 0) {
            return null;
        }
                
        StringBuilder result = new StringBuilder("");

        int length =  values.getStrings().size();
        for (Integer i = 0; i < length - 1; i++) {
            result.append(values.getStrings().get(i) + separator);
        }

        result.append(values.getStrings().get(length - 1));

        return result.toString();
    }
    
	public static Map<String, Boolean> parseAutoApplyRecommendations(String v, String deliminator) {
		if (StringExtensions.isNullOrEmpty(v) || v.equals(StringTable.DeleteValue))
			return null;

		return Arrays.stream(v.split(deliminator))
				.map(s -> s.trim())
				.filter(s -> s.length() > 0 && !";".equals(s))
				.collect(Collectors.toMap(
						p -> p.substring(0, p.indexOf('=')),
						p -> Boolean.valueOf(p.substring(p.indexOf('=') + 1, p.length())))
						);
	}
	
	public static List<String> parseBusinessAttributes(String v, String deliminator) {
		if (StringExtensions.isNullOrEmpty(v) || v.equals(StringTable.DeleteValue))
			return null;
		
		String[] strs = v.split(deliminator);
		List<String> result = new ArrayList<String>();
		for (String str : strs) {
			result.add(str);
		}
		return result;
	}
    
    public static String writeAutoApplyRecommendations(String separator, Map<String, Boolean> values) {
    	if (values == null || values.size() == 0) {
            return null;
        }
                
        StringBuilder result = new StringBuilder("");

        for (Entry<String, Boolean> entry : values.entrySet()) {
        	result.append(entry.getKey() + '=' + entry.getValue() + separator);
        }

        return result.toString();
    }
    
    public static String writeBusinessAttributes(String separator, List<String> values) {
    	if (values == null || values.size() == 0) {
    		return null;
    	}
    	
    	StringBuilder result = new StringBuilder("");
    	for (int i = 0; i < values.size(); i++)	{
    		result.append(values.get(i));
    		if (i != values.size() - 1) {
    			result.append(separator);
    		}
    	}
    	return result.toString();
    }
    
    public static String toDayTimeRangesBulkString(ArrayOfDayTime arrayOfDayTime, Long id) {
    	if (arrayOfDayTime == null)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
    	
    	List<DayTime> dayTimeRanges = arrayOfDayTime.getDayTimes();
    	if (dayTimeRanges == null || dayTimeRanges.size() == 0)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
    	
    	String result = "";
    	
    	int length = dayTimeRanges.size();
    	
    	for (int i = 0; i < length - 1; i++) {
    		DayTime dayTime = dayTimeRanges.get(i);
   		 	String tmp = String.format(String.format("(%s[%02d:%02d-%02d:%02d])", dayTime.getDay().value(), dayTime.getStartHour(), 
   		 		Integer.parseInt(toMinuteBulkString(dayTime.getStartMinute())), dayTime.getEndHour(), Integer.parseInt(toMinuteBulkString(dayTime.getEndMinute()))));  	
   		 	
   		 	result += tmp + ";";
        }

    	DayTime dayTime = dayTimeRanges.get(length - 1);		
        result += String.format(String.format("(%s[%02d:%02d-%02d:%02d])", dayTime.getDay().value(), dayTime.getStartHour(), 
        		Integer.parseInt(toMinuteBulkString(dayTime.getStartMinute())), dayTime.getEndHour(), Integer.parseInt(toMinuteBulkString(dayTime.getEndMinute()))));

        return result;
    }
    
    public static ArrayOfDayTime parseDayTimeRanges(String s) {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;
    	
    	String[] parameters = s.split(";");
    	
    	List<DayTime> dayTimeArray = new ArrayList<DayTime>();
    	
    	for (String p : parameters) {
    		if (!StringExtensions.isNullOrEmpty(p)) {    		
    			p = p.trim();
    			Matcher match = dayTimePattern.matcher(p);
    			if (match.find()) {
    				DayTime dayTime = new DayTime();
					dayTime.setDay(parseDay(match.group(1)));
					dayTime.setStartHour(Integer.parseInt(match.group(2)));
					dayTime.setStartMinute(parseMinute(match.group(3)));
					dayTime.setEndHour(Integer.parseInt(match.group(4)));
					dayTime.setEndMinute(parseMinute(match.group(5)));
					dayTimeArray.add(dayTime);
    			} else {   				
					throw new IllegalArgumentException(String.format("Bad format for DateTimeRanges: %s", s));
    			}
    		}	
    	}
    	
    	ArrayOfDayTime result = new ArrayOfDayTime();
    	result.getDayTimes().addAll(dayTimeArray);
    	
    	return result;
    }

    public static String toUseSearcherTimeZoneBulkString(Boolean useSearcherTimeZone, Long id) {
        if (useSearcherTimeZone == null)  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
        return useSearcherTimeZone ? "true": "false";
    }
    
    public static Boolean parseUseSearcherTimeZone(String s) {
        if(StringExtensions.isNullOrEmpty(s) || StringTable.DeleteValue.equals(s)) {
            return null;
        }
        if (s.toLowerCase().equals("true")) {
            return true;
        } else if (s.toLowerCase().equals("false")) {
            return false;
        } else {
            throw new IllegalArgumentException(String.format("Unknown value for Use Searcher Time Zone : %s", s));
        }
    }
        
    public static String toCriterionNameBulkString(WebpageParameter webpageParameter, Long id) {
    	if (webpageParameter == null || webpageParameter.getCriterionName() == null) {
			return null;
		}
		if (webpageParameter.getCriterionName().isEmpty())  {
            return id != null && id > 0? StringTable.DeleteValue : null;
        }
		return webpageParameter.getCriterionName();
    }
    
    public static String parseCriterionName(String s) {
    	if (StringExtensions.isNullOrEmpty(s)) {
    		return null;
    	}   	
    	return s;
    }

    public static String writeCombinationRulesBulkString(ArrayOfCombinationRule combinationRules) {

        if (combinationRules == null || combinationRules.getCombinationRules() == null|| combinationRules.getCombinationRules().size() == 0)
        {
            return null;
        }
        
        return String.join("&", 
                combinationRules.getCombinationRules().stream()
                .map( rule -> 
                    String.format("%s(%s)", rule.getOperator().value(),
                            String.join(",", 
                                    rule.getAudienceIds().getLongs()
                                    .stream()
                                    .map(l -> Long.toString(l))
                                    .collect(Collectors.toList()))))
                .collect(Collectors.toList()));
    }

    public static ArrayOfCombinationRule parseCombinationRules(String v) {
        if (v == null) {
            return null;
        }
        
        ArrayOfCombinationRule result = new ArrayOfCombinationRule();
        result.getCombinationRules().addAll(
                Arrays.stream(v.split("&"))
                .filter(s -> s != null && !s.isEmpty())
                .map(s -> parseCombinationRule(s))
                .filter((r -> r != null))
                .collect(Collectors.toList()));
        return result;
    }
    
    private static CombinationRule parseCombinationRule(String ruleItemStr) {
        
        if (ruleItemStr == null) {
            return null;
        }
        ruleItemStr = ruleItemStr.trim();
        
        Matcher m = logicalOperatorPattern.matcher(ruleItemStr);
        if (!m.matches()) {
            throw new IllegalArgumentException(String.format("Invalid Rule Item: %s", ruleItemStr));
        }
        CombinationRule rule = new CombinationRule();
        rule.setOperator(parseLogicalOperator(m.group(1)));
        rule.setAudienceIds(parseAudienceIds(m.group(2)));
        
        return rule;
    }

    private static ArrayOflong parseAudienceIds(String strAudienceIds) {
        if (strAudienceIds == null || strAudienceIds.isEmpty()) {
            return null;
        }
        ArrayOflong ret = new ArrayOflong();
        ret.getLongs().addAll(Arrays.stream(strAudienceIds.split(",")).map(s -> Long.parseLong(s.trim())).collect(Collectors.toList()));
        return ret;
    }

    private static LogicalOperator parseLogicalOperator(String strOperator) {
        if (strOperator == null || strOperator.isEmpty()) {
            return null;
        }
        
        switch(strOperator.toLowerCase()) {
        case "or":
            return LogicalOperator.OR;
        case "and":
            return LogicalOperator.AND;
        case "not":
            return LogicalOperator.NOT;
        }
        
        return null;
    }

    public static String toRemarketingRuleBulkString(RemarketingRule remarketingRule) {
    	if (remarketingRule == null) {
    		return null;
    	}
    	if (remarketingRule instanceof CustomEventsRule) {
    		return String.format("CustomEvents%s", getCustomEventsRule((CustomEventsRule)remarketingRule));
    	} else if (remarketingRule instanceof PageVisitorsRule) {
    		PageVisitorsRule pageVisitorRule = ((PageVisitorsRule)remarketingRule);
    		return String.format("PageVisitors%s", getRuleItemGroups(pageVisitorRule.getRuleItemGroups().getRuleItemGroups(), pageVisitorRule.getNormalForm()));
    	} else if (remarketingRule instanceof PageVisitorsWhoVisitedAnotherPageRule) {
    		return String.format("PageVisitorsWhoVisitedAnotherPage(%s) and (%s)", getRuleItemGroups(
    				((PageVisitorsWhoVisitedAnotherPageRule)remarketingRule).getRuleItemGroups().getRuleItemGroups()),
    				getRuleItemGroups(((PageVisitorsWhoVisitedAnotherPageRule)remarketingRule).getAnotherRuleItemGroups().getRuleItemGroups()));
    	} else if (remarketingRule instanceof PageVisitorsWhoDidNotVisitAnotherPageRule) {
    		return String.format("PageVisitorsWhoDidNotVisitAnotherPage(%s) and not (%s)", getRuleItemGroups(
    				((PageVisitorsWhoDidNotVisitAnotherPageRule)remarketingRule).getIncludeRuleItemGroups().getRuleItemGroups()),
    				getRuleItemGroups(((PageVisitorsWhoDidNotVisitAnotherPageRule)remarketingRule).getExcludeRuleItemGroups().getRuleItemGroups()));
    	} else if (remarketingRule instanceof RemarketingRule){
    		return null;
    	} else {
    		throw new IllegalArgumentException("Invalid Remarketing Rule");
    	}
    }
    
    private static String getCustomEventsRule(CustomEventsRule rule) {
    	if (rule == null)
    		 return null;
    	List<String> rules = new ArrayList<String>();
    	if (rule.getCategoryOperator() != null && rule.getCategory() != null) {
    		rules.add(String.format("Category %s %s", rule.getCategoryOperator().value(), rule.getCategory()));
    	}
    	if (rule.getActionOperator() != null && rule.getAction() != null) {
    		rules.add(String.format("Action %s %s", rule.getActionOperator().value(), rule.getAction()));
    	}
    	if (rule.getLabelOperator() != null && rule.getLabel() != null) {
    		rules.add(String.format("Label %s %s", rule.getLabelOperator().value(), rule.getLabel()));
    	}
    	if (rule.getValueOperator() != null && rule.getValue() != null) {
    		rules.add(String.format("Value %s %s", rule.getValueOperator().value(), rule.getValue()));
    	}
    	if (rules.size() == 0) {
    		throw new IllegalArgumentException("Invalid Custom Events Rule");
    	}
    	StringBuilder str = new StringBuilder();
    	int index = 0;
    	for(; index < rules.size() - 1; index++) {
    		str.append(String.format(("(%s)"), rules.get(index)));
    		str.append(" and ");
    	}
    	str.append(String.format(("(%s)"), rules.get(index)));
    	return str.toString();
    }
     
    private static String getRuleItemGroups(List<RuleItemGroup> ruleItemGroups) {
    	return getRuleItemGroups(ruleItemGroups, NormalForm.DISJUNCTIVE);
    }
    
    private static String getRuleItemGroups(List<RuleItemGroup> ruleItemGroups, NormalForm nf) {
    	switch (nf) {
    	case CONJUNCTIVE: return getRuleItemGroups(ruleItemGroups, " and ", " or ");
    	case DISJUNCTIVE:
    		default: return getRuleItemGroups(ruleItemGroups, " or ", " and ");
    	}
    }
    
    private static String getRuleItemGroups(List<RuleItemGroup> ruleItemGroups, String outerOperator, String innerOperator) {
    	if (ruleItemGroups == null || ruleItemGroups.size() == 0) {
    		return null;
    	}
    	StringBuffer str = new StringBuffer();
    	int index = 0;
    	for(; index < ruleItemGroups.size() - 1; index++) {
    		str.append(String.format(("(%s)"), getRuleItems(ruleItemGroups.get(index).getItems().getRuleItems(), innerOperator)));
    		str.append(outerOperator);
    	}
    	str.append(String.format(("(%s)"), getRuleItems(ruleItemGroups.get(index).getItems().getRuleItems(), innerOperator)));
    	return str.toString();
    }
    
    private static String getRuleItems(List<RuleItem> ruleItems, String innerOperator) {
    	if (ruleItems == null || ruleItems.size() == 0) {
    		return null;
    	}
    	StringBuffer str = new StringBuffer();
    	int index = 0;
    	for(; index < ruleItems.size() - 1; index++) {
    		str.append(getRuleItem(ruleItems.get(index)));
    		str.append(innerOperator);
    	}
    	str.append(getRuleItem(ruleItems.get(index)));
    	return str.toString();
    }
    
    private static String getRuleItem(RuleItem ruleItem) {
    	if (ruleItem instanceof StringRuleItem) {  		
    		return String.format(("(%s %s %s)"), ((StringRuleItem)ruleItem).getOperand(), ((StringRuleItem)ruleItem).getOperator().value(), ((StringRuleItem)ruleItem).getValue());
    	}
    	return null;
    }
    
    public static RemarketingRule parseRemarketingRule(String s) {
    	if (StringExtensions.isNullOrEmpty(s))
    		return null;
    	int pos = s.indexOf('(');
    	if (pos == -1) {
    		throw new IllegalArgumentException(String.format("Invalid Remarketing Rule: %s", s));
    	}    	
    	String type = s.substring(0, pos);
    	String ruleStr = s.substring(pos + 1, s.length() - 1);    	
    	if (type.toLowerCase().equals("pagevisitors")) {
    		return parsePageVisitorsRule(ruleStr);
    	} else if (type.toLowerCase().equals("pagevisitorswhovisitedanotherpage")) {
    		return parsePageVisitorsWhoVisitedAnotherPageRule(ruleStr);
    	} else if (type.toLowerCase().equals("pagevisitorswhodidnotvisitanotherpage")) {
    		return parsePageVisitorsWhoDidNotVisitAnotherPage(ruleStr);
    	} else if (type.toLowerCase().equals("customevents")) {
    		return parseCustomeventsRule(ruleStr);
    	} else {
    		throw new IllegalArgumentException(String.format("Invalid Custom Remarketing Rule Type: %s", type));
    	}
    }
    
    private static RemarketingRule parsePageVisitorsRule(String ruleStr) {
    	if (StringExtensions.isNullOrEmpty(ruleStr)) {
    		return null;
    	}
    	return parseRuleItemGroupsForPageVisitorsRule(ruleStr);
    }
    
    private static PageVisitorsRule parseRuleItemGroupsForPageVisitorsRule(String ruleStr) {
    	final String patternDNF = "\\)\\) or \\(\\(";
    	final String patternCNF = "\\)\\) and \\(\\(";
    	final String patternAnd = "\\) and \\(";
    	final String patternOr = "\\) or \\(";
    	
    	PageVisitorsRule rule = new PageVisitorsRule();
    	rule.setType("PageVisitors");
    	rule.setNormalForm(NormalForm.DISJUNCTIVE);
    	ArrayOfRuleItemGroup ruleItemGroups = new ArrayOfRuleItemGroup();
    	rule.setRuleItemGroups(ruleItemGroups);

    	String [] expressionGroups = ruleStr.split(patternDNF);
    	// can not split with DNF, try CNF
    	if (expressionGroups.length == 1) {
    		expressionGroups = ruleStr.split(patternCNF);
    		
    		// fail to split with CNF neither, only ONE expression group
    		// try to split with inner pattern
    		if (expressionGroups.length == 1) {
    			String [] tmpExpressions = ruleStr.split(patternOr);
    			
    			// fail to split with inner or pattern, try to split with inner and pattern
    			if (tmpExpressions.length == 1) {
    				tmpExpressions = ruleStr.split(patternAnd);
					// all fail, seems only ONE expression, try to parse rule item to validate format, default to DNF
    				if (tmpExpressions.length == 1) {
    					parseRuleItem(ruleStr);
    				}
    				// succeed to split with inner and pattern, this is DNF
    				else {
    					rule.setNormalForm(NormalForm.DISJUNCTIVE);
    				}
    			}
    			// succeed to split with inner or pattern, this is CNF
    			else {
    				rule.setNormalForm(NormalForm.CONJUNCTIVE);
    			}
    		}
    		// succeed to split with outer and, it is CNF
    		else {
    			rule.setNormalForm(NormalForm.CONJUNCTIVE);
    		}
    	}
    	
    	String pattern = NormalForm.CONJUNCTIVE == rule.getNormalForm() ? patternOr : patternAnd;
    	
    	for (String expressionGroup : expressionGroups) {
    		expressionGroup = expressionGroup.trim();
    		
    		if (expressionGroup.startsWith("("))
    			expressionGroup = expressionGroup.substring(1).trim();
    		if (expressionGroup.endsWith(")"))
    			expressionGroup = expressionGroup.substring(0, expressionGroup.length() - 1).trim();
    			
    		String [] expressions = expressionGroup.split(pattern);    		
        	RuleItemGroup ruleItemGroup = new RuleItemGroup();
        	ruleItemGroup.setItems(new ArrayOfRuleItem());
        	ruleItemGroups.getRuleItemGroups().add(ruleItemGroup);

        	for (String ruleItemStr: expressions) {
        		RuleItem ruleItem = parseRuleItem(ruleItemStr);
        		ruleItemGroup.getItems().getRuleItems().add(ruleItem);
        	}
    	}
    	
    	return rule;
    }
    
    private static RemarketingRule parsePageVisitorsWhoVisitedAnotherPageRule(String ruleStr) {
    	if (StringExtensions.isNullOrEmpty(ruleStr)) {
    		return null;
    	}
    	PageVisitorsWhoVisitedAnotherPageRule rule = new PageVisitorsWhoVisitedAnotherPageRule();
    	rule.setType("PageVisitorsWhoVisitedAnotherPage");
    	String[] groups = ruleStr.split("\\)\\)\\) and \\(\\(\\(");
    	if (groups != null && groups.length == 2) {
    		rule.setRuleItemGroups(parseRuleItemGroups(groups[0]));
    		rule.setAnotherRuleItemGroups(parseRuleItemGroups(groups[1]));
    	}
    	return rule;
    }
    
    private static RemarketingRule parsePageVisitorsWhoDidNotVisitAnotherPage(String ruleStr) {
    	if (StringExtensions.isNullOrEmpty(ruleStr)) {
    		return null;
    	}
    	PageVisitorsWhoDidNotVisitAnotherPageRule rule = new PageVisitorsWhoDidNotVisitAnotherPageRule();
    	rule.setType("PageVisitorsWhoDidNotVisitAnotherPage");
    	String[] groups = ruleStr.split("\\)\\)\\) and not \\(\\(\\(");
    	if (groups != null && groups.length == 2) {
    		rule.setIncludeRuleItemGroups(parseRuleItemGroups(groups[0]));
    		rule.setExcludeRuleItemGroups(parseRuleItemGroups(groups[1]));
    	}
    	return rule;
    }
    
    private static RemarketingRule parseCustomeventsRule(String ruleStr) {
    	if (StringExtensions.isNullOrEmpty(ruleStr)) {
    		return null;
    	}
    	CustomEventsRule rule = new CustomEventsRule();
    	rule.setType("CustomEvents");
    	String ruleItemDelimiter = "\\) and \\(";
    	String[] ruleItemStrs = ruleStr.split(ruleItemDelimiter);
    	for (String ruleItemStr: ruleItemStrs) {
    		ruleItemStr = ruleItemStr.replaceAll("\\(", "").replaceAll("\\)", "");
    		Matcher operandMatcher = operandPattern.matcher(ruleItemStr);
    		if (operandMatcher.find()) {
    			String operand = operandMatcher.group(1).toLowerCase();
    			String operatorStr = operandMatcher.group(2);
    			
    			if (operand.equals("value")) {
    				Matcher numberOperator = numberOperatorPattern.matcher(operatorStr);
    				if (numberOperator.find()) {
    					rule.setValueOperator(parseNumberOperator(numberOperator.group(1)));
    					rule.setValue(new BigDecimal(numberOperator.group(2)));
    				} else {   				
    					throw new IllegalArgumentException(String.format("Invalid Custom Events Rule Item Value Operator: %s", operatorStr));
    				}
    			} else {
    				Matcher stringOperator = stringOperatorPattern.matcher(operatorStr);
    				if (stringOperator.find()) {
    					if (operand.equals("category")) {
    						rule.setCategoryOperator(parseStringOperator(stringOperator.group(1)));
    						rule.setCategory(stringOperator.group(2));
    					} else if (operand.equals("label")) {
    						rule.setLabelOperator(parseStringOperator(stringOperator.group(1)));
    						rule.setLabel(stringOperator.group(2));    						
    					} else if (operand.equals("action")) {
    						rule.setActionOperator(parseStringOperator(stringOperator.group(1)));
    						rule.setAction(stringOperator.group(2));
    					} else {
    						throw new IllegalArgumentException(String.format("Invalid Custom Events Rule Item Operand: %s", operand));
    					}
    				} else {   				
    					throw new IllegalArgumentException(String.format("Invalid Custom Events Rule Item String Operator: %s", operatorStr));
    				}
    			}	
    		} else {   				
    			throw new IllegalArgumentException(String.format("Invalid Custom Events Rule Item: %s", ruleItemStr));
    		}
    	}
    	return rule;
    }
    
    private static ArrayOfRuleItemGroup parseRuleItemGroups(String groups) {
    	String groupDelimiter = "\\)\\) or \\(\\(";
    	String[] groupItems = groups.split(groupDelimiter);
    	ArrayOfRuleItemGroup ruleItemGroups = new ArrayOfRuleItemGroup();
    	for (String group: groupItems) {
    		RuleItemGroup ruleItemGroup = parseRuleItemGroup(group);
    		if (ruleItemGroup != null) {
    			ruleItemGroups.getRuleItemGroups().add(ruleItemGroup);
    		}
    	}
    	return ruleItemGroups;
    }
    
    private static RuleItemGroup parseRuleItemGroup(String group) {
    	String ruleItemDelimiter = "\\) and \\(";
    	String[] ruleItems = group.split(ruleItemDelimiter);
    	RuleItemGroup ruleItemGroup = new RuleItemGroup();
    	ruleItemGroup.setItems(new ArrayOfRuleItem());
    	for (String ruleItemStr: ruleItems) {
    		RuleItem ruleItem = parseRuleItem(ruleItemStr);
    		if (ruleItems != null) {
    			ruleItemGroup.getItems().getRuleItems().add(ruleItem);
    		}
    	}
    	return ruleItemGroup;
    }
    
    private static RuleItem parseRuleItem(String ruleItemStr) {
    	ruleItemStr = ruleItemStr.replaceAll("\\(", "").replaceAll("\\)", "");   	
		Matcher match = stringPageRulePattern.matcher(ruleItemStr);
		if (match.find()) {
			StringRuleItem ruleItem = new StringRuleItem();
			ruleItem.setType("String");
			ruleItem.setOperand(match.group(1));
			ruleItem.setOperator(parseStringOperator(match.group(2)));
			ruleItem.setValue(match.group(3));
			return ruleItem;
		} else {
		    match = numberPageRulePattern.matcher(ruleItemStr);
	        if (match.find()) {
	            NumberRuleItem ruleItem = new NumberRuleItem();
	            ruleItem.setType("Number");
	            ruleItem.setOperand(match.group(1));
	            ruleItem.setOperator(parseNumberOperator(match.group(2)));
	            ruleItem.setValue(match.group(3));
	            return ruleItem;
	        } else {   				
	            throw new IllegalArgumentException(String.format("Invalid Rule Item: %s", ruleItemStr));
	        }
		}
    }                   
    
    private static NumberOperator parseNumberOperator(String operator) {
    	if (operator == null) {
    		return null;
    	}
    	operator = operator.toLowerCase();
    	if (operator.equals("equals")) {
    		return NumberOperator.EQUALS;
    	} else if (operator.equals("greaterthan")) {
    		return NumberOperator.GREATER_THAN;
    	} else if (operator.equals("lessthan")) {
    		return NumberOperator.LESS_THAN;
    	} else if (operator.equals("greaterthanequalto")) {
    		return NumberOperator.GREATER_THAN_EQUAL_TO;
    	} else if (operator.equals("lessthanequalto")) {
    		return NumberOperator.LESS_THAN_EQUAL_TO;
    	} else if (operator.equals("notequals")) {
    	    return NumberOperator.NOT_EQUALS;
    	} else {
    		throw new IllegalArgumentException(String.format("Invalid Number Rule Item operator: ", operator));
    	}
    }
    
    private static StringOperator parseStringOperator(String operator) {
    	if (operator == null) {
    		return null;
    	}
    	operator = operator.toLowerCase();
    	if (operator.equals("equals")) {
    		return StringOperator.EQUALS;
    	} else if (operator.equals("contains")) {
    		return StringOperator.CONTAINS;
    	} else if (operator.equals("beginswith")) {
    		return StringOperator.BEGINS_WITH;
    	} else if (operator.equals("endswith")) {
    		return StringOperator.ENDS_WITH;
    	} else if (operator.equals("notequals")) {
    		return StringOperator.NOT_EQUALS;
    	} else if (operator.equals("doesnotcontain")) {
    		return StringOperator.DOES_NOT_CONTAIN;
    	} else if (operator.equals("doesnotbeginwith")) {
    		return StringOperator.DOES_NOT_BEGIN_WITH;
    	} else if (operator.equals("doesnotendwith")) {
    		return StringOperator.DOES_NOT_END_WITH;
    	} else {
    		throw new IllegalArgumentException(String.format("Invalid String Rule Item perator: ", operator));
    	}
    }
    
    public static String toBulkString(HotelSetting hotelSetting) {
        if (hotelSetting == null) {
            return null;
        }
        
        Collection<HotelAdGroupType> hotelAdGroupTypes = hotelSetting.getHotelAdGroupType();
        
        if (hotelAdGroupTypes == null ||hotelAdGroupTypes.isEmpty()) {
            return null;
        }        
        
        return String.join(",", 
                hotelAdGroupTypes.stream()
                .map(e -> e.value())
                .toArray(CharSequence[]::new));
    }
    
    public static HotelSetting parseHotelSetting(String value) {        
        if (value != null) {
            String[] values = value.trim().replace('|', ',').split(",");
            if (values != null && values.length > 0) {
                List<HotelAdGroupType> hotelAdGroupTypes = Arrays.stream(values).filter(v -> v.isEmpty() == false).map(v -> HotelAdGroupType.fromValue(v))
                        .collect(Collectors.toList());
                if (hotelAdGroupTypes.isEmpty() == false) {
                    HotelSetting setting = new HotelSetting();
                    setting.setHotelAdGroupType(hotelAdGroupTypes);
                    setting.setType("HotelSetting");
                    return setting;
                }
            }
        }
        
        return null;
    }
    
    public static String toBulkString(TargetSetting targetSetting) {
        if (targetSetting == null) {
            return null;
        }
        
        if (targetSetting.getDetails() == null || targetSetting.getDetails().getTargetSettingDetails().size() == 0) {
            return StringTable.DeleteValue;
        }
        
        return String.join("; ", 
                targetSetting.getDetails()
                .getTargetSettingDetails()
                .stream()
                .filter(e -> e.getTargetAndBid())
                .map(e -> e.getCriterionTypeGroup().value())
                .toArray(CharSequence[]::new));
    }
    
    public static List<TargetSettingDetail> parseTargetSettingDetails(String details) {
        if (details == null || details.length() == 0) return null;
        
        return Arrays.stream(details.split(";"))
            .map(s -> s.trim())
            .map(s -> {
                Matcher m = targetSettingDetailsPattern.matcher(s);
                if (m.matches()) {
                    return m.group(1);
                }
                return null;
            })
            .filter(s -> s != null )
            .map(s -> {
                TargetSettingDetail targetSettingDetail = new TargetSettingDetail();
                targetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.fromValue(s));
                targetSettingDetail.setTargetAndBid(true);
                return targetSettingDetail;
            })
            .collect(Collectors.toList());
    }
    
    public static String writeArrayOfstring(ArrayOfstring arrayOfString, String separator) {
        if (arrayOfString == null) return null;
        
        if (arrayOfString.getStrings().size() == 0) {
            return null;
        }
        
        return String.join(separator, arrayOfString.getStrings());
    }

    public static ArrayOfstring parseArrayOfString(String value) {
        // TODO Auto-generated method stub
        if (isNullOrEmpty(value) ) return null;
        
        String[] parts = value.split(";");
        ArrayOfstring ret = new ArrayOfstring();
        ret.getStrings().addAll(
                Arrays.stream(parts)
                .map(s -> s.trim())
                .filter(s -> {
                    return s.length() > 0 && false == ";".equals(s);
                    }
                )
                .collect(Collectors.toList()));
        return ret;
    }

    public static Collection<ProductAudienceType> parseProductAudienceType(String value) {
        if (isNullOrEmpty(value) ) return null;
        String[] parts = value.split(";");
        return Arrays.stream(parts).map(s -> s.trim()).map(p -> ProductAudienceType.fromValue(p)).collect(Collectors.toList());
    }
    
    private static class ImageAssetLinkContract
    {
        // The Asset Id
        public Long id;

        // The Asset SubType
        public String subType;

        // The Asset CropHeight
        public int cropHeight;

        // The Asset CropWidth
        public int cropWidth;

        // The Asset CropX
        public int cropX;

        // The Asset CropY
        public int cropY;
        
        // The AssetLink PinnedField
        public String pinnedField;

        // The AssetLink EditorialStatus
        public String editorialStatus;

        // The AssetLink AssetPerformanceLabel is reserved for future use.
        public String assetPerformanceLabel;

        // The Asset Name is reserved for future use.
        public String name;
    }
    
    private static class TextAssetLinkContract {

        // The Asset Id
        @JsonProperty
        public Long id;

        // The Asset Text
        @JsonProperty
        public String text;

        // The AssetLink PinnedField
        @JsonProperty
        public String pinnedField;

        // The AssetLink EditorialStatus
        @JsonProperty
        public String editorialStatus;

        // The AssetLink AssetPerformanceLabel is reserved for future use
        @JsonProperty
        public String assetPerformanceLabel;

        // The Asset Name is reserved for future use.
        @JsonProperty
        public String name;
    }
    
    private static class VideoAssetLinkContract
    {
        // The Asset Id
        public Long id;

        // The Asset SubType
        public String subType;

        // The Asset ThumbnailImage
        public ImageAsset thumbnailImage;

        // The AssetLink PinnedField
        public String pinnedField;

        // The AssetLink EditorialStatus
        public String editorialStatus;

        // The AssetLink AssetPerformanceLabel is reserved for future use.
        public String assetPerformanceLabel;

        // The Asset Name is reserved for future use.
        public String name;
    }
    
    public static String toImageAssetLinksBulkString(ArrayOfAssetLink arrayOfAssetLink)
    {
        if (arrayOfAssetLink == null 
                || arrayOfAssetLink.getAssetLinks() == null 
                || arrayOfAssetLink.getAssetLinks().size() == 0) {
            return null;
        }
        List<AssetLink> assetLinks = arrayOfAssetLink
                .getAssetLinks()
                .stream()
                .filter(link -> link.getAsset() instanceof ImageAsset)
                .collect(Collectors.toList());
        if (assetLinks.size() == 0) {
            return null;
        }
        
        List<ImageAssetLinkContract> imageAssetLinkContracts = new ArrayList<ImageAssetLinkContract>(assetLinks.size());
        
        for (AssetLink assetLink : assetLinks) {
            ImageAsset asset = (ImageAsset)assetLink.getAsset();
            ImageAssetLinkContract contract = new ImageAssetLinkContract();
            contract.assetPerformanceLabel = assetLink.getAssetPerformanceLabel();
            contract.cropHeight = asset.getCropHeight();
            contract.cropWidth = asset.getCropWidth();
            contract.cropX = asset.getCropX();
            contract.cropY = asset.getCropY();
            contract.id = asset.getId();
            contract.editorialStatus = assetLink.getEditorialStatus() == null? null : assetLink.getEditorialStatus().value();
            contract.name = asset.getName();
            contract.pinnedField = assetLink.getPinnedField();
            contract.subType = asset.getSubType();
            
            imageAssetLinkContracts.add(contract);
        }
        try {
            return new ObjectMapper().writeValueAsString(imageAssetLinkContracts);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public static ArrayOfAssetLink parseImageAssetLinks(String value)
    {
        if (value == null || value.isEmpty()) {
            return null;
        }
        
        try {
            ObjectMapper mapper = new ObjectMapper();
            ArrayOfAssetLink assetLinks = new ArrayOfAssetLink();
            
            List<ImageAssetLinkContract> imageAssetLinkContracts = mapper.readValue(value, mapper.getTypeFactory().constructCollectionType(List.class, ImageAssetLinkContract.class));
            for (ImageAssetLinkContract contract : imageAssetLinkContracts) {
                AssetLink assetLink = new AssetLink();
                if (contract.editorialStatus != null) {
                    assetLink.setEditorialStatus(AssetLinkEditorialStatus.fromValue(contract.editorialStatus));
                }
                assetLink.setAssetPerformanceLabel(contract.assetPerformanceLabel);
                assetLink.setPinnedField(contract.pinnedField);
                
                ImageAsset asset = new ImageAsset();
                asset.setId(contract.id);
                asset.setName(contract.name);
                asset.setCropHeight(contract.cropHeight);
                asset.setCropWidth(contract.cropWidth);
                asset.setCropX(contract.cropX);
                asset.setCropY(contract.cropY);
                asset.setSubType(contract.subType);
                asset.setType("ImageAsset");
                assetLink.setAsset(asset);
                assetLinks.getAssetLinks().add(assetLink);
            }
            return assetLinks;
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    public static String toTextAssetLinksBulkString(ArrayOfAssetLink arrayOfAssetLink)
    {
        if (arrayOfAssetLink == null 
                || arrayOfAssetLink.getAssetLinks() == null 
                || arrayOfAssetLink.getAssetLinks().size() == 0) {
            return null;
        }
        List<AssetLink> assetLinks = arrayOfAssetLink
                .getAssetLinks()
                .stream()
                .filter(link -> link.getAsset() instanceof TextAsset)
                .collect(Collectors.toList());
        if (assetLinks.size() == 0) {
            return null;
        }
        
        List<TextAssetLinkContract> textAssetLinkContracts = new ArrayList<TextAssetLinkContract>(assetLinks.size());
        
        for (AssetLink assetLink : assetLinks) {
            TextAssetLinkContract textAssetLinkContract = new TextAssetLinkContract();
            textAssetLinkContract.editorialStatus = assetLink.getEditorialStatus() == null? null : assetLink.getEditorialStatus().value();
            textAssetLinkContract.id = assetLink.getAsset().getId();
            textAssetLinkContract.name =assetLink.getAsset().getName();
            textAssetLinkContract.pinnedField = assetLink.getPinnedField();
            textAssetLinkContract.text = ((TextAsset)assetLink.getAsset()).getText();
            textAssetLinkContract.assetPerformanceLabel = assetLink.getAssetPerformanceLabel();
            textAssetLinkContracts.add(textAssetLinkContract);
        }
        try {
            return new ObjectMapper().writeValueAsString(textAssetLinkContracts);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayOfAssetLink parseTextAssetLinks(String value)
    {
        if (value == null || value.isEmpty()) {
            return null;
        }
        
        try {
            ObjectMapper mapper = new ObjectMapper();
            ArrayOfAssetLink assetLinks = new ArrayOfAssetLink();
            
            List<TextAssetLinkContract> textAssetLinkContracts = mapper.readValue(value, mapper.getTypeFactory().constructCollectionType(List.class, TextAssetLinkContract.class));
            for (TextAssetLinkContract contract : textAssetLinkContracts) {
                AssetLink assetLink = new AssetLink();
                if (contract.editorialStatus != null) {
                    assetLink.setEditorialStatus(AssetLinkEditorialStatus.fromValue(contract.editorialStatus));
                }
                assetLink.setAssetPerformanceLabel(contract.assetPerformanceLabel);
                assetLink.setPinnedField(contract.pinnedField);
                TextAsset asset = new TextAsset();
                asset.setId(contract.id);
                asset.setName(contract.name);
                asset.setText(contract.text);
                asset.setType("TextAsset");
                assetLink.setAsset(asset);
                assetLinks.getAssetLinks().add(assetLink);
            }
            return assetLinks;
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    public static String toVideoAssetLinksBulkString(ArrayOfAssetLink arrayOfAssetLink)
    {
        if (arrayOfAssetLink == null 
                || arrayOfAssetLink.getAssetLinks() == null 
                || arrayOfAssetLink.getAssetLinks().size() == 0) {
            return null;
        }
        List<AssetLink> assetLinks = arrayOfAssetLink
                .getAssetLinks()
                .stream()
                .filter(link -> link.getAsset() instanceof VideoAsset)
                .collect(Collectors.toList());
        if (assetLinks.size() == 0) {
            return null;
        }
        
        List<VideoAssetLinkContract> videoAssetLinkContracts = new ArrayList<VideoAssetLinkContract>(assetLinks.size());
        
        for (AssetLink assetLink : assetLinks) {
            VideoAsset asset = (VideoAsset)assetLink.getAsset();
            VideoAssetLinkContract contract = new VideoAssetLinkContract();
            contract.assetPerformanceLabel = assetLink.getAssetPerformanceLabel();
            contract.id = asset.getId();
            contract.editorialStatus = assetLink.getEditorialStatus() == null? null : assetLink.getEditorialStatus().value();
            contract.name = asset.getName();
            contract.pinnedField = assetLink.getPinnedField();
            contract.subType = asset.getSubType();
            contract.thumbnailImage = asset.getThumbnailImage();            
            videoAssetLinkContracts.add(contract);
        }
        try {
            return new ObjectMapper().writeValueAsString(videoAssetLinkContracts);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public static ArrayOfAssetLink parseVideoAssetLinks(String value)
    {
        if (value == null || value.isEmpty()) {
            return null;
        }
        
        try {
            ObjectMapper mapper = new ObjectMapper();
            ArrayOfAssetLink assetLinks = new ArrayOfAssetLink();
            
            List<VideoAssetLinkContract> videoAssetLinkContracts = mapper.readValue(value, mapper.getTypeFactory().constructCollectionType(List.class, VideoAssetLinkContract.class));
            for (VideoAssetLinkContract contract : videoAssetLinkContracts) {
                AssetLink assetLink = new AssetLink();
                if (contract.editorialStatus != null) {
                    assetLink.setEditorialStatus(AssetLinkEditorialStatus.fromValue(contract.editorialStatus));
                }
                assetLink.setAssetPerformanceLabel(contract.assetPerformanceLabel);
                assetLink.setPinnedField(contract.pinnedField);
                
                VideoAsset asset = new VideoAsset();
                asset.setId(contract.id);
                asset.setName(contract.name);
                asset.setThumbnailImage(contract.thumbnailImage);
                asset.setSubType(contract.subType);
                asset.setType("VideoAsset");
                assetLink.setAsset(asset);
                assetLinks.getAssetLinks().add(assetLink);
            }
            return assetLinks;
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    public static String toActionAdExtensionActionTypeBulkString(ActionAdExtensionActionType type) {
        if (type == null) {
            return null;
        }

        return type.value();
    }
    
    public static String ToFeedCustomAttributesBulkString(List<FeedCustomAttribute> customAttributes) {
        if (customAttributes == null || customAttributes.size() == 0) {
            return null;
        }
        
        try {
            return new ObjectMapper().writeValueAsString(customAttributes);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<FeedCustomAttribute> parseFeedCustomAttributes(String strCustomAttributes) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(strCustomAttributes,
                    mapper.getTypeFactory().constructCollectionType(
                            List.class,
                            FeedCustomAttribute.class)
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeBiddingScheme(BiddingScheme biddingScheme, Long entityId, RowValues values) {
        try {

            if (biddingScheme == null) {
                return;
            }

            values.put(StringTable.BidStrategyType, StringExtensions.toBiddingSchemeBulkString(biddingScheme));

            if (biddingScheme instanceof MaxClicksBiddingScheme) {
                Bid maxCpc = ((MaxClicksBiddingScheme)biddingScheme).getMaxCpc();
                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc, entityId));
            }
            else if (biddingScheme instanceof MaxConversionsBiddingScheme) {
                Bid maxCpc = ((MaxConversionsBiddingScheme)biddingScheme).getMaxCpc();
                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc, entityId));
                Double targetCpa = ((MaxConversionsBiddingScheme)biddingScheme).getTargetCpa();
                if (targetCpa != null) {
                    values.put(StringTable.BidStrategyTargetCpa, targetCpa.toString());
                }
            }
            else if (biddingScheme instanceof TargetCpaBiddingScheme) {
                Bid maxCpc = ((TargetCpaBiddingScheme)biddingScheme).getMaxCpc();
                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc, entityId));
                Double targetCpa = ((TargetCpaBiddingScheme)biddingScheme).getTargetCpa();
                if (targetCpa != null) {
                    values.put(StringTable.BidStrategyTargetCpa, targetCpa.toString());
                }
            } else if (biddingScheme instanceof MaxConversionValueBiddingScheme) {
                Double targetRoas = ((MaxConversionValueBiddingScheme)biddingScheme).getTargetRoas();
                if (targetRoas != null) {
                    values.put(StringTable.BidStrategyTargetRoas, StringExtensions.toBulkString(targetRoas.toString()));
                }
            } else if (biddingScheme instanceof TargetRoasBiddingScheme) {
                TargetRoasBiddingScheme targetRoasBiddingScheme = (TargetRoasBiddingScheme)biddingScheme;
                if (targetRoasBiddingScheme != null)
                {
                    values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(targetRoasBiddingScheme.getMaxCpc(), entityId));
                    values.put(StringTable.BidStrategyTargetRoas, StringExtensions.toBulkString(targetRoasBiddingScheme.getTargetRoas()));
                }
            } else if  (biddingScheme instanceof TargetImpressionShareBiddingScheme) {
                TargetImpressionShareBiddingScheme targetImpressionShareBiddingScheme = (TargetImpressionShareBiddingScheme)biddingScheme;
                if (targetImpressionShareBiddingScheme != null)
                {
                    values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(targetImpressionShareBiddingScheme.getMaxCpc(), entityId));
                    values.put(StringTable.BidStrategyTargetAdPosition, StringExtensions.toOptionalBulkString(targetImpressionShareBiddingScheme.getTargetAdPosition(), entityId));
                    values.put(StringTable.BidStrategyTargetImpressionShare, StringExtensions.toBulkString(targetImpressionShareBiddingScheme.getTargetImpressionShare()));
                }
            } else if (biddingScheme instanceof PercentCpcBiddingScheme) {
                PercentCpcBiddingScheme percentCpcBiddingScheme = (PercentCpcBiddingScheme) biddingScheme;
                if (percentCpcBiddingScheme != null) {
                    Double maxPercentCpc = percentCpcBiddingScheme.getMaxPercentCpc();
                    values.put(StringTable.BidStrategyPercentMaxCpc, StringExtensions.toBulkString(maxPercentCpc));
                }
            } else if (biddingScheme instanceof CommissionBiddingScheme) {
                CommissionBiddingScheme commissionBiddingScheme = (CommissionBiddingScheme) biddingScheme;
                if (commissionBiddingScheme != null) {
                    Double commissionRate = commissionBiddingScheme.getCommissionRate();
                    values.put(StringTable.BidStrategyCommissionRate, StringExtensions.toBulkString(commissionRate));
                }
            }
        
        } catch (Exception e) {
                e.printStackTrace();
        }        
    }

    public static BiddingScheme readBiddingScheme(RowValues values) {
        try {
            String bidStrategyTypeRowValue = values.get(StringTable.BidStrategyType);
            BiddingScheme biddingScheme = parseBiddingScheme(bidStrategyTypeRowValue);

            if (biddingScheme == null) {
                return null;
            }

            String maxCpcRowValue = values.get(StringTable.BidStrategyMaxCpc);
            String targetCpaRowValue = values.get(StringTable.BidStrategyTargetCpa);
            String targetRoas = values.get(StringTable.BidStrategyTargetRoas);
            String targetAdPositionValue = values.get(StringTable.BidStrategyTargetAdPosition);
            String targetImpressionShareRowValue = values.get(StringTable.BidStrategyTargetImpressionShare);
            String commissionRate= values.get(StringTable.BidStrategyCommissionRate);
            String maxPercentCpc = values.get(StringTable.BidStrategyPercentMaxCpc);


            Bid maxCpcValue = StringExtensions.parseBid(maxCpcRowValue);
            Double targetCpaValue = StringExtensions.nullOrDouble(targetCpaRowValue);
            Double targetRosValue = StringExtensions.nullOrDouble(targetRoas);
            Double targetImpressionShareValue = StringExtensions.nullOrDouble(targetImpressionShareRowValue);
            Double commissionRateValue = StringExtensions.nullOrDouble(commissionRate);
            Double maxPercentCpcValue = StringExtensions.nullOrDouble(maxPercentCpc);
            
            if (biddingScheme instanceof MaxClicksBiddingScheme) {
                ((MaxClicksBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
            }
            else if (biddingScheme instanceof MaxConversionsBiddingScheme) {
                ((MaxConversionsBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                ((MaxConversionsBiddingScheme)biddingScheme).setTargetCpa(targetCpaValue);
            } else if (biddingScheme instanceof TargetCpaBiddingScheme) {
                ((TargetCpaBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                ((TargetCpaBiddingScheme)biddingScheme).setTargetCpa(targetCpaValue);
            } else if (biddingScheme instanceof MaxConversionValueBiddingScheme) {
                ((MaxConversionValueBiddingScheme)biddingScheme).setTargetRoas(targetRosValue);
            } else if (biddingScheme instanceof TargetRoasBiddingScheme) {
                ((TargetRoasBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                ((TargetRoasBiddingScheme)biddingScheme).setTargetRoas(targetRosValue);
            } else if (biddingScheme instanceof TargetImpressionShareBiddingScheme) {
                ((TargetImpressionShareBiddingScheme)biddingScheme).setType("TargetImpressionShare");
                ((TargetImpressionShareBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                ((TargetImpressionShareBiddingScheme)biddingScheme).setTargetImpressionShare(targetImpressionShareValue);
                ((TargetImpressionShareBiddingScheme)biddingScheme).setTargetAdPosition(targetAdPositionValue);
            } else if (biddingScheme instanceof CommissionBiddingScheme) {
                ((CommissionBiddingScheme)biddingScheme).setCommissionRate(commissionRateValue);
            } else if (biddingScheme instanceof PercentCpcBiddingScheme) {
                ((PercentCpcBiddingScheme)biddingScheme).setMaxPercentCpc(maxPercentCpcValue);
            }
            return biddingScheme;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

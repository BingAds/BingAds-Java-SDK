package com.microsoft.bingads.v10.internal.bulk;


import com.microsoft.bingads.v10.bulk.entities.LocationTargetType;
import com.microsoft.bingads.v10.bulk.entities.Status;
import com.microsoft.bingads.v10.campaignmanagement.AdDistribution;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupRemarketingListAssociationStatus;
import com.microsoft.bingads.v10.campaignmanagement.AdRotation;
import com.microsoft.bingads.v10.campaignmanagement.AdRotationType;
import com.microsoft.bingads.v10.campaignmanagement.AdStatus;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v10.campaignmanagement.Bid;
import com.microsoft.bingads.v10.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.BusinessGeoCodeStatus;
import com.microsoft.bingads.v10.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v10.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v10.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v10.campaignmanagement.Date;
import com.microsoft.bingads.v10.campaignmanagement.Day;
import com.microsoft.bingads.v10.campaignmanagement.DayTime;
import com.microsoft.bingads.v10.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.FixedBid;
import com.microsoft.bingads.v10.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v10.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MatchType;
import com.microsoft.bingads.v10.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.Minute;
import com.microsoft.bingads.v10.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.IllegalArgumentException;
import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;

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

    public static String toKeywordBidBulkString(Bid bid) {
        if (bid == null) {
            return null;
        }

        if (bid.getAmount() == null) {
            return StringTable.DeleteValue;
        }

        return StringExtensions.toBulkString(bid.getAmount());
    }

    ;
	
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
        if (headerValue == null || headerValue.length() == 0) {
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

    public static String isOnOrOff(Collection<AdDistribution> values, AdDistribution lookingFor) {
        if (values == null) {
            return null;
        }

        return values.contains(lookingFor) ? StringTable.On : StringTable.Off;
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
    
    public static String toScheduleDateBulkString(Date c) {
    	if (c == null || (c.getMonth() == 0 && c.getDay() == 0 && c.getYear() == 0)) {
            return StringTable.DeleteValue;
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

    /**
     * Determines if the search ad distribution is marked as on. Returns null if the String does not match any known.
     *
     * @param v A String representation of the state of ad distribution
     * @return a {@link AdDistribution} or null if there is no match or it is not turned on
     */
    public static AdDistribution parseSearchAdDistribution(String v) {
        if (StringExtensions.isTurnedOn(v)) {
            return AdDistribution.SEARCH;
        } else {
            return null;
        }
    }

    /**
     * Determines if the content ad distribution is marked as on. Returns null if the String does not match any known.
     *
     * @param v A String representation of the state of ad distribution
     * @return a {@link AdDistribution} or null if there is no match or it is not turned on
     */
    public static AdDistribution parseContentAdDistribution(String v) {
        if (StringExtensions.isTurnedOn(v)) {
            return AdDistribution.CONTENT;
        } else {
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

    public static String toOptionalBulkString(String value) {
        if (value == null) {
            return null;
        }

        if (value.isEmpty()) {
            return StringTable.DeleteValue;
        }

        return value;
    }

    public static String getValueOrEmptyString(String v) {
        if (v == null || v.isEmpty()) {
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

    public static String toAdGroupBidBulkString(Bid bid) {
        if (bid == null || bid.getAmount() == null) {
            return null;
        }

        if (bid.getAmount() == 0.0) {
            return StringTable.DeleteValue;
        }

        return bid.getAmount().toString();
    }

    public static CriterionBid parseFixedAdGroupBid(String v) {
        Bid bid = StringExtensions.parseAdGroupBid(v);

        if (bid == null) {
            return null;
        }

        FixedBid fixedBid = new FixedBid();
        fixedBid.setBid(bid);
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

    public static String toBooleanBulkString(Boolean isCallOnly) {
        if (isCallOnly == null) {
            return null;
        }

        if (isCallOnly) {
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

    public static String toAdGroupRemarketingListAssociationStatusBulkString(AdGroupRemarketingListAssociationStatus status) {
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
    
    public static String writeUrls(String separator, ArrayOfstring strings) {
        if (strings == null) {
            return null;
        }
        
        if (strings.getStrings().size() == 0) {
        	return StringTable.DeleteValue;
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
    
    public static String toCustomParaBulkString(CustomParameters parameters) {
    	if (parameters == null) {
    		return null;
    	}
    	
    	ArrayOfCustomParameter customParaArray = parameters.getParameters();
    	if (customParaArray == null || customParaArray.getCustomParameters().size() == 0) {
    		return StringTable.DeleteValue;
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
    	} else if (s.equals("TargetCpa")) {
    		biddingScheme = new TargetCpaBiddingScheme();
    		biddingScheme.setType("TargetCpa");
    	} else if (s.equals("MaxClicks")) {
    		biddingScheme = new MaxClicksBiddingScheme();
    		biddingScheme.setType("MaxClicks");
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
    	} else if (biddingScheme instanceof TargetCpaBiddingScheme) {
    		return "TargetCpa";
    	} else if (biddingScheme instanceof MaxClicksBiddingScheme) {
    		return "MaxClicks";
    	} else {
    		throw new IllegalArgumentException("Unknown bidding scheme");
    	}
    }
    
    public static String toNativePreferenceBulkString(ArrayOfKeyValuePairOfstringstring parameters) {
    	if (parameters == null) {
    		return null;
    	}
    	
    	List<KeyValuePairOfstringstring> listOfKeyValuePair = parameters.getKeyValuePairOfstringstrings();
    	
    	for(KeyValuePairOfstringstring keyValuePair: listOfKeyValuePair) {   		
    		if(keyValuePair.getKey().equals("NativePreference")) {   		
    			
    			String value = keyValuePair.getValue().toLowerCase();
  			
    			if(value.equals("true")) {
    				return "Native";
    			} else if (value.equals("false")){
    				return "All";
    			} else {
    				throw new IllegalArgumentException(String.format("Unknown value for Native Preference : %s", value));
    			}			 
    		}
    	}   	
    	return null;
    }
    
    public static List<Long> parseImageMediaIds(String v) {
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
    
    public static String writeMediaIds(String separator, ArrayOflong ids) {
        if (ids == null) {
            return null;
        }
        
        if (ids.getLongs().size() == 0) {
        	return StringTable.DeleteValue;
        }
        
        StringBuilder result = new StringBuilder("");

        int length =  ids.getLongs().size();
        for (Integer i = 0; i < length - 1; i++) {
            result.append(ids.getLongs().get(i) + separator);
        }

        result.append(ids.getLongs().get(length - 1));

        return result.toString();
    }
    
    public static ArrayOfstring parseStructuredSnippetValues(String v) {
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
    
    public static String writeStructuredSnippetValues(String separator, ArrayOfstring values) {
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
    
    public static String toDayTimeRangesBulkString(ArrayOfDayTime arrayOfDayTime) {
    	if (arrayOfDayTime == null) {
    		return StringTable.DeleteValue;
    	}
    	
    	List<DayTime> dayTimeRanges = arrayOfDayTime.getDayTimes();
    	if (dayTimeRanges == null || dayTimeRanges.size() == 0) {
    		return StringTable.DeleteValue;
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
    
    public static String toUseSearcherTimeZoneBulkString(Boolean useSearcherTimeZone) {
    	if (useSearcherTimeZone == null) {
    		return StringTable.DeleteValue;
    	}
    	return useSearcherTimeZone ? "true": "false";
    }
    
    public static Boolean parseUseSearcherTimeZone(String s) {
    	if(StringExtensions.isNullOrEmpty(s)) {
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
}

package com.microsoft.bingads.internal;

import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.bulk.entities.LocationTargetType;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.campaignmanagement.AdDistribution;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.AdRotation;
import com.microsoft.bingads.campaignmanagement.AdRotationType;
import com.microsoft.bingads.campaignmanagement.AdStatus;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.campaignmanagement.BusinessGeoCodeStatus;
import com.microsoft.bingads.campaignmanagement.CriterionBid;
import com.microsoft.bingads.campaignmanagement.Date;
import com.microsoft.bingads.campaignmanagement.FixedBid;
import com.microsoft.bingads.campaignmanagement.MatchType;
import com.microsoft.bingads.campaignmanagement.Minute;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;

public class StringExtensions {

    private static final String UNKNOWN_DEVICE_PREFERENCE = "Unknown device preference";
    private static final String ALL = "All";
    private static final String MOBILE = "Mobile";
    private static final String DATE_OUTPUT_FORMAT = "%d/%d/%d";
    //private static final DateTimeFormatter DATE_INPUT_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");

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

    public static String toCriterionBidBulkString(BulkAdGroupProductTarget c) {
        FixedBid bid = FixedBid.class.cast(c.getBiddableAdGroupCriterion().getCriterionBid());

        if (bid == null) {
            return null;
        }

        return StringExtensions.toAdGroupBidBulkString(bid.getBid());
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
}

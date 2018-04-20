package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a call ad extension. This class exposes {@link #setCallAdExtension} and {@link #getCallAdExtension}
 * that can be used to read and write fields of the Call Ad Extension record in a bulk file.
 *
 * For more information, see Call Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCallAdExtension extends BulkAdExtension<CallAdExtension> {

    /**
     * Gets the call ad extension.
     */
    public CallAdExtension getCallAdExtension() {
        return this.getAdExtension();
    }

    /**
     * Sets the call ad extension.
     */
    public void setCallAdExtension(CallAdExtension value) {
        this.setAdExtension(value);
    }

    private static List<BulkMapping<BulkCallAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkCallAdExtension>> m = new ArrayList<BulkMapping<BulkCallAdExtension>>();

        m.add(new SimpleBulkMapping<BulkCallAdExtension, String>(StringTable.PhoneNumber,
                new Function<BulkCallAdExtension, String>() {
                    @Override
                    public String apply(BulkCallAdExtension c) {
                        return c.getCallAdExtension().getPhoneNumber();
                    }
                },
                new BiConsumer<String, BulkCallAdExtension>() {
                    @Override
                    public void accept(String v, BulkCallAdExtension c) {
                        c.getCallAdExtension().setPhoneNumber(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCallAdExtension, String>(StringTable.CountryCode,
                new Function<BulkCallAdExtension, String>() {
                    @Override
                    public String apply(BulkCallAdExtension c) {
                        return c.getCallAdExtension().getCountryCode();
                    }
                },
                new BiConsumer<String, BulkCallAdExtension>() {
                    @Override
                    public void accept(String v, BulkCallAdExtension c) {
                        c.getCallAdExtension().setCountryCode(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCallAdExtension, String>(StringTable.IsCallOnly,
                new Function<BulkCallAdExtension, String>() {
                    @Override
                    public String apply(BulkCallAdExtension c) {
                        return StringExtensions.toBooleanBulkString(c.getCallAdExtension().getIsCallOnly());
                    }
                },
                new BiConsumer<String, BulkCallAdExtension>() {
                    @Override
                    public void accept(String v, BulkCallAdExtension c) {
                        c.getCallAdExtension().setIsCallOnly(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCallAdExtension, String>(StringTable.IsCallTrackingEnabled,
                new Function<BulkCallAdExtension, String>() {
                    @Override
                    public String apply(BulkCallAdExtension c) {
                        return StringExtensions.toBooleanBulkString(c.getCallAdExtension().getIsCallTrackingEnabled());
                    }
                },
                new BiConsumer<String, BulkCallAdExtension>() {
                    @Override
                    public void accept(String v, BulkCallAdExtension c) {
                        c.getCallAdExtension().setIsCallTrackingEnabled(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCallAdExtension, String>(StringTable.RequireTollFreeTrackingNumber,
                new Function<BulkCallAdExtension, String>() {
                    @Override
                    public String apply(BulkCallAdExtension c) {
                        return StringExtensions.toBooleanBulkString(c.getCallAdExtension().getRequireTollFreeTrackingNumber());
                    }
                },
                new BiConsumer<String, BulkCallAdExtension>() {
                    @Override
                    public void accept(String v, BulkCallAdExtension c) {
                        c.getCallAdExtension().setRequireTollFreeTrackingNumber(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        CallAdExtension extension = new CallAdExtension();
        extension.setType("CallAdExtension");
        this.setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        this.validatePropertyNotNull(this.getCallAdExtension(), "CallAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

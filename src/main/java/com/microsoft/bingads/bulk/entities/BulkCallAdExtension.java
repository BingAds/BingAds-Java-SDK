package com.microsoft.bingads.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.adextensions.BulkAdExtensionBase;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

/**
 * Represents a call ad extension. This class exposes the
 * {@link BulkCallAdExtension#callAdExtension} property that can be read and
 * written as fields of the Call Ad Extension record in a bulk file. For more
 * information, see Call Ad Extension at
 * {@link http://go.microsoft.com/fwlink/?LinkID=511514}.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCallAdExtension extends BulkAdExtensionBase<CallAdExtension> {

    /**
     * The call ad extension.
     */
    public CallAdExtension getCallAdExtension() {
        return this.getAdExtension();
    }

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
    public void processMappingsToRowValues(RowValues values) {
        this.validatePropertyNotNull(this.getCallAdExtension(), "CallAdExtension");

        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

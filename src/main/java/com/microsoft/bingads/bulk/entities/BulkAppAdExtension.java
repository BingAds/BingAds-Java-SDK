package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.campaignmanagement.AppAdExtension;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an app ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the App Ad Extension record in a
 * bulk file.
 *
 * For more information, see app Ad Extension at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=515901">http://go.microsoft.com/fwlink/?LinkID=515901</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAppAdExtension extends BulkAdExtension<AppAdExtension> {

    /**
     * Gets the app ad extension.
     */
    public AppAdExtension getAppAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the app ad extension.
     */
    public void setAppAdExtension(AppAdExtension appAdExtension) {
        setAdExtension(appAdExtension);
    }

    private static final List<BulkMapping<BulkAppAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkAppAdExtension>> m = new ArrayList<BulkMapping<BulkAppAdExtension>>();

        m.add(new SimpleBulkMapping<BulkAppAdExtension, String>(
                StringTable.AppPlatform,
                new Function<BulkAppAdExtension, String>() {
                    @Override
                    public String apply(BulkAppAdExtension c) {
                        return c.getAppAdExtension().getAppPlatform();
                    }
                },
                new BiConsumer<String, BulkAppAdExtension>() {
                    @Override
                    public void accept(String v, BulkAppAdExtension c) {
                        c.getAppAdExtension().setAppPlatform(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppAdExtension, String>(
                StringTable.AppStoreId,
                new Function<BulkAppAdExtension, String>() {
                    @Override
                    public String apply(BulkAppAdExtension c) {
                        return c.getAppAdExtension().getAppStoreId();
                    }
                },
                new BiConsumer<String, BulkAppAdExtension>() {
                    @Override
                    public void accept(String v, BulkAppAdExtension c) {
                        c.getAppAdExtension().setAppStoreId(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppAdExtension, String>(StringTable.DestinationUrl,
                new Function<BulkAppAdExtension, String>() {
                    @Override
                    public String apply(BulkAppAdExtension c) {
                        return c.getAppAdExtension().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkAppAdExtension>() {
                    @Override
                    public void accept(String v, BulkAppAdExtension c) {
                        c.getAppAdExtension().setDestinationUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppAdExtension, String>(
                StringTable.Text,
                new Function<BulkAppAdExtension, String>() {
                    @Override
                    public String apply(BulkAppAdExtension c) {
                        return c.getAppAdExtension().getDisplayText();
                    }
                },
                new BiConsumer<String, BulkAppAdExtension>() {
                    @Override
                    public void accept(String v, BulkAppAdExtension c) {
                        c.getAppAdExtension().setDisplayText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppAdExtension, String>(StringTable.DevicePreference,
                new Function<BulkAppAdExtension, String>() {
                    @Override
                    public String apply(BulkAppAdExtension c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getAppAdExtension().getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkAppAdExtension>() {
                    @Override
                    public void accept(String v, BulkAppAdExtension c) {
                        c.getAppAdExtension().setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        AppAdExtension extension = new AppAdExtension();

        extension.setType("AppAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getAppAdExtension(), "AppAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

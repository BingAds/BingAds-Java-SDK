package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AppDownloadGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents an appdownload goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkAppDownloadGoal#setAppDownloadGoal} and {@link BulkAppDownloadGoal#getAppDownloadGoal}
 * methods that can be used to read and write fields of the AppDownload Goal record in a bulk file.
 *
 * <p>
 *     For more information, see AppDownload Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAppDownloadGoal extends BulkConversionGoal<AppDownloadGoal> {


    private static final List<BulkMapping<BulkAppDownloadGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkAppDownloadGoal>> m = new ArrayList<BulkMapping<BulkAppDownloadGoal>>();

        m.add(new SimpleBulkMapping<BulkAppDownloadGoal, String>(StringTable.AppPlatform,
                new Function<BulkAppDownloadGoal, String>() {
                    @Override
                    public String apply(BulkAppDownloadGoal c) {
                        return c.getAppDownloadGoal().getAppPlatform();
                    }
                },
                new BiConsumer<String, BulkAppDownloadGoal>() {
                    @Override
                    public void accept(String v, BulkAppDownloadGoal c) {
                        c.getAppDownloadGoal().setAppPlatform(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppDownloadGoal, String>(StringTable.AppStoreId,
                new Function<BulkAppDownloadGoal, String>() {
                    @Override
                    public String apply(BulkAppDownloadGoal c) {
                        return c.getAppDownloadGoal().getAppStoreId();
                    }
                },
                new BiConsumer<String, BulkAppDownloadGoal>() {
                    @Override
                    public void accept(String v, BulkAppDownloadGoal c) {
                        c.getAppDownloadGoal().setAppStoreId(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Get the appdownload goal.
     */
    public AppDownloadGoal getAppDownloadGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the appdownload goal.
     */
    public void setAppDownloadGoal(AppDownloadGoal AppDownloadGoal) {
        this.setConversionGoal(AppDownloadGoal);
    }

    @Override
    public AppDownloadGoal createConversionGoal() {
        return new AppDownloadGoal();
    }

}

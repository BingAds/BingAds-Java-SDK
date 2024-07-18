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
import com.microsoft.bingads.v13.campaignmanagement.AppInstallGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a appinstall goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkAppInstallGoal#setAppInstallGoal} and {@link BulkAppInstallGoal#getAppInstallGoal}
 * methods that can be used to read and write fields of the AppInstall Goal record in a bulk file.
 *
 * <p>
 *     For more information, see AppInstall Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAppInstallGoal extends BulkConversionGoal<AppInstallGoal> {


    private static final List<BulkMapping<BulkAppInstallGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkAppInstallGoal>> m = new ArrayList<BulkMapping<BulkAppInstallGoal>>();
        
        m.add(new SimpleBulkMapping<BulkAppInstallGoal, String>(StringTable.AppPlatform,
                new Function<BulkAppInstallGoal, String>() {
                    @Override
                    public String apply(BulkAppInstallGoal c) {
                        return c.getAppInstallGoal().getAppPlatform();
                    }
                },
                new BiConsumer<String, BulkAppInstallGoal>() {
                    @Override
                    public void accept(String v, BulkAppInstallGoal c) {
                        c.getAppInstallGoal().setAppPlatform(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAppInstallGoal, String>(StringTable.AppStoreId,
                new Function<BulkAppInstallGoal, String>() {
                    @Override
                    public String apply(BulkAppInstallGoal c) {
                        return c.getAppInstallGoal().getAppStoreId();
                    }
                },
                new BiConsumer<String, BulkAppInstallGoal>() {
                    @Override
                    public void accept(String v, BulkAppInstallGoal c) {
                        c.getAppInstallGoal().setAppStoreId(v);
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
     * Get the appinstall goal.
     */
    public AppInstallGoal getAppInstallGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the appinstall goal.
     */
    public void setAppInstallGoal(AppInstallGoal AppInstallGoal) {
        this.setConversionGoal(AppInstallGoal);
    }

    @Override
    public AppInstallGoal createConversionGoal() {
        return new AppInstallGoal();
    }

}

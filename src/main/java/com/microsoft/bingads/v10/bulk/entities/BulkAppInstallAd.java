package com.microsoft.bingads.v10.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.AdType;
import com.microsoft.bingads.v10.campaignmanagement.AppInstallAd;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.StringTable;

/**
 * Represents an app install ad.
 *
 * This class exposes the {@link #setAppInstallAd} and {@link #getAppInstallAd} methods
 * that can be used to read and write fields of the App Install Ad record in a bulk file.
 *
 * <p>
 *     For more information, see App Install Ad at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=730549">http://go.microsoft.com/fwlink/?LinkID=730549</a>
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAppInstallAd extends BulkAd<AppInstallAd> {

	private static final List<BulkMapping<BulkAppInstallAd>> MAPPINGS;
	
	static {
        List<BulkMapping<BulkAppInstallAd>> m = new ArrayList<BulkMapping<BulkAppInstallAd>>();
        
        m.add(new SimpleBulkMapping<BulkAppInstallAd, String>(StringTable.AppPlatform,
                new Function<BulkAppInstallAd, String>() {
                    @Override
                    public String apply(BulkAppInstallAd c) {
                        return c.getAppInstallAd().getAppPlatform();
                    }
                },
                new BiConsumer<String, BulkAppInstallAd>() {
                    @Override
                    public void accept(String v, BulkAppInstallAd c) {
                        c.getAppInstallAd().setAppPlatform(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppInstallAd, String>(StringTable.AppStoreId,
                new Function<BulkAppInstallAd, String>() {
                    @Override
                    public String apply(BulkAppInstallAd c) {
                        return c.getAppInstallAd().getAppStoreId();
                    }
                },
                new BiConsumer<String, BulkAppInstallAd>() {
                    @Override
                    public void accept(String v, BulkAppInstallAd c) {
                        c.getAppInstallAd().setAppStoreId(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppInstallAd, String>(StringTable.Title,
                new Function<BulkAppInstallAd, String>() {
                    @Override
                    public String apply(BulkAppInstallAd c) {
                        return c.getAd().getTitle();
                    }
                },
                new BiConsumer<String, BulkAppInstallAd>() {
                    @Override
                    public void accept(String v, BulkAppInstallAd c) {
                        c.getAd().setTitle(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAppInstallAd, String>(StringTable.Text,
                new Function<BulkAppInstallAd, String>() {
                    @Override
                    public String apply(BulkAppInstallAd c) {
                        return c.getAd().getText();
                    }
                },
                new BiConsumer<String, BulkAppInstallAd>() {
                    @Override
                    public void accept(String v, BulkAppInstallAd c) {
                        c.getAd().setText(v);
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }
	
	@Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
		validatePropertyNotNull(getAppInstallAd(), "AppInstallAd");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkAppInstallAd>convertToValues(this, values, MAPPINGS);
    }

	@Override
    public void processMappingsFromRowValues(RowValues values) {
		this.setAd(new AppInstallAd());
        
        this.getAd().setType(AdType.APP_INSTALL);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkAppInstallAd>convertToEntity(values, MAPPINGS, this);
    }
	
	/**
     * Gets the app install ad.
     */
    public AppInstallAd getAppInstallAd() {
        return this.ad;
    }

    /**
     * Sets the app install ad.
     */
    public void setAppInstallAd(AppInstallAd ad) {
        this.setAd(ad);
    }
}

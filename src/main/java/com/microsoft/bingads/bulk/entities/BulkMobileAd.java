package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.campaignmanagement.AdType;
import com.microsoft.bingads.campaignmanagement.MobileAd;
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
 * Represents a mobile ad.
 *
 * This class exposes the {@link #setMobileAd} and {@link #getMobileAd} methods
 * that can be used to read and write fields of the Mobile Ad record in a bulk file.
 *
 * <p>
 *     For more information, see Mobile Ad at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511553">http://go.microsoft.com/fwlink/?LinkID=511553</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkMobileAd extends BulkAd<MobileAd> {

    private static final List<BulkMapping<BulkMobileAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkMobileAd>> m = new ArrayList<BulkMapping<BulkMobileAd>>();

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.Title,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getTitle();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setTitle(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.Text,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getText();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.DisplayUrl,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getDisplayUrl();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setDisplayUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.DestinationUrl,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setDestinationUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.BusinessName,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getBusinessName();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setBusinessName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkMobileAd, String>(StringTable.PhoneNumber,
                new Function<BulkMobileAd, String>() {
                    @Override
                    public String apply(BulkMobileAd c) {
                        return c.getAd().getPhoneNumber();
                    }
                },
                new BiConsumer<String, BulkMobileAd>() {
                    @Override
                    public void accept(String v, BulkMobileAd c) {
                        c.getAd().setPhoneNumber(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getMobileAd(), "MobileAd");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkMobileAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAd(new MobileAd());
        
        this.getAd().setType(AdType.MOBILE);
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.<BulkMobileAd>convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the mobile ad.
     */
    public MobileAd getMobileAd() {
        return this.ad;
    }


    /**
     * Sets the mobile ad.
     */
    public void setMobileAd(MobileAd mobileAd) {
        this.setAd(mobileAd);
    }
}

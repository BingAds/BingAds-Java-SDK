package com.microsoft.bingads.bulk.entities;

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
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getMobileAd(), "MobileAd");

        super.processMappingsToRowValues(values);

        MappingHelpers.<BulkMobileAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAd(new MobileAd());
        
        this.getAd().setType(AdType.MOBILE);
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.<BulkMobileAd>convertToEntity(values, MAPPINGS, this);
    }

    public MobileAd getMobileAd() {
        return this.ad;
    }

    public void setMobileAd(MobileAd mobileAd) {
        this.setAd(mobileAd);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.GenderTargetBid;
import com.microsoft.bingads.campaignmanagement.GenderType;
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

abstract class BulkGenderTargetBid extends BulkTargetBid {

    private GenderTargetBid genderTargetBid;        
    
    BulkGenderTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }
    
    private static final List<BulkMapping<BulkGenderTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkGenderTargetBid>> m = new ArrayList<BulkMapping<BulkGenderTargetBid>>();

        m.add(new SimpleBulkMapping<BulkGenderTargetBid, String>(StringTable.Target,
                new Function<BulkGenderTargetBid, String>() {
                    @Override
                    public String apply(BulkGenderTargetBid c) {
                        return c.getGenderTargetBid().getGender().value();
                    }
                },
                new BiConsumer<String, BulkGenderTargetBid>() {
                    @Override
                    public void accept(String v, BulkGenderTargetBid c) {
                        c.getGenderTargetBid().setGender(GenderType.fromValue(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkGenderTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkGenderTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkGenderTargetBid c) {
                        return c.getGenderTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkGenderTargetBid>() {
                    @Override
                    public void accept(String v, BulkGenderTargetBid c) {
                        c.getGenderTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setGenderTargetBid(new GenderTargetBid());
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getGenderTargetBid(), "GenderTargetBid");
        
        super.processMappingsToRowValues(values);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }        
    
    public GenderTargetBid getGenderTargetBid() {
        return genderTargetBid;
    }

    public void setGenderTargetBid(GenderTargetBid genderTargetBid) {
        this.genderTargetBid = genderTargetBid;
    }
}

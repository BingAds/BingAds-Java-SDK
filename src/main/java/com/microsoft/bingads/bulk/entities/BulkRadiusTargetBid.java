/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.campaignmanagement.IntentOption;
import com.microsoft.bingads.campaignmanagement.RadiusTargetBid2;
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

abstract class BulkRadiusTargetBid extends BulkTargetBid {    

    private RadiusTargetBid2 radiusTargetBid;
    
    private IntentOption intentOption;

    BulkRadiusTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }

    private static final List<BulkMapping<BulkRadiusTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkRadiusTargetBid>> m = new ArrayList<BulkMapping<BulkRadiusTargetBid>>();

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, Long>(StringTable.RadiusTargetId,
                new Function<BulkRadiusTargetBid, Long>() {
                    @Override
                    public Long apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getId();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, String>(StringTable.Name,
                new Function<BulkRadiusTargetBid, String>() {
                    @Override
                    public String apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getName();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, Double>(StringTable.Radius,
                new Function<BulkRadiusTargetBid, Double>() {
                    @Override
                    public Double apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getRadius();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setRadius(Double.parseDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, String>(StringTable.Unit,
                new Function<BulkRadiusTargetBid, String>() {
                    @Override
                    public String apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getRadiusUnit() != null ? c.getRadiusTargetBid().getRadiusUnit().value() : null;
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setRadiusUnit(DistanceUnit.fromValue(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, Double>(StringTable.Latitude,
                new Function<BulkRadiusTargetBid, Double>() {
                    @Override
                    public Double apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getLatitudeDegrees();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setLatitudeDegrees(Double.parseDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, Double>(StringTable.Longitude,
                new Function<BulkRadiusTargetBid, Double>() {
                    @Override
                    public Double apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getLongitudeDegrees();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setLongitudeDegrees(Double.parseDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkRadiusTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkRadiusTargetBid c) {
                        return c.getRadiusTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.getRadiusTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRadiusTargetBid, String>(StringTable.PhysicalIntent,
                new Function<BulkRadiusTargetBid, String>() {
                    @Override
                    public String apply(BulkRadiusTargetBid c) {
                        return c.getIntentOption() != null ? c.getIntentOption().value() : null;
                    }
                },
                new BiConsumer<String, BulkRadiusTargetBid>() {
                    @Override
                    public void accept(String v, BulkRadiusTargetBid c) {
                        c.setIntentOption(StringExtensions.parseOptional(v, new Function<String, IntentOption>() {
                            @Override
                            public IntentOption apply(String value) {
                                return IntentOption.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setRadiusTargetBid(new RadiusTargetBid2());

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getRadiusTargetBid(), "RadiusTargetBid");

        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public RadiusTargetBid2 getRadiusTargetBid() {
        return radiusTargetBid;
    }

    public void setRadiusTargetBid(RadiusTargetBid2 radiusTargetBid) {
        this.radiusTargetBid = radiusTargetBid;
    }

    public IntentOption getIntentOption() {
        return intentOption;
    }

    void setIntentOption(IntentOption intentOption) {
        this.intentOption = intentOption;
    }
}

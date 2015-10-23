package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.v10.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v10.campaignmanagement.IntentOption;
import com.microsoft.bingads.v10.campaignmanagement.RadiusTargetBid;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk radius target bid classes,
 * for example {@link BulkAdGroupRadiusTargetBid}.
 */
abstract class BulkRadiusTargetBid extends BulkTargetBid {    

    private RadiusTargetBid radiusTargetBid;
    
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
        setRadiusTargetBid(new RadiusTargetBid());

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getRadiusTargetBid(), "RadiusTargetBid");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a specific geographical radius to target.
     */
    public RadiusTargetBid getRadiusTargetBid() {
        return radiusTargetBid;
    }

    /**
     * Sets a specific geographical radius to target.
     */
    public void setRadiusTargetBid(RadiusTargetBid radiusTargetBid) {
        this.radiusTargetBid = radiusTargetBid;
    }

    /**
     * Gets the possible intent options for location targeting.
     */
    public IntentOption getIntentOption() {
        return intentOption;
    }

    /**
     * Sets the possible intent options for location targeting.
     */
    void setIntentOption(IntentOption intentOption) {
        this.intentOption = intentOption;
    }
}

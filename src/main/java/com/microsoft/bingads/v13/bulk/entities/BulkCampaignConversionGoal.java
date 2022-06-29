package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.CampaignConversionGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * This abstract class provides properties that are shared by all bulk campaign conversion goal classes.
 */
public class BulkCampaignConversionGoal extends SingleRecordBulkEntity {
    
    private CampaignConversionGoal campaignConversionGoal;

    private static final List<BulkMapping<BulkCampaignConversionGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignConversionGoal>> m = new ArrayList<BulkMapping<BulkCampaignConversionGoal>>();

        m.add(new SimpleBulkMapping<BulkCampaignConversionGoal, Long>(StringTable.ParentId,
                new Function<BulkCampaignConversionGoal, Long>() {
                    @Override
                    public Long apply(BulkCampaignConversionGoal g) {
                        return g.getCampaignConversionGoal().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignConversionGoal>() {
                    @Override
                    public void accept(String v, BulkCampaignConversionGoal g) {
                        g.getCampaignConversionGoal().setCampaignId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignConversionGoal, Long>(StringTable.GoalId,
                new Function<BulkCampaignConversionGoal, Long>() {
                    @Override
                    public Long apply(BulkCampaignConversionGoal g) {
                        return g.getCampaignConversionGoal().getGoalId();
                    }
                },
                new BiConsumer<String, BulkCampaignConversionGoal>() {
                    @Override
                    public void accept(String v, BulkCampaignConversionGoal g) {
                        g.getCampaignConversionGoal().setGoalId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setCampaignConversionGoal(new CampaignConversionGoal());
        MappingHelpers.convertToEntity(values, MAPPINGS, this);

    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCampaignConversionGoal(), "CampaignConversionGoal");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
    
    public CampaignConversionGoal createCampaignConversionGoal()
    {
    	return new CampaignConversionGoal();
    }

    /**
     * Gets the campaign conversion goal.
     */
    public CampaignConversionGoal getCampaignConversionGoal() {
        return campaignConversionGoal;
    }

    /**
     * Sets the campaign conversion goal.
     */
    public void setCampaignConversionGoal(CampaignConversionGoal goal) {
        this.campaignConversionGoal = goal;
    }

}



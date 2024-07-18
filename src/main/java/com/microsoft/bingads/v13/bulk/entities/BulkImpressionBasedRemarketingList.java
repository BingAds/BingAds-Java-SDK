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
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedEntityType;
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedRemarketingList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Impression Based Remarketing List that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkImpressionBasedRemarketingList#setRemarketingList} and {@link BulkImpressionBasedRemarketingList#getRemarketingList}
 * methods that can be used to read and write fields of the ImpressionBased Remarketing List record in a bulk file.
 *
 * <p>
 *     For more information, see Impression Based Remarketing List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkImpressionBasedRemarketingList extends BulkAudience<ImpressionBasedRemarketingList> {

    private static final List<BulkMapping<BulkImpressionBasedRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkImpressionBasedRemarketingList>> m = new ArrayList<BulkMapping<BulkImpressionBasedRemarketingList>>();

        m.add(new SimpleBulkMapping<BulkImpressionBasedRemarketingList, Long>(StringTable.ImpressionCampaignId,
                new Function<BulkImpressionBasedRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkImpressionBasedRemarketingList c) {
                        return c.getImpressionBasedRemarketingList().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkImpressionBasedRemarketingList>() {
                    @Override
                    public void accept(String v, BulkImpressionBasedRemarketingList c) {
                        c.getImpressionBasedRemarketingList().setCampaignId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImpressionBasedRemarketingList, Long>(StringTable.ImpressionAdGroupId,
                new Function<BulkImpressionBasedRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkImpressionBasedRemarketingList c) {
                        return c.getImpressionBasedRemarketingList().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkImpressionBasedRemarketingList>() {
                    @Override
                    public void accept(String v, BulkImpressionBasedRemarketingList c) {
                        c.getImpressionBasedRemarketingList().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImpressionBasedRemarketingList, String>(StringTable.EntityType,
                new Function<BulkImpressionBasedRemarketingList, String>() {
                    @Override
                    public String apply(BulkImpressionBasedRemarketingList c) {
                        return c.getImpressionBasedRemarketingList().getEntityType() != null ? c.getImpressionBasedRemarketingList().getEntityType().value() : null;
                    }
                },
                new BiConsumer<String, BulkImpressionBasedRemarketingList>() {
                    @Override
                    public void accept(String v, BulkImpressionBasedRemarketingList c) {
                        c.getImpressionBasedRemarketingList().setEntityType(StringExtensions.parseOptional(v, new Function<String, ImpressionBasedEntityType>() {
                            @Override
                            public ImpressionBasedEntityType apply(String value) {
                                return StringExtensions.fromValueOptional(value, ImpressionBasedEntityType.class);
                            }
                        }));
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
     * Gets the impression based remarketing list.
     */
    public ImpressionBasedRemarketingList getImpressionBasedRemarketingList() {
        return this.getAudience();
    }

    /**
     * Sets the impression based remarketing list.
     */
    public void setImpressionBasedRemarketingList(ImpressionBasedRemarketingList remarketingList) {
        this.setAudience(remarketingList);
    }

    @Override
    public ImpressionBasedRemarketingList createAudience() {
        return new ImpressionBasedRemarketingList();
    }

}

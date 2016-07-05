package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.*;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an Ad Group Remarketing List Association that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupRemarketingListAssociation} and {@link #getAdGroupRemarketingListAssociation} methods
 * that can be used to read and write fields of the Ad Group Remarketing List Association record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Remarketing List Association at
 * <a href="http://go.microsoft.com/fwlink/?LinkId=799353">http://go.microsoft.com/fwlink/?LinkId=799353</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupRemarketingList extends SingleRecordBulkEntity {

    private AdGroupRemarketingListAssociation adGroupRemarketingListAssociation;

    private String campaignName;

    private String adGroupName;

    private static final List<BulkMapping<BulkAdGroupRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupRemarketingList>> m = new ArrayList<BulkMapping<BulkAdGroupRemarketingList>>();

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, String>(StringTable.Status,
                new Function<BulkAdGroupRemarketingList, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingList c) {
                        return StringExtensions.toAdGroupRemarketingListAssociationStatusBulkString(c.getAdGroupRemarketingListAssociation().getStatus());
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.getAdGroupRemarketingListAssociation().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupRemarketingListAssociationStatus>() {
                            @Override
                            public AdGroupRemarketingListAssociationStatus apply(String value) {
                                return AdGroupRemarketingListAssociationStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));
                
        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, Long>(StringTable.Id,
                new Function<BulkAdGroupRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingList c) {
                        return c.getAdGroupRemarketingListAssociation().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.getAdGroupRemarketingListAssociation().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, Long>(StringTable.ParentId,
                new Function<BulkAdGroupRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingList c) {
                        return c.getAdGroupRemarketingListAssociation().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.getAdGroupRemarketingListAssociation().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        
        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, String>(StringTable.Campaign,
                new Function<BulkAdGroupRemarketingList, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingList c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, String>(StringTable.AdGroup,
                new Function<BulkAdGroupRemarketingList, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingList c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, Double>(StringTable.BidAdjustment,
                new Function<BulkAdGroupRemarketingList, Double>() {
                    @Override
                    public Double apply(BulkAdGroupRemarketingList c) {
                        return c.getAdGroupRemarketingListAssociation().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.getAdGroupRemarketingListAssociation().setBidAdjustment(StringExtensions.<Double>parseOptional(v, new Function<String, Double>() {
                            @Override
                            public Double apply(String value) {
                                return Double.parseDouble(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingList, Long>(StringTable.RemarketingListId,
                new Function<BulkAdGroupRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingList c) {
                        return c.getAdGroupRemarketingListAssociation().getRemarketingListId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingList>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingList c) {
                        c.getAdGroupRemarketingListAssociation().setRemarketingListId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
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
        this.setAdGroupRemarketingListAssociation(new AdGroupRemarketingListAssociation());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);

    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupRemarketingListAssociation(), "AdGroupRemarketingListAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an AdGroup Criterion.
     */
    public AdGroupRemarketingListAssociation getAdGroupRemarketingListAssociation() {
        return this.adGroupRemarketingListAssociation;
    }

    /**
     * Sets an AdGroup Criterion.
     */
    public void setAdGroupRemarketingListAssociation(AdGroupRemarketingListAssociation adGroupRemarketingListAssociation) {
        this.adGroupRemarketingListAssociation = adGroupRemarketingListAssociation;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the name of the ad group.
     */
    public String getAdGroupName() {
        return this.adGroupName;
    }

    /**
     * Sets the name of the ad group.
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

}

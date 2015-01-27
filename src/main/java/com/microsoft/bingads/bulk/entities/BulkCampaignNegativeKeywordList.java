package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.SharedEntityAssociation;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a negative keyword list that is assigned to a campaign. Each negative keyword list can be read or written in a bulk file.  
 */
public class BulkCampaignNegativeKeywordList extends SingleRecordBulkEntity {

    private SharedEntityAssociation sharedEntityAssociation;

    private Status status;

    private static final List<BulkMapping<BulkCampaignNegativeKeywordList>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeKeywordList>> m = new ArrayList<BulkMapping<BulkCampaignNegativeKeywordList>>();

        AdExtensionStatus a;
        m.add(new SimpleBulkMapping<BulkCampaignNegativeKeywordList, String>(StringTable.Status,
                new Function<BulkCampaignNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeKeywordList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeKeywordList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeKeywordList, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeKeywordList, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeKeywordList c) {
                        return c.getSharedEntityAssociation().getSharedEntityId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeKeywordList c) {
                        c.getSharedEntityAssociation().setSharedEntityId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeKeywordList, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeKeywordList, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeKeywordList c) {
                        return c.getSharedEntityAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeKeywordList c) {
                        c.getSharedEntityAssociation().setEntityId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
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
        this.setSharedEntityAssociation(new SharedEntityAssociation());
        this.getSharedEntityAssociation().setEntityType("Campaign");
        this.getSharedEntityAssociation().setSharedEntityType("NegativeKeywordList");

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        //TODO: throw if Association doesn't have NKW and Campaign as entity types

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public SharedEntityAssociation getSharedEntityAssociation() {
        return sharedEntityAssociation;
    }

    public void setSharedEntityAssociation(SharedEntityAssociation association) {
        this.sharedEntityAssociation = association;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

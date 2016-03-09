package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
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
 * Represents a negative keyword list that is assigned to a campaign.
 * Each negative keyword list can be read or written in a bulk file.
 * This class exposes the {@link #setSharedEntityAssociation} and {@link #getSharedEntityAssociation} methods
 * that can be used to read and write fields of the Campaign Negative Keyword List Association record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Keyword List Association at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511523">http://go.microsoft.com/fwlink/?LinkID=511523</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeKeywordList extends SingleRecordBulkEntity {

    private SharedEntityAssociation sharedEntityAssociation;

    private Status status;

    private static final List<BulkMapping<BulkCampaignNegativeKeywordList>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeKeywordList>> m = new ArrayList<BulkMapping<BulkCampaignNegativeKeywordList>>();

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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        //TODO: throw if Association doesn't have NKW and Campaign as entity types

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the campaign and negative keyword list identifiers.
     */
    public SharedEntityAssociation getSharedEntityAssociation() {
        return sharedEntityAssociation;
    }

    /**
     * Sets the campaign and negative keyword list identifiers.
     */
    public void setSharedEntityAssociation(SharedEntityAssociation association) {
        this.sharedEntityAssociation = association;
    }

    /**
     * Gets the status of the negative keyword list association.
     *
     * <p>
     *     The value is Active if the negative keyword list is assoicated to the campaign.
     *     The value is Deleted if the negative keyword list is disassociated from the campaign,
     *     or should be disassociated in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the negative keyword list association.
     *
     * <p>
     *     The value is Active if the negative keyword list is assoicated to the campaign.
     *     The value is Deleted if the negative keyword list is disassociated from the campaign,
     *     or should be disassociated in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }

}

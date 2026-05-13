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
import com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociation;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an account content negative keyword list that is assigned to a campaign.
 * Each account content negative keyword list can be read or written in a bulk file.
 * This class exposes the {@link #setSharedEntityAssociation} and {@link #getSharedEntityAssociation} methods
 * that can be used to read and write fields of the Account Content Negative Keyword List Association record in a bulk file.
 *
 * <p>
 *     For more information, see Account Content Negative Keyword List Association at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountContentNegativeKeywordListAssociation extends SingleRecordBulkEntity {

    private SharedEntityAssociation sharedEntityAssociation;

    private Status status;

    private static final List<BulkMapping<BulkAccountContentNegativeKeywordListAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountContentNegativeKeywordListAssociation>> m = new ArrayList<BulkMapping<BulkAccountContentNegativeKeywordListAssociation>>();

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordListAssociation, String>(StringTable.Status,
                new Function<BulkAccountContentNegativeKeywordListAssociation, String>() {
                    @Override
                    public String apply(BulkAccountContentNegativeKeywordListAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordListAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordListAssociation, Long>(StringTable.Id,
                new Function<BulkAccountContentNegativeKeywordListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountContentNegativeKeywordListAssociation c) {
                        return c.getSharedEntityAssociation().getSharedEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordListAssociation c) {
                        c.getSharedEntityAssociation().setSharedEntityId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordListAssociation, Long>(StringTable.ParentId,
                new Function<BulkAccountContentNegativeKeywordListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountContentNegativeKeywordListAssociation c) {
                        return c.getSharedEntityAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordListAssociation c) {
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
        this.getSharedEntityAssociation().setEntityType("Account");
        this.getSharedEntityAssociation().setSharedEntityType("AccountContentNegativeKeywordList");

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the campaign and account content negative keyword list identifiers.
     */
    public SharedEntityAssociation getSharedEntityAssociation() {
        return sharedEntityAssociation;
    }

    /**
     * Sets the campaign and account content negative keyword list identifiers.
     */
    public void setSharedEntityAssociation(SharedEntityAssociation association) {
        this.sharedEntityAssociation = association;
    }

    /**
     * Gets the status of the account content negative keyword list association.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the account content negative keyword list association.
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

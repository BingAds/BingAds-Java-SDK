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
 * Represents an account placement exclusion list that is assigned to a campaign.
 * <p/>
 * <p>
 * This class exposes the {@link #setSharedEntityAssociation} and {@link #getSharedEntityAssociation} that can be used to read and write
 * fields of the Shared Entity Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Shared Entity Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountPlacementExclusionListAssociation extends SingleRecordBulkEntity {

    private Status status;

    private SharedEntityAssociation sharedEntityAssociation;

    private static final List<BulkMapping<BulkAccountPlacementExclusionListAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountPlacementExclusionListAssociation>> m = new ArrayList<BulkMapping<BulkAccountPlacementExclusionListAssociation>>();

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionListAssociation, Long>(StringTable.Id,
                new Function<BulkAccountPlacementExclusionListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementExclusionListAssociation c) {
                        return c.getSharedEntityAssociation().getSharedEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionListAssociation c) {
                        c.getSharedEntityAssociation().setSharedEntityId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionListAssociation, String>(StringTable.Status,
                new Function<BulkAccountPlacementExclusionListAssociation, String>() {
                    @Override
                    public String apply(BulkAccountPlacementExclusionListAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionListAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionListAssociation, Long>(StringTable.ParentId,
                new Function<BulkAccountPlacementExclusionListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementExclusionListAssociation c) {
                        return c.getSharedEntityAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionListAssociation c) {
                        c.getSharedEntityAssociation().setEntityId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setSharedEntityAssociation(new SharedEntityAssociation());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getSharedEntityAssociation(), "SharedEntityAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }


    /**
     * Gets the status of the exclusion list.
     * <p/>
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the exclusion list.
     * <p/>
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the SharedEntityAssociation Data Object of the Campaign Management Service.
     */
    public SharedEntityAssociation getSharedEntityAssociation() {
        return sharedEntityAssociation;
    }

    /**
     * Sets the SharedEntityAssociation Data Object of the Campaign Management Service.
     */
    public void setSharedEntityAssociation(SharedEntityAssociation sharedEntityAssociation) {
        this.sharedEntityAssociation = sharedEntityAssociation;
    }
}

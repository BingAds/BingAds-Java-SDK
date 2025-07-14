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
 * Represents an account placement inclusion list that is assigned to a campaign.
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
public class BulkAccountPlacementInclusionListAssociation extends SingleRecordBulkEntity {

    private Status status;

    private SharedEntityAssociation sharedEntityAssociation;

    private static final List<BulkMapping<BulkAccountPlacementInclusionListAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountPlacementInclusionListAssociation>> m = new ArrayList<BulkMapping<BulkAccountPlacementInclusionListAssociation>>();

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionListAssociation, Long>(StringTable.Id,
                new Function<BulkAccountPlacementInclusionListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementInclusionListAssociation c) {
                        return c.getSharedEntityAssociation().getSharedEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionListAssociation c) {
                        c.getSharedEntityAssociation().setSharedEntityId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionListAssociation, String>(StringTable.Status,
                new Function<BulkAccountPlacementInclusionListAssociation, String>() {
                    @Override
                    public String apply(BulkAccountPlacementInclusionListAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionListAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionListAssociation, Long>(StringTable.ParentId,
                new Function<BulkAccountPlacementInclusionListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementInclusionListAssociation c) {
                        return c.getSharedEntityAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionListAssociation>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionListAssociation c) {
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
     * Gets the status of the inclusion list.
     * <p/>
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the inclusion list.
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

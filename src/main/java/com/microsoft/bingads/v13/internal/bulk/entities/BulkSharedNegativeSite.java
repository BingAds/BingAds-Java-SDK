package com.microsoft.bingads.v13.internal.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.bulk.entities.Status;
import com.microsoft.bingads.v13.campaignmanagement.NegativeSite;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Shared Negative Site.
 * <p/>
 * <p>
 * This class exposes the {@link #setNegativeSite} and {@link #getNegativeSite} that can be used to read and write
 * fields of the Shared Negative Site record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Shared Negative Site at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSharedNegativeSite extends SingleRecordBulkEntity {

	private Long parentId;
	
    private Status status;

    private NegativeSite negativeSite;

    private static final List<BulkMapping<BulkSharedNegativeSite>> MAPPINGS;

    static {
        List<BulkMapping<BulkSharedNegativeSite>> m = new ArrayList<BulkMapping<BulkSharedNegativeSite>>();

        m.add(new SimpleBulkMapping<BulkSharedNegativeSite, Long>(StringTable.Id,
                new Function<BulkSharedNegativeSite, Long>() {
                    @Override
                    public Long apply(BulkSharedNegativeSite c) {
                        return c.getNegativeSite().getId();
                    }
                },
                new BiConsumer<String, BulkSharedNegativeSite>() {
                    @Override
                    public void accept(String v, BulkSharedNegativeSite c) {
                        c.getNegativeSite().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSharedNegativeSite, String>(StringTable.Status,
                new Function<BulkSharedNegativeSite, String>() {
                    @Override
                    public String apply(BulkSharedNegativeSite c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkSharedNegativeSite>() {
                    @Override
                    public void accept(String v, BulkSharedNegativeSite c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSharedNegativeSite, Long>(StringTable.ParentId,
                new Function<BulkSharedNegativeSite, Long>() {
                    @Override
                    public Long apply(BulkSharedNegativeSite c) {
                        return c.getParentId();
                    }
                },
                new BiConsumer<String, BulkSharedNegativeSite>() {
                    @Override
                    public void accept(String v, BulkSharedNegativeSite c) {
                        c.setParentId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSharedNegativeSite, String>(StringTable.AccountPlacementListItemUrl,
                new Function<BulkSharedNegativeSite, String>() {
                    @Override
                    public String apply(BulkSharedNegativeSite c) {
                        return c.getNegativeSite().getUrl();
                    }
                },
                new BiConsumer<String, BulkSharedNegativeSite>() {
                    @Override
                    public void accept(String v, BulkSharedNegativeSite c) {
                        c.getNegativeSite().setUrl(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setNegativeSite(new NegativeSite());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeSite(), "NegativeSite");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the parent id of the negative site.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the parent id of the negative site.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * Gets the NegativeSite Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of NegativeSite properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public NegativeSite getNegativeSite() {
        return negativeSite;
    }

    /**
     * Sets the NegativeSite Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of NegativeSite properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setNegativeSite(NegativeSite negativeSite) {
        this.negativeSite = negativeSite;
    }
}

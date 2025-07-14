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
import com.microsoft.bingads.v13.campaignmanagement.Site;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Shared Site.
 * <p/>
 * <p>
 * This class exposes the {@link #setSite} and {@link #getSite} that can be used to read and write
 * fields of the Shared Site record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Shared Site at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSharedSite extends SingleRecordBulkEntity {

	private Long parentId;
	
    private Status status;

    private Site site;

    private static final List<BulkMapping<BulkSharedSite>> MAPPINGS;

    static {
    	List<BulkMapping<BulkSharedSite>> m = new ArrayList<BulkMapping<BulkSharedSite>>();

        m.add(new SimpleBulkMapping<BulkSharedSite, Long>(StringTable.Id,
                new Function<BulkSharedSite, Long>() {
                    @Override
                    public Long apply(BulkSharedSite c) {
                        return c.getSite().getId();
                    }
                },
                new BiConsumer<String, BulkSharedSite>() {
                    @Override
                    public void accept(String v, BulkSharedSite c) {
                        c.getSite().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSharedSite, String>(StringTable.Status,
                new Function<BulkSharedSite, String>() {
                    @Override
                    public String apply(BulkSharedSite c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkSharedSite>() {
                    @Override
                    public void accept(String v, BulkSharedSite c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSharedSite, Long>(StringTable.ParentId,
                new Function<BulkSharedSite, Long>() {
                    @Override
                    public Long apply(BulkSharedSite c) {
                        return c.getParentId();
                    }
                },
                new BiConsumer<String, BulkSharedSite>() {
                    @Override
                    public void accept(String v, BulkSharedSite c) {
                        c.setParentId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSharedSite, String>(StringTable.AccountPlacementListItemUrl,
                new Function<BulkSharedSite, String>() {
                    @Override
                    public String apply(BulkSharedSite c) {
                        return c.getSite().getUrl();
                    }
                },
                new BiConsumer<String, BulkSharedSite>() {
                    @Override
                    public void accept(String v, BulkSharedSite c) {
                        c.getSite().setUrl(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setSite(new Site());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getSite(), "Site");

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
     * Gets the Site Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of Site properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the Site Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of Site properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setSite(Site site) {
        this.site = site;
    }
}

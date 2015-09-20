package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkNegativeSiteIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This abstract base class for the bulk negative sites that are assigned
 * individually to a campaign or ad group entity.
 *
 * @see BulkAdGroupNegativeSite
 * @see BulkCampaignNegativeSite
 */
abstract class BulkNegativeSite<TIdentifier extends BulkNegativeSiteIdentifier> extends SingleRecordBulkEntity {

    private TIdentifier identifier;

    public TIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(TIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the status of the negative site association.
     *
     * <p>
     * The value is Active if the negative site is assigned to the parent entity identified by the EntityId.
     * The value is Deleted if the negative site is removed from the
     * parent entity, or should be removed in a subsequent upload operation.
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return this.identifier.getStatus();
    }

    /**
     * Sets the status of the negative site association.
     *
     * <p>
     * The value is Active if the negative site is assigned to the parent entity identified by the EntityId.
     * The value is Deleted if the negative site is removed from the
     * parent entity, or should be removed in a subsequent upload operation.
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.identifier.setStatus(status);
    }

    /**
     * The URL of a website on which you do not want your ads displayed.
     * Corresponds to the 'Website' field in the bulk file.
     */
    private String website;

    /**
     * Gets the URL of a website on which you do not want your ads displayed.
     *
     * <p>
     *     Corresponds to the 'Website' field in the bulk file.
     * </p>
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the URL of a website on which you do not want your ads displayed.
     *
     * <p>
     *     Corresponds to the 'Website' field in the bulk file.
     * </p>
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    protected BulkNegativeSite(TIdentifier identifier) {
        this.identifier = identifier;
    }

    private static final List<BulkMapping<BulkNegativeSite>> MAPPINGS;

    static {
        List<BulkMapping<BulkNegativeSite>> m = new ArrayList<BulkMapping<BulkNegativeSite>>();

        m.add(new SimpleBulkMapping<BulkNegativeSite, String>(StringTable.Website,
                new Function<BulkNegativeSite, String>() {
                    @Override
                    public String apply(BulkNegativeSite c) {
                        return c.getWebsite();
                    }
                },
                new BiConsumer<String, BulkNegativeSite>() {
                    @Override
                    public void accept(String v, BulkNegativeSite c) {
                        c.setWebsite(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.identifier.readFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        this.identifier.writeToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public boolean canEncloseInMultilineEntity() {
        return true;
    }

    @Override
    public MultiRecordBulkEntity encloseInMultilineEntity() {
        return createNegativeSitesWithThisNegativeSite();
    }

    abstract MultiRecordBulkEntity createNegativeSitesWithThisNegativeSite();
}

package com.microsoft.bingads.internal.bulk.entities.negativesites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

/**
 * This abstract base class for the bulk negative sites that are assigned
 * individually to a campaign or ad group entity.
 *
 * @see BulkAdGroupNegativeSite
 * @see BulkCampaignNegativeSite
 */
public abstract class BulkNegativeSite<TIdentifier extends BulkNegativeSiteIdentifier> extends SingleRecordBulkEntity {

    private TIdentifier identifier;// { get; set; }

    public TIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(TIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * The status of the negative site association. The value is Active if the
     * negative site is assigned to the parent entity identified by the
     * EntityId. The value is Deleted if the negative site is removed from the
     * parent entity, or should be removed in a subsequent upload operation.
     * Corresponds to the 'Status' field in the bulk file.
     */
    public Status getStatus() {
        return this.identifier.getStatus();
    }

    public void setStatus(Status value) {
        this.identifier.setStatus(value);
    }

    /**
     * The URL of a website on which you do not want your ads displayed.
     * Corresponds to the 'Website' field in the bulk file.
     */
    public String website;// { get; set; }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    protected BulkNegativeSite(TIdentifier identifier) {
        this.identifier = identifier;
    }

    private static List<BulkMapping<BulkNegativeSite>> MAPPINGS;

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
    public void processMappingsToRowValues(RowValues values) {
        this.identifier.writeToRowValues(values);
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

    protected abstract MultiRecordBulkEntity createNegativeSitesWithThisNegativeSite();
}

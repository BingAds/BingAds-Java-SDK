package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionEditorialStatus;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionIdToEntityIdAssociation;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Reserved for internal use. This abstract class provides properties that are shared by all bulk ad extension association classes.
 *
 * <p>
 * For more information, see Bulk File Schema at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 */
public abstract class BulkAdExtensionAssociation extends SingleRecordBulkEntity {

    private Status status;

    private AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation;

    private AdExtensionEditorialStatus editorialStatus;

    private static final List<BulkMapping<BulkAdExtensionAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdExtensionAssociation>> m = new ArrayList<BulkMapping<BulkAdExtensionAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdExtensionAssociation, String>(StringTable.Status,
                new Function<BulkAdExtensionAssociation, String>() {
                    @Override
                    public String apply(BulkAdExtensionAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdExtensionAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionAssociation, Long>(StringTable.Id,
                new Function<BulkAdExtensionAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionAssociation c) {
                        return c.getAdExtensionIdToEntityIdAssociation().getAdExtensionId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdExtensionAssociation c) {
                        c.getAdExtensionIdToEntityIdAssociation().setAdExtensionId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdExtensionAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionAssociation c) {
                        return c.getAdExtensionIdToEntityIdAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdExtensionAssociation c) {
                        c.getAdExtensionIdToEntityIdAssociation().setEntityId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionAssociation, String>(StringTable.EditorialStatus,
                new Function<BulkAdExtensionAssociation, String>() {
                    @Override
                    public String apply(BulkAdExtensionAssociation t) {
                        return t.getEditorialStatus() != null ? t.getEditorialStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdExtensionAssociation c) {
                        c.setEditorialStatus(StringExtensions.<AdExtensionEditorialStatus>parseOptional(v, new Function<String, AdExtensionEditorialStatus>() {
                            @Override
                            public AdExtensionEditorialStatus apply(String value) {
                                return AdExtensionEditorialStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdExtensionIdToEntityIdAssociation(), "AdExtensionIdToEntityIdAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAdExtensionIdToEntityIdAssociation(new AdExtensionIdToEntityIdAssociation());

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the status of the ad extension association.
     *
     * <p>
     *     The value is Active if the EntityId and AdExtensionId are associated.
     *     The value is Deleted if the association is removed.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the ad extension association.
     *
     * <p>
     *     The value is Active if the EntityId and AdExtensionId are associated.
     *     The value is Deleted if the association is removed.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the editorial status of the ad extension and associated entity.
     *
     * <p>
     *     For more information, see AdExtensionEditorialStatus at
     *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     *
     *     Corresponds to the 'Editorial Status' field in the bulk file.
     * </p>
     */
    public AdExtensionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the editorial status of the ad extension and associated entity.
     *
     * <p>
     *     For more information, see AdExtensionEditorialStatus at
     *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     *
     *     Corresponds to the 'Editorial Status' field in the bulk file.
     * </p>
     */
    void setEditorialStatus(AdExtensionEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

    /**
     * Gets an association relationship between an ad extension and a supported entity, for example a campaign or ad group.
     */
    public AdExtensionIdToEntityIdAssociation getAdExtensionIdToEntityIdAssociation() {
        return adExtensionIdToEntityIdAssociation;
    }

    /**
     * Sets an association relationship between an ad extension and a supported entity, for example a campaign or ad group.
     */
    public void setAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation) {
        this.adExtensionIdToEntityIdAssociation = adExtensionIdToEntityIdAssociation;
    }
}

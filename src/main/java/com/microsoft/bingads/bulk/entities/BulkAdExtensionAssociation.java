package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionEditorialStatus;
import com.microsoft.bingads.campaignmanagement.AdExtensionIdToEntityIdAssociation;
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
 * Reserved for internal use. This abstract class provides properties that are shared by all bulk ad extension association classes. For more information, see Bulk File Schema at http://go.microsoft.com/fwlink/?LinkID=511639.
 */
public abstract class BulkAdExtensionAssociation extends SingleRecordBulkEntity {

    /**
     * The status of the ad extension association. The value is Active if the EntityId and AdExtensionId are associated. The value is Deleted if the association is removed. Corresponds to the 'Status' field in the bulk file.
     */
    private Status status;

    private AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation;

    private PerformanceData performanceData;

    /**
     * The editorial status of the ad extension and associated entity. For more information, see AdExtensionEditorialStatus at http://go.microsoft.com/fwlink/?LinkId=511866. Corresponds to the 'Editorial Status' field in the bulk file.
     */
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

        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAdExtensionIdToEntityIdAssociation(new AdExtensionIdToEntityIdAssociation());

        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AdExtensionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    void setEditorialStatus(AdExtensionEditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

    public AdExtensionIdToEntityIdAssociation getAdExtensionIdToEntityIdAssociation() {
        return adExtensionIdToEntityIdAssociation;
    }

    public void setAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation) {
        this.adExtensionIdToEntityIdAssociation = adExtensionIdToEntityIdAssociation;
    }
}

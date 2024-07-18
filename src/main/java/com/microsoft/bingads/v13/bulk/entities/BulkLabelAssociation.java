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
import com.microsoft.bingads.v13.campaignmanagement.LabelAssociation;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a label association that is applied to a Campaign, Ad Group or Ads. Each label can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Label at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkLabelAssociation extends SingleRecordBulkEntity {

    private LabelAssociation labelAssociation;

    private Status status;

    private static final List<BulkMapping<BulkLabelAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkLabelAssociation>> m = new ArrayList<BulkMapping<BulkLabelAssociation>>();

        m.add(new SimpleBulkMapping<BulkLabelAssociation, Long>(StringTable.Id,
                new Function<BulkLabelAssociation, Long>() {
                    @Override
                    public Long apply(BulkLabelAssociation c) {
                        return c.getLabelAssociation().getLabelId();
                    }
                },
                new BiConsumer<String, BulkLabelAssociation>() {
                    @Override
                    public void accept(String v, BulkLabelAssociation c) {
                        c.getLabelAssociation().setLabelId(Long.valueOf(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabelAssociation, Long>(StringTable.ParentId,
                new Function<BulkLabelAssociation, Long>() {
                    @Override
                    public Long apply(BulkLabelAssociation c) {
                        return c.getLabelAssociation().getEntityId();
                    }
                },
                new BiConsumer<String, BulkLabelAssociation>() {
                    @Override
                    public void accept(String v, BulkLabelAssociation c) {
                        c.getLabelAssociation().setEntityId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabelAssociation, String>(StringTable.Status,
                new Function<BulkLabelAssociation, String>() {
                    @Override
                    public String apply(BulkLabelAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkLabelAssociation>() {
                    @Override
                    public void accept(String v, BulkLabelAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public LabelAssociation getLabelAssociation() {
        return labelAssociation;
    }

    public void setLabelAssociation(LabelAssociation labelAssociation) {
        this.labelAssociation = labelAssociation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setLabelAssociation(new LabelAssociation());
        MappingHelpers.<BulkLabelAssociation>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getLabelAssociation(), "LabelAssociation");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

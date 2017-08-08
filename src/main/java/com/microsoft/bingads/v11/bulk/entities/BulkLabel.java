package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.Label;
import com.microsoft.bingads.v11.internal.bulk.*;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a label that can be read or written in a bulk file.
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
public class BulkLabel extends SingleRecordBulkEntity {

    private Label label;

    private Status status;

    private static final List<BulkMapping<BulkLabel>> MAPPINGS;

    static {
        List<BulkMapping<BulkLabel>> m = new ArrayList<BulkMapping<BulkLabel>>();

        m.add(new SimpleBulkMapping<BulkLabel, Long>(StringTable.Id,
                new Function<BulkLabel, Long>() {
                    @Override
                    public Long apply(BulkLabel c) {
                        return c.getLabel().getId();
                    }
                },
                new BiConsumer<String, BulkLabel>() {
                    @Override
                    public void accept(String v, BulkLabel c) {
                        c.getLabel().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabel, String>(StringTable.Status,
                new Function<BulkLabel, String>() {
                    @Override
                    public String apply(BulkLabel c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkLabel>() {
                    @Override
                    public void accept(String v, BulkLabel c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabel, String>(StringTable.ColorCode,
                new Function<BulkLabel, String>() {
                    @Override
                    public String apply(BulkLabel c) {
                        return c.getLabel().getColorCode();
                    }
                },
                new BiConsumer<String, BulkLabel>() {
                    @Override
                    public void accept(String v, BulkLabel c) {
                        c.getLabel().setColorCode(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabel, String>(StringTable.Description,
                new Function<BulkLabel, String>() {
                    @Override
                    public String apply(BulkLabel c) {
                        return c.getLabel().getDescription();
                    }
                },
                new BiConsumer<String, BulkLabel>() {
                    @Override
                    public void accept(String v, BulkLabel c) {
                        c.getLabel().setDescription(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLabel, String>(StringTable.Label,
                new Function<BulkLabel, String>() {
                    @Override
                    public String apply(BulkLabel c) {
                        return c.getLabel().getName();
                    }
                },
                new BiConsumer<String, BulkLabel>() {
                    @Override
                    public void accept(String v, BulkLabel c) {
                        c.getLabel().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setLabel(new Label());
        MappingHelpers.<BulkLabel>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getLabel(), "Label");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

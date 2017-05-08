package com.microsoft.bingads.v11.internal.bulk.entities;

import com.microsoft.bingads.v11.bulk.entities.Status;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.DynamicColumnNameMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reserved for internal use.
 */
public abstract class BulkNegativeSiteIdentifier extends BulkEntityIdentifier {

    private Status status;// { get; set; }

    private long entityId;// { get; set; }

    private String entityName;// { get; set; }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    protected abstract String getParentColumnName();

    private static List<BulkMapping<BulkNegativeSiteIdentifier>> MAPPINGS;

    static {
        List<BulkMapping<BulkNegativeSiteIdentifier>> m = new ArrayList<BulkMapping<BulkNegativeSiteIdentifier>>();
        m.add(new SimpleBulkMapping<BulkNegativeSiteIdentifier, String>(StringTable.Status,
                new Function<BulkNegativeSiteIdentifier, String>() {
                    @Override
                    public String apply(BulkNegativeSiteIdentifier c) {
                        return StringExtensions.toStatusBulkString(c.getStatus());
                    }
                },
                new BiConsumer<String, BulkNegativeSiteIdentifier>() {
                    @Override
                    public void accept(String v, BulkNegativeSiteIdentifier c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeSiteIdentifier, String>(StringTable.ParentId,
                new Function<BulkNegativeSiteIdentifier, String>() {
                    @Override
                    public String apply(BulkNegativeSiteIdentifier c) {
                        return c.getEntityId() == 0 ? null : Long.toString(c.getEntityId());
                    }
                },
                new BiConsumer<String, BulkNegativeSiteIdentifier>() {
                    @Override
                    public void accept(String v, BulkNegativeSiteIdentifier c) {
                        c.setEntityId(StringExtensions.<Long>parse(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return value == null || value.isEmpty() ? 0L : Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new DynamicColumnNameMapping<BulkNegativeSiteIdentifier, String>(
                new Function<BulkNegativeSiteIdentifier, String>() {
                    @Override
                    public String apply(BulkNegativeSiteIdentifier c) {
                        return c.getParentColumnName();
                    }
                },
                new Function<BulkNegativeSiteIdentifier, String>() {
                    @Override
                    public String apply(BulkNegativeSiteIdentifier c) {
                        return c.getEntityName();
                    }
                },
                new BiConsumer<String, BulkNegativeSiteIdentifier>() {
                    @Override
                    public void accept(String v, BulkNegativeSiteIdentifier c) {
                        c.setEntityName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public boolean isDeleteRow() {
        return status == Status.DELETED;
    }
}

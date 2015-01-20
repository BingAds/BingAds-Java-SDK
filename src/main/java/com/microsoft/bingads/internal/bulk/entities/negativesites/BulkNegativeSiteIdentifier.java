package com.microsoft.bingads.internal.bulk.entities.negativesites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.DynamicColumnNameMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

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
    public void writeToRowValues(RowValues values) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public boolean isDeleteRow() {
        return status == Status.DELETED;
    }
}

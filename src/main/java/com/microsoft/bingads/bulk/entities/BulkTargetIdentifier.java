package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.ConditionalBulkMapping;
import com.microsoft.bingads.internal.bulk.DynamicColumnNameMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reserved for internal use.
 */
public abstract class BulkTargetIdentifier extends BulkEntityIdentifier {

    private Status status;

    private Long targetId;

    private Long entityId;

    private String entityName;

    private String parentEntityName;

    private Class targetBidType;

    abstract String getEntityColumnName();

    private static final List<BulkMapping<BulkTargetIdentifier>> MAPPINGS;

    static {
        List<BulkMapping<BulkTargetIdentifier>> m = new ArrayList<BulkMapping<BulkTargetIdentifier>>();

        m.add(new SimpleBulkMapping<BulkTargetIdentifier, String>(StringTable.Status,
                new Function<BulkTargetIdentifier, String>() {
                    @Override
                    public String apply(BulkTargetIdentifier c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkTargetIdentifier>() {
                    @Override
                    public void accept(String v, BulkTargetIdentifier c) {
                        c.setStatus(StringExtensions.<Status>parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTargetIdentifier, Long>(StringTable.Id,
                new Function<BulkTargetIdentifier, Long>() {
                    @Override
                    public Long apply(BulkTargetIdentifier c) {
                        return c.getTargetId();
                    }
                },
                new BiConsumer<String, BulkTargetIdentifier>() {
                    @Override
                    public void accept(String v, BulkTargetIdentifier c) {
                        c.setTargetId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTargetIdentifier, Long>(StringTable.ParentId,
                new Function<BulkTargetIdentifier, Long>() {
                    @Override
                    public Long apply(BulkTargetIdentifier c) {
                        return c.getEntityId();
                    }
                },
                new BiConsumer<String, BulkTargetIdentifier>() {
                    @Override
                    public void accept(String v, BulkTargetIdentifier c) {
                        c.setEntityId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new DynamicColumnNameMapping<BulkTargetIdentifier, String>(new Function<BulkTargetIdentifier, String>() {
            @Override
            public String apply(BulkTargetIdentifier t) {
                return t.getEntityColumnName();
            }
        }, new Function<BulkTargetIdentifier, String>() {
            @Override
            public String apply(BulkTargetIdentifier t) {
                return t.getEntityName();
            }
        }, new BiConsumer<String, BulkTargetIdentifier>() {
            @Override
            public void accept(String t, BulkTargetIdentifier u) {
                u.setEntityName(t);
            }
        }));

        m.add(new ConditionalBulkMapping<BulkTargetIdentifier, String>(StringTable.Campaign,
                new Function<BulkTargetIdentifier, Boolean>() {
                    @Override
                    public Boolean apply(BulkTargetIdentifier t) {                                                
                        return t instanceof BulkAdGroupTargetIdentifier;
                    }
                }, new Function<BulkTargetIdentifier, String>() {
                    @Override
                    public String apply(BulkTargetIdentifier t) {
                        return t.getParentEntityName();
                    }
                }, new BiConsumer<String, BulkTargetIdentifier>() {
                    @Override
                    public void accept(String t, BulkTargetIdentifier u) {
                        u.setParentEntityName(t);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    protected BulkTargetIdentifier(Class targetBidType) {
        this.targetBidType = targetBidType;
    }
    
    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }        
    
    @Override
    public boolean isDeleteRow() {
        return getStatus() == Status.DELETED;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    Long getEntityId() {
        return entityId;
    }

    void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    String getEntityName() {
        return entityName;
    }

    void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    String getParentEntityName() {
        return parentEntityName;
    }

    void setParentEntityName(String parentEntityName) {
        this.parentEntityName = parentEntityName;
    }

    Class getTargetBidType() {
        return targetBidType;
    }

    void setTargetBidType(Class targetBidType) {
        this.targetBidType = targetBidType;
    }
}

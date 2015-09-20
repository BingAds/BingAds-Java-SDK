package com.microsoft.bingads.v10.internal.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BulkAdExtensionIdentifier extends BulkEntityIdentifier {

    private Long accountId;

    private Long adExtensionId;

    private AdExtensionStatus status;

    private Integer version;

    private static List<BulkMapping<BulkAdExtensionIdentifier>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdExtensionIdentifier>> m = new ArrayList<BulkMapping<BulkAdExtensionIdentifier>>();

        m.add(new SimpleBulkMapping<BulkAdExtensionIdentifier, Long>(StringTable.Id,
                new Function<BulkAdExtensionIdentifier, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionIdentifier c) {
                        return c.getAdExtensionId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionIdentifier>() {
                    @Override
                    public void accept(String v, BulkAdExtensionIdentifier c) {
                        c.setAdExtensionId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionIdentifier, Long>(StringTable.ParentId,
                new Function<BulkAdExtensionIdentifier, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionIdentifier c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionIdentifier>() {
                    @Override
                    public void accept(String v, BulkAdExtensionIdentifier c) {
                        c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionIdentifier, String>(StringTable.Status,
                new Function<BulkAdExtensionIdentifier, String>() {
                    @Override
                    public String apply(BulkAdExtensionIdentifier c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdExtensionIdentifier>() {
                    @Override
                    public void accept(String v, BulkAdExtensionIdentifier c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, AdExtensionStatus>() {
                            @Override
                            public AdExtensionStatus apply(String value) {
                                return AdExtensionStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionIdentifier, Integer>(StringTable.Version,
                new Function<BulkAdExtensionIdentifier, Integer>() {
                    @Override
                    public Integer apply(BulkAdExtensionIdentifier c) {
                        return c.getVersion();
                    }
                },
                new BiConsumer<String, BulkAdExtensionIdentifier>() {
                    @Override
                    public void accept(String v, BulkAdExtensionIdentifier c) {
                        c.setVersion(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAdExtensionId() {
        return adExtensionId;
    }

    public void setAdExtensionId(Long adExtensionId) {
        this.adExtensionId = adExtensionId;
    }

    public AdExtensionStatus getStatus() {
        return status;
    }

    public void setStatus(AdExtensionStatus status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
        return AdExtensionStatus.DELETED.equals(status);
    }
}

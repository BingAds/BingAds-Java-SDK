package com.microsoft.bingads.internal.bulk.entities.adextensions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

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
                        c.setVersion(StringExtensions.nullOrInteger(v));
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
    public void writeToRowValues(RowValues values) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public boolean equals(Object other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDeleteRow() {
        return AdExtensionStatus.DELETED.equals(status);
    }
}

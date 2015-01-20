package com.microsoft.bingads.internal.bulk.entities.adextensions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.campaignmanagement.AdExtension;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

public class BulkAdExtensionBase<T extends AdExtension> extends SingleRecordBulkEntity {

    /**
     * The ad extension's parent account identifier. Corresponds to the 'Parent
     * Id' field in the bulk file.
     */
    private Long accountId;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * The type of ad extension from the
     * com.microsoft.bing_ads.api.client.CampaignManagement namespace, for
     * example a {@link CallAdExtension} object.
     */
    private T adExtension;

    protected T getAdExtension() {
        return adExtension;
    }

    protected void setAdExtension(T adExtension) {
        this.adExtension = adExtension;
    }

    private static List<BulkMapping<BulkAdExtensionBase>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdExtensionBase>> m = new ArrayList<BulkMapping<BulkAdExtensionBase>>();

        m.add(new SimpleBulkMapping<BulkAdExtensionBase, String>(StringTable.Status,
                new Function<BulkAdExtensionBase, String>() {
                    @Override
                    public String apply(BulkAdExtensionBase c) {
                        return StringExtensions.toAdExtensionStatusBulkString(c.getAdExtension().getStatus());
                    }
                },
                new BiConsumer<String, BulkAdExtensionBase>() {
                    @Override
                    public void accept(String v, BulkAdExtensionBase c) {
                        c.getAdExtension().setStatus(StringExtensions.parseOptional(v, new Function<String, AdExtensionStatus>() {
                            @Override
                            public AdExtensionStatus apply(String value) {
                                return AdExtensionStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionBase, Long>(StringTable.Id,
                new Function<BulkAdExtensionBase, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionBase c) {
                        return c.getAdExtension().getId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionBase>() {
                    @Override
                    public void accept(String v, BulkAdExtensionBase c) {
                        c.getAdExtension().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionBase, Long>(StringTable.ParentId,
                new Function<BulkAdExtensionBase, Long>() {
                    @Override
                    public Long apply(BulkAdExtensionBase c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAdExtensionBase>() {
                    @Override
                    public void accept(String v, BulkAdExtensionBase c) {
                        c.setAccountId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtensionBase, Integer>(StringTable.Version,
                new Function<BulkAdExtensionBase, Integer>() {
                    @Override
                    public Integer apply(BulkAdExtensionBase c) {
                        return c.getAdExtension().getVersion();
                    }
                },
                new BiConsumer<String, BulkAdExtensionBase>() {
                    @Override
                    public void accept(String v, BulkAdExtensionBase c) {
                        c.getAdExtension().setVersion(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}

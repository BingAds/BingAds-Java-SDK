package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.campaignmanagement.AdExtension;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v10.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This base class provides properties that are shared by all bulk ad extension classes.
 *
 * @param <T> the type of ad extension from the {@link com.microsoft.bingads.campaignmanagement} namespace,
 *           for example a {@link CallAdExtension} object.
 *
 * @see BulkCallAdExtension
 * @see BulkImageAdExtension
 * @see BulkLocationAdExtension
 * @see BulkProductAdExtension
 * @see BulkSiteLinkAdExtension
 */
class BulkAdExtension<T extends AdExtension> extends SingleRecordBulkEntity {

    private Long accountId;

    /**
     * Gets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * The type of ad extension from the com.microsoft.bing_ads.api.client.CampaignManagement namespace, for example a {@link CallAdExtension} object.
     */
    private T adExtension;

    protected T getAdExtension() {
        return adExtension;
    }

    protected void setAdExtension(T adExtension) {
        this.adExtension = adExtension;
    }

    private static final List<BulkMapping<BulkAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdExtension>> m = new ArrayList<BulkMapping<BulkAdExtension>>();

        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.Status,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension c) {
                        return StringExtensions.toAdExtensionStatusBulkString(c.getAdExtension().getStatus());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setStatus(StringExtensions.parseOptional(v, new Function<String, AdExtensionStatus>() {
                            @Override
                            public AdExtensionStatus apply(String value) {
                                return AdExtensionStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Long>(StringTable.Id,
                new Function<BulkAdExtension, Long>() {
                    @Override
                    public Long apply(BulkAdExtension c) {
                        return c.getAdExtension().getId();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Long>(StringTable.ParentId,
                new Function<BulkAdExtension, Long>() {
                    @Override
                    public Long apply(BulkAdExtension c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.setAccountId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Integer>(StringTable.Version,
                new Function<BulkAdExtension, Integer>() {
                    @Override
                    public Integer apply(BulkAdExtension t) {
                        return t.getAdExtension().getVersion();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}

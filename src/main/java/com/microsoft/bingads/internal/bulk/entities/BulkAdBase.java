package com.microsoft.bingads.internal.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.entities.PerformanceData;
import com.microsoft.bingads.campaignmanagement.Ad;
import com.microsoft.bingads.campaignmanagement.AdEditorialStatus;
import com.microsoft.bingads.campaignmanagement.AdStatus;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

public class BulkAdBase<T extends Ad> extends SingleRecordBulkEntity {

    public Long adGroupId;

    public String campaignName;

    public String adGroupName;

    protected T ad;

    public PerformanceData performanceData;

    private static List<BulkMapping<BulkAdBase>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdBase>> m = new ArrayList<BulkMapping<BulkAdBase>>();

        m.add(new SimpleBulkMapping<BulkAdBase, String>(StringTable.Status,
                new Function<BulkAdBase, String>() {
                    @Override
                    public String apply(BulkAdBase c) {
                        return c.getAd().getStatus() != null ? c.getAd().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.getAd().setStatus(StringExtensions.<AdStatus>parseOptional(v, new Function<String, AdStatus>() {
                            @Override
                            public AdStatus apply(String value) {
                                return AdStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, Long>(StringTable.Id,
                new Function<BulkAdBase, Long>() {
                    @Override
                    public Long apply(BulkAdBase c) {
                        return c.getAd().getId();
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.getAd().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, Long>(StringTable.ParentId,
                new Function<BulkAdBase, Long>() {
                    @Override
                    public Long apply(BulkAdBase c) {
                        return c.getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, String>(StringTable.Campaign,
                new Function<BulkAdBase, String>() {
                    @Override
                    public String apply(BulkAdBase c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, String>(StringTable.AdGroup,
                new Function<BulkAdBase, String>() {
                    @Override
                    public String apply(BulkAdBase c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, String>(StringTable.EditorialStatus,
                new Function<BulkAdBase, String>() {
                    @Override
                    public String apply(BulkAdBase c) {
                        return c.getAd().getEditorialStatus() != null ? c.getAd().getEditorialStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.getAd().setEditorialStatus(StringExtensions.<AdEditorialStatus>parseOptional(v, new Function<String, AdEditorialStatus>() {
                            @Override
                            public AdEditorialStatus apply(String value) {
                                return AdEditorialStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdBase, String>(StringTable.DevicePreference,
                new Function<BulkAdBase, String>() {
                    @Override
                    public String apply(BulkAdBase c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getAd().getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkAdBase>() {
                    @Override
                    public void accept(String v, BulkAdBase c) {
                        c.getAd().setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    ;
    
    @Override
    public void processMappingsToRowValues(RowValues values) {
        MappingHelpers.<BulkAdBase>convertToValues(this, values, MAPPINGS);

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkAdBase>convertToEntity(values, MAPPINGS, this);
    }

    public Long getAdGroupId() {
        return adGroupId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getAdGroupName() {
        return adGroupName;
    }

    public T getAd() {
        return ad;
    }

    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    public void setAdGroupId(Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    public void setAd(T ad) {
        this.ad = ad;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

}

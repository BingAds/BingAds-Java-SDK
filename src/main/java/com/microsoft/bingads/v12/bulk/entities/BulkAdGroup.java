package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.*;
import com.microsoft.bingads.v12.internal.bulk.*;
import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an Ad Group.
 * <p/>
 * <p>
 * This class exposes the {@link #setAdGroup} and {@link #getAdGroup} that can be used to read and write
 * fields of the Ad Group record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Ad Group at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroup extends SingleRecordBulkEntity {

    private Long campaignId;

    private String campaignName;

    private AdGroup adGroup;

    private QualityScoreData qualityScoreData;

    private PerformanceData performanceData;

    private boolean isExpired;

    private static final List<BulkMapping<BulkAdGroup>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroup>> m = new ArrayList<BulkMapping<BulkAdGroup>>();

        m.add(new SimpleBulkMapping<BulkAdGroup, Long>(StringTable.Id,
                new Function<BulkAdGroup, Long>() {
                    @Override
                    public Long apply(BulkAdGroup c) {
                        return c.getAdGroup().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.Status,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        if (c.getIsExpired()) {
                            return "Expired";
                        }

                        return c.getAdGroup().getStatus() != null ? c.getAdGroup().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        if (v.equals("Expired")) {
                            c.getAdGroup().setStatus(AdGroupStatus.EXPIRED);

                            c.setIsExpired(true);
                        } else {
                            c.getAdGroup().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupStatus>() {
                                @Override
                                public AdGroupStatus apply(String value) {
                                    return AdGroupStatus.fromValue(value);
                                }
                            }));
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, Long>(StringTable.ParentId,
                new Function<BulkAdGroup, Long>() {
                    @Override
                    public Long apply(BulkAdGroup c) {
                        return c.getCampaignId();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.setCampaignId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.Campaign,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.AdGroup,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return c.getAdGroup().getName();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.StartDate,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toDateBulkString(c.getAdGroup().getStartDate());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        try {
                            c.getAdGroup().setStartDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.EndDate,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toDateBulkString(c.getAdGroup().getEndDate());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        try {
                            c.getAdGroup().setEndDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.NetworkDistribution,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return c.getAdGroup().getNetwork() != null ? c.getAdGroup().getNetwork().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setNetwork(StringExtensions.parseOptional(v, new Function<String, Network>() {
                            @Override
                            public Network apply(String value) {
                                return Network.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.AdRotation,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toAdRotationBulkString(c.getAdGroup().getAdRotation());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setAdRotation(StringExtensions.parseAdRotation(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.CpcBid,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toAdGroupBidBulkString(c.getAdGroup().getCpcBid());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setCpcBid(StringExtensions.parseAdGroupBid(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.Language,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toOptionalBulkString(c.getAdGroup().getLanguage());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setLanguage(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, Integer>(StringTable.BidAdjustment,
                new Function<BulkAdGroup, Integer>() {
                    @Override
                    public Integer apply(BulkAdGroup c) {
                        return c.getAdGroup().getAudienceAdsBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setAudienceAdsBidAdjustment(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.TrackingTemplate,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toOptionalBulkString(c.getAdGroup().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.CustomParameter,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdGroup().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        try {
                            c.getAdGroup().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkAdGroup>(
                new BiConsumer<BulkAdGroup, RowValues>() {
                    @Override
                    public void accept(BulkAdGroup c, RowValues v) {
                        biddingSchemeToCsv(c, v);
                    }
                },
                new BiConsumer<RowValues, BulkAdGroup>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroup c) {
                        csvToBiddingScheme(v, c);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.TargetSetting,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        TargetSetting targetSetting = c.getTargetSetting();
                        return targetSetting == null? null : StringExtensions.toBulkString(targetSetting);
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        TargetSetting targetSetting = StringExtensions.parseTargetSetting(v);
                        if (targetSetting == null) return;
                        if (c.getAdGroup().getSettings() == null) {
                            c.getAdGroup().setSettings(new ArrayOfSetting());
                        }
                        
                        c.getAdGroup().getSettings().getSettings().add(targetSetting);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }
    
    private TargetSetting getTargetSetting() { 
        if (adGroup.getSettings() == null || adGroup.getSettings().getSettings().size() == 0) return null;
        
        TargetSetting[] targetSettings = adGroup.getSettings().getSettings().stream().filter(e -> e instanceof TargetSetting).toArray(TargetSetting[]::new);
        
        if (targetSettings.length == 1)
        {
            return targetSettings[0];
        }
        
        return null;
    }

    private static void csvToBiddingScheme(RowValues values, BulkAdGroup c) {
        try {
            String bidStrategyTypeRowValue = values.tryGet(StringTable.BidStrategyType);
            if (bidStrategyTypeRowValue == null) {
                return;
            }
            BiddingScheme biddingScheme = StringExtensions.parseBiddingScheme(bidStrategyTypeRowValue);
            if (biddingScheme == null) {
                return;
            }
            if (biddingScheme instanceof InheritFromParentBiddingScheme) {
                InheritFromParentBiddingScheme inheritFromParentBiddingScheme = new InheritFromParentBiddingScheme();
                inheritFromParentBiddingScheme.setType("InheritFromParent");
                inheritFromParentBiddingScheme.setInheritedBidStrategyType(values.tryGet(StringTable.InheritedBidStrategyType));
                c.getAdGroup().setBiddingScheme(inheritFromParentBiddingScheme);
            } else {
                c.getAdGroup().setBiddingScheme(biddingScheme);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void biddingSchemeToCsv(BulkAdGroup c, RowValues values) {
        BiddingScheme biddingScheme = c.getAdGroup().getBiddingScheme();
        if (biddingScheme == null) {
            return;
        }
        try {
            values.put(StringTable.BidStrategyType, StringExtensions.toBiddingSchemeBulkString(biddingScheme));
            if (biddingScheme instanceof InheritFromParentBiddingScheme) {
                values.put(StringTable.InheritedBidStrategyType, ((InheritFromParentBiddingScheme) biddingScheme).getInheritedBidStrategyType());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAdGroup(new AdGroup());


        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        qualityScoreData = QualityScoreData.readFromRowValuesOrNull(values);
        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroup(), "AdGroup");

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            QualityScoreData.writeToRowValuesIfNotNull(qualityScoreData, values);

            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    /**
     * Gets the identifier of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the identifier of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Gets the name of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the AdGroup Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of AdGroup properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public AdGroup getAdGroup() {
        return adGroup;
    }

    /**
     * Sets the AdGroup Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of AdGroup properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setAdGroup(AdGroup adGroup) {
        this.adGroup = adGroup;
    }

    /**
     * Gets the quality score data for the ad group.
     */
    public QualityScoreData getQualityScoreData() {
        return qualityScoreData;
    }

    /**
     * Gets the historical performance data for the ad group.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    /**
     * Gets whether the AdGroup is expired.
     */
    public boolean getIsExpired() {
        return isExpired;
    }

    /**
     * Sets whether the AdGroup is expired.
     */
    private void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }
}

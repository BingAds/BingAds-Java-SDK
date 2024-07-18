package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AdGroup;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupPrivacyStatus;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupStatus;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfTargetSettingDetail;
import com.microsoft.bingads.v13.campaignmanagement.BidOption;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.CoOpSetting;
import com.microsoft.bingads.v13.campaignmanagement.HotelSetting;
import com.microsoft.bingads.v13.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.Network;
import com.microsoft.bingads.v13.campaignmanagement.RateAmount;
import com.microsoft.bingads.v13.campaignmanagement.RateBid;
import com.microsoft.bingads.v13.campaignmanagement.Setting;
import com.microsoft.bingads.v13.campaignmanagement.TargetSetting;
import com.microsoft.bingads.v13.campaignmanagement.TargetSettingDetail;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

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
                        return c.getAdGroup().getStatus() != null ? c.getAdGroup().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupStatus>() {
                            @Override
                            public AdGroupStatus apply(String value) {
                                return StringExtensions.fromValueOptional(value, AdGroupStatus.class);
                            }
                        }));
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
                                return StringExtensions.fromValueOptional(value, Network.class);
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
                        return StringExtensions.toAdGroupBidBulkString(c.getAdGroup().getCpcBid(), c.getAdGroup().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getAdGroup().getLanguage(), c.getAdGroup().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getAdGroup().getTrackingUrlTemplate(), c.getAdGroup().getId());
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
                        return StringExtensions.toCustomParaBulkString(c.getAdGroup().getUrlCustomParameters(), c.getAdGroup().getId());
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
        

        m.add(new ComplexBulkMapping<BulkAdGroup>(
                new BiConsumer<BulkAdGroup, RowValues>() {
                    @Override
                    public void accept(BulkAdGroup c, RowValues v) {
                        coOpSettingtoCsv(c, v);
                    }
                },
                new BiConsumer<RowValues, BulkAdGroup>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroup c) {
                        csvToCoOpSetting(v, c);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.TargetSetting,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        TargetSetting targetSetting = (TargetSetting)c.getSetting(TargetSetting.class);
                        return targetSetting == null? null : StringExtensions.toBulkString(targetSetting);
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        List<TargetSettingDetail> targetSettingDetails = StringExtensions.parseTargetSettingDetails(v);
                        if (targetSettingDetails != null) {
                            TargetSetting targetSetting = new TargetSetting();
                            targetSetting.setType(TargetSetting.class.getSimpleName());
                            targetSetting.setDetails(new ArrayOfTargetSettingDetail());
                            targetSetting.getDetails().getTargetSettingDetails().addAll(targetSettingDetails);
                            c.addAdGroupSetting(targetSetting);
                        }
                    }
                }
        ));
		
		
        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.PrivacyStatus,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {

                        return c.getAdGroup().getPrivacyStatus() != null ? c.getAdGroup().getPrivacyStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setPrivacyStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupPrivacyStatus>() {
                            @Override
                            public AdGroupPrivacyStatus apply(String value) {
                                return StringExtensions.fromValueOptional(value, AdGroupPrivacyStatus.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.FinalUrlSuffix,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toOptionalBulkString(c.getAdGroup().getFinalUrlSuffix(), c.getAdGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.AdScheduleUseSearcherTimeZone,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup t) {
                        if (t.getAdGroup().getAdScheduleUseSearcherTimeZone()== null) {
                            return null;
                        }

                        return StringExtensions.toUseSearcherTimeZoneBulkString(t.getAdGroup().getAdScheduleUseSearcherTimeZone(), null);
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setAdScheduleUseSearcherTimeZone(StringExtensions.parseUseSearcherTimeZone(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.AdGroupType,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return c.getAdGroup().getAdGroupType();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setAdGroupType(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.CpvBid,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toAdGroupBidBulkString(c.getAdGroup().getCpvBid(), c.getAdGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setCpvBid(StringExtensions.parseAdGroupBid(v));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.CpmBid,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toAdGroupBidBulkString(c.getAdGroup().getCpmBid(), c.getAdGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setCpmBid(StringExtensions.parseAdGroupBid(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, Integer>(StringTable.MultiMediaAdBidAdjustment,
                new Function<BulkAdGroup, Integer>() {
                    @Override
                    public Integer apply(BulkAdGroup c) {
                        return c.getAdGroup().getMultimediaAdsBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setMultimediaAdsBidAdjustment(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.UseOptimizedTargeting,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toBooleanBulkString(c.getAdGroup().getUseOptimizedTargeting());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setUseOptimizedTargeting(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.HotelAdGroupType,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        HotelSetting hotelSetting = (HotelSetting)c.getSetting(HotelSetting.class);
                        return StringExtensions.toBulkString(hotelSetting);
                     }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {

                        HotelSetting hotelSetting = StringExtensions.parseHotelSetting(v);
                        if (hotelSetting != null) {
                            c.addAdGroupSetting(hotelSetting);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.CommissionRate,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        RateBid rateBid = c.getAdGroup().getCommissionRate();
                        if (rateBid != null) {
                            RateAmount rateAmount = rateBid.getRateAmount();
                            if (rateAmount != null) {
                                return StringExtensions.toBulkString(rateAmount.getAmount());
                            }
                        }
                        return null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        
                        Double d = StringExtensions.nullOrDouble(v);
                        if (d != null) {
                            RateAmount rateAmount = new RateAmount();
                            rateAmount.setAmount(d);
                            
                            RateBid rateBid = new RateBid();
                            rateBid.setType("RateBid");
                            rateBid.setRateAmount(rateAmount);
                            
                            c.getAdGroup().setCommissionRate(rateBid);
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.PercentCpcBid,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        RateBid rateBid = c.getAdGroup().getPercentCpcBid();
                        if (rateBid != null) {
                            RateAmount rateAmount = rateBid.getRateAmount();
                            if (rateAmount != null) {
                                return StringExtensions.toBulkString(rateAmount.getAmount());
                            }
                        }
                        return null;
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        
                        Double d = StringExtensions.nullOrDouble(v);
                        if (d != null) {
                            RateAmount rateAmount = new RateAmount();
                            rateAmount.setAmount(d);
                            
                            RateBid rateBid = new RateBid();
                            rateBid.setType("RateBid");
                            rateBid.setRateAmount(rateAmount);
                            
                            c.getAdGroup().setPercentCpcBid(rateBid);
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroup, String>(StringTable.FrequencyCapSettings,
                new Function<BulkAdGroup, String>() {
                    @Override
                    public String apply(BulkAdGroup c) {
                        return StringExtensions.toAdGroupFrequencyCapSettingsBulkString(c.getAdGroup().getFrequencyCapSettings(), c.getAdGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAdGroup>() {
                    @Override
                    public void accept(String v, BulkAdGroup c) {
                        c.getAdGroup().setFrequencyCapSettings(StringExtensions.parseFrequencyCapSettings(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }
    

    public Setting getSetting(Class<? extends Setting> settingClass) { 
        if (adGroup.getSettings() == null || adGroup.getSettings().getSettings().size() == 0) {
            return null;
        }
        
        Setting[] settings = adGroup.getSettings().getSettings().stream().filter(e -> e.getClass() == settingClass).toArray(Setting[]::new);
        if (settings.length == 0) {
            return null;
        }
        
        if (settings.length == 1)
        {
            return settings[0];
        }
        
        return null;
    }

    public void addAdGroupSetting(Setting setting) {
        if (adGroup.getSettings() == null) {
            adGroup.setSettings(new ArrayOfSetting());
        }
        adGroup.getSettings().getSettings().add(setting);
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
    

    private static void csvToCoOpSetting(RowValues values, BulkAdGroup c) {
        BidOption bo = StringExtensions.parseOptional(values.tryGet(StringTable.BidOption), new Function<String, BidOption>() {
            @Override
            public BidOption apply(String value) {
                return StringExtensions.fromValueOptional(value, BidOption.class);
            }
        });
        Double boostValue = StringExtensions.parseOptional(values.tryGet(StringTable.BidBoostValue), new Function<String, Double>() {
            @Override
            public Double apply(String value) {
                return Double.parseDouble(value);
            }
        });
        
        Double maximumBid = StringExtensions.parseOptional(values.tryGet(StringTable.MaximumBid), new Function<String, Double>() {
            @Override
            public Double apply(String value) {
                return Double.parseDouble(value);
            }
        });

        if (bo != null || boostValue != null || maximumBid != null) {
            CoOpSetting setting = new CoOpSetting();
            setting.setType(CoOpSetting.class.getSimpleName());
            setting.setBidOption(bo);
            setting.setBidBoostValue(boostValue);
            setting.setBidMaxValue(maximumBid);
            c.addAdGroupSetting(setting);
        }
    }
    
    private static void coOpSettingtoCsv(BulkAdGroup c, RowValues values) {
        CoOpSetting setting = (CoOpSetting) c.getSetting(CoOpSetting.class);
        if (setting == null) {
            return;
        }

        if (setting.getBidOption() != null) {
            values.put(StringTable.BidOption, StringExtensions.toBulkString(setting.getBidOption().value()));
        }
        values.put(StringTable.BidBoostValue, StringExtensions.toBulkString(setting.getBidBoostValue()));
        values.put(StringTable.MaximumBid, StringExtensions.toBulkString(setting.getBidMaxValue()));
        
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAdGroup(new AdGroup());


        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        qualityScoreData = QualityScoreData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroup(), "AdGroup");

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            QualityScoreData.writeToRowValuesIfNotNull(qualityScoreData, values);
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
}

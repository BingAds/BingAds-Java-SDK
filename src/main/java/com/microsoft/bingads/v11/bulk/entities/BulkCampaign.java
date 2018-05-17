package com.microsoft.bingads.v11.bulk.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v11.campaignmanagement.Bid;
import com.microsoft.bingads.v11.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v11.campaignmanagement.Campaign;
import com.microsoft.bingads.v11.campaignmanagement.CampaignStatus;
import com.microsoft.bingads.v11.campaignmanagement.CampaignType;
import com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v11.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.Setting;
import com.microsoft.bingads.v11.campaignmanagement.ShoppingSetting;
import com.microsoft.bingads.v11.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a campaign that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setCampaign} and {@link #getCampaign} methods
 * that can be used to read and write fields of the Campaign record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Campaign at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaign extends SingleRecordBulkEntity {

    private Long accountId;
    private Campaign campaign;
    private QualityScoreData qualityScoreData;
    private PerformanceData performanceData;
    private String budgetName;
    private static final List<BulkMapping<BulkCampaign>> MAPPINGS;
    private static BiConsumer<BulkCampaign, RowValues> budgetToCsv;
    private static BiConsumer<RowValues, BulkCampaign> csvToBudget;

    private Setting getCampaignSetting(Class<? extends Setting> settingClass) {
        if (campaign.getSettings() == null) {
            tryAddCampaignSettings();
        }
        if (getCampaign().getSettings() == null) return null;
        
        List<Setting> settings = getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == settingClass).collect(Collectors.toList());

        if (settings.isEmpty()) return null;
        
        if (settings.size() != 1) {
            throw new IllegalArgumentException(String.format("Can only have 1 %s in Campaign Settings.", settingClass.getSimpleName()));
        }

        return settings.get(0);
    }

    private void tryAddCampaignSettings() {
        Collection<CampaignType> campaignTypes = campaign.getCampaignType();
        if (campaignTypes.isEmpty()) return;
        if (campaignTypes.size() > 1) {
            throw new IllegalArgumentException("Can only have 1 campaign type in Campaign types.");
        }
        for (CampaignType type : campaignTypes) {
            // in fact there is only one item in the list.
            addCampaignSettings(type);
        }
    }

    private void addCampaignSettings(CampaignType campaignType) {

        ArrayOfSetting arrayOfSettings = new ArrayOfSetting();
        Setting setting = null;
        switch (campaignType) {
        case SHOPPING:
        case AUDIENCE:
            setting = new ShoppingSetting();
            setting.setType(ShoppingSetting.class.getSimpleName());
            break;
        case DYNAMIC_SEARCH_ADS:
            setting = new DynamicSearchAdsSetting();
            setting.setType(DynamicSearchAdsSetting.class.getSimpleName());
            break;
        case SEARCH_AND_CONTENT:
            break;
        }
        if (setting != null) {
            arrayOfSettings.getSettings().add(setting);
            campaign.setSettings(arrayOfSettings);
        }
    }

    static {

        //Consumers to describe getting and setting Daily and Monthly budget fields based on the budget type and budget columns
        budgetToCsv = new BiConsumer<BulkCampaign, RowValues>() {
            @Override
            public void accept(BulkCampaign c, RowValues values) {
                BudgetLimitType budgetType = c.getCampaign().getBudgetType();

                if (budgetType == null) {
                    return;
                }

                Double budget = null;

                if (isDailyBudget(budgetType)) {
                    budget = c.getCampaign().getDailyBudget();
                }
                
                if (budget == null) {
                    return;
                }

                values.put(StringTable.Budget, budget.toString());
            }
        };

        csvToBudget = new BiConsumer<RowValues, BulkCampaign>() {
            @Override
            public void accept(RowValues values, BulkCampaign c) {
                String budgetTypeRowValue = values.get(StringTable.BudgetType);
                BudgetLimitType budgetType = StringExtensions.parseOptional(budgetTypeRowValue, new Function<String, BudgetLimitType>() {
                    @Override
                    public BudgetLimitType apply(String value) {
                        return BudgetLimitType.fromValue(value);
                    }
                });

                if (budgetType == null) {
                    return;
                }

                String budgetRowValue = values.get(StringTable.Budget);

                if (budgetRowValue == null) {
                    return;
                }

                Double budgetValue = StringExtensions.nullOrDouble(budgetRowValue);

                c.getCampaign().setBudgetType(budgetType);

                if (isDailyBudget(budgetType)) {
                    c.getCampaign().setDailyBudget(budgetValue);
                }
            }
        };

        List<BulkMapping<BulkCampaign>> m = new ArrayList<BulkMapping<BulkCampaign>>();

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.CampaignType,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return null;
                        }

                        if (c.getCampaign().getCampaignType().size() != 1) {
                            throw new IllegalArgumentException("Only 1 CampaignType can be set in Campaign");
                        }

                        Collection<CampaignType> campaignTypes = c.getCampaign().getCampaignType();

                        return (campaignTypes.toArray(new CampaignType[campaignTypes.size()])[0]).value();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        CampaignType campaignType = StringExtensions.parseOptional(v, new Function<String, CampaignType>() {
                            @Override
                            public CampaignType apply(String value) {
                                return CampaignType.fromValue(value);
                            }
                        });

                        if (campaignType != null) {
                            c.getCampaign().setCampaignType(Collections.singleton(campaignType));
                            c.addCampaignSettings(campaignType);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, Long>(StringTable.Id,
                new Function<BulkCampaign, Long>() {
                    @Override
                    public Long apply(BulkCampaign c) {
                        return c.getCampaign().getId();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.Status,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getCampaign().getStatus() != null ? c.getCampaign().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignStatus>() {
                            @Override
                            public CampaignStatus apply(String value) {
                                return CampaignStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, Long>(StringTable.ParentId,
                new Function<BulkCampaign, Long>() {
                    @Override
                    public Long apply(BulkCampaign c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.setAccountId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.Campaign,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getCampaign().getName();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.TimeZone,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getCampaign().getTimeZone();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setTimeZone(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.Language,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return StringExtensions.writeCampaignLanguages(";", c.getCampaign().getLanguages());
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                    	ArrayOfstring languages = new ArrayOfstring();
                    	List<String> languageArray = StringExtensions.parseCampaignLanguages(v);
                    	if(languageArray == null) {
                    		languages = null;
                    	} else {
                    		languages.getStrings().addAll(languageArray);
                    	}
                    	
                        c.getCampaign().setLanguages(languages);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.BudgetType,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getCampaign().getBudgetType() != null ? c.getCampaign().getBudgetType().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setBudgetType(StringExtensions.parseOptional(v, new Function<String, BudgetLimitType>() {
                            @Override
                            public BudgetLimitType apply(String value) {
                                return BudgetLimitType.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.BudgetId,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getCampaign().getBudgetId() != null ? c.getCampaign().getBudgetId().toString() : null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setBudgetId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.BudgetName,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return c.getBudgetName();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.setBudgetName(v);
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkCampaign>(BulkCampaign.budgetToCsv, BulkCampaign.csvToBudget));

        m.add(new SimpleBulkMapping<BulkCampaign, Integer>(StringTable.BidAdjustment,
                new Function<BulkCampaign, Integer>() {
                    @Override
                    public Integer apply(BulkCampaign c) {
                        return c.getCampaign().getNativeBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setNativeBidAdjustment(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, Long>(StringTable.BingMerchantCenterId,
                new Function<BulkCampaign, Long>() {
                    @Override
                    public Long apply(BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return null;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);
                        return setting == null? null : ((ShoppingSetting)setting).getStoreId();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);

                        if (setting == null) {
                            return;
                        }

                        ((ShoppingSetting)setting).setStoreId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, Integer>(StringTable.CampaignPriority,
                new Function<BulkCampaign, Integer>() {
                    @Override
                    public Integer apply(BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return null;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);
                        return setting == null? null : ((ShoppingSetting)setting).getPriority();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);

                        if (setting == null) {
                            return;
                        }

                        ((ShoppingSetting)setting).setPriority(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.CountryCode,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return null;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);
                        return setting == null? null : ((ShoppingSetting)setting).getSalesCountryCode();
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);

                        if (setting == null) {
                            return;
                        }

                        ((ShoppingSetting)setting).setSalesCountryCode(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.LocalInventoryAdsEnabled,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return null;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);

                        if (setting == null) {
                            return null;
                        }

                        return StringExtensions.toBooleanBulkString(((ShoppingSetting)setting).getLocalInventoryAdsEnabled());
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        Setting setting = c.getCampaignSetting(ShoppingSetting.class);

                        if (setting == null) {
                            return;
                        }

                        ((ShoppingSetting)setting).setLocalInventoryAdsEnabled(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.TrackingTemplate,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return StringExtensions.toOptionalBulkString(c.getCampaign().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        c.getCampaign().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.CustomParameter,
                new Function<BulkCampaign, String>() {
                    @Override
                    public String apply(BulkCampaign c) {
                        return StringExtensions.toCustomParaBulkString(c.getCampaign().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        try {
							c.getCampaign().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkCampaign>(
                new BiConsumer<BulkCampaign, RowValues>() {
                    @Override
                    public void accept(BulkCampaign c, RowValues values) {
                        // BiddingScheme to Csv
                        try {
                            BiddingScheme biddingScheme = c.getCampaign().getBiddingScheme();

                            if (biddingScheme == null) {
                                return;
                            }

                            values.put(StringTable.BidStrategyType, StringExtensions.toBiddingSchemeBulkString(biddingScheme));

                            if (c.getCampaign().getBiddingScheme() instanceof MaxClicksBiddingScheme) {
                                Bid maxCpc = ((MaxClicksBiddingScheme)c.getCampaign().getBiddingScheme()).getMaxCpc();
                                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc));
                            }
                            else if (c.getCampaign().getBiddingScheme() instanceof MaxConversionsBiddingScheme) {
                                Bid maxCpc = ((MaxConversionsBiddingScheme)c.getCampaign().getBiddingScheme()).getMaxCpc();
                                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc));
                            }
                            else if (c.getCampaign().getBiddingScheme() instanceof TargetCpaBiddingScheme) {
                                Bid maxCpc = ((TargetCpaBiddingScheme)c.getCampaign().getBiddingScheme()).getMaxCpc();
                                values.put(StringTable.BidStrategyMaxCpc, StringExtensions.toBidBulkString(maxCpc));
                                Double targetCpa = ((TargetCpaBiddingScheme)c.getCampaign().getBiddingScheme()).getTargetCpa();
                                if (targetCpa != null) {
                                	values.put(StringTable.BidStrategyTargetCpa, targetCpa.toString());
                                }
                            }
                        
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                },
                new BiConsumer<RowValues, BulkCampaign>() {
                    @Override
                    public void accept(RowValues values, BulkCampaign c) {
                        // Csv to BiddingScheme
                        try {
                            String bidStrategyTypeRowValue = values.get(StringTable.BidStrategyType);
                            BiddingScheme biddingScheme = StringExtensions.parseBiddingScheme(bidStrategyTypeRowValue);

                            if (biddingScheme == null) {
                                return;
                            }

                            String maxCpcRowValue = values.get(StringTable.BidStrategyMaxCpc);
                            String targetCpaRowValue = values.get(StringTable.BidStrategyTargetCpa);

                            Bid maxCpcValue = StringExtensions.parseBid(maxCpcRowValue);
                            Double targetCpaValue = StringExtensions.nullOrDouble(targetCpaRowValue);

                            if (biddingScheme instanceof MaxClicksBiddingScheme) {
                                ((MaxClicksBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                            }
                            else if (biddingScheme instanceof MaxConversionsBiddingScheme) {
                                ((MaxConversionsBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                            }
                            else if (biddingScheme instanceof TargetCpaBiddingScheme) {
                                ((TargetCpaBiddingScheme)biddingScheme).setMaxCpc(maxCpcValue);
                                ((TargetCpaBiddingScheme)biddingScheme).setTargetCpa(targetCpaValue);
                            }

                            c.getCampaign().setBiddingScheme(biddingScheme);
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.Website,
        		new Function<BulkCampaign, String>() {
		            @Override
		            public String apply(BulkCampaign c) {
		                if (c.getCampaign().getCampaignType() == null) {
		                    return null;
		                }
		
	                    Setting setting = c.getCampaignSetting(DynamicSearchAdsSetting.class);
	
	                    if (setting == null) {
	                        return null;
	                    }
	
	                    return ((DynamicSearchAdsSetting)setting).getDomainName();
		            }
		        },
		        new BiConsumer<String, BulkCampaign>() {
		            @Override
		            public void accept(String v, BulkCampaign c) {
		                if (c.getCampaign().getCampaignType() == null) {
		                    return;
		                }

                        Setting setting = c.getCampaignSetting(DynamicSearchAdsSetting.class);
                        
	                    if (setting == null) {
	                        return;
	                    }
	
	                    ((DynamicSearchAdsSetting)setting).setDomainName(v);
		            }
		        }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaign, String>(StringTable.DomainLanguage,
        		new Function<BulkCampaign, String>() {
		            @Override
		            public String apply(BulkCampaign c) {
		                if (c.getCampaign().getCampaignType() == null) {
		                    return null;
		                }
		
		                Setting setting = c.getCampaignSetting(DynamicSearchAdsSetting.class);

	                    if (setting == null) {
	                        return null;
	                    }
	
	                    return ((DynamicSearchAdsSetting)setting).getLanguage();
		            }
		        },
		        new BiConsumer<String, BulkCampaign>() {
		            @Override
		            public void accept(String v, BulkCampaign c) {
		                if (c.getCampaign().getCampaignType() == null) {
		                    return;
		                }
		
		                Setting setting = c.getCampaignSetting(DynamicSearchAdsSetting.class);

	                    if (setting == null) {
	                        return;
	                    }
	
	                    ((DynamicSearchAdsSetting)setting).setLanguage(v);
		            }
		        }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the identifier of the account that contains the campaign.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the identifier of the account that contains the campaign.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets a campaign within an account.
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * Sets a campaign within an account.
     */
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    /**
     * Gets the quality score data for the campaign.
     */
    public QualityScoreData getQualityScoreData() {
        return qualityScoreData;
    }

    /**
     * Sets the historical performance data for the campaign.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    /**
     * Gets the budget name for the campaign
     * */
    public String getBudgetName() {
		return budgetName;
	}

    /**
     * Sets the budget name for the campaign
     * */
	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}

	@Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setCampaign(new Campaign());
        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        qualityScoreData = QualityScoreData.readFromRowValuesOrNull(values);
        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCampaign(), "Campaign");

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            QualityScoreData.writeToRowValuesIfNotNull(qualityScoreData, values);

            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    public static boolean isDailyBudget(BudgetLimitType budgetType) {
        return BudgetLimitType.DAILY_BUDGET_ACCELERATED.equals(budgetType) || BudgetLimitType.DAILY_BUDGET_STANDARD.equals(budgetType);
    }
}

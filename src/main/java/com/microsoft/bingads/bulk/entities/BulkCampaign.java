package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.*;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Represents a campaign that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setCampaign} and {@link #getCampaign} methods
 * that can be used to read and write fields of the Campaign record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Campaign at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=511521">http://go.microsoft.com/fwlink/?LinkID=511521</a>.
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

    private static final List<BulkMapping<BulkCampaign>> MAPPINGS;
    private static BiConsumer<BulkCampaign, RowValues> budgetToCsv;
    private static BiConsumer<RowValues, BulkCampaign> csvToBudget;

    private static List<Setting> filterSettings(List<Setting> settings, CampaignType campaignType) {
        ArrayList<Setting> filteredSettings = new ArrayList<Setting>();

        for (Setting setting : settings) {
            if (campaignType == CampaignType.SHOPPING && setting instanceof ShoppingSetting) {
                filteredSettings.add(setting);
            }
        }

        return filteredSettings;
    }

    private ShoppingSetting getShoppingSetting() {
        if (getCampaign().getSettings() == null) return null;

        List<Setting> shoppingSettings = filterSettings(getCampaign().getSettings().getSettings(), CampaignType.SHOPPING);

        if (shoppingSettings.size() != 1) {
            throw new IllegalArgumentException("Can only have 1 ShoppingSetting in Campaign Settings.");
        }

        return (ShoppingSetting) shoppingSettings.get(0);
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

                Double budget;

                if (isDailyBudget(budgetType)) {
                    budget = c.getCampaign().getDailyBudget();
                } else {
                    budget = c.getCampaign().getMonthlyBudget();
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
                } else {
                    c.getCampaign().setMonthlyBudget(budgetValue);
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
                            List<CampaignType> campaignTypes = new ArrayList<CampaignType>();

                            campaignTypes.add(campaignType);

                            c.getCampaign().setCampaignType(campaignTypes);

                            if (campaignType == CampaignType.SHOPPING) {
                                c.getCampaign().setSettings(new ArrayOfSetting());

                                ShoppingSetting shoppingSetting = new ShoppingSetting();

                                shoppingSetting.setType(ShoppingSetting.class.getSimpleName());

                                c.getCampaign().getSettings().getSettings().add(shoppingSetting);
                            }
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

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return null;
                            }

                            return shoppingSetting.getStoreId();
                        }

                        return null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return;
                            }

                            shoppingSetting.setStoreId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                @Override
                                public Long apply(String s) {
                                    return Long.parseLong(s);
                                }
                            }));
                        }
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

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return null;
                            }

                            return shoppingSetting.getPriority();
                        }

                        return null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return;
                            }

                            shoppingSetting.setPriority(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                                @Override
                                public Integer apply(String s) {
                                    return Integer.parseInt(s);
                                }
                            }));
                        }
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

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return null;
                            }

                            return shoppingSetting.getSalesCountryCode();
                        }

                        return null;
                    }
                },
                new BiConsumer<String, BulkCampaign>() {
                    @Override
                    public void accept(String v, BulkCampaign c) {
                        if (c.getCampaign().getCampaignType() == null) {
                            return;
                        }

                        if (c.getCampaign().getCampaignType().contains(CampaignType.SHOPPING)) {
                            ShoppingSetting shoppingSetting = c.getShoppingSetting();

                            if (shoppingSetting == null) {
                                return;
                            }

                            shoppingSetting.setSalesCountryCode(v);
                        }
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

package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the performance data returned with bulk file entities when requested
 *
 */
public class PerformanceData {

    private Double spend;

    private Integer impressions;

    private Integer clicks;

    private Double clickThroughRate;

    private Double averageCostPerClick;

    private Double averageCostPerThousandImpressions;

    private Double averagePosition;

    private Integer conversions;

    private Double costPerConversion;

    private static final List<BulkMapping<PerformanceData>> MAPPINGS;

    static {
        List<BulkMapping<PerformanceData>> m = new ArrayList<BulkMapping<PerformanceData>>();

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.Spend,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getSpend();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setSpend(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Impressions,
                new Function<PerformanceData, Integer>() {
                    @Override
                    public Integer apply(PerformanceData t) {
                        return t.getImpressions();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setImpressions(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Clicks,
                new Function<PerformanceData, Integer>() {
                    @Override
                    public Integer apply(PerformanceData t) {
                        return t.getClicks();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setClicks(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.CTR,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getClickThroughRate();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setClickThroughRate(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgCPC,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getAverageCostPerClick();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAverageCostPerClick(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgCPM,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getAverageCostPerThousandImpressions();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAverageCostPerThousandImpressions(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgPosition,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getAveragePosition();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAveragePosition(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Conversions,
                new Function<PerformanceData, Integer>() {
                    @Override
                    public Integer apply(PerformanceData t) {
                        return t.getConversions();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setConversions(StringExtensions.parseOptionalInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.CPA,
                new Function<PerformanceData, Double>() {
                    @Override
                    public Double apply(PerformanceData t) {
                        return t.getCostPerConversion();
                    }
                },
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setCostPerConversion(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    static PerformanceData readFromRowValuesOrNull(RowValues values) {
        PerformanceData performanceData = new PerformanceData();

        performanceData.readFromRowValues(values);

        return performanceData.hasAnyValues() ? performanceData : null;
    }

    static void writeToRowValuesIfNotNull(PerformanceData performanceData, RowValues values) {
        if (performanceData != null) {
            performanceData.writeToRowValues(values);
        }
    }

    public Double getSpend() {
        return spend;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public Double getClickThroughRate() {
        return clickThroughRate;
    }

    public Double getAverageCostPerClick() {
        return averageCostPerClick;
    }

    public Double getAverageCostPerThousandImpressions() {
        return averageCostPerThousandImpressions;
    }

    public Double getAveragePosition() {
        return averagePosition;
    }

    public Integer getConversions() {
        return conversions;
    }

    public Double getCostPerConversion() {
        return costPerConversion;
    }

    void readFromRowValues(RowValues values) {
        MappingHelpers.<PerformanceData>convertToEntity(values, MAPPINGS, this);
    }

    void writeToRowValues(RowValues values) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    private boolean hasAnyValues() {
        return spend != null
                || impressions != null
                || clicks != null
                || clickThroughRate != null
                || averageCostPerClick != null
                || averageCostPerThousandImpressions != null
                || averagePosition != null
                || conversions != null
                || costPerConversion != null;
    }

    private void setSpend(Double spend) {
        this.spend = spend;
    }

    private void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    private void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    private void setClickThroughRate(Double clickThroughRate) {
        this.clickThroughRate = clickThroughRate;
    }

    private void setAverageCostPerClick(Double averageCostPerClick) {
        this.averageCostPerClick = averageCostPerClick;
    }

    private void setAverageCostPerThousandImpressions(
            Double averageCostPerThousandImpressions) {
        this.averageCostPerThousandImpressions = averageCostPerThousandImpressions;
    }

    private void setAveragePosition(Double averagePosition) {
        this.averagePosition = averagePosition;
    }

    private void setConversions(Integer conversions) {
        this.conversions = conversions;
    }

    private void setCostPerConversion(Double costPerConversion) {
        this.costPerConversion = costPerConversion;
    }
}

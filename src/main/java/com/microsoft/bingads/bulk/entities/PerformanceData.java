package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the performance data returned with bulk file entities when
 * requested
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

    private static List<BulkMapping<PerformanceData>> MAPPINGS;

    static {
        List<BulkMapping<PerformanceData>> m = new ArrayList<BulkMapping<PerformanceData>>();

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.Spend,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setSpend(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Impressions,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setImpressions(StringExtensions.nullOrInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Clicks,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setClicks(StringExtensions.nullOrInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.CTR,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setClickThroughRate(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgCPC,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAverageCostPerClick(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgCPM,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAverageCostPerThousandImpressions(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.AvgPosition,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setAveragePosition(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Integer>(StringTable.Conversions,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setConversions(StringExtensions.nullOrInteger(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<PerformanceData, Double>(StringTable.CPA,
                new BiConsumer<String, PerformanceData>() {
                    @Override
                    public void accept(String v, PerformanceData d) {
                        d.setCostPerConversion(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public static PerformanceData readFromRowValuesOrNull(RowValues values) {
        PerformanceData performanceData = new PerformanceData();

        performanceData.readFromRowValues(values);

        return performanceData.hasAnyValues() ? performanceData : null;
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

    public void readFromRowValues(RowValues values) {
        MappingHelpers.<PerformanceData>convertToEntity(values, MAPPINGS, this);
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

    public void setSpend(Double spend) {
        this.spend = spend;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public void setClickThroughRate(Double clickThroughRate) {
        this.clickThroughRate = clickThroughRate;
    }

    public void setAverageCostPerClick(Double averageCostPerClick) {
        this.averageCostPerClick = averageCostPerClick;
    }

    public void setAverageCostPerThousandImpressions(
            Double averageCostPerThousandImpressions) {
        this.averageCostPerThousandImpressions = averageCostPerThousandImpressions;
    }

    public void setAveragePosition(Double averagePosition) {
        this.averagePosition = averagePosition;
    }

    public void setConversions(Integer conversions) {
        this.conversions = conversions;
    }

    public void setCostPerConversion(Double costPerConversion) {
        this.costPerConversion = costPerConversion;
    }
}

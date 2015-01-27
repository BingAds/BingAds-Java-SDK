package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.BulkObject;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a keyword bid suggestion. 
 */
public class BulkKeywordBidSuggestion extends BulkObject {

    private String keywordText;
    private Double bid;
    private PerformanceData performanceData;

    public BulkKeywordBidSuggestion() {
        this.performanceData = new PerformanceData();
    }

    private static List<BulkMapping<BulkKeywordBidSuggestion>> MAPPINGS;

    static {
        List<BulkMapping<BulkKeywordBidSuggestion>> m = new ArrayList<BulkMapping<BulkKeywordBidSuggestion>>();

        m.add(new SimpleBulkMapping<BulkKeywordBidSuggestion, String>(StringTable.Keyword,
                new BiConsumer<String, BulkKeywordBidSuggestion>() {
                    @Override
                    public void accept(String v, BulkKeywordBidSuggestion c) {
                        c.setKeywordText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeywordBidSuggestion, Double>(StringTable.Bid,
                new BiConsumer<String, BulkKeywordBidSuggestion>() {
                    @Override
                    public void accept(String v, BulkKeywordBidSuggestion c) {
                        c.setBid(StringExtensions.parseOptional(v, new Function<String, Double>() {
                            @Override
                            public Double apply(String value) {
                                return Double.parseDouble(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        this.performanceData.readFromRowValues(values);
    }

    public String getKeywordText() {
        return keywordText;
    }

    public Double getBid() {
        return bid;
    }

    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    private void setKeywordText(String keywordText) {
        this.keywordText = keywordText;
    }

    private void setBid(Double bid) {
        this.bid = bid;
    }

    private void setPerformanceData(PerformanceData performanceData) {
        this.performanceData = performanceData;
    }
}

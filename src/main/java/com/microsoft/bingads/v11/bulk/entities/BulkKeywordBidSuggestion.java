package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.BulkObject;
import com.microsoft.bingads.v11.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a best position bid suggestion that can only be read from a bulk file by the
 * {@link BulkFileReader} when reading the corresponding {@link BulkKeyword}.
 * An instance of this class can represent a single keyword bid position, and thus one record in the bulk file.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 */
public class BulkKeywordBidSuggestion extends BulkObject {

    private String keywordText;
    private Double bid;
    private PerformanceData performanceData;

    /**
     * Initializes a new instance of the BulkKeywordBidSuggestion class.
     */
    public BulkKeywordBidSuggestion() {
        this.performanceData = new PerformanceData();
    }

    private static final List<BulkMapping<BulkKeywordBidSuggestion>> MAPPINGS;

    static {
        List<BulkMapping<BulkKeywordBidSuggestion>> m = new ArrayList<BulkMapping<BulkKeywordBidSuggestion>>();

        m.add(new SimpleBulkMapping<BulkKeywordBidSuggestion, String>(StringTable.Keyword,
                new Function<BulkKeywordBidSuggestion, String>() {
                    @Override
                    public String apply(BulkKeywordBidSuggestion t) {
                        return t.getKeywordText();
                    }
                },
                new BiConsumer<String, BulkKeywordBidSuggestion>() {
                    @Override
                    public void accept(String v, BulkKeywordBidSuggestion c) {
                        c.setKeywordText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeywordBidSuggestion, Double>(StringTable.Bid,
                new Function<BulkKeywordBidSuggestion, Double>() {
                    @Override
                    public Double apply(BulkKeywordBidSuggestion t) {
                        return t.getBid();
                    }
                },
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

    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);

        PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
    }

    static void writeIfNotNull(BulkKeywordBidSuggestion bidSuggestion, BulkObjectWriter writer) throws IOException {
        if (bidSuggestion != null) {
            writer.writeObjectRow(bidSuggestion);
        }
    }

    /**
     * Gets the keyword corresponding to the suggested bid.
     *
     * <p>
     *     Corresponds to the 'Keyword' field in the bulk file.
     * </p>
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Gets the suggested bid for the keyword.
     *
     * <p>
     *     Corresponds to the 'Bid' field in the bulk file.
     * </p>
     */
    public Double getBid() {
        return bid;
    }

    /**
     * Gets the historical performance data corresponding to the suggested bid.
     */
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

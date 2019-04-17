package com.microsoft.bingads.v13.bulk.entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.BulkObject;
import com.microsoft.bingads.v13.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

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

    /**
     * Initializes a new instance of the BulkKeywordBidSuggestion class.
     */
    public BulkKeywordBidSuggestion() {
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
    }

    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
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


    private void setKeywordText(String keywordText) {
        this.keywordText = keywordText;
    }

    private void setBid(Double bid) {
        this.bid = bid;
    }
}

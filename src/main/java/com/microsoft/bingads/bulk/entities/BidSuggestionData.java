package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.SubmitDownloadParameters;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.internal.bulk.BulkObject;

/**
 * The best position, main line, and first page bid suggestion data corresponding to one keyword.
 * If the requested {@link SubmitDownloadParameters#getDataScope} includes BidSuggestionsData,
 * the download will include bulk records corresponding to the properties of this class.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 */
public class BidSuggestionData {

    private BulkKeywordBidSuggestion bestPosition;

    private BulkKeywordBidSuggestion mainLine;

    private BulkKeywordBidSuggestion firstPage;

    /**
     * Gets the best position bid.
     *
     * <p>
     * Represents a best position bid suggestion that is derived from {@link BulkObject} and can only be read from a bulk file by the
     * {@link BulkFileReader} when reading the corresponding {@link BulkKeyword}.
     * An instance of this class can represent a single best position bid, and thus one record in the bulk file.
     * Properties of this class and of classes that it is derived from, correspond to fields of the Keyword Best Position Bid record in a bulk file.
     * </p>
     *
     * <p>
     * For more information, see Keyword Best Position Bid at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=511557">http://go.microsoft.com/fwlink/?LinkID=511557</a>.
     * </p>
     */
    public BulkKeywordBidSuggestion getBestPosition() {
        return bestPosition;
    }

    void setBestPosition(BulkKeywordBidSuggestion bestPosition) {
        this.bestPosition = bestPosition;
    }

    /**
     * Gets the main line bid.
     *
     * <p>
     * Represents a main line bid suggestion that is derived from {@link BulkObject} and can only be read from a bulk file by the
     * {@link BulkFileReader} when reading the corresponding {@link BulkKeyword}.
     * An instance of this class can represent a single main line bid, and thus one record in the bulk file.
     * Properties of this class and of classes that it is derived from, correspond to fields of the Keyword Main Line Bid record in a bulk file.
     * </p>
     *
     * <p>
     * For more information, see Keyword Main Line Bid at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=511558">http://go.microsoft.com/fwlink/?LinkID=511558</a>.
     * </p>
     */
    public BulkKeywordBidSuggestion getMainLine() {
        return mainLine;
    }

    void setMainLine(BulkKeywordBidSuggestion mainLine) {
        this.mainLine = mainLine;
    }

    /**
     * Gets the first page bid.
     *
     * <p>
     * Represents a first page bid suggestion that is derived from {@link BulkObject} and can only be read from a bulk file by the
     * {@link BulkFileReader} when reading the corresponding {@link BulkKeyword}.
     * An instance of this class can represent a single first page bid, and thus one record in the bulk file.
     * Properties of this class and of classes that it is derived from, correspond to fields of the Keyword First Page Bid record in a bulk file.
     * </p>
     *
     * <p>
     * For more information, see Keyword First Page Bid at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=511559">http://go.microsoft.com/fwlink/?LinkID=511559</a>.
     * </p>
     */
    public BulkKeywordBidSuggestion getFirstPage() {
        return firstPage;
    }

    void setFirstPage(BulkKeywordBidSuggestion firstPage) {
        this.firstPage = firstPage;
    }
}

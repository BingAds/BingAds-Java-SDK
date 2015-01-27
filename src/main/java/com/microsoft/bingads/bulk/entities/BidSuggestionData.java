package com.microsoft.bingads.bulk.entities;

/**
 * The best position, main line, and first page bid suggestion data corresponding to one keyword.
 * If the requested SubmitDownloadParameters.DataScope includes BidSuggestionsData,
 * the download will include bulk records corresponding to the properties of this class.
 */
public class BidSuggestionData {

    private BulkKeywordBidSuggestion bestPosition;

    private BulkKeywordBidSuggestion mainLine;

    private BulkKeywordBidSuggestion firstPage;

    /**
     * Gets the best position bid.
     * @return
     */
    public BulkKeywordBidSuggestion getBestPosition() {
        return bestPosition;
    }

    void setBestPosition(BulkKeywordBidSuggestion bestPosition) {
        this.bestPosition = bestPosition;
    }

    /**
     * Gets the main line bid.
     * @return
     */
    public BulkKeywordBidSuggestion getMainLine() {
        return mainLine;
    }

    void setMainLine(BulkKeywordBidSuggestion mainLine) {
        this.mainLine = mainLine;
    }

    /**
     * Gets the first page bid.
     * @return
     */
    public BulkKeywordBidSuggestion getFirstPage() {
        return firstPage;
    }

    void setFirstPage(BulkKeywordBidSuggestion firstPage) {
        this.firstPage = firstPage;
    }
}

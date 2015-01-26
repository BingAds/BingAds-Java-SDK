package com.microsoft.bingads.bulk.entities;

public class BidSuggestionData {

    private BulkKeywordBidSuggestion bestPosition;// { get; internal set; }

    private BulkKeywordBidSuggestion mainLine;// { get; internal set; }

    private BulkKeywordBidSuggestion firstPage;// { get; internal set; }

    public BulkKeywordBidSuggestion getBestPosition() {
        return bestPosition;
    }

    public void setBestPosition(BulkKeywordBidSuggestion bestPosition) {
        this.bestPosition = bestPosition;
    }

    public BulkKeywordBidSuggestion getMainLine() {
        return mainLine;
    }

    public void setMainLine(BulkKeywordBidSuggestion mainLine) {
        this.mainLine = mainLine;
    }

    public BulkKeywordBidSuggestion getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(BulkKeywordBidSuggestion firstPage) {
        this.firstPage = firstPage;
    }
}

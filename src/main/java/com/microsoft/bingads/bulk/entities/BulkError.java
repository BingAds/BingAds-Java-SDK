package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkObject;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

/**
 * Contains bulk file error details in a separate record that corresponds to the record of a BulkEntity derived instance.
 */
public class BulkError extends BulkObject {

    private String error;

    private Integer number;

    private String editorialLocation;

    private String editorialTerm;

    private Integer editorialReasonCode;
    
    private String publisherCountries;

    @Override
    public void readFromRowValues(RowValues values) {
        String status = values.get(StringTable.Status);

        if (status != null && !status.equals(StringTable.Deleted)) {
            this.setError(values.get(StringTable.Error));

            this.setNumber(Integer.parseInt(values.get(StringTable.ErrorNumber)));

            this.setEditorialLocation(values.get(StringTable.EditorialLocation));
            
            this.setEditorialReasonCode(StringExtensions.parseOptional(values.get(StringTable.EditorialReasonCode), new Function<String, Integer>() {
                @Override
                public Integer apply(String value) {
                    return Integer.parseInt(value);
                }
            }));

            this.setEditorialTerm(values.get(StringTable.EditorialTerm));
            
            this.setPublisherCountries(values.get(StringTable.PublisherCountries));
        }
    }

    public String getError() {
        return error;
    }

    public Integer getNumber() {
        return number;
    }

    public String getEditorialLocation() {
        return editorialLocation;
    }

    public String getEditorialTerm() {
        return editorialTerm;
    }

    public Integer getEditorialReasonCode() {
        return editorialReasonCode;
    }

    public String getPublisherCountries() {
        return publisherCountries;
    }

    private void setError(String error) {
        this.error = error;
    }

    private void setNumber(Integer number) {
        this.number = number;
    }

    private void setEditorialLocation(String editorialLocation) {
        this.editorialLocation = editorialLocation;
    }

    private void setEditorialTerm(String editorialTerm) {
        this.editorialTerm = editorialTerm;
    }

    private void setEditorialReasonCode(Integer editorialReasonCode) {
        this.editorialReasonCode = editorialReasonCode;
    }

    private void setPublisherCountries(String publisherCountries) {
        this.publisherCountries = publisherCountries;
    }
}

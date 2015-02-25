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
 * Contains bulk file error details in a separate record that corresponds to the record of a BulkEntity derived instance.
 */
public class BulkError extends BulkObject {

    private String error;

    private Integer number;

    private String editorialLocation;

    private String editorialTerm;

    private Integer editorialReasonCode;
    
    private String publisherCountries;

    private BulkEntity entity;

    private static final List<BulkMapping<BulkError>> MAPPINGS;

    static {
        List<BulkMapping<BulkError>> m = new ArrayList<BulkMapping<BulkError>>();

        m.add(new SimpleBulkMapping<BulkError, String>(StringTable.Error,
                new Function<BulkError, String>() {
                    @Override
                    public String apply(BulkError c) {
                        return c.getError();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setError(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkError, Integer>(StringTable.ErrorNumber,
                new Function<BulkError, Integer>() {
                    @Override
                    public Integer apply(BulkError c) {
                        return c.getNumber();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setNumber(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkError, String>(StringTable.EditorialLocation,
                new Function<BulkError, String>() {
                    @Override
                    public String apply(BulkError c) {
                        return c.getEditorialLocation();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setEditorialLocation(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkError, Integer>(StringTable.EditorialReasonCode,
                new Function<BulkError, Integer>() {
                    @Override
                    public Integer apply(BulkError c) {
                        return c.getEditorialReasonCode();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setEditorialReasonCode(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkError, String>(StringTable.EditorialTerm,
                new Function<BulkError, String>() {
                    @Override
                    public String apply(BulkError c) {
                        return c.getEditorialTerm();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setEditorialTerm(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkError, String>(StringTable.PublisherCountries,
                new Function<BulkError, String>() {
                    @Override
                    public String apply(BulkError c) {
                        return c.getPublisherCountries();
                    }
                },
                new BiConsumer<String, BulkError>() {
                    @Override
                    public void accept(String v, BulkError c) {
                        c.setPublisherCountries(v);
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
        // Error row also contains corresponding entity data, so write the entity to RowValues first
        getEntity().writeToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
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

    public BulkEntity getEntity() {
        return entity;
    }

    public void setEntity(BulkEntity entity) {
        this.entity = entity;
    }
}

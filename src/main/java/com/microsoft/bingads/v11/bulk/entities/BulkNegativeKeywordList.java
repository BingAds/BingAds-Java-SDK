package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.NegativeKeywordList;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a negative keyword list that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkNegativeKeywordList#setNegativeKeywordList} and {@link BulkNegativeKeywordList#getNegativeKeywordList}
 * methods that can be used to read and write fields of the Negative Keyword List record in a bulk file.
 *
 * <p>
 *     For more information, see Negative Keyword List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkNegativeKeywordList extends SingleRecordBulkEntity {

    private NegativeKeywordList negativeKeywordList;

    private Status status;

    private static final List<BulkMapping<BulkNegativeKeywordList>> MAPPINGS;

    static {
        List<BulkMapping<BulkNegativeKeywordList>> m = new ArrayList<BulkMapping<BulkNegativeKeywordList>>();

        m.add(new SimpleBulkMapping<BulkNegativeKeywordList, Long>(StringTable.Id,
                new Function<BulkNegativeKeywordList, Long>() {
                    @Override
                    public Long apply(BulkNegativeKeywordList c) {
                        return c.getNegativeKeywordList().getId();
                    }
                },
                new BiConsumer<String, BulkNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkNegativeKeywordList c) {
                        c.getNegativeKeywordList().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeywordList, String>(StringTable.Status,
                new Function<BulkNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkNegativeKeywordList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkNegativeKeywordList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeywordList, String>(StringTable.Name,
                new Function<BulkNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkNegativeKeywordList c) {
                        return c.getNegativeKeywordList().getName();
                    }
                },
                new BiConsumer<String, BulkNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkNegativeKeywordList c) {
                        c.getNegativeKeywordList().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setNegativeKeywordList(new NegativeKeywordList());
        
        this.getNegativeKeywordList().setType("NegativeKeywordList");

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeKeywordList(), "NegativeKeywordList");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the negative keyword list.
     */
    public NegativeKeywordList getNegativeKeywordList() {
        return negativeKeywordList;
    }

    /**
     * Sets the negative keyword list.
     */
    public void setNegativeKeywordList(NegativeKeywordList negativeKeywordList) {
        this.negativeKeywordList = negativeKeywordList;
    }

    /**
     * Gets the status of the negative keyword list.
     *
     * <p>
     *     The value is Active if the negative keyword list is available in the account's shared library.
     *     The value is Deleted if the negative keyword list is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the negative keyword list.
     *
     * <p>
     *     The value is Active if the negative keyword list is available in the account's shared library.
     *     The value is Deleted if the negative keyword list is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

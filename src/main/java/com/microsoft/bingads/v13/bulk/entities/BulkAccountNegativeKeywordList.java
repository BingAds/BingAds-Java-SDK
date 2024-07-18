package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AccountNegativeKeywordList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an account negative keyword list that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkAccountNegativeKeywordList#setAccountNegativeKeywordList} and {@link BulkAccountNegativeKeywordList#getAccountNegativeKeywordList}
 * methods that can be used to read and write fields of the Negative Keyword List record in a bulk file.
 *
 * <p>
 *     For more information, see Account Negative Keyword List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountNegativeKeywordList extends SingleRecordBulkEntity {

    private AccountNegativeKeywordList AccountNegativeKeywordList;

    private Status status;

    private static final List<BulkMapping<BulkAccountNegativeKeywordList>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountNegativeKeywordList>> m = new ArrayList<BulkMapping<BulkAccountNegativeKeywordList>>();

        m.add(new SimpleBulkMapping<BulkAccountNegativeKeywordList, Long>(StringTable.Id,
                new Function<BulkAccountNegativeKeywordList, Long>() {
                    @Override
                    public Long apply(BulkAccountNegativeKeywordList c) {
                        return c.getAccountNegativeKeywordList().getId();
                    }
                },
                new BiConsumer<String, BulkAccountNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountNegativeKeywordList c) {
                        c.getAccountNegativeKeywordList().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountNegativeKeywordList, String>(StringTable.Status,
                new Function<BulkAccountNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkAccountNegativeKeywordList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountNegativeKeywordList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountNegativeKeywordList, String>(StringTable.Name,
                new Function<BulkAccountNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkAccountNegativeKeywordList c) {
                        return c.getAccountNegativeKeywordList().getName();
                    }
                },
                new BiConsumer<String, BulkAccountNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountNegativeKeywordList c) {
                        c.getAccountNegativeKeywordList().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAccountNegativeKeywordList(new AccountNegativeKeywordList());
        
        this.getAccountNegativeKeywordList().setType("AccountNegativeKeywordList");

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAccountNegativeKeywordList(), "AccountNegativeKeywordList");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the account negative keyword list.
     */
    public AccountNegativeKeywordList getAccountNegativeKeywordList() {
        return AccountNegativeKeywordList;
    }

    /**
     * Sets the account negative keyword list.
     */
    public void setAccountNegativeKeywordList(AccountNegativeKeywordList AccountNegativeKeywordList) {
        this.AccountNegativeKeywordList = AccountNegativeKeywordList;
    }

    /**
     * Gets the status of the account negative keyword list.
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
     * Sets the status of the account negative keyword list.
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

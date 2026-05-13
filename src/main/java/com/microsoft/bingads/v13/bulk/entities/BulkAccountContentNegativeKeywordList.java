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
import com.microsoft.bingads.v13.campaignmanagement.AccountContentNegativeKeywordList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an account content negative keyword list that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkAccountContentNegativeKeywordList#setAccountContentNegativeKeywordList} and
 * {@link BulkAccountContentNegativeKeywordList#getAccountContentNegativeKeywordList}
 * methods that can be used to read and write fields of the Account Content Negative Keyword List record in a bulk file.
 *
 * <p>
 *     For more information, see Account Content Negative Keyword List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountContentNegativeKeywordList extends SingleRecordBulkEntity {

    private AccountContentNegativeKeywordList accountContentNegativeKeywordList;

    private Status status;

    private static final List<BulkMapping<BulkAccountContentNegativeKeywordList>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountContentNegativeKeywordList>> m = new ArrayList<BulkMapping<BulkAccountContentNegativeKeywordList>>();

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordList, Long>(StringTable.Id,
                new Function<BulkAccountContentNegativeKeywordList, Long>() {
                    @Override
                    public Long apply(BulkAccountContentNegativeKeywordList c) {
                        return c.getAccountContentNegativeKeywordList().getId();
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordList c) {
                        c.getAccountContentNegativeKeywordList().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordList, String>(StringTable.Status,
                new Function<BulkAccountContentNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkAccountContentNegativeKeywordList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountContentNegativeKeywordList, String>(StringTable.Name,
                new Function<BulkAccountContentNegativeKeywordList, String>() {
                    @Override
                    public String apply(BulkAccountContentNegativeKeywordList c) {
                        return c.getAccountContentNegativeKeywordList().getName();
                    }
                },
                new BiConsumer<String, BulkAccountContentNegativeKeywordList>() {
                    @Override
                    public void accept(String v, BulkAccountContentNegativeKeywordList c) {
                        c.getAccountContentNegativeKeywordList().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAccountContentNegativeKeywordList(new AccountContentNegativeKeywordList());

        this.getAccountContentNegativeKeywordList().setType("AccountContentNegativeKeywordList");

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAccountContentNegativeKeywordList(), "AccountContentNegativeKeywordList");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the account content negative keyword list.
     */
    public AccountContentNegativeKeywordList getAccountContentNegativeKeywordList() {
        return accountContentNegativeKeywordList;
    }

    /**
     * Sets the account content negative keyword list.
     */
    public void setAccountContentNegativeKeywordList(AccountContentNegativeKeywordList accountContentNegativeKeywordList) {
        this.accountContentNegativeKeywordList = accountContentNegativeKeywordList;
    }

    /**
     * Gets the status of the account content negative keyword list.
     *
     * <p>
     *     The value is Active if the account content negative keyword list is available in the account's shared library.
     *     The value is Deleted if the account content negative keyword list is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the account content negative keyword list.
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

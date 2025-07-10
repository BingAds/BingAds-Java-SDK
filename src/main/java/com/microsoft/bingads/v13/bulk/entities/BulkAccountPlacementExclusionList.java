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
import com.microsoft.bingads.v13.campaignmanagement.AccountPlacementExclusionList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Account Placement Exclusion List.
 * <p/>
 * <p>
 * This class exposes the {@link #setAccountPlacementExclusionList} and {@link #getAccountPlacementExclusionList} that can be used to read and write
 * fields of the Account Placement Exclusion List record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Account Placement Exclusion List at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountPlacementExclusionList extends SingleRecordBulkEntity {

    private Status status;

    private AccountPlacementExclusionList accountPlacementExclusionList;

    private static final List<BulkMapping<BulkAccountPlacementExclusionList>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountPlacementExclusionList>> m = new ArrayList<BulkMapping<BulkAccountPlacementExclusionList>>();

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionList, Long>(StringTable.Id,
                new Function<BulkAccountPlacementExclusionList, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementExclusionList c) {
                        return c.getAccountPlacementExclusionList().getId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionList c) {
                        c.getAccountPlacementExclusionList().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionList, String>(StringTable.Status,
                new Function<BulkAccountPlacementExclusionList, String>() {
                    @Override
                    public String apply(BulkAccountPlacementExclusionList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementExclusionList, String>(StringTable.Name,
                new Function<BulkAccountPlacementExclusionList, String>() {
                    @Override
                    public String apply(BulkAccountPlacementExclusionList c) {
                        return c.getAccountPlacementExclusionList().getName();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementExclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementExclusionList c) {
                        c.getAccountPlacementExclusionList().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAccountPlacementExclusionList(new AccountPlacementExclusionList());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAccountPlacementExclusionList(), "AccountPlacementExclusionList");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }


    /**
     * Gets the status of the exclusion list.
     * <p/>
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the exclusion list.
     * <p/>
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the AccountPlacementExclusionList Data Object of the Campaign Management Service.
     */
    public AccountPlacementExclusionList getAccountPlacementExclusionList() {
        return accountPlacementExclusionList;
    }

    /**
     * Sets the AccountPlacementExclusionList Data Object of the Campaign Management Service.
     */
    public void setAccountPlacementExclusionList(AccountPlacementExclusionList accountPlacementExclusionList) {
        this.accountPlacementExclusionList = accountPlacementExclusionList;
    }
}

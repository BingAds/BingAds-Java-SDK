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
import com.microsoft.bingads.v13.campaignmanagement.AccountPlacementInclusionList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Account Placement Inclusion List.
 * <p/>
 * <p>
 * This class exposes the {@link #setAccountPlacementInclusionList} and {@link #getAccountPlacementInclusionList} that can be used to read and write
 * fields of the Account Placement Inclusion List record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Account Placement Inclusion List at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAccountPlacementInclusionList extends SingleRecordBulkEntity {

    private Status status;

    private AccountPlacementInclusionList accountPlacementInclusionList;

    private static final List<BulkMapping<BulkAccountPlacementInclusionList>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccountPlacementInclusionList>> m = new ArrayList<BulkMapping<BulkAccountPlacementInclusionList>>();

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionList, Long>(StringTable.Id,
                new Function<BulkAccountPlacementInclusionList, Long>() {
                    @Override
                    public Long apply(BulkAccountPlacementInclusionList c) {
                        return c.getAccountPlacementInclusionList().getId();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionList c) {
                        c.getAccountPlacementInclusionList().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionList, String>(StringTable.Status,
                new Function<BulkAccountPlacementInclusionList, String>() {
                    @Override
                    public String apply(BulkAccountPlacementInclusionList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccountPlacementInclusionList, String>(StringTable.Name,
                new Function<BulkAccountPlacementInclusionList, String>() {
                    @Override
                    public String apply(BulkAccountPlacementInclusionList c) {
                        return c.getAccountPlacementInclusionList().getName();
                    }
                },
                new BiConsumer<String, BulkAccountPlacementInclusionList>() {
                    @Override
                    public void accept(String v, BulkAccountPlacementInclusionList c) {
                        c.getAccountPlacementInclusionList().setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAccountPlacementInclusionList(new AccountPlacementInclusionList());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAccountPlacementInclusionList(), "AccountPlacementInclusionList");

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
     * Gets the AccountPlacementInclusionList Data Object of the Campaign Management Service.
     */
    public AccountPlacementInclusionList getAccountPlacementInclusionList() {
        return accountPlacementInclusionList;
    }

    /**
     * Sets the AccountPlacementInclusionList Data Object of the Campaign Management Service.
     */
    public void setAccountPlacementInclusionList(AccountPlacementInclusionList accountPlacementInclusionList) {
        this.accountPlacementInclusionList = accountPlacementInclusionList;
    }
}

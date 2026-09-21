package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.CompanyName;
import com.microsoft.bingads.v13.campaignmanagement.CompanyNameStatus;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a company item that can be read or written in a bulk file.
 */
public class BulkCompanyItem extends SingleRecordBulkEntity {

    private Long companyListId;
    private CompanyName companyItem;

    private static final List<BulkMapping<BulkCompanyItem>> MAPPINGS;

    static {
        List<BulkMapping<BulkCompanyItem>> m = new ArrayList<BulkMapping<BulkCompanyItem>>();

        m.add(new SimpleBulkMapping<BulkCompanyItem, String>(StringTable.Status,
                new Function<BulkCompanyItem, String>() {
                    @Override
                    public String apply(BulkCompanyItem c) {
                        return c.getCompanyItem().getStatus() != null
                                ? c.getCompanyItem().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCompanyItem>() {
                    @Override
                    public void accept(String v, BulkCompanyItem c) {
                        c.getCompanyItem().setStatus(StringExtensions.parseOptional(v,
                                new Function<String, CompanyNameStatus>() {
                                    @Override
                                    public CompanyNameStatus apply(String value) {
                                        return CompanyNameStatus.fromValue(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyItem, Long>(StringTable.Id,
                new Function<BulkCompanyItem, Long>() {
                    @Override
                    public Long apply(BulkCompanyItem c) {
                        return c.getCompanyItem().getId();
                    }
                },
                new BiConsumer<String, BulkCompanyItem>() {
                    @Override
                    public void accept(String v, BulkCompanyItem c) {
                        c.getCompanyItem().setId(StringExtensions.nullOrLong(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyItem, Long>(StringTable.ParentId,
                new Function<BulkCompanyItem, Long>() {
                    @Override
                    public Long apply(BulkCompanyItem c) {
                        return c.getCompanyListId();
                    }
                },
                new BiConsumer<String, BulkCompanyItem>() {
                    @Override
                    public void accept(String v, BulkCompanyItem c) {
                        c.setCompanyListId(StringExtensions.nullOrLong(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyItem, String>(StringTable.CompanyName,
                new Function<BulkCompanyItem, String>() {
                    @Override
                    public String apply(BulkCompanyItem c) {
                        return c.getCompanyItem().getName();
                    }
                },
                new BiConsumer<String, BulkCompanyItem>() {
                    @Override
                    public void accept(String v, BulkCompanyItem c) {
                        c.getCompanyItem().setName(v);
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setCompanyItem(new CompanyName());
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCompanyItem(), "CompanyItem");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public Long getCompanyListId() {
        return companyListId;
    }

    public void setCompanyListId(Long companyListId) {
        this.companyListId = companyListId;
    }

    public CompanyName getCompanyItem() {
        return companyItem;
    }

    public void setCompanyItem(CompanyName companyItem) {
        this.companyItem = companyItem;
    }
}

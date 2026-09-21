package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.CompanyList;
import com.microsoft.bingads.v13.campaignmanagement.LinkedInSegmentStatus;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a company list that can be read or written in a bulk file.
 */
public class BulkCompanyList extends SingleRecordBulkEntity {

    private Long accountId;
    private Long audienceSize;
    private CompanyList companyList;

    private static final List<BulkMapping<BulkCompanyList>> MAPPINGS;

    static {
        List<BulkMapping<BulkCompanyList>> m = new ArrayList<BulkMapping<BulkCompanyList>>();

        m.add(new SimpleBulkMapping<BulkCompanyList, String>(StringTable.Status,
                new Function<BulkCompanyList, String>() {
                    @Override
                    public String apply(BulkCompanyList c) {
                        return c.getCompanyList().getStatus() != null
                                ? c.getCompanyList().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCompanyList>() {
                    @Override
                    public void accept(String v, BulkCompanyList c) {
                        c.getCompanyList().setStatus(StringExtensions.parseOptional(v,
                                new Function<String, LinkedInSegmentStatus>() {
                                    @Override
                                    public LinkedInSegmentStatus apply(String value) {
                                        return LinkedInSegmentStatus.fromValue(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyList, Long>(StringTable.Id,
                new Function<BulkCompanyList, Long>() {
                    @Override
                    public Long apply(BulkCompanyList c) {
                        return c.getCompanyList().getId();
                    }
                },
                new BiConsumer<String, BulkCompanyList>() {
                    @Override
                    public void accept(String v, BulkCompanyList c) {
                        c.getCompanyList().setId(StringExtensions.nullOrLong(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyList, Long>(StringTable.ParentId,
                new Function<BulkCompanyList, Long>() {
                    @Override
                    public Long apply(BulkCompanyList c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkCompanyList>() {
                    @Override
                    public void accept(String v, BulkCompanyList c) {
                        c.setAccountId(StringExtensions.nullOrLong(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyList, String>(StringTable.Name,
                new Function<BulkCompanyList, String>() {
                    @Override
                    public String apply(BulkCompanyList c) {
                        return c.getCompanyList().getName();
                    }
                },
                new BiConsumer<String, BulkCompanyList>() {
                    @Override
                    public void accept(String v, BulkCompanyList c) {
                        c.getCompanyList().setName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCompanyList, Long>(StringTable.AudienceSize,
                new Function<BulkCompanyList, Long>() {
                    @Override
                    public Long apply(BulkCompanyList c) {
                        return c.getAudienceSize();
                    }
                },
                new BiConsumer<String, BulkCompanyList>() {
                    @Override
                    public void accept(String v, BulkCompanyList c) {
                        c.setAudienceSize(StringExtensions.nullOrLong(v));
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setCompanyList(new CompanyList());
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCompanyList(), "CompanyList");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAudienceSize() {
        return audienceSize;
    }

    public void setAudienceSize(Long audienceSize) {
        this.audienceSize = audienceSize;
    }

    public CompanyList getCompanyList() {
        return companyList;
    }

    public void setCompanyList(CompanyList companyList) {
        this.companyList = companyList;
    }
}

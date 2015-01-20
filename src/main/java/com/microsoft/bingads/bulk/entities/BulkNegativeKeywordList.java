package com.microsoft.bingads.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.campaignmanagement.NegativeKeywordList;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

public class BulkNegativeKeywordList extends SingleRecordBulkEntity {

    public NegativeKeywordList negativeKeywordList;
    public Status status;

    private static List<BulkMapping<BulkNegativeKeywordList>> MAPPINGS;

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
                        c.setStatus(Status.valueOf(v.toUpperCase()));
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
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getNegativeKeywordList(), "NegativeKeywordList");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public NegativeKeywordList getNegativeKeywordList() {
        return negativeKeywordList;
    }

    public void setNegativeKeywordList(NegativeKeywordList negativeKeywordList) {
        this.negativeKeywordList = negativeKeywordList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

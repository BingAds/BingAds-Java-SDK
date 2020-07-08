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
import com.microsoft.bingads.v13.campaignmanagement.RemarketingList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a remarketing list that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkRemarketingList#setRemarketingList} and {@link BulkRemarketingList#getRemarketingList}
 * methods that can be used to read and write fields of the Remarketing List record in a bulk file.
 *
 * <p>
 *     For more information, see Remarketing List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkRemarketingList extends BulkAudience<RemarketingList> {


    private static final List<BulkMapping<BulkRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkRemarketingList>> m = new ArrayList<BulkMapping<BulkRemarketingList>>();

        
        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.TagId,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getTagId();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setTagId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.RemarketingRule,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return StringExtensions.toRemarketingRuleBulkString(c.getRemarketingList().getRule());
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setRule(StringExtensions.parseRemarketingRule(v));
                    }
                }
        ));
		

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the remarketing list.
     */
    public RemarketingList getRemarketingList() {
        return this.getAudience();
    }

    /**
     * Sets the remarketing list.
     */
    public void setRemarketingList(RemarketingList remarketingList) {
        this.setAudience(remarketingList);
    }

    @Override
    public RemarketingList createAudience() {
        return new RemarketingList();
    }

}

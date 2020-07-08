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
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;
import com.microsoft.bingads.v13.campaignmanagement.SimilarRemarketingList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Similar Remarketing List that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkSimilarRemarketingList#setRemarketingList} and {@link BulkSimilarRemarketingList#getRemarketingList}
 * methods that can be used to read and write fields of the Similar Remarketing List record in a bulk file.
 *
 * <p>
 *     For more information, see Similar Remarketing List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSimilarRemarketingList extends BulkAudience<SimilarRemarketingList> {


    private static final List<BulkMapping<BulkSimilarRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkSimilarRemarketingList>> m = new ArrayList<BulkMapping<BulkSimilarRemarketingList>>();

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.SourceId,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getSourceId();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setSourceId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
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
     * Gets the similar remarketing list.
     */
    public SimilarRemarketingList getSimilarRemarketingList() {
        return this.getAudience();
    }

    /**
     * Sets the similar remarketing list.
     */
    public void setSimilarRemarketingList(SimilarRemarketingList remarketingList) {
        this.setAudience(remarketingList);
    }

    @Override
    public SimilarRemarketingList createAudience() {
        return new SimilarRemarketingList();
    }

}

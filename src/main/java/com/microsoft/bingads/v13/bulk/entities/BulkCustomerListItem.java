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
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Customer List Item that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkCustomerListItem#setCustomerList} and {@link BulkCustomerListItem#getCustomerList}
 * methods that can be used to read and write fields of the Customer List Item record in a bulk file.
 *
 * <p>
 * For more information, see Customer List Item at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCustomerListItem extends SingleRecordBulkEntity {

    private Long parentId;

    private String audience;

    private String subType;

    private String text;

    private static final List<BulkMapping<BulkCustomerListItem>> MAPPINGS;

    static {
        List<BulkMapping<BulkCustomerListItem>> m = new ArrayList<BulkMapping<BulkCustomerListItem>>();

        m.add(new SimpleBulkMapping<BulkCustomerListItem, Long>(StringTable.ParentId, new Function<BulkCustomerListItem, Long>() {
            @Override
            public Long apply(BulkCustomerListItem c) {
                return c.getParentId();
            }
        }, new BiConsumer<String, BulkCustomerListItem>() {
            @Override
            public void accept(String v, BulkCustomerListItem c) {
                c.setParentId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                    @Override
                    public Long apply(String value) {
                        return Long.parseLong(value);
                    }
                }));
            }
        }));

        m.add(new SimpleBulkMapping<BulkCustomerListItem, String>(StringTable.Audience, new Function<BulkCustomerListItem, String>() {
            @Override
            public String apply(BulkCustomerListItem c) {
                return c.getAudience();
            }
        }, new BiConsumer<String, BulkCustomerListItem>() {
            @Override
            public void accept(String v, BulkCustomerListItem c) {
                c.setAudience(v);
            }
        }));

        m.add(new SimpleBulkMapping<BulkCustomerListItem, String>(StringTable.SubType, new Function<BulkCustomerListItem, String>() {
            @Override
            public String apply(BulkCustomerListItem c) {
                return c.getSubType();
            }
        }, new BiConsumer<String, BulkCustomerListItem>() {
            @Override
            public void accept(String v, BulkCustomerListItem c) {
                c.setSubType(v);
            }
        }));

        m.add(new SimpleBulkMapping<BulkCustomerListItem, String>(StringTable.Text, new Function<BulkCustomerListItem, String>() {
            @Override
            public String apply(BulkCustomerListItem c) {
                return c.getText();
            }
        }, new BiConsumer<String, BulkCustomerListItem>() {
            @Override
            public void accept(String v, BulkCustomerListItem c) {
                c.setText(v);
            }
        }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkCustomerListItem>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

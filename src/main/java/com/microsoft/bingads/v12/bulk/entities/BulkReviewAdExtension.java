package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.ReviewAdExtension;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a review ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Review Ad Extension record in a
 * bulk file.
 * <p/>
 * For more information, see review Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkReviewAdExtension extends BulkAdExtension<ReviewAdExtension> {

    /**
     * Gets the review ad extension.
     */
    public ReviewAdExtension getReviewAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the review ad extension.
     */
    public void setReviewAdExtension(ReviewAdExtension reviewAdExtension) {
        setAdExtension(reviewAdExtension);
    }

    private static final List<BulkMapping<BulkReviewAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkReviewAdExtension>> m = new ArrayList<BulkMapping<BulkReviewAdExtension>>();

        m.add(new SimpleBulkMapping<BulkReviewAdExtension, String>(
                StringTable.IsExact,
                new Function<BulkReviewAdExtension, String>() {
                    @Override
                    public String apply(BulkReviewAdExtension c) {
                        return StringExtensions.toBooleanBulkString(c.getAdExtension().getIsExact());
                    }
                },
                new BiConsumer<String, BulkReviewAdExtension>() {
                    @Override
                    public void accept(String v, BulkReviewAdExtension c) {
                        c.getReviewAdExtension().setIsExact(Boolean.parseBoolean(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkReviewAdExtension, String>(
                StringTable.Text,
                new Function<BulkReviewAdExtension, String>() {
                    @Override
                    public String apply(BulkReviewAdExtension c) {
                        return c.getAdExtension().getText();
                    }
                },
                new BiConsumer<String, BulkReviewAdExtension>() {
                    @Override
                    public void accept(String v, BulkReviewAdExtension c) {
                        c.getReviewAdExtension().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkReviewAdExtension, String>(
                StringTable.Source,
                new Function<BulkReviewAdExtension, String>() {
                    @Override
                    public String apply(BulkReviewAdExtension c) {
                        return c.getAdExtension().getSource();
                    }
                },
                new BiConsumer<String, BulkReviewAdExtension>() {
                    @Override
                    public void accept(String v, BulkReviewAdExtension c) {
                        c.getReviewAdExtension().setSource(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkReviewAdExtension, String>(
                StringTable.Url,
                new Function<BulkReviewAdExtension, String>() {
                    @Override
                    public String apply(BulkReviewAdExtension c) {
                        return c.getAdExtension().getUrl();
                    }
                },
                new BiConsumer<String, BulkReviewAdExtension>() {
                    @Override
                    public void accept(String v, BulkReviewAdExtension c) {
                        c.getReviewAdExtension().setUrl(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        ReviewAdExtension extension = new ReviewAdExtension();

        extension.setType("ReviewAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getReviewAdExtension(), "ReviewAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

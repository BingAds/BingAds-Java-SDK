package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProductScope;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.*;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a Campaign Criterion that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setCampaignCriterion} and {@link #getCampaignCriterion} methods
 * that can be used to read and write fields of the Campaign Product Scope record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Campaign Product Scope at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignProductScope extends SingleRecordBulkEntity {

    private BiddableCampaignCriterion biddableCampaignCriterion;

    private String campaignName;

    private Status status;

    private static final List<BulkMapping<BulkCampaignProductScope>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignProductScope>> m = new ArrayList<BulkMapping<BulkCampaignProductScope>>();

        m.add(new SimpleBulkMapping<BulkCampaignProductScope, String>(StringTable.Status,
                new Function<BulkCampaignProductScope, String>() {
                    @Override
                    public String apply(BulkCampaignProductScope c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignProductScope>() {
                    @Override
                    public void accept(String v, BulkCampaignProductScope c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignProductScope, Long>(StringTable.Id,
                new Function<BulkCampaignProductScope, Long>() {
                    @Override
                    public Long apply(BulkCampaignProductScope c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignProductScope>() {
                    @Override
                    public void accept(String v, BulkCampaignProductScope c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignProductScope, Long>(StringTable.ParentId,
                new Function<BulkCampaignProductScope, Long>() {
                    @Override
                    public Long apply(BulkCampaignProductScope c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignProductScope>() {
                    @Override
                    public void accept(String v, BulkCampaignProductScope c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignProductScope, String>(StringTable.Campaign,
                new Function<BulkCampaignProductScope, String>() {
                    @Override
                    public String apply(BulkCampaignProductScope c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignProductScope>() {
                    @Override
                    public void accept(String v, BulkCampaignProductScope c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkCampaignProductScope>(
                new BiConsumer<BulkCampaignProductScope, RowValues>() {
                    @Override
                    public void accept(BulkCampaignProductScope c, RowValues v) {
                        ProductScope product = (ProductScope) c.getBiddableCampaignCriterion().getCriterion();

                        if (product == null || product.getConditions() == null) {
                            return;
                        }

                        ProductConditionHelper.addRowValuesFromConditions(product.getConditions(), v);
                    }
                },
                new BiConsumer<RowValues, BulkCampaignProductScope>() {
                    @Override
                    public void accept(RowValues v, BulkCampaignProductScope c) {
                        ProductScope product = (ProductScope) c.getBiddableCampaignCriterion().getCriterion();
                        product.setConditions(new ArrayOfProductCondition());

                        ProductConditionHelper.addConditionsFromRowValues(v, product.getConditions());
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();

    	biddableCampaignCriterion.setCriterion(new ProductScope());

    	biddableCampaignCriterion.setType(BiddableCampaignCriterion.class.getSimpleName());

    	biddableCampaignCriterion.getCriterion().setType(ProductScope.class.getSimpleName());

    	setBiddableCampaignCriterion(biddableCampaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion biddableCampaignCriterion) {
        this.biddableCampaignCriterion = biddableCampaignCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the status of the Campaign Criterion.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the Campaign Criterion.
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

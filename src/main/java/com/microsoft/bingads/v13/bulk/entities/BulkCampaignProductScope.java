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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.ProductScope;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

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

    private static final List<BulkMapping<BulkCampaignProductScope>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignProductScope>> m = new ArrayList<BulkMapping<BulkCampaignProductScope>>();

        m.add(new SimpleBulkMapping<BulkCampaignProductScope, String>(StringTable.Status,
                new Function<BulkCampaignProductScope, String>() {
                    @Override
                    public String apply(BulkCampaignProductScope c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignProductScope>() {
                    @Override
                    public void accept(String v, BulkCampaignProductScope c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return StringExtensions.fromValueOptional(s, CampaignCriterionStatus.class);
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
                        c.getBiddableCampaignCriterion().setCampaignId(StringExtensions.nullOrLong(v));
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
}

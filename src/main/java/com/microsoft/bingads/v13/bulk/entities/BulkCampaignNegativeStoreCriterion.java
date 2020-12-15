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
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.StoreCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative store criterion that is assigned to a campaign. Each negative store criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Store Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeStoreCriterion extends SingleRecordBulkEntity {
	
	private NegativeCampaignCriterion negativeCampaignCriterion;
	
	private Status status; 
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignNegativeStoreCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeStoreCriterion>> m = new ArrayList<BulkMapping<BulkCampaignNegativeStoreCriterion>>();

        m.add(new SimpleBulkMapping<BulkCampaignNegativeStoreCriterion, String>(StringTable.Status,
                new Function<BulkCampaignNegativeStoreCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeStoreCriterion c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeStoreCriterion c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeStoreCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeStoreCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeStoreCriterion c) {
                        return c.getNegativeCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeStoreCriterion c) {
                        c.getNegativeCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeStoreCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeStoreCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeStoreCriterion c) {
                        return c.getNegativeCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeStoreCriterion c) {
                        c.getNegativeCampaignCriterion().setCampaignId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeStoreCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignNegativeStoreCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeStoreCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeStoreCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkCampaignNegativeStoreCriterion, Long>(StringTable.MerchantCenterId,
                new Function<BulkCampaignNegativeStoreCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeStoreCriterion c) {
                        if (c.getNegativeCampaignCriterion().getCriterion() instanceof StoreCriterion) {
                            return ((StoreCriterion) c.getNegativeCampaignCriterion().getCriterion()).getStoreId();
                        }
                        return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeStoreCriterion c) {
                        Long storeId = StringExtensions.nullOrLong(v);
                        if (c.getNegativeCampaignCriterion().getCriterion() instanceof StoreCriterion && storeId != null) {
                            ((StoreCriterion) c.getNegativeCampaignCriterion().getCriterion()).setStoreId(storeId);
                        }
                    }
                }
        ));
       

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
    	
    	StoreCriterion criterion = new StoreCriterion();

    	negativeCampaignCriterion.setCriterion(criterion);
    	negativeCampaignCriterion.setType(NegativeCampaignCriterion.class.getSimpleName());
    	negativeCampaignCriterion.getCriterion().setType(StoreCriterion.class.getSimpleName());

        setNegativeCampaignCriterion(negativeCampaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeCampaignCriterion(), NegativeCampaignCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Negative Campaign Criterion.
     */
    public NegativeCampaignCriterion getNegativeCampaignCriterion() {
        return negativeCampaignCriterion;
    }

    /**
     * Sets a Negative Campaign Criterion
     */
    public void setNegativeCampaignCriterion(NegativeCampaignCriterion negativeCampaignCriterion) {
        this.negativeCampaignCriterion = negativeCampaignCriterion;
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
     * Gets the status of the Negative Campaign Criterion.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the Negative Campaign Criterion.
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

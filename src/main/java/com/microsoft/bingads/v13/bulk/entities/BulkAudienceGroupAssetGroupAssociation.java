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
import com.microsoft.bingads.v13.campaignmanagement.AudienceGroupAssetGroupAssociation;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Audience Group Asset Group Association.
 * <p/>
 * <p>
 * This class exposes the {@link #setAudienceGroupAssetGroupAssociation} and {@link #getAudienceGroupAssetGroupAssociation} that can be used to read and write
 * fields of the Audience Group Asset Group Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Audience Group Asset Group Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAudienceGroupAssetGroupAssociation extends SingleRecordBulkEntity {

    private Status status;
    
    private String assetGroupName;
    
    private String campaignName;
    
    private AudienceGroupAssetGroupAssociation audienceGroupAssetGroupAssociation;

    private static final List<BulkMapping<BulkAudienceGroupAssetGroupAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAudienceGroupAssetGroupAssociation>> m = new ArrayList<BulkMapping<BulkAudienceGroupAssetGroupAssociation>>();

        m.add(new SimpleBulkMapping<BulkAudienceGroupAssetGroupAssociation, String>(StringTable.Status,
                new Function<BulkAudienceGroupAssetGroupAssociation, String>() {
                    @Override
                    public String apply(BulkAudienceGroupAssetGroupAssociation c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAudienceGroupAssetGroupAssociation>() {
                    @Override
                    public void accept(String v, BulkAudienceGroupAssetGroupAssociation c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudienceGroupAssetGroupAssociation, Long>(StringTable.Id,
                new Function<BulkAudienceGroupAssetGroupAssociation, Long>() {
                    @Override
                    public Long apply(BulkAudienceGroupAssetGroupAssociation c) {
                        return c.getAudienceGroupAssetGroupAssociation().getAudienceGroupId();
                    }
                },
                new BiConsumer<String, BulkAudienceGroupAssetGroupAssociation>() {
                    @Override
                    public void accept(String v, BulkAudienceGroupAssetGroupAssociation c) {
                        c.getAudienceGroupAssetGroupAssociation().setAudienceGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroupAssetGroupAssociation, Long>(StringTable.ParentId,
                new Function<BulkAudienceGroupAssetGroupAssociation, Long>() {
                    @Override
                    public Long apply(BulkAudienceGroupAssetGroupAssociation c) {
                        return c.getAudienceGroupAssetGroupAssociation().getAssetGroupId();
                    }
                },
                new BiConsumer<String, BulkAudienceGroupAssetGroupAssociation>() {
                    @Override
                    public void accept(String v, BulkAudienceGroupAssetGroupAssociation c) {
                        c.getAudienceGroupAssetGroupAssociation().setAssetGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroupAssetGroupAssociation, String>(StringTable.AssetGroup,
                new Function<BulkAudienceGroupAssetGroupAssociation, String>() {
                    @Override
                    public String apply(BulkAudienceGroupAssetGroupAssociation c) {
                        return c.getAssetGroupName();
                    }
                },
                new BiConsumer<String, BulkAudienceGroupAssetGroupAssociation>() {
                    @Override
                    public void accept(String v, BulkAudienceGroupAssetGroupAssociation c) {
                        c.setAssetGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroupAssetGroupAssociation, String>(StringTable.Campaign,
                new Function<BulkAudienceGroupAssetGroupAssociation, String>() {
                    @Override
                    public String apply(BulkAudienceGroupAssetGroupAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAudienceGroupAssetGroupAssociation>() {
                    @Override
                    public void accept(String v, BulkAudienceGroupAssetGroupAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAudienceGroupAssetGroupAssociation(new AudienceGroupAssetGroupAssociation());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAudienceGroupAssetGroupAssociation(), "AudienceGroupAssetGroupAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public AudienceGroupAssetGroupAssociation getAudienceGroupAssetGroupAssociation() {
        return audienceGroupAssetGroupAssociation;
    }

    public void setAudienceGroupAssetGroupAssociation(AudienceGroupAssetGroupAssociation audienceGroupAssetGroupAssociation) {
        this.audienceGroupAssetGroupAssociation = audienceGroupAssetGroupAssociation;
    }
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getAssetGroupName() {
		return assetGroupName;
	}
	
	public void setAssetGroupName(String assetGroupName) {
		this.assetGroupName = assetGroupName;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}

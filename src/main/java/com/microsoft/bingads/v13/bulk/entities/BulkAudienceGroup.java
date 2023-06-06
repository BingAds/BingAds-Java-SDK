package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AudienceGroup;
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupStatus;
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.GenderType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Audience Group.
 * <p/>
 * <p>
 * This class exposes the {@link #setAudienceGroup} and {@link #getAudienceGroup} that can be used to read and write
 * fields of the Audience Group record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Audience Group at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAudienceGroup extends SingleRecordBulkEntity {

    private Status status;
    
    private Long accountId;
    
    private List<Long> audienceIds;
    
    private List<AgeRange> ageRanges;
    
    private List<GenderType> genderTypes;
    
    private AudienceGroup audienceGroup;

    private static final List<BulkMapping<BulkAudienceGroup>> MAPPINGS;

    static {
        List<BulkMapping<BulkAudienceGroup>> m = new ArrayList<BulkMapping<BulkAudienceGroup>>();

        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.Status,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudienceGroup, Long>(StringTable.Id,
                new Function<BulkAudienceGroup, Long>() {
                    @Override
                    public Long apply(BulkAudienceGroup c) {
                        return c.getAudienceGroup().getId();
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) {
                        c.getAudienceGroup().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, Long>(StringTable.ParentId,
                new Function<BulkAudienceGroup, Long>() {
                    @Override
                    public Long apply(BulkAudienceGroup c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) {
                        c.setAccountId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.AudienceGroupName,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                        return c.getAudienceGroup().getName();
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) {
                        c.getAudienceGroup().setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.Audiences,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                        return StringExtensions.toLongListBulkString(";", c.getAudienceIds());
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) { 	
                        c.setAudienceIds(StringExtensions.parseIdList(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.AgeRanges,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                    	return StringExtensions.toAgeRangeListBulkString(";", c.getAgeRanges());
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) { 	
                        c.setAgeRanges(StringExtensions.parseAgeRangeList(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.GenderTypes,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                    	return StringExtensions.toGenderTypeListBulkString(";", c.getGenderTypes());
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) { 	
                        c.setGenderTypes(StringExtensions.parseGenderTypeList(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudienceGroup, String>(StringTable.Description,
                new Function<BulkAudienceGroup, String>() {
                    @Override
                    public String apply(BulkAudienceGroup c) {
                        return c.getAudienceGroup().getDescription();
                    }
                },
                new BiConsumer<String, BulkAudienceGroup>() {
                    @Override
                    public void accept(String v, BulkAudienceGroup c) {
                        c.getAudienceGroup().setDescription(v);
                    }
                }
        ));
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAudienceGroup(new AudienceGroup());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAudienceGroup(), "AudienceGroup");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public AudienceGroup getAudienceGroup() {
        return audienceGroup;
    }

    public void setAudienceGroup(AudienceGroup audienceGroup) {
        this.audienceGroup = audienceGroup;
    }
    
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public List<Long> getAudienceIds() {
		return audienceIds;
	}
	
	public void setAudienceIds(List<Long> audienceIds) {
		this.audienceIds = audienceIds;
	}
	
	public List<AgeRange> getAgeRanges() {
		return ageRanges;
	}
	
	public void setAgeRanges(List<AgeRange> ageRanges) {
		this.ageRanges = ageRanges;
	}
	
	public List<GenderType> getGenderTypes() {
		return genderTypes;
	}
	
	public void setGenderTypes(List<GenderType> genderTypes) {
		this.genderTypes = genderTypes;
	}
	
	
}

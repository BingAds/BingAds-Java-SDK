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
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelListing;
import com.microsoft.bingads.v13.campaignmanagement.HotelListingType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Ad Group Criterion that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group HotelListingGroup record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group HotelListingGroup at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelListingGroup extends BulkAdGroupCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelListingGroup>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelListingGroup>> m = new ArrayList<BulkMapping<BulkAdGroupHotelListingGroup>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupHotelListingGroup, String>(StringTable.SubType,
            new Function<BulkAdGroupHotelListingGroup, String>() {
                @Override
                public String apply(BulkAdGroupHotelListingGroup c) {
                	if (c.getAdGroupCriterion().getCriterion() instanceof HotelGroup){
                		
                		HotelListingType hotelListingType = ((HotelGroup) c.getAdGroupCriterion().getCriterion()).getListingType();
                		return hotelListingType == null ? null : hotelListingType.value();
                	} else {
                		return null;
                	}
                	
                }
            },
            new BiConsumer<String, BulkAdGroupHotelListingGroup>() {
                @Override
                public void accept(String v, BulkAdGroupHotelListingGroup c) {
                    ((HotelGroup) c.getAdGroupCriterion().getCriterion()).setListingType(
                            StringExtensions.parseOptional(v, new Function<String, HotelListingType>() {
                                @Override
                                public HotelListingType apply(String s) {
                                    return HotelListingType.fromValue(s);
                                }
                            })
                    );
                }
            }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupHotelListingGroup, Long>(StringTable.ParentAdGroupCriterionId,
            new Function<BulkAdGroupHotelListingGroup, Long>() {
                @Override
                public Long apply(BulkAdGroupHotelListingGroup c) {
                	if (c.getAdGroupCriterion().getCriterion() instanceof HotelGroup){
                		return ((HotelGroup) c.getAdGroupCriterion().getCriterion()).getParentCriterionId();
                	} else {
                		return null;
                	}
                }
            },
            new BiConsumer<String, BulkAdGroupHotelListingGroup>() {
                @Override
                public void accept(String v, BulkAdGroupHotelListingGroup c) {
                    ((HotelGroup) c.getAdGroupCriterion().getCriterion()).setParentCriterionId(
                            StringExtensions.parseOptional(v, new Function<String, Long>() {
                                @Override
                                public Long apply(String s) {
                                    return Long.parseLong(s);
                                }
                            })
                    );
                }
            }
        ));
        
        m.add(new ComplexBulkMapping<BulkAdGroupHotelListingGroup>(
            new BiConsumer<BulkAdGroupHotelListingGroup, RowValues>() {
                @Override
                public void accept(BulkAdGroupHotelListingGroup c, RowValues v) {
                    HotelListingToRowValue(c, v);
                }
            },
            new BiConsumer<RowValues, BulkAdGroupHotelListingGroup>() {
                @Override
                public void accept(RowValues v, BulkAdGroupHotelListingGroup c) {
                    parseHotelListing(v, c);
                }
            }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }
    
    
    private static void parseHotelListing(RowValues values, BulkAdGroupHotelListingGroup entity)
    {
        String attribute = values.tryGet(StringTable.HotelAttributeValue);
        String operand = values.tryGet(StringTable.HotelAttribute);

        if (attribute != null || operand != null)
        {
            HotelListing value = new HotelListing();
            value.setAttribute(attribute);
            value.setOperand(operand);
            ((HotelGroup)entity.getAdGroupCriterion().getCriterion()).setListing(value);
        }
    }

    private static void HotelListingToRowValue(BulkAdGroupHotelListingGroup entity, RowValues values)
    {
        AdGroupCriterion adGroupCriterion = entity.getAdGroupCriterion();
        if (adGroupCriterion == null) return;
        
        Criterion criterion = adGroupCriterion.getCriterion();
        
        if (criterion == null) return;

        HotelListing hotelListing = ((HotelGroup)criterion).getListing();
        if (hotelListing != null) {
            values.put(StringTable.HotelAttributeValue, hotelListing.getAttribute());
            values.put(StringTable.HotelAttribute, hotelListing.getOperand());
        }
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

	@Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
	
    @Override
	public Criterion createCriterion() {
        HotelGroup hotelGroup = new HotelGroup();
        hotelGroup.setType(HotelGroup.class.getSimpleName());

        return hotelGroup;
	}

}

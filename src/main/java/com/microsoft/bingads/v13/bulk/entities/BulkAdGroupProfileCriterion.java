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
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a profile criterion that is assigned to an ad group. Each profile criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Bulk File Schema at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkAdGroupProfileCriterion extends BulkAdGroupBiddableCriterion {
	
	private String profileName;

	private static final List<BulkMapping<BulkAdGroupProfileCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupProfileCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupProfileCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.Profile,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
                        return c.getProfileName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.setProfileName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, Long>(StringTable.ProfileId,
                new Function<BulkAdGroupProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProfileCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {    
                    		return ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileId();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {
                    	    ((ProfileCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setProfileId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                @Override
                                public Long apply(String s) {
                                    return Long.parseLong(s);
                                }
                            }));
                    	}
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
    protected Criterion createCriterion() {
        ProfileCriterion criterion = new ProfileCriterion();
        setProfileType(criterion);
        return criterion;
    }

    public abstract void setProfileType(ProfileCriterion criterion);

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
    
    
}

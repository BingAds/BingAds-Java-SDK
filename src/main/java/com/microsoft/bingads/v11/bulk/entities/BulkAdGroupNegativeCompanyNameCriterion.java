package com.microsoft.bingads.v11.bulk.entities;

import java.util.Collections;

import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileType;

/**
 * Represents a negative company name criterion that is assigned to an ad group. Each company name criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Company Name Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeCompanyNameCriterion extends BulkAdGroupNegativeProfileCriterion {

    @Override
    public void setProfileType(ProfileCriterion criterion) {
        criterion.setProfileType(Collections.singleton(ProfileType.COMPANY_NAME));        
    }
    
}

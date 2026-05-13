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
import com.microsoft.bingads.v13.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a negative gender criterion that is assigned to a campaign. Each negative gender criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Gender Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeGenderCriterion extends BulkCampaignNegativeCriterion {

    private static final List<BulkMapping<BulkCampaignNegativeGenderCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeGenderCriterion>> m = new ArrayList<BulkMapping<BulkCampaignNegativeGenderCriterion>>();

        m.add(new SimpleBulkMapping<BulkCampaignNegativeGenderCriterion, String>(StringTable.Target,
                new Function<BulkCampaignNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeGenderCriterion c) {
                        if (c.getNegativeCampaignCriterion().getCriterion() instanceof GenderCriterion) {
                            GenderType genderType = ((GenderCriterion) c.getNegativeCampaignCriterion().getCriterion()).getGenderType();
                            return genderType == null ? null : genderType.value();
                        }
                        return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeGenderCriterion c) {
                        if (c.getNegativeCampaignCriterion().getCriterion() instanceof GenderCriterion) {
                            ((GenderCriterion) c.getNegativeCampaignCriterion().getCriterion()).setGenderType(
                                    StringExtensions.parseOptional(v, new Function<String, GenderType>() {
                                        @Override
                                        public GenderType apply(String s) {
                                            return StringExtensions.fromValueOptional(s, GenderType.class);
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
        return new GenderCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

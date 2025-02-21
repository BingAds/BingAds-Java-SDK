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
import com.microsoft.bingads.v13.campaignmanagement.NewCustomerAcquisitionGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a newCustomerAcquisitionGoal that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the NewCustomerAcquisitionGoal record in a bulk file.
 * For more information, see NewCustomerAcquisitionGoal at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkNewCustomerAcquisitionGoal extends SingleRecordBulkEntity {
	
	private NewCustomerAcquisitionGoal newCustomerAcquisitionGoal;
	
	private String target;

    private static final List<BulkMapping<BulkNewCustomerAcquisitionGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkNewCustomerAcquisitionGoal>> m = new ArrayList<BulkMapping<BulkNewCustomerAcquisitionGoal>>();

        m.add(new SimpleBulkMapping<BulkNewCustomerAcquisitionGoal, Long>(StringTable.Id,
                new Function<BulkNewCustomerAcquisitionGoal, Long>() {
                    @Override
                    public Long apply(BulkNewCustomerAcquisitionGoal t) {
                        return t.getNewCustomerAcquisitionGoal().getId();
                    }
                },
                new BiConsumer<String, BulkNewCustomerAcquisitionGoal>() {
                    @Override
                    public void accept(String v, BulkNewCustomerAcquisitionGoal c) {
                        c.getNewCustomerAcquisitionGoal().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkNewCustomerAcquisitionGoal, String>(StringTable.Target,
                new Function<BulkNewCustomerAcquisitionGoal, String>() {
                    @Override
                    public String apply(BulkNewCustomerAcquisitionGoal t) {
                        return t.getTarget();
                    }
                },
                new BiConsumer<String, BulkNewCustomerAcquisitionGoal>() {
                    @Override
                    public void accept(String v, BulkNewCustomerAcquisitionGoal c) {
                        c.setTarget(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkNewCustomerAcquisitionGoal, String>(StringTable.AdditionalConversionValue,
                new Function<BulkNewCustomerAcquisitionGoal, String>() {
                    @Override
                    public String apply(BulkNewCustomerAcquisitionGoal t) {
                        return t.getNewCustomerAcquisitionGoal().getAdditionalValue() != null ? t.getNewCustomerAcquisitionGoal().getAdditionalValue().toString() : null;
                    }
                },
                new BiConsumer<String, BulkNewCustomerAcquisitionGoal>() {
                    @Override
                    public void accept(String v, BulkNewCustomerAcquisitionGoal c) {
                        c.getNewCustomerAcquisitionGoal().setAdditionalValue(StringExtensions.nullOrBigDecimal(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the newCustomerAcquisitionGoal.
     */
    public NewCustomerAcquisitionGoal getNewCustomerAcquisitionGoal() {
        return this.newCustomerAcquisitionGoal;
    }

    /**
     * Sets the newCustomerAcquisitionGoal.
     */
    public void setNewCustomerAcquisitionGoal(NewCustomerAcquisitionGoal newCustomerAcquisitionGoal) {
        this.newCustomerAcquisitionGoal = newCustomerAcquisitionGoal;
    }

    /**
     * Gets the ids of audiences within the new customer acquisition. It should be split by simicolon.
     * */
    public String getTarget() {
		return this.target;
	}
    
    /**
     * Sets the ids of audiences within the new customer acquisition. It should be split by simicolon.
     */
    public void setTarget(String target) {
        this.target = target;
    }


	@Override
    public void processMappingsFromRowValues(RowValues values) {
		this.setNewCustomerAcquisitionGoal(new NewCustomerAcquisitionGoal());
        MappingHelpers.<BulkNewCustomerAcquisitionGoal>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
    	validatePropertyNotNull(getNewCustomerAcquisitionGoal(), "NewCustomerAcquisitionGoal");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

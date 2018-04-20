package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.Budget;
import com.microsoft.bingads.v12.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a budget that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Budget record in a bulk file.
 * For more information, see Account at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkBudget extends SingleRecordBulkEntity {
	
	private Budget budget;
	
	private Long accountId;
	
	private Status status;

    private static final List<BulkMapping<BulkBudget>> MAPPINGS;

    static {
        List<BulkMapping<BulkBudget>> m = new ArrayList<BulkMapping<BulkBudget>>();

        m.add(new SimpleBulkMapping<BulkBudget, Long>(StringTable.Id,
                new Function<BulkBudget, Long>() {
                    @Override
                    public Long apply(BulkBudget t) {
                        return t.getBudget().getId();
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                        c.getBudget().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBudget, Long>(StringTable.ParentId,
                new Function<BulkBudget, Long>() {
                    @Override
                    public Long apply(BulkBudget c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                    	c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBudget, String>(StringTable.Status,
                new Function<BulkBudget, String>() {
                    @Override
                    public String apply(BulkBudget t) {
                        return t.getStatus() != null ? t.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                    	c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkBudget, String>(StringTable.BudgetName,
                new Function<BulkBudget, String>() {
                    @Override
                    public String apply(BulkBudget t) {
                        return t.getBudget().getName();
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                        c.getBudget().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkBudget, String>(StringTable.BudgetType,
                new Function<BulkBudget, String>() {
                    @Override
                    public String apply(BulkBudget t) {
                        return t.getBudget().getBudgetType() != null ? t.getBudget().getBudgetType().value() : null;
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                        c.getBudget().setBudgetType(StringExtensions.parseOptional(v, new Function<String, BudgetLimitType>() {
                            @Override
                            public BudgetLimitType apply(String value) {
                                return BudgetLimitType.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBudget, String>(StringTable.Budget,
                new Function<BulkBudget, String>() {
                    @Override
                    public String apply(BulkBudget t) {
                        return t.getBudget().getAmount() != null ? t.getBudget().getAmount().toString() : null;
                    }
                },
                new BiConsumer<String, BulkBudget>() {
                    @Override
                    public void accept(String v, BulkBudget c) {
                        c.getBudget().setAmount(StringExtensions.nullOrBigDecimal(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the budget.
     */
    public Budget getBudget() {
        return this.budget;
    }

    /**
     * Sets the budget.
     */
    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    /**
     * Gets the account id 
     * */
    public Long getAccountId() {
		return accountId;
	}

    /**
     * Sets the account id
     * */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
     * Gets the status
     * */
	public Status getStatus() {
		return status;
	}

	/**
     * Sets the status
     * */
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
    public void processMappingsFromRowValues(RowValues values) {
		this.setBudget(new Budget());
        MappingHelpers.<BulkBudget>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
    	validatePropertyNotNull(getBudget(), "Budget");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

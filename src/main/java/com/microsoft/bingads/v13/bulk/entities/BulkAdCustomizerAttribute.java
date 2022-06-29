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
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Ad Customizer Attribute that can be read or written in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Customizer Attribute at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdCustomizerAttribute extends SingleRecordBulkEntity {
	
	private String id;
	
	private String name;
	
	private String accountValue;
	
	private AttributeType dataType;
	
	private EditorialStatus editorialStatus;
	
	private String status;
	
	private static final List<BulkMapping<BulkAdCustomizerAttribute>> MAPPINGS;
	
	static {
		List<BulkMapping<BulkAdCustomizerAttribute>> m = new ArrayList<BulkMapping<BulkAdCustomizerAttribute>>();
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.Id,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getId();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttribute c) {
                        c.setId(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.Name,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getName();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttribute c) {
                        c.setName(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.AdCustomizerAttributeValue,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getAccountValue();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttribute c) {
                        c.setAccountValue(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.AdCustomizerDataType,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getDataType() != null ? t.getDataType().value() : null;
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
					@Override
					public void accept(String v, BulkAdCustomizerAttribute t) {
						t.setDataType(StringExtensions.parseOptional(v, new Function<String, AttributeType>() {
							@Override
							public AttributeType apply(String value) {
								return AttributeType.fromValue(value);
							}
						}));
					}
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.EditorialStatus,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getEditorialStatus() != null ? t.getEditorialStatus().value() : null;
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
					@Override
					public void accept(String v, BulkAdCustomizerAttribute t) {
						t.setEditorialStatus(StringExtensions.parseOptional(v, new Function<String, EditorialStatus>() {
							@Override
							public EditorialStatus apply(String value) {
								return EditorialStatus.fromValue(value);
							}
						}));
					}
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttribute, String>(StringTable.Status,
                new Function<BulkAdCustomizerAttribute, String>() {
					@Override
					public String apply(BulkAdCustomizerAttribute t) {
						return t.getStatus();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttribute>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttribute c) {
                        c.setStatus(v);
                    }
                }
        ));
		
		MAPPINGS = Collections.unmodifiableList(m);
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountValue() {
		return accountValue;
	}
	
	public void setAccountValue(String accountValue) {
		this.accountValue = accountValue;
	}
	
	public AttributeType getDataType() {
		return dataType;
	}
	
	public void setDataType(AttributeType dataType) {
		this.dataType = dataType;
	}
	
	public EditorialStatus getEditorialStatus() {
		return editorialStatus;
	}
	
	public void setEditorialStatus(EditorialStatus editorialStatus) {
		this.editorialStatus = editorialStatus;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public void processMappingsFromRowValues(RowValues values) {
		MappingHelpers.<BulkAdCustomizerAttribute>convertToEntity(values, MAPPINGS, this);
	}

	@Override
	public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
		MappingHelpers.convertToValues(this, values, MAPPINGS);
	}
}

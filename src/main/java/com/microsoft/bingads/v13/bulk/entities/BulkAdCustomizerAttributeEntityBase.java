package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Base class for all Ad Customizer Attribute subclasses that can be read
 * or written in a bulk file.
 *
 * @see BulkCampaignAdCustomizerAttribute
 * @see BulkAdGroupAdCustomizerAttribute
 * @see BulkKeywordAdCustomizerAttribute
 */
public class BulkAdCustomizerAttributeEntityBase extends SingleRecordBulkEntity {

	protected String id;
	
	protected String name;
	
	protected long parentId;
	
	protected String attributeValue;
	
	protected EditorialStatus editorialStatus;
	
	protected static final List<BulkMapping<BulkAdCustomizerAttributeEntityBase>> MAPPINGS;
	
	static {
		List<BulkMapping<BulkAdCustomizerAttributeEntityBase>> m = new ArrayList<BulkMapping<BulkAdCustomizerAttributeEntityBase>>();
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttributeEntityBase, String>(StringTable.Id,
                new Function<BulkAdCustomizerAttributeEntityBase, String>() {
					@Override
					public String apply(BulkAdCustomizerAttributeEntityBase t) {
						return t.getId();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttributeEntityBase>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttributeEntityBase c) {
                        c.setId(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttributeEntityBase, String>(StringTable.Name,
                new Function<BulkAdCustomizerAttributeEntityBase, String>() {
					@Override
					public String apply(BulkAdCustomizerAttributeEntityBase t) {
						return t.getName();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttributeEntityBase>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttributeEntityBase c) {
                        c.setName(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttributeEntityBase, Long>(StringTable.ParentId,
                new Function<BulkAdCustomizerAttributeEntityBase, Long>() {
                    @Override
                    public Long apply(BulkAdCustomizerAttributeEntityBase t) {
                        return t.getParentId();
                    }
                },
                new BiConsumer<String, BulkAdCustomizerAttributeEntityBase>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttributeEntityBase c) {
                        c.setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttributeEntityBase, String>(StringTable.AdCustomizerAttributeValue,
                new Function<BulkAdCustomizerAttributeEntityBase, String>() {
					@Override
					public String apply(BulkAdCustomizerAttributeEntityBase t) {
						return t.getAttributeValue();
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttributeEntityBase>() {
                    @Override
                    public void accept(String v, BulkAdCustomizerAttributeEntityBase c) {
                        c.setAttributeValue(v);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkAdCustomizerAttributeEntityBase, String>(StringTable.EditorialStatus,
                new Function<BulkAdCustomizerAttributeEntityBase, String>() {
					@Override
					public String apply(BulkAdCustomizerAttributeEntityBase t) {
						return t.getEditorialStatus() != null ? t.getEditorialStatus().value() : null;
					}
				},
                new BiConsumer<String, BulkAdCustomizerAttributeEntityBase>() {
					@Override
					public void accept(String v, BulkAdCustomizerAttributeEntityBase c) {
						c.setEditorialStatus(StringExtensions.parseOptional(v, new Function<String, EditorialStatus>() {
							@Override
							public EditorialStatus apply(String value) {
								return StringExtensions.fromValueOptional(value, EditorialStatus.class);
							}
						}));
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
	
	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getAttributeValue() {
		return attributeValue;
	}
	
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	public EditorialStatus getEditorialStatus() {
		return editorialStatus;
	}
	
	public void setEditorialStatus(EditorialStatus editorialStatus) {
		this.editorialStatus = editorialStatus;
	}
	
	
	@Override
	public void processMappingsFromRowValues(RowValues values) {
		MappingHelpers.<BulkAdCustomizerAttributeEntityBase>convertToEntity(values, MAPPINGS, this);
	}

	@Override
	public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
		MappingHelpers.convertToValues(this, values, MAPPINGS);
	}

}

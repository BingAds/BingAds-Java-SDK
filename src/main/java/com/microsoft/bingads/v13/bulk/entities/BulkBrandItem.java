package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.BrandItem;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Brand Item.
 * <p/>
 * <p>
 * This class exposes the {@link #setBrandItem} and {@link #getBrandItem} that can be used to read and write
 * fields of the Brand Item record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Brand Item at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkBrandItem extends SingleRecordBulkEntity {

    private Long id;
    
    private Long brandListId;
    
    private String name;
    
    private String brandName;
    
    private String brandUrl;
    
    private String editorialStatus;
    
    private Calendar editorialStatusDate;
    
    private BrandItem brandItem;

    private static final List<BulkMapping<BulkBrandItem>> MAPPINGS;

    static {
        List<BulkMapping<BulkBrandItem>> m = new ArrayList<BulkMapping<BulkBrandItem>>();

        m.add(new SimpleBulkMapping<BulkBrandItem, Long>(StringTable.Id,
                new Function<BulkBrandItem, Long>() {
                    @Override
                    public Long apply(BulkBrandItem c) {
                        return c.getId();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, Long>(StringTable.ParentId,
                new Function<BulkBrandItem, Long>() {
                    @Override
                    public Long apply(BulkBrandItem c) {
                        return c.getBrandListId();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setBrandListId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, String>(StringTable.Name,
                new Function<BulkBrandItem, String>() {
                    @Override
                    public String apply(BulkBrandItem c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, Long>(StringTable.BrandId,
                new Function<BulkBrandItem, Long>() {
                    @Override
                    public Long apply(BulkBrandItem c) {
                        return c.getBrandItem().getBrandId();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.getBrandItem().setBrandId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, String>(StringTable.BrandName,
                new Function<BulkBrandItem, String>() {
                    @Override
                    public String apply(BulkBrandItem c) {
                        return c.getBrandName();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setBrandName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, String>(StringTable.BrandUrl,
                new Function<BulkBrandItem, String>() {
                    @Override
                    public String apply(BulkBrandItem c) {
                        return c.getBrandUrl();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setBrandUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, String>(StringTable.EditorialStatus,
                new Function<BulkBrandItem, String>() {
                    @Override
                    public String apply(BulkBrandItem c) {
                        return c.getEditorialStatus();
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setEditorialStatus(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandItem, String>(StringTable.StatusDateTime, 
                new Function<BulkBrandItem, String>() {
                    @Override
                    public String apply(BulkBrandItem t) {
                        if (t.getEditorialStatusDate() == null) {
                            return null;
                        }
        
                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
                        return format.format(t.getEditorialStatusDate().getTime());
                    }
                },
                new BiConsumer<String, BulkBrandItem>() {
                    @Override
                    public void accept(String v, BulkBrandItem c) {
                        c.setEditorialStatusDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                                    format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
                                    c.setTime(format.parse(t));
                                } catch (ParseException ex) {
                                    throw new UncheckedParseException(ex);
                                }
        
                                return c;
                            }
                        }));
                    }
                }
        ));        
        
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	BrandItem BrandItem = new BrandItem();
        this.setBrandItem(BrandItem);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBrandItem(), "BrandItem");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
    
    public BrandItem getBrandItem() {
		return brandItem;
	}
	
	public void setBrandItem(BrandItem brandItem) {
		this.brandItem = brandItem;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getBrandListId() {
		return brandListId;
	}
	
	public void setBrandListId(Long brandListId) {
		this.brandListId = brandListId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getBrandUrl() {
		return brandUrl;
	}
	
	public void setBrandUrl(String brandUrl) {
		this.brandUrl = brandUrl;
	}
	
	public String getEditorialStatus() {
		return editorialStatus;
	}
	
	public void setEditorialStatus(String editorialStatus) {
		this.editorialStatus = editorialStatus;
	}
	
	public Calendar getEditorialStatusDate() {
		return editorialStatusDate;
	}
	
	public void setEditorialStatusDate(Calendar editorialStatusDate) {
		this.editorialStatusDate = editorialStatusDate;
	}
}

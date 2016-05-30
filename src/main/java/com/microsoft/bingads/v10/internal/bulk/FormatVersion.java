package com.microsoft.bingads.v10.internal.bulk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;


public class FormatVersion extends BulkObject{
	
	private String value;
	
	private static final List<BulkMapping<FormatVersion>> MAPPINGS;
	
	static {
		List<BulkMapping<FormatVersion>> m = new ArrayList<BulkMapping<FormatVersion>>();

        m.add(new SimpleBulkMapping<FormatVersion, String>(StringTable.Name,
                new Function<FormatVersion, String>() {
                    @Override
                    public String apply(FormatVersion c) {
                        return c.getValue();
                    }
                },
                new BiConsumer<String, FormatVersion>() {
                    @Override
                    public void accept(String v, FormatVersion c) {
                        c.setValue(v);
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
	}
	
	@Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.<FormatVersion>convertToEntity(values, MAPPINGS, this);
    }

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}

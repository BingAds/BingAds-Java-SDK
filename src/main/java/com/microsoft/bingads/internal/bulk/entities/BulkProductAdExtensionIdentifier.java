package com.microsoft.bingads.internal.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkProductAdExtension;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BulkProductAdExtensionIdentifier extends BulkAdExtensionIdentifier {

    private String name;// { get; set; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        if (!BulkProductAdExtensionIdentifier.class.isInstance(other)) {
            return false;
        } else {
            BulkProductAdExtensionIdentifier otherIdentifier = BulkProductAdExtensionIdentifier.class.cast(other);

            return compareNullable(getAccountId(), otherIdentifier.getAccountId()) &&
                   compareNullable(getAdExtensionId(), otherIdentifier.getAdExtensionId());
        }
    }

    private static List<BulkMapping<BulkProductAdExtensionIdentifier>> MAPPINGS;

    static {
        List<BulkMapping<BulkProductAdExtensionIdentifier>> m = new ArrayList<BulkMapping<BulkProductAdExtensionIdentifier>>();

        m.add(new SimpleBulkMapping<BulkProductAdExtensionIdentifier, String>(StringTable.Name,
                new Function<BulkProductAdExtensionIdentifier, String>() {
                    @Override
                    public String apply(BulkProductAdExtensionIdentifier c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkProductAdExtensionIdentifier>() {
                    @Override
                    public void accept(String v, BulkProductAdExtensionIdentifier c) {
                        c.setName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        super.readFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.writeToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkProductAdExtension(this);
    }
}

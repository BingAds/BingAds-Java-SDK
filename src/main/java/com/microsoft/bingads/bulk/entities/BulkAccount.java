package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.campaignmanagement.Date;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Represents an account that can be read from a bulk file.
 */
public class BulkAccount extends SingleRecordBulkEntity {

    private long id;

    private long customerId;

    private Calendar syncTime;

    private static final List<BulkMapping<BulkAccount>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccount>> m = new ArrayList<BulkMapping<BulkAccount>>();

        m.add(new SimpleBulkMapping<BulkAccount, Long>(StringTable.Id,
                new Function<BulkAccount, Long>() {
                    @Override
                    public Long apply(BulkAccount t) {
                        return t.getId();
                    }
                },
                new BiConsumer<String, BulkAccount>() {
                    @Override
                    public void accept(String v, BulkAccount c) {
                        c.setId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccount, Long>(StringTable.ParentId,
                new Function<BulkAccount, Long>() {
                    @Override
                    public Long apply(BulkAccount t) {
                        return t.getCustomerId();
                    }
                },
                new BiConsumer<String, BulkAccount>() {
                    @Override
                    public void accept(String v, BulkAccount c) {
                        c.setCustomerId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccount, String>(StringTable.SyncTime,
                new Function<BulkAccount, String>() {
                    @Override
                    public String apply(BulkAccount t) {
                        if (t.getSyncTime() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getSyncTime().getTime());
                    }
                },
                new BiConsumer<String, BulkAccount>() {
                    @Override
                    public void accept(String v, BulkAccount c) {
                        c.setSyncTime(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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

    /**
     * Gets the account id
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the account id
     * @param id Account id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the customer id
     *
     * @return
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customer id
     * @param customerId customer id
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Calendar getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Calendar syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkAccount>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

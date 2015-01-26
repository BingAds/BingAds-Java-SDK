package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.UncheckedParseException;
import com.microsoft.bingads.campaignmanagement.Date;
import com.microsoft.bingads.customermanagement.Account;
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

public class BulkAccount extends SingleRecordBulkEntity {

    private Account account;

    private Long customerId;

    private Calendar syncTime;

    private static final List<BulkMapping<BulkAccount>> MAPPINGS;

    static {
        List<BulkMapping<BulkAccount>> m = new ArrayList<BulkMapping<BulkAccount>>();

        m.add(new SimpleBulkMapping<BulkAccount, Long>(StringTable.Id,
                new BiConsumer<String, BulkAccount>() {
                    @Override
                    public void accept(String v, BulkAccount c) {
                        c.getAccount().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccount, Long>(StringTable.ParentId,
                new BiConsumer<String, BulkAccount>() {
                    @Override
                    public void accept(String v, BulkAccount c) {
                        c.setCustomerId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAccount, Date>(StringTable.SyncTime,
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Calendar getSyncTime() {
        return syncTime;
    }

    private void setSyncTime(Calendar syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAccount(new Account());
        MappingHelpers.<BulkAccount>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        throw new UnsupportedOperationException();
    }
}

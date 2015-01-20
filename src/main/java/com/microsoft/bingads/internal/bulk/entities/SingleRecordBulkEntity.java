package com.microsoft.bingads.internal.bulk.entities;

import com.microsoft.bingads.UncheckedParseException;
import com.microsoft.bingads.bulk.entities.BulkAccount;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.bulk.entities.BulkError;
import com.microsoft.bingads.campaignmanagement.Date;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.bulk.file.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.file.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.file.TryResult;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Bulk entity that has its data in a single file row (campaigns, AdGroups, keywords, individual site links, individual target bids etc.).
 */
public abstract class SingleRecordBulkEntity extends BulkEntity {

    private String clientId;

    private Calendar lastModifiedTime;

    private List<BulkError> errors;

    /**
     * Mappings shared by all single line entities (ClientId)
     */
    private static List<BulkMapping<SingleRecordBulkEntity>> MAPPINGS;

    static {
        List<BulkMapping<SingleRecordBulkEntity>> m = new ArrayList<BulkMapping<SingleRecordBulkEntity>>();

        m.add(new SimpleBulkMapping<SingleRecordBulkEntity, String>(StringTable.ClientId,
                new Function<SingleRecordBulkEntity, String>() {
                    @Override
                    public String apply(SingleRecordBulkEntity c) {
                        return c.getClientId();
                    }
                },
                new BiConsumer<String, SingleRecordBulkEntity>() {
                    @Override
                    public void accept(String v, SingleRecordBulkEntity c) {
                        c.setClientId(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<SingleRecordBulkEntity, Date>(StringTable.LastModifiedTime,
                new BiConsumer<String, SingleRecordBulkEntity>() {
                    @Override
                    public void accept(String v, SingleRecordBulkEntity c) {
                        c.lastModifiedTime = StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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
                        });
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Reads common mappings and calls abstract method to read entity-specific mappings. This is done through abstract method to avoid having to do base.ReadFromRowValues in each child.
     *
     * @param values CSV row values
     */
    @Override
    public void readFromRowValues(RowValues values) {
        MappingHelpers.<SingleRecordBulkEntity>convertToEntity(values, MAPPINGS, this);

        this.processMappingsFromRowValues(values);
    }

    /**
     * Process specific entity mappings from CSV values. Must be implemented by each entity.
     *
     * @param values Set of values and mappings corresponding to one row/single line entity
     */
    public abstract void processMappingsFromRowValues(RowValues values);

    /**
     * Writes common mappings and calls abstract method to read entity-specific mappings. This is done through abstract method to avoid having to do base.WriteToRowValues in each child.
     *
     * @param values CSV row values
     */
    @Override
    public void writeToRowValues(RowValues values) {
        MappingHelpers.<SingleRecordBulkEntity>convertToValues(this, values, MAPPINGS);

        this.processMappingsToRowValues(values);
    }

    /**
     * Process specific entity mappings to CSV values. Must be implemented by each entity
     *
     * @param values Row values
     */
    public abstract void processMappingsToRowValues(RowValues values);

    @Override
    public final void readRelatedDataFromStream(BulkStreamReader reader) {
        this.readAdditionalData(reader);
        this.readErrors(reader);
    }

    public void readAdditionalData(BulkStreamReader reader) {

    }

    /**
     * Reads errors immediately after the current row
     *
     * @param reader Reader object, allowing to read consecutive bulk rows
     *
     * No checks are made for the error type. It's assumed that an entity row can only be followed by errors of the same type
     */
    private void readErrors(BulkStreamReader reader) {
        List<BulkError> errors = new ArrayList<BulkError>();

        TryResult<BulkError> errorResult = reader.tryRead(BulkError.class);

        while (errorResult.isSuccessful()) {
            errors.add(errorResult.getResult());
            errorResult = reader.tryRead(BulkError.class);
        }

        this.errors = errors;
    }

    @Override
    public boolean hasErrors() {
        return this.errors != null && this.errors.size() > 0;
    }

    /**
     * Writes entity data to bulk file
     *
     * @param rowWriter Writer object, allowing to write consecutive bulk rows
     * @throws IOException
     */
    @Override
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        rowWriter.writeObjectRow(this);
    }

    @Override
    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<BulkError> getErrors() {
        return errors;
    }
}

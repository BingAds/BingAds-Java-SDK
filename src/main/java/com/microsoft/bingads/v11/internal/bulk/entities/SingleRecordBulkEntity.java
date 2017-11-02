package com.microsoft.bingads.v11.internal.bulk.entities;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.bulk.entities.BulkError;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v11.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.TryResult;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
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
    private static final List<BulkMapping<SingleRecordBulkEntity>> MAPPINGS;

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

        m.add(new SimpleBulkMapping<SingleRecordBulkEntity, String>(StringTable.LastModifiedTime,
                new Function<SingleRecordBulkEntity, String>() {
                    @Override
                    public String apply(SingleRecordBulkEntity t) {
                        if (t.getLastModifiedTime() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getLastModifiedTime().getTime());
                    }
                },
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
     * @param excludeReadonlyData indicates whether readonly data should be written (such as errors, performance data etc.)
     */
    @Override
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.<SingleRecordBulkEntity>convertToValues(this, values, MAPPINGS);

        this.processMappingsToRowValues(values, excludeReadonlyData);
    }

    /**
     * Process specific entity mappings to CSV values. Must be implemented by each entity
     *
     * @param values Row values
     * @param excludeReadonlyData indicates whether readonly data should be written (such as errors, performance data etc.)
     */
    public abstract void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData);

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
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
            BulkError error = errorResult.getResult();

            error.setEntity(this);

            errors.add(error);
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
     * @param excludeReadonlyData indicates whether readonly data should be written (such as errors, performance data etc.)
     * @throws IOException
     */
    @Override
    public void writeToStream(BulkObjectWriter rowWriter, boolean excludeReadonlyData) throws IOException {
        rowWriter.writeObjectRow(this, excludeReadonlyData);

        if (!excludeReadonlyData) {
            writeErrors(rowWriter);

            writeAdditionalData(rowWriter);
        }
    }

    public void writeAdditionalData(BulkObjectWriter writer) throws IOException {
    }

    private void writeErrors(BulkObjectWriter writer) throws IOException {
        if (hasErrors()) {
            for (BulkError error : getErrors()) {
                writer.writeObjectRow(error);
            }
        }
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

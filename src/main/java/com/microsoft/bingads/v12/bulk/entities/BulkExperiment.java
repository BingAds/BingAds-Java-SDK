package com.microsoft.bingads.v12.bulk.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.Experiment;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an experiment that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond
 * to fields of the Experiment record in a bulk file. For more information, see
 * Experiment at <a href=
 * "https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkExperiment extends SingleRecordBulkEntity {

    private Experiment experiment;

    private static final List<BulkMapping<BulkExperiment>> MAPPINGS;

    static {
        List<BulkMapping<BulkExperiment>> m = new ArrayList<BulkMapping<BulkExperiment>>();

        m.add(new SimpleBulkMapping<BulkExperiment, Long>(StringTable.Id, new Function<BulkExperiment, Long>() {
            @Override
            public Long apply(BulkExperiment t) {
                return t.getExperiment().getId();
            }
        }, new BiConsumer<String, BulkExperiment>() {
            @Override
            public void accept(String v, BulkExperiment c) {
                c.getExperiment().setId(StringExtensions.nullOrLong(v));
            }
        }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.Status, new Function<BulkExperiment, String>() {
            @Override
            public String apply(BulkExperiment t) {
                return t.getExperiment().getExperimentStatus();
            }
        }, new BiConsumer<String, BulkExperiment>() {
            @Override
            public void accept(String v, BulkExperiment c) {
                c.getExperiment().setExperimentStatus(v);
            }
        }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.Name, new Function<BulkExperiment, String>() {
            @Override
            public String apply(BulkExperiment t) {
                return t.getExperiment().getName();
            }
        }, new BiConsumer<String, BulkExperiment>() {
            @Override
            public void accept(String v, BulkExperiment c) {
                c.getExperiment().setName(v);
            }
        }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.TrafficSplitPercent,
                new Function<BulkExperiment, String>() {
                    @Override
                    public String apply(BulkExperiment t) {
                        return StringExtensions.<Integer>toBulkString(t.getExperiment().getTrafficSplitPercent());
                    }
                }, new BiConsumer<String, BulkExperiment>() {
                    @Override
                    public void accept(String v, BulkExperiment c) {
                        c.getExperiment().setTrafficSplitPercent(StringExtensions.parseOptionalInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.BaseCampaignId,
                new Function<BulkExperiment, String>() {
                    @Override
                    public String apply(BulkExperiment t) {
                        return StringExtensions.<Long>toBulkString(t.getExperiment().getBaseCampaignId());
                    }
                }, new BiConsumer<String, BulkExperiment>() {
                    @Override
                    public void accept(String v, BulkExperiment c) {
                        c.getExperiment().setBaseCampaignId(
                                StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String value) {
                                        return Long.parseLong(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.ExperimentCampaignId,
                new Function<BulkExperiment, String>() {
                    @Override
                    public String apply(BulkExperiment t) {
                        return StringExtensions.<Long>toBulkString(t.getExperiment().getExperimentCampaignId());
                    }
                }, new BiConsumer<String, BulkExperiment>() {
                    @Override
                    public void accept(String v, BulkExperiment c) {
                        c.getExperiment().setExperimentCampaignId(
                                StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String value) {
                                        return Long.parseLong(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.StartDate,
                new Function<BulkExperiment, String>() {
                    @Override
                    public String apply(BulkExperiment c) {
                        return StringExtensions.toDateBulkString(c.getExperiment().getStartDate());
                    }
                }, new BiConsumer<String, BulkExperiment>() {
                    @Override
                    public void accept(String v, BulkExperiment c) {
                        try {
                            c.getExperiment().setStartDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }));

        m.add(new SimpleBulkMapping<BulkExperiment, String>(StringTable.EndDate,
                new Function<BulkExperiment, String>() {
                    @Override
                    public String apply(BulkExperiment c) {
                        return StringExtensions.toDateBulkString(c.getExperiment().getEndDate());
                    }
                }, new BiConsumer<String, BulkExperiment>() {
                    @Override
                    public void accept(String v, BulkExperiment c) {
                        try {
                            c.getExperiment().setEndDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the experiment.
     */
    public Experiment getExperiment() {
        return this.experiment;
    }

    /**
     * Sets the experiment.
     */
    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setExperiment(new Experiment());
        MappingHelpers.<BulkExperiment>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getExperiment(), "Experiment");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

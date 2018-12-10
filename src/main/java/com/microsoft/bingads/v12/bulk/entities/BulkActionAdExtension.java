package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.ActionAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.ActionAdExtensionActionType;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents an action ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Action Ad Extension record in a
 * bulk file.
 *
 * For more information, see action Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkActionAdExtension extends BulkAdExtension<ActionAdExtension> {

    /**
     * Gets the app ad extension.
     */
    public ActionAdExtension getActionAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the app ad extension.
     */
    public void setActionAdExtension(ActionAdExtension actionAdExtension) {
        setAdExtension(actionAdExtension);
    }

    private static final List<BulkMapping<BulkActionAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkActionAdExtension>> m = new ArrayList<BulkMapping<BulkActionAdExtension>>();

        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(
                StringTable.ActionType,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension c) {
                        return StringExtensions.toActionAdExtensionActionTypeBulkString(c.getActionAdExtension().getActionType());
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        c.getActionAdExtension().setActionType(StringExtensions.<ActionAdExtensionActionType>parseOptional(v, new Function<String, ActionAdExtensionActionType>() {
                            @Override
                            public ActionAdExtensionActionType apply(String value) {
                                return ActionAdExtensionActionType.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getActionAdExtension().getFinalUrls());
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getActionAdExtension().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getActionAdExtension().getFinalMobileUrls());
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getActionAdExtension().setFinalMobileUrls(urls);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension t) {
                        return StringExtensions.toOptionalBulkString(t.getActionAdExtension().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        c.getActionAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(StringTable.Language,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension t) {
                        return t.getActionAdExtension().getLanguage();
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        c.getActionAdExtension().setLanguage(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkActionAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getActionAdExtension().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkActionAdExtension>() {
                    @Override
                    public void accept(String v, BulkActionAdExtension c) {
                        try {
                                c.getActionAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        ActionAdExtension extension = new ActionAdExtension();

        extension.setType("ActionAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getActionAdExtension(), "ActionAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupEditorialStatus;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupStatus;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Asset Group.
 * <p/>
 * <p>
 * This class exposes the {@link #setAssetGroup} and {@link #getAssetGroup} that can be used to read and write
 * fields of the Asset Group record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Asset Group at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAssetGroup extends SingleRecordBulkEntity {

    private Long campaignId;

    private String campaignName;

    private AssetGroup assetGroup;

    private static final List<BulkMapping<BulkAssetGroup>> MAPPINGS;

    static {
        List<BulkMapping<BulkAssetGroup>> m = new ArrayList<BulkMapping<BulkAssetGroup>>();

        m.add(new SimpleBulkMapping<BulkAssetGroup, Long>(StringTable.Id,
                new Function<BulkAssetGroup, Long>() {
                    @Override
                    public Long apply(BulkAssetGroup c) {
                        return c.getAssetGroup().getId();
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Status,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return c.getAssetGroup().getStatus() != null ? c.getAssetGroup().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setStatus(StringExtensions.parseOptional(v, new Function<String, AssetGroupStatus>() {
                            @Override
                            public AssetGroupStatus apply(String value) {
                                return StringExtensions.fromValueOptional(value, AssetGroupStatus.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, Long>(StringTable.ParentId,
                new Function<BulkAssetGroup, Long>() {
                    @Override
                    public Long apply(BulkAssetGroup c) {
                        return c.getCampaignId();
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.setCampaignId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Campaign,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.AssetGroup,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return c.getAssetGroup().getName();
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.StartDate,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toDateBulkString(c.getAssetGroup().getStartDate());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        try {
                            c.getAssetGroup().setStartDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.EndDate,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toDateBulkString(c.getAssetGroup().getEndDate());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        try {
                            c.getAssetGroup().setEndDate(StringExtensions.parseDate(v));
                        } catch (ParseException ex) {
                            throw new UncheckedParseException(ex);
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.BusinessName,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return c.getAssetGroup().getBusinessName();
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setBusinessName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.CallToAction,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return c.getAssetGroup().getCallToAction() != null ? c.getAssetGroup().getCallToAction().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setCallToAction(StringExtensions.parseOptional(v, new Function<String, CallToAction>() {
                            @Override
                            public CallToAction apply(String value) {
                                return StringExtensions.fromValueOptional(value, CallToAction.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Descriptions,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toTextAssetLinksBulkString(c.getAssetGroup().getDescriptions());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setDescriptions(StringExtensions.parseTextAssetLinks(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.EditorialStatus,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup t) {
                        return t.getAssetGroup().getEditorialStatus() != null ? t.getAssetGroup().getEditorialStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setEditorialStatus(StringExtensions.<AssetGroupEditorialStatus>parseOptional(v, new Function<String, AssetGroupEditorialStatus>() {
                            @Override
                            public AssetGroupEditorialStatus apply(String value) {
                                return StringExtensions.fromValueOptional(value, AssetGroupEditorialStatus.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.FinalMobileUrl,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.writeUrls("; ", c.getAssetGroup().getFinalMobileUrls(), c.getAssetGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAssetGroup().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.FinalUrl,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.writeUrls("; ", c.getAssetGroup().getFinalUrls(), c.getAssetGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAssetGroup().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Headlines,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toTextAssetLinksBulkString(c.getAssetGroup().getHeadlines());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setHeadlines(StringExtensions.parseTextAssetLinks(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Images,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toImageAssetLinksBulkString(c.getAssetGroup().getImages());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setImages(StringExtensions.parseImageAssetLinks(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.LongHeadlines,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toTextAssetLinksBulkString(c.getAssetGroup().getLongHeadlines());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                    	c.getAssetGroup().setLongHeadlines(StringExtensions.parseTextAssetLinks(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Path1,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toOptionalBulkString(c.getAssetGroup().getPath1(), c.getAssetGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setPath1(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroup, String>(StringTable.Path2,
                new Function<BulkAssetGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroup c) {
                        return StringExtensions.toOptionalBulkString(c.getAssetGroup().getPath2(), c.getAssetGroup().getId());
                    }
                },
                new BiConsumer<String, BulkAssetGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroup c) {
                        c.getAssetGroup().setPath2(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAssetGroup(new AssetGroup());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAssetGroup(), "AssetGroup");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the identifier of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the identifier of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Gets the name of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign that contains the ad group.
     * <p/>
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the AssetGroup Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of AssetGroup properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public AssetGroup getAssetGroup() {
        return assetGroup;
    }

    /**
     * Sets the AssetGroup Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of AssetGroup properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setAssetGroup(AssetGroup assetGroup) {
        this.assetGroup = assetGroup;
    }
}

package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.campaignmanagement.Address;
import com.microsoft.bingads.campaignmanagement.BusinessGeoCodeStatus;
import com.microsoft.bingads.campaignmanagement.GeoPoint;
import com.microsoft.bingads.campaignmanagement.LocationAdExtension;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an location ad extension. This class exposes
 * properties that can be read
 * and written as fields of the Location Ad Extension record in a bulk file.
 *
 * <p>
 * For more information, see Location Ad Extension at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=511515">http://go.microsoft.com/fwlink/?LinkID=511515</a>
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkLocationAdExtension extends BulkAdExtension<LocationAdExtension> {

    /**
     * Gets the location ad extension.
     */
    public LocationAdExtension getLocationAdExtension() {
        return this.getAdExtension();
    }

    public void setLocationAdExtension(LocationAdExtension extension) {
        this.setAdExtension(extension);
    }

    private static final List<BulkMapping<BulkLocationAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkLocationAdExtension>> m = new ArrayList<BulkMapping<BulkLocationAdExtension>>();

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.BusinessName,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return c.getLocationAdExtension().getCompanyName();
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(String v, BulkLocationAdExtension c) {
                        c.getLocationAdExtension().setCompanyName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.PhoneNumber,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getLocationAdExtension().getPhoneNumber());
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(String v, BulkLocationAdExtension c) {
                        c.getLocationAdExtension().setPhoneNumber(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.GeoCodeStatus,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return StringExtensions.toGeoCodeStatusBulkString(c.getLocationAdExtension().getGeoCodeStatus());
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(String v, BulkLocationAdExtension c) {
                        c.getLocationAdExtension().setGeoCodeStatus(StringExtensions.<BusinessGeoCodeStatus>parseOptional(v, new Function<String, BusinessGeoCodeStatus>() {
                            @Override
                            public BusinessGeoCodeStatus apply(String value) {
                                return BusinessGeoCodeStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, Long>(StringTable.IconMediaId,
                new Function<BulkLocationAdExtension, Long>() {
                    @Override
                    public Long apply(BulkLocationAdExtension c) {
                        return c.getLocationAdExtension().getIconMediaId();
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(String v, BulkLocationAdExtension c) {
                        c.getLocationAdExtension().setIconMediaId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.AddressLine1,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getStreetAddress();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setStreetAddress(StringExtensions.getValueOrEmptyString(v));
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.AddressLine2,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return StringExtensions.toOptionalBulkString(x.getStreetAddress2());
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setStreetAddress2(StringExtensions.getValueOrEmptyString(v));
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.City,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getCityName();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setCityName(v);
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.ProvinceName,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getProvinceName();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setProvinceName(v);
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.StateOrProvince,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getProvinceCode();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setProvinceCode(v);
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.PostalCode,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getPostalCode();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setPostalCode(v);
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, String>(StringTable.CountryCode,
                new Function<BulkLocationAdExtension, String>() {
                    @Override
                    public String apply(BulkLocationAdExtension c) {
                        return getAddressPart(c, new Function<Address, String>() {
                            @Override
                            public String apply(Address x) {
                                return x.getCountryCode();
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setAddressPart(c, new Consumer<Address>() {
                            @Override
                            public void accept(Address x) {
                                x.setCountryCode(v);
                            }
                        });
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, Double>(StringTable.Latitude,
                new Function<BulkLocationAdExtension, Double>() {
                    @Override
                    public Double apply(BulkLocationAdExtension c) {
                        return getGeoPointPart(c, new Function<GeoPoint, Double>() {
                            @Override
                            public Double apply(GeoPoint x) {
                                return (x.getLatitudeInMicroDegrees() / 1000000.0);
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setGeoPointPart(c, new BiConsumer<GeoPoint, String>() {
                            @Override
                            public void accept(GeoPoint x, final String longitude) {
                                x.setLatitudeInMicroDegrees(StringExtensions.parseLatLngInMicroDegrees(longitude));
                            }
                        }, v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationAdExtension, Double>(StringTable.Longitude,
                new Function<BulkLocationAdExtension, Double>() {
                    @Override
                    public Double apply(BulkLocationAdExtension c) {
                        return getGeoPointPart(c, new Function<GeoPoint, Double>() {
                            @Override
                            public Double apply(GeoPoint x) {
                                return (x.getLongitudeInMicroDegrees() / 1000000.0);
                            }
                        });
                    }
                },
                new BiConsumer<String, BulkLocationAdExtension>() {
                    @Override
                    public void accept(final String v, BulkLocationAdExtension c) {
                        setGeoPointPart(c, new BiConsumer<GeoPoint, String>() {
                            @Override
                            public void accept(GeoPoint x, final String longitude) {
                                x.setLongitudeInMicroDegrees(StringExtensions.parseLatLngInMicroDegrees(longitude));
                            }
                        }, v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    private static String getAddressPart(BulkLocationAdExtension adExtension, Function<Address, String> getFunc) {
        return adExtension.getLocationAdExtension().getAddress() != null ? getFunc.apply(adExtension.getLocationAdExtension().getAddress()) : null;
    }

    private static void setAddressPart(BulkLocationAdExtension adExtension, Consumer<Address> setFunc) {
        if (adExtension.getLocationAdExtension().getAddress() == null) {
            adExtension.getLocationAdExtension().setAddress(new Address());
        }

        setFunc.accept(adExtension.getLocationAdExtension().getAddress());
    }

    private static Double getGeoPointPart(BulkLocationAdExtension adExtension, Function<GeoPoint, Double> getFunc) {
        return adExtension.getLocationAdExtension().getGeoPoint() != null ? getFunc.apply(adExtension.getLocationAdExtension().getGeoPoint()) : null;
    }

    private static void setGeoPointPart(BulkLocationAdExtension adExtension, BiConsumer<GeoPoint, String> setFunc, String value) {
        if (StringExtensions.isNullOrEmpty(value)) {
            return;
        }

        if (adExtension.getLocationAdExtension().getGeoPoint() == null) {
            adExtension.getLocationAdExtension().setGeoPoint(new GeoPoint());
        }

        setFunc.accept(adExtension.getLocationAdExtension().getGeoPoint(), value);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        LocationAdExtension extension = new LocationAdExtension();

        extension.setType("LocationAdExtension");
        
        this.setLocationAdExtension(extension);

        if (!StringExtensions.isNullOrEmpty(values.get(StringTable.Latitude)) || !StringExtensions.isNullOrEmpty(values.get(StringTable.Longitude))) {
            this.getLocationAdExtension().setGeoPoint(new GeoPoint());
        }

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getLocationAdExtension(), "LocationAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

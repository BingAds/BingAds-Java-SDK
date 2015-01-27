package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfCityTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfCountryTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfMetroAreaTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfPostalCodeTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfStateTargetBid;
import com.microsoft.bingads.campaignmanagement.CityTarget;
import com.microsoft.bingads.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.campaignmanagement.CountryTarget;
import com.microsoft.bingads.campaignmanagement.CountryTargetBid;
import com.microsoft.bingads.campaignmanagement.LocationTarget2;
import com.microsoft.bingads.campaignmanagement.MetroAreaTarget;
import com.microsoft.bingads.campaignmanagement.MetroAreaTargetBid;
import com.microsoft.bingads.campaignmanagement.PostalCodeTarget;
import com.microsoft.bingads.campaignmanagement.PostalCodeTargetBid;
import com.microsoft.bingads.campaignmanagement.StateTarget;
import com.microsoft.bingads.campaignmanagement.StateTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.ArrayList;
import java.util.List;

abstract class BulkLocationTargetWithStringLocation<TBid extends BulkLocationTargetBidWithStringLocation> extends BulkTargetWithLocation<TBid> {

    public BulkLocationTargetWithStringLocation(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    public PostalCodeTarget getPostalCodeTarget() {
        return getLocationProperty(new Function<LocationTarget2, PostalCodeTarget>() {
            @Override
            public PostalCodeTarget apply(LocationTarget2 t) {
                return t.getPostalCodeTarget();
            }
        });
    }

    public void setPostalCodeTarget(final PostalCodeTarget postalCodeTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setPostalCodeTarget(postalCodeTarget);
            }
        });
    }

    public CityTarget getCityTarget() {
        return getLocationProperty(new Function<LocationTarget2, CityTarget>() {
            @Override
            public CityTarget apply(LocationTarget2 t) {
                return t.getCityTarget();
            }
        });
    }

    public void setCityTarget(final CityTarget cityTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setCityTarget(cityTarget);
            }
        });
    }

    public MetroAreaTarget getMetroAreaTarget() {
        return getLocationProperty(new Function<LocationTarget2, MetroAreaTarget>() {
            @Override
            public MetroAreaTarget apply(LocationTarget2 t) {
                return t.getMetroAreaTarget();
            }
        });
    }

    public void setMetroAreaTarget(final MetroAreaTarget cityTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setMetroAreaTarget(cityTarget);
            }
        });
    }

    public StateTarget getStateTarget() {
        return getLocationProperty(new Function<LocationTarget2, StateTarget>() {
            @Override
            public StateTarget apply(LocationTarget2 t) {
                return t.getStateTarget();
            }
        });
    }

    public void setStateTarget(final StateTarget stateTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setStateTarget(stateTarget);
            }
        });
    }

    public CountryTarget getCountryTarget() {
        return getLocationProperty(new Function<LocationTarget2, CountryTarget>() {
            @Override
            public CountryTarget apply(LocationTarget2 t) {
                return t.getCountryTarget();
            }
        });
    }

    public void setCountryTarget(final CountryTarget countryTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setCountryTarget(countryTarget);
            }
        });
    }

    abstract void setPostalCodeBidAdditionialProperties(PostalCodeTargetBid postalCodeBid, TBid t);

    abstract void setCityBidAdditionialProperties(CityTargetBid cityBid, TBid t);

    abstract void setMetroAreaBidAdditionialProperties(MetroAreaTargetBid metroAreaBid, TBid t);

    abstract void setStateBidAdditionialProperties(StateTargetBid stateBid, TBid t);

    abstract void setCountryBidAdditionialProperties(CountryTargetBid countryBid, TBid t);

    @Override
    void reconstructSubTargets() {
        reconstructApiBids(LocationTargetType.POSTAL_CODE, new Function<TBid, PostalCodeTargetBid>() {
            @Override
            public PostalCodeTargetBid apply(TBid t) {
                PostalCodeTargetBid postalCodeBid = new PostalCodeTargetBid();

                postalCodeBid.setPostalCode(t.getLocation());

                setPostalCodeBidAdditionialProperties(postalCodeBid, t);

                return postalCodeBid;
            }
        }, new Supplier<PostalCodeTarget>() {
            @Override
            public PostalCodeTarget get() {
                return getLocation().getPostalCodeTarget();
            }
        }, new Supplier<PostalCodeTarget>() {
            @Override
            public PostalCodeTarget get() {
                return new PostalCodeTarget();
            }
        }, new Consumer<PostalCodeTarget>() {
            @Override
            public void accept(PostalCodeTarget t) {
                getLocation().setPostalCodeTarget(t);
            }
        }, new Supplier<List<PostalCodeTargetBid>>() {
            @Override
            public List<PostalCodeTargetBid> get() {
                return getLocation().getPostalCodeTarget().getBids().getPostalCodeTargetBids();
            }
        }, new Consumer<List<PostalCodeTargetBid>>() {
            @Override
            public void accept(List<PostalCodeTargetBid> t) {
                getLocation().getPostalCodeTarget().setBids(new ArrayOfPostalCodeTargetBid());

                getLocation().getPostalCodeTarget().getBids().getPostalCodeTargetBids().addAll(t);
            }
        });

        reconstructApiBids(LocationTargetType.CITY, new Function<TBid, CityTargetBid>() {
            @Override
            public CityTargetBid apply(TBid t) {
                CityTargetBid cityBid = new CityTargetBid();

                cityBid.setCity(t.getLocation());

                setCityBidAdditionialProperties(cityBid, t);

                return cityBid;
            }
        }, new Supplier<CityTarget>() {
            @Override
            public CityTarget get() {
                return getLocation().getCityTarget();
            }
        }, new Supplier<CityTarget>() {
            @Override
            public CityTarget get() {
                return new CityTarget();
            }
        }, new Consumer<CityTarget>() {
            @Override
            public void accept(CityTarget t) {
                getLocation().setCityTarget(t);
            }
        }, new Supplier<List<CityTargetBid>>() {
            @Override
            public List<CityTargetBid> get() {
                return getLocation().getCityTarget().getBids().getCityTargetBids();
            }
        }, new Consumer<List<CityTargetBid>>() {
            @Override
            public void accept(List<CityTargetBid> t) {
                getLocation().getCityTarget().setBids(new ArrayOfCityTargetBid());

                getLocation().getCityTarget().getBids().getCityTargetBids().addAll(t);
            }
        });

        reconstructApiBids(LocationTargetType.METRO_AREA, new Function<TBid, MetroAreaTargetBid>() {
            @Override
            public MetroAreaTargetBid apply(TBid t) {
                MetroAreaTargetBid metroArea = new MetroAreaTargetBid();

                metroArea.setMetroArea(t.getLocation());

                setMetroAreaBidAdditionialProperties(metroArea, t);

                return metroArea;
            }
        }, new Supplier<MetroAreaTarget>() {
            @Override
            public MetroAreaTarget get() {
                return getLocation().getMetroAreaTarget();
            }
        }, new Supplier<MetroAreaTarget>() {
            @Override
            public MetroAreaTarget get() {
                return new MetroAreaTarget();
            }
        }, new Consumer<MetroAreaTarget>() {
            @Override
            public void accept(MetroAreaTarget t) {
                getLocation().setMetroAreaTarget(t);
            }
        }, new Supplier<List<MetroAreaTargetBid>>() {
            @Override
            public List<MetroAreaTargetBid> get() {
                return getLocation().getMetroAreaTarget().getBids().getMetroAreaTargetBids();
            }
        }, new Consumer<List<MetroAreaTargetBid>>() {
            @Override
            public void accept(List<MetroAreaTargetBid> t) {
                getLocation().getMetroAreaTarget().setBids(new ArrayOfMetroAreaTargetBid());

                getLocation().getMetroAreaTarget().getBids().getMetroAreaTargetBids().addAll(t);
            }
        });

        reconstructApiBids(LocationTargetType.STATE, new Function<TBid, StateTargetBid>() {
            @Override
            public StateTargetBid apply(TBid t) {
                StateTargetBid stateBid = new StateTargetBid();

                stateBid.setState(t.getLocation());

                setStateBidAdditionialProperties(stateBid, t);

                return stateBid;
            }
        }, new Supplier<StateTarget>() {
            @Override
            public StateTarget get() {
                return getLocation().getStateTarget();
            }
        }, new Supplier<StateTarget>() {
            @Override
            public StateTarget get() {
                return new StateTarget();
            }
        }, new Consumer<StateTarget>() {
            @Override
            public void accept(StateTarget t) {
                getLocation().setStateTarget(t);
            }
        }, new Supplier<List<StateTargetBid>>() {
            @Override
            public List<StateTargetBid> get() {
                return getLocation().getStateTarget().getBids().getStateTargetBids();
            }
        }, new Consumer<List<StateTargetBid>>() {
            @Override
            public void accept(List<StateTargetBid> t) {
                getLocation().getStateTarget().setBids(new ArrayOfStateTargetBid());

                getLocation().getStateTarget().getBids().getStateTargetBids().addAll(t);
            }
        });

        reconstructApiBids(LocationTargetType.COUNTRY, new Function<TBid, CountryTargetBid>() {
            @Override
            public CountryTargetBid apply(TBid t) {
                CountryTargetBid countryBid = new CountryTargetBid();

                countryBid.setCountryAndRegion(t.getLocation());

                setCountryBidAdditionialProperties(countryBid, t);

                return countryBid;
            }
        }, new Supplier<CountryTarget>() {
            @Override
            public CountryTarget get() {
                return getLocation().getCountryTarget();
            }
        }, new Supplier<CountryTarget>() {
            @Override
            public CountryTarget get() {
                return new CountryTarget();
            }
        }, new Consumer<CountryTarget>() {
            @Override
            public void accept(CountryTarget t) {
                getLocation().setCountryTarget(t);
            }
        }, new Supplier<List<CountryTargetBid>>() {
            @Override
            public List<CountryTargetBid> get() {
                return getLocation().getCountryTarget().getBids().getCountryTargetBids();
            }
        }, new Consumer<List<CountryTargetBid>>() {
            @Override
            public void accept(List<CountryTargetBid> t) {
                getLocation().getCountryTarget().setBids(new ArrayOfCountryTargetBid());

                getLocation().getCountryTarget().getBids().getCountryTargetBids().addAll(t);
            }
        });
    }

    abstract boolean shouldConvertPostalCodeTargetBid(PostalCodeTargetBid bid);

    abstract boolean shouldConvertCityTargetBid(CityTargetBid bid);

    abstract boolean shouldConvertMetroAreaTargetBid(MetroAreaTargetBid bid);

    abstract boolean shouldConvertStateTargetBid(StateTargetBid bid);

    abstract boolean shouldConvertCountryTargetBid(CountryTargetBid bid);

    abstract void setBulkPostalCodeBidAdditionalProperties(TBid bulkBid, PostalCodeTargetBid postalCodeTargetBid);

    abstract void setBulkCityBidAdditionalProperties(TBid bulkBid, CityTargetBid cityTargetBid);

    abstract void setBulkMetroAreaBidAdditionalProperties(TBid bulkBid, MetroAreaTargetBid metroAreaTargetBid);

    abstract void setBulkStateBidAdditionalProperties(TBid bulkBid, StateTargetBid stateTargetBid);

    abstract void setBulkCountryBidAdditionalProperties(TBid bulkBid, CountryTargetBid countryTargetBid);

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bids = new ArrayList<TBid>();

        convertBidsFromApi(LocationTargetType.POSTAL_CODE,
                bids,
                new Supplier<PostalCodeTarget>() {
                    @Override
                    public PostalCodeTarget get() {
                        return getLocation().getPostalCodeTarget();
                    }
                }, new Function<PostalCodeTarget, List<PostalCodeTargetBid>>() {
                    @Override
                    public List<PostalCodeTargetBid> apply(PostalCodeTarget t) {
                        return t.getBids() != null ? t.getBids().getPostalCodeTargetBids() : null;
                    }
                }, new Function<PostalCodeTargetBid, String>() {
                    @Override
                    public String apply(PostalCodeTargetBid t) {
                        return t.getPostalCode();
                    }
                }, new Function<PostalCodeTargetBid, Integer>() {
                    @Override
                    public Integer apply(PostalCodeTargetBid t) {
                        return t.getBidAdjustment();
                    }
                }, new Function<PostalCodeTargetBid, Boolean>() {
                    @Override
                    public Boolean apply(PostalCodeTargetBid t) {
                        return shouldConvertPostalCodeTargetBid(t);
                    }
                });

        convertBidsFromApi(LocationTargetType.CITY,
                bids,
                new Supplier<CityTarget>() {
                    @Override
                    public CityTarget get() {
                        return getLocation().getCityTarget();
                    }
                }, new Function<CityTarget, List<CityTargetBid>>() {
                    @Override
                    public List<CityTargetBid> apply(CityTarget t) {
                        return t.getBids() != null ? t.getBids().getCityTargetBids() : null;
                    }
                }, new Function<CityTargetBid, String>() {
                    @Override
                    public String apply(CityTargetBid t) {
                        return t.getCity();
                    }
                }, new Function<CityTargetBid, Integer>() {
                    @Override
                    public Integer apply(CityTargetBid t) {
                        return t.getBidAdjustment();
                    }
                }, new Function<CityTargetBid, Boolean>() {
                    @Override
                    public Boolean apply(CityTargetBid t) {
                        return shouldConvertCityTargetBid(t);
                    }
                });

        convertBidsFromApi(LocationTargetType.METRO_AREA,
                bids,
                new Supplier<MetroAreaTarget>() {
                    @Override
                    public MetroAreaTarget get() {
                        return getLocation().getMetroAreaTarget();
                    }
                }, new Function<MetroAreaTarget, List<MetroAreaTargetBid>>() {
                    @Override
                    public List<MetroAreaTargetBid> apply(MetroAreaTarget t) {
                        return t.getBids() != null ? t.getBids().getMetroAreaTargetBids() : null;
                    }
                }, new Function<MetroAreaTargetBid, String>() {
                    @Override
                    public String apply(MetroAreaTargetBid t) {
                        return t.getMetroArea();
                    }
                }, new Function<MetroAreaTargetBid, Integer>() {
                    @Override
                    public Integer apply(MetroAreaTargetBid t) {
                        return t.getBidAdjustment();
                    }
                }, new Function<MetroAreaTargetBid, Boolean>() {
                    @Override
                    public Boolean apply(MetroAreaTargetBid t) {
                        return shouldConvertMetroAreaTargetBid(t);
                    }
                });

        convertBidsFromApi(LocationTargetType.STATE,
                bids,
                new Supplier<StateTarget>() {
                    @Override
                    public StateTarget get() {
                        return getLocation().getStateTarget();
                    }
                }, new Function<StateTarget, List<StateTargetBid>>() {
                    @Override
                    public List<StateTargetBid> apply(StateTarget t) {
                        return t.getBids() != null ? t.getBids().getStateTargetBids() : null;
                    }
                }, new Function<StateTargetBid, String>() {
                    @Override
                    public String apply(StateTargetBid t) {
                        return t.getState();
                    }
                }, new Function<StateTargetBid, Integer>() {
                    @Override
                    public Integer apply(StateTargetBid t) {
                        return t.getBidAdjustment();
                    }
                }, new Function<StateTargetBid, Boolean>() {
                    @Override
                    public Boolean apply(StateTargetBid t) {
                        return shouldConvertStateTargetBid(t);
                    }
                });

        convertBidsFromApi(LocationTargetType.COUNTRY,
                bids,
                new Supplier<CountryTarget>() {
                    @Override
                    public CountryTarget get() {
                        return getLocation().getCountryTarget();
                    }
                }, new Function<CountryTarget, List<CountryTargetBid>>() {
                    @Override
                    public List<CountryTargetBid> apply(CountryTarget t) {
                        return t.getBids() != null ? t.getBids().getCountryTargetBids() : null;
                    }
                }, new Function<CountryTargetBid, String>() {
                    @Override
                    public String apply(CountryTargetBid t) {
                        return t.getCountryAndRegion();
                    }
                }, new Function<CountryTargetBid, Integer>() {
                    @Override
                    public Integer apply(CountryTargetBid t) {
                        return t.getBidAdjustment();
                    }
                }, new Function<CountryTargetBid, Boolean>() {
                    @Override
                    public Boolean apply(CountryTargetBid t) {
                        return shouldConvertCountryTargetBid(t);
                    }
                });

        return bids;
    }

    @Override
    void validatePropertiesNotNull() {
        if (getCityTarget() == null && getMetroAreaTarget() == null && getStateTarget() == null && getCountryTarget() == null && getPostalCodeTarget() == null) {
            throw new IllegalStateException("At least one location sub target must be not null.");
        }
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getCityTarget() != null) {
            validateListNotNullOrEmpty(getCityTarget().getBids(), getCityTarget().getBids().getCityTargetBids(), "CityTarget.Bids");
        }

        if (getMetroAreaTarget() != null) {
            validateListNotNullOrEmpty(getMetroAreaTarget().getBids(), getMetroAreaTarget().getBids().getMetroAreaTargetBids(), "MetroAreaTarget.Bids");
        }

        if (getCountryTarget() != null) {
            validateListNotNullOrEmpty(getCountryTarget().getBids(), getCountryTarget().getBids().getCountryTargetBids(), "CountryTarget.Bids");
        }

        if (getStateTarget() != null) {
            validateListNotNullOrEmpty(getStateTarget().getBids(), getStateTarget().getBids().getStateTargetBids(), "StateTarget.Bids");
        }

        if (getPostalCodeTarget() != null) {
            validateListNotNullOrEmpty(getPostalCodeTarget().getBids(), getPostalCodeTarget().getBids().getPostalCodeTargetBids(), "PostalCodeTarget.Bids");
        }
    }

    protected <TApiBid, TTarget> void reconstructApiBids(LocationTargetType locationType,
            Function<TBid, TApiBid> createBid,
            Supplier<TTarget> getTarget,
            Supplier<TTarget> createNewTarget,
            Consumer<TTarget> setTarget,
            Supplier<List<TApiBid>> getBids,
            Consumer<List<TApiBid>> setBids) {
        List<TBid> bulkBidsForLocationType = new ArrayList<TBid>();

        for (TBid bulkBid : getBids()) {
            if (bulkBid.getLocationType() == locationType) {
                bulkBidsForLocationType.add(bulkBid);
            }
        }

        reconstructApiBids(bulkBidsForLocationType, createBid, getTarget, createNewTarget, setTarget, getBids, setBids);
    }

    protected <T, TTarget> void convertBidsFromApi(final LocationTargetType locationType,
            List<TBid> bids,
            Supplier<TTarget> getTarget,
            Function<TTarget, List<T>> getBids,
            final Function<T, String> getLocation,
            final Function<T, Integer> getBidAdjustment,
            Function<T, Boolean> shouldConvertBid
    ) {
        convertBidsFromApi(bids, getTarget, getBids, new BiConsumer<TBid, T>() {
            @Override
            public void accept(TBid bid, T rawBid) {
                bid.setLocationType(locationType);
                bid.setLocation(getLocation.apply(rawBid));

                if (rawBid instanceof CityTargetBid) {
                    setBulkCityBidAdditionalProperties(bid, (CityTargetBid) rawBid);
                } else if (rawBid instanceof MetroAreaTargetBid) {
                    setBulkMetroAreaBidAdditionalProperties(bid, (MetroAreaTargetBid) rawBid);
                } else if (rawBid instanceof StateTargetBid) {
                    setBulkStateBidAdditionalProperties(bid, (StateTargetBid) rawBid);
                } else if (rawBid instanceof CountryTargetBid) {
                    setBulkCountryBidAdditionalProperties(bid, (CountryTargetBid) rawBid);
                } else if (rawBid instanceof PostalCodeTargetBid) {
                    setBulkPostalCodeBidAdditionalProperties(bid, (PostalCodeTargetBid) rawBid);
                } else {
                    throw new UnsupportedOperationException("unsupported bid type");
                }
            }
        }, shouldConvertBid);
    }
}

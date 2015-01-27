package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.campaignmanagement.CountryTargetBid;
import com.microsoft.bingads.campaignmanagement.MetroAreaTargetBid;
import com.microsoft.bingads.campaignmanagement.PostalCodeTargetBid;
import com.microsoft.bingads.campaignmanagement.StateTargetBid;
import java.util.List;

abstract class BulkLocationTarget<TBid extends BulkLocationTargetBid> extends BulkLocationTargetWithStringLocation<TBid> {

    public BulkLocationTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    boolean shouldConvertPostalCodeTargetBid(PostalCodeTargetBid bid) {
        return !bid.isIsExcluded();
    }
    
    @Override
    void setPostalCodeBidAdditionialProperties(PostalCodeTargetBid postalCodeBid, TBid t) {
        postalCodeBid.setBidAdjustment(t.getBidAdjustment());
    }
    
    @Override
    void setBulkPostalCodeBidAdditionalProperties(TBid bulkBid, PostalCodeTargetBid postalCodeTargetBid) {
        bulkBid.setBidAdjustment(postalCodeTargetBid.getBidAdjustment());
    }
    
    @Override
    boolean shouldConvertCityTargetBid(CityTargetBid bid) {
        return !bid.isIsExcluded();
    }
    
    @Override
    void setCityBidAdditionialProperties(CityTargetBid cityBid, TBid t) {
        cityBid.setBidAdjustment(t.getBidAdjustment());
    }
    
    @Override
    void setBulkCityBidAdditionalProperties(TBid bulkBid, CityTargetBid cityTargetBid) {
        bulkBid.setBidAdjustment(cityTargetBid.getBidAdjustment());
    }

    @Override
    boolean shouldConvertMetroAreaTargetBid(MetroAreaTargetBid bid) {
        return !bid.isIsExcluded();
    }           

    @Override
    void setMetroAreaBidAdditionialProperties(MetroAreaTargetBid metroAreaBid, TBid t) {
        metroAreaBid.setBidAdjustment(t.getBidAdjustment());
    }           

    @Override
    void setBulkMetroAreaBidAdditionalProperties(TBid bulkBid, MetroAreaTargetBid metroAreaTargetBid) {
        bulkBid.setBidAdjustment(metroAreaTargetBid.getBidAdjustment());
    }
    
    @Override
    boolean shouldConvertStateTargetBid(StateTargetBid bid) {
        return !bid.isIsExcluded();
    }
    
    @Override
    void setStateBidAdditionialProperties(StateTargetBid cityBid, TBid t) {
        cityBid.setBidAdjustment(t.getBidAdjustment());
    }
    
    @Override
    void setBulkStateBidAdditionalProperties(TBid bulkBid, StateTargetBid stateTargetBid) {
        bulkBid.setBidAdjustment(stateTargetBid.getBidAdjustment());
    }
    
    @Override
    boolean shouldConvertCountryTargetBid(CountryTargetBid bid) {
        return !bid.isIsExcluded();
    }
    
    @Override
    void setCountryBidAdditionialProperties(CountryTargetBid cityBid, TBid t) {
        cityBid.setBidAdjustment(t.getBidAdjustment());
    }
    
    @Override
    void setBulkCountryBidAdditionalProperties(TBid bulkBid, CountryTargetBid countryTargetBid) {
        bulkBid.setBidAdjustment(countryTargetBid.getBidAdjustment());
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = super.convertApiToBulkBids();

        for (TBid bid : bulkBids) {
            bid.setIntentOption(getLocation().getIntentOption());
        }

        return bulkBids;
    }

    @Override
    void reconstructSubTargets() {
        super.reconstructSubTargets();

        if (!getBids().isEmpty()) {
            getLocation().setIntentOption(getBids().get(0).getIntentOption());
        }
    }
}

package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.campaignmanagement.CountryTargetBid;
import com.microsoft.bingads.campaignmanagement.MetroAreaTargetBid;
import com.microsoft.bingads.campaignmanagement.PostalCodeTargetBid;
import com.microsoft.bingads.campaignmanagement.StateTargetBid;

/**
 * A base class for all bulk negative location target classes, for example {@link BulkAdGroupNegativeLocationTarget}.
 *
 * @param <TBid> see {@link BulkNegativeLocationTargetBid}
 */
abstract class BulkNegativeLocationTarget<TBid extends BulkNegativeLocationTargetBid> extends BulkLocationTargetWithStringLocation<TBid> {    

    public BulkNegativeLocationTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }   

    @Override
    void setPostalCodeBidAdditionialProperties(PostalCodeTargetBid postalCodeBid, TBid t) {
        postalCodeBid.setIsExcluded(true);
    }

    @Override
    boolean shouldConvertPostalCodeTargetBid(PostalCodeTargetBid bid) {
        return bid.isIsExcluded();
    }

    @Override
    void setBulkPostalCodeBidAdditionalProperties(TBid bulkBid, PostalCodeTargetBid postalCodeTargetBid) {
        postalCodeTargetBid.setIsExcluded(true);
    }
    
    @Override
    void setCityBidAdditionialProperties(CityTargetBid cityBid, TBid t) {
        cityBid.setIsExcluded(true);
    }

    @Override
    boolean shouldConvertCityTargetBid(CityTargetBid bid) {
        return bid.isIsExcluded();
    }

    @Override
    void setBulkCityBidAdditionalProperties(TBid bulkBid, CityTargetBid cityTargetBid) {
        cityTargetBid.setIsExcluded(true);
    }

    @Override
    void setMetroAreaBidAdditionialProperties(MetroAreaTargetBid metroAreBid, TBid t) {
        metroAreBid.setIsExcluded(true);
    }

    @Override
    boolean shouldConvertMetroAreaTargetBid(MetroAreaTargetBid bid) {
        return bid.isIsExcluded();
    }

    @Override
    void setBulkMetroAreaBidAdditionalProperties(TBid bulkBid, MetroAreaTargetBid metroAreaTargetBid) {
        metroAreaTargetBid.setIsExcluded(true);
    }
        
    @Override
    void setStateBidAdditionialProperties(StateTargetBid stateBid, TBid t) {
        stateBid.setIsExcluded(true);
    }

    @Override
    boolean shouldConvertStateTargetBid(StateTargetBid bid) {
        return bid.isIsExcluded();
    }

    @Override
    void setBulkStateBidAdditionalProperties(TBid bulkBid, StateTargetBid stateTargetBid) {
        stateTargetBid.setIsExcluded(true);
    }
 
    @Override
    void setCountryBidAdditionialProperties(CountryTargetBid cityBid, TBid t) {
        cityBid.setIsExcluded(true);
    }

    @Override
    boolean shouldConvertCountryTargetBid(CountryTargetBid bid) {
        return bid.isIsExcluded();
    }

    @Override
    void setBulkCountryBidAdditionalProperties(TBid bulkBid, CountryTargetBid countryTargetBid) {
        countryTargetBid.setIsExcluded(true);
    }
}
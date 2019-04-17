package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.Date;

public class DateComparer implements EqualityComparerWithDescription<Date>{

    @Override
    public Boolean equals(Date x, Date y) {
        return x.getDay() == y.getDay() &&
               x.getMonth() == y.getMonth() &&
               x.getYear() == y.getYear();
    }

    @Override
    public String getDescription(Date obj) {
        return String.format("Year: %s, Month: %s, Day: %s", obj.getYear(), obj.getMonth(), obj.getDay());
    }    
}

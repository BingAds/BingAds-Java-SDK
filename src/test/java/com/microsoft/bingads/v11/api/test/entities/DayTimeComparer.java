package com.microsoft.bingads.v11.api.test.entities;

import com.microsoft.bingads.v11.campaignmanagement.DayTime;

public class DayTimeComparer implements EqualityComparerWithDescription<DayTime>{

    @Override
    public Boolean equals(DayTime x, DayTime y) {
        return x.getDay() == y.getDay() &&
               x.getStartHour() == y.getStartHour() &&
               x.getStartMinute() == y.getStartMinute() &&
               x.getEndHour() == y.getEndHour() && 
               x.getEndMinute() == y.getEndMinute();
    }

    @Override
    public String getDescription(DayTime obj) {
        return String.format("Day: %s, StartHour: %s, StartMinute: %s, EndHour: %s, EndMinute: %s", 
        		obj.getDay(), obj.getStartHour(), obj.getStartMinute(), obj.getEndHour(), obj.getEndMinute());
    }    
}

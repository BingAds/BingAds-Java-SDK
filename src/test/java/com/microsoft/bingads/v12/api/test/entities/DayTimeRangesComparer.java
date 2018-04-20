package com.microsoft.bingads.v12.api.test.entities;

import com.microsoft.bingads.v12.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v12.campaignmanagement.DayTime;

public class DayTimeRangesComparer implements EqualityComparerWithDescription<ArrayOfDayTime>{

	@Override
    public Boolean equals(ArrayOfDayTime x, ArrayOfDayTime y) {
        if (x.getDayTimes().size() != y.getDayTimes().size()) {
            return false;
        }
        
        for (Integer i = 0; i < x.getDayTimes().size(); i++) {
            if ((y.getDayTimes().get(i) == null ? x.getDayTimes().get(i) != null : !dayTimeCompare(y.getDayTimes().get(i), x.getDayTimes().get(i)))) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public String getDescription(ArrayOfDayTime obj) {
        String result = "";
        
        for (DayTime dt : obj.getDayTimes()) {
            result += String.format("Day: %s, StartHour: %s, StartMinute: %s, EndHour: %s, EndMinute: %s", 
            		dt.getDay(), dt.getStartHour(), dt.getStartMinute(), dt.getEndHour(), dt.getEndMinute());
        }
        
        return result;
    }
    
    private boolean dayTimeCompare(DayTime x, DayTime y) {
    	return x.getDay() == y.getDay() &&
                x.getStartHour() == y.getStartHour() &&
                x.getStartMinute() == y.getStartMinute() &&
                x.getEndHour() == y.getEndHour() && 
                x.getEndMinute() == y.getEndMinute();
    }
}

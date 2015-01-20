/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.api.test.entities;

import com.microsoft.bingads.campaignmanagement.Date;

public class DateComparer implements EqualityComparerWithDescription<Date>{

    @Override
    public Boolean equals(Date x, Date y) {
        return x.getDay() == y.getDay() &&
               x.getMonth() == y.getMonth() &&
               x.getYear() == y.getYear();
    }

    @Override
    public String getDescripition(Date obj) {
        return String.format("Year: %s, Month: %s, Day: %s", obj.getYear(), obj.getMonth(), obj.getDay());
    }    
}

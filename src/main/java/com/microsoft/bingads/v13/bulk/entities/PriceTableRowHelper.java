package com.microsoft.bingads.v13.bulk.entities;

import java.util.List;

import com.microsoft.bingads.v13.campaignmanagement.ArrayOfPriceTableRow;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.PriceQualifier;
import com.microsoft.bingads.v13.campaignmanagement.PriceTableRow;
import com.microsoft.bingads.v13.campaignmanagement.PriceUnit;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

class PriceTableRowHelper {

    public static final int MaxNumberOfPriceTableRows = 8;

    public static void addRowValuesFromPriceTableRows(ArrayOfPriceTableRow arrayOfPriceTableRow, RowValues rowValues, Long id) {
        List<PriceTableRow> priceTableRows = arrayOfPriceTableRow.getPriceTableRows();
        for (int i = 1; i <= priceTableRows.size(); i++) {
            rowValues.put(StringTable.CurrencyCodeColumnPrefix + i, priceTableRows.get(i - 1).getCurrencyCode());
            rowValues.put(StringTable.PriceDescriptionColumnPrefix + i, priceTableRows.get(i - 1).getDescription());
            rowValues.put(StringTable.HeaderColumnPrefix + i, priceTableRows.get(i - 1).getHeader());
            rowValues.put(StringTable.FinalMobileUrlColumnPrefix + i, StringExtensions.writeUrls("; ", priceTableRows.get(i - 1).getFinalMobileUrls(), id));
            rowValues.put(StringTable.FinalUrlColumnPrefix + i, StringExtensions.writeUrls("; ", priceTableRows.get(i - 1).getFinalUrls(), id));
            rowValues.put(StringTable.PriceColumnPrefix + i, StringExtensions.toBulkString(priceTableRows.get(i - 1).getPrice()));
            rowValues.put(StringTable.PriceQualifierColumnPrefix + i, priceTableRows.get(i - 1).getPriceQualifier().value());
            rowValues.put(StringTable.PriceUnitColumnPrefix + i, priceTableRows.get(i - 1).getPriceUnit().value());
        }
    }

    public static void addPriceTableRowsFromRowValues(RowValues values,
    		ArrayOfPriceTableRow arrayOfPriceTableRow) {
        List<PriceTableRow> priceTableRows = arrayOfPriceTableRow.getPriceTableRows();;

        for (int i = 1; i <= MaxNumberOfPriceTableRows; i++) {
            String currencyCode;
            String priceDescription;
            String header;
            String finalMobileUrl;
            String finalUrl;
            String price;
            String priceQualifier;
            String priceUnit;

            currencyCode = values.tryGet(StringTable.CurrencyCodeColumnPrefix + i);
            priceDescription = values.tryGet(StringTable.PriceDescriptionColumnPrefix + i);
            header = values.tryGet(StringTable.HeaderColumnPrefix + i);
            finalMobileUrl = values.tryGet(StringTable.FinalMobileUrlColumnPrefix + i);
            finalUrl = values.tryGet(StringTable.FinalUrlColumnPrefix + i);
            price = values.tryGet(StringTable.PriceColumnPrefix + i);
            priceQualifier = values.tryGet(StringTable.PriceQualifierColumnPrefix + i);
            priceUnit = values.tryGet(StringTable.PriceUnitColumnPrefix + i);

            if (price != null && !price.isEmpty() &&
                priceQualifier != null && !priceQualifier.isEmpty() &&
                priceUnit != null && !priceUnit.isEmpty()) {
                
            	PriceTableRow priceTableRow = new PriceTableRow();
                priceTableRow.setCurrencyCode(currencyCode);
                priceTableRow.setDescription(priceDescription);
                priceTableRow.setHeader(header);

                ArrayOfstring finalMobileUrls = new ArrayOfstring();
                List<String> urls = StringExtensions.parseUrls(finalMobileUrl);
                if(urls == null) {
                    finalMobileUrls = null;
                } else {
                    finalMobileUrls.getStrings().addAll(urls);
                }
                priceTableRow.setFinalMobileUrls(finalMobileUrls);

                ArrayOfstring finalUrls = new ArrayOfstring();
                urls = StringExtensions.parseUrls(finalUrl);
                if(urls == null) {
                    finalUrls = null;
                } else {
                    finalUrls.getStrings().addAll(urls);
                }
                priceTableRow.setFinalUrls(finalUrls);

                priceTableRow.setPrice(StringExtensions.nullOrDouble(price));
                priceTableRow.setPriceQualifier(StringExtensions.fromValueOptional(priceQualifier, PriceQualifier.class));
                priceTableRow.setPriceUnit(StringExtensions.fromValueOptional(priceUnit, PriceUnit.class));
                priceTableRows.add(priceTableRow);
            }
        }
    }
}

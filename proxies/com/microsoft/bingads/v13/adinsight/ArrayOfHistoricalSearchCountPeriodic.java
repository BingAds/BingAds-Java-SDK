
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHistoricalSearchCountPeriodic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHistoricalSearchCountPeriodic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HistoricalSearchCountPeriodic" type="{https://bingads.microsoft.com/AdInsight/v13}HistoricalSearchCountPeriodic" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHistoricalSearchCountPeriodic", propOrder = {
    "historicalSearchCountPeriodics"
})
public class ArrayOfHistoricalSearchCountPeriodic {

    @XmlElement(name = "HistoricalSearchCountPeriodic", nillable = true)
    protected List<HistoricalSearchCountPeriodic> historicalSearchCountPeriodics;
    public ArrayOfHistoricalSearchCountPeriodic()
    {
      this.historicalSearchCountPeriodics = new ArrayList<HistoricalSearchCountPeriodic>();
    }
    @JsonCreator
    public ArrayOfHistoricalSearchCountPeriodic(List<HistoricalSearchCountPeriodic> historicalsearchcountperiodics)
    {
      this.historicalSearchCountPeriodics = historicalsearchcountperiodics;
    }

    /**
     * Gets the value of the historicalSearchCountPeriodics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the historicalSearchCountPeriodics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalSearchCountPeriodics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricalSearchCountPeriodic }
     * 
     * 
     * @return
     *     The value of the historicalSearchCountPeriodics property.
     */
    public List<HistoricalSearchCountPeriodic> getHistoricalSearchCountPeriodics() {
        if (historicalSearchCountPeriodics == null) {
            historicalSearchCountPeriodics = new ArrayList<>();
        }
        return this.historicalSearchCountPeriodics;
    }

}

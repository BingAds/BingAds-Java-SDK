
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LabelAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="LabelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelAssociation", propOrder = {
    "entityId",
    "labelId"
})
public class LabelAssociation {

    @XmlElement(name = "EntityId")
    protected long entityId;
    @XmlElement(name = "LabelId")
    protected long labelId;

    /**
     * Gets the value of the entityId property.
     * 
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     */
    public long getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     */
    public void setLabelId(long value) {
        this.labelId = value;
    }

}

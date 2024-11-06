
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUserInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UserInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}UserInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserInfo", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "userInfos"
})
public class ArrayOfUserInfo {

    @XmlElement(name = "UserInfo", nillable = true)
    protected List<UserInfo> userInfos;
    public ArrayOfUserInfo()
    {
      this.userInfos = new ArrayList<UserInfo>();
    }
    @JsonCreator
    public ArrayOfUserInfo(List<UserInfo> userinfos)
    {
      this.userInfos = userinfos;
    }

    /**
     * Gets the value of the userInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the userInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInfo }
     * 
     * 
     * @return
     *     The value of the userInfos property.
     */
    public List<UserInfo> getUserInfos() {
        if (userInfos == null) {
            userInfos = new ArrayList<>();
        }
        return this.userInfos;
    }

}

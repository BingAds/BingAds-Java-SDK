
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InMarketAudience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InMarketAudience">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InMarketAudience")
public class InMarketAudience
    extends Audience
{
    public InMarketAudience() {
      this.type = Collections.singletonList(AudienceType.fromValue("InMarket"));
    }


}

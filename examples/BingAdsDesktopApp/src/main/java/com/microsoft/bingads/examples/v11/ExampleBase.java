package com.microsoft.bingads.examples.v11;

import com.microsoft.bingads.v11.campaignmanagement.AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.LocationAdExtension;

public class ExampleBase extends com.microsoft.bingads.examples.ExampleBase {
	
    public ExampleBase(){}
    
    static AdExtension setReadOnlyAdExtensionElementsToNull(AdExtension extension)
    {
        if (extension == null || extension.getId() == null)
        {
            return extension;
        }
        else
        {
            // Set to null for all extension types.
            extension.setVersion(null);

            if (extension instanceof LocationAdExtension)
            {
                ((LocationAdExtension)extension).setGeoCodeStatus(null);
            }
            return extension;
        }
    }    
}

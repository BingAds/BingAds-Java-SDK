package com.microsoft.bingads.internal;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.feature.Feature;

public class CxfUtils {
    public static <T> T runOnNewBus(Supplier<T> func, Consumer<LoggingFeature> customizeLogging) {
        Bus newBus = BusFactory.newInstance().createBus();

        for (Feature feature : newBus.getFeatures()) {
            if (feature instanceof LoggingFeature) {
                LoggingFeature loggingFeature = (LoggingFeature)feature;
                
                customizeLogging.accept(loggingFeature);

                break;
            }
        }

        Bus oldBus = BusFactory.getAndSetThreadDefaultBus(newBus);

        try {
            return func.get();
        } finally {
            BusFactory.setThreadDefaultBus(oldBus);
        }
    }
}
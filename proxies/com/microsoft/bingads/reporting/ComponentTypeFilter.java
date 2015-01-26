package com.microsoft.bingads.reporting;

/**
 * Enum class for ComponentTypeFilter.
 */
public enum ComponentTypeFilter {

    BASIC("Basic"),
    DEEPLINK("Deeplink"),
    FORM("Form"),
    IMAGE("Image"),
    FAVORITE_ICON("FavoriteIcon"),
    VIDEO("Video"),
    TITLED_LINK("TitledLink"),
    UNKNOWN("Unknown");
        
    private final String value;

    ComponentTypeFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentTypeFilter fromValue(String v) {
        for (ComponentTypeFilter c : ComponentTypeFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
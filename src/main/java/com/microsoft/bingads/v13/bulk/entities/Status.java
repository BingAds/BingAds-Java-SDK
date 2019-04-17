package com.microsoft.bingads.v13.bulk.entities;

/**
 * Provides possible status values for bulk entities.
 */
public enum Status {

    /**
     * The bulk entity is associated with the entity identified by the bulk
     * record's 'Parent Id'.
     */
    ACTIVE("Active"),
    /**
     * The bulk entity is not associated with the entity identified by the bulk
     * record's 'Parent Id'. In a bulk upload file, you can use this value to
     * delete the association of an entity from the parent entity.
     */
    DELETED("Deleted");

    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c : Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}


package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecretQuestion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecretQuestion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="FavoritePetsName"/>
 *     <enumeration value="FavoriteMovie"/>
 *     <enumeration value="Anniversary"/>
 *     <enumeration value="FatherMiddleName"/>
 *     <enumeration value="SpouseMiddleName"/>
 *     <enumeration value="FirstChildMiddleName"/>
 *     <enumeration value="HighSchoolName"/>
 *     <enumeration value="FavoriteTeacherName"/>
 *     <enumeration value="FavoriteSportsTeam"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecretQuestion", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum SecretQuestion {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("FavoritePetsName")
    FAVORITE_PETS_NAME("FavoritePetsName"),
    @XmlEnumValue("FavoriteMovie")
    FAVORITE_MOVIE("FavoriteMovie"),
    @XmlEnumValue("Anniversary")
    ANNIVERSARY("Anniversary"),
    @XmlEnumValue("FatherMiddleName")
    FATHER_MIDDLE_NAME("FatherMiddleName"),
    @XmlEnumValue("SpouseMiddleName")
    SPOUSE_MIDDLE_NAME("SpouseMiddleName"),
    @XmlEnumValue("FirstChildMiddleName")
    FIRST_CHILD_MIDDLE_NAME("FirstChildMiddleName"),
    @XmlEnumValue("HighSchoolName")
    HIGH_SCHOOL_NAME("HighSchoolName"),
    @XmlEnumValue("FavoriteTeacherName")
    FAVORITE_TEACHER_NAME("FavoriteTeacherName"),
    @XmlEnumValue("FavoriteSportsTeam")
    FAVORITE_SPORTS_TEAM("FavoriteSportsTeam");
    private final String value;

    SecretQuestion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecretQuestion fromValue(String v) {
        for (SecretQuestion c: SecretQuestion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

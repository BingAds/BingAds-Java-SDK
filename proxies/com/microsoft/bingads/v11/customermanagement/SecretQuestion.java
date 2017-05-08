
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecretQuestion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecretQuestion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="FavoritePetsName"/>
 *     &lt;enumeration value="FavoriteMovie"/>
 *     &lt;enumeration value="Anniversary"/>
 *     &lt;enumeration value="FatherMiddleName"/>
 *     &lt;enumeration value="SpouseMiddleName"/>
 *     &lt;enumeration value="FirstChildMiddleName"/>
 *     &lt;enumeration value="HighSchoolName"/>
 *     &lt;enumeration value="FavoriteTeacherName"/>
 *     &lt;enumeration value="FavoriteSportsTeam"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecretQuestion", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
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

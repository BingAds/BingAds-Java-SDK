
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionAdExtensionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionAdExtensionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ActNow"/>
 *     &lt;enumeration value="ApplyNow"/>
 *     &lt;enumeration value="BetNow"/>
 *     &lt;enumeration value="BidNow"/>
 *     &lt;enumeration value="BookACar"/>
 *     &lt;enumeration value="BookHotel"/>
 *     &lt;enumeration value="BookNow"/>
 *     &lt;enumeration value="Browse"/>
 *     &lt;enumeration value="BuyNow"/>
 *     &lt;enumeration value="ChatNow"/>
 *     &lt;enumeration value="Compare"/>
 *     &lt;enumeration value="ContactUs"/>
 *     &lt;enumeration value="Coupon"/>
 *     &lt;enumeration value="Donate"/>
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="EmailNow"/>
 *     &lt;enumeration value="EnrollNow"/>
 *     &lt;enumeration value="Explore"/>
 *     &lt;enumeration value="FileNow"/>
 *     &lt;enumeration value="FindJob"/>
 *     &lt;enumeration value="FreePlay"/>
 *     &lt;enumeration value="FreeQuote"/>
 *     &lt;enumeration value="FreeTrial"/>
 *     &lt;enumeration value="GetDeals"/>
 *     &lt;enumeration value="GetOffer"/>
 *     &lt;enumeration value="GetQuote"/>
 *     &lt;enumeration value="JoinNow"/>
 *     &lt;enumeration value="LearnMore"/>
 *     &lt;enumeration value="ListenNow"/>
 *     &lt;enumeration value="LogIn"/>
 *     &lt;enumeration value="Message"/>
 *     &lt;enumeration value="NewCars"/>
 *     &lt;enumeration value="OrderNow"/>
 *     &lt;enumeration value="PlayGame"/>
 *     &lt;enumeration value="PlayNow"/>
 *     &lt;enumeration value="PostJob"/>
 *     &lt;enumeration value="Register"/>
 *     &lt;enumeration value="RentACar"/>
 *     &lt;enumeration value="RentNow"/>
 *     &lt;enumeration value="Reserve"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="SaveNow"/>
 *     &lt;enumeration value="Schedule"/>
 *     &lt;enumeration value="SeeMenu"/>
 *     &lt;enumeration value="SeeMore"/>
 *     &lt;enumeration value="SeeOffer"/>
 *     &lt;enumeration value="SellNow"/>
 *     &lt;enumeration value="ShopNow"/>
 *     &lt;enumeration value="Showtimes"/>
 *     &lt;enumeration value="SignIn"/>
 *     &lt;enumeration value="SignUp"/>
 *     &lt;enumeration value="StartFree"/>
 *     &lt;enumeration value="StartNow"/>
 *     &lt;enumeration value="Subscribe"/>
 *     &lt;enumeration value="TestDrive"/>
 *     &lt;enumeration value="TryNow"/>
 *     &lt;enumeration value="UsedCars"/>
 *     &lt;enumeration value="ViewCars"/>
 *     &lt;enumeration value="ViewNow"/>
 *     &lt;enumeration value="ViewPlans"/>
 *     &lt;enumeration value="VisitSite"/>
 *     &lt;enumeration value="VoteNow"/>
 *     &lt;enumeration value="Watch"/>
 *     &lt;enumeration value="WatchMore"/>
 *     &lt;enumeration value="WatchNow"/>
 *     &lt;enumeration value="Directions"/>
 *     &lt;enumeration value="FindStore"/>
 *     &lt;enumeration value="SwitchNow"/>
 *     &lt;enumeration value="VisitStore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionAdExtensionActionType")
@XmlEnum
public enum ActionAdExtensionActionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ActNow")
    ACT_NOW("ActNow"),
    @XmlEnumValue("ApplyNow")
    APPLY_NOW("ApplyNow"),
    @XmlEnumValue("BetNow")
    BET_NOW("BetNow"),
    @XmlEnumValue("BidNow")
    BID_NOW("BidNow"),
    @XmlEnumValue("BookACar")
    BOOK_A_CAR("BookACar"),
    @XmlEnumValue("BookHotel")
    BOOK_HOTEL("BookHotel"),
    @XmlEnumValue("BookNow")
    BOOK_NOW("BookNow"),
    @XmlEnumValue("Browse")
    BROWSE("Browse"),
    @XmlEnumValue("BuyNow")
    BUY_NOW("BuyNow"),
    @XmlEnumValue("ChatNow")
    CHAT_NOW("ChatNow"),
    @XmlEnumValue("Compare")
    COMPARE("Compare"),
    @XmlEnumValue("ContactUs")
    CONTACT_US("ContactUs"),
    @XmlEnumValue("Coupon")
    COUPON("Coupon"),
    @XmlEnumValue("Donate")
    DONATE("Donate"),
    @XmlEnumValue("Download")
    DOWNLOAD("Download"),
    @XmlEnumValue("EmailNow")
    EMAIL_NOW("EmailNow"),
    @XmlEnumValue("EnrollNow")
    ENROLL_NOW("EnrollNow"),
    @XmlEnumValue("Explore")
    EXPLORE("Explore"),
    @XmlEnumValue("FileNow")
    FILE_NOW("FileNow"),
    @XmlEnumValue("FindJob")
    FIND_JOB("FindJob"),
    @XmlEnumValue("FreePlay")
    FREE_PLAY("FreePlay"),
    @XmlEnumValue("FreeQuote")
    FREE_QUOTE("FreeQuote"),
    @XmlEnumValue("FreeTrial")
    FREE_TRIAL("FreeTrial"),
    @XmlEnumValue("GetDeals")
    GET_DEALS("GetDeals"),
    @XmlEnumValue("GetOffer")
    GET_OFFER("GetOffer"),
    @XmlEnumValue("GetQuote")
    GET_QUOTE("GetQuote"),
    @XmlEnumValue("JoinNow")
    JOIN_NOW("JoinNow"),
    @XmlEnumValue("LearnMore")
    LEARN_MORE("LearnMore"),
    @XmlEnumValue("ListenNow")
    LISTEN_NOW("ListenNow"),
    @XmlEnumValue("LogIn")
    LOG_IN("LogIn"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("NewCars")
    NEW_CARS("NewCars"),
    @XmlEnumValue("OrderNow")
    ORDER_NOW("OrderNow"),
    @XmlEnumValue("PlayGame")
    PLAY_GAME("PlayGame"),
    @XmlEnumValue("PlayNow")
    PLAY_NOW("PlayNow"),
    @XmlEnumValue("PostJob")
    POST_JOB("PostJob"),
    @XmlEnumValue("Register")
    REGISTER("Register"),
    @XmlEnumValue("RentACar")
    RENT_A_CAR("RentACar"),
    @XmlEnumValue("RentNow")
    RENT_NOW("RentNow"),
    @XmlEnumValue("Reserve")
    RESERVE("Reserve"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("SaveNow")
    SAVE_NOW("SaveNow"),
    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),
    @XmlEnumValue("SeeMenu")
    SEE_MENU("SeeMenu"),
    @XmlEnumValue("SeeMore")
    SEE_MORE("SeeMore"),
    @XmlEnumValue("SeeOffer")
    SEE_OFFER("SeeOffer"),
    @XmlEnumValue("SellNow")
    SELL_NOW("SellNow"),
    @XmlEnumValue("ShopNow")
    SHOP_NOW("ShopNow"),
    @XmlEnumValue("Showtimes")
    SHOWTIMES("Showtimes"),
    @XmlEnumValue("SignIn")
    SIGN_IN("SignIn"),
    @XmlEnumValue("SignUp")
    SIGN_UP("SignUp"),
    @XmlEnumValue("StartFree")
    START_FREE("StartFree"),
    @XmlEnumValue("StartNow")
    START_NOW("StartNow"),
    @XmlEnumValue("Subscribe")
    SUBSCRIBE("Subscribe"),
    @XmlEnumValue("TestDrive")
    TEST_DRIVE("TestDrive"),
    @XmlEnumValue("TryNow")
    TRY_NOW("TryNow"),
    @XmlEnumValue("UsedCars")
    USED_CARS("UsedCars"),
    @XmlEnumValue("ViewCars")
    VIEW_CARS("ViewCars"),
    @XmlEnumValue("ViewNow")
    VIEW_NOW("ViewNow"),
    @XmlEnumValue("ViewPlans")
    VIEW_PLANS("ViewPlans"),
    @XmlEnumValue("VisitSite")
    VISIT_SITE("VisitSite"),
    @XmlEnumValue("VoteNow")
    VOTE_NOW("VoteNow"),
    @XmlEnumValue("Watch")
    WATCH("Watch"),
    @XmlEnumValue("WatchMore")
    WATCH_MORE("WatchMore"),
    @XmlEnumValue("WatchNow")
    WATCH_NOW("WatchNow"),
    @XmlEnumValue("Directions")
    DIRECTIONS("Directions"),
    @XmlEnumValue("FindStore")
    FIND_STORE("FindStore"),
    @XmlEnumValue("SwitchNow")
    SWITCH_NOW("SwitchNow"),
    @XmlEnumValue("VisitStore")
    VISIT_STORE("VisitStore");
    private final String value;

    ActionAdExtensionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionAdExtensionActionType fromValue(String v) {
        for (ActionAdExtensionActionType c: ActionAdExtensionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

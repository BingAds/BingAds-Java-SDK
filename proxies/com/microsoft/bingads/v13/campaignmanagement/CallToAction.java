
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallToAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CallToAction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="ActNow"/>
 *     <enumeration value="ApplyNow"/>
 *     <enumeration value="BetNow"/>
 *     <enumeration value="BidNow"/>
 *     <enumeration value="BookACar"/>
 *     <enumeration value="BookHotel"/>
 *     <enumeration value="BookNow"/>
 *     <enumeration value="Browse"/>
 *     <enumeration value="BuyNow"/>
 *     <enumeration value="ChatNow"/>
 *     <enumeration value="Compare"/>
 *     <enumeration value="ContactUs"/>
 *     <enumeration value="Coupon"/>
 *     <enumeration value="Donate"/>
 *     <enumeration value="Download"/>
 *     <enumeration value="EmailNow"/>
 *     <enumeration value="EnrollNow"/>
 *     <enumeration value="Explore"/>
 *     <enumeration value="FileNow"/>
 *     <enumeration value="FindJob"/>
 *     <enumeration value="FreePlay"/>
 *     <enumeration value="FreeQuote"/>
 *     <enumeration value="FreeTrial"/>
 *     <enumeration value="GetDeals"/>
 *     <enumeration value="GetOffer"/>
 *     <enumeration value="GetQuote"/>
 *     <enumeration value="JoinNow"/>
 *     <enumeration value="LearnMore"/>
 *     <enumeration value="ListenNow"/>
 *     <enumeration value="LogIn"/>
 *     <enumeration value="Message"/>
 *     <enumeration value="NewCars"/>
 *     <enumeration value="OrderNow"/>
 *     <enumeration value="PlayGame"/>
 *     <enumeration value="PlayNow"/>
 *     <enumeration value="PostJob"/>
 *     <enumeration value="Register"/>
 *     <enumeration value="RentACar"/>
 *     <enumeration value="RentNow"/>
 *     <enumeration value="Reserve"/>
 *     <enumeration value="Sale"/>
 *     <enumeration value="SaveNow"/>
 *     <enumeration value="Schedule"/>
 *     <enumeration value="SeeMenu"/>
 *     <enumeration value="SeeMore"/>
 *     <enumeration value="SeeOffer"/>
 *     <enumeration value="SellNow"/>
 *     <enumeration value="ShopNow"/>
 *     <enumeration value="Showtimes"/>
 *     <enumeration value="SignIn"/>
 *     <enumeration value="SignUp"/>
 *     <enumeration value="StartFree"/>
 *     <enumeration value="StartNow"/>
 *     <enumeration value="Subscribe"/>
 *     <enumeration value="TestDrive"/>
 *     <enumeration value="TryNow"/>
 *     <enumeration value="UsedCars"/>
 *     <enumeration value="ViewCars"/>
 *     <enumeration value="ViewNow"/>
 *     <enumeration value="ViewPlans"/>
 *     <enumeration value="VisitSite"/>
 *     <enumeration value="VoteNow"/>
 *     <enumeration value="Watch"/>
 *     <enumeration value="WatchMore"/>
 *     <enumeration value="WatchNow"/>
 *     <enumeration value="Directions"/>
 *     <enumeration value="FindStore"/>
 *     <enumeration value="SwitchNow"/>
 *     <enumeration value="VisitStore"/>
 *     <enumeration value="RenewNow"/>
 *     <enumeration value="Reorder"/>
 *     <enumeration value="Default"/>
 *     <enumeration value="NoButton"/>
 *     <enumeration value="Install"/>
 *     <enumeration value="AddToCart"/>
 *     <enumeration value="BookTravel"/>
 *     <enumeration value="Buy"/>
 *     <enumeration value="OpenLink"/>
 *     <enumeration value="RegisterNow"/>
 *     <enumeration value="BuildNow"/>
 *     <enumeration value="Dealers"/>
 *     <enumeration value="GetDemo"/>
 *     <enumeration value="GetNow"/>
 *     <enumeration value="GoToDemo"/>
 *     <enumeration value="SeeDemo"/>
 *     <enumeration value="SeeModels"/>
 *     <enumeration value="SeeOffers"/>
 *     <enumeration value="ViewDemo"/>
 *     <enumeration value="Automated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CallToAction")
@XmlEnum
public enum CallToAction {

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
    VISIT_STORE("VisitStore"),
    @XmlEnumValue("RenewNow")
    RENEW_NOW("RenewNow"),
    @XmlEnumValue("Reorder")
    REORDER("Reorder"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NoButton")
    NO_BUTTON("NoButton"),
    @XmlEnumValue("Install")
    INSTALL("Install"),
    @XmlEnumValue("AddToCart")
    ADD_TO_CART("AddToCart"),
    @XmlEnumValue("BookTravel")
    BOOK_TRAVEL("BookTravel"),
    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("OpenLink")
    OPEN_LINK("OpenLink"),
    @XmlEnumValue("RegisterNow")
    REGISTER_NOW("RegisterNow"),
    @XmlEnumValue("BuildNow")
    BUILD_NOW("BuildNow"),
    @XmlEnumValue("Dealers")
    DEALERS("Dealers"),
    @XmlEnumValue("GetDemo")
    GET_DEMO("GetDemo"),
    @XmlEnumValue("GetNow")
    GET_NOW("GetNow"),
    @XmlEnumValue("GoToDemo")
    GO_TO_DEMO("GoToDemo"),
    @XmlEnumValue("SeeDemo")
    SEE_DEMO("SeeDemo"),
    @XmlEnumValue("SeeModels")
    SEE_MODELS("SeeModels"),
    @XmlEnumValue("SeeOffers")
    SEE_OFFERS("SeeOffers"),
    @XmlEnumValue("ViewDemo")
    VIEW_DEMO("ViewDemo"),
    @XmlEnumValue("Automated")
    AUTOMATED("Automated");
    private final String value;

    CallToAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallToAction fromValue(String v) {
        for (CallToAction c: CallToAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

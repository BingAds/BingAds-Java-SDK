
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TimeZoneType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AbuDhabiMuscat"/>
 *     <enumeration value="Adelaide"/>
 *     <enumeration value="Alaska"/>
 *     <enumeration value="AlmatyNovosibirsk"/>
 *     <enumeration value="AmsterdamBerlinBernRomeStockholmVienna"/>
 *     <enumeration value="Arizona"/>
 *     <enumeration value="AstanaDhaka"/>
 *     <enumeration value="AthensBuckarestIstanbul"/>
 *     <enumeration value="AtlanticTimeCanada"/>
 *     <enumeration value="AucklandWellington"/>
 *     <enumeration value="Azores"/>
 *     <enumeration value="Baghdad"/>
 *     <enumeration value="BakuTbilisiYerevan"/>
 *     <enumeration value="BangkokHanoiJakarta"/>
 *     <enumeration value="BeijingChongqingHongKongUrumqi"/>
 *     <enumeration value="BelgradeBratislavaBudapestLjubljanaPrague"/>
 *     <enumeration value="BogotaLimaQuito"/>
 *     <enumeration value="Brasilia"/>
 *     <enumeration value="Brisbane"/>
 *     <enumeration value="BrusselsCopenhagenMadridParis"/>
 *     <enumeration value="Bucharest"/>
 *     <enumeration value="BuenosAiresGeorgetown"/>
 *     <enumeration value="Cairo"/>
 *     <enumeration value="CanberraMelbourneSydney"/>
 *     <enumeration value="CapeVerdeIsland"/>
 *     <enumeration value="CaracasLaPaz"/>
 *     <enumeration value="CasablancaMonrovia"/>
 *     <enumeration value="CentralAmerica"/>
 *     <enumeration value="CentralTimeUSCanada"/>
 *     <enumeration value="ChennaiKolkataMumbaiNewDelhi"/>
 *     <enumeration value="ChihuahuaLaPazMazatlan"/>
 *     <enumeration value="Darwin"/>
 *     <enumeration value="EasternTimeUSCanada"/>
 *     <enumeration value="Ekaterinburg"/>
 *     <enumeration value="FijiKamchatkaMarshallIsland"/>
 *     <enumeration value="Greenland"/>
 *     <enumeration value="GreenwichMeanTimeDublinEdinburghLisbonLondon"/>
 *     <enumeration value="GuadalajaraMexicoCityMonterrey"/>
 *     <enumeration value="GuamPortMoresby"/>
 *     <enumeration value="HararePretoria"/>
 *     <enumeration value="Hawaii"/>
 *     <enumeration value="HelsinkiKyivRigaSofiaTallinnVilnius"/>
 *     <enumeration value="Hobart"/>
 *     <enumeration value="IndianaEast"/>
 *     <enumeration value="InternationalDateLineWest"/>
 *     <enumeration value="IrkutskUlaanBataar"/>
 *     <enumeration value="IslamabadKarachiTashkent"/>
 *     <enumeration value="Jerusalem"/>
 *     <enumeration value="Kabul"/>
 *     <enumeration value="Kathmandu"/>
 *     <enumeration value="Krasnoyarsk"/>
 *     <enumeration value="KualaLumpurSingapore"/>
 *     <enumeration value="KuwaitRiyadh"/>
 *     <enumeration value="SolomonIslandNewCaledonia"/>
 *     <enumeration value="MidAtlantic"/>
 *     <enumeration value="MidwayIslandAndSamoa"/>
 *     <enumeration value="MoscowStPetersburgVolgograd"/>
 *     <enumeration value="MountainTimeUSCanada"/>
 *     <enumeration value="Nairobi"/>
 *     <enumeration value="Newfoundland"/>
 *     <enumeration value="Nukualofa"/>
 *     <enumeration value="OsakaSapporoTokyo"/>
 *     <enumeration value="PacificTimeUSCanadaTijuana"/>
 *     <enumeration value="Perth"/>
 *     <enumeration value="Rangoon"/>
 *     <enumeration value="Santiago"/>
 *     <enumeration value="SarajevoSkopjeWarsawZagreb"/>
 *     <enumeration value="Saskatchewan"/>
 *     <enumeration value="Seoul"/>
 *     <enumeration value="SriJayawardenepura"/>
 *     <enumeration value="Taipei"/>
 *     <enumeration value="Tehran"/>
 *     <enumeration value="Vladivostok"/>
 *     <enumeration value="WestCentralAfrica"/>
 *     <enumeration value="Yakutsk"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TimeZoneType", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum TimeZoneType {

    @XmlEnumValue("AbuDhabiMuscat")
    ABU_DHABI_MUSCAT("AbuDhabiMuscat"),
    @XmlEnumValue("Adelaide")
    ADELAIDE("Adelaide"),
    @XmlEnumValue("Alaska")
    ALASKA("Alaska"),
    @XmlEnumValue("AlmatyNovosibirsk")
    ALMATY_NOVOSIBIRSK("AlmatyNovosibirsk"),
    @XmlEnumValue("AmsterdamBerlinBernRomeStockholmVienna")
    AMSTERDAM_BERLIN_BERN_ROME_STOCKHOLM_VIENNA("AmsterdamBerlinBernRomeStockholmVienna"),
    @XmlEnumValue("Arizona")
    ARIZONA("Arizona"),
    @XmlEnumValue("AstanaDhaka")
    ASTANA_DHAKA("AstanaDhaka"),
    @XmlEnumValue("AthensBuckarestIstanbul")
    ATHENS_BUCKAREST_ISTANBUL("AthensBuckarestIstanbul"),
    @XmlEnumValue("AtlanticTimeCanada")
    ATLANTIC_TIME_CANADA("AtlanticTimeCanada"),
    @XmlEnumValue("AucklandWellington")
    AUCKLAND_WELLINGTON("AucklandWellington"),
    @XmlEnumValue("Azores")
    AZORES("Azores"),
    @XmlEnumValue("Baghdad")
    BAGHDAD("Baghdad"),
    @XmlEnumValue("BakuTbilisiYerevan")
    BAKU_TBILISI_YEREVAN("BakuTbilisiYerevan"),
    @XmlEnumValue("BangkokHanoiJakarta")
    BANGKOK_HANOI_JAKARTA("BangkokHanoiJakarta"),
    @XmlEnumValue("BeijingChongqingHongKongUrumqi")
    BEIJING_CHONGQING_HONG_KONG_URUMQI("BeijingChongqingHongKongUrumqi"),
    @XmlEnumValue("BelgradeBratislavaBudapestLjubljanaPrague")
    BELGRADE_BRATISLAVA_BUDAPEST_LJUBLJANA_PRAGUE("BelgradeBratislavaBudapestLjubljanaPrague"),
    @XmlEnumValue("BogotaLimaQuito")
    BOGOTA_LIMA_QUITO("BogotaLimaQuito"),
    @XmlEnumValue("Brasilia")
    BRASILIA("Brasilia"),
    @XmlEnumValue("Brisbane")
    BRISBANE("Brisbane"),
    @XmlEnumValue("BrusselsCopenhagenMadridParis")
    BRUSSELS_COPENHAGEN_MADRID_PARIS("BrusselsCopenhagenMadridParis"),
    @XmlEnumValue("Bucharest")
    BUCHAREST("Bucharest"),
    @XmlEnumValue("BuenosAiresGeorgetown")
    BUENOS_AIRES_GEORGETOWN("BuenosAiresGeorgetown"),
    @XmlEnumValue("Cairo")
    CAIRO("Cairo"),
    @XmlEnumValue("CanberraMelbourneSydney")
    CANBERRA_MELBOURNE_SYDNEY("CanberraMelbourneSydney"),
    @XmlEnumValue("CapeVerdeIsland")
    CAPE_VERDE_ISLAND("CapeVerdeIsland"),
    @XmlEnumValue("CaracasLaPaz")
    CARACAS_LA_PAZ("CaracasLaPaz"),
    @XmlEnumValue("CasablancaMonrovia")
    CASABLANCA_MONROVIA("CasablancaMonrovia"),
    @XmlEnumValue("CentralAmerica")
    CENTRAL_AMERICA("CentralAmerica"),
    @XmlEnumValue("CentralTimeUSCanada")
    CENTRAL_TIME_US_CANADA("CentralTimeUSCanada"),
    @XmlEnumValue("ChennaiKolkataMumbaiNewDelhi")
    CHENNAI_KOLKATA_MUMBAI_NEW_DELHI("ChennaiKolkataMumbaiNewDelhi"),
    @XmlEnumValue("ChihuahuaLaPazMazatlan")
    CHIHUAHUA_LA_PAZ_MAZATLAN("ChihuahuaLaPazMazatlan"),
    @XmlEnumValue("Darwin")
    DARWIN("Darwin"),
    @XmlEnumValue("EasternTimeUSCanada")
    EASTERN_TIME_US_CANADA("EasternTimeUSCanada"),
    @XmlEnumValue("Ekaterinburg")
    EKATERINBURG("Ekaterinburg"),
    @XmlEnumValue("FijiKamchatkaMarshallIsland")
    FIJI_KAMCHATKA_MARSHALL_ISLAND("FijiKamchatkaMarshallIsland"),
    @XmlEnumValue("Greenland")
    GREENLAND("Greenland"),
    @XmlEnumValue("GreenwichMeanTimeDublinEdinburghLisbonLondon")
    GREENWICH_MEAN_TIME_DUBLIN_EDINBURGH_LISBON_LONDON("GreenwichMeanTimeDublinEdinburghLisbonLondon"),
    @XmlEnumValue("GuadalajaraMexicoCityMonterrey")
    GUADALAJARA_MEXICO_CITY_MONTERREY("GuadalajaraMexicoCityMonterrey"),
    @XmlEnumValue("GuamPortMoresby")
    GUAM_PORT_MORESBY("GuamPortMoresby"),
    @XmlEnumValue("HararePretoria")
    HARARE_PRETORIA("HararePretoria"),
    @XmlEnumValue("Hawaii")
    HAWAII("Hawaii"),
    @XmlEnumValue("HelsinkiKyivRigaSofiaTallinnVilnius")
    HELSINKI_KYIV_RIGA_SOFIA_TALLINN_VILNIUS("HelsinkiKyivRigaSofiaTallinnVilnius"),
    @XmlEnumValue("Hobart")
    HOBART("Hobart"),
    @XmlEnumValue("IndianaEast")
    INDIANA_EAST("IndianaEast"),
    @XmlEnumValue("InternationalDateLineWest")
    INTERNATIONAL_DATE_LINE_WEST("InternationalDateLineWest"),
    @XmlEnumValue("IrkutskUlaanBataar")
    IRKUTSK_ULAAN_BATAAR("IrkutskUlaanBataar"),
    @XmlEnumValue("IslamabadKarachiTashkent")
    ISLAMABAD_KARACHI_TASHKENT("IslamabadKarachiTashkent"),
    @XmlEnumValue("Jerusalem")
    JERUSALEM("Jerusalem"),
    @XmlEnumValue("Kabul")
    KABUL("Kabul"),
    @XmlEnumValue("Kathmandu")
    KATHMANDU("Kathmandu"),
    @XmlEnumValue("Krasnoyarsk")
    KRASNOYARSK("Krasnoyarsk"),
    @XmlEnumValue("KualaLumpurSingapore")
    KUALA_LUMPUR_SINGAPORE("KualaLumpurSingapore"),
    @XmlEnumValue("KuwaitRiyadh")
    KUWAIT_RIYADH("KuwaitRiyadh"),
    @XmlEnumValue("SolomonIslandNewCaledonia")
    SOLOMON_ISLAND_NEW_CALEDONIA("SolomonIslandNewCaledonia"),
    @XmlEnumValue("MidAtlantic")
    MID_ATLANTIC("MidAtlantic"),
    @XmlEnumValue("MidwayIslandAndSamoa")
    MIDWAY_ISLAND_AND_SAMOA("MidwayIslandAndSamoa"),
    @XmlEnumValue("MoscowStPetersburgVolgograd")
    MOSCOW_ST_PETERSBURG_VOLGOGRAD("MoscowStPetersburgVolgograd"),
    @XmlEnumValue("MountainTimeUSCanada")
    MOUNTAIN_TIME_US_CANADA("MountainTimeUSCanada"),
    @XmlEnumValue("Nairobi")
    NAIROBI("Nairobi"),
    @XmlEnumValue("Newfoundland")
    NEWFOUNDLAND("Newfoundland"),
    @XmlEnumValue("Nukualofa")
    NUKUALOFA("Nukualofa"),
    @XmlEnumValue("OsakaSapporoTokyo")
    OSAKA_SAPPORO_TOKYO("OsakaSapporoTokyo"),
    @XmlEnumValue("PacificTimeUSCanadaTijuana")
    PACIFIC_TIME_US_CANADA_TIJUANA("PacificTimeUSCanadaTijuana"),
    @XmlEnumValue("Perth")
    PERTH("Perth"),
    @XmlEnumValue("Rangoon")
    RANGOON("Rangoon"),
    @XmlEnumValue("Santiago")
    SANTIAGO("Santiago"),
    @XmlEnumValue("SarajevoSkopjeWarsawZagreb")
    SARAJEVO_SKOPJE_WARSAW_ZAGREB("SarajevoSkopjeWarsawZagreb"),
    @XmlEnumValue("Saskatchewan")
    SASKATCHEWAN("Saskatchewan"),
    @XmlEnumValue("Seoul")
    SEOUL("Seoul"),
    @XmlEnumValue("SriJayawardenepura")
    SRI_JAYAWARDENEPURA("SriJayawardenepura"),
    @XmlEnumValue("Taipei")
    TAIPEI("Taipei"),
    @XmlEnumValue("Tehran")
    TEHRAN("Tehran"),
    @XmlEnumValue("Vladivostok")
    VLADIVOSTOK("Vladivostok"),
    @XmlEnumValue("WestCentralAfrica")
    WEST_CENTRAL_AFRICA("WestCentralAfrica"),
    @XmlEnumValue("Yakutsk")
    YAKUTSK("Yakutsk");
    private final String value;

    TimeZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeZoneType fromValue(String v) {
        for (TimeZoneType c: TimeZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

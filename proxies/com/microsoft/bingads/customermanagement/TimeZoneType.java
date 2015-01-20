
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AbuDhabiMuscat"/>
 *     &lt;enumeration value="Adelaide"/>
 *     &lt;enumeration value="Alaska"/>
 *     &lt;enumeration value="AlmatyNovosibirsk"/>
 *     &lt;enumeration value="AmsterdamBerlinBernRomeStockholmVienna"/>
 *     &lt;enumeration value="Arizona"/>
 *     &lt;enumeration value="AstanaDhaka"/>
 *     &lt;enumeration value="AthensBuckarestIstanbul"/>
 *     &lt;enumeration value="AtlanticTimeCanada"/>
 *     &lt;enumeration value="AucklandWellington"/>
 *     &lt;enumeration value="Azores"/>
 *     &lt;enumeration value="Baghdad"/>
 *     &lt;enumeration value="BakuTbilisiYerevan"/>
 *     &lt;enumeration value="BangkokHanoiJakarta"/>
 *     &lt;enumeration value="BeijingChongqingHongKongUrumqi"/>
 *     &lt;enumeration value="BelgradeBratislavaBudapestLjubljanaPrague"/>
 *     &lt;enumeration value="BogotaLimaQuito"/>
 *     &lt;enumeration value="Brasilia"/>
 *     &lt;enumeration value="Brisbane"/>
 *     &lt;enumeration value="BrusselsCopenhagenMadridParis"/>
 *     &lt;enumeration value="Bucharest"/>
 *     &lt;enumeration value="BuenosAiresGeorgetown"/>
 *     &lt;enumeration value="Cairo"/>
 *     &lt;enumeration value="CanberraMelbourneSydney"/>
 *     &lt;enumeration value="CapeVerdeIsland"/>
 *     &lt;enumeration value="CaracasLaPaz"/>
 *     &lt;enumeration value="CasablancaMonrovia"/>
 *     &lt;enumeration value="CentralAmerica"/>
 *     &lt;enumeration value="CentralTimeUSCanada"/>
 *     &lt;enumeration value="ChennaiKolkataMumbaiNewDelhi"/>
 *     &lt;enumeration value="ChihuahuaLaPazMazatlan"/>
 *     &lt;enumeration value="Darwin"/>
 *     &lt;enumeration value="EasternTimeUSCanada"/>
 *     &lt;enumeration value="Ekaterinburg"/>
 *     &lt;enumeration value="FijiKamchatkaMarshallIsland"/>
 *     &lt;enumeration value="Greenland"/>
 *     &lt;enumeration value="GreenwichMeanTimeDublinEdinburghLisbonLondon"/>
 *     &lt;enumeration value="GuadalajaraMexicoCityMonterrey"/>
 *     &lt;enumeration value="GuamPortMoresby"/>
 *     &lt;enumeration value="HararePretoria"/>
 *     &lt;enumeration value="Hawaii"/>
 *     &lt;enumeration value="HelsinkiKyivRigaSofiaTallinnVilnius"/>
 *     &lt;enumeration value="Hobart"/>
 *     &lt;enumeration value="IndianaEast"/>
 *     &lt;enumeration value="InternationalDatelineWest"/>
 *     &lt;enumeration value="IrkutskUlaanBataar"/>
 *     &lt;enumeration value="IslamabadKarachiTashkent"/>
 *     &lt;enumeration value="Jerusalem"/>
 *     &lt;enumeration value="Kabul"/>
 *     &lt;enumeration value="Kathmandu"/>
 *     &lt;enumeration value="Krasnoyarsk"/>
 *     &lt;enumeration value="KualaLumpurSingapore"/>
 *     &lt;enumeration value="KuwaitRiyadh"/>
 *     &lt;enumeration value="MagadanSolomonIslandNewCaledonia"/>
 *     &lt;enumeration value="MidAtlantic"/>
 *     &lt;enumeration value="MidwayIslandAndSamoa"/>
 *     &lt;enumeration value="MoscowStPetersburgVolgograd"/>
 *     &lt;enumeration value="MountainTimeUSCanada"/>
 *     &lt;enumeration value="Nairobi"/>
 *     &lt;enumeration value="Newfoundland"/>
 *     &lt;enumeration value="Nukualofa"/>
 *     &lt;enumeration value="OsakaSapporoTokyo"/>
 *     &lt;enumeration value="PacificTimeUSCanadaTijuana"/>
 *     &lt;enumeration value="Perth"/>
 *     &lt;enumeration value="Rangoon"/>
 *     &lt;enumeration value="Santiago"/>
 *     &lt;enumeration value="SarajevoSkopjeWarsawZagreb"/>
 *     &lt;enumeration value="Saskatchewan"/>
 *     &lt;enumeration value="Seoul"/>
 *     &lt;enumeration value="SriJayawardenepura"/>
 *     &lt;enumeration value="Taipei"/>
 *     &lt;enumeration value="Tehran"/>
 *     &lt;enumeration value="Vladivostok"/>
 *     &lt;enumeration value="WestCentralAfrica"/>
 *     &lt;enumeration value="Yakutsk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeZoneType", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
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
    @XmlEnumValue("InternationalDatelineWest")
    INTERNATIONAL_DATELINE_WEST("InternationalDatelineWest"),
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
    @XmlEnumValue("MagadanSolomonIslandNewCaledonia")
    MAGADAN_SOLOMON_ISLAND_NEW_CALEDONIA("MagadanSolomonIslandNewCaledonia"),
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

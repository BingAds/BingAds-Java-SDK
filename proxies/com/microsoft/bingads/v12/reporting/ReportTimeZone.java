
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTimeZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportTimeZone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nukualofa"/>
 *     &lt;enumeration value="FijiKamchatkaMarshallIsland"/>
 *     &lt;enumeration value="AucklandWellington"/>
 *     &lt;enumeration value="MagadanSolomonIslandNewCaledonia"/>
 *     &lt;enumeration value="Vladivostok"/>
 *     &lt;enumeration value="Hobart"/>
 *     &lt;enumeration value="GuamPortMoresby"/>
 *     &lt;enumeration value="CanberraMelbourneSydney"/>
 *     &lt;enumeration value="Brisbane"/>
 *     &lt;enumeration value="Darwin"/>
 *     &lt;enumeration value="Adelaide"/>
 *     &lt;enumeration value="Yakutsk"/>
 *     &lt;enumeration value="Seoul"/>
 *     &lt;enumeration value="OsakaSapporoTokyo"/>
 *     &lt;enumeration value="Taipei"/>
 *     &lt;enumeration value="Perth"/>
 *     &lt;enumeration value="KualaLumpurSingapore"/>
 *     &lt;enumeration value="IrkutskUlaanBataar"/>
 *     &lt;enumeration value="BeijingChongqingHongKongUrumqi"/>
 *     &lt;enumeration value="Krasnoyarsk"/>
 *     &lt;enumeration value="BangkokHanoiJakarta"/>
 *     &lt;enumeration value="Rangoon"/>
 *     &lt;enumeration value="SriJayawardenepura"/>
 *     &lt;enumeration value="AstanaDhaka"/>
 *     &lt;enumeration value="AlmatyNovosibirsk"/>
 *     &lt;enumeration value="Kathmandu"/>
 *     &lt;enumeration value="ChennaiKolkataMumbaiNewDelhi"/>
 *     &lt;enumeration value="IslandamabadKarachiTashkent"/>
 *     &lt;enumeration value="Ekaterinburg"/>
 *     &lt;enumeration value="Kabul"/>
 *     &lt;enumeration value="BakuTbilisiYerevan"/>
 *     &lt;enumeration value="AbuDhabiMuscat"/>
 *     &lt;enumeration value="Tehran"/>
 *     &lt;enumeration value="Nairobi"/>
 *     &lt;enumeration value="MoscowStPetersburgVolgograd"/>
 *     &lt;enumeration value="KuwaitRiyadh"/>
 *     &lt;enumeration value="Baghdad"/>
 *     &lt;enumeration value="Jerusalem"/>
 *     &lt;enumeration value="HelsinkiKyivRigaSofiaTallinnVilnius"/>
 *     &lt;enumeration value="HararePretoria"/>
 *     &lt;enumeration value="Cairo"/>
 *     &lt;enumeration value="Bucharest"/>
 *     &lt;enumeration value="AthensIslandanbulMinsk"/>
 *     &lt;enumeration value="WestCentralAfrica"/>
 *     &lt;enumeration value="SarajevoSkopjeWarsawZagreb"/>
 *     &lt;enumeration value="BrusselsCopenhagenMadridParis"/>
 *     &lt;enumeration value="BelgradeBratislavaBudapestLjubljanaPrague"/>
 *     &lt;enumeration value="AmsterdamBerlinBernRomeStockholmVienna"/>
 *     &lt;enumeration value="CasablancaMonrovia"/>
 *     &lt;enumeration value="GreenwichMeanTimeDublinEdinburghLisbonLondon"/>
 *     &lt;enumeration value="Azores"/>
 *     &lt;enumeration value="CapeVerdeIsland"/>
 *     &lt;enumeration value="MidAtlantic"/>
 *     &lt;enumeration value="Brasilia"/>
 *     &lt;enumeration value="BuenosAiresGeorgetown"/>
 *     &lt;enumeration value="Greenland"/>
 *     &lt;enumeration value="Newfoundland"/>
 *     &lt;enumeration value="AtlanticTimeCanada"/>
 *     &lt;enumeration value="CaracasLaPaz"/>
 *     &lt;enumeration value="Santiago"/>
 *     &lt;enumeration value="BogotaLimaQuito"/>
 *     &lt;enumeration value="EasternTimeUSCanada"/>
 *     &lt;enumeration value="IndianaEast"/>
 *     &lt;enumeration value="CentralAmerica"/>
 *     &lt;enumeration value="CentralTimeUSCanada"/>
 *     &lt;enumeration value="GuadalajaraMexicoCityMonterrey"/>
 *     &lt;enumeration value="Saskatchewan"/>
 *     &lt;enumeration value="Arizona"/>
 *     &lt;enumeration value="ChihuahuaLaPazMazatlan"/>
 *     &lt;enumeration value="MountainTimeUSCanada"/>
 *     &lt;enumeration value="PacificTimeUSCanadaTijuana"/>
 *     &lt;enumeration value="Alaska"/>
 *     &lt;enumeration value="Hawaii"/>
 *     &lt;enumeration value="MidwayIslandandSamoa"/>
 *     &lt;enumeration value="InternationalDateLineWest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportTimeZone")
@XmlEnum
public enum ReportTimeZone {

    @XmlEnumValue("Nukualofa")
    NUKUALOFA("Nukualofa"),
    @XmlEnumValue("FijiKamchatkaMarshallIsland")
    FIJI_KAMCHATKA_MARSHALL_ISLAND("FijiKamchatkaMarshallIsland"),
    @XmlEnumValue("AucklandWellington")
    AUCKLAND_WELLINGTON("AucklandWellington"),
    @XmlEnumValue("MagadanSolomonIslandNewCaledonia")
    MAGADAN_SOLOMON_ISLAND_NEW_CALEDONIA("MagadanSolomonIslandNewCaledonia"),
    @XmlEnumValue("Vladivostok")
    VLADIVOSTOK("Vladivostok"),
    @XmlEnumValue("Hobart")
    HOBART("Hobart"),
    @XmlEnumValue("GuamPortMoresby")
    GUAM_PORT_MORESBY("GuamPortMoresby"),
    @XmlEnumValue("CanberraMelbourneSydney")
    CANBERRA_MELBOURNE_SYDNEY("CanberraMelbourneSydney"),
    @XmlEnumValue("Brisbane")
    BRISBANE("Brisbane"),
    @XmlEnumValue("Darwin")
    DARWIN("Darwin"),
    @XmlEnumValue("Adelaide")
    ADELAIDE("Adelaide"),
    @XmlEnumValue("Yakutsk")
    YAKUTSK("Yakutsk"),
    @XmlEnumValue("Seoul")
    SEOUL("Seoul"),
    @XmlEnumValue("OsakaSapporoTokyo")
    OSAKA_SAPPORO_TOKYO("OsakaSapporoTokyo"),
    @XmlEnumValue("Taipei")
    TAIPEI("Taipei"),
    @XmlEnumValue("Perth")
    PERTH("Perth"),
    @XmlEnumValue("KualaLumpurSingapore")
    KUALA_LUMPUR_SINGAPORE("KualaLumpurSingapore"),
    @XmlEnumValue("IrkutskUlaanBataar")
    IRKUTSK_ULAAN_BATAAR("IrkutskUlaanBataar"),
    @XmlEnumValue("BeijingChongqingHongKongUrumqi")
    BEIJING_CHONGQING_HONG_KONG_URUMQI("BeijingChongqingHongKongUrumqi"),
    @XmlEnumValue("Krasnoyarsk")
    KRASNOYARSK("Krasnoyarsk"),
    @XmlEnumValue("BangkokHanoiJakarta")
    BANGKOK_HANOI_JAKARTA("BangkokHanoiJakarta"),
    @XmlEnumValue("Rangoon")
    RANGOON("Rangoon"),
    @XmlEnumValue("SriJayawardenepura")
    SRI_JAYAWARDENEPURA("SriJayawardenepura"),
    @XmlEnumValue("AstanaDhaka")
    ASTANA_DHAKA("AstanaDhaka"),
    @XmlEnumValue("AlmatyNovosibirsk")
    ALMATY_NOVOSIBIRSK("AlmatyNovosibirsk"),
    @XmlEnumValue("Kathmandu")
    KATHMANDU("Kathmandu"),
    @XmlEnumValue("ChennaiKolkataMumbaiNewDelhi")
    CHENNAI_KOLKATA_MUMBAI_NEW_DELHI("ChennaiKolkataMumbaiNewDelhi"),
    @XmlEnumValue("IslandamabadKarachiTashkent")
    ISLANDAMABAD_KARACHI_TASHKENT("IslandamabadKarachiTashkent"),
    @XmlEnumValue("Ekaterinburg")
    EKATERINBURG("Ekaterinburg"),
    @XmlEnumValue("Kabul")
    KABUL("Kabul"),
    @XmlEnumValue("BakuTbilisiYerevan")
    BAKU_TBILISI_YEREVAN("BakuTbilisiYerevan"),
    @XmlEnumValue("AbuDhabiMuscat")
    ABU_DHABI_MUSCAT("AbuDhabiMuscat"),
    @XmlEnumValue("Tehran")
    TEHRAN("Tehran"),
    @XmlEnumValue("Nairobi")
    NAIROBI("Nairobi"),
    @XmlEnumValue("MoscowStPetersburgVolgograd")
    MOSCOW_ST_PETERSBURG_VOLGOGRAD("MoscowStPetersburgVolgograd"),
    @XmlEnumValue("KuwaitRiyadh")
    KUWAIT_RIYADH("KuwaitRiyadh"),
    @XmlEnumValue("Baghdad")
    BAGHDAD("Baghdad"),
    @XmlEnumValue("Jerusalem")
    JERUSALEM("Jerusalem"),
    @XmlEnumValue("HelsinkiKyivRigaSofiaTallinnVilnius")
    HELSINKI_KYIV_RIGA_SOFIA_TALLINN_VILNIUS("HelsinkiKyivRigaSofiaTallinnVilnius"),
    @XmlEnumValue("HararePretoria")
    HARARE_PRETORIA("HararePretoria"),
    @XmlEnumValue("Cairo")
    CAIRO("Cairo"),
    @XmlEnumValue("Bucharest")
    BUCHAREST("Bucharest"),
    @XmlEnumValue("AthensIslandanbulMinsk")
    ATHENS_ISLANDANBUL_MINSK("AthensIslandanbulMinsk"),
    @XmlEnumValue("WestCentralAfrica")
    WEST_CENTRAL_AFRICA("WestCentralAfrica"),
    @XmlEnumValue("SarajevoSkopjeWarsawZagreb")
    SARAJEVO_SKOPJE_WARSAW_ZAGREB("SarajevoSkopjeWarsawZagreb"),
    @XmlEnumValue("BrusselsCopenhagenMadridParis")
    BRUSSELS_COPENHAGEN_MADRID_PARIS("BrusselsCopenhagenMadridParis"),
    @XmlEnumValue("BelgradeBratislavaBudapestLjubljanaPrague")
    BELGRADE_BRATISLAVA_BUDAPEST_LJUBLJANA_PRAGUE("BelgradeBratislavaBudapestLjubljanaPrague"),
    @XmlEnumValue("AmsterdamBerlinBernRomeStockholmVienna")
    AMSTERDAM_BERLIN_BERN_ROME_STOCKHOLM_VIENNA("AmsterdamBerlinBernRomeStockholmVienna"),
    @XmlEnumValue("CasablancaMonrovia")
    CASABLANCA_MONROVIA("CasablancaMonrovia"),
    @XmlEnumValue("GreenwichMeanTimeDublinEdinburghLisbonLondon")
    GREENWICH_MEAN_TIME_DUBLIN_EDINBURGH_LISBON_LONDON("GreenwichMeanTimeDublinEdinburghLisbonLondon"),
    @XmlEnumValue("Azores")
    AZORES("Azores"),
    @XmlEnumValue("CapeVerdeIsland")
    CAPE_VERDE_ISLAND("CapeVerdeIsland"),
    @XmlEnumValue("MidAtlantic")
    MID_ATLANTIC("MidAtlantic"),
    @XmlEnumValue("Brasilia")
    BRASILIA("Brasilia"),
    @XmlEnumValue("BuenosAiresGeorgetown")
    BUENOS_AIRES_GEORGETOWN("BuenosAiresGeorgetown"),
    @XmlEnumValue("Greenland")
    GREENLAND("Greenland"),
    @XmlEnumValue("Newfoundland")
    NEWFOUNDLAND("Newfoundland"),
    @XmlEnumValue("AtlanticTimeCanada")
    ATLANTIC_TIME_CANADA("AtlanticTimeCanada"),
    @XmlEnumValue("CaracasLaPaz")
    CARACAS_LA_PAZ("CaracasLaPaz"),
    @XmlEnumValue("Santiago")
    SANTIAGO("Santiago"),
    @XmlEnumValue("BogotaLimaQuito")
    BOGOTA_LIMA_QUITO("BogotaLimaQuito"),
    @XmlEnumValue("EasternTimeUSCanada")
    EASTERN_TIME_US_CANADA("EasternTimeUSCanada"),
    @XmlEnumValue("IndianaEast")
    INDIANA_EAST("IndianaEast"),
    @XmlEnumValue("CentralAmerica")
    CENTRAL_AMERICA("CentralAmerica"),
    @XmlEnumValue("CentralTimeUSCanada")
    CENTRAL_TIME_US_CANADA("CentralTimeUSCanada"),
    @XmlEnumValue("GuadalajaraMexicoCityMonterrey")
    GUADALAJARA_MEXICO_CITY_MONTERREY("GuadalajaraMexicoCityMonterrey"),
    @XmlEnumValue("Saskatchewan")
    SASKATCHEWAN("Saskatchewan"),
    @XmlEnumValue("Arizona")
    ARIZONA("Arizona"),
    @XmlEnumValue("ChihuahuaLaPazMazatlan")
    CHIHUAHUA_LA_PAZ_MAZATLAN("ChihuahuaLaPazMazatlan"),
    @XmlEnumValue("MountainTimeUSCanada")
    MOUNTAIN_TIME_US_CANADA("MountainTimeUSCanada"),
    @XmlEnumValue("PacificTimeUSCanadaTijuana")
    PACIFIC_TIME_US_CANADA_TIJUANA("PacificTimeUSCanadaTijuana"),
    @XmlEnumValue("Alaska")
    ALASKA("Alaska"),
    @XmlEnumValue("Hawaii")
    HAWAII("Hawaii"),
    @XmlEnumValue("MidwayIslandandSamoa")
    MIDWAY_ISLANDAND_SAMOA("MidwayIslandandSamoa"),
    @XmlEnumValue("InternationalDateLineWest")
    INTERNATIONAL_DATE_LINE_WEST("InternationalDateLineWest");
    private final String value;

    ReportTimeZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportTimeZone fromValue(String v) {
        for (ReportTimeZone c: ReportTimeZone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

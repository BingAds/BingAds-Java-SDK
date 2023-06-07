
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTimeZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportTimeZone">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Nukualofa"/>
 *     <enumeration value="FijiKamchatkaMarshallIsland"/>
 *     <enumeration value="AucklandWellington"/>
 *     <enumeration value="MagadanSolomonIslandNewCaledonia"/>
 *     <enumeration value="Vladivostok"/>
 *     <enumeration value="Hobart"/>
 *     <enumeration value="GuamPortMoresby"/>
 *     <enumeration value="CanberraMelbourneSydney"/>
 *     <enumeration value="Brisbane"/>
 *     <enumeration value="Darwin"/>
 *     <enumeration value="Adelaide"/>
 *     <enumeration value="Yakutsk"/>
 *     <enumeration value="Seoul"/>
 *     <enumeration value="OsakaSapporoTokyo"/>
 *     <enumeration value="Taipei"/>
 *     <enumeration value="Perth"/>
 *     <enumeration value="KualaLumpurSingapore"/>
 *     <enumeration value="IrkutskUlaanBataar"/>
 *     <enumeration value="BeijingChongqingHongKongUrumqi"/>
 *     <enumeration value="Krasnoyarsk"/>
 *     <enumeration value="BangkokHanoiJakarta"/>
 *     <enumeration value="Rangoon"/>
 *     <enumeration value="SriJayawardenepura"/>
 *     <enumeration value="AstanaDhaka"/>
 *     <enumeration value="AlmatyNovosibirsk"/>
 *     <enumeration value="Kathmandu"/>
 *     <enumeration value="ChennaiKolkataMumbaiNewDelhi"/>
 *     <enumeration value="IslandamabadKarachiTashkent"/>
 *     <enumeration value="Ekaterinburg"/>
 *     <enumeration value="Kabul"/>
 *     <enumeration value="BakuTbilisiYerevan"/>
 *     <enumeration value="AbuDhabiMuscat"/>
 *     <enumeration value="Tehran"/>
 *     <enumeration value="Nairobi"/>
 *     <enumeration value="MoscowStPetersburgVolgograd"/>
 *     <enumeration value="KuwaitRiyadh"/>
 *     <enumeration value="Baghdad"/>
 *     <enumeration value="Jerusalem"/>
 *     <enumeration value="HelsinkiKyivRigaSofiaTallinnVilnius"/>
 *     <enumeration value="HararePretoria"/>
 *     <enumeration value="Cairo"/>
 *     <enumeration value="Bucharest"/>
 *     <enumeration value="AthensIslandanbulMinsk"/>
 *     <enumeration value="WestCentralAfrica"/>
 *     <enumeration value="SarajevoSkopjeWarsawZagreb"/>
 *     <enumeration value="BrusselsCopenhagenMadridParis"/>
 *     <enumeration value="BelgradeBratislavaBudapestLjubljanaPrague"/>
 *     <enumeration value="AmsterdamBerlinBernRomeStockholmVienna"/>
 *     <enumeration value="CasablancaMonrovia"/>
 *     <enumeration value="GreenwichMeanTimeDublinEdinburghLisbonLondon"/>
 *     <enumeration value="Azores"/>
 *     <enumeration value="CapeVerdeIsland"/>
 *     <enumeration value="MidAtlantic"/>
 *     <enumeration value="Brasilia"/>
 *     <enumeration value="BuenosAiresGeorgetown"/>
 *     <enumeration value="Greenland"/>
 *     <enumeration value="Newfoundland"/>
 *     <enumeration value="AtlanticTimeCanada"/>
 *     <enumeration value="CaracasLaPaz"/>
 *     <enumeration value="Santiago"/>
 *     <enumeration value="BogotaLimaQuito"/>
 *     <enumeration value="EasternTimeUSCanada"/>
 *     <enumeration value="IndianaEast"/>
 *     <enumeration value="CentralAmerica"/>
 *     <enumeration value="CentralTimeUSCanada"/>
 *     <enumeration value="GuadalajaraMexicoCityMonterrey"/>
 *     <enumeration value="Saskatchewan"/>
 *     <enumeration value="Arizona"/>
 *     <enumeration value="ChihuahuaLaPazMazatlan"/>
 *     <enumeration value="MountainTimeUSCanada"/>
 *     <enumeration value="PacificTimeUSCanadaTijuana"/>
 *     <enumeration value="Alaska"/>
 *     <enumeration value="Hawaii"/>
 *     <enumeration value="MidwayIslandandSamoa"/>
 *     <enumeration value="InternationalDateLineWest"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

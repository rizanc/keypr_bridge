package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import com.cloudkey.pms.response.invoice.Bill;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * This Class has information of bill requested by the guest. It has details of reservations 
 * as well as charges for the facility, avail by the guest.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class GetFolioResponse extends PMSResponse {
	/*
	<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ns3:InvoiceResponse xmlns:ns2="http://webservices.micros.com/og/4.3/Reservation/" xmlns="http://webservices.micros.com/og/4.3/Common/" xmlns:ns4="http://webservices.micros.com/og/4.3/HotelCommon/" xmlns:ns3="http://webservices.micros.com/og/4.3/ResvAdvanced/">
    <ns3:Invoice>
        <ns2:Address>
            <AddressLine>7031 Columbia Gateway Drive</AddressLine>
            <AddressLine>OGTS - 2nd Floor</AddressLine>
            <cityName>Columbia</cityName>
            <countryCode>US</countryCode>
            <postalCode>21046</postalCode>
        </ns2:Address>
        <ns2:Name>
            <firstName>Eric1</firstName>
            <lastName>Morgenstern</lastName>
        </ns2:Name>
        <ns2:ProfileIDs>
            <UniqueID type="INTERNAL" source="OPERA_NAME_ID">18082</UniqueID>
        </ns2:ProfileIDs>
        <ns2:BillNumber type="INTERNAL" source="OPERA">1</ns2:BillNumber>
        <ns2:BillItems Date="2013-06-13" Description="Valet Parking" TransactionCode="3100" TransactionNo="370492" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">33.75</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370492</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-13" Description="Sales Tax- 6%" TransactionCode="8210" TransactionNo="370493" Reference="[Add: 6%.(B)]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">2.03</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370493</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-13" Description="Minibar- Food" TransactionCode="2300" TransactionNo="370498" Supplement=" Candy Bar" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">1.75</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370498</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-13" Description="Mininar- Beverage" TransactionCode="2310" TransactionNo="370501" Supplement=" Soda" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">2.25</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370501</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-13" Description="Minbar- Miscellaneous" TransactionCode="2320" TransactionNo="370503" Supplement=" CD" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">28.0</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370503</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:CurrentBalance decimals="2">67.78</ns2:CurrentBalance>
    </ns3:Invoice>
    <ns3:Invoice>
        <ns2:Address>
            <AddressLine>7031 Columbia Gateway Drive</AddressLine>
            <cityName>Columbia</cityName>
            <countryCode>US</countryCode>
            <postalCode>21046</postalCode>
        </ns2:Address>
        <ns2:Name>
            <lastName>Micros Systems Inc</lastName>
        </ns2:Name>
        <ns2:ProfileIDs>
            <UniqueID type="INTERNAL" source="OPERA_NAME_ID">10555</UniqueID>
        </ns2:ProfileIDs>
        <ns2:BillNumber type="INTERNAL" source="OPERA">2</ns2:BillNumber>
        <ns2:BillItems Date="2013-06-11" Description="Transient Room Revenue" TransactionCode="1000" TransactionNo="370413" Reference="[NA Room]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">599.0</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370413</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-11" Description="Room Tax- 6%" TransactionCode="8300" TransactionNo="370414" Reference="[Add: 6%.(B)]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">35.94</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370414</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-11" Description="Occupancy Tax- 4%" TransactionCode="8310" TransactionNo="370415" Reference="[Add: 4%.(B)]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">23.96</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370415</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-12" Description="Transient Room Revenue" TransactionCode="1000" TransactionNo="370416" Reference="[NA Room]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">599.0</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370416</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-12" Description="Room Tax- 6%" TransactionCode="8300" TransactionNo="370417" Reference="[Add: 6%.(B)]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">35.94</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370417</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-12" Description="Occupancy Tax- 4%" TransactionCode="8310" TransactionNo="370418" Reference="[Add: 4%.(B)]" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">23.96</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370418</ns2:VatCode>
            <ns2:RevenueGroup>REVENUE</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:CurrentBalance decimals="2">1317.8</ns2:CurrentBalance>
    </ns3:Invoice>
    <ns3:Invoice>
        <ns2:Address>
            <AddressLine>7031 Columbia Gateway Drive</AddressLine>
            <AddressLine>OGTS - 2nd Floor</AddressLine>
            <cityName>Columbia</cityName>
            <countryCode>US</countryCode>
            <postalCode>21046</postalCode>
        </ns2:Address>
        <ns2:Name>
            <firstName>Eric1</firstName>
            <lastName>Morgenstern</lastName>
        </ns2:Name>
        <ns2:ProfileIDs>
            <UniqueID type="INTERNAL" source="OPERA_NAME_ID">18082</UniqueID>
        </ns2:ProfileIDs>
        <ns2:BillNumber type="INTERNAL" source="OPERA">3</ns2:BillNumber>
        <ns2:BillItems Date="2013-06-13" Description="American Express" TransactionCode="9030" TransactionNo="370419" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">-1317.8</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370419</ns2:VatCode>
            <ns2:RevenueGroup>PAYMENT</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:BillItems Date="2013-06-13" Description="American Express" TransactionCode="9030" TransactionNo="370504" OriginalRoom="104">
            <ns2:Amount currencyCode="USD">1317.8</ns2:Amount>
            <ns2:VatCode type="INTERNAL" source="OPERA">370504</ns2:VatCode>
            <ns2:RevenueGroup>PAYMENT</ns2:RevenueGroup>
        </ns2:BillItems>
        <ns2:CurrentBalance decimals="2">0.0</ns2:CurrentBalance>
    </ns3:Invoice>
    <ns3:Invoice>
        <ns2:Address>
            <AddressLine>7031 Columbia Gateway Drive</AddressLine>
            <AddressLine>OGTS - 2nd Floor</AddressLine>
            <cityName>Columbia</cityName>
            <countryCode>US</countryCode>
            <postalCode>21046</postalCode>
        </ns2:Address>
        <ns2:Name>
            <firstName>Eric1</firstName>
            <lastName>Morgenstern</lastName>
        </ns2:Name>
        <ns2:ProfileIDs>
            <UniqueID type="INTERNAL" source="OPERA_NAME_ID">18082</UniqueID>
        </ns2:ProfileIDs>
        <ns2:BillNumber type="INTERNAL" source="OPERA">4</ns2:BillNumber>
        <ns2:CurrentBalance decimals="2">0.0</ns2:CurrentBalance>
    </ns3:Invoice>
    <ns3:Result resultStatusFlag="SUCCESS"/>
</ns3:InvoiceResponse>
	 */
	List<Bill> bills;

//	ExpectedCharges expectedCharges;
}

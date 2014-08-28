package com.cloudkey.pms.common.reservation;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class HotelReference {
    private String hotelCode;

    private String chainCode;

    public HotelReference(String hotelCode, String chainCode) {
        this.hotelCode = hotelCode;
        this.chainCode = chainCode;
    }

    public String getChainCode() {
        return chainCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    @Override
    public String toString() {
        return "HotelReference{" +
                "hotelCode='" + hotelCode + '\'' +
                ", chainCode='" + chainCode + '\'' +
                '}';
    }
}

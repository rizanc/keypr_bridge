#!/bin/bash

WSDLS="
http://operademo3.microsdc.us:4300/ows_ws_51/Availability.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/Information.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/MeetingRoom.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/Membership.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/Name.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/Reservation.asmx?wsdl
http://operademo3.microsdc.us:4300/ows_ws_51/ResvAdvanced.asmx?wsdl
"

NAMESPACE_PACKAGES="http://webservices.micros.com/og/4.3/Activity/=com.cloudkey.pms.micros.og.activity
http://webservices.micros.com/og/4.3/AmandaInfo/=com.cloudkey.pms.micros.og.amandainfo
http://webservices.micros.com/og/4.3/Availability/=com.cloudkey.pms.micros.og.availability
http://webservices.micros.com/og/4.3/Common/=com.cloudkey.pms.micros.og.common
http://webservices.micros.com/og/4.3/Core/=com.cloudkey.pms.micros.og.core
http://webservices.micros.com/og/4.3/GuestServices/=com.cloudkey.pms.micros.og.guestservices
http://webservices.micros.com/og/4.3/HotelCommon/=com.cloudkey.pms.micros.og.hotelcommon
http://webservices.micros.com/og/4.3/HouseKeeping/=com.cloudkey.pms.micros.og.housekeeping
http://webservices.micros.com/og/4.3/MeetingRoom/=com.cloudkey.pms.micros.og.meetingroom
http://webservices.micros.com/og/4.3/Membership/=com.cloudkey.pms.micros.og.membership
http://webservices.micros.com/og/4.3/Name/=com.cloudkey.pms.micros.og.name
http://webservices.micros.com/og/4.3/Reservation/=com.cloudkey.pms.micros.og.reservation
http://webservices.micros.com/og/4.3/ResvAdvanced/=com.cloudkey.pms.micros.og.reservation.advanced
http://webservices.micros.com/og/4.3/Security/=com.cloudkey.pms.micros.og.security
http://webservices.micros.com/og/4.3/UnitOwners/=com.cloudkey.pms.micros.og.unitowners
http://webservices.micros.com/ows/5.1/Activity.wsdl=com.cloudkey.pms.micros.ows.activity
http://webservices.micros.com/ows/5.1/AmandaInfo.wsdl=com.cloudkey.pms.micros.ows.amandainfo
http://webservices.micros.com/ows/5.1/Availability.wsdl=com.cloudkey.pms.micros.ows.availability
http://webservices.micros.com/ows/5.1/Brochure.wsdl=com.cloudkey.pms.micros.ows.brochure
http://webservices.micros.com/ows/5.1/GuestServices.wsdl=com.cloudkey.pms.micros.ows.guestservices
http://webservices.micros.com/ows/5.1/HouseKeeping.wsdl=com.cloudkey.pms.micros.ows.housekeeping
http://webservices.micros.com/ows/5.1/Information.wsdl=com.cloudkey.pms.micros.ows.information
http://webservices.micros.com/ows/5.1/MeetingRoom.wsdl=com.cloudkey.pms.micros.ows.meetingroom
http://webservices.micros.com/ows/5.1/Membership.wsdl=com.cloudkey.pms.micros.ows.membership
http://webservices.micros.com/ows/5.1/Name.wsdl=com.cloudkey.pms.micros.ows.name
http://webservices.micros.com/ows/5.1/Reservation.wsdl=com.cloudkey.pms.micros.ows.reservation
http://webservices.micros.com/ows/5.1/ResvAdvanced.wsdl=com.cloudkey.pms.micros.ows.reservation.advanced
http://webservices.micros.com/ows/5.1/Security.wsdl=com.cloudkey.pms.micros.ows.security
http://webservices.micros.com/ows/5.1/StayHistory.wsdl=com.cloudkey.pms.micros.ows.stayhistory
http://webservices.micros.com/ows/5.1/UnitOwners.wsdl=com.cloudkey.pms.micros.ows.unitowners"

# replace the space between lines with , for use in -ns2p switch.
NSP=$(echo ${NAMESPACE_PACKAGES} | tr " " ",")

set $WSDLS;
for wsdl in "$@"; do
    wsdl2java.sh --noBuildXML -o ./ -S src/main/java -p com.cloudkey.pms.micros.services -u -uri $wsdl -ns2p "$NSP"
done;

package com.micros.ows.client;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.keypr.webservices.WebServicesModule;

public class UsingADB extends junit.framework.TestCase {

    public static void main(String[] argv) {
	    Injector injector = Guice.createInjector(new WebServicesModule());

	    OWSTestUtils testUtils = injector.getInstance(OWSTestUtils.class);
	    //testUtils.AssignRoom();

        testUtils.FutureBookingSummary();

        //testUtils.CheckIn();

        //testUtils.CheckOut();

        //testUtils.ReleaseRoom();

        //testUtils.AssignRoom();
        //testUtils.FutureBookingSummary();

        //testUtils.CheckIn();

        //testUtils.CheckOut();

        //testUtils.ReleaseRoom();

        //testUtils.Availability();

        //testUtils.ModifyBooking();

        //testUtils.Folio();
        //testUtils.HotelInformation();

        //testUtils.Membership();

        //testUtils.NameLookupByMembership();

        //testUtils.GetCardList();
    }

}

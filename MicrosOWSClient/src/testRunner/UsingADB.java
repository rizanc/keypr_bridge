package testRunner;

import com.micros.ows.reservation.ReservationServiceStub;
import org.apache.axis2.AxisFault;
import tests.TestOWS;

public class UsingADB {
  public static void main(String[] argv) {


      //TestOWS.FutureBookingSummary();

      //TestOWS.AssignRoom();

      //TestOWS.CheckIn();

      //TestOWS.CheckOut();

      //TestOWS.ReleaseRoom();

      //TestOWS.Availability();

      TestOWS.ModifyBooking();

  }


}

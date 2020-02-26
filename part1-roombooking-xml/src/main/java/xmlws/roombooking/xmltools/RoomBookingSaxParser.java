package xmlws.roombooking.xmltools;

import java.io.InputStream;

public class RoomBookingSaxParser implements RoomBookingParser {
    @Override
    public RoomBooking parse(InputStream inputStream) {
        RoomBookingSaxParser sax= new RoomBookingSaxParser();
        return sax.parse(inputStream);
    }
}

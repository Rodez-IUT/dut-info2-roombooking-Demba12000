package xmlws.roombooking.xmltools;

import org.xml.sax.SAXException;
import xmlws.roombooking.xmltools.samples.RoomBookingBasicSaxParser;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

public class RoomBookingSaxParser implements RoomBookingParser {
    @Override
    public RoomBooking parse(InputStream inputStream) {
        RoomBookingSaxParser sax= new RoomBookingSaxParser();



        return sax.parse(inputStream);
    }
}

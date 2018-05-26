package parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Arrays;

public class SaxHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(String.format("uri = %s", uri));
        System.out.println(String.format("localName = %s", localName));
        System.out.println(String.format("qName = %s", qName));
        System.out.println(String.format("attributes = %s", attributes.getValue("string")));


    }


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        System.out.println(String.format("%s", String.valueOf(Arrays.copyOfRange(ch, start, start + length))));
        System.out.println("--------------------------------");
    }
}

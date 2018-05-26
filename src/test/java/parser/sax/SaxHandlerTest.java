package parser.sax;

import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class SaxHandlerTest {

    @Test
    public void test_sax_handler() throws SAXException, IOException {
        //given
        parser.sax.SaxHandler handler = new parser.sax.SaxHandler();
        XMLReader reader = XMLReaderFactory.createXMLReader();
        reader.setContentHandler(handler);

        //then
        FileInputStream in = new FileInputStream("D:\\GitResource\\MyCrawler\\crawlermyself\\src\\main\\resources\\parser.sax\\test.xml");
        reader.parse(new InputSource(in));


    }

}

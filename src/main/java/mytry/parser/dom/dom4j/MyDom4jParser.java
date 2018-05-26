package mytry.parser.dom.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

import static mytry.constant.CommonConstant.TEST_FILE_PATH;


public class MyDom4jParser {

    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File(TEST_FILE_PATH));

    }

}

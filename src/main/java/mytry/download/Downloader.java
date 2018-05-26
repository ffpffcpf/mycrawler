package download;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Downloader {



    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("http://www.baidu.com");
        HttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();

        String filePath = "D:\\spider\\file.html";
        mytry (
                InputStream is = entity.getContent();
                FileOutputStream fos = new FileOutputStream(new File(filePath))
        ) {

            int inByte = 0;
            while ((inByte = is.read()) != -1) {
                fos.write(inByte);
            }
        }
        client.close();
    }

}

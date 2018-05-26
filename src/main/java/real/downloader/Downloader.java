package real.downloader;

import java.io.InputStream;
import java.net.URI;

public interface Downloader {

    InputStream download(URI uri);

}

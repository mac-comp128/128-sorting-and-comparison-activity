import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.net.MalformedURLException;
import org.junit.jupiter.api.Test;

import SortingPractice.URL;


public class URLTest {

    @Test
    public void testURL1(){
        String url = "https://macalester.edu/mscs/";
        try {
            URL testURL = new URL(url);
            assertEquals("https", testURL.getScheme());
            assertEquals("", testURL.getSubdomain());
            assertEquals("macalester", testURL.getDomain());
            assertEquals("edu", testURL.getTLD());
            assertEquals("/mscs/", testURL.getPath());
        } catch (MalformedURLException e) {
            fail();
        }
        
    }

    @Test
    public void testURL2() throws MalformedURLException {
        String url = "www.macalester.edu";
        try {
            URL testURL = new URL(url);
            assertEquals("", testURL.getScheme());
            assertEquals("www", testURL.getSubdomain());
            assertEquals("macalester", testURL.getDomain());
            assertEquals("edu", testURL.getTLD());
            assertEquals("", testURL.getPath());
        } catch (MalformedURLException e) {
            fail();
        }
    }
}

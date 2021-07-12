package loc.play.wright;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Paths;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("test finished");
        assertTrue(true);
    }

    @Test
    public void playingWithPlaywright(){

        try(Playwright playwright = Playwright.create()){
            BrowserType browsertype = playwright.webkit();
            Page page1 = browsertype.launch().newPage();
            Page page2 = browsertype.launch().newPage();
            Page page3 = browsertype.launch().newPage();
            page1.navigate("http://example.com");
            page1.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("page1.png")));
            page2.navigate("http://www.google.com");
            page2.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("page2.png")));
            page3.navigate("https://phptravels.com/demo/");
            page3.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("page3.png")));


        }
    }

}

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTests {
    @Test
    public void SeleniumTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.airfrance.fr");
        driver.quit();
    }
}

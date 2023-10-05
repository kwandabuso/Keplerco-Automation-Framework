import Pojo.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    LandingPage land;

    public WebDriver initialiseTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeTest
    public LandingPage LandingPage() {
        driver = initialiseTest();
        land = new LandingPage(driver);
        return land;
    }
    @AfterTest
    public void cleanUp()
    {
        driver.quit();
    }
}

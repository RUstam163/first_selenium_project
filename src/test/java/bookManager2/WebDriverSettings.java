package bookManager2;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    protected ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\DevPrograms\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test ready");
    }

    @After
    public void close() {
        driver.quit();
        System.out.println("Test close");
    }
}

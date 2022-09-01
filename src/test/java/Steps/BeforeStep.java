package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeStep {

    public static WebDriver driver;

    @Before
    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Открываем сайт {string}")
    public void openWebSite(String url) {
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}

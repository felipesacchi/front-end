package stepDefinition;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.AbstractPageObject;
import java.time.Duration;
import static driver.DriverManager.getDriver;
import static driver.DriverManager.setDriver;

public class Hooks extends AbstractPageObject {

    @Before()
    public void beforeScenario(){
        //String url = "https://www.google.com";
        String url = "https://example.testproject.io/web/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Felipe Sacchi\\repos\\front-example\\src\\test\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        setDriver(driver);

        getDriver().get(url);
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        getDriver().manage().window().maximize();
    }

    @After()
    public void afterScenario(){
        DriverManager.quit();
    }
}

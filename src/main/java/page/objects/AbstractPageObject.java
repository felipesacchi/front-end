package page.objects;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPageObject {

    protected AbstractPageObject() {
        PageFactory.initElements(DriverManager.getDriver(), this);

    }
}

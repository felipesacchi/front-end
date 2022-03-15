package page.objects;


import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;


public class LoginPage extends AbstractPageObject {

    private WebDriverWait wait;

    @FindBy(id = "name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement loginBtn;

    @FindBy(id = "logout")
    private WebElement logoutBtn;

    @FindBy(xpath = "/html/body/div[2]/div[1]/form/div[2]/div/div[2]")
    private WebElement txtPasswordInvalid;

    public static LoginPage action() {
        return new LoginPage();
    }

    public LoginPage fillUsername(String username){
        this.username.sendKeys(username);
        return new LoginPage();
    }

    public LoginPage fillPassword(String password) {
        this.password.sendKeys(password);
        return new LoginPage();
    }

    public LoginPage clickBtnLogin() {
        this.loginBtn.click();
        return new LoginPage();
    }

    public LoginPage btnLogoutDisplayed() {
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        wait.until(attributeContains(logoutBtn, "class", "btn btn-danger tp-button"));
        this.logoutBtn.isEnabled();
        return new LoginPage();
    }


    public String txtPasswordInvalid() {
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(txtPasswordInvalid));
        return this.txtPasswordInvalid.getText();
    }
}

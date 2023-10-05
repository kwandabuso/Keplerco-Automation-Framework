package Pojo;

import WaitHelper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends WaitHelper {
    WebDriver driver;

    public Register(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //page factory
    @FindBy(css = "div[class = 'sc-dmBZcA emuygO showDesktop'] u")
    WebElement signupLnk;

    //page factory
    @FindBy(id = "email")
    WebElement username;

    //page factory
    @FindBy(id = "password")
    WebElement password;

    //page factory
    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    //page factory
    @FindBy(css = "button[class='buttonWrapper buttonFilled hideArrow chubby normal']")
    WebElement signupBtn;

//    @FindBy(css = "h6[class='sc-kDvujY kIXsWz'] strong")
//    WebElement signupSuccessMsg;

    By signupSuccessMsg = By.cssSelector("h6[class='sc-kDvujY kIXsWz'] strong");

    public String getSuccessMessage()
    {
        waitForElementToAppear(signupSuccessMsg);
        return driver.findElement(signupSuccessMsg).getText();

    }
    public void enterEmail(String email)
    {
        username.sendKeys(email);
    }

    public void enterPassword(String passwordTxt)
    {
        password.sendKeys(passwordTxt);
        confirmPassword.sendKeys(passwordTxt);

    }
    public void clickSignup()
    {
        signupBtn.click();
    }

}

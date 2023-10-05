package Pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //page factory
    @FindBy(css = "div[class = 'sc-dmBZcA emuygO showDesktop'] u")
    WebElement signupLnk;

    public void openUrl()
    {
        driver.get("https://leaders.keplerco.io/account/login");

    }
    public Register clickSignup()
    {
        signupLnk.click();
        return new Register(driver);
    }

}

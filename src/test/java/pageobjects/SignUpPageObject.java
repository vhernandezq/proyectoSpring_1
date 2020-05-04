package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

private WebDriver driver;

public class SignUpPageObject(WebDriver driver){
        this.driver=driver;
        }


    private By fisrtNameTextbox = By.xpath("//input[@ng-model='FirstName']");

    private By lastName = By.xpath("//input[@ng-model='LastName']");

    private By EmailAdress = By.xpath("//input[@type='email']");

    private By phone = By.xpath("//input[@type='tel']");

    private By GenderMale = By.xpath("//input[@value='Male']");

    private By GenderFemale = By.xpath("//input[@value='Female']");

    private By Country = By.id("countries");

    private By datebirthyear = By.id("yearbox");

    private By datebirtmonth = By.xpath("//select[@ng-model='monthbox']");

    private By dateofbirthday = By.id("daybox");

    private By password = By.id("firstpassword");

    private By confirpassword = By.id("secondpassword");

    private By sumit = By.id("submitbtn");

    public void writeFirtsName(String firstname){
        this.driver.findelement(this.firstNameTestBox).sendKeys(firstname);
    }



}

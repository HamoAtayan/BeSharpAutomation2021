package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created By Hmayak on 2021, Aug, 25
 */
public class LoginPage extends BasePage {

    @FindAll({
            @FindBy(xpath = "//*[text()= 1111]"),
            @FindBy(xpath = "//*[text()= 1324]")
    })
    private WebElement hh;

    @FindBys({
            @FindBy(xpath = "//*[text()= 1111]"),
            @FindBy(xpath = "//*[text()= 1324]")
    })
    private WebElement jjjj;

    @FindBy(css = "button[data-target-id='#sign_in_modal']")
    private WebElement signIn;

    @FindBy(css = "button[class$='cookies-msg']")
    private WebElement acceptCookies;

    @FindBy(css = "div.input-error")
    private List <WebElement> errorMessages;

    @FindBy(css = "input[type='submit'][value='Մուտք']")
    private WebElement mutq;

    @FindBy(css = "input[type='password']")
    private WebElement password;

    @FindBy(css = "input[type='email']")
    private WebElement userName;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setLogin(String userName){
        this.userName.sendKeys(userName);
    }

    public void setPassword(String password){
       this.password.sendKeys(password);
    }

    public void clickOnMutq(){
        mutq.click();
    }

    public String getErorMessage(int index){
        return errorMessages.get(index).getText();
    }

    public void clickOnAcceptCookies(){
        acceptCookies.click();
    }

    public void clickA(){
        hh.click();
    }
}

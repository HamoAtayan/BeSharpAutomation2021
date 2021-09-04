package automation.pages;

import automation.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hmayak on 2021, Aug, 25
 */
public class HomePage extends BasePage {

    @FindBy(css = "button[data-target-id='#sign_in_modal']")
    private WebElement signIn;

 private  static   String text = "a0";

    @FindBy(css = "a[href='#']")
    private List <WebElement> esiminch;

    @FindBy(css = "button[id ='upload']")
    private WebElement upload;

    public HomePage(WebDriver driver) {
        super(driver,"home");
    }

    public void clickOnSignIn() {
        WaitHelper.waitForElementToBeClickable(driver, signIn);
        signIn.click();
    }

    public void uploadFile(){
        Point x = upload.getLocation();
    }


    public static void main(String[] args) {
        List<Integer> aaa = new ArrayList<>();
        System.out.println(text);
    }
}

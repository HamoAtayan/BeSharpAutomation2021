package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

        @FindBy(css = "button[data-target-id='#sign_in_modal']")
        private WebElement signIn;

        public HomePage(WebDriver driver) {
            super(driver);
        }

        public void clickOnSignIn() {
            signIn.click();
        }
    }

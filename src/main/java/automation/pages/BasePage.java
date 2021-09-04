package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Hmayak on 2021, Aug, 25
 */
public class BasePage {

    protected final WebDriver driver;
    protected String name;
    private final String serverUrl = "https://www.seleniumeasy.com/";
    private final String pagePath;

    public String getPagePath(){
        return pagePath;
    }

    public BasePage(WebDriver driver, String pagePath) {
        this.driver = driver;
        this.pagePath = pagePath;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void getPage(){
        driver.get(serverUrl+ getPagePath());
    }
}

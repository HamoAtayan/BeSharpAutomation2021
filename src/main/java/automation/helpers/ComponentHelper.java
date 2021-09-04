package automation.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hmayak on 2021, Sep, 02
 */
public interface ComponentHelper {
    Logger getLog();

    WebDriver getDriver();

    /**
     * Fully scrolls up the page
     */
    default void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, -Math.max(document.documentElement.scrollHeight));");
    }

    /**
     * Fully scrolls down the page
     */
    default void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight));");
    }

    /**
     * Clears field.
     *
     * @param field field elem.
     */
    default void clearField(WebElement field) {
        field.clear();
    }

    /**
     * Clears field and types content.
     *
     * @param field field elem.
     * @param text  text to type.
     */
    default void clearAndType(WebElement field, String text) {
        field.clear();
        field.sendKeys(text);
    }

    /**
     * Move to element.
     *
     * @param element web element.
     */
    default void moveTo(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Uploads a file to particular WebElement
     *
     * @param file    the location of the file
     * @param element particular WebElement in which the file should be uploaded
     */
    default void upload(String file, WebElement element) {
        element.sendKeys(file);
        WaitHelper.waitForAjax(getDriver());
    }

    /**
     * Refreshes the page
     */
    default void refreshPage() {
        getDriver().navigate().refresh();
        WaitHelper.waitUntilPageLoads(getDriver());
    }

    /**
     * Opens the page with given Url
     *
     * @param url - page Url
     */
    default void openPageByUrl(String url) {
        getDriver().get(url);
        WaitHelper.waitUntilPageLoads(getDriver());
    }


    /**
     * Checks if the element exists on the page and displays
     *
     * @param by - web element locator
     * @return - true if element displays, otherwise returns false
     */
    default boolean isElementExists(By by) {
        try {
            return getDriver().findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Checks if the element exists on the page and displays
     *
     * @param element - web element
     * @return - true if element displays, otherwise returns false
     */
    default boolean isElementExists(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /**
     * Checks if the given element displays during the given time period
     *
     * @param locator - web element locator
     * @param timeout - time period in seconds
     * @return - true/false
     */
    default boolean isElementDisplayInTime(By locator, int timeout) {
        try {
            WaitHelper.waitForVisibility(getDriver(), locator, timeout);
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    /**
     * Checks if the given element hides during the given time period
     *
     * @param locator - web element locator
     * @param timeout - time period in seconds
     * @return true/false
     */
    default boolean elementIsNotDisplayInTime(By locator, int timeout) {
        try {
            WaitHelper.waitForInvisibility(getDriver(), locator, timeout);
            return true;
        } catch (TimeoutException ex) {
            getLog().info(ex.getMessage());
            return false;
        }
    }

    /**
     * Hovers mouse cursor over the given web element
     *
     * @param element - web element
     */
    default void hoverOnElement(WebElement element) {
        Actions action = new Actions(getDriver());
        action.moveToElement(element).perform();
    }

    /**
     * Switch focus on the new browser tab
     */
    default void switchFocusOnNewTab() {
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle);
        }
    }

    /**
     * Opens the given element href/link in a new tab and switches the focus on it
     *
     * @param element button or hypertext
     */
    default void openElementLinkInNewTab(WebElement element) {
        element.sendKeys(Keys.CONTROL, Keys.RETURN);
        switchFocusOnNewTab();
        WaitHelper.waitUntilPageLoads(getDriver());
    }

    /**
     * Opens a new empty tab and switches focus on it
     */
    default void openNewTab() {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchFocusOnNewTab();
    }

    /**
     * Closes all tabs and keeps only the default tab (opened at the first)
     */
    default void closeNewTabs() {
        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        String defaultTab = tabs.get(0);
        for (String tab : tabs) {
            if (!tab.equals(defaultTab)) {
                getDriver().switchTo().window(tab);
                getDriver().close();
                getDriver().switchTo().window(defaultTab);
            }
        }
    }

    /**
     * Selects text from the dropdown list
     *
     * @param element     - web element
     * @param visibleText - text to be selected
     */

    default void selectByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    /**
     * Selects value from the dropdown list
     *
     * @param element - web element
     * @param value   - String value to be selected
     */
    default void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
}

package automation.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitHelper {

        public static final int TIMEOUT = 10;
        public static final int LONG_TIMEOUT = 30;

        private static final Logger LOG = LoggerFactory.getLogger(WaitHelper.class);

        /**
         * Returns long timeout config.
         *
         * @return long timeout config.
         */
        public static int getLongTimeout() {
            return LONG_TIMEOUT;
        }

        /**
         * Returns timeout config.
         *
         * @return timeout config.
         */
        public static int getTimeout() {
            return TIMEOUT;
        }

        /**
         * Waits for ajax to complete.
         *
         * @param driver web driver.
         */
        public static void waitForAjax(WebDriver driver) {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.jsReturnsValue("return $.active === 0"));
        }

        /**
         * Wait for attribute value.
         *
         * @param driver    web driver.
         * @param element   web element.
         * @param attribute attribute name.
         * @param value     attribute value to check with starts with.
         */
        public static void waitForAttributeToBe(WebDriver driver, WebElement element, String attribute, String value) {
            waitForAttributeToBe(driver, element, attribute, value, TIMEOUT);
        }

        /**
         * Wait for attribute value.
         *
         * @param driver    web driver.
         * @param element   web element.
         * @param attribute attribute name.
         * @param value     attribute value.
         */
        public static void waitForAttributeToBe(WebDriver driver, WebElement element, String attribute, String value, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
        }

        public static void waitForBlablabla(WebDriver driver, WebElement element){
            WebDriverWait webDriverWait = new WebDriverWait(driver,10);
            webDriverWait.until(elementToBeClickable(element));
        }

        /**
         * Wait for element to be attached to page document and wait for its attribute value to be expected.
         *
         * @param driver    web driver.
         * @param element   web element locator.
         * @param attribute attribute name.
         * @param value     attribute value to check with starts with.
         * @param timeout   max waiting time
         */
        public static void waitForElementAttributeToBe(WebDriver driver, WebElement element, String attribute, String value, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> {
                try {
                    return element.getAttribute(attribute).equals(value);
                } catch (StaleElementReferenceException ex) {
                    return false;
                }
            });
        }

        /**
         * Wait for web element text to be changed
         *
         * @param driver  - web driver
         * @param element - web element
         * @param timeout - max waiting time
         */
        public static void waitForTextToBeChanged(WebDriver driver, WebElement element, int timeout) {
            String text = element.getText();
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> !(text.equals(element.getText())));
        }

        /**
         * Wait for web element to not contain the given attribute
         *
         * @param driver    - web driver
         * @param element   - web element
         * @param attribute - attribute which needs to be missing
         * @param timeout   - max waiting time
         */
        public static void waitForElementToNotContainAttribute(WebDriver driver, WebElement element, String attribute, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> (null == element.getAttribute(attribute)));
        }

        /**
         * Wait for autocomplete suggestion.
         *
         * @param driver  - web driver.
         * @param input   - autocompletion input.
         * @param timeout - maximum waiting time
         */
        public static void waitForAutoComplete(WebDriver driver, String input, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> {
                try {
                    By xpath = By.xpath("//ul[contains(@class, 'ui-autocomplete')][contains(@style, 'display: block')]//tr");
                    List<WebElement> elements = webDriver.findElements(xpath);
                    for (WebElement element : elements) {
                        if (element.getText().toUpperCase().contains(input.toUpperCase())) {
                            element.click();
                            return true;
                        }
                    }
                    return false;
                } catch (ElementNotInteractableException | StaleElementReferenceException | NoSuchElementException ignored) {
                    return false;
                }
            });
        }

        /**
         * Wait for autocomplete suggestion.
         *
         * @param driver        - web driver.
         * @param input         - autocompletion input.
         * @param timeout       - maximum waiting time
         * @param elementsXpath - suggested webElements
         */
        public static void waitForAutoComplete(WebDriver driver, String input, int timeout, String elementsXpath) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> {
                try {
                    By xpath = By.xpath(elementsXpath);
                    List<WebElement> elements = webDriver.findElements(xpath);
                    for (WebElement element : elements) {
                        if (element.getText().toUpperCase().contains(input.toUpperCase())) {
                            element.click();
                            return true;
                        }
                    }
                    return false;
                } catch (ElementNotInteractableException | StaleElementReferenceException | NoSuchElementException ignored) {
                    return false;
                }
            });
        }

        /**
         * Wait for autocomplete suggestion.
         *
         * @param driver - web driver.
         * @param input  - autocompletion input.
         */
        public static void waitForAutoComplete(WebDriver driver, String input) {
            waitForAutoComplete(driver, input, TIMEOUT);
        }

        /**
         * Wait for web element value attribute to contain the given text
         *
         * @param driver  - web driver
         * @param element - web element
         * @param text    - expected text
         */
        public static void waitForElementToContain(WebDriver driver, WebElement element, String text) {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.attributeContains(element, "value", text));
        }

        /**
         * Wait for element visibility
         *
         * @param driver  - web driver
         * @param element - web element
         */
        public static void waitForVisibility(WebDriver driver, WebElement element) {
            waitForVisibility(driver, element, TIMEOUT);
        }

        /**
         * Wait for element visibility
         *
         * @param driver  - web driver.
         * @param element - web element.
         * @param timeout - max waiting time
         */
        public static void waitForVisibility(WebDriver driver, WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(visibilityOf(element));
        }

        /**
         * Wait for element visibility.
         *
         * @param driver  web driver.
         * @param locator web element locator.
         * @param timeOut maximum waiting time
         */
        public static void waitForVisibility(WebDriver driver, By locator, int timeOut) {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        /**
         * Wait for element visibility.
         *
         * @param driver  web driver.
         * @param locator web element locator.
         */
        public static void waitForVisibility(WebDriver driver, By locator) {
            waitForVisibility(driver, locator, TIMEOUT);
        }

        /**
         * Wait for text invisibility in a particular webElement.
         *
         * @param driver  - web driver.
         * @param element - web element.
         * @param text    - text to be invisible
         * @param timeout - maximum waiting timeout
         */
        public static void waitForTextInvisibility(WebDriver driver, WebElement element, String text, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.not(textToBePresentInElement(element, text)));
        }

        /**
         * Wait for text invisibility in a particular webElement.
         *
         * @param driver  - web driver.
         * @param element - web element.
         * @param text    - text to be invisible
         */
        public static void waitForTextInvisibility(WebDriver driver, WebElement element, String text) {
            waitForTextInvisibility(driver, element, text, TIMEOUT);
        }

        /**
         * Wait for text to be present on particular web element
         *
         * @param driver       - web driver
         * @param element      - web element
         * @param expectedText - expected to be present
         * @param timeout      - max waiting time
         */
        public static void waitForElementTextToBe(WebDriver driver, WebElement element, String expectedText, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(textToBePresentInElement(element, expectedText));
        }

        /**
         * Wait for text to be present on particular web element
         *
         * @param driver       - web driver
         * @param element      - web element
         * @param expectedText - expected to be present
         */
        public static void waitForElementTextToBe(WebDriver driver, WebElement element, String expectedText) {
            waitForElementTextToBe(driver, element, expectedText, TIMEOUT);
        }

        /**
         * Wait for element to be clickable.
         *
         * @param driver  - web driver.
         * @param element - web element.
         */
        public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
            waitForElementToBeClickable(driver, element, TIMEOUT);
        }

        /**
         * Wait for element to be clickable.
         *
         * @param driver  - web driver.
         * @param element - web element.
         * @param timeout - max waiting timeout
         */
        public static void waitForElementToBeClickable(WebDriver driver, WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(elementToBeClickable(element));
        }

        /**
         * Wait for element to be clickable.
         *
         * @param driver  - web driver.
         * @param locator - web element locator.
         * @param timeout - max waiting timeout
         */
        public static void waitForElementToBeClickable(WebDriver driver, By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(elementToBeClickable(locator));
        }

        /**
         * Wait for element to be clickable.
         *
         * @param driver  - web driver.
         * @param locator - web element locator.
         */
        public static void waitForElementToBeClickable(WebDriver driver, By locator) {
            waitForElementToBeClickable(driver, locator, TIMEOUT);
        }


        /**
         * Wait for element invisibility.
         *
         * @param driver -  driver.
         * @param element       - web element.
         * @param timeout       - max waiting time
         */
        public static void waitForInvisibility(WebDriver driver, WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.invisibilityOf(element));
        }

        /**
         * Wait for element invisibility
         *
         * @param driver - web driver
         * @param element       - web element
         */
        public static void waitForInvisibility(WebDriver driver , WebElement element) {
            waitForInvisibility(driver, element, TIMEOUT);
        }

        /**
         * Wait for web element invisibility by given locator.
         *
         * @param driver  - web driver.
         * @param locator - web element locator.
         * @param timeout - max waiting time
         */
        public static void waitForInvisibility(WebDriver driver, By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        }

        /**
         * Wait for web element invisibility by given locator.
         *
         * @param driver  - web driver.
         * @param locator - web element locator.
         */
        public static void waitForInvisibility(WebDriver driver, By locator) {
            waitForInvisibility(driver, locator, TIMEOUT);
        }

        /**
         * Wait for JQuery, JS and Angular are ready
         *
         * @param driver - web driver
         */
        public static void waitUntilPageLoads(WebDriver driver) {
            waitUntilJSReady(driver);
            waitUntilJQueryReady(driver);
            waitUntilAngularReady(driver);
            waitUntilAngular5Ready(driver);
        }

        /**
         * Waits until all JQueries to be ready
         *
         * @param driver web driver instance
         */
        private static void waitUntilJQueryReady(WebDriver driver) {
            Boolean jQueryDefined = (Boolean) ((JavascriptExecutor) driver).executeScript("return typeof jQuery != 'undefined'");
            if (Boolean.TRUE.equals(jQueryDefined)) {
                try {
                    boolean jqueryReady = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
                    if (!Boolean.TRUE.equals(jqueryReady)) {
                        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                        ExpectedCondition<Boolean> jQueryLoad = webDriver ->
                                ((Long) ((JavascriptExecutor) driver)
                                        .executeScript("return jQuery.active") == 0);
                        wait.until(jQueryLoad);
                    }
                } catch (WebDriverException ex) {
                    LOG.info(ex.getMessage());
                }
            }
        }

        /**
         * Waits until JS to be redy
         *
         * @param driver web driver instance
         */
        private static void waitUntilJSReady(WebDriver driver) {
            try {
                String readyState = "return document.readyState";
                boolean jsReady = ((JavascriptExecutor) driver).executeScript(readyState).toString().equals("complete");
                if (!jsReady) {
                    WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                    ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor) driver)
                            .executeScript(readyState).toString().equals("complete");
                    wait.until(jsLoad);
                }
            } catch (WebDriverException ex) {
                LOG.info(ex.getMessage());
            }
        }

        /**
         * Waits until all Angular scripts to be completed
         *
         * @param driver web driver instance
         */
        private static void waitUntilAngularReady(WebDriver driver) {
            try {
                Boolean angularUnDefined = (Boolean) ((JavascriptExecutor) driver).executeScript("return window.angular === undefined");
                if (!Boolean.TRUE.equals(angularUnDefined)) {
                    Boolean angularInjectorUnDefined = (Boolean) ((JavascriptExecutor) driver).executeScript("return angular.element(document).injector() === undefined");
                    if (!Boolean.TRUE.equals(angularInjectorUnDefined)) {
                        String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
                        angularLoads(driver, angularReadyScript);
                    }
                }
            } catch (WebDriverException ex) {
                LOG.info(ex.getMessage());
            }
        }

        /**
         * Waits until all Angular 5 projects to be ready
         *
         * @param driver web driver instance
         */
        private static void waitUntilAngular5Ready(WebDriver driver) {
            try {
                Object angular5Check = ((JavascriptExecutor) driver).executeScript("return getAllAngularRootElements()[0].attributes['ng-version']");
                if (angular5Check != null) {
                    String angularReadyScript = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1";
                    Boolean angularPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript(angularReadyScript);
                    if (!Boolean.TRUE.equals(angularPageLoaded)) {
                        angularLoads(driver, angularReadyScript);
                    }
                }
            } catch (WebDriverException ex) {
                LOG.info(ex.getMessage());
            }
        }

        private static void angularLoads(WebDriver driver, String angularReadyScript) {
            try {
                Boolean angularReady = Boolean.valueOf(((JavascriptExecutor) driver).executeScript(angularReadyScript).toString());
                if (!Boolean.TRUE.equals(angularReady)) {
                    WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                    wait.until(webDriver -> Boolean.valueOf(((JavascriptExecutor) driver)
                            .executeScript(angularReadyScript).toString()));
                }
            } catch (WebDriverException ex) {
                LOG.info(ex.getMessage());
            }
        }

        /**
         * Wait until element to be selected (clicks on it if it is not selected and wait until it becomes selected)
         *
         * @param driver  - web driver
         * @param element - web element
         * @param timeout - max waiting time
         */
        public static void waitForFieldToBeSelected(WebDriver driver, WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(webDriver -> {
                if (!element.equals(driver.switchTo().activeElement())) {
                    element.click();
                    return false;
                } else {
                    return true;
                }
            });
        }

        /**
         * Refreshes the page until given webElement attribute value changes
         *
         * @param driver    web driver
         * @param element   web element
         * @param attribute attribute which value should be changed
         * @param timeout   maximum waiting time
         */
        public static void refreshPageUntilAttributeToBeChanged(WebDriver driver, WebElement element, String attribute, int timeout) {
            String attributeValue = element.getAttribute(attribute);
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, timeout).pollingEvery(Duration.ofSeconds(2));
            wait.until(webDriver -> {
                if (attributeValue.equals(element.getAttribute(attribute))) {
                    driver.navigate().refresh();
                    return false;
                } else {
                    return true;
                }
            });
        }

        /**
         * Refreshes the page until given webElement attribute value to be the expected value
         *
         * @param driver    web driver
         * @param element   web element
         * @param attribute attribute which value should be changed
         * @param value     attribute expected value
         * @param timeout   maximum waiting time
         */
        public static void refreshPageUntilAttributeToBe(WebDriver driver, WebElement element, String attribute, String value, int timeout) {
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, timeout).pollingEvery(Duration.ofSeconds(2));
            wait.until(webDriver -> {
                String attributeValue = element.getAttribute(attribute);
                if (!attributeValue.equals(value)) {
                    driver.navigate().refresh();
                    return false;
                } else {
                    return true;
                }
            });
        }

        /**
         * Refreshes the page until given webElement will have text displayed
         *
         * @param driver  web driver
         * @param element web element
         * @param timeout maximum waiting time
         */
        public static void refreshPageUntilTextDisplays(WebDriver driver, WebElement element, int timeout) {
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, timeout).pollingEvery(Duration.ofSeconds(5));
            wait.until(webDriver -> {
                if (element.getText().isEmpty()) {
                    driver.navigate().refresh();
                    return false;
                } else {
                    return true;
                }
            });
        }

        /**
         * Waits until page Url to be expected Url
         *
         * @param driver      web driver
         * @param expectedUrl expected Url
         * @param timeout     maximum waiting time
         */
        public static void waitUntilUrlToBe(WebDriver driver, String expectedUrl, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.urlToBe(expectedUrl));
        }

        /**
         * Waits until page Url to be expected Url
         *
         * @param driver      web driver
         * @param expectedUrl expected Url
         */
        public static void waitUntilUrlToBe(WebDriver driver, String expectedUrl) {
            waitUntilUrlToBe(driver, expectedUrl, TIMEOUT);
        }

        /**
         * Waits until the count of web elements by given locator equals to the expected count
         *
         * @param driver   web driver
         * @param elements elements locator
         * @param count    expected count
         */
        public static void waitUntilElementsCountToBe(WebDriver driver, By elements, int count) {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.numberOfElementsToBe(elements, count));
        }

        /**
         * Waits until the file with given name and extension exists in the given directory, and deletes it.
         *
         * @param driver        web driver
         * @param downloadsPath path starting from home
         * @param fileName      name of a file
         * @param fileExtension file extension
         */
        public static void waitForFileToBeDownloaded(WebDriver driver, String downloadsPath, String fileName, String fileExtension) {
            String dirPath = String.format("%s/%s", System.getProperty("user.home"), downloadsPath);
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, TIMEOUT).pollingEvery(Duration.ofSeconds(2));
            wait.until(webDriver -> {
                try (Stream<Path> stream = Files.walk(Paths.get(dirPath), 1)) {
                    List<Path> filesList = stream.filter(file -> {
                        String name = file.getFileName().toString();
                        return name.contains(fileName) && name.contains(String.format(".%s", fileExtension));
                    }).collect(Collectors.toList());
                    if (filesList.isEmpty()) {
                        return false;
                    }
                    for (Path path : filesList) {
                        Files.delete(path);
                    }
                    return true;
                } catch (IOException ex) {
                    LOG.info(ex.getMessage());
                    return false;
                }
            });
        }

        public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                wait.until(visibilityOf(element));
            } catch (WebDriverException e) {
                System.out.println("Element is not visible");
                e.printStackTrace();
            }
        }

        public static void waitUntilElementTextToBeDisplayed(WebDriver driver, WebElement element, String text) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                wait.until(textToBePresentInElement(element, text));
            } catch (WebDriverException e) {
                System.out.println("Element text is not displayed");
                e.printStackTrace();
            }
        }

        private WaitHelper() {
            throw new UnsupportedOperationException("Unable to create instance.");
        }
    }

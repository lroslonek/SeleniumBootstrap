package utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize()
    }

    public static void initialize() {
        if (driver == null) createNewDriverInstance()
    }

    private static void createNewDriverInstance() {
        driver = new FirefoxDriver()
    }

    public static WebDriver getDriver() {
        driver
    }

    public static void destroyDriver() {
        driver.quit()
        driver = null
    }
}

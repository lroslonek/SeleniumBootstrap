package pageobject

import org.openqa.selenium.WebDriver
import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class DefaultPage {

    protected final static Logger log = LoggerFactory.getLogger(DefaultPage.class)
    protected WebDriver driver
    protected static final BASE_URL = "http://google.pl"

}

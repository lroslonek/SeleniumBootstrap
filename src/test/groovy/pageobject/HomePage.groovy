package pageobject

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import utils.DriverFactory

import static org.assertj.core.api.Assertions.assertThat

class HomePage extends DefaultPage {

//    WebDriver driver

    @FindBy(id = "someId")
    private WebElement someWebelem

    @FindBy(id = "someId2")
    private WebElement someWebelem2

    public HomePage() {
        driver = new DriverFactory().getDriver();
        driver.get("http://google.pl")
        PageFactory.initElements(driver, this)
    }

    public HomePage doSomethingHome() {
        log.info "doSmthMethod ##" + driver.getCurrentUrl()
        this
    }

    public AnotherPage changePageToAnother() {
        new AnotherPage()
    }

    public void assertThatPageIsGoogle() {
        assertThat(driver.getCurrentUrl()).contains("google")
    }


}

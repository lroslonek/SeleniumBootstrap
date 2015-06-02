package pageobject

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import utils.DriverFactory

import static org.assertj.core.api.Assertions.assertThat

class AnotherPage extends DefaultPage {

    @FindBy(id = "someId")
    private WebElement someWebelem

    @FindBy(id = "someId2")
    private WebElement someWebelem2

    public AnotherPage() {
        driver = new DriverFactory().getDriver();
        driver.get(BASE_URL + "/calendar/")
        PageFactory.initElements(driver, this)
    }

    public AnotherPage doSomethingAnother() {
        log.info "doSmthMethod ##" + driver.getCurrentUrl()
        this
    }

    public void assertThatPageIsCalendar() {
        assertThat(driver.getCurrentUrl()).contains("cal")
    }
}

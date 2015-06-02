package tests

import pageobject.DefaultPage
import pageobject.HomePage

class PocTestSpec extends BaseSpec {

    def "should do something"() {

        when: "user should do something"
        DefaultPage page = new HomePage()
                .doSomethingHome()
                .changePageToAnother()
                .doSomethingAnother()

        then: "should be done something"
        page.assertThatPageIsCalendar()
    }

}

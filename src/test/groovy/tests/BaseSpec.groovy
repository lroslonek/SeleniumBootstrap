package tests

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification
import utils.DriverFactory

class BaseSpec extends Specification {

    private final static Logger log = LoggerFactory.getLogger(BaseSpec.class)

    def setup() {
        log.info "#TEST: " + this.specificationContext.iterationInfo.name
    }

    def cleanup() {
        DriverFactory.destroyDriver()
    }
}

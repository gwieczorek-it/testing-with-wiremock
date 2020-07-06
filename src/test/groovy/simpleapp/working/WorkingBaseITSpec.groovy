package simpleapp.working


import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(webEnvironment = RANDOM_PORT)
abstract class WorkingBaseITSpec extends Specification {

    @Rule
    WireMockRule serviceA = initWireMockRule(10010)
    @Rule
    WireMockRule serviceB = initWireMockRule(10011)
    @Rule
    WireMockRule serviceC = initWireMockRule(10012)
    @Rule
    WireMockRule serviceD = initWireMockRule(10013)
    @Rule
    WireMockRule serviceE = initWireMockRule(10014)
    @Rule
    WireMockRule serviceF = initWireMockRule(10015)
    @Rule
    WireMockRule serviceG = initWireMockRule(10016)
    @Rule
    WireMockRule serviceH = initWireMockRule(10017)
    @Rule
    WireMockRule serviceI = initWireMockRule(10018)
    @Rule
    WireMockRule serviceJ = initWireMockRule(10019)

    @Autowired
    TestRestTemplate restTemplate

    String askDummyEndpoint() {
        restTemplate.getForObject("/dummy", String)
    }

    private static WireMockRule initWireMockRule(int port) {
        new WireMockRule(
                wireMockConfig()
                        .port(port)
                        .jettyStopTimeout(10) //jetty default is 30k, any value other that 0 should work - ie. 10ms works too
        )
    }

}

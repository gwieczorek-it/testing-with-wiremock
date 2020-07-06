package simpleapp.crushing

import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(webEnvironment = RANDOM_PORT)
abstract class CrushingBaseITSpec extends Specification {

    @Rule
    WireMockRule serviceA = new WireMockRule(10010)
    @Rule
    WireMockRule serviceB = new WireMockRule(10011)
    @Rule
    WireMockRule serviceC = new WireMockRule(10012)
    @Rule
    WireMockRule serviceD = new WireMockRule(10013)
    @Rule
    WireMockRule serviceE = new WireMockRule(10014)
    @Rule
    WireMockRule serviceF = new WireMockRule(10015)
    @Rule
    WireMockRule serviceG = new WireMockRule(10016)
    @Rule
    WireMockRule serviceH = new WireMockRule(10017)
    @Rule
    WireMockRule serviceI = new WireMockRule(10018)
    @Rule
    WireMockRule serviceJ = new WireMockRule(10019)

    @Autowired
    TestRestTemplate restTemplate

    String askDummyEndpoint() {
        restTemplate.getForObject("/dummy", String)
    }

}

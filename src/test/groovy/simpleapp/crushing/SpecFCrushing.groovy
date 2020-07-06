package simpleapp.crushing

import spock.lang.Unroll

class SpecFCrushing extends CrushingBaseITSpec {

    @Unroll
    def "test dummy #i"() {
        expect:
        askDummyEndpoint() == "dummy"

        where:
        i << (1..15)
    }

}

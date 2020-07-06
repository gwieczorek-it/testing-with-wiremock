package simpleapp.crushing

import spock.lang.Unroll

class SpecICrushing extends CrushingBaseITSpec {

    @Unroll
    def "test dummy #i"() {
        expect:
        askDummyEndpoint() == "dummy"

        where:
        i << (1..15)
    }

}

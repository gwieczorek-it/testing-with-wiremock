package simpleapp.working


import spock.lang.Unroll

class SpecEWorking extends WorkingBaseITSpec {

    @Unroll
    def "test dummy #i"() {
        expect:
        askDummyEndpoint() == "dummy"

        where:
        i << (1..15)
    }

}

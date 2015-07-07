package test

import spock.lang.Specification

class CoveredSpec extends Specification {

    def 'create a Covered and cover its method'(){
        given:
        def aCovered = new Covered()

        when:
        def run = aCovered.coveredMethod()

        then:
        run

    }
}

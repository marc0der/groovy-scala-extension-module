package com.wiredforcode.groovy.extensions.scala

import scala.concurrent.Future
import spock.lang.Specification

import java.util.concurrent.TimeUnit

class FutureExtensionsSpec extends Specification {

    def expected = 10
    def process = {
        Thread.sleep(500)
        expected
    }
    Future future = FutureFixture.future(process())

    void "should decorate a scala future with blocking await result functionality"() {
        when:
        def actual = future.result()

        then:
        actual == expected
    }

    void "should decorate a scala future with blocking await result timeout in seconds"() {
        given:
        when:
        def actual = future.result(10)

        then:
        actual == expected
    }

    void "should decorate a scala future with blocking await result timeout in timeunits"() {
        when:
        def actual = future.result(10, TimeUnit.SECONDS)

        then:
        actual == expected
    }

    void "should decorate a scala future with blocking await ready functionality"() {
        when:
        future.ready()

        then:
        future.completed
    }

    void "should decorate a scala future with blocking await ready timeout in seconds"() {
        given:
        when:
        future.ready(10)

        then:
        future.completed
    }

    void "should decorate a scala future with blocking await ready timeout in timeunits"() {
        when:
        future.ready(10, TimeUnit.SECONDS)

        then:
        future.completed
    }
}

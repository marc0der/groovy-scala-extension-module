package com.wiredforcode.groovy.extensions.scala

import scala.collection.Seq
import scala.collection.Set
import spock.lang.Specification

class CollectionExtensionsSpec extends Specification {
    void "should convert a groovy range to a scala list"() {
        given:
        def range = 1..3

        expect:
        range.toScalaList() instanceof scala.collection.immutable.List
        range.toScalaList().size() == 3
        range.toScalaList().apply(0) == 1
        range.toScalaList().apply(1) == 2
        range.toScalaList().apply(2) == 3
    }

    void "shold convert a groovy list to a scala set"() {
        given:
        def list = [1, 2, 3, 3]

        expect:
        list.toScalaSet() instanceof Set
        list.toScalaSet().size() == 3
        list.toScalaSet().contains(1)
        list.toScalaSet().contains(2)
        list.toScalaSet().contains(3)
    }

    void "should convert a groovy collection to a scala sequence"() {
        given:
        def collection = ["1", "2", "3", "4"] as Collection

        expect:
        collection.toScalaSeq() instanceof Seq
        collection.toScalaSeq().size() == 4
        collection.toScalaSeq().apply(0) == "1"
        collection.toScalaSeq().apply(1) == "2"
        collection.toScalaSeq().apply(2) == "3"
        collection.toScalaSeq().apply(3) == "4"
    }

    void "should convert a java map to a scala map"() {
        given:
        def hashMap = [a: "1", b: "2", c: "3"]

        expect:
        hashMap.toScalaMap() instanceof scala.collection.mutable.Map
        hashMap.toScalaMap().apply("a") == "1"
        hashMap.toScalaMap().apply("b") == "2"
        hashMap.toScalaMap().apply("c") == "3"
    }
}

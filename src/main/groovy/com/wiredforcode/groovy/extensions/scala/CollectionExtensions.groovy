package com.wiredforcode.groovy.extensions.scala

import scala.collection.Iterator
import scala.collection.JavaConversions
import scala.collection.immutable.*
import scala.collection.Seq

class CollectionExtensions {
    static <T> List<T> toScalaList(Collection<T> collection) {
        toScalaIterator(collection).toList()
    }

    static <T> Set<T> toScalaSet(Collection<T> collection) {
        toScalaIterator(collection).toSet()
    }

    static <T> Seq<T> toScalaSeq(Collection<T> collection) {
        toScalaIterator(collection).toSeq()
    }

    private static <T> Iterator<T> toScalaIterator(Collection<T> collection) {
        JavaConversions.asScalaIterator(collection.iterator())
    }
}
package com.wiredforcode.groovy.extensions.scala

import java.util

import scala.collection.JavaConversions._
import scala.collection.mutable

object CollectionExtensions {
  def toScalaList[T](c: java.util.Collection[T]): List[T] = toScalaIterator(c).toList

  def toScalaSet[T](c: java.util.Collection[T]): Set[T] = toScalaIterator(c).toSet

  def toScalaSeq[T](c: java.util.Collection[T]): Seq[T] = toScalaIterator(c).toSeq

  def toScalaMap[K, V](m: java.util.AbstractMap[K, V]): mutable.Map[K, V] = mapAsScalaMap(m)

  private def toScalaIterator[T](c: util.Collection[T]) = asScalaIterator(c.iterator())
}

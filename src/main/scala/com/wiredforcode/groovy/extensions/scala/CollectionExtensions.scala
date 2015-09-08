package com.wiredforcode.groovy.extensions.scala

import scala.collection.JavaConversions._
import scala.collection.mutable

object CollectionExtensions {
  def toScalaList[T](c: java.util.Collection[T]): List[T] = c.toList

  def toScalaSet[T](c: java.util.Collection[T]): Set[T] = c.toSet

  def toScalaSeq[T](c: java.util.Collection[T]): Seq[T] = c.toSeq

  def toScalaMap[K, V](m: java.util.AbstractMap[K, V]): mutable.Map[K, V] = mapAsScalaMap(m)
}

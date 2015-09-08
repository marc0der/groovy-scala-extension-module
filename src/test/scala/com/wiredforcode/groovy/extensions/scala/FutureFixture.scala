package com.wiredforcode.groovy.extensions.scala

import scala.concurrent.Future

object FutureFixture {
   def future[T](t: T) = Future.successful(t)
 }

package com.wiredforcode.groovy.extensions.scala

import java.util.concurrent.TimeUnit.SECONDS

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureExtensions {
  def result[T](f: Future[T]): T = Await.result(f, Duration(10, SECONDS))

  def result[T](f: Future[T], amount: Int): T = Await.result(f, Duration(amount, SECONDS))

  def result[T](f: Future[T], amount: Int, timeUnit: TimeUnit): T = Await.result(f, Duration(amount, timeUnit))

  def ready[T](f: Future[T]): f.type = Await.ready(f, Duration(10, SECONDS))

  def ready[T](f: Future[T], amount: Int): f.type = Await.ready(f, Duration(amount, SECONDS))

  def ready[T](f: Future[T], amount: Int, timeUnit: TimeUnit): f.type = Await.ready(f, Duration(amount, timeUnit))
}

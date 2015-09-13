## Groovy Scala Extension Module

The aim of this [Groovy Extension Module](http://mrhaki.blogspot.com/2013/01/groovy-goodness-adding-extra-methods.html) is to provide easy interoperability with Scala types.

### Dependency

Ensure that you have Bintray enabled as repository:

    repositories {
        jcenter()
    }

Then simply add the following build dependency to your project:

    compile 'com.wiredforcode:groovy-scala-extension-module:0.3'
    
### Collections

It decorates all `java.util.Collection` and `java.util.AbstractMap` instances with handy convenience methods such as:

* `java.util.Collection.toScalaList()` yields a `scala.collection.immutable.List`
* `java.util.Collection.toScalaSet()` yields a `scala.collection.immutable.Set`
* `java.util.Collection.toScalaSeq()` yields a `scala.collection.Seq`
* `java.util.AbstractMap.toScalaMap` yields a `scala.collection.mutable.Map`

### Futures

Decorates `scala.concurrent.Future[T]` instances with:

* `result()` yields the wrapped `T` with default timeout of 10 Seconds
* `result(length: Int)` yields the wrapped `T` with timeout of `length` Seconds
* `result(length: Int, unit: TimeUnit)` yields the wrapped `T` with timeout of `length` in `unit`s
* `ready()` blocks until ready with default timeout of 10 Seconds
* `ready(length: Int)` blocks until ready with timeout of `length` Seconds
* `ready(length: Int, unit: TimeUnit)` blocks until ready with timeout of `length` in `unit`s

### The Future

As the need arises, more sugar will be added to this extension module. Pull requests are always welcome!

## Groovy Scala Extension Module

The aim of this [Groovy Extension Module](http://mrhaki.blogspot.com/2013/01/groovy-goodness-adding-extra-methods.html) is to provide easy interoperability with Scala types.

### Collections

Currently this is the only integration point provided by the module. It decorates all `java.util.Collection` instances with handy convenience methods such as:

* `Collection.toScalaList()` yields a `scala.collection.immutable.List`
* `Collection.toScalaSet()` yields a `scala.collection.immutable.Set`
* `Collection.toScalaSeq()` yields a `scala.collection.Seq`

### The Future

As the need arises, more sugar will be added to this extension module. Pull requests are always welcome!
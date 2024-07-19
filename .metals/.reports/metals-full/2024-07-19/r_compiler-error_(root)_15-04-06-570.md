file://<WORKSPACE>/learn-scala/src/main/scala/06_ContextualAbstractions.scala
### scala.MatchError: TypeDef(T,TypeBoundsTree(EmptyTree,EmptyTree,EmptyTree)) (of class dotty.tools.dotc.ast.Trees$TypeDef)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 785
uri: file://<WORKSPACE>/learn-scala/src/main/scala/06_ContextualAbstractions.scala
text:
```scala
object `06_ContextualAbstractions` {
  /*
        Context parameters/arguments:
            Some functions takes phantom argumens:
                    aList.sorted ==> aList.sorted(Ordering[Int])
                    Ordering[Int] is an object that specifies the way we order an Int
                    We can create custom Ordering[t] object if we dont wanth the default behaivior
   */
  val aList = List(2, 3, 1, 4)
  val anOrderList = aList.sorted // sorted(Ordering[Int])

  // Custom Ordering object
  // By setting the object as given the compiler will see that we provide a custom type of Ordering[Int]
  // and it will pass it to the sorted function
  given descOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)

  trait Combinator[T] {
    def combine(x: T, y: T): T
  }d@@

  def main(args: Array[String]): Unit = {
    println(anOrderList)
  }
}

```



#### Error stacktrace:

```
dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents$$anonfun$2(KeywordsCompletions.scala:218)
	scala.Option.map(Option.scala:242)
	dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents(KeywordsCompletions.scala:219)
	dotty.tools.pc.completions.KeywordsCompletions$.contribute(KeywordsCompletions.scala:44)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:114)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

scala.MatchError: TypeDef(T,TypeBoundsTree(EmptyTree,EmptyTree,EmptyTree)) (of class dotty.tools.dotc.ast.Trees$TypeDef)
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
  }

  // the combinaAll will combina the items of the list based on the logic of a Combinator[T]
  // so it requires an instance of Combinator[T]
  def combinaAll[T](list: List[T])(using combinator: Combinator[T]): T =
    list.reduce((a, b) => combinator.combine(a, b))

  // if we call the combinaAll it will search for an instance of Combinator[T]
  // until this point we dont have an instace so we will have compile error
  val theSum = combinaAll(aList)

  // here we will initiate an instance of Combinator[T]
  // by using the given we will make it contextual so the compiler will pass it to the combinaAll function
  given intCombinator: Combinator[Int] = new Combinator[Int] {
    override def combine(x: Int, y: Int): Int = x + y
  }

  def main(args: Array[String]): Unit = {
    println(anOrderList)
    println(theSum)
  }
}

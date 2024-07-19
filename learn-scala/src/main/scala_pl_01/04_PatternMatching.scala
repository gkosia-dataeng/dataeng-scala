import scala.compiletime.ops.string
object `04_PatternMatching` extends App {

  /*
    Simple match pattern
   */
  val myAge = 35

  val printMyAge = myAge match {
    case 30 => "I am too young"
    case 35 => "Getting old"
    case _  => "I am old"
  }

  println(printMyAge)

  /*
        Match case classes: deconstruct case classes
   */
  case class Person(name: String, age: Int)

  val bob = Person("gab", 34)

  val matchPtrn = bob match {
    case Person(n, a) => s"Hi i am $n and i am $a years old"
    case _            => "Not sure who am i"
  }

  println(matchPtrn)

  /*
        Match tuples: deconstruct tuples
   */
  val myTyp = ("A", "B", "C")

  val matchTupl = myTyp match {
    case (a, b, c) => "deconstruct 3 elements"
    case _         => "unknown how many elelents"
  }

  println(matchTupl)

  /*
        Match tuples: deconstruct lists
   */
  val myList = List(1, 2, 3)

  val matchList = myList match {
    case List(_, 2, _, _) => "List with 4 items contains 2 at second position"
    case List(_, 2, _)    => "List with 3 items contains 2 at second position"
    case _                => "Unknown list"
  }

  println(matchList)
}

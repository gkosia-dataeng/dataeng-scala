object `03_Fuctional_Programming` extends App {

  class Person(name: String) {
    def apply(age: Int) = println(s"My age is $age")
  }

  // by implementing apply method allow us to use object as function
  val bob = new Person("Bob")
  bob(43)

  // Compose functions in JVM
  // Can have up to Function22
  val doubler: Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(v1: Int): Int = 2 * v1
  }

  // shortcut
  val doublerShortcut: Int => Int = (x: Int) => x * 2
  print(doubler(4))

  val adder: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  val adderShortcut: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2

  // sama as
  println(adderShortcut(2, 5))

  // Higher Order functions

  // ** Map
  val aMappedList: List[Int] = List(1, 2, 3).map(x => x + 1)
  println(aMappedList)

  // ** FlatMap
  val aFlatMap = List(1, 2, 3).flatMap(x => List(x, x * 2))
  // or
  // val aFlatMap = List(1, 2, 3).flatMap{x => List(x, x * 2)}
  println(aFlatMap)

  // Filter
  val filterList = List(1, 2, 3, 4, 5).filter(x => x % 2 == 0)
  // or
  // val filterList = List(1, 2, 3, 4, 5).filter(_ % 2 )
  println(filterList)

  // We can link expressions between them
  val linkedResult = List(1, 2, 3, 4, 5).map(_ * 2).filter(_ < 3)
  println(linkedResult)

  // for comprehension
  val alterpairs = for {
    nubmer <- List(1, 2, 3)
    times <- List(1, 2, 3)
  } yield nubmer * times

  println(alterpairs)

  // Collections

  // List
  // a list have a head and tail

  val mylst = List(1, 2, 3, 4)
  println(mylst.head)
  println(mylst.tail)

  // prepend to list
  println(0 :: mylst)
  // extend list
  // +: prepend
  // :+ append
  println(0 +: mylst :+ 7)

  // Sequnces
  val myseq: Seq[Int] = Seq(1, 2, 3)
  print(myseq(2))

  // Vectors: very fast acces time
  val myVector = Vector(1, 2, 3, 4, 5)

  // Sets
  val mySet = Set(1, 2, 3, 3, 3, 4)
  println(mySet.contains(3))
  val addedSet = mySet + 6
  val removedSet = mySet - 3

  // ranges
  val arange = 1 to 100

  // tuples
  val mytuple = ("A", 13)

  // maps
  val maps: Map[String, Int] = Map(
    ("Gab", 35),
    "Zac" -> 33
  )
}

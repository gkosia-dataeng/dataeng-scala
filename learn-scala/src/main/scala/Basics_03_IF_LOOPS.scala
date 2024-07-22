object `Basics_03_IF_LOOPS` extends App {

  // inline if else
  var age = 30
  val result = if (age > 30) "over 30" else "under 30"
  println(result)

  // loops
  while (age > 27) {
    println(age)
    age -= 1
  }

  // for
  // 1.to(10) or 1 until 11
  for (i <- 4 until 6) {
    println(i)
  }

  // for with two loop numbers (2 nested loops)
  for (i <- 1 to 4; j <- 1 until 7) {
    println(i + " " + j)
  }

  // for over a List, with conditional exression
  val myNumsList = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  for (k <- myNumsList; if k % 2 == 0) {
    println(s"$k is odd")
  }

  // for as expression
  val result_of_for = for { i <- 1 to 10; if i % 2 == 0 } yield s"$i is odd"
  print(result_of_for)
}

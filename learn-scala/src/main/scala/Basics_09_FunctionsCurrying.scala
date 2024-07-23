import java.util.Date

object `Basics_09_FunctionsCurrying` extends App {

  // Function currying: transform a function that takes multiple params to a functin that takes one param
  def add(x: Int, y: Int) = x + y

  // add2 is a currying function
  // currying function allows to pass the params in different steps
  def add2(x: Int) = (y: Int) => x + y

  // another syntax of currying function
  def add3(x: Int)(y: Int) = x + y

  println(add2(20)(10))

  // PRACTICAL USAGE
  // initiate a variable that hold the first param and later use it to pass the second param
  val sum40 = add2(40)
  println(sum40(20))

  println(add3(3)(6))

  // Using the partial pattern
  val sum50 = add3(50) _

  println(sum50(90))
}

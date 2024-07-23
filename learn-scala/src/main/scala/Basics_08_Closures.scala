import java.util.Date

object `Basics_08_Closures` extends App {
  var num = 10
  // Closures use one or more variables that is declared outside of function
  // add function is closure because it uses the num which declared outside of function
  // num called free variable

  // if num is declared as var then num can change anywhere (inside or outside the closure) then closure is impure
  // if num is declared as vaL then num cannnot change so the closure is pure because will return always the same result for the same argument
  val add = (x: Int) => {
    num = x + num
    num
  }
  println(add(20))

  // the closure will take the last state of the variable and it will use it
  println(add(20))
}

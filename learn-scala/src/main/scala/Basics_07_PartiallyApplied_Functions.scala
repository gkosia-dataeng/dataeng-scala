import java.util.Date

object `Basics_07_PartiallyApplied_Functions` extends App {

  // normal function
  def sum(a: Int, b: Int, c: Int) = a + b + c

  // partially initiate the function
  // i have specify the first two arguments
  val partF = sum(1, 3, _: Int)

  // the third argument it will declare it whom is call the partF
  println(partF(30))

  // PRACTICAL USAGE
  def log(date: Date, msg: String): Unit = {
    println(date.toString() + " " + msg)
  }

  val dt = new Date
  val logger = log(dt, _: String)

  logger("This is message")
}

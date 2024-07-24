import java.util.Date

object `Basics_10_Strings` extends App {
  val msg : String = "Hello Word"
  val age : Int = 30

  println(msg.length())

  printf("%d -- %d", age, age)
  
  println("%d -- %d".format(age, age))
}

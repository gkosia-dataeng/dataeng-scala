import scala.util.Success
import scala.util.Failure
import scala.util.Try
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object `05_Advances` extends App {
  /*
    Lazy evaluation
   */
  lazy val lazyAge = 4

  lazy val lazyCodeBlock = {
    println("I am a lazy block")
    34
  }

  val triggerLazy = lazyCodeBlock + lazyAge

  /*
    psedu-collections:
        Option: assign the result of a method that might return Null to an Option
                pattern match the Option object to safely check if returted value or Null

   */

  def methodMightReturnNull(): String = "Returned from method"

  // Option:
  //         Some(): if method returned something
  //         None:   if method returned Null
  val optionVal = Option(methodMightReturnNull())

  val optionMatch = optionVal match {
    case Some(string) => s"Returned $string"
    case None         => "Returned Null"
  }

  println(optionMatch)

  /*
    Option: Try
            case Success(validValue)
            case Failure(ex)

   */

  def methodThrosException(): String = throw new RuntimeException
  val aTry = Try(methodThrosException())

  val matchATry = aTry match {
    case Success(validValue) => "Optained a valid string"
    case Failure(ex)         => s"I have optained an exception $ex"
  }

  println(matchATry)

  /*
    Evaluate something on another thread
   */

  val aFuture = Future {
    println("Loading..")
    Thread.sleep(2000)
    println("I have wakeup")
    67
  }

  Thread.sleep(4000)

  /*
    Implicits
   */

  // Implicit arguments
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1

  implicit val myImpl: Int = 5
  println(aMethodWithImplicitArgs)

  // Implicit conversions
  implicit class MyRichInt(n: Int) {
    def isEven() = n % 2 == 0
  }

  println(32.isEven())
}

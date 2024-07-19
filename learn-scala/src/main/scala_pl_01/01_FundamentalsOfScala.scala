object `01_FundamentalsOfScala` extends App {

  // defina values
  val meaningOfLife: Int = 42

  // types are optional
  val isBoolval = true

  val aString = "today i am " + "learing scala"

  // intrerpolate strings
  val message = s"meaningOfLife val is $meaningOfLife"

  // expressions: structures that return a value
  val expre = 2 + 3

  // if expression
  val ifExpre =
    if (meaningOfLife > 40) 1
    else if (meaningOfLife > 20) -1
    else -99

  // code blocks
  val aCodeBlock = {
    // Inside can have definitions, functions, classes, inner code bloeck
    // at the end have to return a vale
    // the value returned is the last expression of the code block

    // definitions: local values
    val defval = 67

    defval + 5
  }

  // defina a function
  def myFunc(name: String, age: Int): String = s"Name $name age $age"

  def funcWithCodeblock(name: String, age: Int): String = {
    s"Name $name age $age"
  }

  // recursive functions
  def fact(n: Int): Int = {
    if (n < 1) 1
    else n * fact(n - 1)
  }

  // Unit type
  def funcReturnUnit(): Unit = {
    println("Not returning anything, just printing")
  }
}

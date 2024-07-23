object `Basics_05_Functions` extends App {

  object MathFunc {
    // definition
    // def <func name>(param: <datatype>) : <return datatype> = {}
    def myAdd(x: Int, y: Int): Int = {
      // return can be ommited
      return x + y
    }

    // function with default arguments
    def addWithDefault(x: Int = 40, y: Int = 10): Int = {
      return x + y
    }

    // if the function takes only one argument i can use short syntax to call it
    def inlineFunc(x: Int) = x * 2;

    def myprint(msg: String): Unit = {
      println(msg)
    }

    // build an operator function
    def +(x: Int, y: Int) = x + y
  }

  val result = MathFunc.myAdd(3, 5)
  println(result)

  val inlinee = MathFunc.inlineFunc(5)
  val sugarSyntax = (MathFunc inlineFunc 4)
  println(inlinee + " " + sugarSyntax)

  println(MathFunc.+(3, 5))

  // anonymus function
  // function as object
  // assign the function to a variable and use it from variable
  val adder = (x: Int, y: Int) => x + y
  println(adder(6, 76))

}

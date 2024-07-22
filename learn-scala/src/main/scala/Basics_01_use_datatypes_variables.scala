object `Basics_01_use_datatypes_variables` extends App {

  // muttable variable
  var mutable_var: Int = 10

  // immutable variable
  val immutable_var: Int = 100

  // variable from code block
  val from_code_block = {
    mutable_var + immutable_var
  }

  // lazy variable
  lazy val iam_lazy = 100

  println("Variables types")

}

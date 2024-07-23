object `Basics_06_HigherOrder_Functions` extends App {

  // Higher order functrions
  // receive functions as arguments or return functions as result
  // receive some params and a function, should declare the signuture (params and return type) of the function
  // then add a codeblock how to use the params and the function
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double =
    f(x, y)

  val result_add = math(3, 5, (x, y) => x + y)
  val result_time = math(3, 5, (x, y) => x * y)
  val result_min = math(3, 5, (x, y) => x min y)

  // can use _ as placeholders forshortcut
  val short_call = math(3, 5, _ + _)
  println(result_add + " " + result_time + " " + result_min + " " + short_call)
}

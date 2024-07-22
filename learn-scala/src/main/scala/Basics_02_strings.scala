object `Basics_02_strings` extends App {

  // string interpolation
  val name = "Gav"
  val age = 34

  // concate
  println("Hi, " + name + " you are " + age + " years old")

  // interpolation
  println(s"Hi, $name you are $age years old")

  // type safe interpolation
  println(f"Hi, $name%s you are $age%d years old")

  // raw interpolation: print in raw format (print escape chars as it is)
  println("This is \nIn new line")
  println(raw"This is \nIn new line")
}

object `Basics_04_Match` extends App {

  val age = 45

  val output = age match {
    case 20           => "too young"
    case 30 | 45 | 50 => "not too young"
    case _            => "default"
  }

  println(output)
}

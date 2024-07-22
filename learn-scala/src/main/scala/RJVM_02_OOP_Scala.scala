import `02_OOP_Scala`.Animal
import `02_OOP_Scala`.Dog
object `02_OOP_Scala` extends App {

  class Animal {
    val age: Int = 0

    def eat() = println("I am eating")
  }

  val anAnima = new Animal

  // inheritance
  class Dog(val name: String) extends Animal

  val aDog = new Dog("Spithas")
  aDog.eat()
  println(aDog.name)

// polymorfism
  val aDeclaredAnimal: Animal = new Dog("Lumi")
  aDeclaredAnimal.eat()

// abstract class
  abstract class WolkingAnimal {
    val hasLegs = true
    def getWalkingSpeed(): Int
  }

// Interface
  trait MyInterface {
    def run(animal: Animal): Unit
  }

  trait MyOtherInterface {
    def runAndWalk(animal: Animal): Unit
  }

  class Crocotail extends Animal with MyInterface with MyOtherInterface {

    override def run(animal: Animal): Unit = println("calling run")
    override def runAndWalk(animal: Animal): Unit = println(
      "calling runAndWalk"
    )
  }

// anonymous classes
  val dinosaur = new WolkingAnimal {
    override def getWalkingSpeed(): Int = 5
  }

// Signleton
  object MySingleton {
    val fielld = "i am only me"
    def saidSomething(): String = fielld

    def apply(x: Int): Int = x * 2
  }

  println(MySingleton.saidSomething())
  println(MySingleton(3))

// case classes
  case class Person(name: String, age: Int)

// in case classes i can ommmit the new keyword
// equals to Person.apply("Gab", 33)
  val bob = Person("Gab", 33)

// Exception
  try {
    val x: String = null
  } catch {
    case e: Exception => "some exception"
  } finally {
    // some code
  }

}

// Generics
abstract class MyList[T] {
  def head: T
  def tail: MyList[T]
}

val aList: List[Int] = List(1, 2, 3, 4)
val first = aList.head
val rest = aList.tail

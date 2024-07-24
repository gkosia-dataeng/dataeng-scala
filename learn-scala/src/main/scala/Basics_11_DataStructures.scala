import java.util.Date
import Array._

object `Basics_11_DataStructures` extends App {
  
  //***** Arrays: muttable elements, fixed size, same data type of sequential elemetns
  val myArray: Array[Int] = new Array[Int](4)  
  val myOtherArray = new Array[Int](3)
  val otherArray = Array("a", "b", "c")

  myArray(0) = 10
 

  print(myArray(0))
  val conc = concat(myArray, myOtherArray)

   // iterate on array
  for (x<- conc){
    println(x)
  }


  //***** Lists: immutable elements, same data type of linked elements
  val myList: List[Int] = List(1,2,3,4,5)
  println(myList)
  println(myList(2))

  // cons: used to prepend on list (add first on the list)
  println(0::myList)

  // use of Nil: empty list
  println(0::1::2::Nil)

  // other methods
  println(myList.head)  // first element
  println(myList.tail)  // what comes after the first element
  println(myList.isEmpty)
  println(myList.reverse)  
  println(List.fill(10)(0))  // ten zeros
  println(myList.max)

  // iterate over the list
  var sum: Int = 0
  myList.foreach(sum+=_)
  println(sum)
}


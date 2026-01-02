package variables_1
package Functions_and_Strings

import scala.compiletime.uninitialized
//import Assignments

object Main_Demo {

//  println("sadasd");
//  println("sadasd");
//  println("Subtraction");
//  println("sadasd");
//  println("sadasd");
//  println("sadasd");
var msg1: String = uninitialized
  def main(args: Array[String]): Unit = {

//    val arr = Array(3, 7, 8, 11, 13, 17, 21)
//    val pos = searchWithReturn(arr, 17)
//    pos match {
//      case -1 => println("Element not Found")
//      case p => println(s"Element Found at Index $p")
//    }

//    val arr1 = Array(3, 7, 8, 11, 13, 17, 21)
//    val pos1 = searchWoReturn(arr1, 17)
//    println(s"Wo Return search element Position: $pos1")

//    var msg:String =null
//    println(msg)
//    println(msg1)
//    println(msg1.length)
//
//    println(msg.length)



    //Assignment: Write a function that takes an int and returns You 5 characters String
    //123 -> 00123
    //1 -> 00001
    //12345 > 12345
    //123456 -> 12345
    //  -> 00000
    // -ve number -> 00000

    //def get5CharacterString(num: Int): String = {
    //// Your code here.
    //}
      var obj=new Assignments()
//      println(obj.get5CharacterString(1))

    val numList = (1 to 100).toList
    val primeList = numList.filter( n => { obj.isPrime(n) })
    primeList.foreach(println)
  }

//  def searchWithReturn(arr: Array[Int], element: Int): Int = {
//    for (i <- 0 until arr.length) // 0 to 6(not 7)
//    {
//      println(s"i = $i")
//      if (arr(i) == element) {
//        return i //if you don't use return keyword, then it does not return to the caller and executes the next iteration and
//      }
//    }
//    println("Not found")
//    -1
//  }
//
//  def searchWoReturn(arr: Array[Int], element: Int):Int = {
//    for (i <- 0 until arr.length) // 0 to 6(not 7)
//    {
//      println(s"i = $i, element = "+arr(i).toString)
//      if (arr(i) == element) {
//        print(s"Found $i")
//        i
//      }
//    }
//    println("Not found")
//    -1
//  }

}

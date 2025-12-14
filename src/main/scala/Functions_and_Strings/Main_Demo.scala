package variables_1
package Functions_and_Strings

object Main_Demo {

//  println("sadasd");
//  println("sadasd");
//  println("Subtraction");
//  println("sadasd");
//  println("sadasd");
//  println("sadasd");

  def main(args: Array[String]): Unit = {

//    val arr = Array(3, 7, 8, 11, 13, 17, 21)
//    val pos = searchWithReturn(arr, 17)
//    pos match {
//      case -1 => println("Element not Found")
//      case p => println(s"Element Found at Index $p")
//    }

    val arr1 = Array(3, 7, 8, 11, 13, 17, 21)
    val pos1 = searchWoReturn(arr1, 17)
    println(s"Wo Return search element Position: $pos1")
  }

  def searchWithReturn(arr: Array[Int], element: Int): Int = {
    for (i <- 0 until arr.length) // 0 to 6(not 7)
    {
      println(s"i = $i")
      if (arr(i) == element) {
        return i //if you don't use return keyword, then it does not return to the caller and executes the next iteration and
      }
    }
    println("Not found")
    -1
  }

  def searchWoReturn(arr: Array[Int], element: Int):Int = {
    for (i <- 0 until arr.length) // 0 to 6(not 7)
    {
      println(s"i = $i, element = "+arr(i).toString)
      if (arr(i) == element) {
        print(s"Found $i")
        i
      }
    }
    println("Not found")
    -1
  }
}

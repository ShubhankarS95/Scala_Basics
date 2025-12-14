package variables_1
package Introduction_to_scala

object Data_Type_and_Variables {

  def main(args: Array[String]): Unit = {

    //    val num1 = 5.2 //Double
    //    val num2 = 5.2F //Float
    //    println(isEqual(num2,num1))

//    println(matchExampleAcceptNum(5))

//    println(matchExampleAcceptMultiplePattern("MON"))
//    println(matchExampleAcceptMultiplePattern("MONday"))

//      println(isEvenOdd(5))
//    println(isEvenOdd(6))

//    println(checkTypeOfWord("Sprit"))
//    println(checkTypeOfWord("paper"))

//    val emp = new Employee("Suraj", 5000, "rmanent")
//    println(emp.unary_!())
//    println(emp.unary_*())

      var number =2
      var n2= number.toLong
        println(number)
    println(n2)
  }
}

//class Employee(empName:String, empSalary:Int, empType:String) {
//  def unary_!(): Boolean = {
//    empType.equalsIgnoreCase("Permanent")
//  }
//
//  def unary_*(): Int = {
//    empSalary * 2
//  }
//}

//matchExampleAcceptNum(option: Int): String = {
//    val message = option match {
//      case 1 => "ONE"
//      case 2 => "TWO"
//      case 3 => {
//        println("Entered 3")
//        "Three"
//      }
//      case 4 => println("Entered 4");
//        "Four"
//      case other => s"Wrong Entry $other"
//    }
//    message
//  }
//
//  def isEqual(num1: Float, num2: Double): Boolean = {
//    //Write a function to find the absolute difference between 2 decimal(one could be float, other could be double and
//    // find out if the difference is negligible .
//
//    val diff = Math.abs(num1 - num2);
//    diff < 0.001
//  }
//
//
//  def matchExampleAcceptMultiplePattern(day: String): String = {
//    val result = day match {
//      case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
//      case "SAT" | "SUN" => "Weekend"
//      case other => "Invalid"
//    }
//    result
//  }
//
//  def isEvenOdd(num:Int):String=
//  {
//    //WAP to check if a number is even or odd
//    //  If even return even
//    //    else return odd ?
//    // Note: We have used if condition in the case, and both the case has same name. The condition
//    //    would define where should it go and fall.
//
//    val msg = num match {
//      case num if num % 2 == 0 => s" $num is Even"
//      case num if num % 2 == 1 => s" $num is Odd"
//    }
//    msg
//  }
//
//  def checkTypeOfWord(word:String):String=
//  {
//    //    WAP to check
//    //    if the word is Fruits, Vegetables or Drinks.
//    val fruits = List("Apple", "Banana", "Mango")
//
//    val vegetables = List("Cabbage", "CauliFlower", "Potato")
//    val drinks = List("Sprit", "Thumbs up", "Pepsi")
//
//    val res=word match {
//      case input if (fruits.contains(input)) => "Fruits"
//      case input if (vegetables.contains(input)) => "Vegetables"
//      case input if (drinks.contains(input)) => "Drinks"
//      case input => "Wrong entry"
//    }
//    res
//  }


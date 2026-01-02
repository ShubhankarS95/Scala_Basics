package variables_1
package Class_and_Objects

class Companion
{
  var num1 = 10
  def print(): Unit ={
      println(s"From Companion class num1=$num1 num2=${Companion.num2}")
  }
}


object Companion {
  var num2 = 20
  def main(args: Array[String]): Unit = {
    var obj = new Companion()
    println(s"From Companion Object num1=${obj.num1} num2=$num2")
    obj.print()
  }
}


package variables_1

object Demo
{
  def main(args: Array[String]): Unit = {
  for (i <- (1 until 5))
    {
      print(m1(i,i+1))
    }
  }

  private def m1(x:Int, y:Int) = {
    x+y
  }
}
package variables_1
package Functions_and_Strings


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

class Assignments
{
  def get5CharacterString(num: Int): String = {
    if (num > 0)
    {
        var st: String = num.toString
        if (st.length >=5) st.take(5)  // return
        else "0"*(5 - st.length) + st  // return
    }
    else "00000" // return

  }
  def get_reverse_String(s:String):String={
       s.reverse
  }

  def reverseStringIterative(str: String): String = {
    var result = ""
    for (i <- (0 until str.length).reverse) {  // for (i<- (str.length) -1 to 0 by -1) {
      result += str(i)
    }
    result
  }
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def reverseStringIndices(str: String): String = {
    val chars = str.toCharArray
    var left, right = 0
    var n = str.length
    while (left < n / 2) {
      val temp = chars(left)
      chars(left) = chars(n - left - 1)
      chars(n - left - 1) = temp
      left += 1
      n -= 1
    }
    new String(chars)
  }

  def isPrime(num: Int): Boolean = {
    if (num == 1 | num == 2) return true
    for (n <- 2 to num / 2) {
      if (num % n == 0)
        return false
    }
      return true //return keyword not required here
    }


}

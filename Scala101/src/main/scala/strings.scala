//Strings
object strings {
  val str1: String = "Hello World"
  val str2: String = " Have a good day"

  def main(args: Array[String]): Unit = {
    val num1 = 75
    val num2 = 100.43
    //string length
    println(str1.length);
    //concatenation
    println(str1.concat(str2));
    println(str1+str2);
    //format
    val result = printf("(%d -- %f -- %s)", num1, num2, str1);
    println(result);
    print("(%d -- %f -- %s)".format(num1, num2, str1));


  }
}

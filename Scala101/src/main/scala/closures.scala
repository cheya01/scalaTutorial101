import java.util.Date
object closures {
  /*A closure is a function which uses one or more variables declared
  outside this function*/
  var number = 10;
  val add = (x: Int) => {
    number = x + number;
    number;
  }

  def main(args: Array[String]): Unit = {
    println(add(20));
    number = 100;
    println(add(20)); //closure takes the last valid value of 'number'
    println(number)
  }
}
//if 'add' function changes the data type of 'number' it is a impure closure
//if 'add' function does not change the data type of 'number' it is a pure closure
//in this case 'add' is pure since 'number' defined as 'val'--> data type cannot be changed


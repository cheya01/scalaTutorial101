//Arrays can store collections of SAME data types
import Array._
object arrays {
  val myArray: Array[Int] = new Array[Int](4);
  //another way to declare an array
  val myArray2 = new Array[Int](5);
  val myArray3 = new Array[Boolean](5);
  val myArray4 = Array(1,2,3,4,5,6);

  def main(args: Array[String]): Unit = {
    myArray(0) = 10;
    myArray(1) = 20;
    myArray(2) = 30;
    myArray(3) = 40;
    println(myArray);//not convenient to print an array like this

    for(x <- myArray){
      println(x);
    }
    for(i <- 0 to myArray.length-1){
      println(myArray(i));
    }
    //print myArray2
    for (i <- 0 to myArray2.length - 1) {
      println(myArray2(i));
    }
    //print myArray3
    for (i <- 0 to myArray3.length - 1) {
      println(myArray3(i));
    }
    //print myArray4
    for (i <- 0 to myArray4.length - 1) {
      println(myArray4(i));
    }
    //concatenate myArray and myArray4
    val result = concat(myArray,myArray4)
    for (i <- result) {
      println(i);
    }

  }
}

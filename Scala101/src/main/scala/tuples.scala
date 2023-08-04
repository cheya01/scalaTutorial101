//tuples - can store different types of elements
//these are fixed sized, immutable
//max size is 22
object tuples {
  val myTuple = (1, 2, "Hello", true);
  val myTuple2 = new Tuple3(1, 2, "colombo");
  val myTuple3 = new Tuple3(1, "hello", (2,3));
  // number of elements after 'Tuple' keyword
  def main(args: Array[String]): Unit = {
    println(myTuple._1);
    println(myTuple._2);
    println(myTuple._3);
    println(myTuple._4);

    println(myTuple2._3);

    println(myTuple3._3);
    println(myTuple3._3._2); //get the last element of the inner tuple

    myTuple.productIterator.foreach{
      i => println(i);
    }

    println(1 -> "Tom"); //this creates a tuple
    println(2 -> "Tom" -> true) // this creates two tuples
  }
}

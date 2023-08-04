//Lists
//Single data type arrays
//Arrays are mutable, Lists are immutable
//Lists represent linked-list while arrays are flat
object lists {
  val myList1: List[Int] = List(1,2,3,4,5,6,7,8);
  val myList2: List[Char] = List('a', 'b', 'c'); //single quotes
  val myList3: List[String] = List("charles", "max", "lewis"); //double qoutes

  def main(args: Array[String]): Unit = {
    println(0 :: myList1); //prepend 0 to myList1
    println(myList1); //content of myList1 is not be changed
    println(Nil); //Nil list
    println(1::5::8::9::Nil);
    println(myList2.head); //print the first value
    println(myList2.tail); //print the last value
    println(myList2.isEmpty); //check if the list is empty
    println(myList3.reverse); //reverse the list
    println(myList3.max); //get the maximum value of the list

    //create a uniform list
    println(List.fill(5)(2)) //create a list of five 2's

    //iterate over a list - method 1
    myList1.foreach(println);
    //get the sum of all the values
    var sum:Int = 0;
    myList1.foreach(sum += _);
    println(sum);

    //iterate over a list - method 2
    for(name <- myList2){
      println(name);
    }

    println(myList3(2)); //print the value at a certain index





  }



}

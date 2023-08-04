//Sets
//collection of unique values of same data type, cannot have duplicates
//two kinds of sets, mutable and immutable
//sets are not ordered

object sets {
  //immutable sets
  val mySet1: Set[Int] = Set(1,2,3,4,5,6,7,8,8); //only one 8 will be printed
  val mySet2: Set[Int] = Set(9,10,11,12,8);
  //mutable sets
  var mySet3: Set[Int] = Set(2,3,4,5,6);
  def main(args: Array[String]): Unit = {
    println(mySet1); //random order
    println(mySet1+10); //add 10 to mySet1 and print
    println(mySet1); //contents of mySet1 is not changed
    println(mySet1(8)); //check if 8 is in myList1
    println(mySet1.head);
    println(mySet1.tail);
    println(mySet1.isEmpty);

    //concatenation, duplicates will be removed
    println(mySet1 ++ mySet2); //method 1
    println(mySet1.++(mySet2)); //method 2

    //intersection
    println(mySet1.&(mySet2)); //method 1
    println(mySet1.intersect( mySet2)); //method 2

    //iterate over all the elements
    mySet1.foreach(println); //method 1

    for(i <- mySet1){ //method 2
      println(i);
    }


  }

}

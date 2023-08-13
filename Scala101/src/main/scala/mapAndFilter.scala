// Map and Filter
object mapAndFilter {

  val lst = List(1,2,3,4,5,6,7,8);
  val myMap = Map(1->"Tom", 2->"Max", 3->"john");

  def main(args: Array[String]): Unit = {
    println(lst.map(_ * 2));
    println(lst.map(x => x*2)); //same operation as above
    println(lst.map(x => "hi" + x));
    println(lst.map(x => "hi" * x));

    println(myMap.map(x => "hi" + x));
    println(myMap.mapValues(x => "hi " + x)); //apply the method only on the values

    println("hello".map(_.toUpper));

    //list of lists
    println(List(List(1,2,3), List(3,4,5)).flatten); //concatenates two lists in to one
    println(lst.flatMap(x => List(x,x+1)));
    println(lst.map(x => List(x,x+1)));

    println(lst.filter(x => x%2 == 0)) //filter the even values
    println(lst.filter(x => x%2 != 0)) //filter the odd values
  }
}

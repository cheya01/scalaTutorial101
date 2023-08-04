// Maps
//two kinds of maps, mutable and immutable
//Map[Key_dataType, Value_dataType]
//key duplication in maps is not allowed
//if we duplicate keys, it will take the last value
object maps {

  val myMap : Map[Int, String] = Map(801->"Max", 802->"Tom", 803->"Lewis", 803->"Charles");
  val myMap2 : Map[Int, String] = Map(804->"Billy");
  def main(args: Array[String]): Unit = {
    println(myMap);
    println(myMap(803) );
    println(myMap.keys); //print all keys in the map
    println(myMap.values); //print all values in the map
    println(myMap.isEmpty);

    myMap.keys.foreach{ key =>
      println("key "+ key + ", value "+myMap(key));
    }

    println(myMap.contains(123)); //check whether this key exists

    //concatenate two maps
    println(myMap ++myMap2);

    println(myMap.size); //size of the map
  }
}

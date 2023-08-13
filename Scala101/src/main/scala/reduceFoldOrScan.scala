// Reduce, fold or scan (Left/Right)
//reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
object reduceFoldOrScan {

  val lst = List(1,2,3,4,5,6);
  val lst2 = List("A", "B", "C");

  def main(args: Array[String]): Unit = {
    println(lst.reduceLeft(_ + _)); //sum of first two elements will be added with third element and so on
    println(lst2.reduceLeft(_ + _));

    println(lst.reduceLeft(_ - _));
    println(lst.reduceRight(_ - _));

    println(lst.foldLeft(100)(_ + _)); // 100 = initial value
    println(lst2.foldLeft("z")(_ + _));

    println(lst.scanLeft(100)(_ + _)); // 100 = initial value
    println(lst2.scanLeft("z")(_ + _)); // 100 = initial value
    //scan method gives all the map of intermediate results
  }
}

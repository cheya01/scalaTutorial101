// Scala Options
object options {

  val lst = List(1,2,3);
  val map = Map(1->"Tom", 2->"Max", 3->"john");
  val opt : Option[Int] = Some(55);

  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 1));
    println(map.get(1));

    println(lst.find(_ > 1).get);
    println(map.get(1).get);

    println(lst.find(_ >4).getOrElse(0));
    println(map.get(5).getOrElse("No name found"));

    println(opt.isEmpty);
  }
}

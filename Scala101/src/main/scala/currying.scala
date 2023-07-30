//currying is the technique of transforming a function
//  that takes multiple arguments into a function
//  that takes a single argument
object currying {

  def add(x: Int, y: Int) = x + y;

  def add2(x: Int) = (y: Int) => x + y;

  def add3(x: Int)(y: Int) = x + y; //a simpler form of curryed function

  def main(args: Array[String]): Unit = {
    println(add(20, 10));
    println(add2(20)(10));

    val sum40 = add2(40);
    println(sum40(100));

    println(add3(100)(200))

    val sum50 = add3(50) _; //we are going to pass any other argument which
    //we will pass later
    println(sum50(400));

  }

}

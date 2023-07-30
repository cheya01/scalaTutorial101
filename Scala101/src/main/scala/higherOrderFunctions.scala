object higherOrderFunctions extends App {
  //higher order function
  def math(x: Double, y:Double, f: (Double,Double) => Double): Double = f(x,y);

  val result = math(50,20,(x,y)=>x+y);
  println(result)

  //passing three variables
  def maths(x: Double, y: Double, z:Double, f: (Double, Double) => Double): Double = f(f(x, y),z);

  val result2 = maths(50, 20, 10,(x, y) => x + y);
  println(result2)

  val result3 = maths(50, 20, 10, (x, y) => x * y);
  println(result3)

  val result4 = maths(50, 20, 10, (x, y) => x min y);
  println(result4)

  val result5 = maths(50, 20, 10, _+_);
  println(result5)
}

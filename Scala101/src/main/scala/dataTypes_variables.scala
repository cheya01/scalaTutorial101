object dataTypes_variables extends App {

  //two ways to declare variables in Scala
  var a:Int=10 //you can change this variable later (mutable)
  var b:Int=20 //you can not change this variable later (immutable)

  //scala is smart enough to recognize data type
  val c=30.23
  //if want scala to recognize a variable as a float for example
  val d=23.34f

  //we can store the result of an expression to a variable
  var x:Int = {val y:Int=100; val z:Int=200; y+z}
  println(x)

  //lazy evaluation
  // its computation is deferred until it is accessed for the first time,
  // and the result is stored and reused for subsequent accesses.
  lazy val i:Int=500
}
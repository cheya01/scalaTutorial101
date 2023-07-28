object functions extends App {
  def addTwoNumbers(x: Int, y: Int): Int = {
    return x + y;
    //no need to write 'return' keyword. Last line of the function body will
    //be considered as the return value automatically
  }

  def subtract(a: Int, b: Int) = a - b;

  println(addTwoNumbers(10, 20));
  println(subtract(20, 5));

  //we can insert a function inside an object
  object Maths {
    def multiply(p: Int, q: Int) = p * q;

    def square(x: Int) = x * x;

    //we can use operators as function names
    def +(x: Int, y: Int) = x + y
  }

  println(Maths.multiply(3, 2));
  println(Maths.square(4));
  println(Maths square 4); //this is also a valid operation in scala when you have only one argument

  //default values
  def add(x:Int=20, y:Int=30) = x+y;

  println(add(50,50));
  println(add(50));

  //when a function doesnt return anythin, just does somethin, return type = 'Unit'
  //equals to VOID in other PLs

  println(Maths.+(20,20));

  //we can assign a function to a variable. this can be done using anonymous functions
  var sum = (x:Int, y:Int) => x+y;
  println(sum(5,4));

}

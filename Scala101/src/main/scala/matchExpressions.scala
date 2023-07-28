object matchExpressions extends App {
  //scala Match Expressions
  var age = 22
  age match {
    case 10 => println(age);
    case 20 => println(age);
    case 30 => println(age);
    case _ => println("default") //default case
  }
  //also we can store the result of a match expression to a variable
  var res = age match {
    case 10 => age;
    case 20 => age;
    case 30 => age;
    case _ => "default" //default case
  }
  println("result = "+res)

  //another usecase
  val i = 7
  i match{
    case 1|3|5|7|9 => println("odd"); //1 or 3 or....
    case 2|4|6|8|10 => println("even")
  }
}

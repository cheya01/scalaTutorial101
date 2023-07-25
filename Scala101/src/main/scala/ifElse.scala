object ifElse extends App {
  val x=20
  var res=""
  //method 1
  if(x==20){
    res="x==20"
  }
  else{
    res="x!=20"
  }
  println(res)

  //method 2
  val res2 = if(x!=20) "x!=20" else "x==20";
  println(res2)

  //we can directly print the result of a if-else statement
  println(if(10<20) "correct" else "incorrect")
}

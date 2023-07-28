object loops extends App {
  var x = 0;
  //while loop
  while (x < 10) {
    println("x= " + x);
    //x++ this is not allowed in scala
    x += 1
  }
  println()
  //do-while loop
  var y = 0
  do {
    println("y= " + y);
    y += 1
  } while (y < 0) //do-while loop executes the code at least once even though
  // the condition is false

  println()
  //for loop
  for (i <- 1 to 5) {
    println("i using to " + i);
  }
  println()
  //'to' is method which takes a argument
  for (i <- 1.to(5)) {
    println("i using to " + i);
  }
  println()
  //use of 'until',
  for (i <- 1.until(6)) { //this will go until 6 which is 5
    println("i using to " + i);
  } // '1 until 6' also works

  println()
  //for loop with multiple variables
  for (i <- 1 to 9; j <- 10 to 20) {
    println("i using multiple ranges " + i + " " + j);
  }

  println()
  //for loop to iterate over a list
  var lst = List(1, 2, 3, 4, 5, 6, 3, 4, 2)
  for (i <- lst) {
    println("i using lst " + i);
  }

  println()
  //for loop with a filtration
  var lst2 = List(1, 2, 3, 4, 5, 6, 3, 4, 2)
  for (i <- lst; if i < 5) {
    println("i using filters " + i);
  }

  println()
  //for loop as an expression
  val res = for {i <- lst
                 if i < 5} yield {
                  i * i;
                  }
  println("result = " + res); //this creates a List and stores it in 'res'


}

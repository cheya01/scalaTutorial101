object stringInterpolation extends App {
  val name="Chethiya"
  val age=23.35
  //string concatenation
  //method 1
  println(name+" is "+age+" years old")
  //method 2 s string interpolation
  println(s"$name is $age years old")
  //method 3 f string interpolation
  println(f"$name%s is $age%f years old")
  //method raw string interpolation
  println("Hello \nWorld")
  println(raw"Hello \nWorld") //prints the "\n" literally without escaping



}

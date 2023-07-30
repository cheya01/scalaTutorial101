import java.util.Date
object partiallyAppliedFunctions extends App {
 val sum = (a:Int, b:Int, c:Int) => a+b+c;

  val f1 = sum(10,20,_) //assigning function 'sum' to function 'f'
  println(f1(30));

  val f2 = sum(10, _:Int, _:Int)
  println(f2(100,200));

  def log(date:Date, message:String) = {
    println(date + "    " + message)
  }

  val date = new Date;
  val newLog = log(date, _:String);
  newLog("Hello World");
}

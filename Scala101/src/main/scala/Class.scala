//scala classes
class User(var name: String, var age: Int);
object Class { //singleton class, cannot create objects out of this

  var user = new User("Max", 28);
  println(user.name);
  println(user.age);
}

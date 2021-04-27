ackage implicits

object implicitsintro extends App{
  case class Person(name:String) {
    def greet =println("hi")
  }
  implicit def stringToPerson(str:String): Person= Person(str)
  "Reni".greet

  def increment(x:Int)(implicit amount:Int):Int =x+amount
    implicit val defaultamount=100
  println(increment(2))
}
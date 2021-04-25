object Object extends App {

  val a: Int = 10
  val b: Int = 20
  val c: Int = 30
  val res = if (a > b && a > c) a
  else if (b > a && b > c) b
  else c
  println(c)

package Lectures

object Strings extends App {
  val str="hi how are you doing"
  println(str.charAt(5))
  println(str.startsWith("hi"))
  println(str.length)
  println(str.toUpperCase())
  val num="2"
  val num1=num.toInt
  println("a"+:num:+"z")
  println(num1)
  val name="Reni"
  val percent=20f
  println(f"i am $name%s with $percent%1.2f scholorship")
}

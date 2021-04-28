object cbvcbr extends App{
  def callByValue(x:Long)={
    println(s"called by value: $x")
    println(s"called by value: $x")
  }
  def callByRef(x: => Long)={
    println(s"called by reference: $x")
    println(s"called by reference: $x")}

    callByValue(System.nanoTime())
    callByRef(System.nanoTime())
}
package Demo

object Demo extends App{
  val num=100
  val pm=num match{
    case 1=>"Marched 1"
    case 10=>"Matched 10"
    case _=>"Mismatch :("
  }
  println(pm)

  case class Person( name:String,age:Int)
  val obj1=Person("Reni",21)
  println(obj1)

  val matchcheck = obj1 match {
    case Person(n,a)=>s"Hi I am $n and my age is $a"
    case _=>"something else"
  }
  println(matchcheck)

  val lst6=List(1,2,3,4)
  val lstcheck=lst6 match{
    case List(1,_,_,4)=>"Matched :)"
    case _=>"Mismatch :("
  }
  println(lstcheck)
  val tup1=("Alice in wonderland","FairyTale")
  val tupcheck= tup1 match{
    case ("Alice in wonderland","FairyTale")=>"Correct"
  }
  println(tupcheck)
}

object Object extends App {
  class person(name: String) {
    def apply(age: Int)= println(s"I am $age years old")
  }
  val reni=new person("Reni")
  reni(21)
  val intadd=new Function1[Int,Int]{
  override def apply(a:Int):Int=a+2}
  println(intadd(5))

  val strconcat=new Function2[String,String,String]{
    override  def apply(arg1:String,arg2:String):String=arg1+arg2
  }
  println(strconcat("Learn","Scala"))
  val lst1=List(1,2).map(_*2)
  println(lst1)
  val lst2=List(3,4). flatMap(x=>List(x,x*2))
  println(lst2)
  val lst=List(1,2,3,4,5,6).filter{x=>x>3}
  println(lst)
  val lst3=List(1,2,3).flatMap(x=>List('a','b','c').map(y=>s"$x-$y"))
  println(lst3)
  val forloop=for{
    x<-List(1,2,3)
    y<-List('a','b','c')
  }yield(s"$x-$y")
  println(forloop)

  val lst4=List(1,2,3,4,5)
  val first= lst4.head
  val remeles =lst4.tail
  val newlist= 0 +: lst4 :+ 6
  println(newlist)

  val seq=Seq(1,2,3)
  val firstele=seq(0)
  println(firstele)

  val set1=Set(1,2,3,1,3)
  println(set1)
  println(set1.contains(4))
  val addele =set1 + 4
  println(addele)


  val range=1 to 1000
  println(range)
  val lst5=range.map(_*3).toList
  println(lst5)

  val map1=Map((1,"Reni"),(2,"Nivin"))
  println(map1)
}



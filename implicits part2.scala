implicit def reverseordering:Ordering[Int]=Ordering.fromLessThan(_>_)
  val sortlist=List(1,4,5,2,3).sorted
  println(sortlist)
  case class Person(name:String,age:Int)
  val persons=List(
    Person("Reni",21),
    Person("Nivin",27),
    Person("Joshua",24))
   implicit val orderPerson:Ordering[Person]=Ordering.fromLessThan((a,b) => a.name.compareTo(b.name)< 0 )
  println(persons.sorted)
}
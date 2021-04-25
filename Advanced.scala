package Demo
import scala.util.{Try,Success,Failure}
object Demo extends App {
lazy val num1= {
  println("hi")
  5
}
  println(num1)

  def funcReturnNull()={}
    val anOption = Option(funcReturnNull())
  val matchcheck= anOption match{
    case Some(string)=>s"Method returned $string"
    case None=>"Returned None"
  }
  println(matchcheck)

   def methodThrowException():String = throw new RuntimeException
   val atry= Try(methodThrowException())
   val matchException=atry match{
     case Success(value)=>s"No Exception returned $value"
     case Failure(value1)=>s"Exception $value1"
   }
   println(matchException)
  
}

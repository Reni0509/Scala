ackage Lectures

object DefaultArgs extends App{
      def fact(n:Int,acc:Int=1):Int={
        if (n==1) acc
        else fact(n-1,n*acc)
      }
      println(fact(5,1))
      def photo(exten:String="jpeg", width:Int, height:Int=500)={
        println(s"name:$exten,width:$width,height:$height")
      }
      photo(width=200)

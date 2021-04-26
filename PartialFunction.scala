package Lectures

object PartialFunctions extends App{
      val fussyfunction = (x: Int) =>
        if (x==1) 1
        else if(x==2) 2
        else throw new FunctionNotApplicableException

       class FunctionNotApplicableException extends RuntimeException

      val nicefussyfunction=(x:Int)=>x match{
            case 1=>1
            case 2=>2
      }
      val aPartialFunction: PartialFunction[Int,Int]={
            case 1=>20
            case 2=>40
            case 3=>60
      }
      println(aPartialFunction(1))
      println(aPartialFunction.isDefinedAt(34))

      val liftfunc =aPartialFunction.lift
      println(liftfunc(2))
      println(liftfunc(34))

      val pfChain =aPartialFunction.orElse[Int,Int] {
            case 32 => 21
      }
      println(pfChain(32))

      val amaplist= List(1,2,3).map{
            case 1=>'a'
            case 2=>'b'
            case 3=>'c'
      }
      println(amaplist)
}


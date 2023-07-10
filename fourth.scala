package labsheet4

import scala.io.StdIn

object fourth {

  def main(args: Array[String]): Unit = {

    println("Enter value :")
    var n = StdIn.readInt()
    println(isEven(n))

  }
  def isEven(i : Int):Boolean= i match {
    case 0=> true;
    case _ => isOdd(i-1);
  }

  def isOdd(i: Int):Boolean= {
    !isEven(i);
  }



}

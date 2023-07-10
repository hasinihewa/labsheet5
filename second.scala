package labsheet4

import scala.io.StdIn

object second{


  def main(args: Array[String]): Unit = {

    println("Enter value :")
    var n = StdIn.readInt()
    primeSeq(n)

  }


  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case x => GCD(x, a % x)

  }


  def primeSeq(i: Int):Unit={
    if ( i < 2){
      return 0;
    }
    primeSeq(i - 1);
    if( prime(i)){
      print(i + " ");
    }
  }


}
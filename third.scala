package labsheet4


import scala.io.StdIn

object third{


  def main(args: Array[String]): Unit = {

    println("Enter value :")
    val n = StdIn.readInt()
    println("The sum is: "+sum(n))

  }

  private def sum(n: Int, m:Int=1):Int= {

    if (n>= m)
      n+sum(n - 1, m)
    else
       0

  }


}

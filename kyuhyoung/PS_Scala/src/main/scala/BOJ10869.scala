import scala.io.StdIn

object BOJ10869 {
  def main(args:Array[String])={
    val input_data = StdIn.readLine().split(" ")
    val numA:Int = input_data(0).toInt
    val numB:Int = input_data(1).toInt

    println(numA+numB)
    println(numA-numB)
    println(numA*numB)
    println(numA/numB)
    println(numA%numB)
  }
}

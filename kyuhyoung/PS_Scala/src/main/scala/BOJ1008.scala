import scala.io.StdIn

object BOJ1008 {
  def main(args:Array[String])={
    val input_value = StdIn.readLine().split(" ")
    val A:Double = input_value(0).toDouble
    val B:Double = input_value(1).toDouble

    println(A/B)
  }
}

import scala.io.StdIn
object BOJ10430 {
  def main(args:Array[String])={
    val input_data = StdIn.readLine().split(" ")
    val A:Int = input_data(0).toInt
    val B:Int = input_data(1).toInt
    val C:Int = input_data(2).toInt

    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C)*(B%C))%C)
  }
}

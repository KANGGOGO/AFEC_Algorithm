import scala.io.StdIn

object BOJ2525 {
  def main(args:Array[String])={
    val input_data = StdIn.readLine().split(" ")
    var A:Int = input_data(0).toInt
    var B:Int = input_data(1).toInt
    var C:Int = StdIn.readInt()

    B += C
    A += B / 60
    B %= 60
    A %= 24

    print(A.toString + ' ' + B.toString)
  }
}

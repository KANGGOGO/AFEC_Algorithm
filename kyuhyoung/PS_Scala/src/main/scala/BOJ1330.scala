import scala.io.StdIn
object BOJ1330 {
  def main(args:Array[String])= {
    val input_value = StdIn.readLine().split(" ")
    val numA: Int = input_value(0).toInt
    val numB: Int = input_value(1).toInt

    if (numA > numB)
      print(">")
    else if (numA == numB)
      print("==")
    else
      print("<")
  }
}

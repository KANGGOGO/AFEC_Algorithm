

object BOJ1000 {
  def main(args:Array[String])={
    val input_nums_string = StdIn.readLine().split(" ")
    val numA:Int = input_nums_string(0).toInt
    val numB:Int = input_nums_string(1).toInt
    println(numA + numB)
  }
}

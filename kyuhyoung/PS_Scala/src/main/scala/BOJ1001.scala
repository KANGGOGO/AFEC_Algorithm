
object BOJ1001 {
  def main(args:Array[String])={
    val input = StdIn.readLine().split(" ")
    val numA:Int = input(0).toInt
    val numB:Int = input(1).toInt
    val res:Int = numA - numB

    println(res)
  }
}

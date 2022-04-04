import scala.io.StdIn
object BOJ2588 {
  def main(args:Array[String])={
    val numA:Int = StdIn.readInt()
    val numB:Int = StdIn.readInt()

    println(numA * (numB % 10))
    println(numA * ((numB/10) % 10))
    println(numA * ((numB/100) % 10))
    println(numA * numB)
  }
}

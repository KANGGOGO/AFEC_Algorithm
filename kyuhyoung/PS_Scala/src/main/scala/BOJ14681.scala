import scala.io.StdIn
object BOJ14681 {
  def main(array: Array[String])={
    val x:Int = StdIn.readInt()
    val y:Int = StdIn.readInt()
    var res = 0

    if (x > 0 && y > 0) res = 1
    else if (x < 0 && y > 0) res = 2
    else if (x < 0 && y < 0) res = 3
    else res = 4

    print(res)
  }
}

import scala.io.StdIn
object BOJ2753 {
  def main(args:Array[String])={
    val year:Int = StdIn.readInt()
    var res = 0
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
      res = 1
    print(res)
  }
}

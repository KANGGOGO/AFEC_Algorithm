import scala.io.StdIn
object BOJ10950 {
  def main(args:Array[String])={
    val T:Int = StdIn.readInt()
    for(i:Int <- 0 until T){
      val nums = StdIn.readLine().split(" ").map(_.toInt)
      println(nums(0) + nums(1))
    }
  }
}

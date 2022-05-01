import scala.io.StdIn

object BOJ8393 {
  def main(Args:Array[String])={
    val N:Int = StdIn.readInt()
    var res:Int = 0
    for(i:Int <- 1 to N){
      res += i
    }
    println(res)
  }
}

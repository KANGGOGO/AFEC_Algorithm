import scala.io.StdIn
object BOJ2739 {
  def main(args:Array[String])={
    val N:Int = StdIn.readInt()

    for(i:Int <- 1 to 9){
      println(N.toString + " * "+ i.toString + " = " + (N * i).toString)
    }
  }
}

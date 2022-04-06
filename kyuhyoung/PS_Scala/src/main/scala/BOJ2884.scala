import scala.io.StdIn
object BOJ2884 {
  def main(args:Array[String])={
    val input_data = StdIn.readLine().split(" ")
    var H:Int = input_data(0).toInt
    var M:Int = input_data(1).toInt

    M = M - 45
    if (M < 0){
      M += 60
      H -= 1
    }
    if(H < 0)
      H+=24

    print( H.toString + ' ' + M.toString)
  }
}

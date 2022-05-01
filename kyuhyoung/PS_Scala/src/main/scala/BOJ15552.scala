import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object BOJ15552 {
  def main(Args:Array[String])={
    val br: BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw: BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    val T:Int = br.readLine().toInt
    for(i:Int <- 0 until T){
      val nums = br.readLine().split(" ").map(_.toInt)
      bw.write((nums(0) + nums(1)).toString + "\n")
    }
    bw.close()
  }
}

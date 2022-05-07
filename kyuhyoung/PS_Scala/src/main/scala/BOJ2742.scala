import java.io.{BufferedReader, InputStreamReader, BufferedWriter, OutputStreamWriter}
import scala.io.StdIn

object BOJ2742 {
  def main(args:Array[String])= {
//    first_trial()
//    second_trial()
    third_trial()
  }

  def first_trial() = {
    val br: BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw: BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    var N: Int = br.readLine().toInt

    while (N > 0) {
      bw.write(N.toString + "\n")
      N -= 1
    }

    br.close()
    bw.close()
  }

  def second_trial()={
    var N:Int = StdIn.readInt()
    (1 to N).toList.reverse.foreach(i => println(i))
  }

  def third_trial()={
    val bw: BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    val N:Int = StdIn.readInt()
    (1 to N).toList.reverse.foreach(i => bw.write(i.toString + "\n"))
    bw.close()
  }
}
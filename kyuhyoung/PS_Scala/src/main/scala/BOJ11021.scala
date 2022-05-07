import java.io.{BufferedReader, BufferedWriter, InputStreamReader, OutputStreamWriter}
object BOJ11021 {
  def main(args:Array[String])={
    val br:BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw:BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    val T:Int = br.readLine().toInt
    for (i <- 1 to T){
      val res = br.readLine().split(" ").map(_.toInt).sum.toString
      bw.write("Case #" + i.toString+ ": " + res + "\n")
    }
    bw.close()
    br.close()
  }
}

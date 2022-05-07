import java.io.{BufferedReader, InputStreamReader, BufferedWriter, OutputStreamWriter}
object BOJ11022 {
  def main(args:Array[String])={
    val br:BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw:BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    val T:Int = br.readLine().toInt
    for(i <- 1 to T){
      val nums = br.readLine().split(" ").map(_.toInt).take(2)
      val a:Int = nums(0)
      val b:Int = nums(1)
      bw.write("Case #")
      bw.write(i.toString)
      bw.write(": ")
      bw.write(a.toString)
      bw.write(" + ")
      bw.write(b.toString)
      bw.write(" = ")
      bw.write((a+b).toString)
      bw.write("\n")
    }

    bw.close()
    br.close()
  }
}

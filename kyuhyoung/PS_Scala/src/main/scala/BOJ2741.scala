import java.io.{BufferedReader, BufferedWriter, InputStreamReader, OutputStreamWriter}

object BOJ2741 {
  def main(Args:Array[String])={
    val br:BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw:BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    val N:Int = br.readLine().toInt

    for(i:Int <- 1 to N){
      bw.write(i.toString + "\n")
    }
    br.close()
    bw.close()
  }
}

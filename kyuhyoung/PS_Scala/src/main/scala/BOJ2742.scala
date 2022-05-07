import java.io.{BufferedReader, InputStreamReader, BufferedWriter, OutputStreamWriter}

object BOJ2742 {
  def main(args:Array[String])={
    val br:BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val bw:BufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
    var N:Int = br.readLine().toInt

    while(N > 0) {
      bw.write(N.toString + "\n")
      N-=1
    }

    br.close()
    bw.close()
  }
}
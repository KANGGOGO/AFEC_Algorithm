import scala.io.StdIn
object BOJ9498 {
  def main(args:Array[String])={
    val input_num:Int = StdIn.readInt()
    var grade:Char = '0'

    if (input_num >= 90)      grade = 'A'
    else if (input_num >= 80) grade = 'B'
    else if (input_num >= 70) grade = 'C'
    else if (input_num >= 60) grade = 'D'
    else                      grade = 'F'

    print(grade)
  }
}

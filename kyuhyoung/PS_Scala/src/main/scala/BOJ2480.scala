import scala.io.StdIn
object BOJ2480 {
  def main(args:Array[String])={
    val nums = StdIn.readLine().split(" ").map(_.toInt)

    var prize = 0

    if (nums.min == nums.max)
      prize = 10000 + nums.max * 1000
    else if ((nums(0) == nums(1)) || (nums(0) == nums(2)))
      prize = 1000 + nums(0) * 100
    else if (nums(1) == nums(2))
      prize = 1000 + nums(1) * 100
    else
      prize = nums.max * 100

    print(prize)
  }
}

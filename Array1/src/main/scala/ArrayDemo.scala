
object ArrayDemo{
  def main(args: Array[String]): Unit = {
    var marks = Array(58,36,98,35,34,66,99)

     for (mark <- marks) { // accessing each elmement of arrys
         println(mark)
     }
    // Average with for Loop Expression
    var totalMark = 0
    var averageMarks = 0

    for (mark <- marks) {
      totalMark = totalMark + mark
    }
      averageMarks = totalMark / marks.length
    println(" Average Marks is " + averageMarks + " ")
    // map and foreach are also very use




    }


}

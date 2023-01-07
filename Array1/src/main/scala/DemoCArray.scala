object DemoCArray {
  def main(args: Array[String]): Unit = {


    //reduceleft function

    var marks = Array(21, 25, 39, 58, 79, 64, 52, 94, 34)
    var avg = marks.reduceLeft((x,y) => (x+y)/2  )
    println(avg)
  }
}

import Array._
object DemoMultiDimensionArray {
  def main(args: Array[String]): Unit = {
   var matrixEg = ofDim[Int](3,3)

    for (row <- 0 to 2) {
       for (col <- 0 to 2) {
            matrixEg (row) (col) = col + 3
       }
    }

    for (row <- 0 to 2) {
      for (col <- 0 to 2) {
        print(matrixEg(row)(col) )

      }
      println(" ")
    }


  }

}

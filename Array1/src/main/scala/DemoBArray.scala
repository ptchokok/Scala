object DemoBArray {
  def main(args: Array[String]): Unit = {
    var marks = Array(58, 36, 98, 35, 34, 66, 99)   // create the array marks
    var totalMarks = 0
    var totalMarks2 = 0
    var averageMarks = 0
    var averageMarks2 = 0

     //for (mark <-marks) {  // option #1 with for loop
     //  println(mark)      // print each element of the array
    // }
       marks.foreach(println)   // option #2 with for each

    // Find the average marks using option 1 and option 2

    //option 2 Using foreach loop

    totalMarks = 0
    marks.foreach(mark=>totalMarks=totalMarks+mark)  // less line of code
    averageMarks = totalMarks / marks.length
    println("Average Mark is " + averageMarks)

    // Another way to redo this is the follow

    totalMarks2 = 0
    marks.foreach(totalMarks2+=_)  // Short Hand Notation another way to go over the for each
    averageMarks2 = totalMarks2 / marks.length
    println("Average Mark2 is " + averageMarks2)

    println("**************Result with the newMark Method**************************")
    // map ===> you will always get multiple output
    var newMarks = marks.map(mark => mark + 10)
    newMarks.foreach(println)
    println("*************newMark Method with underscore +10 **************************")
    var newMarks2 = marks.map(_+ 12)   // map each value of the array and add 12
    newMarks2.foreach(println)
  }
  // foreach, you can get multiple outputs, example: marks.foreach(println)
  // foreach, you can also get one final output, example: marks.foreach(marks=>totalMarks=totalMarks+mark)
  //will give you totalMarks


  // if you want to do the same operation on each element of an array ---> Use Map
  // you can also do with foreach/ for loop but it will be slow

  // If you want to take Sum/get single output (eg: total marks), use foreach

println("... For loop use with yield to return an array...")




}
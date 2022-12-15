import scala.util.control.Breaks
object DemoCForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
    {
      println("value of i is " + i)
    }
     println ("=================Nested For Loop===================")
    //Nested for Loop
    for (i <-1 to 10; j <-1 to 10 ) {
       //  for (j <-1 to 10 ) {
      println(" Value of i is " + i + "value of j is " + j)
    }

    // List  - similar to Arrays
       var numberList = List(1,2,3,4,5,6,7,8,9,10)
       var numberList2 = List(1,2,3,4,5,6,7,8,9,10)

    println ("=================For Loop for Collections===================")

    for  (i <-numberList) {
      println("value of i is " +i)
    }
     println ("")
     println ("===Check ===========")
     for (i <- numberList2 if i%2 ==0; if i!=4) {   // i is not divisible by 4 and the remainder of division by 2 is zero
      println("value of i is " + i)
    }

     println ("")
     println ("===Collect Even Number ===========")
     var numberList3 = List(1,2,3,4,5,6,7,8,9,10)
     var evenNumberList = for (i <-numberList3 if i%2 ==0) yield i
     println (evenNumberList)   // it will print me all the even number

    // Break Statement
    println ("=== Break  ===========")
    var numberList4 = List(1,2,3,4,5,6,7,8,9,10)
    val breakObject = new Breaks;  // import break class and defin eBreak Object

    breakObject.breakable {
       for (i <- numberList4 if i%2 ==0){
             println("value of i is " + i )

         if (i ==4) {
           println("I am BREAKING AT 4")
           breakObject.break
         }


       }
    }






  }
}

import java.io.FileReader // import package for FileReader is a class
import java.io.FileNotFoundException     // import  java FileNot Found Exception
import java.io.IOException         // import packager for IO Exception
object DemoTryCatch {
  def main(args: Array[String]): Unit = {
    println("Handling Exception")
    //############# EXCEPTION HANDLING ################
    try {
          val f = new FileReader("/Users/patricktchokokam/Documents/scalafileinput/input.txt")
          // path
          val a = 10/5
          val array1 = Array(10)
              println(array1(11))
        }
        catch {
                 case e :FileNotFoundException => {
                 println("File is not Found - Exception Received" + e)
                 // instead of e  we can write it as zzz
                 // in real world program , we will ususally log this error in some error log file

                 }
                 case e : IOException => {
                 println("Error while reading - Exception Received" + e)
                 }
                 case e: ArithmeticException => {
                 println("Arithmetic Exception Received please review  your program" + e)
                 }
                 //   This is a way to catch all unhandle exception it is call wildcart
                 //  case _: Exception => {
               //  println(" Error, Exception --- It will catch all unhandle exception ")
               //  }
                 case e: ArrayIndexOutOfBoundsException => {
                   println(" Array Index out of Bound detected - Exception Received" + e )
                 }

        }
    finally {
        // the program to be executed should be written here
       println(" It will be always executed irrespective of Execption or not ")
       }
  }

}



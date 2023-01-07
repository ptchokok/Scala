import scala.util.control.Exception.catching
object DemoCatching {
  def main(args: Array[String]): Unit = {

    val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => println("Arithmetics Exception has occured"))
    val a = catchExceptions(10 /0)
      //#if (a.!=()) {
       println(a)
      //# }

  }

}

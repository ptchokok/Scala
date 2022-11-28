// revision of class
class SingletonDemo{
   val x = 2
   val y = 5.5

   def addValue() = x + y
   println(" x =" + x +" y = " + y )
}


object SingletonDemo {
  def main(args: Array[String]): Unit = {

    val demoObjectA1 = new SingletonDemo
    val result = demoObjectA1.addValue()
    println(result)


  }

}

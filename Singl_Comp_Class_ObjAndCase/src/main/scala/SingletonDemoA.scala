object DemoObjectB{     // 1ST   Create OBject
  val x = 2
  val y = 5.5

  def addValue() = x + y
  println(" x =" + x +" y = " + y )
}


object SingletonDemoA {
  def main(args: Array[String]): Unit = {

    // val demoObjectB1 = new SingletonDemoB  // it will give an error we can not create object of an object
    println(DemoObjectB.x)
    val result = DemoObjectB.addValue()     // We access the variable by typing Object. function...
    println(result)


  }

}

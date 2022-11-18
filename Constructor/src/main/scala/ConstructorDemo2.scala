//Program # 3 Default Parameter

class demoClass2(val a: Int=99, val b: Double = 88.88, val c: String ="Scala") {
  val x = a // with val we can not change the value type, we can change the value with var
  var y = b // by putting var we can change and retrieve the value the contain in the main Program
  val z = c // ONLY retrieve >>> INTERNALLY SCALA CREATES 1 Method - GET

  def addNumber() = {
    x + y
  }

  println("x = " + x + " and y = " + y + "  and z = " + z) // Print the output value

}

object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    println("Hello Pat, this part  explain us how to use the constructor")

    val demoObject1 = new demoClass2(5, 7.2, "Hello World !") // Constructor with parameter
    val result = demoObject1.addNumber() // We are calling the method addNumber
    println("Result = " + result)

    val demoObject2 = new demoClass2(25) // Constructor with default value
    val result2 = demoObject1.addNumber() // We are calling the method addNumber
    println("Result = " + result2)






  }


}
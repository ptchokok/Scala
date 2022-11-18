// Program #2 Constructor with Parameter

  class demoClass1( val a:Int, val b:Double, val c:String) {
    val x = a      // with val we can not change the value type, we can change the value with var
    var y = b      // by putting var we can change and retrieve the value the contain in the main Program
    val z = c      // ONLY retrieve >>> INTERNALLY SCALA CREATES 1 Method - GET

    def addNumber() = {
      x + y
    }

    println("x = " + x + " and y = " + y + "  and z = " + z ) // Print the output value

  }

  object ConstructorDemo1 {
    def main(args: Array[String]): Unit = {
      println("Hello Pat, this part  explain us how to use the constructor")

      val demoObject1 = new demoClass1(5, 7.2, "Hello World !") // Constructor with parameter
      val demoObject2 = new demoClass1(6, 8.2, "Hello World Pat !") // Initialization of the constructor, it executes the class

     // demoObject1.x = 3 Can not change the content of x because it is define with Val !!!
     demoObject1.y = 7.222  // can change the content of y, because it was defined as var in the method



      val result = demoObject1.addNumber()                     // We are calling the method addNumber
      println("Result = " + result)

      val result2 = demoObject2.addNumber() // We are calling the method addNumber
      println("Result = " + result2)



    }


  }
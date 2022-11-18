//Program # 4 Default Parameter

class demoClass3(val a:Int , val b: Double , val c: String ) {
  val x = a // with val we can not change the value type, we can change the value with var
  var y = b // by putting var we can change and retrieve the value the contain in the main Program
  val z = c // ONLY retrieve >>> INTERNALLY SCALA CREATES 1 Method - GET

  // Method
  def addNumber() = {
    x + y
  }
  // Constructor Check....
  def this()= {         // (*1)is the value taken by the constructor when it is called with no parameter
     this(99,88.88, "Hello scala")
    println (" I came into auxiliary constructor with zero parameter")
  }

  def this(a:Int) = { // (*2)is the value taken by the constructor when it is called with 1 parameter
    this(a, 88.88, "Hello scala")
    println(" I came into auxiliary constructor with one parameter")
  }

  def this(a:Int, b:Double)= { // (*3) value taken by the constructor when it is called with 2 parameter
    this(a, b, "Hello scala")
    println(" I came into auxiliary constructor with two parameter")
  }

  println(" primary constructor x = " + x + " and y = " + y + "  and z = " + z) // Print the output value

}

// Object Creation and constructor initialization

object ConstructorDemo3 {
  def main(args: Array[String]): Unit = {
     println("Auxiliary constructor")

    val demoObject1 = new demoClass3(5, 7.2, "Hello World !") // Constructor with parameter
    val demoObject2 = new demoClass3()   // this will go to the auxiliary constructor (*1)
    val demoObject3 = new demoClass3(7)   // this will go to the auxiliary constructor (*2)
    val demoObject4 = new demoClass3(7,2.2)   // this will go to the auxiliary constructor (*3)

  }
}
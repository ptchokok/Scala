class CompanionDemo{
  var x =5
  def getValue(): Unit ={
    println(s"value of x is:${x} and the value of y is:${CompanionDemo.y}")  // we can use the value  of the object define in the object
  }
}


object CompanionDemo {
  var y =2.2
  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompanionDemo
    println(s" Value of x when retrieved from companion object is ${objectForCompanionDemoClass.x}")   // display 5 by using the object
    println(s" Value of x when retrieved from companion object is ${y}")      // display the value 2
    objectForCompanionDemoClass.getValue()   // we call the function get value


  }


}

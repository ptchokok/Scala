// This is the program #1 to show how the constructor works
class demoClass{
   val x =3   // with val we can not change the value type, we can change the value with var
   val y =2

  def addNumber() = {
    x + y
  }

println(s"x = ${x} and y = ${y}")
println( "x = " + x + " and y = " + y)  // this is another way to print this statement

val z = addNumber()
println("Number z =" + z)

}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello Pat, this part  explain us how to use the constructor")

    val demoObject1 = new demoClass   // creation of object of the classs democlass
    // it is also called constructor, it executed everything in the class
  }
}

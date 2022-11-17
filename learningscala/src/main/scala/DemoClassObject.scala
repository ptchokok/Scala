//Object CLass Demo

class Car{
  var topClassExtraCost = 0
  var roadTax = 100
  protected var  xyz =100

  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax      // Method of Class
  def checkTax(): Int = {                                                      // 2nd Method Of Class
    roadTax
  }

}

class SmallCar extends Car{
  println(xyz)
}

object DemoClassObject {
  def main(args: Array[String]): Unit = {
    println("Hell abc")

    var bmw = new Car      // defined  the object bmw , instance of the class Car
    bmw.roadTax = 200
    println(bmw.roadTax)     // the object deined can access the instance of the class car


    var a = new Car
    println(a.roadTax)

 // example by accessing the method defined in class
    bmw.topClassExtraCost = 500
    var result = bmw.cost(10000)

    println()
    println("Road Tax is " + bmw.checkTax())
    println("Total cost of car is " + result)



  }

}

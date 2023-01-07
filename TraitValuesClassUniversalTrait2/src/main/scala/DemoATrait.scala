import javax.swing.text.Caret
trait FourWheeler{
  def tyres(): Unit = {
    println(" for wheeler  has 4 Tyres")
  }

}
trait Car {  //        keyword trait
  def engine(): Unit ={              // body present for the break method
    println("Engine is 1000cc")
  }
 // def break()
 // def tyres()

}

class Mercedes extends   Car {
   def break(): Unit = {
     println("this is break")
    }
     def tyres(): Unit ={
     println(" this car has 4 Tyres")
   }

}
object DemoATrait {
  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.break()
    m1.tyres()
    m1.engine()
  }

}

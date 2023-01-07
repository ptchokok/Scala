abstract class Vehicle{      // abstract is the keyword for abstract class
 // def category()           // method category is not imlemented
}
trait FourWheelerC{
  def tyres(): Unit = {
    println(" FourwheelerC  has 4 Tyres")
  }

}
trait CarC {  //        keyword trait
  var x = 1000
  val t = 4
  def engine(): Unit ={              // body present for the break method
    println("Engine is " + x + "  in the car ")
  }

  def tyres(): Unit = {
    println(" CarC  has " + t + " tires")
  }
  // def break()
  // def tyres()

}
// From one class we extend two trait
class MercedesC extends Vehicle with FourWheelerC with  CarC {
  x = 2000
  override val t = 6    // this allow us to change t from 4 to 6, override the value of t
  def break(): Unit = {
    println("this is break in Mercedes")
  }
  override def tyres(): Unit = super.tyres()   // if you don't write this, scal won't know where to cal tire method
                                              // this will call from CarC or from FourWheeler. In this case we call it from FourWheeler
  def category(): Unit = {
    println("This Car is a  Mercedes")
  }
   override def engine(): Unit = { // We override the function Engine
      println("Engine of Mercedes is " + x + " CC ")
    }

}
object DemoCTrait {
  def main(args: Array[String]): Unit = {
    val m2  = new MercedesC
    m2.break()
    m2.engine()
    m2.tyres()
    m2.category()
  }

}


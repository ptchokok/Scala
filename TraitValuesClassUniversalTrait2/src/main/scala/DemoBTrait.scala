
trait FourWheelerB{
  def tyres(): Unit = {
    println(" FourwheelerB  has 4 Tyres")
  }

}
trait CarB {  //        keyword trait
  def engine(): Unit ={              // body present for the break method
    println("Engine is 100 CC in the car ")
  }

  def tyres(): Unit = {
    println(" CarB  has 4 Tyres")
  }
  // def break()
  // def tyres()

}
// From one class we extend two trait
class MercedesB extends FourWheelerB with  CarB {   // Class  that is called from two traits   is extend and with
  def break(): Unit = {
    println("this is break in Mercedes")
  }
  override def tyres(): Unit = super.tyres()      // this method will print tyres() method that is ...With Car
    // the same method Tyres implemented in multiple thread will be executed
}
object DemoBTrait {
  def main(args: Array[String]): Unit = {
      val m2  = new MercedesB
       m2.break()
       m2.engine()
       m2.tyres()


  }

}

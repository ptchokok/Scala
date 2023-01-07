// written by xyz developper
// open source
// whenever you extend CarD, you should also extends FourwheelerD and VehiculeD
abstract class VehicleD{

}
trait FourWheelerD{

}
trait CarD {
  this: FourWheelerD with VehicleD =>{   // if you extends CarD, make sure you also extends Four WheelerD
  }

}
// From one class we extend two trait
class MercedesD extends VehicleD with FourWheelerD with CarD {  // The order has to be respected

}
object DemoDTrait {
  def main(args: Array[String]): Unit = {
    val m2  = new MercedesD

  }

}


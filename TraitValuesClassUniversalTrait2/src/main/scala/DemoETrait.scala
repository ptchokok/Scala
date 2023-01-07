import javax.swing.text.Caret
// Value Class ; you can not not allocate runtime object
// Value class has only one parameter with Val , with val we can not change parametre
// you can not extends a value class
// VALUE CLASS CAN NOT EXTENDS A TRADE, that why we have an universale trait
trait CarE extends Any{   // universal trait is a trait that is extend with any
  def  print(): Unit= {println(this)}
}

class MercedesE(val x:Int) extends AnyVal with CarE  // field definition are not allow in a value class
                                                     // can not define a variable in a value class, we can define method
def hello: Unit ={
  println("hello")
}
class DemoETrait {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesE(5)
    m1.print()
  }

}
// ValUE Class is better for performance and memory optimization
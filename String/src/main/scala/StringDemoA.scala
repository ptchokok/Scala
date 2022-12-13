object StringDemoA {
  def main(args: Array[String]): Unit = {
      var greetings  =" Hello String demo"  // data type string
          greetings ="update"
       println(greetings)
      var greetingNew:String = "Hello" // data type string is defined

    // method to get length of the string

    var lengthOfString = greetings.length()   // we are using the method length() to get the length of the string
    println("Length of String is " +lengthOfString)  // greetings is the object , length() is the Accessor method

    //concat method
    var var1 = "hello"    // definintion of the object var1
    var var2 ="world"

    println(var1+" "+ var2)  // concatenation with plus operator
    println(var1.concat(var2)) // using the method to concatenation


    // Equal method
    var varA = "Hello Word!"
    var varB = "Hello Word!"

    println(varA.equals(varB))   // check if varA = varB and print the content; we can also use varA == varB
    // Var A and Varb B are not null

    println (varA == varB)  // SAME AS THE P

  // String Formatting

  var nameOfCAR = "Mercedes"
  var costOfCar = 500000
  var mileageOfCar = 8.5

printf(" Nane of CAR is :%s and Cost Of Car is %d and mileage of car is f", nameOfCAR, costOfCar, mileageOfCar)

// Multi Line string, we use | symbol  and stripMargin function
println("  ")
var multiLineString  = """ Hello
             | Patrick
             | Are you Happy
             | To become
             | Developer ?
             """.stripMargin   // The strip Margin allows us to print on the line

            println(multiLineString)

// THIS IS DONE by removing the PIPE SYMBOL
    var multiLineStringA =""" Hello
         Patrick
         Are you Happy
         To become
         Developer ?
                 """

    println(multiLineStringA)

 // strip with Dollar
    var multiLineString$ =""" Hello
        $Patrick
        $Are you Happy
        $To become
        $Developer ?
                 """.stripMargin // The strip Margin allows us to print on the line

    println(multiLineString$)

    //******* String Interpolation  --This Program displays the same output
   //  1.'s' String Interpolator  $$$$$$ Importantt
   var name = "Patrick"
    println("Hello " + name+ ", How are you")
    println(s"Hello $name, How are you")   // same way to call using  s interpolar in scala


    //2.. f interpolatror

    var name2 = "TCHOKOK"
    var salary =20000.2
    println( f"name is $name2%s and salary is $salary%8.2f and designation is PM")  // 2 PLACES AFTER DECIMAL


    // 3. raw INTERPOLATOR - Same as S interpolator
    println(s"Hello World!\nHow are you")
    println(raw"Hello world!\nHow are you?")


    // spilt method

    //read through all the method  in Java String , at the same time read scala string method












  }

}

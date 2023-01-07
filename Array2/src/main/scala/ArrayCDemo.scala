object ArrayCDemo {
  object DemoCArray {
    //reduceleft function

    var marks = Array(21, 25, 35, 58, 79, 64, 52, 94, 34)
    var avg = marks.reduceLeft((x, y) => (x + y) / 2)
    print(avg)
  }

}

def add(x: Int, y: Int) = {
  println(x + y)
}

def subtract(x: Int, y: Int) = {
  println(x - y)
}

def multiply(x: Int, y: Int) = {
  println(x * y)
}

def divide(x: Int, y: Int) = {
  println(x / y)
}

def sum(numbers: Array[Int])= {
  val sum = numbers.foldLeft(0)(_ + _)
  println(sum)
}

add(3, 5)
subtract(5, 3)
multiply(2, 3)
divide(20, 5)
sum(Array(2, 25, 3))
object exercise {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }

  product(x => x)(3, 4)

  // writing factorial with product function
  def factorial(n: Int): Int =
    product(x => x)(1, n)

  factorial(4)

  def mapReduce(f:Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

  mapReduce(x => x, (x , y) => x * y, 1)(10, 11)
  mapReduce(x => x, (x , y) => x + y, 0)(10, 11)
  
}








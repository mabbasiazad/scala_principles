//object session {
//  1 + 2
//  def abs(x: Double) = if (x > 0) x else -x
//
//  def sqrtIter(guess: Double, x: Double): Double =
//    if (isGoodEnough(guess, x)) guess
//    else sqrtIter(improve(guess, x), x)
//
//  def improve(guess: Double, x: Double) =
//    (guess + x / guess) / 2
//
//  def isGoodEnough(guess: Double, x: Double) =
//    abs(guess * guess - x) < 0.001
//
//  def sqrt(x: Double) = sqrtIter(1.0, x)
//
//  sqrt(2)
//
//}
//val x = 0
//def f(y: Double) = y + 1
//val result = {
//  val x = f(3)
//  x * x
//} + x

//def gcd(a: Int, b: Int): Int =
//  if (b == 0) a else gcd(b, a % b)
//
//gcd(7, 14)

//def factorial(n: Int): Int =
//  if (n <= 1) n else n * factorial(n - 1)
//
//factorial(4)


//def factorial(n: Int): Int = {
//  def loop(acc: Int, n: Int): Int = {
//    if (n == 0) acc
//    else loop(acc * n, n-1 )
//  }
//
//  loop(1, n)
//}
//
//factorial(5)

//def sum(f: Int => Int, a: Int, b: Int): Int = {
//  if (a > b) 0
//  else f(a) + sum(f, a + 1, b)
//}
//
//def sumCube(a: Int, b: Int) = sum(x => x * x * x, a : Int, b: Int)
//
//println(sumCube(10, 11))
//
//def product(f: Int => Int)(a: Int, b: Int): Int = {
//  if (a > b) 1
//  else f(a) * product(f)(a + 1, b)
//}
//
//def prodInts: (Int, Int) => Int = product(x => x)
//
//prodInts(10, 11)

import math.abs
object SqrtScratch {
  val tolerance = 0.001

  def isGoodEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iteration(guess: Double): Double = {
      val next = f(guess)
//      println("next guess" +next)
      if (isGoodEnough(guess, next)) guess
      else iteration(next)
    }
    iteration(firstGuess)
  }

  def damp(f: Double => Double)(x: Double) =
    (x + f(x)) / 2

  fixedPoint(x => 1 + x /2)(1)

  def sqrt(x: Double) =
    fixedPoint(damp(y => x / y))(firstGuess = 1)

  sqrt(2)
}

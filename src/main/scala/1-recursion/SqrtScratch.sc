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

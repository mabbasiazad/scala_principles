package week03

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator should be nonzero")

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)
  //  val g = 1

  override def toString: String = num + "/" + den

  def num: Int = x / g

  def den: Int = y / g

  def this(x: Int) = this(x, y = 1)

  def less(that: Rational): Boolean =
    num * that.den < that.num * den

  def max(that: Rational) =
    if (that.less(this)) this else that

  def add(that: Rational) =
    new Rational(that.num * den + num * that.den,
      that.den * den)

  def neg = new Rational(-num, den)

  def subtract(that: Rational) = add(that.neg)
}


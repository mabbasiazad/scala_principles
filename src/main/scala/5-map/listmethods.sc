object listmethods {
  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y::ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of empty list")
    case List(x) => List()
    case y::ys => y::init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case List(x) => x::ys
    case z::zs => z::concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y::ys => reverse(ys) ::: List(y)

  }

  def removeAt[T](xs: List[T], n: Int): List[T] = (xs take n) ++ (xs drop n+1)

  val xs = List(2, 7, 6, 4)
  val ys = List(4, 6)
  last(List(1, 2 ,3, 7))
  init(xs)
  concat(xs, ys)
  reverse(xs)
  removeAt(xs, 1)
}
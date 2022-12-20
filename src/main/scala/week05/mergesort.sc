object mergesort {
  def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
    case(xs, Nil) => xs
    case(Nil, ys) => ys
    case (x::xs1, y::ys1) => if (x < y) x::merge(xs1, ys) else y::merge(xs, ys1)
  }

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (first, second) = xs splitAt(n)
      merge(msort(first), msort(second))
    }
  }

  val my_list = List(2, 7, 6, 4)
  msort(my_list)

}
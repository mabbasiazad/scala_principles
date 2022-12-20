object codingfunc {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x::xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (y => (y.head, y.length))

//  def encode(xs: List[T]): List[(T, Int)]

  val list1 = List('a', 'a', 'a', 'b',  'b', 'c' )
  pack(list1)
  encode(list1)
}
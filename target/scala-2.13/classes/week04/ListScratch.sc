import week04._
object ListScratch {
  def nth[T](n: Int, l: List[T]): T = {
    if (n == 0) l.head
    else nth(n - 1, l.tail)
  }
  def l = new Cons(1, new Cons(2, new Nil))
  nth(0, l)
}






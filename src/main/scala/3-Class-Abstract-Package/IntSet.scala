package week03

abstract class IntSet {
  def incl(x: Int):IntSet
  def contains(x: Int): Boolean
}

class Empty extends IntSet {
  override def toString: String = "."
  def contains(x: Int) = false
  def incl(x: Int):IntSet = new NonEmpty(x, new Empty, new Empty)
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int):Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true


  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this


  override def toString: String = "{" + left + elem + right + "}"
}

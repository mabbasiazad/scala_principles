import week03._

object IntSetScratch {
  val t1 = new NonEmpty(4, new Empty, new Empty)
  val t2 = t1 incl 5
  val t3 = t2 incl 6
  t2 contains 6
}




object othercollections {
//  (1 to 5) flatMap (x => (1 to 7) map (y => (x, y)))
//  val A = Vector(1, 4, 7)
//  val B = Vector(3, 6, 4)
//  (A zip B).map(x => x._1 * x._2).sum
//
//  def isPrime(n: Int): Boolean = {
//    def devres = (1 to n) map(x => n % x == 0)
//    (devres foldLeft 0)(_ + _ ) == 2
//  }
  val x = List(1, 0, 0)
  x.sum
}
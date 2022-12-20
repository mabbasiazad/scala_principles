object primeset {
  def isPrime(n: Int) =
    (2 until n) forall (d => n % d != 0)

  isPrime(6)
  def n = 8
  (2 until n) flatMap (i => (1 until i) map (j => (i, j))) filter {case (i, j) => isPrime(i + j)}

  for {
    i <- 2 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)

  def scalarProduct(xs: List[Double], ys: List[Double]): Double = {
    val n: Int = xs.length
    for (i <- 0 until n) yield (xs(i) * ys(i))
    }.sum

  val xs: List[Double] = List(2, 5, 7, 8)
  val ys: List[Double] = List(5, 7, 3, 2)

  scalarProduct(xs, ys)

}
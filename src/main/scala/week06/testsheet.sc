object testsheet {
  val queens = List(1, 3, 0, 4, 2)
  val lines =
    for (col <- queens.reverse)
      yield Vector.fill(queens.length)("* ").updated(col, "X ").mkString

  "\n" + (lines mkString("\n"))

  val args = Array("Hello", "world", "it's", "me")

  val string = args.mkString("\n")
}
case class Book(title: String, authors: List[String] )

val books: List[Book] = List(
  Book(title = "Structure and Interpretation of Computer Programs",
    authors = List("Abelson, Harald”, ”Sussman, Gerald J.")),
  Book(title = "Introduction to Functional Programming",
    authors = List("Bird, Richard”, ”Wadler, Phil")),
  Book(title = "Effective Java",
    authors = List("Bloch, Joshua")),
  Book(title = "Java Puzzlers",
    authors = List("Bloch, Joshua”, ”Gafter, Neal")),
  Book(title = "Programming in Scala",
    authors = List("Odersky, Martin”, ”Spoon, Lex”, ”Venners, Bill")))

for {
  book <- books
  author <- book.authors
  if author.startsWith("Bloch, ")
} yield book.title

for {
  this_book <- books
  other_book <- books
  if this_book != other_book
  a1 <- this_book.authors
  a2 <- other_book.authors
  if (a1 == a2)
} yield a1

for {
  b1 <- books
  b2 <- books
  if b1.title < b2.title
  a1 <- b1.authors
  a2 <- b2.authors
  if a1 == a2
} yield a2
package week04.Expr

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
//
//trait Expr {
//  def eval: Int
//}
//class Number(n: Int) extends Expr {
//  def eval: Int = n
//  override def toString: String = n.toString
//}
//class Sum(e1: Expr, e2: Expr) extends Expr {
//  def eval: Int = e1.eval + e2.eval
//  override def toString: String = e1.toString + e2.toString
//}
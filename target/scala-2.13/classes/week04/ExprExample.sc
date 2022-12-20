import week04.Expr._

object ExprExample{
//  val e1 = new Number(1)
//  val e2 = new Number(3)
//  new Sum(e1, e2)
  def eval(e: Expr):Int = e match {
  case Number(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)
  }

  eval(Sum(Number(2) + Number(3) ))

}
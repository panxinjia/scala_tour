package chap04

object Test04_Lambda {

  def main(args: Array[String]): Unit = {

    def apply(a: Int, b: Int, op: (Int, Int) => Int): Int = op(a, b)

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    val div = (a: Int, b: Int) => a / b
    val mul = (a: Int, b: Int) => a * b
    println(apply(4, 2, add))
    println(apply(4, 2, minus))
    println(apply(4, 2, div))
    println(apply(4, 2, mul))
  }

}

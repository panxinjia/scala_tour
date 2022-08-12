package chap02

/**
 * 标识符
 *
 * 特殊符号也可以用作标识符:
 * 函数式编程的逻辑, 操作符其实就是函数, cpp中表达运算符重载的概念
 */
object Test02_Identifier {

  def main(args: Array[String]): Unit = {
    // 特殊标识符
    val +-*/ : Int = 100
    println(+-*/)

    // 反引号中可以用keyword作为identifier
    val `class` :String = "jack"
    println(`class`)
  }

}

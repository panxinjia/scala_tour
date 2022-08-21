package chap02

/**
 * 标识符: 能够自定义名称的部分都是标识符
 * 变量 常量 方法名 函数名 类名
 *
 * scala中特殊符号也可以用作标识符, 但是如果用了特殊符号, 只能全部都是特殊符号作为标识符
 * scala中关键字也可以作为标识符, 需要 ``修饰
 *
 * 函数式编程的逻辑, 操作符其实就是函数, cpp也有类似的概念(运算符重载)
 *
 */
object Test02_Identifier {

  def main(args: Array[String]): Unit = {
    val +-*/ :Int = 100
    val `class` :String = "scala"
    println(+-*/)
    println(`class`)

    val hello :Int = 1
  }

}

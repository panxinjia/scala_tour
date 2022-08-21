package chap04

/**
 * 函数式编程的语法灵活度很高, 需要多写多练才能熟悉
 */
object Test03_TestFunction {

  def main(args: Array[String]): Unit = {
    // 函数最简原则

    // 函数通用定义
    def f(s: String): String = {
      return s + " ....."
    }

    // 最后一行返回值 return 可以省略
    def f1(s: String): String = {
      s + " ....."
    }

    // 函数体只有一行, {} 可以省略
    def f2(s: String): String = s + "....."

    // 返回值可以推断出来, 返回值可以省略
    def f3(s: String) = s + "......"

    // 有return时, 返回值不能省略
    def f4(s: String): String = {
      return "string"
    }

    // 明确声明了 Unit 无返回, return 不起作用, 调用时接收不到返回值
    def f5(s: String):Unit = {
      return s
    }

    // 确定无返回值, 返回值部分的Unit可以省略
    def f6() {}

    // 声明了参数列表, 但是没有参数, 调用时可以省略(), 参考 隐式转换的调用,
    def f7() = "f7"
    println(f7())
    println(f7)

    // 省略了函数列表, 调用时() 也必须省略
    def f8 = "f8"
    // println(f8())
    println(f8)
    println("->")
    // f9 函数, 只关心处理逻辑 参数String, 返回值String, 可以直接用lambda表达式方式表达
    def f9 = (name: String) => println(name)

    // 函数式编程的特点, 函数可以作为参数传递
    def f10(fn: String => Unit, name: String) = {
      fn(name)
    }

    // 函数作为参数
    f10(f9, "jack")

    def foo():Unit = {
      println("foo")
    }

    val result1 = foo
    val result2 = foo()
    println(result1, result2)

    // 直接将函数赋值给变量
    val foo2 = foo _
    // 明确变量类型就是一个函数时 _ 省略
    val foo3: () => Unit = foo





  }

}

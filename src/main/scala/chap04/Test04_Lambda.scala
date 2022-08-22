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

    // val foo = (value:Int) => value
    def foo(value: Int): Int = value

    // scala 函数整体赋值, 函数也是数据, 函数也是对象
    val f1 = foo _
    val f2: Int => Int = foo
    println(f1(1))
    println(f2(2))

    // 函数, 定义, 赋值, lambda简写, 函数类型推断, 都是高阶用法
    def bar(value: Int, op: Int => Int): Int = op(value)

    println(bar(1, value => value + 1))
    println(bar(20, value => value * 2))
    println(bar(4, value => value + 3))

    // 函数式编程对一个数据集的运算
    def ops(values: Array[Int], op: Int => Int) = for (value <- values) yield op(value)
    // 简单写法
    println(ops(Array(1, 2, 3, 4, 5), value => value * 2).mkString(","))
    println(ops(Array(1, 2, 3, 4, 5), value => value + 1).mkString("-"))

  }

}

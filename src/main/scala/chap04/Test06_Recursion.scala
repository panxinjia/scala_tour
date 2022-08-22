package chap04

import scala.annotation.tailrec

object Test06_Recursion {

  def main(args: Array[String]): Unit = {

    // 递归阶乘
    def fact(n: Int): Int = {
      if (n == 0)
        return 1
      fact(n - 1) * n
    }

    // 纯函数式编程语言中, 没有变量

    println(fact(5))

    // 尾递归优化(需要编译器的支持, 支持函数式编程的语言, 一般也都支持尾递归)
    def tailFact(n:Int): Int = {
      @tailrec
      def loop(n:Int, r:Int): Int = {
        if (n == 0) return r
        loop(n - 1, r * n)
      }
      loop(n, 1)
    }

    println(tailFact(5))

    // 函数参数 : 1. 值调用 2. 名调用(传递代码块, 将函数传递到函数中)

  }


}

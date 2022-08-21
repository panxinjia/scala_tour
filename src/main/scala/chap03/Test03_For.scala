package chap03

import scala.language.postfixOps
import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

/**
 * for 推导式, 表达式
 */
object Test03_For {

  def main(args: Array[String]): Unit = {

    // to []
    for (value <- 1 to 3) {
      println(value)
    }

    // until [)
    for (value <- 1 until 3) {
      println(value)
    }

    // 循环守卫, 为推导式指定条件, continue 关键字的能力
    for (value <- 1 to 5 if value % 2 == 0)
      println(value)

    // 循环步长, 每次循环走两步
    for (i <- 1 to 10 by 2) {
      println(s"i = $i")
    }

    // 多表达式和嵌套循环
    for {
      i <- 1 to 3
      j = 4 - i
    } {
      println(s"i = $i, j = $j")
    }

    println("->")
    // 嵌套, 两种表达形式等价
    // for (i <- 1 to 3; j <- 1 to 3)
    for {
      i <- 1 to 3
      j <- 1 to 3
    } {
      println(s"i = $i, j = $j")
    }

    // 循环返回值, 通过yield收集到线性集合中
    val values: IndexedSeq[Int] = for (value <- 1 to 10 if value % 2 == 0) yield value
    values.foreach(value => println(value))

    println("->")
    // 倒序打印
    for (value <- 1 to 3 reverse) {
      println(s"value = $value")
    }

    println("->")
    // 循环中断, 为了更好的支持函数式编程, scala中没有continue 和 break关键字

    // 1. 使用异常方式 退出循环
    try {
      for (value <- 1 to 10) {
        println(s"value = ${value}")
        if (value == 5) {
          throw new RuntimeException();
        }
      }
    } catch {
      case e =>
    }
    println("通过异常结束循环")

    // 2. breakable 函数退出循环
    Breaks.breakable(
      for (value <- 1 to 10) {
        println(s"value = ${value}")
        if (value == 5) {
          Breaks.break()
        }
      }
    )
    println("正常结束循环")

    breakable {
      for (value <- 1 to 10) {
        println(s"value = $value")
        if (value == 5) break
      }
    }
    println("省略Breaks")

  }

}

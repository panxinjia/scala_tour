package chap03

import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

object Test03_For {

  def main(args: Array[String]): Unit = {
    //for 推导 / 表达式

    // to [],  until[)
    for (v <- 1 to 3) {
      // println(v)
      println("宋宋, 告别海狗人参丸吧")
    }
    println("---->")
    for (v <- 1 until (3 + 1)) {
      println(v)
    }

    println("---->")
    // 循环守卫,  更新的语言对 break 和 continue 做了优化
    for (v <- 1 to 3 if v != 2) {
      println(v)
    }

    println("---->")
    for (v <- 1 to 5 by 2 if v != 3) {
      println(v)
    }
    println("---->")
    // by 步长
    for (v <- 1 to 10 by 2) {
      println("v = " + v)
    }
    println("---->")
    // 多个for 推导式, 表达嵌套循环结构
    for {
      i <- 1 to 3
      j <- 1 to 3
    } {
      println(s"i = $i, j = $j")
    }
    println("-------> ")
    // 实际开发用的不多
    val res: IndexedSeq[Int] = for (v <- 1 to 3) yield v
    println(res)

    // scala 中去掉了 break 和 continue 是为了更好的适应函数式编程, 使用
    // 函数式风格解决了break和continue的问题, 而不是一个关键字
    try {
      for (v <- 1 to 10) {
        if (v == 5) throw new RuntimeException
        println(v)
      }
      // 异常的方式退出循环
    } catch {
      //          e 被吞掉了, 只是一个简单的函数表达式, {}内没有语句, 可以省略
      case e => {}
    }

    //========================= 函数式编程风格, 表达计算过程, 是很重要的编程风格 ========================
    // 函数式风格实现 break 关键字的能力
    Breaks.breakable(() => {
      for (v <- 1 to 10) {
        if (v == 5) Breaks.break()
      }
    })
    // 函数只有一个参数, () 可以省略
    breakable(
      for (v <- 1 to 10)
        if (v == 5) break
    )

  }

}

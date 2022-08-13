package chap02

import chap01.Student

object Test07_DataType {

  def main(args: Array[String]): Unit = {
    // Unit Null Nothing

    def m1(): Unit = {
      println("calling m1 method")
    }

    val v = m1() // () 表达没有返回值
    println(s"${v}")

    var s = new Student("tomas", 20)
    s.printInfo()
    s = null // 空引用, 和 java语义一致
    println(s) // 打印 null 字符串

    // Nothing 表达函数可能会抛出异常,不确定是否有返回值
    def m2(n: Int):  Int = {
      if (n == 0)
        throw new NullPointerException()
      else
        n
    }

    val value = 0
//    val e = m2(value)
//    println(s"$e")

    def m3():Nothing= {
      // 方法没有参数时, () 可以省略, scala 是精简且强大的编程语言, 能省则省, 有时会破坏一些可读性,
      // 不过可以接受.
      throw new RuntimeException
    }

    //
    val e = m3()
    println(e)


  }

}

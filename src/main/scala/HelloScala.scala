
// scala 中object 是关键字，声明一个单例对象（伴生对象）
object HelloScala {

  // 方法定义, 参数: 类型[类型], 和go的语法很像
  def main(args: Array[String]): Unit = {
    println("hello scala")
    System.out.println("hello java")
  }

}

// todo 练习"伴生"概念, 伴生类, 伴生对象, 去掉static, 完全面向对象化.


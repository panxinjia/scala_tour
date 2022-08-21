package chap04

// scala 将ooa 和 fp 结合的很好, 完全支持面向对象编程和函数式编程
object Test01_Func {

  // 方法支持重载和重写
  def main():Unit = {}

  def main(args: Array[String]): Unit = {
    // scala中支持在任何语法结构中声明任何语法
    import java.sql.Connection

    def f(arg: String):Unit = {
      println(s"arg = $arg")
    }

    f("function programing")

    def test():Unit ={

    }

    // 函数没有重载和重写的概念
    // def test(name :String):Unit = {}

    // 函数支持嵌套
    def test2():Unit = {
      def test3():Unit = {

      }
    }
  }

}

package com {

  // 外层访问内层, 需要导包
  import com.test.Inner

  object Outer {
    def main(args: Array[String]): Unit = {

      Inner.foo()
      com.xiaopantx.Inner.foo()

    }

    def bar():Unit = {
      println("outer bar")
    }
  }

  // 一个源文件中, 可以定义多个包
  package xiaopantx {
    object Inner {

      def foo():Unit ={
        println("xiaopantx inner foo")
      }
      def main(args: Array[String]): Unit = {
          Outer.bar()
      }
    }
  }

  package test {
    object Inner {
      def foo():Unit = {
        println("test inner foo")
      }
      def main(args: Array[String]): Unit = {
        Outer.bar()
      }
    }
  }

}


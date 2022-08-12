package chap02

import scala.io.StdIn

object Test05_StdIn {

  def main(args: Array[String]): Unit = {
    // 从标准输入读取数据
    val name: String = StdIn.readLine()
    val age: Int = StdIn.readInt()
    println(s"name = $name, age = $age")
  }

}

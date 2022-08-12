package chap02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test06_IO {

  def main(args: Array[String]): Unit = {
    // 读取文件内容
    val source = Source.fromFile("pom.xml")
    // 函数式编程的语法, print函数打印文件内容
    source.foreach(print)

    val writer = new PrintWriter(new File("src/main/resources/1.txt"))
    writer.print("writer from java api")
    writer.close()
  }

}

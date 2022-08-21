package chap01

// 伴生类
class Person(var name:String, var age:Int) {

  def printInfo(): Unit = {
    println(s"name = ${name}, age = ${age}, gender = ${Person.gender}")
  }
}

// 伴生对象, scala是纯面向对象语言
object Person {
  // 伴生对象的属性相当于java的类静态属性
  // val 表示编译后就无法更改的量
  val gender:String = "男"

  def main(args: Array[String]): Unit = {
    val tom = new Person("tom", 90)
    val jerry = new Person("jerry", 30)

    tom.printInfo()
    jerry.printInfo()
  }
}

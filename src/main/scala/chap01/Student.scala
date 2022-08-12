package chap01

/**
 * Java 并不是完全的面向对象
 * Scala 完全的面向对象, 没有基础类型的概念, 都是面向对象的间接值
 *
 * @param name 对象参数 name
 * @param age  对象参数 age, var 表示可变性
 */
class Student(var name: String, var age: Int) {
  def printInfo(): Unit = {
    println(s"name = ${this.name}, age = ${this.age}, school = ${Student.school}")
  }
}

// 伴生对象, scala完全的面向对象, 没有类成员(static)修饰的概念, 类有一个伴生对象, 伴生对象保存了
// 原来java中的公共字段和函数
object Student {
  val school: String = "清华"

  def main(args: Array[String]): Unit = {
    // 共享伴生对象的信息
    val s1 = new Student("tom", 21)
    val s2 = new Student("jack", 200)
    s1.printInfo()
    s2.printInfo()

    val o = new Student("ValRef -> ", 100)
    o.printInfo()
    o.age = 300
    o.name = "rose"
    o.printInfo()
  }
}

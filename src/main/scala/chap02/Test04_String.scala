package chap02

object Test04_String {

  def main(args: Array[String]): Unit = {
    val name: String = "jack"
    val age: Int = 30
    val sal: Double = 30000.00

    // scala中字符串的三种使用方式
    // 1. + 拼接
    val s1: String = name + ", " + age + ", " + sal
    println(s1)

    // 2. 格式化字符串
    printf("name = %s, age = %d, sal = %.2f\n", name, age, sal)

    // 3. 字符串差值语法
    val s3: String = s"name = $name, age = ${age}, sal = ${sal}"
    println(s3)

    // f 引用值时支持给出格式化符号
    val s4 :String = f"name = ${name}"
    println(s4)

    // 4. 多行字符串
    val sql: String =
      s"""
         |select name, age, sal from users
         |where name =  ${name}
         |  and
         |      age = ${age}
         |  and
         |      sal = ${sal}
         |""".stripMargin
    println(sql)


  }

}

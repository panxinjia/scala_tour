package chap02

import scala.reflect.internal.util.StringOps

object Test04_String {

  def main(args: Array[String]): Unit = {

    // 常量定义
    val name = "alice"
    // name = "jack"  常量不允许修改
    val age = 20

    // 运算符重载, 将name拼接3次
    println(name * 3) // alicealicealice

    // 占位符格式化
    printf("name = %s, age = %d", name, age)

    // 字符串插值, 格式化, 可读的字符串, s 模板字符串, f 格式化模板字符串
    println(s"name = $name, age = $age")

    val sal = 30001.239
    println(f"$name sal = $sal%2.2f")

    val sql =
      """
        |select *
        |from emp e
        |join dept d on e.deptId = d.deptId
        |where e.id > 10
        |group by deptId
        |order by salary
        |limit 10
        |""".stripMargin
    println(sql)


    // StringOps 为了兼容Java Scala定义的特殊类型
  }

}

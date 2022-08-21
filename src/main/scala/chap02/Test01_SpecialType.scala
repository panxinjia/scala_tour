package chap02

object Test01_SpecialType {

  def main(args: Array[String]): Unit = {
    def sayOk: Unit = {
      println("sayOk")
    }

    val ok = sayOk
    // val ok = sayOk()  函数没有参数时, 调用可以省略掉()
    println(ok) // () 是Unit的唯一一个值

    // Nothing
    def testNothing: Nothing = {
      throw new Exception()
    }

    // testNothing

    def testNothing2(value: Int): Int = {
      if (value == 2)
        1
      else
        throw new Exception("抛出异常时,返回的是Nothing, 明确不会正常返回一个值")
    }

    val result = testNothing2(2)
    println(result)

    //Scala还提供了强大的隐式转换机制,  隐式函数, 隐式类

    // 强制类型转换, 转换只对最近的操作数有效, 通常需要使用()提升优先级
    val v: Int = 12.33.toInt
    println(v)

    val v1: Int = 12.33.toInt + 1.7.toInt // 13
    // 注意强制转换丢失精度和优先级问题, 转换其实也是函数调用
    val v2: Int = (12.33 + 1.7).toInt
    println(s"v1 = $v1")  // 13
    println(s"v2 = $v2")  // 14
  }

}

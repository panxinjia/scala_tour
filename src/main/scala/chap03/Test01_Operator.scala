package chap03

// 操作符 (本质: Scala中没有操作符, 是函数调用)
object Test01_Operator {

  def main(args: Array[String]): Unit = {
    val s1 = "jack"
    val s2 = new String("jack")
    println(s1 == s2)
    println(s1.eq(s2)) // false
    println(s1.equals(s2)) // true   这里是和java的不同点

    // scala 中没有 ++ --, 可以用 += -= 替代
    var v = 20
    // v++  //error
    v += 1
    v += 1
    v -= 1
    println(v)

    // ---------------> 深入理解 Scala语言完全面向对象和函数式的特征
    // 1. 基础值 也是对象(一切数据都是对象)
    // 2. 操作符也是函数 (cpp中函数重载的运用)

    // 调用 1 的 + 函数时 . 可以省略
    val i:Int = 1.+(1)
    // 省略 . 调用 + 函数
    val j:Int = 2 + (1)
    // 3的+方法只有一个参数, () 可以省略, 这里 . 也省略了
    val k:Int = 3 + 1


    // 函数语法
    println(1.toString())
    println(1 toString())
    println(1 toString)
  }

}

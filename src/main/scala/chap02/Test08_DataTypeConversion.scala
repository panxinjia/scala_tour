package chap02

object Test08_DataTypeConversion {

  // 计算机保存的是补码
  // 正数: 原码, 反码, 补码 一致
  // 负数: 原码 = 符号位为 1, 其余表示有效位
  //       反码 = 按位取反
  //       补码 = 反码 + 1的结果, 强制类型转换时的益处和精度丢失问题
  def main(args: Array[String]): Unit = {
    // 0000_0000 0000_0000 0000_0000 1000_0010
    val a: Int = 130
    // 1000_0010 内存中的数值(补码)
    // 0111_1101 反码
    // 0111_1110 源码 -> 126
    val b: Byte = a.toByte
    println(b) // -> 126

    val i1:Byte = 1
    val i2:Short = 2
    // 强制类型转换
    val v1:Long = (i1 + i2).toLong
    println(v1)

    // 强制转换, scala 是完全的面向对象和函数式编程, 一切都是对象和函数
    // 甚至是Unit(无返回的表达) Null(空值的表达) Nothing (不确定的结果) 都是对象
    // 运算符 + - * / 都是函数( 是否参考C++的运算符重载的概念)
    // 多表达能力的语言
    val v2:Long = (i1.toInt + i2.toInt).toLong
    println(v2)

    val x:Int = 3 * 12.1.toInt
    println(x)
    val y:Int = (3 * 12.1).toInt
    println(y)

    //Scala还提供了更强大的特性 -> 隐式函数, 隐式类

    var s:String = "123.11"
    println(s.toFloat)
    println(s.toDouble)
    println(s.toInt)
    println(s.toLong)
    // NumberFormatException 数据转换失败时, 对程序影响很大, 容易造成错误, 应当抛出异常.
    println(s.toBoolean)

  }
}



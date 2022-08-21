package chap01

/**
 * 变量和常量
 *
 *  能用常量的地方就不用变量, 减少程序的不确定性
 */
object VariableConsts {

  def main(args: Array[String]): Unit = {
    // 变量
    var v1:Int = 10
    // 常量: 运行时值不会改变的量, 常量, 不同语言有所区别
    // c, cpp, golang 编译时就确定
    // java, scala 运行时确定
    val v2:Int = 20
    println(v1)
    println(v2)

    // 自动类型推导 -> Int
    var v3 = 90
    v3 = 91     // -> compile 变量运行时可以变更
    val v4 = 100
    // v4 = 200 // -> error





  }

}

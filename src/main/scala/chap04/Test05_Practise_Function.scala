package chap04

object Test05_Practise_Function {

  def main(args: Array[String]): Unit = {

    // 函数式编程的练习
    // 1. 匿名函数, 函数作为值赋值给变量
    val fun = (i: Int, s: String, c: Char) => if (i == 0 && s == "" && c == '0') false else true
    println(fun(0, "", '0'))
    println(fun(0, "", '1'))

    // 2. 函数的高阶应用, 匿名函数声明, 嵌套调用, 三元判断
    val func: Int => String => Char => Boolean =
      i => s => c => if (i == 0 && s == "" && c == '0') false else true


    println(func(0)("")('0'))
    println(func(0)("")('1'))

    // 3. 柯里化

    def func2(i: Int)(s: String)(c: Char): Boolean = if (i == 0 && s == "" && c == '0') false else true
    // 简化版本
    def func3(i: Int)(s: String)(c: Char): Boolean = !(i == 0 && s == "" && c == '0')

  }

}

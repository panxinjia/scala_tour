package chap03

object Test02_if_else {


  def main(args: Array[String]): Unit = {
    // val age = StdIn.readInt()
    val age = 90
    // 分支语句带返回值, 作为逻辑判断和结果处理的表达 (process)
    // 函数式编程中, 最好也减少分支条件的使用, 减少子程序调用, 避免状态的意外变更 ☆
    val out = if (age < 18)
      "童年"
    else if (age > 18 && age < 30)
      "中年"
    else
      // "老年"
      100
    println(out)

    //  三元运算符
    val res = if (age >= 18) "成年" else "未成年"
    println(res)

    // scala中没有switch, 使用match模式匹配表示多分支值选择结构

  }

}

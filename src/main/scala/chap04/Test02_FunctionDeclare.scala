package chap04

/**
 * 函数声明时, 可以省略的部分可以直接省略, 满足语法定义即可
 */
object Test02_FunctionDeclare {

  def main(args: Array[String]): Unit = {
    // 无参无返回
    def test1(): Unit = {}

    // 无参有返回
    def test2(): String = {
      ""
    }

    // 有参无返回
    def test3(name: String): Unit = {}

    // 有参有返回
    def test4(name: String): String = name

    // 多参有返回
    def test5(sum: Int, values: Int*): Int = {
      sum
    }

    // 多参无返回
    def test6(numbers: Int): Unit = {}

    // 可变参数, 函数存在可变参数时一般放在参数的最后一个
    def summary(numbers:Int*):Int = {
      numbers.sum
    }

    val r1 = summary(1,2,3,4,5)
    val r2 = summary(1,2,3)
    println(r1 + ", " + r2)

    // 参数默认值
    def printInfo(name: String = "tom", age:Int
                 =  20) :Unit = {
        println(s"name = $name, age = $age")
    }

    printInfo()
    printInfo("jack", 30)
    // 命名参数, 参数默认从左到右开始绑定, 命名参数根据参数名进行绑定
    printInfo(age = 100, name = "tomas")

    // 函数最简原则, 能省的部分就可以省略
    

  }

}

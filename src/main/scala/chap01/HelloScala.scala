package chap01

// scala中 object 是关键字, 定义class的伴生对象
object HelloScala {

  // 方法定义, def methodName(name: Type):returnType = { methodBody }

  def main(args: Array[String]): Unit = {

    // Scala 运行在jvm上, 同时支持scala语法, 类库, 对java的包装, java本身的api,类库
    println("hello scala")
    System.out.println("hello java")
  }

}

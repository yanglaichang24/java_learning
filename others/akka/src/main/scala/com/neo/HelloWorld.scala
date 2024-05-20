import com.neo.{Demo, Hello}

object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    // 实例化java对象
    var demo = new Demo()
    demo.say();

    // 实例化scala对象
    val pt = new Hello(10, 20);

    // 移到一个新的位置
    pt.move(10, 10);

  }

}
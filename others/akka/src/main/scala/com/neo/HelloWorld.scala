import com.neo.{Demo, Hello}

object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var demo = new Demo()
    demo.say();

    val pt = new Hello(10, 20);

    // 移到一个新的位置
    pt.move(10, 10);

  }

}
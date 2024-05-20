package com.neo.scala.demo

import akka.actor.{ActorSystem, Props}

object Main {


  def main(args: Array[String]): Unit = {
    //伴生对象
    val system = ActorSystem("MySystem")
    val actor = system.actorOf(Props[I_Actor], "myActor")
    actor ! "hello" // 发送消息给actor
  }

  /*
    1 隐式转换（Implicit Conversions）关键词 Implicit

    2 with 关键词使用

    3 偏函数使用方法

    4 伴生对象的使用

    5 ！作为方法名使用（不推荐需掌握）

    6 []的使用方法
     如数组定义、元组类型、上下文界定和类型投影等


    7 def apply[T <: Actor: ClassTag]() 方法分析

   泛型方法 ([T])：
这部分表示apply是一个泛型方法，它接受一个类型参数T。泛型方法在Scala中允许你为方法定义类型参数，使得方法能够处理多种不同的类型。
上界类型约束 (<: Actor)：
T <: Actor 是一个类型约束，它表示T必须是Actor或其子类型。在Scala中，<:是类型上界的符号，它指定了类型参数T的上界是Actor。这意味着你可以调用这个方法，并传入任何继承自Actor的类型作为类型参数。
上下文界定 (: ClassTag)：
: ClassTag 是一个上下文界定，它表示类型参数T必须有一个隐式的ClassTag[T]存在。在Scala中，上下文界定通常用于指定类型参数必须满足的某些隐式条件。在这里，ClassTag是Akka或Spark等库中使用的一个类型类，用于为类型提供运行时类信息。 上下文界定通常与隐式参数和隐式转换一起使用，但在这种情况下，它只是指定了类型参数T必须有一个与ClassTag相关的隐式值可用。这通常是通过编译器自动插入的隐式参数来实现的，或者你可以通过在你的上下文中定义一个隐式值来提供这个值。
方法签名 (())：
最后，()表示这个方法没有参数（除了隐式的类型参数之外）。

  * */

}

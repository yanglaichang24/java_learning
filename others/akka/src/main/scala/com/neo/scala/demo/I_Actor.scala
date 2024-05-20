package com.neo.scala.demo

import akka.actor.Actor
import akka.event.Logging


class I_Actor extends Actor {

  val log = Logging(context.system, this)

  /*
  偏函数使用方法
  */
  override def receive: Receive = {
    case msg: Double =>
      log.info(s"Received message: $msg")
    case msg: Int =>
      log.info(s"Received message: $msg")
    case msg: String =>
      log.info(s"Received message: $msg")
      sender() ! s"Message received: $msg" // 回复发送者
    case _ => log.warning("Received unknown message")
  }


}

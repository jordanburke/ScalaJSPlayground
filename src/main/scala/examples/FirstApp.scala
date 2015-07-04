package examples

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object FirstApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
  }

  @JSExport
  def print(test : String): Unit = {
    println(test)
  }
}
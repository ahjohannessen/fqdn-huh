import scala.reflect.runtime.universe._

object Main extends App {

  println {
    typeTag[Option[Int]].tpe.toString
  }

}

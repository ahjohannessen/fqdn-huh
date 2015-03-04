import scala.reflect.runtime.universe._

object Main extends App {

  // 1) With sbt run we get: 
  //    `Int => scala.Option[Int]`

  // 2) With sbt-native-packager stage script we get:
  //	`Int => Option[Int]`

  println {
    typeTag[Int => Option[Int]].tpe.toString
  }

}
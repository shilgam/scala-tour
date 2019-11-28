import org.scalatest.FunSpec

class SingletonObjectsExampleSpec extends FunSpec {

  describe("Singleton Objects") {
    object Logger {
      def log(message: String): String = "INFO: " + message
    }

    it("have public parameters") {
      assert(Logger.log("Created projects") === "INFO: Created projects")
    }
  }

  describe("Companion class or object") {
    it("can access the private members of its companion") {
      import scala.math._

      object Circle {
        private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
      }

      case class Circle(radius: Double) {
        import Circle.calculateArea

        def area: Double = calculateArea(radius)
      }

      val circle1 = Circle(5.0)

      assert(circle1.area === 78.53981633974483)
    }
  }
}

/** IMPLICIT PARAMETERS
  * http://daily-scala.blogspot.com/2010/04/implicit-parameters.html
  */
import org.scalatest.FunSpec

class ImplicitParametersExampleSpec extends FunSpec {

  describe("Implicit parameter") {

    def p(implicit i: Int): Int = i

    implicit val v: Int = 2

    describe("(if not passed as usual)") {
      it("should be passed automatically") {
        assert(p === 2)
      }
    }

    describe("(if passed)") {
      it("should be overridden by explicit declarations") {
        assert(p(1) === 1)
      }
    }
  }
}

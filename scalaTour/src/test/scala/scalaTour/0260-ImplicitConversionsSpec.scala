import org.scalatest.FunSpec

class ImplicitConversionsExampleSpec extends FunSpec {

  describe("Implicit conversions") {

    case class Foo(i: Int)

    describe("(when not defined)") {
      it("should throw compilation error") {
        assertTypeError(
          "Foo(3) + 1"
        ) // compilation-error (type mismatch)
      }
    }

    describe("(when defined)") {
      it("should be converted automatically when needed") {
        implicit def fooToInt(foo: Foo): Int = foo.i

        assert(
          Foo(3) + 1 === 4
        )
      }
    }
  }
}

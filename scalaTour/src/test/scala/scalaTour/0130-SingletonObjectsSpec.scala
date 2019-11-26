/**
  *
  */
import org.scalatest.FlatSpec
import logging.Logger.log

class SingletonObjectsExampleSpec extends FlatSpec {
  behavior of "Singleton Objects"

  it should "have public parameters" in {
    class Project(name: String, daysToComplete: Int)

    val project1 = new Project("Performance optimisations", 1)
    val project2 = new Project("Website redesign", 3)

    assert(log("Created projects") === "INFO: Created projects")
  }
}

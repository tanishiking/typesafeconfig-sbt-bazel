import com.typesafe.config._

class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("fake test") {
    val conf = ConfigFactory.load()
    println(s"simple.foo comes from ${conf.getString("simple.foo")}")
    println(s"simple.bar comes from ${conf.getString("simple.bar")}")
    println(s"simple.baz comes from ${conf.getString("simple.baz")}")
    assert(true)
  }
}

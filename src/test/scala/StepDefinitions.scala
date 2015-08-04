import cucumber.api.scala.{ScalaDsl, EN}
import ToRoman.toRoman

class StepDefinitions extends ScalaDsl with EN {

  var result: String = null

  When( """I convert (\d+) to Roman""") { (arabic: Integer) =>
    result = toRoman(arabic)
  }

  Then( """I should get (.*)""") { (expectedResult: String) =>
    assert(result == expectedResult)
  }

}

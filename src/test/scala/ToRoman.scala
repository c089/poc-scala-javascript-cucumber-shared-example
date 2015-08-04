object ToRoman {

  val symbolValues = Map(
    "X" -> 10,
    "V" -> 5,
    "IV" -> 4,
    "I" -> 1)

  def toRoman(arabic: Int): String = {
    findClosestSymbolValue(arabic) match {
      case (symbol, 0) => symbol
      case (symbol, value) => symbol + toRoman(arabic - value)
    }
  }

  def findClosestSymbolValue(value: Int): (String, Int) = {
    symbolValues.find { case (_, symbolValue) => value >= symbolValue } match {
      case Some(x) => x
      case None => ("", 0)
    }
  }


}

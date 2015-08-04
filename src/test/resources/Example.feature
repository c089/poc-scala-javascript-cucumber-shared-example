Feature: Roman Numerals Conversion

  Scenario Outline: Converting from Arabic to Roman numerals
    When I convert <arabic> to Roman
    Then I should get <roman>

    Examples:
      | arabic | roman |
      | 1      | I     |
      | 2      | II    |
      | 3      | III   |
      | 4      | IV    |
      | 5      | V     |
      | 6      | VI    |
      | 27     | XXVII |

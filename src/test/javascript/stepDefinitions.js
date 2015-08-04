var assert = require('assert'),
    toRoman = require('./toRoman');

module.exports = function () {
    var result;

    this.When(/^I convert (.*) to Roman$/, function (arabic) {
        result = toRoman(arabic);
        console.log("result for arabic", result, arabic)
    });

    this.Then(/^I should get (.*)$/, function (roman) {
        assert.equal(result, roman);
    });
}
var _ = require('ramda');

var symbolValues = [
    ["X", 10],
    ["V", 5],
    ["IV", 4],
    ["I", 1],
    ["", 0]
];

module.exports = function toRoman(arabic) {
    if (arabic === 0) { return ""; }

    var symbolValue = _.find(function (x) { return arabic >= x[1]; }, symbolValues);

    return symbolValue[0] + toRoman(arabic - symbolValue[1]);
}
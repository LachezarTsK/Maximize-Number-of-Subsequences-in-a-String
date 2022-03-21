
/**
 * @param {string} text
 * @param {string} pattern
 * @return {number}
 */
var maximumSubsequenceCount = function (text, pattern) {
    
    const charOne = pattern.charAt(0);
    const charTwo = pattern.charAt(1);
    let countCharOne = 0, countCharTwo = 0, countPairs = 0;

    for (let currentChar of text) {
        if (currentChar === charTwo) {
            countPairs += countCharOne;
            ++countCharTwo;
        }
        //'else if' will not count correctly pairs of equal characters.
        if (currentChar === charOne) {
            ++countCharOne;
        }
    }
    return countPairs + Math.max(countCharOne, countCharTwo);
};

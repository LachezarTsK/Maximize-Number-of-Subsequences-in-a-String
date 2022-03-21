
#include <string>
using namespace std;

class Solution {
    
public:

    long long maximumSubsequenceCount(string text, string pattern) {

        const char charOne = pattern[0];
        const char charTwo = pattern[1];
        long long countCharOne = 0, countCharTwo = 0, countPairs = 0;

        for (const auto& currentChar : text) {
            if (currentChar == charTwo) {
                countPairs += countCharOne;
                ++countCharTwo;
            }
            //'else if' will not count correctly pairs of equal characters.
            if (currentChar == charOne) {
                ++countCharOne;
            }
        }
        return countPairs + max(countCharOne, countCharTwo);
    }
};

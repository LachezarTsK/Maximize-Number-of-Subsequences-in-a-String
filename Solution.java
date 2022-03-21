
public class Solution {

    public long maximumSubsequenceCount(String text, String pattern) {

        final int size = text.length();
        final char charOne = pattern.charAt(0);
        final char charTwo = pattern.charAt(1);
        long countCharOne = 0, countCharTwo = 0, countPairs = 0;

        for (int i = 0; i < size; i++) {
            if (text.charAt(i) == charTwo) {
                countPairs += countCharOne;
                ++countCharTwo;
            }
            //'else if' will not count correctly pairs of equal characters.
            if (text.charAt(i) == charOne) {
                ++countCharOne;
            }
        }
        return countPairs + Math.max(countCharOne, countCharTwo);
    }
}

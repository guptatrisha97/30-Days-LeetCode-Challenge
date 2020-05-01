/*You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

    direction can be 0 (for left shift) or 1 (for right shift).
    amount is the amount by which string s is to be shifted.
    A left shift by 1 means remove the first character of s and append it to the end.
    Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.

Return the final string after all operations.*/

class Solution {
    public String stringShift(String s, int[][] shift) {
          int i = 0;
        for (int[] move : shift) {
            if (move[0] == 0) {
                i += move[1];
            } else {
                i -= move[1];
            }
        }
        i %= (s.length());
        if (i < 0) {
            i += s.length();
        }
    String s1 = s.substring(i);
    String s2 = s.substring(0, i);
        return s1 + s2;
    }
    }

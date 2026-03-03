package Leetcode_Daily_Problems;

public class Leetcode1545 {

    class Solution {
    public char findKthBit(int n, int k) {
        return (char) ('0' + findKthBitRec(n, k));
    }

    private static int findKthBitRec(int n, int k) {
        if (k == 1) {
            return 0;
        }

        if ((k & (k - 1)) == 0) {
            return 1;
        }

        int totalLen = 1 << n;
        if (k * 2 < totalLen - 1) {
            return findKthBitRec(n - 1, k);
        } else {
            return findKthBitRec(n - 1, totalLen - k) ^ 1;
        }
    }
}
}
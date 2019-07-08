package dc_190424;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int x = -10000000;
        int n = 1000;
        long[] answer = new long[n] ;
        answer[0] = x;
        for (int i = 1; i < n; i++)
            answer[i] = answer[i-1] + x;
        System.out.println(Arrays.toString(answer));
    }
}

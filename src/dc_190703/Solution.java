package dc_190703;

public class Solution {
    public static void main(String[] args) {
        int n = 6;
        int answer = 0;
        int []count = new int[n + 1];
        count[0] = 0;
        count[1] = 1;
        for (int i = 2; i <= n ; i++) {
            count[i] = ( count[i-1] + count[i - 2] ) % 1234567;
        }
        answer = count[n];
        System.out.println(answer);
    }
}

package dc_181114;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int answer = n;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0 )
            answer += i;
        }
        System.out.println(answer);

    }
}


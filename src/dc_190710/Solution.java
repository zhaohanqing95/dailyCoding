package dc_190710;

public class Solution {
    public static void main(String[] args) {
        int n = 15;
        int answer = 1;
        for (int i = 1; i < n / 2 +1; i++) {
            int count = 0;
            for (int k = i; count <= n; k++) {
                count = count + k;
                if (count == n){
                    answer = answer + 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}

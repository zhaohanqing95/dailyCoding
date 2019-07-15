package dc_190715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i < num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        Solution solution = new Solution();
        int count = 0;
        for (int t = 0; t < test_case; t++) {
            int num = Integer.parseInt(br.readLine());
            if (solution.isPrime(num))
                count++;
        }
        System.out.println(count);
    }
}


package dc_181113;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i = 2; i < n + 1; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i <n+1 ; i++) {
            if (arr[i] == 0)
                continue;
            else
            {
                int num = i + i;
                while (num < n + 1){
                    arr[num] = 0;
                    num += i;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            answer += arr[i];
        }
        System.out.println(answer);;

    }
}

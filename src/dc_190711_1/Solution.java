package dc_190711_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        for(int t = 0; t < test_case; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] layers = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                layers[i] = i;
            }
            for (int i = 0; i < k; i++) {
                for (int j = 1; j < n + 1; j++) {
                    layers[j] = layers[j - 1] + layers[j];
                }
            }
            System.out.println(layers[n]);
        }
    }
}

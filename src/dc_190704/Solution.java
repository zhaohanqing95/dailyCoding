package dc_190704;

public class Solution {
    public static void main(String[] args) {
        int n = 78;
        int answer = 0;
        int num_current = 0;
        int num_bigger = 1;
        String binary_current;
        String binary_bigger = null;
        binary_current = Integer.toBinaryString(n);
        while (binary_current.indexOf("1") != -1){
            binary_current = binary_current.substring(binary_current.indexOf("1") + 1,binary_current.length());
            num_current++;
        }
        for (int i = 1; i < 100000 ; i++) {
            if (num_current != num_bigger){
                num_bigger = 0;
                answer = n + i;
                binary_bigger = Integer.toBinaryString(answer);
                while (binary_bigger.indexOf("1") != -1){
                    binary_bigger = binary_bigger.substring(binary_bigger.indexOf("1") + 1,binary_bigger.length());
                    num_bigger++;
                }
            }else
                break;
        }
        System.out.println(answer);
    }
    }


package dc_190719;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        String answer = "";
        String[] str_number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str_number[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str_number, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2+o1) - Integer.parseInt(o1+o2);
            }
        });
        if (str_number[0].equals("0"))
            answer = "0";
        for (int i = 0; i < str_number.length ; i++) {
            answer += str_number[i];
        }
        System.out.println(answer);
    }
}


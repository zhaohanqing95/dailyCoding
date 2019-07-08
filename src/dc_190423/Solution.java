package dc_190423;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";
        String[] splitedByWord = s.split(" ",-1);
        for ( String word : splitedByWord) {
            String tmpAnswer = "";
            for (int i = 0; i < word.length() ; i++) {
                if (i % 2 == 1) {
                    String lower;
                    lower = word.substring(i, i + 1);
                    lower = lower.toLowerCase();
                    tmpAnswer = tmpAnswer + lower;
                } else {
                    String upper;
                    upper = word.substring(i, i + 1);
                    upper = upper.toUpperCase();
                    tmpAnswer = tmpAnswer + upper;
                }
            }
            answer = answer +  " " + tmpAnswer;
        }
        System.out.println(answer.substring(1));
    }

}

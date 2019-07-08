package dc_190425;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        long n = 118375452;
        String strN = String.valueOf(n);
        String [] strAnswer = new String[strN.length()];
        for (int i = 0; i <strN.length() ; i++) {
            strAnswer[i] = strN.substring(i,i+1);
        }
        Arrays.sort(strAnswer, Collections.reverseOrder());
        String strAnswer1 = "";
        for (String  tmp: strAnswer) {
            strAnswer1 = strAnswer1 + tmp;
        }
        long answer = 0;
        answer = Long.parseLong(strAnswer1);
        System.out.println(answer);

    }
}

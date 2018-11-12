package dc_181110;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
      String s = "Zbcdefg";
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for(int i = s.length(); i > 0; i--){
            answer += chars[i-1];
        }
        System.out.println(answer);
    }
}

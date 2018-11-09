package dc_181107;

import javafx.scene.chart.Chart;

public class Solution {
    public static void main(String[] args) {
        boolean answer  ;
        String s = "Pyy";
        char[] chars =s.toCharArray();
        char p = 'p';
        char P = 'P';
        char Y = 'Y';
        char y = 'y';
        int nump = 0;
        int numy = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(p == chars[i])
                nump++;
            System.out.println(chars[i]);
            if(P == chars[i])
                nump++;
            if(Y == chars[i])
               numy++;
            if(y == chars[i])
                numy++;
        }
        if (nump == numy)
            answer = true;
        else
            answer = false;
        System.out.println(answer);
    }
}

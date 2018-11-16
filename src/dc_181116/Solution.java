package dc_181116;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        String s = "a B z";
        int n = 25;
        char[] chars = s.toCharArray();
        char[]  newChar = new char[chars.length];
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == 32)
                newChar[i] += chars[i];
            else
                if (chars[i] < 91)
                    if (((chars[i] + n) >  40 & (chars[i] + n) < 91))
                        newChar[i]+= chars[i] + n;
                    else
                        newChar[i] += (chars[i] + n - 26);
                 else
                     if ((chars[i] + n) >  96 & (chars[i] + n) < 123)
                         newChar[i]+= chars[i] + n;
                      else
                         newChar[i] += (chars[i] + n - 26);
        }
        answer = new String(newChar);
        System.out.println(answer);
    }
}

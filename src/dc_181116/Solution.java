package dc_181116;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        String s = "a B z";
        int n = 25;
        char[] chars = s.toCharArray();
        char[]  newChar = new char[chars.length];
        for (int i = 0; i < chars.length ; i++) {
            int tmp;
            if (chars[i] == 32)
                newChar[i] += chars[i];
            else
                if (chars[i] < 91) {
                    tmp = (chars[i] - 65 + n) % 26;
                    newChar[i] += tmp + 65;
                }
                else {
                    tmp = (chars[i] - 97 + n) % 26;
                    newChar[i] += tmp + 97;
                }
        }
        answer = new String(newChar);
        System.out.println(answer);
    }
}

package dc_190708;

public class Solution {
    public static void main(String[] args) {
        String s = "(()(";
        boolean answer = true;
        int[] array_s = new int[s.length() +1 ];
        int count = 0;
        array_s[s.length()] = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                array_s[i] = 1;
            else
                array_s[i] = -1;
        }
        for (int i = 0; i < array_s.length - 1; i++) {
            count = count + array_s[i];
            if (count > 0) {
                if (array_s[i] == -1 && array_s[i + 1] == -1)
                    continue;
                else {
                    if (array_s[i] == 1)
                        continue;
                    else {
                        answer = false;
                        break;
                    }
                }
            } else {
                if (count == 0 && (array_s[i + 1] >= 0)) {
                    continue;
                } else {
                    answer = false;
                    break;
                }
            }
        }
        // count = count + array_s[array_s.length - 1];
        if (count == 0)
            answer = true;
        else
            answer = false;
        System.out.println(answer);

    }


}

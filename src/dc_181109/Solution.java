package dc_181109;

public class Solution {
    public static void main(String[] args) {
        int answer = 0;
        int n = 12345;
        Integer tmp = n;
        String input = tmp.toString();
        for (int i = 0; i < input.length(); i++)
            answer += input.charAt(i)-48;
        System.out.println(answer);

    }
}

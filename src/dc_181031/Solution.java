package dc_181031;

class Solution {


    public static void main(String[] args) {
        String s = "abcde";
        int i=s.length();
        String answer;
        /*
        if(i%2==0)
            answer = s.substring((i/2-1),(i/2+1));
        else
            answer = String.valueOf(s.charAt(i/2));
        */
        answer = i % 2 == 0 ? s.substring((i / 2 - 1), (i / 2 + 1)) : String.valueOf(s.charAt(i / 2));

        System.out.println(answer);
    }
}
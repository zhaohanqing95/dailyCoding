package dc_181108;

public class Solution {

    public static void main(String[] args) {
        String s = "1234";
        boolean answer;
      if (s.matches(".*[a-zA-z].*")){
            answer = false;
            System.out.println(answer);
        }
            else {
            if (s.length() == 4 || s.length() == 6) {
                answer = true;
                System.out.println(answer);
            } else {
                answer = false;
            System.out.println(answer);
            }
        }
        }
    }


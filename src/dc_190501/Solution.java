package dc_190501;

public class Solution {
    public static void main(String[] args) {
            long num = 6;
            int answer = 0;
            for (int i = 0; i < 500 ; i++) {
                if (num != 1){
                    if ( num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                } else {
                    answer = i;
                    break;
                }
            }
            if (num != 1)
                answer = -1;
        System.out.println( answer );
    }
}

package dc_190515;

public class Solution {
    public static void main(String[] args) {
        long n = 50000000000000L;
        long answer = -1;

        double tmp = Math.sqrt(n);
        long a = (long) tmp;

        if(tmp == a){
            answer = (a + 1) * (a + 1);
        }



        System.out.println(answer);
    }
}

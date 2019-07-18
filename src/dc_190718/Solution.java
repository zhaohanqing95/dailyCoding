package dc_190718;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        int answer = 1;
        int lcm;
        for (int i = 0; i < arr.length; i++) {
            lcm = (answer > arr[i]) ? answer : arr[i];
            while(true){
                if (lcm % answer == 0 && lcm % arr[i] == 0)
                    break;
                lcm++;
            }
            answer = lcm;
        }
        System.out.println(answer);
    }
}

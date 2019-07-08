package dc_190430;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = "";
        for (int i = 0; i < b; i++) {
            answer = "";
            for (int j = 0; j <a ; j++) {
                answer = answer + "*";
            }
            System.out.println(answer);
        }

    }
}

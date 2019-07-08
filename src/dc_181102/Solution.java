package dc_181102;

public class Solution {
    public static void main(String[] args) {
     int a = 6;
     int b = 3;
     int answer = 0;
     if(a < b){
         for (int i = a; i <= b; i++) {
             answer = answer + i;
         }
     }
     else if (a > b){
         for (int i = b; i <= a; i++)
             answer = answer + i;
     }
     else{
         answer = a;
     }
             System.out.println(answer);
             }
             }

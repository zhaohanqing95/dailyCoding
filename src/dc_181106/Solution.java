package dc_181106;

public class Solution {
    public static void main(String[] args) {
        int a = 12;
        int b = 31;
        int day = 0;
        int rem;
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < a-1; i++)
            day = day + month[i];
        day = day + b;
        rem = (day % 7) ;
        System.out.println(week[rem]);
    }
}


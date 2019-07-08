package dc_190502;

public class Solution {
    public static void main(String[] args) {
        int x = 11;
        boolean answer ;
        String strX = String.valueOf(x);
        int intX = 0;
        for (int i = 0; i <strX.length() ; i++)
            intX  = intX + Integer.parseInt(strX.substring(i,i+1));
        if (x % intX == 0)
            answer = true;
         else
            answer = false;
        System.out.println(answer);
    }
}

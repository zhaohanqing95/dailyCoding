package dc_181105;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,4,7,5,15,5,17};
        int divisor=5;
        ArrayList<Integer> answer = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %divisor ==0)
                answer.add(arr[i]);
        }
        if (answer.size() ==0)
            System.out.println("-1");
        else
            Collections.sort(answer);
            for (int i = 0; i <answer.size(); i++) {
                System.out.println(answer.get(i));
            }
    }
}

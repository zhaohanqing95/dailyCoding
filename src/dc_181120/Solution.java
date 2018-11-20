package dc_181120;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1};
        int[] arr1 = arr.clone();
        int[] answer = new int[arr.length - 1];
        int min_num;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        min_num = arr[0];
        if (arr.length == 1) {
            System.out.println(-1);
        }
        else {
            int i = 0;
            for (int tmp : arr1) {
                if (tmp != min_num) {
                    answer[i] = tmp;
                    i++;
                }
            }
            System.out.println(Arrays.toString(answer));
        }
    }
}
package dc_181101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int [] arr={1, 1, 3, 3, 0, 1, 1};
        /*
        int date[]=new int[answer.length];
        int t=0;
        date[0]=answer[0];
        for (int i = 1; i <answer.length; i++) {
            boolean isTrue=true;
            for (int j = 0; j <i ; j++) {
                if (answer[i]==answer[j]){
                   isTrue=false;
                   break;
                }
            }
            if (isTrue){
            date[i]=answer[i];
            t++;
            }
        }
        int [] newArr=new int [t+1] ;
        int j=0;
        for (int i = 0; i <date.length ; i++) {
            if (date[i]!=0){
                newArr[j]=date[i];
                j++;
            }
        }
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
        */
/* 방법1
        ArrayList<Integer> arr = new ArrayList();
        arr.add(answer[0]);
        for (int i = 1; i < answer.length; i++) {
            boolean check = false;
            for (int num : arr)
                if(answer[i] == num)
                    check = true;

            if(!check){
                arr.add(answer[i]);
            }
        }
        System.out.println(arr);
*/

/* 방법2
        int[] mark = new int[10];
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < answer.length; i++)
            if(mark[answer[i]] == 0){
                arr.add(answer[i]);
                mark[answer[i]] = 1;
            }
        System.out.println(arr);
*/



       /*  방법3 안 좋아 Set set=new HashSet();
        for (int i = 0; i <answer.length; i++) {
            set.add(answer[i]);
        }
         for (Object str :set){
             System.out.println(str);
         }*/

       /*
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList();
        arr.add(input[0]);
        for (int i = 1; i < input.length; i++)
            if (arr.get(arr.size()-1) != input[i]) {
                arr.add(input[i]);
            }

        answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = arr.get(i);
*/
        int[] answer = {};
        int answer_len = 1;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++)
            if(arr[i] != num){
                answer_len++;
                num = arr[i];
            }
            else
                arr[i] = -1;
        answer = new int[answer_len];
        int i = 0;
        for (int a : arr ) {
            if(a > -1){
                answer[i] = a;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(answer_len);
        System.out.println(Arrays.toString(answer));


    }
}




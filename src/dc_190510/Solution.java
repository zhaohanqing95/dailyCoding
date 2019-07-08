package dc_190510;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        int[] score = {0,0,0};

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        for (int i = 0; i < answers.length ; i++) {
            if ( answers[i] == num1[i % num1.length])
                score[0] += 1;
            if ( answers[i] == num2[i % num2.length])
                score[1] += 1;
            if ( answers[i] == num3[i % num3.length])
                score[2] += 1;
        }

        int max = Integer.MIN_VALUE;
        int tie = 1;
        for (int i = 0; i < 3; i++) {
            if ( score[i] > max) {
                tie = 1;
                max = score[i];
            }
            else if ( score[i] == max ){
                tie++;
            }
        }
        int[] answer = new int[tie];

        int idx = 0;
        for (int i = 0; i < 3 ; i++) {
            if ( score[i] == max){
                answer[idx] = i + 1;
                idx++;
            }

        }
        System.out.println(Arrays.toString(score));
        System.out.println(tie);
        System.out.println(Arrays.toString(answer));


    }
}

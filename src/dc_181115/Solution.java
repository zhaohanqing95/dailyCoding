package dc_181115;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5, 3},
                            {4, 4, 1},
                            {1, 7, 3}};
        int row = commands.length; //行个数
        //int[] tmp = new int[3];
        int[] answer = new int[row];
        for (int i = 0; i < row; i++) {
            /*
            for (int j = 0; j < commands[i].length ; j++) {
                tmp[j] = commands[i][j];
            }
            */
            int first = commands[i][0];   //tmp[0];
            int last = commands[i][1]; //tmp[1];
            int k = commands[i][2];  //tmp[2];
            int[] newArray = Arrays.copyOfRange(array,first - 1,last  );
            Arrays.sort(newArray);
            answer[i] = newArray[k-1];
        }
        System.out.println(answer);
        }
    }

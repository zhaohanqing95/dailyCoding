package dc_190724;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] priorities = {2,2,2,1,3,4};
        int location = 3;
        int answer = 0;
        Queue<Integer> list = new LinkedList<>();
        ArrayList<Integer> list_new = new ArrayList<Integer>();
        priorities[location] = priorities[location] * -1;
        for (int i = 0; i < priorities.length; i++)
            list.add(priorities[i]);
        for (int i = 9; i >= 0; i--) {
            if (list.size() != 0) {
                for (int j = 0; j < list.size() + 1; j++) {
                    if (Math.abs(list.peek()) < i) {
                        list.add(list.poll());
                    } else
                        list_new.add(list.poll());
                }
            }else
                break;
        }
        System.out.println(list_new);
        for (int i = 0; i < list_new.size(); i++) {
            if (list_new.get(i) < 0){
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
    }
}

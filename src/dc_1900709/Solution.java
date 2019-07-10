package dc_1900709;

import java.util.HashMap;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) {
        String[][] clothes ={{"yellow_hat","headgear" },{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
            if(map.get(clothes[i][1]) != null)
                map.replace(clothes[i][1], map.get(clothes[i][1])+1);
             else
                map.put(clothes[i][1], 1);
        }
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            answer = answer * (map.get(key) + 1);
        }
        answer--;
        System.out.println(answer);
    }
}

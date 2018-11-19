package dc_181119;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[] strings = {"baz", "aaa", "caa", "cat"};
        int n = 1;
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        char begin_letter = 'a';
        HashMap<Character, ArrayList<String>> map_tmp = new HashMap<>();
        for (int i = (int)begin_letter; i < begin_letter+26; i++)
            map_tmp.put((char)i, new ArrayList<>());
        for (String word: strings)
            map_tmp.get(word.charAt(n)).add(word);
        int i = 0;
        for (ArrayList<String> tmp : map_tmp.values())
            for (String word : tmp) {
                answer[i] = word;
                i += 1;
            }
        System.out.println(Arrays.toString(answer));


    }
}

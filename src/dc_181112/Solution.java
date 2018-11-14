package dc_181112;


import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
         String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";
        HashMap<String, Integer> map_completion = new HashMap<>();
        for (String aCompletion : completion) {
            map_completion.put(aCompletion, map_completion.getOrDefault(aCompletion, 0) + 1);
        }

        for (String aParticipant : participant) {

            if (!map_completion.containsKey(aParticipant)){
                answer = aParticipant;
                break;
            }
            else{
                int value = map_completion.get(aParticipant);
                if (value == 0){
                    answer = aParticipant;
                    break;
                }
                map_completion.put(aParticipant, value - 1);
            }
        }
        System.out.println(answer);

}
}
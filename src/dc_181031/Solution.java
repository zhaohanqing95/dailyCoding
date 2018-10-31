package dc_181031;

class Solution {
    public String solution(String s) {
        int i=s.length();
        String answer;
        if(i%2==0){
            answer = s.substring((i/2-1),(i/2+1));
        }
        else {
            answer = s.substring(i/2, i/2+1);
        }
        return answer;
    }
}
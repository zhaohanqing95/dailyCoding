package dc_181103;

public class Solution {
    public static void main(String[] args) {
        String [] seoul = {"Jane", "Kim", "SDF"};
        int count=0;
        for (String  name : seoul) {
            if (name.compareTo("Kim") == 0){
                System.out.println("test");
                break;
            }
            count++;
        }
        System.out.println("김서방은 " + count + "에 있다");

    }
}

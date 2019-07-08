package dc_190701;

public class Solution {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223","24","24421"};
        boolean answer = true;
        int length = phone_book.length;
        String bigSize;
        String smallSize;
            for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                boolean isPrefix = true;
                if ((phone_book[i].length() > phone_book[j].length())) {
                    bigSize = phone_book[i];
                    smallSize = phone_book[j];
                } else {
                    bigSize = phone_book[j];
                    smallSize = phone_book[i];
                }
                for (int k = 0; k < smallSize.length(); k++) {
                    char item = smallSize.charAt(k);
                    if (item == bigSize.charAt(k))
                        continue;
                    else {
                        isPrefix = false;
                        break;
                    }
                }
                if (isPrefix == true){
                    answer = false;
                    break;
                }else {
                    answer = true;
                    continue;
                }
            }
            if (answer == false)
                break;
        }
        System.out.println(answer);
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"a", "a"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }
}

class Solution {
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];
        boolean isEqual = strs.length > 1 && lastWord.length()>1;

        String result = strs.length > 1 ? "" : firstWord;


        int i = 0;

        while(isEqual && i<lastWord.length()) {
            if(firstWord.substring(0,i).equals(lastWord.substring(0,i))){
                result = firstWord.substring(0,i);
                i++;
            } else {
                isEqual = false;
                break;
            }
        }



        return result;
    }
}
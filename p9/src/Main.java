public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(-1221));

    }
}

class Solution {
    public static boolean isPalindrome(int x) {
        String reversed = "";
        String nonReversed = String.valueOf(x);
        boolean output = false;
        for(int i=nonReversed.length()-1;i>=0;i--){
            reversed = reversed.concat(String.valueOf(nonReversed.charAt(i)));
        }

        if(reversed.equals(nonReversed)){
            output = true;
        }

        return output;
    }
}
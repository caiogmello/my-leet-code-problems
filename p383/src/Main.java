public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.canConstruct("aa","baa"));
    }
}

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i<ransomNote.length(); i++){
            if(Solution.count(magazine, ransomNote.charAt(i)) >= Solution.count(ransomNote, ransomNote.charAt(i))){
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static int count(String str,char ch){
        int count = 0;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
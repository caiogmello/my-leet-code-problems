import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.isIsomorphic("paper", "title"));
    }
}

class Solution {
    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] n1 = new int[256];
        int[] n2 = new int[256];

        int n = s.length();

        for(int i=0;i<n;i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (n1[c1] != n2[c2]) {
                return false;
            }

            n1[c1] = i+1;
            n2[c2] = i+1;
        }

        return true;
    }
}
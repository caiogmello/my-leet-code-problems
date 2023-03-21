public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.isValid("{[]}"));
    }
}

class Solution {
    public static boolean isValid(String s) {
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s = s.replace("()","");
            s = s.replace("{}","");
            s = s.replace("[]","");
        }

        return s.equals("");
    }
}
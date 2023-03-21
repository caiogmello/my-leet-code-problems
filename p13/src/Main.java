public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        int number = 0;

        for(int i = 1;i<s.length();i++){
            int actualNumber = romanChar(s.charAt(i-1));
            int nextNumber = romanChar(s.charAt(i));
            if(actualNumber >= nextNumber){
                number+=actualNumber;
            } else {
                number-=actualNumber;
            }

        }
        number += romanChar(s.charAt(s.length()-1));
        return number;
    }

    public  int romanChar(char roman) {
        switch (roman) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}
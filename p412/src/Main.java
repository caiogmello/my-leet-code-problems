import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.fizzBuzz(5));
    }
}

class Solution {
    public static List<String> fizzBuzz(int n) {
        String[] strings = new String[n];

        for(int i = 0; i<strings.length; i++) {
            int j = i+1;
            if(j % 15 == 0){
                strings[i] = "FizzBuzz";
            } else if(j % 3 == 0){
                strings[i] = "Fizz";
            } else if(j % 5 == 0){
                strings[i] = "Buzz";
            } else {
                strings[i] = String.valueOf(j);
            }

        }

        return Arrays.asList(strings);
    }
}
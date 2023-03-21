import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] time = {2};
        System.out.println(Solution.minimumTime(time, 1));
    }

}

class Solution {
    public static long minimumTime(int[] time, int totalTrips) {
//        Scanner scanner = new Scanner(System.in);
//        String[] input = scanner.nextLine().trim().split("], ");
//        String inputTime = input[0].replace("time = [", "");
//        String inputTotalTrips = input[1].replace("totalTrips = ", "");
//
//        int j = 0;
//        for(int i=0;i<inputTime.length();i+=2) {
//            time[j] = (int) inputTime.charAt(i);
//        }

        Arrays.sort(time);

        long sum = 0;
        long actualTime = time[0] - 1;

        while(sum < totalTrips) {
            actualTime++;
            sum = 0;
//            for (int i = 0; i < time.length; i++) {
//                if(time[i] <= actualTime) {
//                    sum += actualTime/time[i];
//                }
//            }
            Arrays.binarySearch(time,0,)

        }
        return actualTime;
    }
}
package practice.problemSolving;

import java.util.ArrayList;

class SumOfContinuousSubArray {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        for (int i = 0; i < n; i++) {
            int curr_sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (curr_sum == s) {
                    ArrayList<Integer> out = new ArrayList<Integer>();
                    out.add(i + 1);
                    out.add(j);
                   System.out.println((i + 1)+" "+j);
                    return out;
                }
                if (curr_sum > s) {
                    break;
                }
                curr_sum = curr_sum + arr[j];
            }
        }
      System.out.println(-1);
       ArrayList<Integer> out = new ArrayList<Integer>();
       out.add(-1);
       return out;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 7, 5, 6};
        int n = arr.length;
        int s = 0;
        subarraySum(arr, n, s);
    }
}

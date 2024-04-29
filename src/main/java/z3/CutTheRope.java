package z3;

import java.util.ArrayList;
import java.util.Arrays;

public class CutTheRope{

    public static ArrayList<Integer> ropeCutting(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr); // Sort the array in ascending order

        int cuttingLength = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - cuttingLength > 0) {
                ans.add(n - i); // Add the number of pieces we can cut from the remaining rope
            }
            cuttingLength = arr[i]; // Update the cutting length to the current rod length
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,1,2,3,5};
        int n = arr.length;

        ArrayList<Integer> result = ropeCutting(arr, n);

        System.out.println(result);
    }
}

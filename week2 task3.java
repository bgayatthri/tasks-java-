import java.util.*;

public class Solution {
    static void miniMaxSum(int[] arr) {
        long sum = 0, min = Long.MAX_VALUE, max = Long.MIN_VALUE;

        for (int x : arr) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        miniMaxSum(arr);
        sc.close();
    }
}

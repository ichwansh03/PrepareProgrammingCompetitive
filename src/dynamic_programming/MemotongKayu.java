package dynamic_programming;

import java.util.Arrays;

public class MemotongKayu {

    //cutting a rod in top-down solution
    static int solveTopDown(int[][] dp,int[] cost, int index, int n){
        if (index == 0){
            return n * cost[0];
        }

        if (dp[index][n] != -1){
            return dp[index][n];
        }

        //at any index have 2 options either cut the rod of this length
        //or not cut it
        int ncut = solveTopDown(dp, cost, index-1,n);
        int cut = Integer.MIN_VALUE;
        int rod_length = index + 1;

        if (rod_length <= n){
            cut = cost[index] + solveTopDown(dp, cost, index, n - rod_length);
        }

        return dp[index][n] = Math.max(cut,ncut);
    }

    //cutting a rod in bottom-up solution
    static int solveBottomUp(int[] cost, int n){
        int[] value = new int[n+1];
        value[0] = 0;

        //build the table value[] in bottom up manner and return
        //the last entry from table
        for (int i = 1; i <= n; i++) {
            int maxval = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                maxval = Math.max(maxval, cost[j] + value[i-j-1]);
            }

            value[i] = maxval;
        }
        return value[n];
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,9,10,17,17,20};
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }

        System.out.println(solveTopDown(dp, arr, n-1, n));
        System.out.println(solveBottomUp(arr,n));
    }
}
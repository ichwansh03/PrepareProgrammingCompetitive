package dynamic_programming;

import java.util.Arrays;

public class RekursifCoinChange {

    //normal recursive
    static int solve(int x[], int n, int sum){

        //if sum is 0 then there is 1 solution (do not include any coin)
        if (sum == 0){
            return 1;
        }

        //if sum is less than 0 then no solution exists
        if (sum < 0){
            return 0;
        }

        //if there are no coins and sum is greater than 0, then no solution exists
        if (n <= 0){
            return 0;
        }

        //count is sum of solutions (i) including coins[n-1] excluding coins[n-1]
        return solve(x, n-1,sum) + solve(x, n, sum-x[n-1]);
    }

    //recursive coin change by top down memoization
    static int solveTopDown(int[] a, int vector, int n, int[][] dp){
        if (vector == 0)
            return dp[n][vector] = 1;
        if (n == 0)
            return 0;
        if (dp[n][vector] != -1)
            return dp[n][vector];
        if (a[n-1] <= vector){
            //either pick this coin or not
            return dp[n][vector] = solveTopDown(a, vector - a[n-1], n, dp) + solveTopDown(a, vector, n-1, dp);
        }
        else
            return dp[n][vector] = solveTopDown(a, vector, n-1, dp);
    }

    //recursive coin change by bottom up tabulation
    static long solveBottomUp(int[] a, int n, int sum){
        /*table[i] will be storing the number of solutions for i value.
        * you need sum+1 rows as the table is constructed in bottom up manner
        * using the base case (sum = 0)*/
        int[] table = new int[sum+1];

        //base case
        table[0] = 1;

        /*pick all coins one by one and update the table[] values
        * after the index greater than or equal to the value of the
        * picked coin*/
        for (int i = 0; i < n; i++) {
            for (int j = a[i]; j <= sum; j++) {
                table[j] += table[j-a[i]];
            }
        }

        return table[sum];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        int vector = 4;
        int[][] dp = new int[n+1][vector+1];

        //normal recursive output
        //System.out.println(solve(arr,n,4));

        //top down recursive output
        int tc = 1;
        while (tc != 0){
            for (int[] row:
                 dp) {
                Arrays.fill(row, -1);
            }
            int res = solveTopDown(arr, vector, n, dp);
            System.out.println(res);
            tc--;
        }

        //recursive bottom up output
        System.out.println(solveBottomUp(arr,n,vector));
    }
}

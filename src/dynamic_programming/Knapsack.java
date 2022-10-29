package dynamic_programming;

public class Knapsack {

    //knapsack problem with base case DP solution
    static int solve(int i, int c, int[] w, int[] v){
        int a, b;
        int[][] computed = new int[2][i+1];

        //using 2d array with only 2 rows i%2 will be giving index
        //inside the bounds of 2d array computed
        for (a = 0; a <= c; a++) {
            for (b = 0; b <= i; b++) {
                if (a == 0 || b == 0){
                    computed[a%2][b] = 0;
                }
                else if (w[a-1] <= b){
                    computed[a%2][b] = Math.max(v[a-1] + computed[(a - 1) % 2][b - w[a-1]],computed[(a-1)%2][b]);
                }
                else {
                    computed[a%2][b] = computed[(a-1)%2][b];
                }
            }
        }

        return computed[c%2][i];
    }

    //knapsack problem with top-down
    static int knapsack(int W, int[] wt, int[] val, int n){
        //making and initializing dp array
        int[] dp = new int[W+1];

        for (int i = 1; i < n+1; i++) {
            for (int w = W; w >= 0; w--) {
                if (wt[i-1] <= w)
                    //finding the max value
                    dp[w] = Math.max(dp[w], dp[w - wt[i-1]] + val[i-1]);
            }
        }

        //returning max value of knapsack
        return dp[W];
    }

    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] wt = {10,20,30};
        int i = 50;
        int c = value.length;

        System.out.println(solve(i,c,wt,value));
        System.out.println(knapsack(i,wt,value,c));
    }
}

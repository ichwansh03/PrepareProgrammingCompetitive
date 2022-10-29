package dynamic_programming;

public class LongestCommonSubsequence {

    //top-down longest common subsequence
    static int solveTopDown(char[] x, char[] y, int m, int n){
        if (m == 0 || n == 0)
            return 0;
        if (x[m-1] == y[n-1])
            return solveTopDown(x, y, m - 1, n - 1) + 1;
        else
            return Math.max(solveTopDown(x, y, m -1, n), solveTopDown(x, y, m, n - 1));
    }

    //bottom-up longest common subsequence
    static int solveBottomUp(char[] x, char[] y, int m, int n){
        int[][] l = new int[m + 1][n + 1];

        //following steps build l[m+1][n+1] in bottom up fashion.
        //note that l[i][j] contains length of LCS of x[0..i-1] and y[0..j-1]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    l[i][j] = 0;
                else if (x[i - 1] == y[j - 1])
                    l[i][j] = l[i - 1][j - 1]+1;
                else
                    l[i][j] = Math.max(l[i - 1][j], l[i][j-1]);
            }
        }
        return l[m][n];
    }

    public static void main(String[] args) {
        String teks1 = "ichwan";
        String teks2 = "sholihin";

        char[] x = teks1.toCharArray();
        char[] y = teks2.toCharArray();

        int i = x.length;
        int j = x.length;

        System.out.println(solveTopDown(x, y, i, j));
        System.out.println(solveBottomUp(x, y, i, j));
    }
}

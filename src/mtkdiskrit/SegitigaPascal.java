package mtkdiskrit;

public class SegitigaPascal {

    static void precomputeCombination(int n){
        int[][] c = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            c[i][0] = 1;
            for (int j = 1; j < i-1; j++) {
                c[i][j] = c[i-1][j-1] + c[i-1][j];
                System.out.println(c[i][j]);
            }
            c[i][i] = 1;
        }
    }

    public static void main(String[] args) {
        precomputeCombination(12);
    }
}

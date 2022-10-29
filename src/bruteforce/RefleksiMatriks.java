package bruteforce;

import java.util.Scanner;

public class RefleksiMatriks {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean iden = true;
        boolean hor = true;
        boolean ver = true;
        boolean diagkanan = true;
        boolean diagkiri = true;

        int[][] x = new int[100][100];
        int[][] y = new int[100][100];
        int n, m;

        n = in.nextInt();
        m = in.nextInt();
        if (n == m){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    x[i][j] = in.nextInt();
                }
            }
        }

        n = in.nextInt();
        m = in.nextInt();
        if (n == m){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    y[i][j] = in.nextInt();
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (x[i][j] != y[i][j])
                        iden = false;
                    if (x[i][j] != y[i][n+1-j])
                        ver = false;
                    if (x[i][j] != y[n-i+1][j])
                        hor = false;
                    if (x[i][j] != y[j][i])
                        diagkanan = false;
                    if (x[i][j] != y[n+1-j][n+1-i])
                        diagkiri = false;
                }
            }
        }

        if (iden)
            System.out.println("identik");
        else if (hor)
            System.out.println("horizontal");
        else if (ver)
            System.out.println("vertikal");
        else if (diagkanan)
            System.out.println("diagonal kanan bawah");
        else if (diagkiri)
            System.out.println("diagonal kiri bawah");
        else
            System.out.println("tidak identik");
    }
}

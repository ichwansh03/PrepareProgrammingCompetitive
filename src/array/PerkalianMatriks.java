package array;

import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N,M,P;
        int[][] A = new int[100][100];
        int[][] B = new int[100][100];

        N = input.nextInt();
        M = input.nextInt();
        P = input.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                int jml = 0;
                for (int k = 0; k < M; k++) {
                    jml += A[i][k] * B[k][j];
                }
                System.out.print(jml);
                if (j < P-1)
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
}

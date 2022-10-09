package array;

import java.util.Scanner;

public class RotasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N,M;
        int[][] matriks = new int[105][105];

        N = input.nextInt();
        M = input.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = M-1; j >= 0; j--) {
                System.out.print(matriks[i][j]);
                if (j != 0){
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}

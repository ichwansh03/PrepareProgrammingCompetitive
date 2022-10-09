package array;

import java.util.Scanner;

public class ArrayTwoDimension {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[][] hasil = new int[N][N];

        //input matriks pertama
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int temp = input.nextInt();
                hasil[i][j] = temp;
                System.out.print(hasil[i][j] + " ");
            }
        }

        //langsung dijumlahkan sembari input matriks kedua
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int temp = input.nextInt();
                hasil[i][j] += temp;
                System.out.print(hasil[i][j] + " ");
            }
        }
    }
}

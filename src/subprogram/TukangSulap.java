package subprogram;

import java.util.Scanner;

public class TukangSulap {

    int a;
    int b;
    int temp;
    static int N;
    static int Q;
    static int[][] ar = new int[2][1001];

    public TukangSulap(int a, int b) {
        temp = a;
        this.a = b;
        this.b = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = input.nextInt();
            }
        }

        Q = input.nextInt();
        for (int i = 0; i < Q; i++) {
            char[] buff1 = new char[5];
            char[] buff2 = new char[5];
            int x,y;

            buff1[i] = input.next().charAt(i);
            x = input.nextInt();
            buff2[i] = input.next().charAt(i);
            y = input.nextInt();

            int p = buff1[0] - 'A';
            int q = buff2[0] - 'A';
            x--;
            y--;
            new TukangSulap(ar[p][x], ar[q][y]);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d",ar[i][j]);
                if (j+1 < N){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

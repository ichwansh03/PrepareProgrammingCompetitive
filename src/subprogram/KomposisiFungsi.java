package subprogram;

import java.util.Scanner;

public class KomposisiFungsi {
    static int A, B, K, x;

    static int fungsi(int n){
        int res = Math.abs(A * n + B);
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();
        K = input.nextInt();
        x = input.nextInt();

        for (int i = 0; i < K; i++) {
            x = fungsi(x);
        }
        System.out.println(x);
    }
}

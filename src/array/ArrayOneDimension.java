package array;

import java.util.Scanner;

public class ArrayOneDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;
        N = input.nextInt();
        int[] nilai = new int[N];

        //input isi dari array
        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
            System.out.println(nilai[i]);
        }

        //menjumlahkan total isi array
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += nilai[i];
        }
        System.out.println(total);

        //menghitung isi array yg nilainya lebih dari total
        int lulus = 0;
        for (int i = 0; i < N; i++) {
            if (nilai[i]*N >= total){
                lulus++;
            }
        }

        System.out.println(lulus);
    }
}

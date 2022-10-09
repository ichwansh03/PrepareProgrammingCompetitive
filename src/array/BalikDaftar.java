package array;

import java.util.Scanner;

public class BalikDaftar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;
        int[] N = new int[100];
        while (input.hasNextInt()){
            N[i] = input.nextInt();
            i++;
        }

        for (i = i-1; i >= 0; i--) {
            System.out.println(N[i]);
        }
    }
}

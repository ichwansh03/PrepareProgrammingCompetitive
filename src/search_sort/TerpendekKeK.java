package search_sort;

import java.util.Arrays;
import java.util.Scanner;

public class TerpendekKeK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] tinggi = new int[n];

        for (int i = 0; i < n; i++) {
            tinggi[i] = input.nextInt();
        }

        Arrays.sort(tinggi);

        System.out.println(tinggi[k - 1]);
    }
}

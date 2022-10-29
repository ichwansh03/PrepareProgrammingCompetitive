package search_sort;

import java.util.Arrays;
import java.util.Scanner;

public class KualitasBaju {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        if (arr.length % 2 == 0){
            int mid = arr.length / 2;
            System.out.println((arr[mid] + arr[mid - 1])/2.0);
        } else {
            int mid = arr.length / 2;
            System.out.println(arr[mid]/1.0);
        }
    }
}

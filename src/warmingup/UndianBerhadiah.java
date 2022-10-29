package warmingup;

import java.util.Arrays;
import java.util.Scanner;

public class UndianBerhadiah {

    static void printNol(int x){
        if (x < 10)
            System.out.print("0000");
        else if (x < 100)
            System.out.print("000");
        else if (x < 1000)
            System.out.print("00");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x;
        n = input.nextInt();
        x = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        int length = Math.abs(arr[0] - x);
        for (int i = 1; i < n; i++) {
            int abs = Math.abs(arr[i] - x);
            if (length >= abs)
                length = abs;
        }

        for (int i = 0; i < n; i++) {
            if (length == Math.abs(arr[i]- x)){
                printNol(arr[i]);
                System.out.println(arr[i]);
            }
        }
    }
}

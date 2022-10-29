package mtkdiskrit;

import java.util.Scanner;

public class PrimaKeK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        int[] prime = new int[max];
        prime[0] = 2;
        count++;
        for (int i = 3; count < max; i+=2) {
            if (i == 3 || i == 5 || i == 7 || i == 11){
                prime[count] = i;
                count++;
                continue;
            }

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0){
                continue;
            }
            else {
                int temp = 13;
                boolean test = true;
                while (temp * temp <= i){
                    if (i % temp == 0){
                        test = false;
                        temp++;
                    }
                }
                if (test){
                    prime[count] = i;
                    count++;
                }
                temp++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(prime[arr[i] - 1]);
        }
    }
}

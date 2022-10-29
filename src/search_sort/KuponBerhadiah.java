package search_sort;

import java.util.Scanner;

public class KuponBerhadiah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, x, result = 0, min = 0, temp;

        n = input.nextInt();
        x = input.nextInt();

        for (int i = 0; i < n; i++) {
            k = input.nextInt();
            temp = Math.abs(k - x);

            if (i == 0){
                min = temp;
                result = k;
            }

            else if (min > temp){
                min = temp;
                result = k;
            }

            else if (min == temp){
                if (result > k)
                    result = k;
            }
        }

        System.out.print(result);
    }
}

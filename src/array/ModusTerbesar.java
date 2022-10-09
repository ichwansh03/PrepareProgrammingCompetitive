package array;

import java.util.Scanner;

public class ModusTerbesar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int k;
        int[] arr = new int[1000];
        int max = -1;
        int bil = -1;

        for (int i = 0; i < N; i++) {
            k = input.nextInt();
            arr[k]++;
            if (arr[k] > max){
                max = arr[k];
                bil = k;
            } else if (arr[k] == max){
                if (k > bil)
                    bil = k;
            }
        }

        System.out.println(bil);
    }
}

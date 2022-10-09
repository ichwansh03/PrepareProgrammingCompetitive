package mtkdiskrit;

import java.util.Arrays;

public class PigeonholePrinciple {

    static void pigeonholeSort(int arr[], int n){
        int min = arr[0];
        int max = arr[0];
        int range, index;

        for (int k = 0; k < n; k++) {
            if (arr[k] > max)
                max = arr[k];
            if (arr[k] < min)
                min = arr[k];
        }

        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole,0);

        for (int a = 0; a < n; a++) {
            phole[arr[a] - min]++;
        }

        index = 0;
        for (int b = 0; b < range; b++) {
            while (phole[b]-- > 0)
                arr[index++] = b + min;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,10,1,4,5,7,9};

        pigeonholeSort(arr,arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

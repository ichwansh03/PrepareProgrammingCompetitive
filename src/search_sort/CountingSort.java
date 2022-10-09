package search_sort;

import java.util.Arrays;

public class CountingSort {

    //search max element from array
    static int getMax(int[] h, int n){
        int max = h[0];
        for (int i = 1; i < n; i++) {
            if (h[i] > max)
                max = h[i];
        }

        return max;
    }

    static void countingSort(int[] h, int n){
        int[] output = new int[n+1];
        int max = getMax(h,n);
        //count array with size + 1
        int[] count = new int[max+1];

        for (int i = 0; i <= max; i++) {
            count[i] = 0; //initialize count array with all zeros
        }

        for (int i = 0; i < n; i++) {
            count[h[i]]++; //store count of each element
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i-1]; //find cumulative frequency
        }

        //find index of each element of the original arr in count array
        //and then place the elements in output array
        for (int i = n-1; i >= 0; i--) {
            output[count[h[i]] - 1] = h[i];
            count[h[i]]--;
        }

        for (int i = 0; i < n; i++) {
            h[i] = output[i]; //store the sorted elements into original arr
        }

        //result of sorted
        for (int i = 0; i < n; i++) {
            System.out.println(h[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2,5,8,7,9};
        int size = arr.length;
        countingSort(arr,size);
    }
}

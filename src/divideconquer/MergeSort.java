package divideconquer;

import java.util.Arrays;

public class MergeSort {

    /*merges 2 subarrays of arr
    * first subarray is arr[left..mid]
    * second is arr[mid+1..right]*/
    static void merge(int[] arr, int left, int mid, int right){

        //find sizes of 2 subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //create temporary arrays
        int l[] = new int[n1];
        int r[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            l[i] = arr[left+i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid+1+j];
        }

        //initialize indexes of first and second subarrays
        int i = 0, j = 0;

        //initialize index of merged subarray array
        int k = left;
        while (i < n1 && j < n2){
            if (l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of l[] if any
        while (i < n1){
            arr[k] = l[i];
            i++;
            k++;
        }

        //copy remaining elements of r[] if any
        while (j < n2){
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    //sorts arr[left...right] using merge()
    static void sort(int[] arr, int left, int right){
        if (left < right){

            //find the middle point
            int mid = left + (right - left) / 2;

            //sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid+1, right);

            //merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,7,5,9,10,15};
        sort(arr,0, arr.length-1);
        printArray(arr);
    }
}

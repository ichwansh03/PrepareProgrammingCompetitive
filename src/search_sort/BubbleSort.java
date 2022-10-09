package search_sort;

import java.util.Arrays;

public class BubbleSort {

    //time complexity O(N log N)
    public static void main(String[] args) {
        int[] arr = {12,3,9,1,4,7,8};

        Arrays.sort(arr);

        for (int num:
             arr) {
            System.out.println(num);
        }
    }
}

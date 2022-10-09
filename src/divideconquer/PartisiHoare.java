package divideconquer;

public class PartisiHoare {

    static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int pleft = left - 1;
        int pright = right + 1;

        while (true){
            //find left most element greater than or equal to pivot
            do {
                pleft++;
            } while (arr[pleft] < pivot);

            //find right most element smaller than or equal to pivot
            do {
                pright--;
            } while (arr[pright] > pivot);

            //if two pointers meet
            if (pleft >= pright){
                return pright;
            }
            int temp = arr[pleft];
            arr[pleft] = arr[pright];
            arr[pright] = temp;
        }
    }

    static void quickSort(int[] arr, int left, int right){
        if (left < right){
            //pi is partitioning index, arr[p] is now at right place
            int pi = partition(arr, left, right);

            //separately sort elements before partition and after partition
            quickSort(arr, left, pi);
            quickSort(arr, pi+1, right);
        }
    }

    static void printArray(int[] arr, int n){

        n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,4,1,6,7,8,9};
        quickSort(arr, 0, arr.length-1);
        printArray(arr, arr.length);
    }
}

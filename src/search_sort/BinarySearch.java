package search_sort;

public class BinarySearch {

    static void binarySearch(int[] h, int x, int n){
        int hasil = 0;
        int kiri = 1;
        int kanan = n;

        while ((kiri <= kanan) && (hasil == 0)){
            int tengah = (kiri + kanan)/2;

            if (x < h[tengah])
                kanan = tengah -1;
            else if (x > h[tengah])
                kiri  = tengah + 1;
            else
                hasil = tengah;
        }

        if (hasil == 0){
            System.out.println("beri hadiah lain");
        } else
            System.out.println(hasil);
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length-1;
        binarySearch(arr, 5, n);
    }
}

package search_sort;

public class SequentialSearch {

    static void search(int[] h, int x, int n){
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            if (h[i] == x){
                hasil = i;
                break;
            }
        }

        if (hasil == 0){
            System.out.println("beri hadiah lain");
        } else {
            System.out.println(hasil+1);
        }
    }

    public static void main(String[] args) {
        search(new int[]{5, 2, 3}, 1, 3);
    }
}

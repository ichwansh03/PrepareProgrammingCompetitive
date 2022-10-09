package bruteforce;

public class MengaturPersamaan {

    static int countTriplets(int n){
        int count = 0;
        int[] a = new int[10000];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int p = a[i];
                    int q = a[j];
                    int r = a[k];
                    if ((p+q+r) == 0){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriplets(8));
    }
}

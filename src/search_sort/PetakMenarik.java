package search_sort;

import java.util.Scanner;

public class PetakMenarik {

    static int n,m,k;
    static int[][] arr = new int[100][100];

    static boolean isIndexValid(int x, int y){
        return (x > 0 && y > 0 && x <= n && y <= m);
    }

    static int npetak(int x, int y){
        if (isIndexValid(x, y))
            return arr[x][y];
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();
        k = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = input.nextInt();

                //System.out.println(arr[i][j]);
            }
        }

        boolean fn = false;
        for (int a = 1; a <= m; a++) {
            for (int b = 1; b <= n; b++) {
                int nk = 1;
                nk *= npetak(b - 1, a) * npetak(b, a - 1) * npetak(b + 1, a) * npetak(b, a + 1);
                if (nk == k){
                    fn = true;
                    System.out.print(b + " " + a);
                    break;
                }
            }
            if (fn)
                break;
        }
        if (!fn)
            System.out.print("0 0");
    }
}

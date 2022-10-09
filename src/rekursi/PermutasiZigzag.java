package rekursi;

import java.util.Scanner;

public class PermutasiZigzag {

    static boolean[] pernah = new boolean[1000];
    static Scanner input = new Scanner(System.in);
    static int n = input.nextInt();

    static void tulis(int kedalaman){
        int[] catat = new int[10000];
        if (kedalaman >= n){
            boolean zigzag = true;

            for (int i = 1; i <= n-1; i++) {
                boolean con1 = catat[i] > catat[i-1] && catat[i] > catat[i+1];
                boolean con2 = catat[i] < catat[i-1] && catat[i] < catat[i+1];

                if (!(con1 || con2)){
                    zigzag = false;
                }
            }

            if (zigzag){
                for (int i = 1; i <= n; i++) {
                    System.out.print(catat[i]);
                }
                System.out.println();
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (!(pernah[i])){
                    pernah[i] = true;
                    catat[kedalaman] = i;
                    tulis(kedalaman+1);
                    pernah[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        tulis(1);
    }
}

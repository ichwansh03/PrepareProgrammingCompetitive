package warmingup;

import java.util.Scanner;

public class JalanVirtual {

//    static void jalan(int x){
//        int a = 0,b = 0,k = 0;
//
//        while (x > 0){
//            k++;
//            for (int i = 0; i < k; i++) {
//                if (x <= 0)
//                    break;
//                if (k % 4 == 0){
//                    b--;
//                    x--;
//                }
//                else if (k % 4 == 1){
//                    a++;
//                    x--;
//                }
//                else if (k % 4 == 2){
//                    b++;
//                    x--;
//                }
//                else {
//                    a--;
//                    x--;
//                }
//            }
//        }
//
//        System.out.print(a + " " + b);
//    }

    static void jalan(int x){
        int l1 = 1000, l2 = 1000;
        int[][] arr = new int[l1][l2];

        if (x < 0){

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            m = input.nextInt();
            jalan(m);
        }
    }
}

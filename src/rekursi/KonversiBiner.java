package rekursi;

import java.util.Scanner;

public class KonversiBiner {

    static String biner (int n){
        if (n == 1){
            return "1";
        } else if (n % 2 == 1){
            return biner(n/2) + "1";
        } else {
            return biner(n/2) + "0";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(biner(n));
    }
}

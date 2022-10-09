package rekursi;

import java.util.Scanner;

public class KompFungsi {

    static int a, b;
    static int fungsi(int x, int k){

        if (k == 0)
            return Math.abs(a*x+b);
        else
            return Math.abs(a * fungsi(x, k-1) + b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int k = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();

        System.out.println(fungsi(x,k));
    }
}

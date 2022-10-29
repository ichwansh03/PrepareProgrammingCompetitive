package mtkdiskrit;

import java.util.Scanner;

public class PasarRakyat {

    static int fpb(int x, int y){
        if (x % y == 0)
            return y;
        else
            return fpb(y, x % y);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, gcd, x = 0, y = 0, kpk = 0;

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0){
                x = input.nextInt();
                continue;
            } else {
                y = input.nextInt();
            }

            if (i == 1){
                if (x > y)
                    gcd = fpb(x, y);
                else
                    gcd = fpb(y, x);

                kpk = x * y / gcd;
            }
            else {
                if (kpk > y)
                    gcd = fpb(kpk, y);
                else
                    gcd = fpb(y, kpk);

                kpk = kpk * y / gcd;
            }
        }

        System.out.println(kpk);
    }
}

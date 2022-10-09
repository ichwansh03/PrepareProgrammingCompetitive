package mtkdiskrit;

import java.util.Scanner;

public class PenjumlahanPecahan {

    static int fpb(int x, int y){
        if (y == 0)
            return x;
        else
            return fpb(y, x % y);
    }

    public static void main(String[] args) {
        int a, b, c, d, e, f;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        e = (a * d) + (c * b);
        f = b * d;

        int i = 2;

        while (fpb(e, f) != 1){
            if (e % i == 0 && f % i == 0){
                e/=i;
                f/=i;
            } else
                i++;
        }

        System.out.print(e + " " + f);
    }
}

package subprogram;

import java.util.Scanner;

public class TemanDekat {

    static int pow(int a, int b){
        if (b == 1)
            return a;
        else
            return a * pow(a, b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,d, t;
        int max = -100000;
        int min = 100000000;

        n = input.nextInt();
        d = input.nextInt();

        int[] x = new int[1005];
        int[] y = new int[1005];

        for (int i = 1; i <= n; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                t = pow(Math.abs(x[j] - x[i]),d) + pow(Math.abs(y[j]- y[i]),d);

                if (t > max)
                    max = t;
                if (t < min)
                    min = t;
            }
        }

        System.out.println(min + " "+ max);
    }
}

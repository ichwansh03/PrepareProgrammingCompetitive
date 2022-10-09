package subprogram;

import java.util.Scanner;

public class FaktorisasiPrima {

    static void faktorPrima(int n){
        for (int i = 2; i <= n; i++) {
            int pow = 0;
            if (n % i == 0){
                while (n % i == 0){
                    pow++;
                    n/=i;
                }
                if (pow == 1)
                    System.out.print(i);
                else
                    System.out.print(i + "^" + pow);
                if (i < n)
                    System.out.print(" x ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        faktorPrima(N);

    }
}

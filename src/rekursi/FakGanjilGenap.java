package rekursi;

import java.util.Scanner;

public class FakGanjilGenap {

    static int faktorial (int x){
        if (x == 1)
            return 1;
        else if (x % 2 == 0)
            return (x/2) * faktorial(x-1);
        else
            return x * faktorial(x-1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(faktorial(N));
    }
}

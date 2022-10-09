package subprogram;

import java.util.Scanner;

public class Reverse {

    static int reverse(int x){
        int temp = x;
        int ret = 0;

        while (temp > 0){
            ret = (ret * 10) + (temp % 10);
            temp /= 10;
        }

        return ret;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;

        a = input.nextInt();
        b = input.nextInt();

        int hasil = reverse(a) + reverse(b);

        System.out.println(reverse(hasil));

    }
}

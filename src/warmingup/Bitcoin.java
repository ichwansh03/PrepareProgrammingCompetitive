package warmingup;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, x;
        n = input.nextInt();
        int hasil = 0, patokan = 0;

        for (int i = 0; i < n; i++) {
            x = input.nextInt(); //14
            if (i != 0) {
                if (patokan < x) {
                    hasil += (x - patokan); //4
                }
            }
            patokan = x; //16
        }

        System.out.println(hasil);
    }
}

package rekursi;

import java.util.Scanner;

public class GambarGunung {

    static void draw(int n){
        if (n > 0){
            draw(n-1);
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
            draw(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        draw(n);
    }
}

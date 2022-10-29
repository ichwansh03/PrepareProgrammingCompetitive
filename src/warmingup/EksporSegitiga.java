package warmingup;

import java.util.Scanner;

//https://tlx.toki.id/contests/troc-27/problems/A
public class EksporSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean check = false;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();

            if (a % 2 == 0){
                check = true;
                break;
            }

        }
        if (check)
            System.out.println("YA");
        else
            System.out.println("TIDAK");
    }
}

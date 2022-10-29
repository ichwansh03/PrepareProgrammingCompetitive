package warmingup;

import java.util.Scanner;

public class LipatKertas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, p = 0, q = 0, m = 0;
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            p = input.nextInt();
            q = input.nextInt();
            m = input.nextInt();

            if (p > q){
                System.out.print(p/m + " " + p/(m+1)+"\n");
            }
            else if (p < q){
                System.out.print(q/m + " " + p/m+"\n");
            }
            else {
                System.out.println("0 0");
            }
        }
    }
}

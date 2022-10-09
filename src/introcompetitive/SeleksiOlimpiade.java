package introcompetitive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeleksiOlimpiade {

    /*T = banyaknya seleksi yg dilakukan
    * N = banyaknya peserta
    * M = banyaknya peserta yg diloloskan
    * baris ke-3 = apakah peserta itu lolos atau tidak*/

    public static void main(String[] args) throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        int T, N, M;
        String nama, id;
        int[][] nilai = new int[100][100];

        T = input.nextInt();

        for (int i = T; i > 0; i--) {
                N = input.nextInt();
                M = input.nextInt();
                id = input.nextLine();
                int cekID = 0;

            for (int j = 1; j <= N; j++) {
                nama = input.next();

                for (int k = 1; k <= 3; k++) {
                    nilai[j][k] = input.nextInt();
                }

                if (nama.equals(id))
                    cekID = j;
            }

            int count = 0;
            for (int j = 1; j <= N; j++) {
                boolean con1 = nilai[cekID][3] == nilai[j][3] && nilai[cekID][2] < nilai[j][2];
                boolean con2 = nilai[cekID][3] == nilai[j][3] && nilai[cekID][2] == nilai[j][2] && nilai[cekID][1] < nilai[i][1];
                if (nilai[cekID][3] < nilai[j][3] || con1 || con2){
                    count++;
                }
            }

            if (count < M)
                System.out.println("YA");
            else
                System.out.println("TIDAK");
        }
    }
}

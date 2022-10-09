package rekursi;

import java.util.Scanner;

public class QuadtreePengkodean {

    static String[] jawaban = new String[128*128];
    static int[][] m = new int[128][128];
    static int nAns;

    //cek homogen submatrix [r, c, r+k-1, c+k-1]
    static boolean homogen(int r, int c, int k){
        int val = m[r][c];
        for (int i = r; i < r+k; i++) {
            for (int j = c; j < c+k; j++) {
                if (m[i][j] != val){
                    return false;
                }
            }
        }
        return true;
    }

    //pengkodean submatrix [r, c, r+k-1, c+k-1]
    static void quadtree(int r, int c, int k, String s){
        if (homogen(r,c,k)){
            if (m[r][c] == 1){
                jawaban[nAns] = "1" + s;
                nAns++;
            }
        } else {
            //Pembelahan
            quadtree(r, c, k/2, s+"0");
            quadtree(r, c+(k/2), k/2, s+"1");
            quadtree(r+(k/2),c,k/2,s+"2");
            quadtree(r+(k/2),c+(k/2),k/2,s+"3");
        }
    }

    public static void main(String[] args) {
        int r,c;
        Scanner input = new Scanner(System.in);

        r = input.nextInt();
        c = input.nextInt();

        //cari 2^p yang >= max(r,c)
        int max_rc = Math.max(r,c);
        int pow2 = 1;
        while (pow2 < max_rc){
            pow2 *= 2;
        }

        //initialize
        for (int i = 0; i < pow2; i++) {
            for (int j = 0; j < pow2; j++) {
                m[i][j] = 0;
            }
        }

        //input read
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = input.nextInt();
            }
        }

        //pengkodean
        nAns = 0;
        quadtree(0,0,pow2,"");

        //print
        System.out.println(nAns);
        for (int i = 0; i < nAns; i++) {
            System.out.println(jawaban[i]);
        }
    }
}

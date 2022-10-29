package datastructurenonlinear;

import java.util.Scanner;

public class DisjointSet {

    static int[] par = new int[10000];

    static void initalize(){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    static int findRepresentative(int x){
        if (par[x] == x)
            return x;
        else{
            //pencarian perwakilan kelompok dari suatu elemen x yg
            //efisien dgn path compression(mengubah nilai parent dari setiap
            // element yg dilalui langsung ke element perwakilan kelompok)
            par[x] = findRepresentative(par[x]);
            return par[x];
        }
    }

    static void join(int a, int b){
        int repA = findRepresentative(a);
        int repB = findRepresentative(b);
        par[repA] = repB;
    }

    static boolean check(int a, int b){
        return findRepresentative(a) == findRepresentative(b);
    }

    public static void main(String[] args) {
        initalize();

        System.out.println(findRepresentative(5));
        join(1,5);
        System.out.println(check(1,3));
    }
}

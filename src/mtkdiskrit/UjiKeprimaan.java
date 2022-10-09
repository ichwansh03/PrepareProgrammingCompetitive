package mtkdiskrit;

/*solusi cepat untuk membangkitkan bil. prima menggunakan metode sieve of erathosthenes
* berawal dari 2 hingga n yg belum dieliminasi, jika belum artinya bil. tersebut adalah bil.prima
* lakukan iterasi untuk eliminasi kelipatannya (ex : 7 maka eliminasi 14,21,28...)*/

public class UjiKeprimaan {

    //kompleksitas O(N)
    static boolean isPrimeNaive(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    //kompleksitas O(sqrt(N))
    static boolean isPrimeSqrt(int n){
        if (n <= 1){
            return false;
        }
        int i = 2;
        while (i*i <= n){
            if (n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    static void sieveOfErathosthenes(int n){
        boolean[] eliminated = new boolean[n+1];
        for (int i = 0; i <= n; i++)
            eliminated[i] = true;

        for (int p = 2; p*p <= n; p++) {
            if (eliminated[p]){
                for (int i = p*p; i <= n; i+=p)
                    eliminated[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (eliminated[i])
                System.out.print(i + " ");
        }
    }

    //Algoritma euclid: mencari nilai FPB(a,b) dengan kompleksitas O(log(min(a,b)))

    static int euclid(int a, int b){
        if (b == 0)
            return a;
        else
            return euclid(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNaive(10));
        System.out.println(isPrimeSqrt(10));
        sieveOfErathosthenes(29);

        System.out.println(euclid(12,10));
    }
}

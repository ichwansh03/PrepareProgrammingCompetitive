package subprogram;

public class CekPrima {
    public static boolean prima(int n){
        if (n < 2)
            return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean prime = prima(3);
        System.out.println(prime);
    }
}

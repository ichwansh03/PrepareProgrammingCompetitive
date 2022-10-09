package mtkdiskrit;

public class ModFunction {
    static int modular(int n, int k){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % k;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(modular(10,7));
    }
}
